package App;

import tad.Stack;

/**
 *
 * @author Siabreu
 */
public class AppStack {
    public static void main(String[] args) {
        Stack pilha = new Stack();     
        
        pilha.push(30);
        pilha.push(80);
        pilha.push(20);
        System.out.println("=== DADOS DA PILHA ===\n" + pilha);
        System.out.println("=> Total elementos: " + pilha.size());
        try{
            System.out.println("=> Dado do topo: " + pilha.peek());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
        while(!pilha.isEmpty()){
            System.out.println("Desempilhou: " + pilha.pop());
        }      
        System.out.println(pilha.isEmpty());
    }
}
