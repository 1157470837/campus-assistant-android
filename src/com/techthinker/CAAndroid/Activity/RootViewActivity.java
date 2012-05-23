package com.techthinker.CAAndroid.Activity;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import com.techthinker.CAAndroid.R;
import com.techthinker.CAAndroid.widget.Root_Panel;
import com.techthinker.CAAndroid.widget.Root_Panel.OnPanelListener;
import com.techthinker.CAAndroid.widget.Interpolator.EasingType.Type;
import com.techthinker.CAAndroid.widget.Interpolator.ElasticInterpolator;

public class RootViewActivity extends Activity implements OnPanelListener {

	private Root_Panel bottomPanel;
	private Root_Panel leftPanel;
	private Root_Panel rightPanel;
	private Root_Panel topPanel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_panel);

        topPanel = (Root_Panel) findViewById(R.id.topPanel);
        topPanel.setOnPanelListener(this);
        topPanel.setInterpolator(new ElasticInterpolator(Type.OUT, 1.0f, 0.3f));
        
        leftPanel = (Root_Panel) findViewById(R.id.leftPanel);
        leftPanel.setOnPanelListener(this);
        leftPanel.setInterpolator(new ElasticInterpolator(Type.OUT, 1.0f, 0.3f));

        rightPanel = (Root_Panel) findViewById(R.id.rightPanel);
        rightPanel.setOnPanelListener(this);
        rightPanel.setInterpolator(new ElasticInterpolator(Type.OUT, 1.0f, 0.3f));

        bottomPanel = (Root_Panel) findViewById(R.id.bottomPanel);
        bottomPanel.setOnPanelListener(this);
        bottomPanel.setInterpolator(new ElasticInterpolator(Type.OUT, 1.0f, 0.3f));
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if (keyCode == KeyEvent.KEYCODE_T) {
    		topPanel.setOpen(!topPanel.isOpen(), false);
    		return false;
    	}
    	if (keyCode == KeyEvent.KEYCODE_B) {
    		bottomPanel.setOpen(!bottomPanel.isOpen(), true);
    		return false;
    	}
    	return super.onKeyDown(keyCode, event);
    }

	public void onPanelClosed(Root_Panel panel) {
		String panelName = getResources().getResourceEntryName(panel.getId());
		Log.d("TestPanels", "Panel [" + panelName + "] closed");
	}
	public void onPanelOpened(Root_Panel panel) {
		String panelName = getResources().getResourceEntryName(panel.getId());
		Log.d("TestPanels", "Panel [" + panelName + "] opened");
	}
}
