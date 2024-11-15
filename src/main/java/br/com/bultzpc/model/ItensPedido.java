package br.com.bultzpc.model;

public class ItensPedido {
    
    private int id, pedidoId, produtoId, quantidade;
    private float preco;
    
    // Construtor
    public ItensPedido(int id, int pedidoId, int produtoId, int quantidade, float preco) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    // Equals e HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + this.pedidoId;
        hash = 53 * hash + this.produtoId;
        hash = 53 * hash + this.quantidade;
        hash = 53 * hash + Float.floatToIntBits(this.preco);
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
        final ItensPedido other = (ItensPedido) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.pedidoId != other.pedidoId) {
            return false;
        }
        if (this.produtoId != other.produtoId) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return Float.floatToIntBits(this.preco) == Float.floatToIntBits(other.preco);
    }


    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    

}
