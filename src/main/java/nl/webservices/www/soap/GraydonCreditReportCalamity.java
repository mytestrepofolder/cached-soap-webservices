/**
 * GraydonCreditReportCalamity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportCalamity  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCompanyItselfCalamity company;

    private nl.webservices.www.soap.GCRCompanyRelationsSimple company_relations;

    public GraydonCreditReportCalamity() {
    }

    public GraydonCreditReportCalamity(
           nl.webservices.www.soap.GCRCompanyItselfCalamity company,
           nl.webservices.www.soap.GCRCompanyRelationsSimple company_relations) {
           this.company = company;
           this.company_relations = company_relations;
    }


    /**
     * Gets the company value for this GraydonCreditReportCalamity.
     * 
     * @return company
     */
    public nl.webservices.www.soap.GCRCompanyItselfCalamity getCompany() {
        return company;
    }


    /**
     * Sets the company value for this GraydonCreditReportCalamity.
     * 
     * @param company
     */
    public void setCompany(nl.webservices.www.soap.GCRCompanyItselfCalamity company) {
        this.company = company;
    }


    /**
     * Gets the company_relations value for this GraydonCreditReportCalamity.
     * 
     * @return company_relations
     */
    public nl.webservices.www.soap.GCRCompanyRelationsSimple getCompany_relations() {
        return company_relations;
    }


    /**
     * Sets the company_relations value for this GraydonCreditReportCalamity.
     * 
     * @param company_relations
     */
    public void setCompany_relations(nl.webservices.www.soap.GCRCompanyRelationsSimple company_relations) {
        this.company_relations = company_relations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportCalamity)) return false;
        GraydonCreditReportCalamity other = (GraydonCreditReportCalamity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.company_relations==null && other.getCompany_relations()==null) || 
             (this.company_relations!=null &&
              this.company_relations.equals(other.getCompany_relations())));
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCompany_relations() != null) {
            _hashCode += getCompany_relations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportCalamity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportCalamity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyItselfCalamity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_relations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_relations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyRelationsSimple"));
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
