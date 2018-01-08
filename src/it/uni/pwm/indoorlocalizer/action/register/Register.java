package it.uni.pwm.indoorlocalizer.action.register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.model.dao.UtenteDaoFactory;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

public class Register extends ActionSupport {

		private static Logger log= LogManager.getLogger();
		private static final long serialVersionUID = 1L;
		private Utente utente;
			
		public String execute(){
			
			if(UtenteDaoFactory.getDAO().exist(utente.getEmail())!=null) {
				log.debug("email esiste");
				addFieldError("utente.email", "email esistente");
				return INPUT;
			}
			
			utente.setAbilitato((byte) 1);
			UtenteDaoFactory.getDAO().create(utente);
			return SUCCESS;
		}
			 
		public void validate(){
			if( utente.getNome().isEmpty()){
				this.addFieldError("utente.nome",this.getText("utente.nome"));
			}
			if( utente.getPwd().isEmpty()){
				this.addFieldError("nome", "inserire una pwd.");
			}
		}

		public Utente getUtente() {
			return utente;
		}
		public void setUtente(Utente utente) {
			this.utente = utente;
		}
		public Utente getModel() {
			return utente;
		}
		
}
