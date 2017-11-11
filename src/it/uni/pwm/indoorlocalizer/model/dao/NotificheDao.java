package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Notifiche;

public interface NotificheDao {
	
	public int create(Notifiche n);
	public java.util.List<Notifiche> retrive();
	public boolean update(Notifiche n );
	public boolean delete(Notifiche n);
}
