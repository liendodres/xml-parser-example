package com.example.demo.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "evento")
@XmlType(propOrder = { "fechaHora" })
public class EventoIRISDTO {

	private Date fechaHora;

	public Date getFechaHora() {
		return fechaHora;
	}
	@XmlAttribute
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	
}
