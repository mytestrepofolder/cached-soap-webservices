/**
 * RiskPersonCompanyReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskPersonCompanyReport  implements java.io.Serializable {
    private nl.webservices.www.soap.RiskPerson person;

    private nl.webservices.www.soap.RiskResult conclusion;

    private nl.webservices.www.soap.RiskCompanyReport report_data;

    public RiskPersonCompanyReport() {
    }

    public RiskPersonCompanyReport(
           nl.webservices.www.soap.RiskPerson person,
           nl.webservices.www.soap.RiskResult conclusion,
           nl.webservices.www.soap.RiskCompanyReport report_data) {
           this.person = person;
           this.conclusion = conclusion;
           this.report_data = report_data;
    }


    /**
     * Gets the person value for this RiskPersonCompanyReport.
     * 
     * @return person
     */
    public nl.webservices.www.soap.RiskPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this RiskPersonCompanyReport.
     * 
     * @param person
     */
    public void setPerson(nl.webservices.www.soap.RiskPerson person) {
        this.person = person;
    }


    /**
     * Gets the conclusion value for this RiskPersonCompanyReport.
     * 
     * @return conclusion
     */
    public nl.webservices.www.soap.RiskResult getConclusion() {
        return conclusion;
    }


    /**
     * Sets the conclusion value for this RiskPersonCompanyReport.
     * 
     * @param conclusion
     */
    public void setConclusion(nl.webservices.www.soap.RiskResult conclusion) {
        this.conclusion = conclusion;
    }


    /**
     * Gets the report_data value for this RiskPersonCompanyReport.
     * 
     * @return report_data
     */
    public nl.webservices.www.soap.RiskCompanyReport getReport_data() {
        return report_data;
    }


    /**
     * Sets the report_data value for this RiskPersonCompanyReport.
     * 
     * @param report_data
     */
    public void setReport_data(nl.webservices.www.soap.RiskCompanyReport report_data) {
        this.report_data = report_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskPersonCompanyReport)) return false;
        RiskPersonCompanyReport other = (RiskPersonCompanyReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.conclusion==null && other.getConclusion()==null) || 
             (this.conclusion!=null &&
              this.conclusion.equals(other.getConclusion()))) &&
            ((this.report_data==null && other.getReport_data()==null) || 
             (this.report_data!=null &&
              this.report_data.equals(other.getReport_data())));
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getConclusion() != null) {
            _hashCode += getConclusion().hashCode();
        }
        if (getReport_data() != null) {
            _hashCode += getReport_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskPersonCompanyReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskPersonCompanyReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskPerson"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "conclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "report_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskCompanyReport"));
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
