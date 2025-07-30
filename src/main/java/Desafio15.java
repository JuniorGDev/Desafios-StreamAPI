package main.java;

import main.list.ListNumbers;

import java.util.List;
import java.util.Optional;

public class Desafio15 {
    private void hasNumeroNegativo(List<Integer> list) {
        List<Integer> result = list.stream().filter(i -> i < 0).toList();
        Optional<List<Integer>> resultadoValidado = Optional.of(result);
        System.out.println(resultadoValidado.get());
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio15 desafio15 = new Desafio15();
        desafio15.hasNumeroNegativo(list.getList());
    }
}
