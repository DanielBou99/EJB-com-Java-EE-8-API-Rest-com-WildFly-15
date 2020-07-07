package br.com.alura.timer;

import java.util.logging.Logger;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton /* N�o deixar uma nova Task iniciar enquanto uma anterior est� sendo executada */
public class AgendamentoEmailTimer {
	
	private static Logger logger = Logger.getLogger(AgendamentoEmailTimer.class.getName());
	
	@Schedule(hour="*", minute = "*")
	public void enviarEmailsAgendados() {
		
		logger.info("Rodou!");
	}

}
