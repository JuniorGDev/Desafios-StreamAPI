package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio3 {
    private void checkList(List<Integer> list) {
        List<Integer> result = list.stream().filter(i -> i > 0).toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio3 desafio3 = new Desafio3();
        desafio3.checkList(list.getList());
    }
}
