package com.graymatter;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.graymatter.beans.Customer;
import com.graymatter.beans.DbUtils;
import com.graymatter.beans.MyDataSource;
import com.graymatter.beans.Regions;
import com.graymatter.config.CustomerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
//        Customer customer = context.getBean(Customer.class);
//        System.out.println(customer);
        Connection con=null;
        MyDataSource dataSource = (MyDataSource) context.getBean(MyDataSource.class);
        try {
			con= dataSource.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("connection created");
        DbUtils dbUtils=(DbUtils) context.getBean("dbUtils");
        dbUtils.setCon(con);
        
        //getAll
        List<Regions> rlist= dbUtils.getAll();
        for(Regions r:rlist)
        	System.out.println(r.getRegion_id()+"  "+r.getRegion_name());
        
        //addRegion
        Regions reg=dbUtils.addRegion(new Regions(125,"France"));
        System.out.println(reg);
        
        //getRegionById
        Regions reg1=dbUtils.getRegionById(2);
        System.out.println(reg1);
        
        //updation
        Regions reg2=dbUtils.updateRegions(new Regions(125,"Germany"));
        System.out.println(reg2);
        
        //delet
        dbUtils.deleteregion(124);
        
      //getAll
        List<Regions> rlist1= dbUtils.getAll();
        for(Regions r:rlist1)
        	System.out.println(r.getRegion_id()+"  "+r.getRegion_name());
        
    }
}
