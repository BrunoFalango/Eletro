package br.com.eletro.Electro.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Produto")
public class Produto {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long ID;
	 
	 @NotNull
	 private String nome;
	 
	 @NotNull
	 private BigDecimal preco;
	 
	 @NotNull
	 private BigDecimal quantidade;
	 
	 @NotNull
	 private String marca;
	 
	
	 public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
