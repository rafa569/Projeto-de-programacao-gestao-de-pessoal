/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.pessoal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class SistemaGestão {

    private ArrayList<Bombeiro> listaBombeiros;

    public SistemaGestão() {
        listaBombeiros = new ArrayList<>();
    }

    public void cadastrar(Bombeiro bombeiro) {

        for (Bombeiro b : listaBombeiros) {

            if (b.getCpf().equals(bombeiro.getCpf())) {
                System.out.println("CPF já cadastrado!");
                return;
            }

            if (b.getMatricula().equals(bombeiro.getMatricula())) {
                System.out.println("Matrícula já cadastrada!");
                return;
            }
        }

        listaBombeiros.add(bombeiro);
        System.out.println("Bombeiro cadastrado com sucesso!");
    }

    public void consultar() {

        if (listaBombeiros.isEmpty()) {
            System.out.println("Nenhum bombeiro cadastrado.");
            return;
        }

        for (Bombeiro b : listaBombeiros) {
            System.out.println(b);
            System.out.println("------------------");
        }
    }

    public void atualizar(int id, String novoContato, String novoStatus) {

        for (Bombeiro b : listaBombeiros) {

            if (b.getId() == id) {

                b.setContato(novoContato);
                b.setStatus(novoStatus);

                System.out.println("Atualização realizada!");
                return;
            }
        }

        System.out.println("Bombeiro não encontrado.");
    }

    public void excluir(int id, Usuário usuario) {

        if (!(usuario instanceof Supervisor)) {
            System.out.println("Apenas supervisor pode excluir!");
            return;
        }

        for (Bombeiro b : listaBombeiros) {

            if (b.getId() == id) {

                listaBombeiros.remove(b);

                System.out.println("Bombeiro removido!");
                return;
            }
        }

        System.out.println("Bombeiro não encontrado.");
    }
}
