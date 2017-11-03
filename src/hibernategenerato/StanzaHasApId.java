// default package
// Generated 3-nov-2017 12.16.15 by Hibernate Tools 5.2.5.Final

/**
 * StanzaHasApId generated by hbm2java
 */
public class StanzaHasApId implements java.io.Serializable {

	private String stanzaNome;
	private String stanzaEdificioNome;
	private String apMac;

	public StanzaHasApId() {
	}

	public StanzaHasApId(String stanzaNome, String stanzaEdificioNome, String apMac) {
		this.stanzaNome = stanzaNome;
		this.stanzaEdificioNome = stanzaEdificioNome;
		this.apMac = apMac;
	}

	public String getStanzaNome() {
		return this.stanzaNome;
	}

	public void setStanzaNome(String stanzaNome) {
		this.stanzaNome = stanzaNome;
	}

	public String getStanzaEdificioNome() {
		return this.stanzaEdificioNome;
	}

	public void setStanzaEdificioNome(String stanzaEdificioNome) {
		this.stanzaEdificioNome = stanzaEdificioNome;
	}

	public String getApMac() {
		return this.apMac;
	}

	public void setApMac(String apMac) {
		this.apMac = apMac;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StanzaHasApId))
			return false;
		StanzaHasApId castOther = (StanzaHasApId) other;

		return ((this.getStanzaNome() == castOther.getStanzaNome()) || (this.getStanzaNome() != null
				&& castOther.getStanzaNome() != null && this.getStanzaNome().equals(castOther.getStanzaNome())))
				&& ((this.getStanzaEdificioNome() == castOther.getStanzaEdificioNome())
						|| (this.getStanzaEdificioNome() != null && castOther.getStanzaEdificioNome() != null
								&& this.getStanzaEdificioNome().equals(castOther.getStanzaEdificioNome())))
				&& ((this.getApMac() == castOther.getApMac()) || (this.getApMac() != null
						&& castOther.getApMac() != null && this.getApMac().equals(castOther.getApMac())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStanzaNome() == null ? 0 : this.getStanzaNome().hashCode());
		result = 37 * result + (getStanzaEdificioNome() == null ? 0 : this.getStanzaEdificioNome().hashCode());
		result = 37 * result + (getApMac() == null ? 0 : this.getApMac().hashCode());
		return result;
	}

}
