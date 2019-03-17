package contador_palabras;

import java.util.ArrayList;
import java.util.Collections;

public class validacion {
    ArrayList<String> ordenar(String[] palabras){
        
        ArrayList<String> StringPalabras = new ArrayList<String>();
        for(String b : palabras){
            StringPalabras.add(b);
        }
        Collections.sort(StringPalabras);
        return StringPalabras;
    }
    ArrayList<Character> ordenar_L(ArrayList<Character> Letras){
        ArrayList<Character> Letras_Ordenadas = new ArrayList<Character>();
        for(Character b : Letras){
            Letras_Ordenadas.add(b);
        }
        Collections.sort(Letras_Ordenadas);
        return Letras_Ordenadas;
    }
}
