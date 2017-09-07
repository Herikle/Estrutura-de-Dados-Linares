/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha.estrutura;

/**
 *
 * @author proprietario
 */
public class Pilha {
    class No{
        No ant = null;
        public int valor;
    }
    private No last = new No();
    private int size = 0;
    public void push(int x)
    {
        No no = new No();
        no.ant = last;
        no.valor = x;
        last = no;
        size++;
    }
    public int pop() throws PilhaException
    {
        if(last.ant == null) throw new PilhaException("Pilha está vazia");
        int lastitem = last.valor;
        last = last.ant;
        size--;
        return lastitem;
    }
    public int top() throws PilhaException
    {
        if(last.ant == null) throw new PilhaException("Pilha está vazia");
        return last.valor;
    }
    public int size()
    {
        return size;
    }
    
}