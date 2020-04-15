/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadRandom;

/**
 *
 * @author groov
 */
public class No {
    //atributos
    int dado;
    No prox; //auto referencia
    
    public No(int dado){
        this.dado = dado;
        prox = null; //referencia nula
    }

    @Override
    public String toString() {
        return String.valueOf(dado);
    }
}
