package com.pyle.michael.storage;

import com.pyle.michael.contracts.DatabaseContract;

public class GeoFenceTable {
	public static final String TAG = "GeoFenceTable";
	
	public static String onCreate()	{
		
		return "CREATE TABLE "
				+ DatabaseContract.GEOFENCE_TABLE  
				+ "(" 
				+ DatabaseContract.GeoFenceTable.COL_GEOFENCE_ID + " INTEGER PRIMARY KEY,"
				+ DatabaseContract.GeoFenceTable.COL_LAT + " INTEGER NOT NULL,"
				+ DatabaseContract.GeoFenceTable.COL_LONG + " INTEGER NOT NULL,"
				+ DatabaseContract.GeoFenceTable.COL_RADIUS + " INTEGER NOT NULL"
				+ ");";
	}
	
	public static String TestDataInsert() {
		return "INSERT INTO " + DatabaseContract.GEOFENCE_TABLE + " VALUES (1, 180, 360, 10);";
	}
}
