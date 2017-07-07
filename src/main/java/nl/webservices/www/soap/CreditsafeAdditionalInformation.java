/**
 * CreditsafeAdditionalInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeAdditionalInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeNlAdditionalInformation nl;

    private nl.webservices.www.soap.CreditsafeBeAdditionalInformation be;

    public CreditsafeAdditionalInformation() {
    }

    public CreditsafeAdditionalInformation(
           nl.webservices.www.soap.CreditsafeNlAdditionalInformation nl,
           nl.webservices.www.soap.CreditsafeBeAdditionalInformation be) {
           this.nl = nl;
           this.be = be;
    }


    /**
     * Gets the nl value for this CreditsafeAdditionalInformation.
     * 
     * @return nl
     */
    public nl.webservices.www.soap.CreditsafeNlAdditionalInformation getNl() {
        return nl;
    }


    /**
     * Sets the nl value for this CreditsafeAdditionalInformation.
     * 
     * @param nl
     */
    public void setNl(nl.webservices.www.soap.CreditsafeNlAdditionalInformation nl) {
        this.nl = nl;
    }


    /**
     * Gets the be value for this CreditsafeAdditionalInformation.
     * 
     * @return be
     */
    public nl.webservices.www.soap.CreditsafeBeAdditionalInformation getBe() {
        return be;
    }


    /**
     * Sets the be value for this CreditsafeAdditionalInformation.
     * 
     * @param be
     */
    public void setBe(nl.webservices.www.soap.CreditsafeBeAdditionalInformation be) {
        this.be = be;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeAdditionalInformation)) return false;
        CreditsafeAdditionalInformation other = (CreditsafeAdditionalInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nl==null && other.getNl()==null) || 
             (this.nl!=null &&
              this.nl.equals(other.getNl()))) &&
            ((this.be==null && other.getBe()==null) || 
             (this.be!=null &&
              this.be.equals(other.getBe())));
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
        if (getNl() != null) {
            _hashCode += getNl().hashCode();
        }
        if (getBe() != null) {
            _hashCode += getBe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeAdditionalInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeAdditionalInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlAdditionalInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("be");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "be"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeAdditionalInformation"));
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
