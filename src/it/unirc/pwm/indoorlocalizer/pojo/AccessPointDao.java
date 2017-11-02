package it.unirc.pwm.indoorlocalizer.pojo;


public interface AccessPointDao {
	
	public int create(AccessPoint ap);
	public java.util.List<AccessPoint> retrive();
	public boolean update(AccessPoint ap);
	public boolean delete(AccessPoint ap);

}
