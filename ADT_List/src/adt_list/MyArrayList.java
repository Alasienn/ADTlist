/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt_list;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.function.Consumer;
/**
 *
 * @author Estudiante
 */
public class MyArrayList<E> implements Iterator{
    private int currentPos =0;
    
    private int DEFAULT_SIZE = 10;
    public int tamanodelasecuencia;
    private E[] sequence = (E[]) new Object[10];

    public MyArrayList() {
        this.tamanodelasecuencia = 0;
        ensureCapacity(DEFAULT_SIZE);
    }
    
    public void add(int idx, E element){
        if(sequence.length == tamanodelasecuencia){
            ensureCapacity((tamanodelasecuencia*2) +1);
        }
        for(int index = tamanodelasecuencia;index>idx;index--){
            sequence[index] =sequence[index-1];
        }
        this.sequence[idx] = element;
        this.tamanodelasecuencia++;
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
    
    public Iterator<E> iterator(){
        return new MyArrayListIterator();
    }
    
    public class MyArrayListIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return currentPos < tamanodelasecuencia;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return sequence[currentPos++];
        }

        
        }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
