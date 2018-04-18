package com.mingwei.myapi.finder;

import android.content.Context;
import android.view.View;

public interface Finder {

    /**
     * 根据source获取Context
     *
     * @param source Context 来源，例如Activity，View
     * @return
     */
    Context getContext(Object source);

    /**
     * 根据id找控件
     *
     * @param source 控件来源
     * @param id     目标控件ID
     * @return
     */
    View findView(Object source, int id);
}
