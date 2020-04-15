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
public class No {
    //atributos
    char dado;
    No prox; //auto referencia
    
    public No(char dado){
        this.dado = dado;
        prox = null; //referencia nula
    }

    @Override
    public String toString() {
        return String.valueOf(dado);
    }
    
}
