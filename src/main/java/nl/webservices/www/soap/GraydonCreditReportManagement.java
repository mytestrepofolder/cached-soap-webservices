/**
 * GraydonCreditReportManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportManagement  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCompanyManagement company_management;

    private nl.webservices.www.soap.GCRPerson[] persons;

    private nl.webservices.www.soap.GCRAlarm alarm;

    public GraydonCreditReportManagement() {
    }

    public GraydonCreditReportManagement(
           nl.webservices.www.soap.GCRCompanyManagement company_management,
           nl.webservices.www.soap.GCRPerson[] persons,
           nl.webservices.www.soap.GCRAlarm alarm) {
           this.company_management = company_management;
           this.persons = persons;
           this.alarm = alarm;
    }


    /**
     * Gets the company_management value for this GraydonCreditReportManagement.
     * 
     * @return company_management
     */
    public nl.webservices.www.soap.GCRCompanyManagement getCompany_management() {
        return company_management;
    }


    /**
     * Sets the company_management value for this GraydonCreditReportManagement.
     * 
     * @param company_management
     */
    public void setCompany_management(nl.webservices.www.soap.GCRCompanyManagement company_management) {
        this.company_management = company_management;
    }


    /**
     * Gets the persons value for this GraydonCreditReportManagement.
     * 
     * @return persons
     */
    public nl.webservices.www.soap.GCRPerson[] getPersons() {
        return persons;
    }


    /**
     * Sets the persons value for this GraydonCreditReportManagement.
     * 
     * @param persons
     */
    public void setPersons(nl.webservices.www.soap.GCRPerson[] persons) {
        this.persons = persons;
    }


    /**
     * Gets the alarm value for this GraydonCreditReportManagement.
     * 
     * @return alarm
     */
    public nl.webservices.www.soap.GCRAlarm getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this GraydonCreditReportManagement.
     * 
     * @param alarm
     */
    public void setAlarm(nl.webservices.www.soap.GCRAlarm alarm) {
        this.alarm = alarm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportManagement)) return false;
        GraydonCreditReportManagement other = (GraydonCreditReportManagement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_management==null && other.getCompany_management()==null) || 
             (this.company_management!=null &&
              this.company_management.equals(other.getCompany_management()))) &&
            ((this.persons==null && other.getPersons()==null) || 
             (this.persons!=null &&
              java.util.Arrays.equals(this.persons, other.getPersons()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm())));
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
        if (getCompany_management() != null) {
            _hashCode += getCompany_management().hashCode();
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
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportManagement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportManagement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_management");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_management"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyManagement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarm"));
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
