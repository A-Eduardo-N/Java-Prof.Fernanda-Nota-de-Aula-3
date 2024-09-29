public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.setNome("Rex");
    cachorro.setRaca("Labrador");
    cachorro.caminha();
    cachorro.late();

    Gato gato = new Gato();
    gato.setNome("Miau");
    gato.setRaca("Siamês");
    gato.caminha();
    gato.mia();
}
