package it.uni.pwm.indoorlocalizer.model;

public interface UtenteDao {
	
	public int create(Utente u);
	public java.util.List<Utente> retrive();
	public boolean update(Utente u );
	public boolean delete(Utente u);

}
