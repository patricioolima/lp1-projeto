/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class Titulacao implements Serializable {
    // Atributos
    // Obs: varíavel tipo pode ser somente: Bacharel / Licenciado / Tecnólogo
    private int anoConclusao;
    private String tipo, area, instituicao, cidade, estado;
    
    @Override
    public String toString() {
        // Formato desejado: (Ano Conclusão) Bacharel/Lincenciado/Tecnólogo em ____ . Nome da Instituição. Cidade, UF.
        return "(" + anoConclusao + ") " + tipo + " em " + area + ". " + instituicao + ". " + cidade + ", " + estado + ".";
    }
    
    // Boilerplate
    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
