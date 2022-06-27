package com.example.demo.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "envio")
@XmlType(propOrder = { "codAplicacion", "internacional", "idAdmision", "unidadAdmision", "regManual",
		"idAdmisionForzado", "longitud", "unidadMedidaLongitud", "anchura", "unidadMedidaAnchura", "altura",
		"unidadMedidaAltura", "alturaCert", "eventosEnvio" })
public class EnvioIRISDTO {
 
	private Integer codAplicacion;
	private String internacional;
	private String idAdmision;
	private Integer unidadAdmision;
	private String regManual;
	private String idAdmisionForzado;
	private Double longitud;
	private String unidadMedidaLongitud;
	private Double anchura;
	private String unidadMedidaAnchura;
	private Double altura;
	private String unidadMedidaAltura;
	private String alturaCert;

	private EventosEnvioIRISDTO eventosEnvio;

	public Integer getCodAplicacion() {
		return codAplicacion;
	}

	@XmlAttribute
	public void setCodAplicacion(Integer codAplicacion) {
		this.codAplicacion = codAplicacion;
	}

	public String getInternacional() {
		return internacional;
	}

	@XmlAttribute
	public void setInternacional(String internacional) {
		this.internacional = internacional;
	}

	public String getIdAdmision() {
		return idAdmision;
	}

	@XmlAttribute
	public void setIdAdmision(String idAdmision) {
		this.idAdmision = idAdmision;
	}

	public Integer getUnidadAdmision() {
		return unidadAdmision;
	}

	@XmlAttribute
	public void setUnidadAdmision(Integer unidadAdmision) {
		this.unidadAdmision = unidadAdmision;
	}

	public String getRegManual() {
		return regManual;
	}

	@XmlAttribute
	public void setRegManual(String regManual) {
		this.regManual = regManual;
	}

	public String getIdAdmisionForzado() {
		return idAdmisionForzado;
	}

	@XmlAttribute
	public void setIdAdmisionForzado(String idAdmisionForzado) {
		this.idAdmisionForzado = idAdmisionForzado;
	}

	public Double getLongitud() {
		return longitud;
	}

	@XmlAttribute
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getUnidadMedidaLongitud() {
		return unidadMedidaLongitud;
	}

	@XmlAttribute
	public void setUnidadMedidaLongitud(String unidadMedidaLongitud) {
		this.unidadMedidaLongitud = unidadMedidaLongitud;
	}

	public Double getAnchura() {
		return anchura;
	}

	@XmlAttribute
	public void setAnchura(Double anchura) {
		this.anchura = anchura;
	}

	public String getUnidadMedidaAnchura() {
		return unidadMedidaAnchura;
	}

	@XmlAttribute
	public void setUnidadMedidaAnchura(String unidadMedidaAnchura) {
		this.unidadMedidaAnchura = unidadMedidaAnchura;
	}

	public Double getAltura() {
		return altura;
	}

	@XmlAttribute
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getUnidadMedidaAltura() {
		return unidadMedidaAltura;
	}

	@XmlAttribute
	public void setUnidadMedidaAltura(String unidadMedidaAltura) {
		this.unidadMedidaAltura = unidadMedidaAltura;
	}

	public String getAlturaCert() {
		return alturaCert;
	}

	@XmlAttribute
	public void setAlturaCert(String alturaCert) {
		this.alturaCert = alturaCert;
	}

	public EventosEnvioIRISDTO getEventosEnvio() {
		return eventosEnvio;
	}

	public void setEventosEnvio(EventosEnvioIRISDTO eventosEnvio) {
		this.eventosEnvio = eventosEnvio;
	}

}
