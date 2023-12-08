/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aniversario;

/**
 *
 * @author Alunos
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vicky", 16);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("\nDepois de alguns aniversários:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
