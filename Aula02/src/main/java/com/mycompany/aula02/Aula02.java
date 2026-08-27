package com.mycompany.aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f; // referencia a um atributo
       // c1.tampar();
        c1.tampar();
        c1.rabiscar();
        c1.status(); //referencia a um metodo
        
        
        Caneta c2 = new Caneta (); 
        c2.modelo = "Tradicional";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
