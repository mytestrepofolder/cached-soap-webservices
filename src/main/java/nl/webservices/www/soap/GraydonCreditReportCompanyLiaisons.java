/**
 * GraydonCreditReportCompanyLiaisons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportCompanyLiaisons  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRLiaison[] concern_liaisons;

    private nl.webservices.www.soap.GCRLiaisonCompany[] companies;

    private nl.webservices.www.soap.GCRAlarm alarm;

    public GraydonCreditReportCompanyLiaisons() {
    }

    public GraydonCreditReportCompanyLiaisons(
           nl.webservices.www.soap.GCRLiaison[] concern_liaisons,
           nl.webservices.www.soap.GCRLiaisonCompany[] companies,
           nl.webservices.www.soap.GCRAlarm alarm) {
           this.concern_liaisons = concern_liaisons;
           this.companies = companies;
           this.alarm = alarm;
    }


    /**
     * Gets the concern_liaisons value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @return concern_liaisons
     */
    public nl.webservices.www.soap.GCRLiaison[] getConcern_liaisons() {
        return concern_liaisons;
    }


    /**
     * Sets the concern_liaisons value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @param concern_liaisons
     */
    public void setConcern_liaisons(nl.webservices.www.soap.GCRLiaison[] concern_liaisons) {
        this.concern_liaisons = concern_liaisons;
    }


    /**
     * Gets the companies value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @return companies
     */
    public nl.webservices.www.soap.GCRLiaisonCompany[] getCompanies() {
        return companies;
    }


    /**
     * Sets the companies value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @param companies
     */
    public void setCompanies(nl.webservices.www.soap.GCRLiaisonCompany[] companies) {
        this.companies = companies;
    }


    /**
     * Gets the alarm value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @return alarm
     */
    public nl.webservices.www.soap.GCRAlarm getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this GraydonCreditReportCompanyLiaisons.
     * 
     * @param alarm
     */
    public void setAlarm(nl.webservices.www.soap.GCRAlarm alarm) {
        this.alarm = alarm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportCompanyLiaisons)) return false;
        GraydonCreditReportCompanyLiaisons other = (GraydonCreditReportCompanyLiaisons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.concern_liaisons==null && other.getConcern_liaisons()==null) || 
             (this.concern_liaisons!=null &&
              java.util.Arrays.equals(this.concern_liaisons, other.getConcern_liaisons()))) &&
            ((this.companies==null && other.getCompanies()==null) || 
             (this.companies!=null &&
              java.util.Arrays.equals(this.companies, other.getCompanies()))) &&
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
        if (getConcern_liaisons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConcern_liaisons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConcern_liaisons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportCompanyLiaisons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportCompanyLiaisons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concern_liaisons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "concern_liaisons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaison"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaisonCompany"));
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
