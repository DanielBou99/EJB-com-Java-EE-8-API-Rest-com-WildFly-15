package br.com.alura.timer;

import java.util.List;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;

import br.com.alura.business.AgendamentoEmailBusiness;
import br.com.alura.entity.AgendamentoEmail;

@Singleton /* Não deixar uma nova Task iniciar enquanto uma anterior está sendo executada */
public class AgendamentoEmailTimer {
	
	@Inject
	private AgendamentoEmailBusiness agendamentoEmailBusiness;
	
	@Schedule(hour="*", minute = "*")
	public void enviarEmailsAgendados() {
		System.out.println("Enviar Emails Timer");
		List<AgendamentoEmail> agendamentoEmails = agendamentoEmailBusiness.listarAgendamentosEmailNaoEnviados();
		
		agendamentoEmails
		.stream()
		.forEach(agendamentoEmail -> agendamentoEmailBusiness.enviarEmail(agendamentoEmail));
	}

}
