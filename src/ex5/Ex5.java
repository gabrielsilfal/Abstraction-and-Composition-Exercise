/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, texto; //texto = variavel generica para declarar textos,descricoes,etc
        int idade, id, valor = 1; //valor = variavel generica
        Professor professorEscolhido = null;

        Escola c1 = new Escola();

        while (valor > 0) {
            //menu de selecao
            System.out.println("Menu:\n"
                    + "0-Encerrar menu\n"
                    + "1-Cadastrar Aluno\n"
                    + "2-Cadastrar Professor\n"
                    + "3-Cadastrar Disciplina\n"
                    + "4-Listar Alunos\n"
                    + "5-Listar Professores\n"
                    + "6-Listar Disciplinas\n");
            valor = teclado.nextInt();
            teclado.nextLine(); // o nextInt nao consome o ENTER do buffer, o que faz ele passar direto
            //switch para o menu funcionar
            switch (valor) {
                case 0:
                    if(valor == 0){
                        System.out.println("Menu encerrado.");
                        return;
                    }
                //cadastros
                //cadastrar aluno
                case 1:
                    //nome
                    System.out.println("Cadastro de alunos.\n"
                            + "Insira o nome: ");
                    nome = teclado.nextLine();
                    //idade
                    System.out.println("Insira a idade:");
                    valor = teclado.nextInt();
                    teclado.nextLine();
                    if (valor > 0) {
                        idade = valor;
                    } else {
                        System.out.println("Idade invalida. Insira um valor maior que 0:");
                        valor = teclado.nextInt();
                        teclado.nextLine();
                        if (valor > 0) {
                            idade = valor;
                        } else {
                            System.out.println("Idade invalida.");
                            System.out.println("Fatal Error");
                            break;
                        }
                    }
                    c1.cadastrarAluno(nome, idade);
                    System.out.println("Aluno cadastrado!");
                    break;
                //cadastrar professores
                case 2:
                    //nome
                    System.out.println("Cadastro de professores.\n"
                            + "Insira o nome: ");
                    nome = teclado.nextLine();
                    //formacao
                    System.out.println("Insira a formacao:");
                    texto = teclado.nextLine();
                    c1.cadastrarProfessor(nome, texto);
                    System.out.println("Professor cadastrado!");
                    break;
                case 3:
                    //nome
                    System.out.println("Cadastro de disciplinas.\n"
                            + "Insira o nome: ");
                    nome = teclado.nextLine();
                    //professor
                    System.out.println("Insira o ID do professor titular:");
                    valor = teclado.nextInt();
                    teclado.nextLine();
                    if (c1.verificarProfessor(valor)) {
                        id = valor;
                    } else {
                        System.out.println("Id invalido.");
                        System.out.println("Fatal Error");
                        break;
                    }
                    //carga horaria
                    System.out.println("Insira a carga horaria:");
                    valor = teclado.nextInt();
                    teclado.nextLine();
                    if (valor > 0) {
                        professorEscolhido = c1.buscarProfessor(id);
                        c1.cadastrarDisciplina(nome, valor, professorEscolhido);
                    } else {
                        System.out.println("Insira um valor acima de 0:");
                        valor = teclado.nextInt();
                        teclado.nextLine();
                        if (valor > 0) {
                            c1.cadastrarDisciplina(nome, valor, professorEscolhido);
                        } else {
                            System.out.println("Valor invalido.");
                            System.out.println("Fatal Error");
                            break;
                        }
                    }
                    System.out.println("Disciplina cadastrada!");
                    break;
                //listas
                case 4:
                    //listar alunos
                    System.out.println("Lista de alunos:");
                    System.out.println(c1.listarAlunos());
                    break;
                case 5:
                    //listar professores
                    System.out.println("Lista de professores:");
                    System.out.println(c1.listarProfessores());
                    break;
                case 6:
                    //listar disciplinas
                    System.out.println("Lista de disciplinas: ");
                    System.out.println(c1.listarDisciplinas());
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
    }
}
