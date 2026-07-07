/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author Administrator
 */
public class Aluno {
    private String nome;
    private int idade, id;
    private static int contador = 0;
    
    public Aluno(String nome, int idade){
        contador++;
        this.nome = nome;
        this.id = contador;
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
}
