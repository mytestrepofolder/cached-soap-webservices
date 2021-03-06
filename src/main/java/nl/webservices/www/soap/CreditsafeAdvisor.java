/**
 * CreditsafeAdvisor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeAdvisor  implements java.io.Serializable {
    private java.lang.String auditor_name;

    private java.lang.String solicitor_name;

    public CreditsafeAdvisor() {
    }

    public CreditsafeAdvisor(
           java.lang.String auditor_name,
           java.lang.String solicitor_name) {
           this.auditor_name = auditor_name;
           this.solicitor_name = solicitor_name;
    }


    /**
     * Gets the auditor_name value for this CreditsafeAdvisor.
     * 
     * @return auditor_name
     */
    public java.lang.String getAuditor_name() {
        return auditor_name;
    }


    /**
     * Sets the auditor_name value for this CreditsafeAdvisor.
     * 
     * @param auditor_name
     */
    public void setAuditor_name(java.lang.String auditor_name) {
        this.auditor_name = auditor_name;
    }


    /**
     * Gets the solicitor_name value for this CreditsafeAdvisor.
     * 
     * @return solicitor_name
     */
    public java.lang.String getSolicitor_name() {
        return solicitor_name;
    }


    /**
     * Sets the solicitor_name value for this CreditsafeAdvisor.
     * 
     * @param solicitor_name
     */
    public void setSolicitor_name(java.lang.String solicitor_name) {
        this.solicitor_name = solicitor_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeAdvisor)) return false;
        CreditsafeAdvisor other = (CreditsafeAdvisor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditor_name==null && other.getAuditor_name()==null) || 
             (this.auditor_name!=null &&
              this.auditor_name.equals(other.getAuditor_name()))) &&
            ((this.solicitor_name==null && other.getSolicitor_name()==null) || 
             (this.solicitor_name!=null &&
              this.solicitor_name.equals(other.getSolicitor_name())));
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
        if (getAuditor_name() != null) {
            _hashCode += getAuditor_name().hashCode();
        }
        if (getSolicitor_name() != null) {
            _hashCode += getSolicitor_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeAdvisor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeAdvisor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "auditor_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "solicitor_name"));
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
