package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio10 {
    private void multiplosTresOuCinco(List<Integer> list) {
        List<Integer> result = list.stream().filter(i -> i % 2 != 0).filter(i -> i % 3 == 0 || i % 5 == 0).toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio10 desafio10 = new Desafio10();
        desafio10.multiplosTresOuCinco(list.getList());
    }
}
