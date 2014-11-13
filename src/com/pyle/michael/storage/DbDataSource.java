package com.pyle.michael.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DbDataSource {
	public static final String TAG = "DbDataSource";
	
	SQLiteDatabase db;
	DatabaseHelper dbHelper;
	
	public DbDataSource (Context ctx) {
		dbHelper = new DatabaseHelper(ctx);
	}
	
	public void openDb() throws SQLiteException  {
		db= dbHelper.getWritableDatabase();
	}
	
	public void closeDb() {
		db.close();
	}
	
	//Methods to retrieve a Note
	
	//Methods to retrieve a User
	
	//Methods to retrieve a GeoFence

}
