/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.pessoal;

/**
 *
 * @author aluno
 */
public class Usuário {

    protected String login;
    protected String senha;
    protected String perfil;

    public Usuário(String login, String senha, String perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }
}