package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio13 {
    private void filtrarIntervalo(List<Integer> list) {
        List<Integer> result = list.stream().filter(i -> i > 5 && i < 10).toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio13 desafio13 = new Desafio13();
        desafio13.filtrarIntervalo(list.getList());
    }
}
