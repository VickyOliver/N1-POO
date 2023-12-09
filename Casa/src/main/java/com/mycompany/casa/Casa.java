/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casa;

/**
 *
 * @author User
 */
public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;

    // Construtor da classe Casa
    public Casa(String cor, Porta porta1, Porta porta2) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    // Método para pintar a casa com uma nova cor
    public void pintar(String novaCor) {
        System.out.println("Pintando a casa de " + novaCor);
        cor = novaCor;
    }

    // Método para contar o número de portas abertas na casa
    public int quantPortasAbertas() {
        int count = 1;
        if (porta1.estaAberta()) {
            count++;
        }
        if (porta2.estaAberta()) {
            count++;
        }
        System.out.println("Número de portas abertas: " + count);
        return count;
    }

    public static void main(String[] args) {
        // Criando duas portas
        Porta minhaPorta1 = new Porta(false, "marrom", 2.0, 0.8);
        Porta minhaPorta2 = new Porta(true, "branca", 1.8, 0.7);

        // Criando uma casa e atribuindo as portas criadas
        Casa minhaCasa = new Casa("verde", minhaPorta1, minhaPorta2);

        // Pintando a casa
        minhaCasa.pintar("amarelo");

        // Abrindo e fechando as portas
        minhaPorta1.abrir();
        minhaPorta2.fechar();

        // Verificando o número de portas abertas na casa
        minhaCasa.quantPortasAbertas();
    }
}

