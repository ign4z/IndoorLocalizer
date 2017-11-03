

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.unirc.pwm.indoorlocalizer.pojo.AccessPoint;
import it.unirc.pwm.indoorlocalizer.pojo.AccessPointDaoHbernate;
import it.unirc.pwm.indoorlocalizer.util.HibernateUtil;

public class MainTest {
	private static Logger log= LogManager.getLogger("");
	
	public static void main(String[] args) {
		
		AccessPoint a = new AccessPoint();
		a.setSsid("ssss");
		a.setMac("ca cac jua");
		a.setCanale(2);
		AccessPointDaoHbernate s = new AccessPointDaoHbernate();
		String id = s.create(a);
		System.out.println("ap ="+ id);
		HibernateUtil.close();

	}

}
