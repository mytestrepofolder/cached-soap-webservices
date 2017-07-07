/**
 * LocatieBinnenlandLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class LocatieBinnenlandLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.LocatieBinnenland[] locaties_binnenland;

    private boolean indicatie_compleet;

    public LocatieBinnenlandLijst() {
    }

    public LocatieBinnenlandLijst(
           nl.webservices.www.soap.LocatieBinnenland[] locaties_binnenland,
           boolean indicatie_compleet) {
           this.locaties_binnenland = locaties_binnenland;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the locaties_binnenland value for this LocatieBinnenlandLijst.
     * 
     * @return locaties_binnenland
     */
    public nl.webservices.www.soap.LocatieBinnenland[] getLocaties_binnenland() {
        return locaties_binnenland;
    }


    /**
     * Sets the locaties_binnenland value for this LocatieBinnenlandLijst.
     * 
     * @param locaties_binnenland
     */
    public void setLocaties_binnenland(nl.webservices.www.soap.LocatieBinnenland[] locaties_binnenland) {
        this.locaties_binnenland = locaties_binnenland;
    }


    /**
     * Gets the indicatie_compleet value for this LocatieBinnenlandLijst.
     * 
     * @return indicatie_compleet
     */
    public boolean isIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this LocatieBinnenlandLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocatieBinnenlandLijst)) return false;
        LocatieBinnenlandLijst other = (LocatieBinnenlandLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locaties_binnenland==null && other.getLocaties_binnenland()==null) || 
             (this.locaties_binnenland!=null &&
              java.util.Arrays.equals(this.locaties_binnenland, other.getLocaties_binnenland()))) &&
            this.indicatie_compleet == other.isIndicatie_compleet();
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
        if (getLocaties_binnenland() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocaties_binnenland());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocaties_binnenland(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIndicatie_compleet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocatieBinnenlandLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBinnenlandLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locaties_binnenland");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locaties_binnenland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBinnenland"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_compleet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_compleet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
