package it.uni.pwm.indoorlocalizer.model.dao;

import it.uni.pwm.indoorlocalizer.model.pojo.Campus;

public interface CampusDao {
		
		public int create(Campus c);
		public java.util.List<Campus> retrive();
		public boolean update(Campus c);
		public boolean delete(Campus c);


}
