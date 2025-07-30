package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio16 {
    private void separeParesImpares(List<Integer> list) {
        List<Integer> pares = list.stream().filter(i -> i % 2 == 0).toList();
        List<Integer> impares = list.stream().filter(i -> i % 2 != 0).toList();
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio16 desafio16 = new Desafio16();
        desafio16.separeParesImpares(list.getList());
    }
}
