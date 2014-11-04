package com.pyle.michael.storage;

import com.pyle.michael.contracts.DatabaseContract;

//Associative Entity.  This table eliminates the many-to-many that would exist between Users and Notes
public class TaskTable {
	
	public static String onCreate() {
		
		return "create table "
				+ DatabaseContract.TASK_TABLE  
				+ "(" 
				+ DatabaseContract.TaskTable.COL_NOTE_ID + " INTEGER NOT NULL,"
				+ DatabaseContract.TaskTable.COL_GEOFENCE_ID + " INTEGER NOT NULL,"
				+ DatabaseContract.TaskTable.COL_TITLE + " TEXT,"
				+ DatabaseContract.TaskTable.COL_BODY + " TEXT,"
				+ DatabaseContract.TaskTable.COL_COMPLETED + " INTEGER,"
				+ "FOREIGN KEY" + "(" + DatabaseContract.TaskTable.COL_NOTE_ID + ")" + "REFERENCES"  + DatabaseContract.NOTE_TABLE 
					+ "(" + DatabaseContract.NoteTable.COL_NOTE_ID + "),"
				+ "FOREIGN KEY" + "(" + DatabaseContract.TaskTable.COL_GEOFENCE_ID + ")" + "REFERENCES" +  DatabaseContract.GEOFENCE_TABLE 
					+ "(" + DatabaseContract.GeoFenceTable.COL_GEOFENCE_ID + "),"
					
				//Composite Primary Key
				+ "PRIMARY KEY" + "(" + DatabaseContract.TaskTable.COL_NOTE_ID + ", " + DatabaseContract.TaskTable.COL_GEOFENCE_ID + ")"
				+ ");";
	}
}
