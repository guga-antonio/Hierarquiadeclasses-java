package hierarquiadeclasses;

public class Assalariado extends Funcionario {

    private double salario;

    public Assalariado(String nome, String cpf, String endereco,
                       String telefone, String setor, double salario) {

        super(nome, cpf, endereco, telefone, setor);

        this.salario = salario;
    }

    @Override
    public double calculoSalario() {
        return salario;
    
    }
    @Override
    public void aplicarAumento(double percentual) { 
        salario = salario + (salario * percentual / 100);
                
 
}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}