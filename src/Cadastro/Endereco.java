package Cadastro;

import javax.swing.Spring;

public class Endereco  {
    private Spring rua;
    private int numero;
    private Spring bairro;
    private Spring cep;
    private Cidade cidade;
    
    public Spring getRua() {
        return rua;
    }
    public void setRua(Spring rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Spring getBairro() {
        return bairro;
    }
    public void setBairro(Spring bairro) {
        this.bairro = bairro;
    }
    public Spring getCep() {
        return cep;
    }
    public void setCep(Spring cep) {
        this.cep = cep;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", numero=" + numero + ", Bairro=" + bairro + ", Cidade=" + cidade + ", Cep="
                + cep + "]";
    }
   
}

