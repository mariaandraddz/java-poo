package com.mycompany.desafio_1;

public class Desafio_1 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        System.out.println("=================================");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP ");
        
        p1.depositar(100);
        p2.depositar(500);
        
        
        p1.sacar(100);
       
        p1.estadoAtual();
        System.out.println("=================================");
        p2.estadoAtual();
        
        
    }
}
