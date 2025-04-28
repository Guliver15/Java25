// Definição da Classe Carro
public class Carro {
    // Atributos do carro
    String marca;
    String modelo;
    int ano;

    // Método para exibir informações do carro
    void exibirInformacoes() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("ANO: " + ano);
    }

    // Método para ligar o carro
    void ligar() {
        System.out.println(modelo + " ESTÁ LIGADO");
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro mercedes = new Carro();

        // Atribuindo detalhes às variáveis do objeto Carro
        mercedes.marca = "MERCEDES";
        mercedes.modelo = "AMG 63";
        mercedes.ano = 2023;

        // Chamando funções
        mercedes.exibirInformacoes();
        mercedes.ligar();
    }
}
