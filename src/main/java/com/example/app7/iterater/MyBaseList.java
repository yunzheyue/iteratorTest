package com.example.app7.iterater;

/**
 * autour : lbing
 * date : 2018/8/15 0015 11:21
 * className :
 * version : 1.0
 * description :
 */


public interface MyBaseList<T> {
    void add(T t);

    void remove(T t);

    Iterator iterator();
}
