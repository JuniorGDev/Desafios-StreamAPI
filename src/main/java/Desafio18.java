package main.java;

import main.list.ListNumbers;

import java.util.Collections;
import java.util.List;

public class Desafio18 {
    private void numerosIguais(List<Integer> list) {
//      List<Integer> result = list.stream().filter(i -> list.indexOf(i) != list.lastIndexOf(i)).distinct().toList();
        List<Integer> result = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1) // pega apenas os que aparecem mais de uma vez
                .distinct() // remove repetições no resultado
                .toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio18 desafio18 = new Desafio18();
        desafio18.numerosIguais(list.getList());
    }
}
