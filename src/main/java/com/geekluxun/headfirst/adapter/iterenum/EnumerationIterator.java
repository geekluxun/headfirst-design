package com.geekluxun.headfirst.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration适配目标对象Iterator
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * 真正被调用的是Enumeration
     * @return
     */
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
