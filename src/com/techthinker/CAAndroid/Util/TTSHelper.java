package com.techthinker.CAAndroid.Util;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;

import com.techthinker.CAAndroid.Define.Constant;

public class TTSHelper extends Activity implements OnInitListener {

	private TextToSpeech mTts;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// check language support
		Intent checkIntent = new Intent();
		checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
		startActivityForResult(checkIntent, Constant.MY_DATA_CHECK_CODE);

	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == Constant.MY_DATA_CHECK_CODE) {
			if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
				// success, create the TTS instance
				mTts = new TextToSpeech(this, this);
			} else {
				// missing data, install it
				Intent installIntent = new Intent();
				installIntent
						.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
				startActivity(installIntent);
			}
		}
	}

	public void onInit(int status) {
		mTts.setLanguage(Locale.UK);
	}

	@Override
	protected void onDestroy() {
		mTts.shutdown();
		super.onDestroy();
	}
	
	public void speckWord(String words){
		mTts.speak(words, TextToSpeech.QUEUE_FLUSH, null);
	}

}
