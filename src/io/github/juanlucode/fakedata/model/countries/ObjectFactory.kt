//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2017.07.26 a las 04:38:50 PM CEST
//
package io.github.juanlucode.fakedata.model.countries

import javax.xml.bind.annotation.XmlRegistry

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.github.juanlucode.xml.schema package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups. Factory methods for each of these are
 * provided in this class.
 *
 */
/**
 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.juanlucode.xml.schema
 *
 */
@XmlRegistry
class ObjectFactory {
    /**
     * Create an instance of {@link Countries }
     *
     */
    fun createCountries(): Countries? {
        return Countries()
    }

    /**
     * Create an instance of {@link Countries.Country }
     *
     */
    fun createCountriesCountry(): Countries.Country? {
        return Countries.Country()
    }
}