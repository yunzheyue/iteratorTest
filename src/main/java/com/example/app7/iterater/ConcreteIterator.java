package com.example.app7.iterater;

import java.util.ArrayList;

/**
 * autour : lbing
 * date : 2018/8/15 0015 11:15
 * className :
 * version : 1.0
 * description :
 */

public class ConcreteIterator<T> implements Iterator<T> {

    private ArrayList<T> innerList;
    private int curror = -1;

    public ConcreteIterator(ArrayList<T> list) {
        this.innerList = list;
        if (list != null && list.size() > 0) {
            curror = 0;
        }
    }

    @Override
    public boolean hasNext() {
        return curror < innerList.size() && curror != -1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return innerList.get(curror++);
        } else {
            return null;
        }
    }
}
