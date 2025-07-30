package main.java;

import main.list.ListNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio14 {
    private void maiorNumeroPrimo(List<Integer> list) {
        Integer result = list.stream().filter(this::isPrimo).max(Comparator.naturalOrder()).orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        System.out.println(result);
    }

    private boolean isPrimo(int num) {
        num = Math.abs(num);

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio14 desafio14 = new Desafio14();
        desafio14.maiorNumeroPrimo(list.getList());
    }
}
