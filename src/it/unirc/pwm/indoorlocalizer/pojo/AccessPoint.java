package it.unirc.pwm.indoorlocalizer.pojo;

public class AccessPoint {

	private String mac;
	private String ssid;
	private int canale;
	
	public AccessPoint() {}
	
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public int getCanale() {
		return canale;
	}

	public void setCanale(int canale) {
		this.canale = canale;
	}
	
	
	
	
}
