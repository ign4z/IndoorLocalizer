// default package
// Generated 3-nov-2017 12.16.15 by Hibernate Tools 5.2.5.Final

/**
 * Stanza generated by hbm2java
 */
public class Stanza implements java.io.Serializable {

	private StanzaId id;
	private Integer piano;
	private Integer informazioniId;

	public Stanza() {
	}

	public Stanza(StanzaId id) {
		this.id = id;
	}

	public Stanza(StanzaId id, Integer piano, Integer informazioniId) {
		this.id = id;
		this.piano = piano;
		this.informazioniId = informazioniId;
	}

	public StanzaId getId() {
		return this.id;
	}

	public void setId(StanzaId id) {
		this.id = id;
	}

	public Integer getPiano() {
		return this.piano;
	}

	public void setPiano(Integer piano) {
		this.piano = piano;
	}

	public Integer getInformazioniId() {
		return this.informazioniId;
	}

	public void setInformazioniId(Integer informazioniId) {
		this.informazioniId = informazioniId;
	}

}