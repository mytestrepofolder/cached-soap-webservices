/**
 * RiskLegalRestraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskLegalRestraint  implements java.io.Serializable {
    private java.lang.String verdict_number;

    private nl.webservices.www.soap.RiskLegalRestraintPerson person;

    private nl.webservices.www.soap.RiskLegalRestraintRegistry registry;

    private nl.webservices.www.soap.RiskLegalRestraintDecision[] decisions;

    public RiskLegalRestraint() {
    }

    public RiskLegalRestraint(
           java.lang.String verdict_number,
           nl.webservices.www.soap.RiskLegalRestraintPerson person,
           nl.webservices.www.soap.RiskLegalRestraintRegistry registry,
           nl.webservices.www.soap.RiskLegalRestraintDecision[] decisions) {
           this.verdict_number = verdict_number;
           this.person = person;
           this.registry = registry;
           this.decisions = decisions;
    }


    /**
     * Gets the verdict_number value for this RiskLegalRestraint.
     * 
     * @return verdict_number
     */
    public java.lang.String getVerdict_number() {
        return verdict_number;
    }


    /**
     * Sets the verdict_number value for this RiskLegalRestraint.
     * 
     * @param verdict_number
     */
    public void setVerdict_number(java.lang.String verdict_number) {
        this.verdict_number = verdict_number;
    }


    /**
     * Gets the person value for this RiskLegalRestraint.
     * 
     * @return person
     */
    public nl.webservices.www.soap.RiskLegalRestraintPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this RiskLegalRestraint.
     * 
     * @param person
     */
    public void setPerson(nl.webservices.www.soap.RiskLegalRestraintPerson person) {
        this.person = person;
    }


    /**
     * Gets the registry value for this RiskLegalRestraint.
     * 
     * @return registry
     */
    public nl.webservices.www.soap.RiskLegalRestraintRegistry getRegistry() {
        return registry;
    }


    /**
     * Sets the registry value for this RiskLegalRestraint.
     * 
     * @param registry
     */
    public void setRegistry(nl.webservices.www.soap.RiskLegalRestraintRegistry registry) {
        this.registry = registry;
    }


    /**
     * Gets the decisions value for this RiskLegalRestraint.
     * 
     * @return decisions
     */
    public nl.webservices.www.soap.RiskLegalRestraintDecision[] getDecisions() {
        return decisions;
    }


    /**
     * Sets the decisions value for this RiskLegalRestraint.
     * 
     * @param decisions
     */
    public void setDecisions(nl.webservices.www.soap.RiskLegalRestraintDecision[] decisions) {
        this.decisions = decisions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskLegalRestraint)) return false;
        RiskLegalRestraint other = (RiskLegalRestraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.verdict_number==null && other.getVerdict_number()==null) || 
             (this.verdict_number!=null &&
              this.verdict_number.equals(other.getVerdict_number()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.registry==null && other.getRegistry()==null) || 
             (this.registry!=null &&
              this.registry.equals(other.getRegistry()))) &&
            ((this.decisions==null && other.getDecisions()==null) || 
             (this.decisions!=null &&
              java.util.Arrays.equals(this.decisions, other.getDecisions())));
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
        if (getVerdict_number() != null) {
            _hashCode += getVerdict_number().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getRegistry() != null) {
            _hashCode += getRegistry().hashCode();
        }
        if (getDecisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDecisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDecisions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskLegalRestraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verdict_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "verdict_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintRegistry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "decisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintDecision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
