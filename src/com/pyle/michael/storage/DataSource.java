package com.pyle.michael.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DataSource {
	public static final String TAG = "DataSource";
	
	SQLiteDatabase db;
	DatabaseHelper dbHelper;
	
	public DataSource (Context ctx) {
		dbHelper = new DatabaseHelper(ctx);
	}
	
	public void openDb() throws SQLiteException  {
		db= dbHelper.getWritableDatabase();
	}
	
	public void closeDb() {
		db.close();
	}

}
