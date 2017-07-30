//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2017.07.26 a las 04:38:50 PM CEST
//
package io.github.juanlucode.fakedata.model.countries


import java.util.ArrayList
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;sequence&gt;
 * &lt;element name="country" maxOccurs="unbounded"&gt;
 * &lt;complexType&gt;
 * &lt;complexContent&gt;
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 * &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 * &lt;/restriction&gt;
 * &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * &lt;/element&gt;
 * &lt;/sequence&gt;
 * &lt;/restriction&gt;
 * &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "countries")
class Countries {
    @XmlElement(required = true)
    //protected var country: List<Countries.Country>? = null
    protected var country: MutableList<Countries.Country>? = mutableListOf()

    /**
     * Gets the value of the country property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCountry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Countries.Country }
     *
     *
     */
    //fun getCountry(): List<Countries.Country>? {
    fun getCountryList():MutableList<Countries.Country>? {
        /*
        if (country == null) {
            country = ArrayList<Countries.Country>()
        }
 		*/
        return this.country
    }

    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     * &lt;complexContent&gt;
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     * &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     * &lt;/restriction&gt;
     * &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    class Country {
        /**
         * Obtiene el valor de la propiedad code.
         *
         * @return
         * possible object is
         * {@link String }
         *
         */
        /**
         * Define el valor de la propiedad code.
         *
         * @param value
         * allowed object is
         * {@link String }
         *
         */
        @XmlAttribute(name = "code")
        var code: String? = null
        /**
         * Obtiene el valor de la propiedad name.
         *
         * @return
         * possible object is
         * {@link String }
         *
         */
        /**
         * Define el valor de la propiedad name.
         *
         * @param value
         * allowed object is
         * {@link String }
         *
         */
        @XmlAttribute(name = "name")
        var name: String? = null
		
		override fun toString(): String{
			return "${this.code} - ${this.name}"
		}
    }
}