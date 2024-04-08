import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private String rg;
    private String cpf;
    private String endereco;
    private String naturalidade;
    private double salario;
    private String profissao;
    private String grauInstrucao;
    private int matricula;

    public Funcionario(String nome, LocalDate dataNascimento, String rg, String cpf, String endereco,
                       String naturalidade, double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void cadastrar(String nome, LocalDate dataNascimento, String rg, String cpf, String endereco,
                          String naturalidade, double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void alterar(String nome, LocalDate dataNascimento, String rg, String cpf, String endereco,
                        String naturalidade, double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Funcionario meuFuncionario = new Funcionario("João da Silva", LocalDate.of(1985, 5, 15), "1234567", "987654321",
                "Rua ABC, 123", "São Paulo", 3000.0, "Engenheiro", "Superior Completo", 1001);
        meuFuncionario.imprimirDados();
    }
}
