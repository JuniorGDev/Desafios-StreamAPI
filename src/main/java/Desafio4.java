package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio4 {
    private void RemoveImpar(List<Integer> list) {
        List<Integer> result = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio4 desafio4 = new Desafio4();
        desafio4.RemoveImpar(list.getList());
    }
}
