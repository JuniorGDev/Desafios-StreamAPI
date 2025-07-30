package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio1 {
    private void listOrdered(List<Integer> list) {
        List<Integer> result = list.stream().sorted().toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio1 desafio1 = new Desafio1();
        desafio1.listOrdered(list.getList());
    }
}
