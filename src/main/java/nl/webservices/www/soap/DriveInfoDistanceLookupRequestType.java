/**
 * DriveInfoDistanceLookupRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DriveInfoDistanceLookupRequestType  implements java.io.Serializable {
    private java.lang.String nbcodefrom;

    private java.lang.String nbcodeto;

    public DriveInfoDistanceLookupRequestType() {
    }

    public DriveInfoDistanceLookupRequestType(
           java.lang.String nbcodefrom,
           java.lang.String nbcodeto) {
           this.nbcodefrom = nbcodefrom;
           this.nbcodeto = nbcodeto;
    }


    /**
     * Gets the nbcodefrom value for this DriveInfoDistanceLookupRequestType.
     * 
     * @return nbcodefrom
     */
    public java.lang.String getNbcodefrom() {
        return nbcodefrom;
    }


    /**
     * Sets the nbcodefrom value for this DriveInfoDistanceLookupRequestType.
     * 
     * @param nbcodefrom
     */
    public void setNbcodefrom(java.lang.String nbcodefrom) {
        this.nbcodefrom = nbcodefrom;
    }


    /**
     * Gets the nbcodeto value for this DriveInfoDistanceLookupRequestType.
     * 
     * @return nbcodeto
     */
    public java.lang.String getNbcodeto() {
        return nbcodeto;
    }


    /**
     * Sets the nbcodeto value for this DriveInfoDistanceLookupRequestType.
     * 
     * @param nbcodeto
     */
    public void setNbcodeto(java.lang.String nbcodeto) {
        this.nbcodeto = nbcodeto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriveInfoDistanceLookupRequestType)) return false;
        DriveInfoDistanceLookupRequestType other = (DriveInfoDistanceLookupRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nbcodefrom==null && other.getNbcodefrom()==null) || 
             (this.nbcodefrom!=null &&
              this.nbcodefrom.equals(other.getNbcodefrom()))) &&
            ((this.nbcodeto==null && other.getNbcodeto()==null) || 
             (this.nbcodeto!=null &&
              this.nbcodeto.equals(other.getNbcodeto())));
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
        if (getNbcodefrom() != null) {
            _hashCode += getNbcodefrom().hashCode();
        }
        if (getNbcodeto() != null) {
            _hashCode += getNbcodeto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriveInfoDistanceLookupRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "driveInfoDistanceLookupRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcodefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcodefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcodeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcodeto"));
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
