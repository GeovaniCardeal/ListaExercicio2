public class ContaPoupanca {
    private String nomeCorrentista;
    private String rg;
    private String cpf;
    private double saldo;
    private int numero;
    private int agencia;

    public ContaPoupanca(String nomeCorrentista, String rg, String cpf, double saldo, int numero, int agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, int numero, int agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, int numero, int agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo do correntista " + nomeCorrentista + ": R$" + saldo);
    }

    public static void main(String[] args) {
        ContaPoupanca minhaConta = new ContaPoupanca("João da Silva", "1234567", "987654321", 1000.0, 1234, 5678);
        minhaConta.imprimirSaldo();
    }
}
