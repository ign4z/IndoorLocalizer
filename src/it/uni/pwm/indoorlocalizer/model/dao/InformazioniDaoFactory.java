package it.uni.pwm.indoorlocalizer.model.dao;

public class InformazioniDaoFactory {

private static InformazioniDao dao= null;
	
	private InformazioniDaoFactory() {
	
	}
	public static synchronized InformazioniDao getDAO() {
	    if ( dao == null ) {
	    	dao = new InformazioniHome();
	    }
	    return dao;
	  }
	
}
