public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int numPortas;
    private String tipoCombustivel;
    private int quantidadeDisponivel;
    private double preco;
    private boolean completo;

    public Carro(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, 
                 String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, 
                          String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, 
                        String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void listar() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("Preço: " + preco);
        System.out.println("Completo: " + (completo ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro(1, "Toyota", "Preto", "Corolla", 2022, 4, "Gasolina", 10, 80000.0, true);
        meuCarro.listar();
    }
}
