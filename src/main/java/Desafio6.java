package main.java;

import main.list.ListNumbers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Desafio6 {
    private void maiorqueDez(List<Integer> list) {
        Integer result = list.stream().filter(i -> i > 10).findFirst().orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        System.out.println("Maior que 10: " + result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio6 desafio6 = new Desafio6();
        desafio6.maiorqueDez(list.getList());
    }
}
