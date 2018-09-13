/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt_list;

/**
 *
 * @author Estudiante
 */
public class MyArrayList<E> {
    private int DEFAULT_SIZE = 10;
    public int tamanodelasecuencia;
    private E[] sequence = (E[]) new Object[10];

    public MyArrayList() {
        this.tamanodelasecuencia = 0;
        ensureCapacity(DEFAULT_SIZE);
    }
    
    public void add(int idx, E element){
        
    }
    
    
    public boolean isEmpty(){
        return tamanodelasecuencia==0?true:false;
    }
    
    public void ensureCapacity(int newSize){
        if(newSize < tamanodelasecuencia){
            return;
        }
        E[] oldSequence = sequence;
        E[] newSequence = (E[]) new Object[newSize];
        for(int index=0;index<tamanodelasecuencia;index++){
            newSequence[index]=oldSequence[index];
        }
        this.sequence = newSequence;
    }
    
}
