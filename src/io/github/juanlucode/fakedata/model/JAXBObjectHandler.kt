// http://techgarage.io/index.php/2017/01/07/jaxb-with-kotlin/

package io.github.juanlucode.fakedata.model

import java.io.File
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller

class JAXBObjectHandler {
    companion object { // equivalent to static methods in Java
	    @JvmStatic
        fun <T> cargar(clase: Class<T>, xmlFile: File): T?{
	        
	        val jaxbContext =JAXBContext.newInstance(clase)
	        val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
	        
	        return jaxbUnmarshaller.unmarshal(xmlFile) as T?
	    }
 
   	    @JvmStatic
        fun salvar(objeto: Any, xmlFile: File): Boolean{
	        var ok: Boolean = true
	        try{
	            val jaxbContext = JAXBContext.newInstance(objeto.javaClass)
	            val jaxbMarshaller = jaxbContext.createMarshaller()
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            jaxbMarshaller.marshal(objeto, xmlFile)
	        } catch (ex: JAXBException){
	            ex.printStackTrace()
	            ok = false
	        }
	        return ok
	    }
    } 
   
}