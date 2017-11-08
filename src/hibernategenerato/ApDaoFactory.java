package hibernategenerato;



public class ApDaoFactory {
	
	private static ApDao dao = null;
	  
	  private ApDaoFactory() {
		
	  }
	  
	  public static synchronized ApDao getDAO() {
	    if ( dao == null ) {
	    	dao = new ApHome();
	    }
	    return dao;
	  } 

}
