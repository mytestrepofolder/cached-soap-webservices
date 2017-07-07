/**
 * CreditsafeEmployeeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeEmployeeInformation  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort year;

    private java.lang.String number_of_employees;

    public CreditsafeEmployeeInformation() {
    }

    public CreditsafeEmployeeInformation(
           org.apache.axis.types.UnsignedShort year,
           java.lang.String number_of_employees) {
           this.year = year;
           this.number_of_employees = number_of_employees;
    }


    /**
     * Gets the year value for this CreditsafeEmployeeInformation.
     * 
     * @return year
     */
    public org.apache.axis.types.UnsignedShort getYear() {
        return year;
    }


    /**
     * Sets the year value for this CreditsafeEmployeeInformation.
     * 
     * @param year
     */
    public void setYear(org.apache.axis.types.UnsignedShort year) {
        this.year = year;
    }


    /**
     * Gets the number_of_employees value for this CreditsafeEmployeeInformation.
     * 
     * @return number_of_employees
     */
    public java.lang.String getNumber_of_employees() {
        return number_of_employees;
    }


    /**
     * Sets the number_of_employees value for this CreditsafeEmployeeInformation.
     * 
     * @param number_of_employees
     */
    public void setNumber_of_employees(java.lang.String number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeEmployeeInformation)) return false;
        CreditsafeEmployeeInformation other = (CreditsafeEmployeeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.number_of_employees==null && other.getNumber_of_employees()==null) || 
             (this.number_of_employees!=null &&
              this.number_of_employees.equals(other.getNumber_of_employees())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getNumber_of_employees() != null) {
            _hashCode += getNumber_of_employees().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeEmployeeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeEmployeeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_employees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number_of_employees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
