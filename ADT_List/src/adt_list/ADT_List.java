/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt_list;

import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class ADT_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList <String> myArray = new MyArrayList<String>();
        System.out.println(myArray.sequenceSize);
        
        myArray.add(0, "0");
        myArray.add(1, "1");
        myArray.add(2, "2");
        myArray.add(3, "3");
        myArray.add(4, "4");
        myArray.add(5, "5");
        myArray.add(6, "6");
        myArray.add(7, "7");
        myArray.add(8, "8");
        myArray.add(9, "9");
        System.out.println(myArray.sequenceSize);
        for(Iterator<String> iterator = myArray.iterator();iterator.hasNext();){
            String elemento = iterator.next();
            System.out.print("["+elemento+"]");
        }
        
        myArray.reverse();
        System.out.println("");
        System.out.println(myArray.sequenceSize);
        for(Iterator<String> iterator = myArray.iterator();iterator.hasNext();){
            String elemento = iterator.next();
            System.out.print("["+elemento+"]");
        }
        
        System.out.println("");
        MyArrayList <String> my2Array = new MyArrayList<String>();
        my2Array.add(0, "a");
        my2Array.add(1, "b");
        my2Array.add(2, "c");
        my2Array.add(3, "d");
        my2Array.add(4, "e");
        my2Array.add(5, "f");
        my2Array.add(6, "g");
        my2Array.add(7, "h");
        my2Array.add(8, "i");
        my2Array.add(9, "j");
        
        for(Iterator<String> iterator = my2Array.iterator();iterator.hasNext();){
            String elemento = iterator.next();
            System.out.print("[" + elemento + "]");
        }
        System.out.println("\nConcat");
        my2Array.concat(myArray);

    }
    
    
    
}
