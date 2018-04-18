package com.mingwei.myapi;

import com.mingwei.myapi.finder.Finder;

public interface Injector<T> {
    /**
     * @param host   目标
     * @param source 来源
     * @param finder
     */
    void inject(T host, Object source, Finder finder);
}
