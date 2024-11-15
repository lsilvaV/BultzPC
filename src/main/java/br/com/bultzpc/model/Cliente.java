package br.com.bultzpc.model;

public class Cliente {
    private String cpf, nome, dataNasc, endereco, email;

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", dataNasc=" + dataNasc + ", endereco=" + endereco + ", email=" + email + '}';
    }


    public Cliente(String cpf, String nome, String dataNasc, String endereco, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
