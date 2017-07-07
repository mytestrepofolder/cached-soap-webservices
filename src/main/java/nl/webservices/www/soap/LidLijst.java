/**
 * LidLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class LidLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.Lid[] leden;

    private boolean indicatie_compleet;

    public LidLijst() {
    }

    public LidLijst(
           nl.webservices.www.soap.Lid[] leden,
           boolean indicatie_compleet) {
           this.leden = leden;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the leden value for this LidLijst.
     * 
     * @return leden
     */
    public nl.webservices.www.soap.Lid[] getLeden() {
        return leden;
    }


    /**
     * Sets the leden value for this LidLijst.
     * 
     * @param leden
     */
    public void setLeden(nl.webservices.www.soap.Lid[] leden) {
        this.leden = leden;
    }


    /**
     * Gets the indicatie_compleet value for this LidLijst.
     * 
     * @return indicatie_compleet
     */
    public boolean isIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this LidLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LidLijst)) return false;
        LidLijst other = (LidLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leden==null && other.getLeden()==null) || 
             (this.leden!=null &&
              java.util.Arrays.equals(this.leden, other.getLeden()))) &&
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
        if (getLeden() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeden());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeden(), i);
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
        new org.apache.axis.description.TypeDesc(LidLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LidLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "leden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Lid"));
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
