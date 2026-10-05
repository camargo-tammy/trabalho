public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Portas: " + this.quantidadePortas);
    }
}