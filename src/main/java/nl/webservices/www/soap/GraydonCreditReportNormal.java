/**
 * GraydonCreditReportNormal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportNormal  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCompanyItself company;

    private nl.webservices.www.soap.GCRCompanyRelations company_relations;

    private nl.webservices.www.soap.GCRCompanyRelations indirect_company_relations;

    public GraydonCreditReportNormal() {
    }

    public GraydonCreditReportNormal(
           nl.webservices.www.soap.GCRCompanyItself company,
           nl.webservices.www.soap.GCRCompanyRelations company_relations,
           nl.webservices.www.soap.GCRCompanyRelations indirect_company_relations) {
           this.company = company;
           this.company_relations = company_relations;
           this.indirect_company_relations = indirect_company_relations;
    }


    /**
     * Gets the company value for this GraydonCreditReportNormal.
     * 
     * @return company
     */
    public nl.webservices.www.soap.GCRCompanyItself getCompany() {
        return company;
    }


    /**
     * Sets the company value for this GraydonCreditReportNormal.
     * 
     * @param company
     */
    public void setCompany(nl.webservices.www.soap.GCRCompanyItself company) {
        this.company = company;
    }


    /**
     * Gets the company_relations value for this GraydonCreditReportNormal.
     * 
     * @return company_relations
     */
    public nl.webservices.www.soap.GCRCompanyRelations getCompany_relations() {
        return company_relations;
    }


    /**
     * Sets the company_relations value for this GraydonCreditReportNormal.
     * 
     * @param company_relations
     */
    public void setCompany_relations(nl.webservices.www.soap.GCRCompanyRelations company_relations) {
        this.company_relations = company_relations;
    }


    /**
     * Gets the indirect_company_relations value for this GraydonCreditReportNormal.
     * 
     * @return indirect_company_relations
     */
    public nl.webservices.www.soap.GCRCompanyRelations getIndirect_company_relations() {
        return indirect_company_relations;
    }


    /**
     * Sets the indirect_company_relations value for this GraydonCreditReportNormal.
     * 
     * @param indirect_company_relations
     */
    public void setIndirect_company_relations(nl.webservices.www.soap.GCRCompanyRelations indirect_company_relations) {
        this.indirect_company_relations = indirect_company_relations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportNormal)) return false;
        GraydonCreditReportNormal other = (GraydonCreditReportNormal) obj;
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
              this.company_relations.equals(other.getCompany_relations()))) &&
            ((this.indirect_company_relations==null && other.getIndirect_company_relations()==null) || 
             (this.indirect_company_relations!=null &&
              this.indirect_company_relations.equals(other.getIndirect_company_relations())));
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
        if (getIndirect_company_relations() != null) {
            _hashCode += getIndirect_company_relations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportNormal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportNormal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyItself"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_relations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_relations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyRelations"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirect_company_relations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indirect_company_relations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyRelations"));
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
