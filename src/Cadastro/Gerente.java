package Cadastro;

public class Gerente extends Funcionario{
    
    float Salario;

    public Gerente(float salario) {
        Salario = salario;
    }

    public void getSalario(float salario) {
        Salario = salario;
    }
}
