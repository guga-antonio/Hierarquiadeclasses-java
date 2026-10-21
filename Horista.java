package hierarquiadeclasses;

public class Horista extends Funcionario {

    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, String endereco,
                   String telefone, String setor,
                   double horasTrabalhadas, double valorHora) {

        super(nome, cpf, endereco, telefone, setor);

        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calculoSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void aplicarAumento(double percentual) {
        valorHora = valorHora + (valorHora * percentual / 100);
        
        
       
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}