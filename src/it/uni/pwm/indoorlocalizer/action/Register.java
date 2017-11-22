package it.uni.pwm.indoorlocalizer.action;

import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.model.pojo.Utente;

public class Register extends ActionSupport {

		private static final long serialVersionUID = 1L;
		private Utente utente;
			
		public String execute(){
			Utente utente = new Utente();
			
			
			
			return SUCCESS;
		}
		
		public Utente getUser() {
			return utente;
		}
		public void setUser(Utente utente) {
			this.utente = utente;
		}
		
		
		
		public void validate(){
			if( getNome().isEmpty()){
				this.addFieldError("name", "Real name is required.");
			}
			
		}

		private String getNome() {
			return utente.getNome();
		}
}
