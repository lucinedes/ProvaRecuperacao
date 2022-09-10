package Cadastro;

import javax.swing.Spring;

public class EquipeVenda extends Vendedor {
   
    private Spring nome;

    public EquipeVenda(Spring nome) {
        this.nome = nome;
    }

    public Spring getNome() {
        return nome;
    }

    public void setNome(Spring nome) {
        this.nome = nome;
    }
}
