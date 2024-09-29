public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto){
        super(nome, nasc, salario);
        this.projeto = projeto;
    }
    public String informarProjeto() {
        return String.format("Gerente %s está gerenciando o projeto: %s", super.nome, projeto);
    }
}
