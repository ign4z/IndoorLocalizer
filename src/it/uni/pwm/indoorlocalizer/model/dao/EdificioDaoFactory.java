package it.uni.pwm.indoorlocalizer.model.dao;

public class EdificioDaoFactory {
	
private static EdificioDao dao= null;
	
	private EdificioDaoFactory() {
	
	}
	public static synchronized EdificioDao getDAO() {
	    if ( dao == null ) {
	    	dao = new EdificioHome();
	    }
	    return dao;
	  }
	
}
