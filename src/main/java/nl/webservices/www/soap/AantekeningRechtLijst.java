/**
 * AantekeningRechtLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AantekeningRechtLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.AantekeningRecht[] aantekeningen_recht;

    private boolean indicatie_compleet;

    public AantekeningRechtLijst() {
    }

    public AantekeningRechtLijst(
           nl.webservices.www.soap.AantekeningRecht[] aantekeningen_recht,
           boolean indicatie_compleet) {
           this.aantekeningen_recht = aantekeningen_recht;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the aantekeningen_recht value for this AantekeningRechtLijst.
     * 
     * @return aantekeningen_recht
     */
    public nl.webservices.www.soap.AantekeningRecht[] getAantekeningen_recht() {
        return aantekeningen_recht;
    }


    /**
     * Sets the aantekeningen_recht value for this AantekeningRechtLijst.
     * 
     * @param aantekeningen_recht
     */
    public void setAantekeningen_recht(nl.webservices.www.soap.AantekeningRecht[] aantekeningen_recht) {
        this.aantekeningen_recht = aantekeningen_recht;
    }


    /**
     * Gets the indicatie_compleet value for this AantekeningRechtLijst.
     * 
     * @return indicatie_compleet
     */
    public boolean isIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this AantekeningRechtLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AantekeningRechtLijst)) return false;
        AantekeningRechtLijst other = (AantekeningRechtLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aantekeningen_recht==null && other.getAantekeningen_recht()==null) || 
             (this.aantekeningen_recht!=null &&
              java.util.Arrays.equals(this.aantekeningen_recht, other.getAantekeningen_recht()))) &&
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
        if (getAantekeningen_recht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAantekeningen_recht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAantekeningen_recht(), i);
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
        new org.apache.axis.description.TypeDesc(AantekeningRechtLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "AantekeningRechtLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantekeningen_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantekeningen_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "AantekeningRecht"));
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
