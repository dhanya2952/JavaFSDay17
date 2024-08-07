package com.graymatter.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component

public class DbUtils implements DbInterface{
	
	Connection con;
	@Override
	public List<Regions> getAll() throws SQLException {
		// TODO Auto-generated method stub
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from Regions");
		List<Regions> rlist = new ArrayList<Regions>();
		while(rs.next())
			rlist.add(new Regions(rs.getInt(1),rs.getString(2)));
		
		return rlist;
	}
	
	@Override
	public Regions addRegion(Regions region) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pt= con.prepareStatement("insert into regions values(?,?)");
		pt.setInt(1, region.getRegion_id());
		pt.setString(2, region.getRegion_name());
		pt.executeUpdate();
		
		Regions savedRegion=getRegionById(region.getRegion_id());
		return savedRegion;
	}

	@Override
	public Regions getRegionById(int rid) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pt=null;
		pt=con.prepareStatement("Select * from regions where region_id=?");
		pt.setInt(1,rid);
		ResultSet rs= pt.executeQuery();
		Regions region=null;
		while(rs.next())
			region=new Regions(rs.getInt(1),rs.getString(2));
		return region;
	}

//	@Override
//	public Regions updateRegions(Regions region) throws SQLException {
//		// TODO Auto-generated method stub
//		PreparedStatement pt=con.prepareStatement("Update Regions set region_id=?,region_name=?");
//		pt.setInt(1, region.getRegion_id());
//		pt.setString(2, region.getRegion_name());
//		ResultSet rs= pt.executeQuery();
//		while(rs.next())
//			region=new Regions(rs.getInt(1),rs.getString(2));
//		return region;
//	}
	@Override
	public Regions updateRegions(Regions region) throws SQLException {
		PreparedStatement ps=con.prepareStatement("update regions SET region_name=? where region_id=?");
		  ps.setInt(2,region.getRegion_id());
		  ps.setString(1,region.getRegion_name());
		  ps.executeUpdate();
		  Regions savedRegion=getRegionById(region.getRegion_id());
		  return savedRegion;
	}

	@Override
	public void deleteregion(int rid) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst = con.prepareStatement("delete from Regions where region_id=?");
		pst.setInt(1, rid);
		pst.executeUpdate();
		System.out.println("region deleted: "+rid);
		
		
	}
	
	

}
