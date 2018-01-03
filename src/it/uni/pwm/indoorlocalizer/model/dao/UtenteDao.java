package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Utente;

public interface UtenteDao {
	
	public int create(Utente u);
	public java.util.List<Utente> retrive();
	public boolean update(Utente u );
	public boolean delete(Utente u);
	public Utente exist(String email);
	public Utente login(String email,String pwd);

}
