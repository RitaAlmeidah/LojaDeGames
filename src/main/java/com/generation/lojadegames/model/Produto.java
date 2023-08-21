package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo titulo é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo titulo deve conter no mínimo 03 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo descricao é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo descricao deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String descricao;
	
	@NotBlank(message = "O atributo console é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo console deve conter no mínimo 05 e no máximo 100 caracteres")
	private String console;
	
	@NotNull(message = "O atributo quantidade é obrigatório!")
	@Size(min = 1, max = 1000, message = "O atributo quantidade deve conter no mínimo 1 e no máximo 1000 caracteres")
	private Integer quantidade;
	
	@NotNull(message = "Preço é obrigatório!")
    @Size(message = "O preço deve ser maior do que zero!")
    private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

