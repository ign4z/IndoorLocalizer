package it.uni.pwm.indoorlocalizer.model.pojo;
// default package
// Generated 8-nov-2017 11.08.49 by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Utente generated by hbm2java
 */
public class Utente implements java.io.Serializable {

	private Integer id;
	private String email;
	private String nome;
	private String cognome;
	private String pwd;
	private int abilitato;
	private Set edificios = new HashSet(0);
	private Set aps = new HashSet(0);
	private Set campuses = new HashSet(0);
	private Set stanzas = new HashSet(0);
	private Set notifiches = new HashSet(0);
	private Set informazionis = new HashSet(0);

	public Utente() {
	}

	public Utente(String email, String nome, String cognome, String pwd, int abilitato) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.abilitato = abilitato;
	}

	public Utente(String email, String nome, String cognome, String pwd, int abilitato, Set edificios, Set aps,
			Set campuses, Set stanzas, Set notifiches, Set informazionis) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.abilitato = abilitato;
		this.edificios = edificios;
		this.aps = aps;
		this.campuses = campuses;
		this.stanzas = stanzas;
		this.notifiches = notifiches;
		this.informazionis = informazionis;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAbilitato() {
		return this.abilitato;
	}

	public void setAbilitato(int abilitato) {
		this.abilitato = abilitato;
	}

	public Set getEdificios() {
		return this.edificios;
	}

	public void setEdificios(Set edificios) {
		this.edificios = edificios;
	}

	public Set getAps() {
		return this.aps;
	}

	public void setAps(Set aps) {
		this.aps = aps;
	}

	public Set getCampuses() {
		return this.campuses;
	}

	public void setCampuses(Set campuses) {
		this.campuses = campuses;
	}

	public Set getStanzas() {
		return this.stanzas;
	}

	public void setStanzas(Set stanzas) {
		this.stanzas = stanzas;
	}

	public Set getNotifiches() {
		return this.notifiches;
	}

	public void setNotifiches(Set notifiches) {
		this.notifiches = notifiches;
	}

	public Set getInformazionis() {
		return this.informazionis;
	}

	public void setInformazionis(Set informazionis) {
		this.informazionis = informazionis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abilitato;
		result = prime * result + ((aps == null) ? 0 : aps.hashCode());
		result = prime * result + ((campuses == null) ? 0 : campuses.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((edificios == null) ? 0 : edificios.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((informazionis == null) ? 0 : informazionis.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((notifiches == null) ? 0 : notifiches.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((stanzas == null) ? 0 : stanzas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
	
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}
	
	

}
