package com.techthinker.CAAndroid.widget;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;

import com.techthinker.CAAndroid.R;
import com.techthinker.CAAndroid.widget.Adapter.Set_Wheel_DayArrayAdapter;
import com.techthinker.CAAndroid.widget.Adapter.Set_Wheel_ViewAdapter;

public class Set_CustomDatePickerDialog extends AlertDialog implements OnClickListener{

	private static final String ADAPTER = "adapter";
	private static final String CURRENT_ITEM = "current_item";
	
	private Calendar calendar;
	//dialog id
	private int mNumber;

	private final Set_WheelView mWheelView;
    

	//OnDataChangedListener
    Set_OnDataChangedListener mOnDataChangedListener;
    
	public Set_CustomDatePickerDialog(Context context, int number,Calendar calendar, Set_OnDataChangedListener callback) {
        this(context, 0, number ,calendar, callback);
    }

	
	public Set_CustomDatePickerDialog(Context context,
            int theme,
            int number,
            Calendar calendar,
            Set_OnDataChangedListener callback) {
        super(context, theme);
        this.mNumber = number;
        mOnDataChangedListener = callback;
        this.calendar = (Calendar) calendar.clone();

        Context themeContext = getContext();
        setButton(BUTTON_POSITIVE, themeContext.getText(R.string.set_custom_button_ok), this);
        setButton(BUTTON_NEGATIVE, themeContext.getText(R.string.set_custom_button_cancle), (OnClickListener) null);
        setIcon(0);
        setTitle(R.string.set_date_picker_dialog_title);

        LayoutInflater inflater =
                (LayoutInflater) themeContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.set_custom_time_layout, null);
        setView(view);
        mWheelView = (Set_WheelView) view.findViewById(R.id.set_custom_day);
       
        mWheelView.setViewAdapter(new Set_Wheel_DayArrayAdapter(view.getContext(), calendar));
        mWheelView.setCurrentItem(10);
    }

	public void onClick(DialogInterface dialog, int which) {
		int index = mWheelView.getCurrentItem();
		
		Calendar newCalendar = (Calendar) calendar.clone();
		int day = -10 + index;
		newCalendar.roll(Calendar.DAY_OF_YEAR, day);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		
		if(mOnDataChangedListener != null)
			mOnDataChangedListener.onDataChanged(mNumber, format.format(newCalendar.getTime()));
	}
	
	public Set_WheelView getWheelView() {
        return mWheelView;
    }
	
	/**
     * Sets the current date.
     */
    public void updateDate(int index) {
    	mWheelView.setCurrentItem(index);
    }

    @Override
    public Bundle onSaveInstanceState() {
        Bundle state = super.onSaveInstanceState();
        ArrayList<Set_Wheel_ViewAdapter> list = new ArrayList<Set_Wheel_ViewAdapter>();
        list.add(mWheelView.getViewAdapter());
        state.putParcelable(ADAPTER, (Parcelable) list);
        state.putInt(CURRENT_ITEM, mWheelView.getCurrentItem());
        return state;
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mWheelView.setViewAdapter((Set_Wheel_ViewAdapter)savedInstanceState.getParcelable(ADAPTER));
        mWheelView.setCurrentItem(savedInstanceState.getInt(CURRENT_ITEM));
    }
	
}
