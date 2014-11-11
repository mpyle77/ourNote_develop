package com.pyle.michael.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME = "ournote.db";
	private static final int DATABASE_VERSION = 1;
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(GeoFenceTable.onCreate());
//		db.execSQL(NoteTable.onCreate());
//		db.execSQL(UserTable.onCreate());
//		db.execSQL(UserTable.onCreate());
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
