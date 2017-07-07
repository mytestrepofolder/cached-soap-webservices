/**
 * PRBeperkingLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PRBeperkingLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.PRBeperking[] pr_beperkingen;

    private boolean indicatie_compleet;

    public PRBeperkingLijst() {
    }

    public PRBeperkingLijst(
           nl.webservices.www.soap.PRBeperking[] pr_beperkingen,
           boolean indicatie_compleet) {
           this.pr_beperkingen = pr_beperkingen;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the pr_beperkingen value for this PRBeperkingLijst.
     * 
     * @return pr_beperkingen
     */
    public nl.webservices.www.soap.PRBeperking[] getPr_beperkingen() {
        return pr_beperkingen;
    }


    /**
     * Sets the pr_beperkingen value for this PRBeperkingLijst.
     * 
     * @param pr_beperkingen
     */
    public void setPr_beperkingen(nl.webservices.www.soap.PRBeperking[] pr_beperkingen) {
        this.pr_beperkingen = pr_beperkingen;
    }


    /**
     * Gets the indicatie_compleet value for this PRBeperkingLijst.
     * 
     * @return indicatie_compleet
     */
    public boolean isIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this PRBeperkingLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRBeperkingLijst)) return false;
        PRBeperkingLijst other = (PRBeperkingLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pr_beperkingen==null && other.getPr_beperkingen()==null) || 
             (this.pr_beperkingen!=null &&
              java.util.Arrays.equals(this.pr_beperkingen, other.getPr_beperkingen()))) &&
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
        if (getPr_beperkingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPr_beperkingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPr_beperkingen(), i);
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
        new org.apache.axis.description.TypeDesc(PRBeperkingLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperkingLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr_beperkingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pr_beperkingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperking"));
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
