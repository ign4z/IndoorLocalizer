package it.uni.pwm.indoorlocalizer.model.dao;

public class CampusDaoFactory {
	
private static CampusDao dao= null;
	
	private CampusDaoFactory() {
	
	}
	public static synchronized CampusDao getDAO() {
	    if ( dao == null ) {
	    	dao = new CampusHome();
	    }
	    return dao;
	  }

}
