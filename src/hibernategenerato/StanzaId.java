// default package
// Generated 3-nov-2017 12.16.15 by Hibernate Tools 5.2.5.Final

/**
 * StanzaId generated by hbm2java
 */
public class StanzaId implements java.io.Serializable {

	private String nome;
	private String edificioNome;

	public StanzaId() {
	}

	public StanzaId(String nome, String edificioNome) {
		this.nome = nome;
		this.edificioNome = edificioNome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEdificioNome() {
		return this.edificioNome;
	}

	public void setEdificioNome(String edificioNome) {
		this.edificioNome = edificioNome;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StanzaId))
			return false;
		StanzaId castOther = (StanzaId) other;

		return ((this.getNome() == castOther.getNome()) || (this.getNome() != null && castOther.getNome() != null
				&& this.getNome().equals(castOther.getNome())))
				&& ((this.getEdificioNome() == castOther.getEdificioNome())
						|| (this.getEdificioNome() != null && castOther.getEdificioNome() != null
								&& this.getEdificioNome().equals(castOther.getEdificioNome())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNome() == null ? 0 : this.getNome().hashCode());
		result = 37 * result + (getEdificioNome() == null ? 0 : this.getEdificioNome().hashCode());
		return result;
	}

}
