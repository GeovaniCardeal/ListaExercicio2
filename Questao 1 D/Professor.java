import java.util.ArrayList;

public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private ArrayList<String> disciplinas;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, ArrayList<String> disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, ArrayList<String> disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, ArrayList<String> disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void alterarDescricaoDisciplina(int index, String descricao) {
        if (index >= 0 && index < disciplinas.size()) {
            disciplinas.set(index, descricao);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Salário: R$" + salario);
        System.out.println("Disciplinas: ");
        for (String disciplina : disciplinas) {
            System.out.println("- " + disciplina);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> disciplinas = new ArrayList<>();
        disciplinas.add("Matemática");
        disciplinas.add("Física");

        Professor meuProfessor = new Professor("João da Silva", "Doutorado", "Engenharia", 40, 5000.0, disciplinas);
        meuProfessor.imprimirDados();
        meuProfessor.alterarDescricaoDisciplina(0, "Cálculo");
        meuProfessor.imprimirDados();
    }
}
