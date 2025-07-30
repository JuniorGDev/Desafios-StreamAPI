package main.java;

import main.list.ListNumbers;

import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5 {
    private void calculaMedia(List<Integer> list) {
        double result = list.stream().filter(i -> i > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        System.out.println("A média dos números maiores que 5 é: " + result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio5 desafio5 = new Desafio5();
        desafio5.calculaMedia(list.getList());
    }
}
