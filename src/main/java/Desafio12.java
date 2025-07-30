package main.java;

import main.list.ListNumbers;

import java.util.List;
import java.util.NoSuchElementException;

public class Desafio12 {
    private void encontreProduto(List<Integer> list) {
        Integer result = list.stream().reduce((a, b) -> a * b).orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio12 desafio12 = new Desafio12();
        desafio12.encontreProduto(list.getList());
    }
}
