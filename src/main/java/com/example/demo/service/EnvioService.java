package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BultoIRISDTO;
import com.example.demo.dto.MensajeIRISDTO;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EnvioService {

	public String transformEnvioToXML(MensajeIRISDTO mensaje) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(MensajeIRISDTO.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(mensaje, new File("./Envio.xml"));
		
		StringWriter sw = new StringWriter();
		mar.marshal(mensaje, sw);
	 
	    String result = sw.toString();
	    log.info(result);
	    return result;
	}
	
	public MensajeIRISDTO transformXMLToEnvio() throws FileNotFoundException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(MensajeIRISDTO.class);
		MensajeIRISDTO bulto = (MensajeIRISDTO) context.createUnmarshaller().unmarshal(new FileReader("./Envio.xml"));
	    log.info(bulto);
	    
	    return bulto;
	}

}
