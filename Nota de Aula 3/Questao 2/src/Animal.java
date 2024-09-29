public class Animal {
    String caminha;
    private String nome;
    private String raca;

    public Animal() {
        this.caminha ="";
        this.nome = "";
        this.raca = "";
    }
    public Animal (String nome) {
        this.caminha ="";
        this.nome = nome;
        this.raca = "";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCaminha() {
        return caminha;
    }
    public void setCaminha(String caminha) {
        this.caminha = caminha;
    }

    public void caminha() {
    }
}
