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
        
    }
    
}
