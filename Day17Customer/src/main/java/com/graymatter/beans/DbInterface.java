package com.graymatter.beans;

import java.sql.SQLException;
import java.util.List;

public interface DbInterface {
	
	public List<Regions> getAll() throws SQLException;
	public Regions addRegion(Regions region) throws SQLException;
	public Regions getRegionById(int rid) throws SQLException ;
	public Regions updateRegions(Regions region) throws SQLException;
	public void deleteregion(int rid) throws SQLException;

}
