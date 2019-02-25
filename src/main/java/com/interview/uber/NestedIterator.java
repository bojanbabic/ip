package com.interview.uber;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

    private LinkedList<NestedInteger> nestedList;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = new LinkedList<>(nestedList);
    }

    @Override
    public Integer next() {
        NestedInteger elem = nestedList.poll();
        if (elem.isInteger()) {
            return elem.getInteger();
        }
        elem.getList().addAll(this.nestedList);

        this.nestedList = new LinkedList<>(elem.getList());
        return next();
    }

    @Override
    public boolean hasNext() {
        if (this.nestedList.size() > 0 && this.nestedList.get(0).isInteger()) {
            return true;
        } else {
            NestedInteger elem = nestedList.poll();
            elem.getList().addAll(this.nestedList);
            this.nestedList = new LinkedList<>(elem.getList());
            return hasNext();
        }
    }
}
