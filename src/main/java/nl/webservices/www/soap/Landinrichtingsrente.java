/**
 * Landinrichtingsrente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Landinrichtingsrente  implements java.io.Serializable {
    private java.lang.String bedrag;

    private java.lang.String eindjaar;

    public Landinrichtingsrente() {
    }

    public Landinrichtingsrente(
           java.lang.String bedrag,
           java.lang.String eindjaar) {
           this.bedrag = bedrag;
           this.eindjaar = eindjaar;
    }


    /**
     * Gets the bedrag value for this Landinrichtingsrente.
     * 
     * @return bedrag
     */
    public java.lang.String getBedrag() {
        return bedrag;
    }


    /**
     * Sets the bedrag value for this Landinrichtingsrente.
     * 
     * @param bedrag
     */
    public void setBedrag(java.lang.String bedrag) {
        this.bedrag = bedrag;
    }


    /**
     * Gets the eindjaar value for this Landinrichtingsrente.
     * 
     * @return eindjaar
     */
    public java.lang.String getEindjaar() {
        return eindjaar;
    }


    /**
     * Sets the eindjaar value for this Landinrichtingsrente.
     * 
     * @param eindjaar
     */
    public void setEindjaar(java.lang.String eindjaar) {
        this.eindjaar = eindjaar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Landinrichtingsrente)) return false;
        Landinrichtingsrente other = (Landinrichtingsrente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bedrag==null && other.getBedrag()==null) || 
             (this.bedrag!=null &&
              this.bedrag.equals(other.getBedrag()))) &&
            ((this.eindjaar==null && other.getEindjaar()==null) || 
             (this.eindjaar!=null &&
              this.eindjaar.equals(other.getEindjaar())));
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
        if (getBedrag() != null) {
            _hashCode += getBedrag().hashCode();
        }
        if (getEindjaar() != null) {
            _hashCode += getEindjaar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Landinrichtingsrente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Landinrichtingsrente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bedrag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bedrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eindjaar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "eindjaar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
