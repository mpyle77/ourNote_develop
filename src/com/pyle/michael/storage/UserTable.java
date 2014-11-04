package com.pyle.michael.storage;

import com.pyle.michael.contracts.DatabaseContract;

public class UserTable {

	public static String onCreate() {
		
		return "create table "
				+ DatabaseContract.USER_TABLE  
				+ "(" 
				+ DatabaseContract.UserTable.COL_USER_ID + " INTEGER PRIMARY KEY,"
				+ DatabaseContract.UserTable.COL_FNAME + " TEXT,"
				+ DatabaseContract.UserTable.COL_LNAME + " TEXT"
				+ ");";
	}
}
