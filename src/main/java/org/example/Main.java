package org.example;

public class Main {
    public static void main(String[] args) {
        int vetor[] = {7, 12, 2, 34, 5};
        int guardaNumeroMaior;

        for (int index = 0; index < vetor.length; index++) {
            for (int atual = 0; atual < vetor.length - 1; atual++) {
                if (vetor[atual] > vetor[atual + 1]) {
                    guardaNumeroMaior = vetor[atual];
                    vetor[atual] = vetor[atual + 1];
                    vetor[atual + 1] = guardaNumeroMaior;
                }
            }
        }

        for (int index = 0; index < vetor.length; index++) {
            System.out.println(vetor[index]);
        }
    }
}