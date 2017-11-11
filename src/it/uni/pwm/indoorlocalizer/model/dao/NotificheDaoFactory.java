package it.uni.pwm.indoorlocalizer.model.dao;

public class NotificheDaoFactory {

private static NotificheDao dao= null;
	
	private NotificheDaoFactory() {
	
	}
	public static synchronized NotificheDao getDAO() {
	    if ( dao == null ) {
	    	dao = new NotificheHome();
	    }
	    return dao;
	  }
}
