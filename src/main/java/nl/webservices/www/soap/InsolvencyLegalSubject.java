/**
 * InsolvencyLegalSubject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyLegalSubject  implements java.io.Serializable {
    private nl.webservices.www.soap.InsolvencyConcernedPerson natural_person;

    private nl.webservices.www.soap.InsolvencyAffectedCompany legal_entity;

    public InsolvencyLegalSubject() {
    }

    public InsolvencyLegalSubject(
           nl.webservices.www.soap.InsolvencyConcernedPerson natural_person,
           nl.webservices.www.soap.InsolvencyAffectedCompany legal_entity) {
           this.natural_person = natural_person;
           this.legal_entity = legal_entity;
    }


    /**
     * Gets the natural_person value for this InsolvencyLegalSubject.
     * 
     * @return natural_person
     */
    public nl.webservices.www.soap.InsolvencyConcernedPerson getNatural_person() {
        return natural_person;
    }


    /**
     * Sets the natural_person value for this InsolvencyLegalSubject.
     * 
     * @param natural_person
     */
    public void setNatural_person(nl.webservices.www.soap.InsolvencyConcernedPerson natural_person) {
        this.natural_person = natural_person;
    }


    /**
     * Gets the legal_entity value for this InsolvencyLegalSubject.
     * 
     * @return legal_entity
     */
    public nl.webservices.www.soap.InsolvencyAffectedCompany getLegal_entity() {
        return legal_entity;
    }


    /**
     * Sets the legal_entity value for this InsolvencyLegalSubject.
     * 
     * @param legal_entity
     */
    public void setLegal_entity(nl.webservices.www.soap.InsolvencyAffectedCompany legal_entity) {
        this.legal_entity = legal_entity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyLegalSubject)) return false;
        InsolvencyLegalSubject other = (InsolvencyLegalSubject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natural_person==null && other.getNatural_person()==null) || 
             (this.natural_person!=null &&
              this.natural_person.equals(other.getNatural_person()))) &&
            ((this.legal_entity==null && other.getLegal_entity()==null) || 
             (this.legal_entity!=null &&
              this.legal_entity.equals(other.getLegal_entity())));
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
        if (getNatural_person() != null) {
            _hashCode += getNatural_person().hashCode();
        }
        if (getLegal_entity() != null) {
            _hashCode += getLegal_entity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyLegalSubject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyLegalSubject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natural_person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "natural_person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyConcernedPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_entity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAffectedCompany"));
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
