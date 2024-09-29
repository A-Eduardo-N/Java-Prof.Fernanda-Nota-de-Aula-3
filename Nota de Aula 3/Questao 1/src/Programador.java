public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }
    public String informarLinguagem() {
        return String.format("Programadors %s trabalha com linguagem: %s", super.nome, linguagem);
    }
}
