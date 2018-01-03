package it.uni.pwm.indoorlocalizer.model.dao;

public class StanzaDaoFactory {

	
private static StanzaDao dao= null;
	
	private StanzaDaoFactory() {
	
	}
	public static synchronized StanzaDao getDAO() {
	    if ( dao == null ) {
	    	dao = new StanzaHome();
	    }
	    return dao;
	  }
}
