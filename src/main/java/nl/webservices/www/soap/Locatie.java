/**
 * Locatie.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Locatie  implements java.io.Serializable {
    private nl.webservices.www.soap.LocatieBinnenland locatie_binnenland;

    private nl.webservices.www.soap.LocatieBuitenland locatie_buitenland;

    public Locatie() {
    }

    public Locatie(
           nl.webservices.www.soap.LocatieBinnenland locatie_binnenland,
           nl.webservices.www.soap.LocatieBuitenland locatie_buitenland) {
           this.locatie_binnenland = locatie_binnenland;
           this.locatie_buitenland = locatie_buitenland;
    }


    /**
     * Gets the locatie_binnenland value for this Locatie.
     * 
     * @return locatie_binnenland
     */
    public nl.webservices.www.soap.LocatieBinnenland getLocatie_binnenland() {
        return locatie_binnenland;
    }


    /**
     * Sets the locatie_binnenland value for this Locatie.
     * 
     * @param locatie_binnenland
     */
    public void setLocatie_binnenland(nl.webservices.www.soap.LocatieBinnenland locatie_binnenland) {
        this.locatie_binnenland = locatie_binnenland;
    }


    /**
     * Gets the locatie_buitenland value for this Locatie.
     * 
     * @return locatie_buitenland
     */
    public nl.webservices.www.soap.LocatieBuitenland getLocatie_buitenland() {
        return locatie_buitenland;
    }


    /**
     * Sets the locatie_buitenland value for this Locatie.
     * 
     * @param locatie_buitenland
     */
    public void setLocatie_buitenland(nl.webservices.www.soap.LocatieBuitenland locatie_buitenland) {
        this.locatie_buitenland = locatie_buitenland;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Locatie)) return false;
        Locatie other = (Locatie) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locatie_binnenland==null && other.getLocatie_binnenland()==null) || 
             (this.locatie_binnenland!=null &&
              this.locatie_binnenland.equals(other.getLocatie_binnenland()))) &&
            ((this.locatie_buitenland==null && other.getLocatie_buitenland()==null) || 
             (this.locatie_buitenland!=null &&
              this.locatie_buitenland.equals(other.getLocatie_buitenland())));
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
        if (getLocatie_binnenland() != null) {
            _hashCode += getLocatie_binnenland().hashCode();
        }
        if (getLocatie_buitenland() != null) {
            _hashCode += getLocatie_buitenland().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Locatie.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Locatie"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locatie_binnenland");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locatie_binnenland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBinnenland"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locatie_buitenland");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locatie_buitenland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBuitenland"));
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
