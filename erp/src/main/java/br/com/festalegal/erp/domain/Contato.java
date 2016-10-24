package br.com.festalegal.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contatos")
public class Contato {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	  
	@NotNull
	private String nome;
	  
	@NotNull
	private String apelido;
	
	// Public methods
	  
	public Contato() { }
	
	public Contato(long id) { 
		this.id = id;
	}
	  
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public Contato(String nome, String apelido) {
		this.nome = nome;
	    this.apelido = apelido;
	}

	@Override
    public String toString() {
        return String.format("Customer[id=%d, nome='%s', apelido='%s']",id, nome, apelido);
    }
}
