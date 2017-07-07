/**
 * KadasterEigendomsBerichtDocumentPerceelResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterEigendomsBerichtDocumentPerceelResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.BerichtObjectDocumentResultaat berichtobjectresultaat;

    public KadasterEigendomsBerichtDocumentPerceelResponseType() {
    }

    public KadasterEigendomsBerichtDocumentPerceelResponseType(
           nl.webservices.www.soap.BerichtObjectDocumentResultaat berichtobjectresultaat) {
           this.berichtobjectresultaat = berichtobjectresultaat;
    }


    /**
     * Gets the berichtobjectresultaat value for this KadasterEigendomsBerichtDocumentPerceelResponseType.
     * 
     * @return berichtobjectresultaat
     */
    public nl.webservices.www.soap.BerichtObjectDocumentResultaat getBerichtobjectresultaat() {
        return berichtobjectresultaat;
    }


    /**
     * Sets the berichtobjectresultaat value for this KadasterEigendomsBerichtDocumentPerceelResponseType.
     * 
     * @param berichtobjectresultaat
     */
    public void setBerichtobjectresultaat(nl.webservices.www.soap.BerichtObjectDocumentResultaat berichtobjectresultaat) {
        this.berichtobjectresultaat = berichtobjectresultaat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterEigendomsBerichtDocumentPerceelResponseType)) return false;
        KadasterEigendomsBerichtDocumentPerceelResponseType other = (KadasterEigendomsBerichtDocumentPerceelResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.berichtobjectresultaat==null && other.getBerichtobjectresultaat()==null) || 
             (this.berichtobjectresultaat!=null &&
              this.berichtobjectresultaat.equals(other.getBerichtobjectresultaat())));
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
        if (getBerichtobjectresultaat() != null) {
            _hashCode += getBerichtobjectresultaat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterEigendomsBerichtDocumentPerceelResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterEigendomsBerichtDocumentPerceelResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("berichtobjectresultaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "berichtobjectresultaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BerichtObjectDocumentResultaat"));
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
