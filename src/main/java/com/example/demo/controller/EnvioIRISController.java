package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EnvioIRISDTO;
import com.example.demo.dto.EventoIRISDTO;
import com.example.demo.dto.EventosEnvioIRISDTO;
import com.example.demo.dto.MensajeIRISDTO;
import com.example.demo.service.EnvioService;

@RestController
@RequestMapping("/transform_envio")
public class EnvioIRISController {

	@Autowired
	private EnvioService service;

	@RequestMapping(value = "/envio_to_xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> transformBultoToXML() throws JAXBException {
		MensajeIRISDTO mensaje = new MensajeIRISDTO();
		mensaje.setClaseMensaje(2);
		mensaje.setFecha(new Date());
		mensaje.setNummsg(105964544);
		mensaje.setTipoElemento(1);
		mensaje.setVersion(1);

		EnvioIRISDTO envio = new EnvioIRISDTO();
		envio.setAltura(0.130);
		envio.setAlturaCert("S");
		envio.setAnchura(0.130);
		envio.setCodAplicacion(94);
		envio.setIdAdmision("PQ44440200054940135001K");
		envio.setIdAdmisionForzado("N");
		envio.setInternacional("N");
		envio.setLongitud(0.140);
		envio.setRegManual("N");
		envio.setUnidadAdmision(2812796);
		envio.setUnidadMedidaAltura("MTR");
		envio.setUnidadMedidaAnchura("MTR");
		envio.setUnidadMedidaLongitud("MTR");

		EventosEnvioIRISDTO eventos = new EventosEnvioIRISDTO();
		List<EventoIRISDTO> listaEventos = new ArrayList<EventoIRISDTO>();
		EventoIRISDTO evento = new EventoIRISDTO();
		evento.setFechaHora(new Date());
		listaEventos.add(evento);
		listaEventos.add(evento);
		eventos.setEventos(listaEventos);
		
		envio.setEventosEnvio(eventos);
		mensaje.setEnvio(envio);


		String result = service.transformEnvioToXML(mensaje);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/xml_to_envio", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MensajeIRISDTO> transformXMLToBulto() throws FileNotFoundException, JAXBException {
		return new ResponseEntity<MensajeIRISDTO>(service.transformXMLToEnvio(), HttpStatus.OK);
	}
}
