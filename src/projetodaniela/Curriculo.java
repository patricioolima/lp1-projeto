/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import java.util.*;
import java.io.*;

/**
 *
 * @author aluno
 */
public class Curriculo implements Serializable {
    // Atributos
    private String nome, endereco, email, registroProfissional, publicacoes, fone, cpf;
    //private int fone, cpf;
    
    private ArrayList<Titulacao> titulacoes = new ArrayList<>();
    private ArrayList<Experiencia> experienciaDocente = new ArrayList<>();
    private ArrayList<Experiencia> experienciaRelevante = new ArrayList<>();
    
    // Métodos para manusear os ArrayLists
    public void addTitulacao(Titulacao t) {
        titulacoes.add(t);
    }
    
    public void addExperienciaDocente(Experiencia e) {
        experienciaDocente.add(e);
    }
    
    public void addExperienciaRelevante(Experiencia e) {
        experienciaRelevante.add(e);
    }
    
    public ArrayList<Titulacao> getTitulacoes() {
        return titulacoes;
    }
    
    public ArrayList<Experiencia> getExperienciaDocente() {
        return experienciaDocente;
    }
    
    public ArrayList<Experiencia> getExperienciaRelevante() {
        return experienciaRelevante;
    }
    
    public void setTitulacoes(ArrayList<Titulacao> titulacoes) {
        this.titulacoes = titulacoes;
    }

    public void setExperienciaDocente(ArrayList<Experiencia> experienciaDocente) {
        this.experienciaDocente = experienciaDocente;
    }

    public void setExperienciaRelevante(ArrayList<Experiencia> experienciaRelevante) {
        this.experienciaRelevante = experienciaRelevante;
    }
    
    // Boilerplate
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(String publicacoes) {
        this.publicacoes = publicacoes;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
