package com.example.app7.iterater;

import java.util.ArrayList;

/**
 * autour : lbing
 * date : 2018/8/15 0015 11:23
 * className :
 * version : 1.0
 * description :
 */


public class MyConcreteList<T> implements MyBaseList<T> {
    private ArrayList<T> innerList = new ArrayList<>();

    @Override
    public void add(T t) {
        innerList.add(t);
    }

    @Override
    public void remove(T t) {
        innerList.remove(t);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(innerList);
    }
}
