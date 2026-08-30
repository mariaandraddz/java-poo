# Programação Orientada a Objetos - Java

### Vantagens
- Confiável: O isolamento entre as partes gera um software seguro. Ao alterar uma parte, nenhuma outra é afetada.
- Oportuno: Ao dividir em várias partes, várias delas podem ser desenvolvidas em paralelo.
- Manutenível: Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usuarem o objeto.
- Extensível: O software não é estático. Ele deve crescer para permanecer útil.
- Reutilizável: É possível usar objetos de um sistema que criamos em outro sistema futuro.
- Natural: Mais fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.

----

### O que é um Objeto?
Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos e estado atual.

- Pra criar um objeto é necessário ter uma classe inicialmente.

- Sempre tem: Atributos, Métodos e Estado.

- Ao gerar um objeto a partir de uma classe, chamamos esse processo de "Instanciar".

Exemplo:
- Objeto 1: Notebook, é cinza, tem led no  teclado, tem uma tela, está sobre a mesa, assistir, mexer
- Objeto 2: Mouse, cinza, ergonomico, logi, está sobre a mesa, mexer, clicar em algo

Obs.:
- "This": auto referenciação

----
### Código 

```
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

============================================

package com.mycompany.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
     
    void status () { //metodo
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! Não é possível rabiscar");
        } else  {
            System.out.println("Estou rabiscando");
        }
        
    }
    void tampar () {
        this.tampada = true;
    }
 
    void destampar () {
        this.tampada = false;
    }
    
}
```

----

### O que é Visibilidade em um Objeto?
##### Diagrama de Classes
No Diagrama de Classe, toda classe é um retângulo


###### Modificadores de Visibilidade
Indicam o nível de acesso aos componentes internos(atributos e métodos) de uma classe

- +: Visibilidade Pública;
  - A classe atual e todas as outras classes.

- -: Visibilidade Privada;
    - Somente a classe atual
    
- #: Modo protegido.
    - A classe atual e todas as suas sub-classes.

-----

### Métodos Especiais

- Getters: Consegue ter acesso ao determinado atributo mantenho a segurança do mesmo (métodos acessores) - não tem parâmetro
- Setters: Precisa de algum parâmetro para funcionar (métodos modificados)
- Construct: Função especial executada automaticamente quando você cria (instancia) um novo objeto a partir de uma classe



