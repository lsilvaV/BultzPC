package br.com.bultzpc.model;

public class Pedido {
    
    private String cpfCliente, categoria, produto;
    private int quantidade, idProduto;
    
    // Construtor
    public Pedido(String cpfCliente, String categoria, String produto, int quantidade, int idProduto) {
        this.cpfCliente = cpfCliente;
        this.categoria = categoria;
        this.produto = produto;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }

    // ToString
    @Override
    public String toString() {
        return "Pedido{" + "cpfCliente=" + cpfCliente + ", categoria=" + categoria + ", produto=" + produto + '}';
    }
    @Override
    
    // Equals e HashCode
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.quantidade;
        hash = 19 * hash + this.idProduto;
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
        final Pedido other = (Pedido) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return this.idProduto == other.idProduto;
    }

    
    // Getters e Setters
    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
}
