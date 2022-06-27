package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "mensaje")
@XmlType(propOrder = { "nummsg", "version", "fecha", "claseMensaje", "tipoElemento", "envio" })
public class MensajeIRISDTO {

	private Integer nummsg;
	private Integer version;
	private Date fecha;
	private Integer claseMensaje;
	private Integer tipoElemento;

	private EnvioIRISDTO envio;

	public Integer getNummsg() {
		return nummsg;
	}

	@XmlAttribute
	public void setNummsg(Integer nummsg) {
		this.nummsg = nummsg;
	}

	public Integer getVersion() {
		return version;
	}

	@XmlAttribute
	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getFecha() {
		return fecha;
	}

	@XmlAttribute
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getClaseMensaje() {
		return claseMensaje;
	}

	@XmlAttribute
	public void setClaseMensaje(Integer claseMensaje) {
		this.claseMensaje = claseMensaje;
	}

	public Integer getTipoElemento() {
		return tipoElemento;
	}

	@XmlAttribute
	public void setTipoElemento(Integer tipoElemento) {
		this.tipoElemento = tipoElemento;
	}

	public EnvioIRISDTO getEnvio() {
		return envio;
	}

	public void setEnvio(EnvioIRISDTO envio) {
		this.envio = envio;
	}

}
