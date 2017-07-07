/**
 * GCRPersonnel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRPersonnel  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.lang.Integer employees_class_code;

    private java.lang.String employees_class_text;

    private nl.webservices.www.soap.GCRNumberOfEmployees[] number_of_employees;

    public GCRPersonnel() {
    }

    public GCRPersonnel(
           java.math.BigInteger graydon_company_id,
           java.lang.Integer employees_class_code,
           java.lang.String employees_class_text,
           nl.webservices.www.soap.GCRNumberOfEmployees[] number_of_employees) {
           this.graydon_company_id = graydon_company_id;
           this.employees_class_code = employees_class_code;
           this.employees_class_text = employees_class_text;
           this.number_of_employees = number_of_employees;
    }


    /**
     * Gets the graydon_company_id value for this GCRPersonnel.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRPersonnel.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the employees_class_code value for this GCRPersonnel.
     * 
     * @return employees_class_code
     */
    public java.lang.Integer getEmployees_class_code() {
        return employees_class_code;
    }


    /**
     * Sets the employees_class_code value for this GCRPersonnel.
     * 
     * @param employees_class_code
     */
    public void setEmployees_class_code(java.lang.Integer employees_class_code) {
        this.employees_class_code = employees_class_code;
    }


    /**
     * Gets the employees_class_text value for this GCRPersonnel.
     * 
     * @return employees_class_text
     */
    public java.lang.String getEmployees_class_text() {
        return employees_class_text;
    }


    /**
     * Sets the employees_class_text value for this GCRPersonnel.
     * 
     * @param employees_class_text
     */
    public void setEmployees_class_text(java.lang.String employees_class_text) {
        this.employees_class_text = employees_class_text;
    }


    /**
     * Gets the number_of_employees value for this GCRPersonnel.
     * 
     * @return number_of_employees
     */
    public nl.webservices.www.soap.GCRNumberOfEmployees[] getNumber_of_employees() {
        return number_of_employees;
    }


    /**
     * Sets the number_of_employees value for this GCRPersonnel.
     * 
     * @param number_of_employees
     */
    public void setNumber_of_employees(nl.webservices.www.soap.GCRNumberOfEmployees[] number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRPersonnel)) return false;
        GCRPersonnel other = (GCRPersonnel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graydon_company_id==null && other.getGraydon_company_id()==null) || 
             (this.graydon_company_id!=null &&
              this.graydon_company_id.equals(other.getGraydon_company_id()))) &&
            ((this.employees_class_code==null && other.getEmployees_class_code()==null) || 
             (this.employees_class_code!=null &&
              this.employees_class_code.equals(other.getEmployees_class_code()))) &&
            ((this.employees_class_text==null && other.getEmployees_class_text()==null) || 
             (this.employees_class_text!=null &&
              this.employees_class_text.equals(other.getEmployees_class_text()))) &&
            ((this.number_of_employees==null && other.getNumber_of_employees()==null) || 
             (this.number_of_employees!=null &&
              java.util.Arrays.equals(this.number_of_employees, other.getNumber_of_employees())));
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
        if (getGraydon_company_id() != null) {
            _hashCode += getGraydon_company_id().hashCode();
        }
        if (getEmployees_class_code() != null) {
            _hashCode += getEmployees_class_code().hashCode();
        }
        if (getEmployees_class_text() != null) {
            _hashCode += getEmployees_class_text().hashCode();
        }
        if (getNumber_of_employees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber_of_employees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber_of_employees(), i);
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
        new org.apache.axis.description.TypeDesc(GCRPersonnel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonnel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_class_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_class_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_class_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_class_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_employees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number_of_employees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRNumberOfEmployees"));
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
