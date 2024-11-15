package br.com.bultzpc.model;

public class Produtos {
    
    private String nome, categoria, descricao;
    private float preco;
    
    // Construtor
    public Produtos(String nome, String categoria, String descricao, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    // ToString
    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", categoria=" + categoria + ", descricao=" + descricao + '}';
    }
    
    // Equals e HashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Float.floatToIntBits(this.preco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        return Float.floatToIntBits(this.preco) == Float.floatToIntBits(other.preco);
    }
    
    
    // Getters e Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
