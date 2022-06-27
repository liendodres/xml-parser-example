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
public class BultoService {

	public String transformBultoToXML(BultoIRISDTO bulto) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(BultoIRISDTO.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(bulto, new File("./Bulto.xml"));
		
		StringWriter sw = new StringWriter();
		mar.marshal(bulto, sw);
	 
	    String result = sw.toString();
	    log.info(result);
	    return result;
	}
	
	public BultoIRISDTO transformXMLToBulto() throws FileNotFoundException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(BultoIRISDTO.class);
		BultoIRISDTO bulto = (BultoIRISDTO) context.createUnmarshaller().unmarshal(new FileReader("./Bulto.xml"));
	    log.info(bulto);
	    
	    return bulto;
	}

}
