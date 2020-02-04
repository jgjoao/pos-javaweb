package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class Funcionario  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotEmpty
	private String nome;
	private String sexo;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date dtupdate;
	
	@Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
	private Date dtcriacao;
	
	
	public Date getDtupdate() {
		return dtupdate;
	}
	public void setDtupdate(Date dtupdate) {
		this.dtupdate = dtupdate;
	}
	public Date getDtcriacao() {
		return dtcriacao;
	}
	public void setDtcriacao(Date dtcriacao) {
		this.dtcriacao = dtcriacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	} 
	

}
