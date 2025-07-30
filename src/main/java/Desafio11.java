package main.java;

import main.list.ListNumbers;

import java.util.List;

public class Desafio11 {
    private void eleveAoQuadradoESome(List<Integer> list) {
        Integer result = list.stream().mapToInt(i -> i * i).sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ListNumbers list = new ListNumbers();

        Desafio11 desafio11 = new Desafio11();
        desafio11.eleveAoQuadradoESome(list.getList());
    }
}
