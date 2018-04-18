package com.mingwei.myprocess;

import com.squareup.javapoet.ClassName;

public class TypeUtil {
    public static final ClassName FINDER = ClassName.get("com.mingwei.myapi.finder", "Finder");
    public static final ClassName INJECTOR = ClassName.get("com.mingwei.myapi", "Injector");
    public static final ClassName ONCLICK_LISTENER = ClassName.get("android.view", "View", "OnClickListener");
    public static final ClassName ANDROID_VIEW = ClassName.get("android.view", "View");
}
