package com.techthinker.CAAndroid;

import android.app.Activity;
import android.os.Bundle;

import com.techthinker.CAAndroid.Database.DatabaseHelper;
import com.techthinker.CAAndroid.Define.Constant;

public class CampusAssistantActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// initiate the database
		DatabaseHelper dbHelper = new DatabaseHelper(this, Constant.DB_NAME);
		dbHelper.getWritableDatabase();
		dbHelper.close();

		// setContentView(R.layout.start);
//		Intent toRootView = new Intent();
//		toRootView.setClass(CampusAssistantActivity.this,
//				RootViewActivity.class);
//		startActivity(toRootView);
//		CampusAssistantActivity.this.finish();
	}
}