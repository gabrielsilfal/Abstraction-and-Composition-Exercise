/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author Administrator
 */
public class Disciplina {
    private String nome;
    private int cargaHoraria, id;
    private Professor professor;
    private static int contador = 0;
    
    public Disciplina(String nome, int cargaHoraria, Professor professor){
        contador++;
        this.id = contador;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    
    public String getNome(){
        return this.nome;
    }
}
