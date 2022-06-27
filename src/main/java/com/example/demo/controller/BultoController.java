package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.util.Date;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BultoIRISDTO;
import com.example.demo.service.BultoService;

@RestController
@RequestMapping("/transform")
public class BultoController {
	
	@Autowired
	private BultoService service;
	
	@RequestMapping(value="/bulto_to_xml", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<String> transformBultoToXML() throws JAXBException {
		BultoIRISDTO bulto = new BultoIRISDTO();
        bulto.setAltura(0.130);
        bulto.setAlturaCert("S");
        bulto.setAnchura(0.130);
        bulto.setClaseMensaje(2);
        bulto.setCodAplicacion(94);
        bulto.setFecha(new Date());
        bulto.setFechaHora(new Date());
        bulto.setIdAdmision("PQ44440200054940135001K");
        bulto.setIdAdmisionForzado("N");
        bulto.setInternacional("N");
        bulto.setLongitud(0.140);
        bulto.setNummsg(105964544);
        bulto.setRegManual("N");
        bulto.setTipoElemento(1);
        bulto.setUnidadAdmision(2812796);
        bulto.setUnidadMedidaAltura("MTR");
        bulto.setUnidadMedidaAnchura("MTR");
        bulto.setUnidadMedidaLongitud("MTR");
        bulto.setVersion(1);
        
        String result = service.transformBultoToXML(bulto);
        
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value="/xml_to_bulto", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BultoIRISDTO> transformXMLToBulto() throws FileNotFoundException, JAXBException {
		return new ResponseEntity<BultoIRISDTO>(service.transformXMLToBulto(), HttpStatus.OK);
	}
}
