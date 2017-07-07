/**
 * PRBeperkingenKadastraalObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PRBeperkingenKadastraalObject  implements java.io.Serializable {
    private nl.webservices.www.soap.PRBeperkingLijst pr_beperkingen_lijst;

    private java.lang.String melding;

    public PRBeperkingenKadastraalObject() {
    }

    public PRBeperkingenKadastraalObject(
           nl.webservices.www.soap.PRBeperkingLijst pr_beperkingen_lijst,
           java.lang.String melding) {
           this.pr_beperkingen_lijst = pr_beperkingen_lijst;
           this.melding = melding;
    }


    /**
     * Gets the pr_beperkingen_lijst value for this PRBeperkingenKadastraalObject.
     * 
     * @return pr_beperkingen_lijst
     */
    public nl.webservices.www.soap.PRBeperkingLijst getPr_beperkingen_lijst() {
        return pr_beperkingen_lijst;
    }


    /**
     * Sets the pr_beperkingen_lijst value for this PRBeperkingenKadastraalObject.
     * 
     * @param pr_beperkingen_lijst
     */
    public void setPr_beperkingen_lijst(nl.webservices.www.soap.PRBeperkingLijst pr_beperkingen_lijst) {
        this.pr_beperkingen_lijst = pr_beperkingen_lijst;
    }


    /**
     * Gets the melding value for this PRBeperkingenKadastraalObject.
     * 
     * @return melding
     */
    public java.lang.String getMelding() {
        return melding;
    }


    /**
     * Sets the melding value for this PRBeperkingenKadastraalObject.
     * 
     * @param melding
     */
    public void setMelding(java.lang.String melding) {
        this.melding = melding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRBeperkingenKadastraalObject)) return false;
        PRBeperkingenKadastraalObject other = (PRBeperkingenKadastraalObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pr_beperkingen_lijst==null && other.getPr_beperkingen_lijst()==null) || 
             (this.pr_beperkingen_lijst!=null &&
              this.pr_beperkingen_lijst.equals(other.getPr_beperkingen_lijst()))) &&
            ((this.melding==null && other.getMelding()==null) || 
             (this.melding!=null &&
              this.melding.equals(other.getMelding())));
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
        if (getPr_beperkingen_lijst() != null) {
            _hashCode += getPr_beperkingen_lijst().hashCode();
        }
        if (getMelding() != null) {
            _hashCode += getMelding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRBeperkingenKadastraalObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperkingenKadastraalObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr_beperkingen_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pr_beperkingen_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperkingLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("melding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "melding"));
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
