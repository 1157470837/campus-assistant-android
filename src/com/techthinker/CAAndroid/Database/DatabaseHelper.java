package com.techthinker.CAAndroid.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import com.techthinker.CAAndroid.Define.Constant;

public class DatabaseHelper extends SQLiteOpenHelper {

	public DatabaseHelper(Context context, String name, CursorFactory factory,int version) {
		super(context, name, factory, version);
	}
	public DatabaseHelper(Context context,String name,int version){
		this(context, name,null,version);
	}
	public DatabaseHelper(Context context,String name){
		this(context,name,Constant.DB_VERSION);
	}

	//initiate database
	@Override
	public void onCreate(SQLiteDatabase db) {
		//create all tables
		db.execSQL(Constant.SQL_CREATE_GEOINFO);
		db.execSQL(Constant.SQL_CREATE_USERTYPE);
		db.execSQL(Constant.SQL_CREATE_COLLEGE);
		db.execSQL(Constant.SQL_CREATE_MAJOR);
		db.execSQL(Constant.SQL_CREATE_GRADE);
		db.execSQL(Constant.SQL_CREATE_CHATROOM);
		db.execSQL(Constant.SQL_CREATE_SCENICSPOT);
		db.execSQL(Constant.SQL_CREATE_USER);
		db.execSQL(Constant.SQL_CREATE_MESSAGE);
		db.execSQL(Constant.SQL_DELETE_RELATION);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
