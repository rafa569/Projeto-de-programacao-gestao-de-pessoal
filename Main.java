/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.pessoal;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaGestão sistema = new SistemaGestão();

        Usuário usuario = new Supervisor("admin", "123");

        int opcao = 0;

        while (opcao != 5) {

            try {

                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar Bombeiro");
                System.out.println("2 - Consultar Bombeiros");
                System.out.println("3 - Atualizar Bombeiro");
                System.out.println("4 - Excluir Bombeiro");
                System.out.println("5 - Sair");
                System.out.print("Escolha: ");

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:

                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();

                        System.out.print("Matrícula: ");
                        String matricula = sc.nextLine();

                        System.out.print("Data de nascimento: ");
                        String nascimento = sc.nextLine();

                        System.out.print("Patente: ");
                        String patente = sc.nextLine();

                        System.out.print("Especialidade: ");
                        String especialidade = sc.nextLine();

                        System.out.print("Contato: ");
                        String contato = sc.nextLine();

                        System.out.print("Status: ");
                        String status = sc.nextLine();

                        Bombeiro b = new Bombeiro(
                                id,
                                nome,
                                cpf,
                                matricula,
                                nascimento,
                                patente,
                                especialidade,
                                contato,
                                status
                        );

                        sistema.cadastrar(b);
                        break;

                    case 2:
                        sistema.consultar();
                        break;

                    case 3:

                        System.out.print("ID do bombeiro: ");
                        int idAtualizar = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Novo contato: ");
                        String novoContato = sc.nextLine();

                        System.out.print("Novo status: ");
                        String novoStatus = sc.nextLine();

                        sistema.atualizar(
                                idAtualizar,
                                novoContato,
                                novoStatus
                        );

                        break;

                    case 4:

                        System.out.print("ID do bombeiro: ");
                        int idExcluir = sc.nextInt();

                        sistema.excluir(idExcluir, usuario);
                        break;

                    case 5:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {

                System.out.println("Erro: digite um valor válido.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
