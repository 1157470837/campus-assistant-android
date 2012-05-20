package com.techthinker.CAAndroid.widget.Adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.techthinker.CAAndroid.R;

public class Set_Wheel_DayArrayAdapter extends Set_Wheel_AbstractTextAdapter {

	// Count of days to be shown
	private final int daysCount = 20;

	// Calendar
	Calendar calendar;

	/**
	 * Constructor
	 */
	public Set_Wheel_DayArrayAdapter(Context context, Calendar calendar) {
		super(context, R.layout.set_custom_time_day, NO_RESOURCE);
		this.calendar = calendar;

		setItemTextResource(R.id.time2_monthday);
	}

	@Override
	public View getItem(int index, View cachedView, ViewGroup parent) {
		int day = -daysCount / 2 + index;
		Calendar newCalendar = (Calendar) calendar.clone();
		newCalendar.roll(Calendar.DAY_OF_YEAR, day);

		View view = super.getItem(index, cachedView, parent);
		TextView weekday = (TextView) view.findViewById(R.id.time2_weekday);
		if (day == 0) {
			weekday.setText("");
		} else {
			DateFormat format = new SimpleDateFormat("EEE");
			weekday.setText(format.format(newCalendar.getTime()));
		}

		TextView monthday = (TextView) view.findViewById(R.id.time2_monthday);
		if (day == 0) {
			monthday.setText("Today");
			monthday.setTextColor(0xFF0000F0);
		} else {
			DateFormat format = new SimpleDateFormat("MMM d");
			monthday.setText(format.format(newCalendar.getTime()));
			monthday.setTextColor(0xFF111111);
		}

		return view;
	}

	public int getItemsCount() {
		return daysCount + 1;
	}

	@Override
	protected CharSequence getItemText(int index) {
		return "";
	}

}
