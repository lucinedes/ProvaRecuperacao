package Cadastro;

import java.sql.Date;

import javax.swing.Spring;

public class Funcionario {

    private Spring nome;
    private Date dataNascimento;
    private Spring cpf;
    private Endereco endereco;

    public Spring getNome() {
        return nome;
    }
    public void setNome(Spring nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Spring getCpf() {
        return cpf;
    }
    public void setCpf(Spring cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
