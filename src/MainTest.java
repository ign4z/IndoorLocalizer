

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.unirc.pwm.indoorlocalizer.pojo.AccessPoint;
import it.unirc.pwm.indoorlocalizer.pojo.AccessPointDaoHbernate;
import it.unirc.pwm.indoorlocalizer.util.HibernateUtil;

public class MainTest {
	private static Logger log= LogManager.getLogger("");
	
	public static void main(String[] args) {
		log.fatal("fatal");
		log.error("error");
		log.debug("debug");
		log.warn("warn");
		log.trace("trace");
		
		AccessPoint a = new AccessPoint();
		a.setSsid("ssss");
		
		AccessPointDaoHbernate s = new AccessPointDaoHbernate();
		s.create(a);
		System.out.println("ap ="+a.getId());
		HibernateUtil.close();

	}

}
