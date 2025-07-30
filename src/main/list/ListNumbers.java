package main.list;

import java.util.Arrays;
import java.util.List;

public class ListNumbers {
    private final List<Integer> list;

    public ListNumbers() {
        this.list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public List<Integer> getList() {
        return list;
    }
}
