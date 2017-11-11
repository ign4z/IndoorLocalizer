package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Ap;

public interface ApDao {

	public int create(Ap ap);
	public java.util.List<Ap> retrive();
	public boolean update(Ap ap);
	public boolean delete(Ap ap);
	
	
}
