package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Stanza;

public interface StanzaDao {
	
	public int create(Stanza s);
	public java.util.List<Stanza> retrive();
	public boolean update(Stanza s );
	public boolean delete(Stanza s);

}
