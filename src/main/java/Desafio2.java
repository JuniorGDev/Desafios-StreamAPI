package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio2 {
    private void Sum(List<Integer> list) {
        int result = list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio2 desafio2 = new Desafio2();
        desafio2.Sum(list.getList());
    }
}
