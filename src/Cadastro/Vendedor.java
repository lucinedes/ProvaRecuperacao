package Cadastro;

public class Vendedor extends Funcionario{
 
   float Salario;
   
    private EquipeVenda equipeVenda;

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public EquipeVenda getEquipeVenda() {
        return equipeVenda;
    }

    public void setEquipeVenda(EquipeVenda equipeVenda) {
        this.equipeVenda = equipeVenda;
    }

}
