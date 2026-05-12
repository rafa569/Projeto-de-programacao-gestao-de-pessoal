/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.pessoal;

/**
 *
 * @author aluno
 */
public class Bombeiro {

    private int id;
    private String nome;
    private String cpf;
    private String matricula;
    private String dataNascimento;
    private String patente;
    private String especialidade;
    private String contato;
    private String status;

    public Bombeiro(int id, String nome, String cpf, String matricula,
            String dataNascimento, String patente,
            String especialidade, String contato, String status) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.patente = patente;
        this.especialidade = especialidade;
        this.contato = contato;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + "Nome: " + nome
                + "CPF: " + cpf
                + "Matrícula: " + matricula
                + "Nascimento: " + dataNascimento
                + "Patente: " + patente
                + "Especialidade: " + especialidade
                + "Contato: " + contato
                + "Status: " + status;
    }

}