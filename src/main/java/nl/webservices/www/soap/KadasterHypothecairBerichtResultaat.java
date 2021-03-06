/**
 * KadasterHypothecairBerichtResultaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterHypothecairBerichtResultaat  implements java.io.Serializable {
    private nl.webservices.www.soap.KadasterOverzicht overzicht;

    private nl.webservices.www.soap.KadasterHypothecairBerichtObject hypothecairbericht;

    public KadasterHypothecairBerichtResultaat() {
    }

    public KadasterHypothecairBerichtResultaat(
           nl.webservices.www.soap.KadasterOverzicht overzicht,
           nl.webservices.www.soap.KadasterHypothecairBerichtObject hypothecairbericht) {
           this.overzicht = overzicht;
           this.hypothecairbericht = hypothecairbericht;
    }


    /**
     * Gets the overzicht value for this KadasterHypothecairBerichtResultaat.
     * 
     * @return overzicht
     */
    public nl.webservices.www.soap.KadasterOverzicht getOverzicht() {
        return overzicht;
    }


    /**
     * Sets the overzicht value for this KadasterHypothecairBerichtResultaat.
     * 
     * @param overzicht
     */
    public void setOverzicht(nl.webservices.www.soap.KadasterOverzicht overzicht) {
        this.overzicht = overzicht;
    }


    /**
     * Gets the hypothecairbericht value for this KadasterHypothecairBerichtResultaat.
     * 
     * @return hypothecairbericht
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtObject getHypothecairbericht() {
        return hypothecairbericht;
    }


    /**
     * Sets the hypothecairbericht value for this KadasterHypothecairBerichtResultaat.
     * 
     * @param hypothecairbericht
     */
    public void setHypothecairbericht(nl.webservices.www.soap.KadasterHypothecairBerichtObject hypothecairbericht) {
        this.hypothecairbericht = hypothecairbericht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterHypothecairBerichtResultaat)) return false;
        KadasterHypothecairBerichtResultaat other = (KadasterHypothecairBerichtResultaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overzicht==null && other.getOverzicht()==null) || 
             (this.overzicht!=null &&
              this.overzicht.equals(other.getOverzicht()))) &&
            ((this.hypothecairbericht==null && other.getHypothecairbericht()==null) || 
             (this.hypothecairbericht!=null &&
              this.hypothecairbericht.equals(other.getHypothecairbericht())));
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
        if (getOverzicht() != null) {
            _hashCode += getOverzicht().hashCode();
        }
        if (getHypothecairbericht() != null) {
            _hashCode += getHypothecairbericht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterHypothecairBerichtResultaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypothecairBerichtResultaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overzicht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "overzicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzicht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hypothecairbericht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hypothecairbericht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypothecairBerichtObject"));
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
