/**
 * RiskLegalRestraintPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskLegalRestraintPerson  implements java.io.Serializable {
    private java.lang.String first_name;

    private java.lang.String prefix;

    private java.lang.String last_name;

    private java.util.Date birth_date;

    public RiskLegalRestraintPerson() {
    }

    public RiskLegalRestraintPerson(
           java.lang.String first_name,
           java.lang.String prefix,
           java.lang.String last_name,
           java.util.Date birth_date) {
           this.first_name = first_name;
           this.prefix = prefix;
           this.last_name = last_name;
           this.birth_date = birth_date;
    }


    /**
     * Gets the first_name value for this RiskLegalRestraintPerson.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this RiskLegalRestraintPerson.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the prefix value for this RiskLegalRestraintPerson.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this RiskLegalRestraintPerson.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the last_name value for this RiskLegalRestraintPerson.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this RiskLegalRestraintPerson.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the birth_date value for this RiskLegalRestraintPerson.
     * 
     * @return birth_date
     */
    public java.util.Date getBirth_date() {
        return birth_date;
    }


    /**
     * Sets the birth_date value for this RiskLegalRestraintPerson.
     * 
     * @param birth_date
     */
    public void setBirth_date(java.util.Date birth_date) {
        this.birth_date = birth_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskLegalRestraintPerson)) return false;
        RiskLegalRestraintPerson other = (RiskLegalRestraintPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.birth_date==null && other.getBirth_date()==null) || 
             (this.birth_date!=null &&
              this.birth_date.equals(other.getBirth_date())));
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
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getBirth_date() != null) {
            _hashCode += getBirth_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskLegalRestraintPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
