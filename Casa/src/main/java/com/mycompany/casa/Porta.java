/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casa;

/**
 *
 * @author User
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double comprimento;

    // Construtor da classe Porta
    public Porta(boolean aberta, String cor, double altura, double comprimento) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Método para abrir a porta
    public void abrir() {
        if (!aberta) {
            System.out.println("Abrindo a porta...");
            aberta = true;
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (aberta) {
            System.out.println("Fechando a porta...");
            aberta = false;
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Método para pintar a porta com uma nova cor
    public void pintar(String novaCor) {
        System.out.println("Pintando a porta de " + novaCor);
        cor = novaCor;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        if (aberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
        return aberta;
    }

    // Métodos para obter informações da porta
    public String getCor() {
        return cor;
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public static void main(String[] args) {
        // Testando a classe Porta
        Porta minhaPorta = new Porta(false, "branca", 2.0, 0.8);

        minhaPorta.abrir();
        minhaPorta.fechar();

        minhaPorta.pintar("azul");

        minhaPorta.abrir();
        minhaPorta.estaAberta();

        // Alterando dimensões da porta
        minhaPorta.altura = 2.5;
        minhaPorta.comprimento = 1.0;

        System.out.println("Cor da porta: " + minhaPorta.getCor());
        System.out.println("Altura da porta: " + minhaPorta.getAltura() + " metros");
        System.out.println("Comprimento da porta: " + minhaPorta.getComprimento() + " metros");
    }
}
