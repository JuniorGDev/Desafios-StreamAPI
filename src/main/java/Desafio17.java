package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio17 {
    private void numerosPrimos(List<Integer> list) {
        List<Integer> result = list.stream().filter(this::isPrimo).toList();
        System.out.println(result);
    }

    private boolean isPrimo(Integer integer) {
        integer = Math.abs(integer);

        if (integer <= 1) {
            return false;
        }

        for (int i = 2; i * i <= integer; i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio17 desafio17 = new Desafio17();
        desafio17.numerosPrimos(list.getList());
    }
}
