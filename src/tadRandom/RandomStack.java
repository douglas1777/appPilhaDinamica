/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadRandom;

import java.util.Random;

/**
 *
 * @author groov
 */
public class RandomStack {
        private No topo;
    
    public RandomStack(){
        topo = null;
    }
    
    public boolean isEmpty(){
        return topo == null;
    }
    
    public void push(int dado){
        No novoNo = new No(dado); //cria o nó
        novoNo.prox = topo; //faz o prox do novo nó apontar para o topo
        topo = novoNo; //faz o topo apontar para o nó criado       
    }
    
    public int pop(){
        if(! isEmpty()){
            No temp = topo; //recupera o elemento do topo
            topo = topo.prox; //desloca o topo para baixo
            return temp.dado; //retorna o elemento do topo
        }else
            throw new RuntimeException("==> Pilha Vazia!");
    }
    
    public int peek(){
        if(! isEmpty()){            
            return topo.dado;
        }else
            throw new RuntimeException("==> Pilha Vazia!");
    }
    
    public int size(){
        No atual = topo; //atual inicia com o topo
        int qtd = 0;
        while(atual != null){ //enquanto atual não for null
            qtd++; //conta + 1
            atual = atual.prox; //avança para o proximo nó
        }
        return qtd;
    }
    public void Random(int random){
        Random r = new Random(5);
         int x = r.nextInt();
         
    }

    @Override
    public String toString() {
        No atual = topo; //atual inicia com o topo
        StringBuilder saida = new StringBuilder();
        while(atual != null){ //enquanto atual não for null
            saida.append(atual).append("\n");            
            atual = atual.prox; //avança para o proximo nó
        }
        return saida.toString();
    }    
}

    

