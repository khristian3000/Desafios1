/*
Programar una galleta de la suerte o bola 8 de la suerte donde al ingresar un número de la suerte por teclado,
el usuario reciba una frase de buena suerte.
Las frases estarán almacenadas en un arraylist.
Se utilizará el método random para llamar un índice cualquiera del arraylist.
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> suerte = new ArrayList<String>();
        suerte.add("La buena suerte no es casual, es producto del trabajo; así la sonrisa de la fortuna tiene que ganarse a pulso.");
        suerte.add("Con buena suerte hemos nacido si no la malogramos.");
        suerte.add("Y esto se sabe, buena suerte compañero, nadie sale vivo al ruedo, es una cuestión de fe.");
        suerte.add("La felicidad no es algo que sucede. No es el resultado de la buena suerte o del azar. No es algo que pueda comprarse con dinero o con poder. No parece depender de los acontecimientos externos, sino más bien de cómo los interpretamos.");
        suerte.add("Al mal paso darle prisa");

        Random r1 = new Random();
        int n2 = r1.nextInt(5);

        System.out.println(n2);

        System.out.println(suerte.get(n2));
    }
}