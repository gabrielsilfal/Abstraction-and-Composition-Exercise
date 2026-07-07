/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Escola {

    private String nome, cidade;
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    Professor professorEscolhido = null;

    public void cadastrarAluno(String nome, int idade) {
        alunos.add(new Aluno(nome, idade));
    }

    public void cadastrarProfessor(String nome, String formacao) {
        professores.add(new Professor(nome, formacao));
    }

    public void cadastrarDisciplina(String nome, int cargaHoraria, Professor professor) {
        disciplinas.add(new Disciplina(nome, cargaHoraria, professor));
    }

    public ArrayList<String> listarAlunos() {
        ArrayList<String> lista = new ArrayList<>();
        for (Aluno a : alunos) {
            lista.add(a.getNome());
        }
        return lista;
    }

    public ArrayList<String> listarProfessores() {
        ArrayList<String> lista = new ArrayList<>();
        for (Professor p : professores) {
            lista.add(p.getNome());
        }
        return lista;
    }

    public ArrayList<String> listarDisciplinas() {
        ArrayList<String> lista = new ArrayList<>();
        for (Disciplina d: disciplinas) {
            lista.add(d.getNome());
        }
        return lista;
    }
    
    public int buscarAluno(int valor){
        for(Aluno a: alunos){
            if(valor == a.getId()){
               return a.getId();
            }
        }
    return 0;
    }
    
    public Professor buscarProfessor(int id){
        for(Professor p: professores){
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
    
    public boolean verificarProfessor(int valor){
        for(Professor p: professores){
            if(valor == p.getId()){
                return true;
            }
        }
        return false;
    }
}
