package org.business.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SimpleRepository <T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll(){
        return items;
    }

    public void remove(Predicate <T> predicate){
        items.removeIf(predicate);
    }
}
