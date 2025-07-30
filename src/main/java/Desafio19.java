package main.java;

import main.list.ListNumbers;

import java.util.List;
import java.util.NoSuchElementException;

public class Desafio19 {
    private void somarNumerosDivisiveisPorTresECinco(List<Integer> list) {
        Integer result = list.stream()
                .filter(i -> i % 3 == 0 && i % 5 == 0)
                .mapToInt(i -> i)
                .sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio19 desafio19 = new Desafio19();
        desafio19.somarNumerosDivisiveisPorTresECinco(list.getList());
    }
}
