package com.pyle.michael.contracts;

public final class DatabaseContract {
	public static final String AUTHORITY = "com.pyle.michael.ourNote";
	public static final String BASE_URI_STR = "content://" + AUTHORITY + "/";
	
	public static final String COL_ID = "_id";
	
	public static final String NOTE_TABLE = "note";
	public static final String USER_TABLE = "user";
	public static final String TASK_TABLE = "task";
	public static final String GEOFENCE_TABLE = "geoFence";
	
	
	/************ Table related classes ***************/
	public static final class UserTable {
		public static final String COL_USER_ID = COL_ID;
		public static final String COL_FNAME = "fName";
		public static final String COL_LNAME = "lName";
	}
	
	public static final class TaskTable {
		public static final String COL_NOTE_ID = "noteId";
		public static final String COL_GEOFENCE_ID = "geofenceId";
		public static final String COL_TITLE = "title";
		public static final String COL_BODY = "body";
		public static final String COL_COMPLETED = "completed";
	}
	
	public static final class NoteTable {
		public static final String COL_NOTE_ID = COL_ID;
		public static final String COL_CREATION_DATE = "creationDate";
		public static final String COL_EXPIRATION_DATE = "expirationDate";
		public static final String COL_FONT = "font";
		public static final String COL_ALERT_ENABLED = "alertEnabled";
		public static final String COL_SHARED = "shared";
		public static final String COL_SHARE_ACCEPTED = "shareAccepted";
		public static final String COL_USER_ID = "userId";
	}

	public static final class GeoFenceTable {
		public static final String COL_GEOFENCE_ID = COL_ID;
		public static final String COL_LAT = "lat";
		public static final String COL_LONG = "long";
		public static final String COL_RADIUS = "radius";
	}

}
