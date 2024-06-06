package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return false;
        }
        return super.add(o);
    }

    @Override
    public Object remove(int index) {
        return super.remove(index);
    }

    public void sort() {
        Collections.sort(this);
    }
}
