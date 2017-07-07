/**
 * VerenigingVanEigenaren.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class VerenigingVanEigenaren  implements java.io.Serializable {
    private java.lang.String naam;

    private java.lang.String bestuurder_id;

    public VerenigingVanEigenaren() {
    }

    public VerenigingVanEigenaren(
           java.lang.String naam,
           java.lang.String bestuurder_id) {
           this.naam = naam;
           this.bestuurder_id = bestuurder_id;
    }


    /**
     * Gets the naam value for this VerenigingVanEigenaren.
     * 
     * @return naam
     */
    public java.lang.String getNaam() {
        return naam;
    }


    /**
     * Sets the naam value for this VerenigingVanEigenaren.
     * 
     * @param naam
     */
    public void setNaam(java.lang.String naam) {
        this.naam = naam;
    }


    /**
     * Gets the bestuurder_id value for this VerenigingVanEigenaren.
     * 
     * @return bestuurder_id
     */
    public java.lang.String getBestuurder_id() {
        return bestuurder_id;
    }


    /**
     * Sets the bestuurder_id value for this VerenigingVanEigenaren.
     * 
     * @param bestuurder_id
     */
    public void setBestuurder_id(java.lang.String bestuurder_id) {
        this.bestuurder_id = bestuurder_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerenigingVanEigenaren)) return false;
        VerenigingVanEigenaren other = (VerenigingVanEigenaren) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.naam==null && other.getNaam()==null) || 
             (this.naam!=null &&
              this.naam.equals(other.getNaam()))) &&
            ((this.bestuurder_id==null && other.getBestuurder_id()==null) || 
             (this.bestuurder_id!=null &&
              this.bestuurder_id.equals(other.getBestuurder_id())));
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
        if (getNaam() != null) {
            _hashCode += getNaam().hashCode();
        }
        if (getBestuurder_id() != null) {
            _hashCode += getBestuurder_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerenigingVanEigenaren.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "VerenigingVanEigenaren"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "naam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestuurder_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bestuurder_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
