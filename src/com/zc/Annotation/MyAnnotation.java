package com.zc.Annotation;

public @interface MyAnnotation {
    public abstract String show();
    int show2() default 12;
}
