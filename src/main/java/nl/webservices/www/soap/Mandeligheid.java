/**
 * Mandeligheid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Mandeligheid  implements java.io.Serializable {
    private nl.webservices.www.soap.KadastraleAanduidingLijst mandelige_percelen;

    private nl.webservices.www.soap.KadastraleAanduidingLijst hoofd_percelen;

    public Mandeligheid() {
    }

    public Mandeligheid(
           nl.webservices.www.soap.KadastraleAanduidingLijst mandelige_percelen,
           nl.webservices.www.soap.KadastraleAanduidingLijst hoofd_percelen) {
           this.mandelige_percelen = mandelige_percelen;
           this.hoofd_percelen = hoofd_percelen;
    }


    /**
     * Gets the mandelige_percelen value for this Mandeligheid.
     * 
     * @return mandelige_percelen
     */
    public nl.webservices.www.soap.KadastraleAanduidingLijst getMandelige_percelen() {
        return mandelige_percelen;
    }


    /**
     * Sets the mandelige_percelen value for this Mandeligheid.
     * 
     * @param mandelige_percelen
     */
    public void setMandelige_percelen(nl.webservices.www.soap.KadastraleAanduidingLijst mandelige_percelen) {
        this.mandelige_percelen = mandelige_percelen;
    }


    /**
     * Gets the hoofd_percelen value for this Mandeligheid.
     * 
     * @return hoofd_percelen
     */
    public nl.webservices.www.soap.KadastraleAanduidingLijst getHoofd_percelen() {
        return hoofd_percelen;
    }


    /**
     * Sets the hoofd_percelen value for this Mandeligheid.
     * 
     * @param hoofd_percelen
     */
    public void setHoofd_percelen(nl.webservices.www.soap.KadastraleAanduidingLijst hoofd_percelen) {
        this.hoofd_percelen = hoofd_percelen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mandeligheid)) return false;
        Mandeligheid other = (Mandeligheid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mandelige_percelen==null && other.getMandelige_percelen()==null) || 
             (this.mandelige_percelen!=null &&
              this.mandelige_percelen.equals(other.getMandelige_percelen()))) &&
            ((this.hoofd_percelen==null && other.getHoofd_percelen()==null) || 
             (this.hoofd_percelen!=null &&
              this.hoofd_percelen.equals(other.getHoofd_percelen())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMandelige_percelen() != null) {
            _hashCode += getMandelige_percelen().hashCode();
        }
        if (getHoofd_percelen() != null) {
            _hashCode += getHoofd_percelen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mandeligheid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Mandeligheid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandelige_percelen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mandelige_percelen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduidingLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoofd_percelen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hoofd_percelen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduidingLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
