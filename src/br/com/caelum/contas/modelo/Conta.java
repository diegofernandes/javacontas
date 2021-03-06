package br.com.caelum.contas.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Entity
//@Repository
//@Component
public class Conta {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//@NotEmpty(message= "{conta.descricao.vazia}")    
    //@Size(min = 5, max = 500, message="{conta.descricao.size}")	
//	@NotNull(message="{conta.descricao.vazia}") 
	@NotEmpty(message="{conta.descricao.vazia}")
    @Size(min=3, message="{conta.formulario.descricao}")
	private String descricao;

	private boolean paga;
	
	private double valor;
	
//	@DateTimeFormat(pattern="dd/MM/yyyy") //Spring com JDBC
	@Temporal(TemporalType.DATE)
	private Calendar dataPagamento;
	
	@Enumerated(EnumType.STRING)
	private TipoDaConta tipo;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public TipoDaConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDaConta tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}	
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
