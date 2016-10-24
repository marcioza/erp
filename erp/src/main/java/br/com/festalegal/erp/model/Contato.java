package br.com.festalegal.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contatos")
public class Contato{
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	  
	//@NotNull
	private String nome; //nome completo ou razão social
	  
	//@NotNull
	private String nomeCurto; //apelido ou nome fantasia
	
	private String numeroCadastro;  //CPF ou CNPJ
	  
	Contato() { } //private package
	
	public Contato(String nome, String nomeCurto, String numeroCadastro) {
		this.nome = nome;
	    this.nomeCurto = nomeCurto;
	    this.numeroCadastro = numeroCadastro;
	}

	@Override
    public String toString() {
        return String.format("Customer[id=%d, nome='%s', nomeCurto='%s', numeroCadastro='%s']",id, nome, nomeCurto, numeroCadastro);
    }
}
