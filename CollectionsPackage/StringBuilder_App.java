/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsPackage;

/**
 *
 * @author alsten
 */
public class StringBuilder_App {

    public static void main(String args[]) {

        /*  StringBuilder basically creates mutable Strings and is used for better performance 
            because it doesnt create new objects everytime
        
            Q: Why do we need a StringBuilder when we already have a String Class?
            Ans: https://stackoverflow.com/questions/5234147/why-stringbuilder-when-there-is-string
         */
        
        /*-------------------------CREATING STRINGBUILDER-----------------------------*/
        // Creates an empty StringBuilder with default capacity 16
        StringBuilder sb1 = new StringBuilder();

        // Creates an empty StringBuilder with default capacity 16
        StringBuilder sb2 = new StringBuilder("Hello ");

        /*-------------------------APPENDING INTO STRINGBUILDER-----------------------------*/
        sb2.append("Java");
        System.out.println(sb2);

        /*-------------------------INSERTING INTO STRINGBUILDER-----------------------------*/
        sb2.insert(5, " World");
        System.out.println(sb2);

        /*-------------------------REPLACING SUBSTRINGS IN STRINGBUILDER-----------------------------*/
        sb2.replace(6, 11, "Earth");
        System.out.println(sb2);

        /*-------------------------DELETE SUBSTRINGS IN STRINGBUILDER-----------------------------*/
        sb2.delete(6, 12);
        System.out.println(sb2);

        /*-------------------------REVERSE IN STRINGBUILDER-----------------------------*/
        sb2.reverse();
        System.out.println(sb2);

        /*-------------------------CAPACITY IN STRINGBUILDER-----------------------------*/
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(50);
        System.out.println(sb2.capacity());

    }
}
