package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio9 {
    private void removeRepetidos(List<Integer> list) {
        List<Integer> result = list.stream().distinct().toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();
        Desafio9 desafio9 = new Desafio9();
        desafio9.removeRepetidos(list.getList());
    }
}
