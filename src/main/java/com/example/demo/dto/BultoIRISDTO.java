package com.example.demo.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "bulto")
@XmlType(propOrder = { "nummsg", "version", "fecha", "claseMensaje", "tipoElemento", "codAplicacion", "internacional",
		"idAdmision", "unidadAdmision", "regManual", "idAdmisionForzado", "longitud", "unidadMedidaLongitud", "anchura",
		"unidadMedidaAnchura", "altura", "unidadMedidaAltura", "alturaCert", "fechaHora" })
public class BultoIRISDTO {

	private Integer nummsg;
	private Integer version;
	private Date fecha;
	private Integer claseMensaje;
	private Integer tipoElemento;
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
	private Date fechaHora;

}
