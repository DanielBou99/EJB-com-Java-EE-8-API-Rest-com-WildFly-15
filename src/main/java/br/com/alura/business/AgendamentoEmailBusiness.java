package br.com.alura.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDao;
import br.com.alura.entity.AgendamentoEmail;

@Stateless /* Transformar a classe em EJB */
public class AgendamentoEmailBusiness {
	
	@Inject
	private AgendamentoEmailDao agendamentoEmailDao;
	
	public List<AgendamentoEmail> listarAgendamentosEmail() {		
		
		return agendamentoEmailDao.listarAgendamentosEmail();
	}
	
	public void salvarAgendamentoEmail(AgendamentoEmail agendamentoEmail) {
		
		agendamentoEmail.setEnviado(false);
		agendamentoEmailDao.salvarAgendamentoEmail(agendamentoEmail);
	}

}