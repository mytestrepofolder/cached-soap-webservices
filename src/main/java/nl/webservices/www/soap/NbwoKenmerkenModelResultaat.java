/**
 * NbwoKenmerkenModelResultaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoKenmerkenModelResultaat  implements java.io.Serializable {
    private int waarde;

    private double betrouwbaarheid;

    private int aantal;

    public NbwoKenmerkenModelResultaat() {
    }

    public NbwoKenmerkenModelResultaat(
           int waarde,
           double betrouwbaarheid,
           int aantal) {
           this.waarde = waarde;
           this.betrouwbaarheid = betrouwbaarheid;
           this.aantal = aantal;
    }


    /**
     * Gets the waarde value for this NbwoKenmerkenModelResultaat.
     * 
     * @return waarde
     */
    public int getWaarde() {
        return waarde;
    }


    /**
     * Sets the waarde value for this NbwoKenmerkenModelResultaat.
     * 
     * @param waarde
     */
    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }


    /**
     * Gets the betrouwbaarheid value for this NbwoKenmerkenModelResultaat.
     * 
     * @return betrouwbaarheid
     */
    public double getBetrouwbaarheid() {
        return betrouwbaarheid;
    }


    /**
     * Sets the betrouwbaarheid value for this NbwoKenmerkenModelResultaat.
     * 
     * @param betrouwbaarheid
     */
    public void setBetrouwbaarheid(double betrouwbaarheid) {
        this.betrouwbaarheid = betrouwbaarheid;
    }


    /**
     * Gets the aantal value for this NbwoKenmerkenModelResultaat.
     * 
     * @return aantal
     */
    public int getAantal() {
        return aantal;
    }


    /**
     * Sets the aantal value for this NbwoKenmerkenModelResultaat.
     * 
     * @param aantal
     */
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoKenmerkenModelResultaat)) return false;
        NbwoKenmerkenModelResultaat other = (NbwoKenmerkenModelResultaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.waarde == other.getWaarde() &&
            this.betrouwbaarheid == other.getBetrouwbaarheid() &&
            this.aantal == other.getAantal();
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
        _hashCode += getWaarde();
        _hashCode += new Double(getBetrouwbaarheid()).hashCode();
        _hashCode += getAantal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbwoKenmerkenModelResultaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoKenmerkenModelResultaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waarde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "waarde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrouwbaarheid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "betrouwbaarheid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
