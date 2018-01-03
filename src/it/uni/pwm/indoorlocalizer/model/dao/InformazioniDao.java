package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Informazioni;

public interface InformazioniDao {
	
	public int create(Informazioni i);
	public java.util.List<Informazioni> retrive();
	public boolean update(Informazioni i );
	public boolean delete(Informazioni i );

}
