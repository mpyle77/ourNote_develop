package com.pyle.michael.storage;

import com.pyle.michael.contracts.DatabaseContract;

public class NoteTable {
	
	public static String onCreate() {
		
		return "create table "
				+ DatabaseContract.NOTE_TABLE  
				+ "(" 
				+ DatabaseContract.NoteTable.COL_NOTE_ID + " INTEGER PRIMARY KEY,"
				+ DatabaseContract.NoteTable.COL_CREATION_DATE + " DATE,"
				+ DatabaseContract.NoteTable.COL_EXPIRATION_DATE + " DATE,"
				+ DatabaseContract.NoteTable.COL_FONT + " TEXT,"
				+ DatabaseContract.NoteTable.COL_ALERT_ENABLED + " INTEGER,"
				+ DatabaseContract.NoteTable.COL_SHARED + " INTEGER,"
				+ DatabaseContract.NoteTable.COL_SHARE_ACCEPTED + " INTEGER, "
				+ DatabaseContract.NoteTable.COL_USER_ID + " INTEGER, "
				+ "FOREIGN KEY" + "(" + DatabaseContract.NoteTable.COL_USER_ID + ") " + "REFERENCES " 
				+ DatabaseContract.USER_TABLE + "(" + DatabaseContract.UserTable.COL_USER_ID + ")"
				+ ");";
	}
}
