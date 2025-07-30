package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio8 {
    private void somarNumeros(List<Integer> list) {
        Integer result = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio8 desafio8 = new Desafio8();
        desafio8.somarNumeros(list.getList());
    }
}
