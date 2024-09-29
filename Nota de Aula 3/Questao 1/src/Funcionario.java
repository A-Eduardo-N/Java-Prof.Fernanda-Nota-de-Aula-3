public class Funcionario {
     String nome;
     String nasc;
    private double salario;

    public Funcionario(String nome, String nasc, double salario){
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }
    public String informarSalario(){
        return String.format("Salario de %s: R$ %.2f", nome, salario);
    }
    public String calcularIdade(int anoAtual) {
        int anoNasc = Integer.parseInt(nasc.split("-")[0]);
        int idade = anoAtual - anoNasc;
        return String.format("idade de %s: %d anos", nome, idade);
    }
}
