package main.java;

import main.list.ListNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio7 {
    private void segundoMaior(List<Integer> list) {
        Integer result = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio7 desafio7 = new Desafio7();
        desafio7.segundoMaior(list.getList());
    }
}
