package com.example.demo.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EventosEnvioIRISDTO {
	
	private List<EventoIRISDTO> eventos;

	public List<EventoIRISDTO> getEventos() {
		return eventos;
	}
	@XmlElement(name = "evento")
	public void setEventos(List<EventoIRISDTO> eventos) {
		this.eventos = eventos;
	}

}
