// default package
// Generated 3-nov-2017 12.16.15 by Hibernate Tools 5.2.5.Final

/**
 * Utente generated by hbm2java
 */
public class Utente implements java.io.Serializable {

	private String email;
	private String nome;
	private String cognome;
	private String pwd;
	private byte abilitato;

	public Utente() {
	}

	public Utente(String email, String nome, String cognome, String pwd, byte abilitato) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.abilitato = abilitato;
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

	public byte getAbilitato() {
		return this.abilitato;
	}

	public void setAbilitato(byte abilitato) {
		this.abilitato = abilitato;
	}

}
