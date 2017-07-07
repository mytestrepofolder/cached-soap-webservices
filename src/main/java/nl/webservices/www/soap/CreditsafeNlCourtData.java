/**
 * CreditsafeNlCourtData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlCourtData  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeNlCourtDataFacts facts;

    private nl.webservices.www.soap.CreditsafeNlCourtDataReceiver receiver_details;

    public CreditsafeNlCourtData() {
    }

    public CreditsafeNlCourtData(
           nl.webservices.www.soap.CreditsafeNlCourtDataFacts facts,
           nl.webservices.www.soap.CreditsafeNlCourtDataReceiver receiver_details) {
           this.facts = facts;
           this.receiver_details = receiver_details;
    }


    /**
     * Gets the facts value for this CreditsafeNlCourtData.
     * 
     * @return facts
     */
    public nl.webservices.www.soap.CreditsafeNlCourtDataFacts getFacts() {
        return facts;
    }


    /**
     * Sets the facts value for this CreditsafeNlCourtData.
     * 
     * @param facts
     */
    public void setFacts(nl.webservices.www.soap.CreditsafeNlCourtDataFacts facts) {
        this.facts = facts;
    }


    /**
     * Gets the receiver_details value for this CreditsafeNlCourtData.
     * 
     * @return receiver_details
     */
    public nl.webservices.www.soap.CreditsafeNlCourtDataReceiver getReceiver_details() {
        return receiver_details;
    }


    /**
     * Sets the receiver_details value for this CreditsafeNlCourtData.
     * 
     * @param receiver_details
     */
    public void setReceiver_details(nl.webservices.www.soap.CreditsafeNlCourtDataReceiver receiver_details) {
        this.receiver_details = receiver_details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlCourtData)) return false;
        CreditsafeNlCourtData other = (CreditsafeNlCourtData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.facts==null && other.getFacts()==null) || 
             (this.facts!=null &&
              this.facts.equals(other.getFacts()))) &&
            ((this.receiver_details==null && other.getReceiver_details()==null) || 
             (this.receiver_details!=null &&
              this.receiver_details.equals(other.getReceiver_details())));
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
        if (getFacts() != null) {
            _hashCode += getFacts().hashCode();
        }
        if (getReceiver_details() != null) {
            _hashCode += getReceiver_details().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeNlCourtData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlCourtData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "facts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlCourtDataFacts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "receiver_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlCourtDataReceiver"));
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
