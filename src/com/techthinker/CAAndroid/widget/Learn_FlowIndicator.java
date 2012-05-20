
package com.techthinker.CAAndroid.widget;

import com.techthinker.CAAndroid.widget.Learn_ViewFlow.ViewSwitchListener;

public interface Learn_FlowIndicator extends ViewSwitchListener {

	public void setViewFlow(Learn_ViewFlow view);

	public void onScrolled(int h, int v, int oldh, int oldv);
}
