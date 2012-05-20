package com.techthinker.CAAndroid.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.techthinker.CAAndroid.R;
import com.techthinker.CAAndroid.widget.Adapter.Set_Wheel_NumericAdapter;

public class Set_CustomNumericPickerDialog extends AlertDialog implements
		OnClickListener {
	
	private static final String NUMBER = "number";

	private int mNumber;

	private final Set_WheelView mWheelView;
	
    //OnDataChangedListener
    Set_OnDataChangedListener mOnDataChangedListener;

	public Set_CustomNumericPickerDialog(Context context,int number, Set_OnDataChangedListener callback) {
		this(context, 0, number, callback);
	}

	public Set_CustomNumericPickerDialog(Context context, int theme, int number, Set_OnDataChangedListener callback) {
		super(context, theme);
		this.mNumber = number;
		mOnDataChangedListener = callback;

		Context themeContext = getContext();
		setButton(BUTTON_POSITIVE,
				themeContext.getText(R.string.set_custom_button_ok), this);
		setButton(BUTTON_NEGATIVE,
				themeContext.getText(R.string.set_custom_button_cancle),
				(OnClickListener) null);
		setIcon(0);
		setTitle(R.string.set_number_picker_dialog_title);

		LayoutInflater inflater = (LayoutInflater) themeContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.set_custom_number_layout, null);
		setView(view);
		mWheelView = (Set_WheelView) view
				.findViewById(R.id.set_custom_number);
		mWheelView.setViewAdapter(new Set_Wheel_NumericAdapter(view.getContext(), 1, 99, "%02d"));
		mWheelView.setCurrentItem(2);
	}

	public void onClick(DialogInterface dialog, int which) {
		
		int index = mWheelView.getCurrentItem();
		int currentValue = 1 + index;

		//Log.i("CustomNumericPickerDialog",Integer.toString(mNumber));
		
		if(mOnDataChangedListener != null)
			mOnDataChangedListener.onDataChanged(mNumber, currentValue);
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
		state.putInt(NUMBER, mNumber);
		return state;
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		mNumber = savedInstanceState.getParcelable(NUMBER);
	}

}
