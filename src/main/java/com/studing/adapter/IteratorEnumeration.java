package com.studing.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-21.
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
