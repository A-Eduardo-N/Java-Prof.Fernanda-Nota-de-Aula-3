public class Main{
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", "1985-04-15", 8000.00, "Sistema de Gestão");
        System.out.println(gerente.informarSalario());
        System.out.println(gerente.calcularIdade(2023));
        System.out.println(gerente.informarProjeto());

        Programador programador = new Programador("Bob", "1990-06-22", 5000.00, "Python");
        System.out.println(programador.informarSalario());
        System.out.println(programador.calcularIdade(2023));
        System.out.println(programador.informarLinguagem());
    }
}