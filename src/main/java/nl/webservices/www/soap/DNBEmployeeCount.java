/**
 * DNBEmployeeCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBEmployeeCount  implements java.io.Serializable {
    private java.lang.Integer employees;

    private java.lang.String employees_text;

    private java.lang.Boolean estimated;

    private java.lang.Boolean subsidiaries_included;

    private java.lang.String qualification_indicator;

    public DNBEmployeeCount() {
    }

    public DNBEmployeeCount(
           java.lang.Integer employees,
           java.lang.String employees_text,
           java.lang.Boolean estimated,
           java.lang.Boolean subsidiaries_included,
           java.lang.String qualification_indicator) {
           this.employees = employees;
           this.employees_text = employees_text;
           this.estimated = estimated;
           this.subsidiaries_included = subsidiaries_included;
           this.qualification_indicator = qualification_indicator;
    }


    /**
     * Gets the employees value for this DNBEmployeeCount.
     * 
     * @return employees
     */
    public java.lang.Integer getEmployees() {
        return employees;
    }


    /**
     * Sets the employees value for this DNBEmployeeCount.
     * 
     * @param employees
     */
    public void setEmployees(java.lang.Integer employees) {
        this.employees = employees;
    }


    /**
     * Gets the employees_text value for this DNBEmployeeCount.
     * 
     * @return employees_text
     */
    public java.lang.String getEmployees_text() {
        return employees_text;
    }


    /**
     * Sets the employees_text value for this DNBEmployeeCount.
     * 
     * @param employees_text
     */
    public void setEmployees_text(java.lang.String employees_text) {
        this.employees_text = employees_text;
    }


    /**
     * Gets the estimated value for this DNBEmployeeCount.
     * 
     * @return estimated
     */
    public java.lang.Boolean getEstimated() {
        return estimated;
    }


    /**
     * Sets the estimated value for this DNBEmployeeCount.
     * 
     * @param estimated
     */
    public void setEstimated(java.lang.Boolean estimated) {
        this.estimated = estimated;
    }


    /**
     * Gets the subsidiaries_included value for this DNBEmployeeCount.
     * 
     * @return subsidiaries_included
     */
    public java.lang.Boolean getSubsidiaries_included() {
        return subsidiaries_included;
    }


    /**
     * Sets the subsidiaries_included value for this DNBEmployeeCount.
     * 
     * @param subsidiaries_included
     */
    public void setSubsidiaries_included(java.lang.Boolean subsidiaries_included) {
        this.subsidiaries_included = subsidiaries_included;
    }


    /**
     * Gets the qualification_indicator value for this DNBEmployeeCount.
     * 
     * @return qualification_indicator
     */
    public java.lang.String getQualification_indicator() {
        return qualification_indicator;
    }


    /**
     * Sets the qualification_indicator value for this DNBEmployeeCount.
     * 
     * @param qualification_indicator
     */
    public void setQualification_indicator(java.lang.String qualification_indicator) {
        this.qualification_indicator = qualification_indicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBEmployeeCount)) return false;
        DNBEmployeeCount other = (DNBEmployeeCount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employees==null && other.getEmployees()==null) || 
             (this.employees!=null &&
              this.employees.equals(other.getEmployees()))) &&
            ((this.employees_text==null && other.getEmployees_text()==null) || 
             (this.employees_text!=null &&
              this.employees_text.equals(other.getEmployees_text()))) &&
            ((this.estimated==null && other.getEstimated()==null) || 
             (this.estimated!=null &&
              this.estimated.equals(other.getEstimated()))) &&
            ((this.subsidiaries_included==null && other.getSubsidiaries_included()==null) || 
             (this.subsidiaries_included!=null &&
              this.subsidiaries_included.equals(other.getSubsidiaries_included()))) &&
            ((this.qualification_indicator==null && other.getQualification_indicator()==null) || 
             (this.qualification_indicator!=null &&
              this.qualification_indicator.equals(other.getQualification_indicator())));
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
        if (getEmployees() != null) {
            _hashCode += getEmployees().hashCode();
        }
        if (getEmployees_text() != null) {
            _hashCode += getEmployees_text().hashCode();
        }
        if (getEstimated() != null) {
            _hashCode += getEstimated().hashCode();
        }
        if (getSubsidiaries_included() != null) {
            _hashCode += getSubsidiaries_included().hashCode();
        }
        if (getQualification_indicator() != null) {
            _hashCode += getQualification_indicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBEmployeeCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBEmployeeCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "estimated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaries_included");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subsidiaries_included"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualification_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "qualification_indicator"));
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
