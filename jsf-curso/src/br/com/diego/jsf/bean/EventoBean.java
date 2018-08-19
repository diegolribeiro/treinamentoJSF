package br.com.diego.jsf.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.diego.dfu.EventoBO;
import br.com.diego.javaBean.Evento;
import br.com.diego.javaBean.TipoEvento;

@ViewScoped
@ManagedBean
public class EventoBean {

	private TipoEvento tipoEvento = new TipoEvento();
	private Evento evento = new Evento();
	private EventoBO bo = new EventoBO();
	private List<TipoEvento> tiposEventos = null; 
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	public List<TipoEvento> listarTipoEventos() {
		return bo.listaEventos();
	}
	
	
	public void gravarEvento() {
		System.out.println("Gravando Evento");
	}
	
	public void gravarTipoEvento() {
		bo.cadastraTipoEvento(tipoEvento);
		System.out.println("Gravando tipo Evento");
		FacesContext.getCurrentInstance().addMessage("idTipoEvento", new FacesMessage("Evento: " + tipoEvento.getDescricaoEvento() + " cadastrado com sucesso"));
		tipoEvento = new TipoEvento();
	}

	public List<TipoEvento> getTiposEventos() {
		this.tiposEventos = bo.listaEventos();
		return tiposEventos;
	}
	
	public void validaValor(FacesContext fc, UIComponent component, Object value) throws ValidatorException{
		String valor = value.toString();
		if (valor.length() > 40) {
			
			throw new ValidatorException(new FacesMessage("Valor maior que 40 caracteres"));
		}
	}


}

