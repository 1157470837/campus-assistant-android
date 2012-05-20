package com.techthinker.CAAndroid.Define;

import java.io.File;

import android.os.Environment;

public class Constant {
	// debug
	public static final String TAG_NAME = "com.techthinker.CAAndroid.debug";

	// DatabaseHelper
	public static final int DB_VERSION = 1;
	public static final String DB_NAME = "campus_assistant_android";
	public static final String SQL_CREATE_GEOINFO = "CREATE TABLE IF NOT EXISTS  \"geoinfo\" (\"geoinfo_id\" INTEGER NOT NULL,\"longtitude1\" REAL NOT NULL,\"longtitude2\" REAL NOT NULL,\"longtitude3\" REAL NOT NULL,\"longtitude4\" REAL NOT NULL,\"latitude1\" REAL NOT NULL,\"latitude2\" REAL NOT NULL,\"latitude3\" REAL NOT NULL,\"latitude4\" REAL NOT NULL,\"availabe\" NUMERIC(3) NOT NULL,CONSTRAINT \"geoinfo_PK_college\" PRIMARY KEY(\"geoinfo_id\"));";
	public static final String SQL_CREATE_USERTYPE = "CREATE TABLE IF NOT EXISTS  \"usertype\" (\"usertype_id\" INTEGER NOT NULL,\"usertype_name\" INTEGER NOT NULL,CONSTRAINT \"usertype_PK_user\" PRIMARY KEY(\"usertype_id\"));";
	public static final String SQL_CREATE_COLLEGE = "CREATE TABLE IF NOT EXISTS  \"college\"([college_id] INTEGER NOT NULL,[college_name] VARCHAR(30) NOT NULL,[description] TEXT NOT NULL,[scenicspot_id] INTEGER NOT NULL REFERENCES [scenicspot] ([scenicspot_id]) On Delete CASCADE On Update CASCADE, Primary Key(college_id));";
	public static final String SQL_CREATE_MAJOR = "CREATE TABLE IF NOT EXISTS  \"major\"([major_id] INTEGER NOT NULL,[major_name] VARCHAR(30) NOT NULL,[description] TEXT NOT NULL,[image] BLOB,[college_id] INTEGER NOT NULL REFERENCES [college] ([college_id]) On Delete CASCADE On Update CASCADE, Primary Key(major_id));";
	public static final String SQL_CREATE_GRADE = "CREATE TABLE IF NOT EXISTS  \"grade\"([grade_id] INTEGER NOT NULL,[grade_name] VARCHAR(30) NOT NULL,[description] TEXT NOT NULL,[image] BLOB,[college_id] INTEGER NOT NULL REFERENCES [college] ([college_id]) On Delete CASCADE On Update CASCADE,[major_id] INTEGER NOT NULL REFERENCES [major] ([major_id]) On Delete CASCADE On Update CASCADE, Primary Key(grade_id));";
	public static final String SQL_CREATE_CHATROOM = "CREATE TABLE IF NOT EXISTS  \"chatroom\"([chatroom_id] INTEGER NOT NULL,[chatroom_name] VARCHAR(30) NOT NULL,[parentroom_id] INTEGER NOT NULL,[image] BLOB,[college_id] INTEGER NOT NULL REFERENCES [college] ([college_id]) On Delete CASCADE On Update CASCADE,[major_id] INTEGER NOT NULL REFERENCES [major] ([major_id]) On Delete CASCADE On Update CASCADE,[grade_id] INTEGER NOT NULL REFERENCES [grade] ([grade_id]) On Delete CASCADE On Update CASCADE,[level] INTEGER NOT NULL, Primary Key(chatroom_id));";
	public static final String SQL_CREATE_SCENICSPOT = "CREATE TABLE IF NOT EXISTS  \"scenicspot\"([scenicspot_id] INTEGER NOT NULL,[spotname] VARCHAR(45) NOT NULL,[description] TEXT NOT NULL,[rate_mean] REAL DEFAULT 0,[rate_num] INTEGER DEFAULT 0,[image] BLOB,[geoinfo_id] INTEGER REFERENCES [geoinfo] ([geoinfo_id]) On Delete CASCADE On Update CASCADE, Primary Key(scenicspot_id));";
	public static final String SQL_CREATE_USER = "CREATE TABLE IF NOT EXISTS  \"user\"([user_id] INTEGER NOT NULL,[username] VARCHAR(20) NOT NULL,[password] VARCHAR(20) NOT NULL,[sex] VARCHAR(4) NOT NULL,[email] VARCHAR(30) NOT NULL,[phone] VARCHAR(20),[college_id] INTEGER REFERENCES [college] ([college_id]) On Delete SET NULL On Update SET NULL,[major_id] INTEGER REFERENCES [major] ([major_id]) On Delete SET NULL On Update SET NULL,[usertype_id] INTEGER NOT NULL REFERENCES [usertype] ([usertype_id]) On Delete CASCADE On Update CASCADE,[entrance_year] INTEGER NOT NULL,[birthday] DATETIME,[description] TEXT,[image] BLOB,[geoinfo_id] INTEGER REFERENCES [geoinfo] ([geoinfo_id]) On Delete SET NULL On Update SET NULL, Primary Key(user_id));";
	public static final String SQL_CREATE_MESSAGE = "CREATE TABLE IF NOT EXISTS  \"message\"([message_id] INTEGER NOT NULL,[content] TEXT NOT NULL,[pubdate] DATETIME NOT NULL,[user_id] INTEGER NOT NULL REFERENCES [user] ([user_id]) On Delete CASCADE On Update CASCADE,[touser_id] INTEGER NOT NULL REFERENCES [user] ([user_id]) On Delete CASCADE On Update CASCADE,[tochatroom_id] INTEGER NOT NULL REFERENCES [chatroom] ([chatroom_id]) On Delete CASCADE On Update CASCADE,[totype] INTEGER NOT NULL, Primary Key(message_id));";
	public static final String SQL_DELETE_RELATION = "CREATE TABLE IF NOT EXISTS  \"relation\"([relation_id] INTEGER NOT NULL,[user_id1] INTEGER NOT NULL REFERENCES [user] ([user_id]) On Delete CASCADE On Update CASCADE,[user_id2] INTEGER NOT NULL REFERENCES [user] ([user_id]) On Delete CASCADE On Update CASCADE, Primary Key(relation_id));";

	//table names
	public static final String TABLE_GEOINFO = "geoinfo";
	public static final String TABLE_USERTYPE = "usertype";
	public static final String TABLE_COLLEGE = "college";
	public static final String TABLE_MAJOR = "major";
	public static final String TABLE_GRADE = "grade";
	public static final String TABLE_CHATROOM = "chatroom";
	public static final String TABLE_SCENICSPOT = "scenicspot";
	public static final String TABLE_USER = "user";
	public static final String TABLE_MESSAGE = "message";
	public static final String TABLE_RELATION = "relation";

	// GalleryFlow
	public static final int MAX_ROTATIONANGLE = 60;
	public static final int MAX_ZOOM = -100;
	public static final int GALLERY_CHILD_WITH = 180;
	public static final int GALLERY_CHILD_HIGHT = 240;
	public static final int REFLECTION_GAP = 1;
	public static final int CHILD_SPACE = -15;

	// TTSHelper
	public static final int MY_DATA_CHECK_CODE = 888;

	// XMLParser
	public static final String DEFAULT_SD_PATH = Environment
			.getExternalStorageDirectory().getAbsolutePath()
			+ File.separator
			+ "dream-builder" + File.separator;

	// HttpHelper
	public static final String SERVER_URL = "http://192.168.1.183:8080/dream-builder/";
	public static final String SERVER_DIC_FOLDER = "dictionaries/";
	public static final String SERVER_DIC_IMAGE_FOLDER = "dic_images/";
	public static final String SERVER_RESOURCE_NAME = "resources.xml";

	// ListAdapter
	public static final int LIST_ITEM_PER_PAGE = 12;

	// Default Task
	public static final int DEFAULT_TASK_LISTS_PER_DAY = 3;
	public static final int DEFAULT_TASK_WORDS_PER_GROUP = 10;
	public static final int DEFAULT_TASK_GROUPS_PER_ROUND = 6;

}