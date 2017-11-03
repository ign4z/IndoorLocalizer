package it.unirc.pwm.indoorlocalizer.pojo;


public interface AccessPointDao {
	
	public String create(AccessPoint ap);
	public java.util.List<AccessPoint> retrive();
	public boolean update(AccessPoint ap);
	public boolean delete(AccessPoint ap);

}
