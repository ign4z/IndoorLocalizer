package it.uni.pwm.indoorlocalizer.model.dao;

public class UtenteDaoFactory {
	
	private static UtenteDao dao= null;
	
	private UtenteDaoFactory() {
	
	}
	public static synchronized UtenteDao getDAO() {
	    if ( dao == null ) {
	    	dao = new UtenteHome();
	    }
	    return dao;
	  }

}
