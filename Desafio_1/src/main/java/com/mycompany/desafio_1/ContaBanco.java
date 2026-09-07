package com.mycompany.desafio_1;

class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void  estadoAtual(){
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    // metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
   
    
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.status == true){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado na conta " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(int v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() -v);
                System.out.println("Saque realizado na conta " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pegarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v=12;
        } else if ("CP".equals(this.getTipo())){
            v=20;
        }
        
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
       
    
    
    }
   
    
    // metodos especiais
    
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    }
    