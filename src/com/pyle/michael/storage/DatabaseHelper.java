package com.pyle.michael.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
	public static final String TAG = "DatabaseHelper";
	
	private static final String DATABASE_NAME = "ournote.db";
	private static final int DATABASE_VERSION = 1;
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		Log.d(TAG, "onCreate");
		db.execSQL(GeoFenceTable.onCreate());
		db.execSQL(GeoFenceTable.TestDataInsert());
//		db.execSQL(NoteTable.onCreate());
//		db.execSQL(UserTable.onCreate());
//		db.execSQL(UserTable.onCreate());
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
