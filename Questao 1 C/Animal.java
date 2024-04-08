import java.time.LocalDate;

public class Animal {
    private String especie;
    private LocalDate dataNascimento;
    private String nome;
    private int numeroRegistro;
    private String localNascimento;

    public Animal(String especie, LocalDate dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void cadastrar(String especie, LocalDate dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, LocalDate dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void imprimirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }

    public static void main(String[] args) {

        Animal meuAnimal = new Animal("Leão", LocalDate.of(2015, 8, 20), "Simba", 12345, "África");
        meuAnimal.imprimirInformacoes();
    }
}

