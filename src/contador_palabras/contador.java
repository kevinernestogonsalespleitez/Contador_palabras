/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador_palabras;

import java.util.ArrayList;
import java.util.Collections;

public class contador {
    String[] contador_P(String frases){
        String[] palabras = frases.split("\\ ");
        return palabras;
    
    }
    ArrayList<Character> contador_L(String frase){
        String[] palabras = frase.split("\\ ");
        ArrayList<Character> letras = new ArrayList<Character>();
        for(String a : palabras){
            int numero_letras = a.length();
            for(int i = 0;i<numero_letras;i++){
                letras.add(a.charAt(i));
            }
        }
        return letras;
    }
}
