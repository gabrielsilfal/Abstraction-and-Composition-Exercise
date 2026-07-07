/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author Administrator
 */
public class Professor {
    private String nome, formacao;
    private int id;
    private static int contador = 0;
    
    public Professor(String nome, String formacao){
        contador++;
        this.nome = nome;
        this.formacao = formacao;
        this.id = contador;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
}
