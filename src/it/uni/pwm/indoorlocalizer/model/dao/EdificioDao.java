package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Edificio;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;

public interface EdificioDao {
	
	public int create(Edificio e);
	public java.util.List<Edificio> retrive();
	public boolean update(Edificio e );
	public boolean delete(Edificio e);

}
