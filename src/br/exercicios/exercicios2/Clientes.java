package br.exercicios.exercicios2;

public class Clientes {
    private String nome;
    private String sobreNome;

    public Clientes (String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;

    }

    public String getNome() {
        return nome;
    }

    public void setCNome(String nome) {
        nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {

        sobreNome = sobreNome;
    }

    public void getValues(){
        System.out.println(getNome());
        System.out.println(getSobreNome());

    }
}
