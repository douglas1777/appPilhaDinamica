/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadChar;

/**
 *
 * @author groov
 */
public class AppNo {

    public static void main(String[] args) {
        No numeros;

        numeros = new No('a');
        System.out.println(numeros.prox);

        No no2 = new No('b');
        numeros.prox = no2;

        No no3 = new No('c');
        no2.prox = no3;

        No no4 = new No('d');
        no3.prox = no4;

        No atual = numeros;
        while (atual != null) {
            System.out.println("num: " + atual);
            atual = atual.prox;
        }

    }
}
