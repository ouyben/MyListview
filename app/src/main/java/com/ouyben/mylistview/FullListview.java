package com.ouyben.mylistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * TODO :
 * Created by owen
 * on 2016-10-13.
 */

public class FullListview extends ListView {
    public FullListview(Context context) {
        super(context);
    }

    public FullListview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullListview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
