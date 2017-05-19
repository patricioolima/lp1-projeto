/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Experiencia {
    // Atributos
    private Calendar dataInicio;
    private Calendar dataTermino;
    
    private String descricao, instituicao, cidade, estado;
    
    // Utilizado para mostrar os dados no JTable
    @Override
    public String toString() {
        // Formato desejado: (Data de Início – Data de Término) – Descrição da atividade – Instituição – Cidade, Estado.
        return "(" + dataInicio() + " - " + dataTermino() + ") - " + descricao + " - " + instituicao + " - " + cidade + ", " + estado + ".";
    }
    
    // Formata o Calendar em DD/MM/AAAA, utilizado no toString
    public String dataInicio() {
        return dataInicio.get(Calendar.DATE) + "/" + dataInicio.get(Calendar.MONTH) + "/" + dataInicio.get(Calendar.YEAR);
    }
    
    public String dataTermino() {
        return dataTermino.get(Calendar.DATE) + "/" + dataTermino.get(Calendar.MONTH) + "/" + dataTermino.get(Calendar.YEAR);
    }
    
    // Boilerplate
    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {  
        int dia = Integer.parseInt(dataInicio.substring(0, 2));
        int mes = Integer.parseInt(dataInicio.substring(3, 5));
        int ano = Integer.parseInt(dataInicio.substring(6));
        
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataInicio = c;
    }

    public Calendar getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        int dia = Integer.parseInt(dataTermino.substring(0, 2));
        int mes = Integer.parseInt(dataTermino.substring(3, 5));
        int ano = Integer.parseInt(dataTermino.substring(6));
        
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataTermino = c;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}