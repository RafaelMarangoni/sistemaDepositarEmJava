package br.exercicios.exercicios2;

public class Conta {
    private int numeroConta;
    private int saldo = 0;
    private Clientes titular;

    public Conta(int numeroConta, int saldo, Clientes titular){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.titular = titular;

    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {

        this.numeroConta = numeroConta;
    }

    public void values2(){
        System.out.println(getNumeroConta());
        System.out.println(getSaldo());
        titular.getValues();
    }

    public int depostiar(int deposito){
        int Saldo = getSaldo();
        setSaldo(saldo + deposito);
        return getSaldo();
    }

    public static void main(String[] args) {

     Clientes eu = new Clientes("Rafao","Marangoni");
     Conta minhaConta = new Conta(10232, 0, eu);

     eu.getValues();

     minhaConta.depostiar(10);
     minhaConta.values2();


    }

}
