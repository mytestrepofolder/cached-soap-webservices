/**
 * GCRCompanyRelationsSimple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyRelationsSimple  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCompanySimple[] companies;

    private nl.webservices.www.soap.GCRPersonSimple[] persons;

    public GCRCompanyRelationsSimple() {
    }

    public GCRCompanyRelationsSimple(
           nl.webservices.www.soap.GCRCompanySimple[] companies,
           nl.webservices.www.soap.GCRPersonSimple[] persons) {
           this.companies = companies;
           this.persons = persons;
    }


    /**
     * Gets the companies value for this GCRCompanyRelationsSimple.
     * 
     * @return companies
     */
    public nl.webservices.www.soap.GCRCompanySimple[] getCompanies() {
        return companies;
    }


    /**
     * Sets the companies value for this GCRCompanyRelationsSimple.
     * 
     * @param companies
     */
    public void setCompanies(nl.webservices.www.soap.GCRCompanySimple[] companies) {
        this.companies = companies;
    }


    /**
     * Gets the persons value for this GCRCompanyRelationsSimple.
     * 
     * @return persons
     */
    public nl.webservices.www.soap.GCRPersonSimple[] getPersons() {
        return persons;
    }


    /**
     * Sets the persons value for this GCRCompanyRelationsSimple.
     * 
     * @param persons
     */
    public void setPersons(nl.webservices.www.soap.GCRPersonSimple[] persons) {
        this.persons = persons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyRelationsSimple)) return false;
        GCRCompanyRelationsSimple other = (GCRCompanyRelationsSimple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companies==null && other.getCompanies()==null) || 
             (this.companies!=null &&
              java.util.Arrays.equals(this.companies, other.getCompanies()))) &&
            ((this.persons==null && other.getPersons()==null) || 
             (this.persons!=null &&
              java.util.Arrays.equals(this.persons, other.getPersons())));
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
        if (getCompanies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersons(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCompanyRelationsSimple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyRelationsSimple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanySimple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonSimple"));
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
