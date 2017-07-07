/**
 * RiskCompanyReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskCompanyReport  implements java.io.Serializable {
    private nl.webservices.www.soap.RiskCompany[] companies;

    private nl.webservices.www.soap.RiskInsolvency[] insolvencies;

    private nl.webservices.www.soap.RiskLegalRestraint legal_restraint;

    public RiskCompanyReport() {
    }

    public RiskCompanyReport(
           nl.webservices.www.soap.RiskCompany[] companies,
           nl.webservices.www.soap.RiskInsolvency[] insolvencies,
           nl.webservices.www.soap.RiskLegalRestraint legal_restraint) {
           this.companies = companies;
           this.insolvencies = insolvencies;
           this.legal_restraint = legal_restraint;
    }


    /**
     * Gets the companies value for this RiskCompanyReport.
     * 
     * @return companies
     */
    public nl.webservices.www.soap.RiskCompany[] getCompanies() {
        return companies;
    }


    /**
     * Sets the companies value for this RiskCompanyReport.
     * 
     * @param companies
     */
    public void setCompanies(nl.webservices.www.soap.RiskCompany[] companies) {
        this.companies = companies;
    }


    /**
     * Gets the insolvencies value for this RiskCompanyReport.
     * 
     * @return insolvencies
     */
    public nl.webservices.www.soap.RiskInsolvency[] getInsolvencies() {
        return insolvencies;
    }


    /**
     * Sets the insolvencies value for this RiskCompanyReport.
     * 
     * @param insolvencies
     */
    public void setInsolvencies(nl.webservices.www.soap.RiskInsolvency[] insolvencies) {
        this.insolvencies = insolvencies;
    }


    /**
     * Gets the legal_restraint value for this RiskCompanyReport.
     * 
     * @return legal_restraint
     */
    public nl.webservices.www.soap.RiskLegalRestraint getLegal_restraint() {
        return legal_restraint;
    }


    /**
     * Sets the legal_restraint value for this RiskCompanyReport.
     * 
     * @param legal_restraint
     */
    public void setLegal_restraint(nl.webservices.www.soap.RiskLegalRestraint legal_restraint) {
        this.legal_restraint = legal_restraint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskCompanyReport)) return false;
        RiskCompanyReport other = (RiskCompanyReport) obj;
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
            ((this.insolvencies==null && other.getInsolvencies()==null) || 
             (this.insolvencies!=null &&
              java.util.Arrays.equals(this.insolvencies, other.getInsolvencies()))) &&
            ((this.legal_restraint==null && other.getLegal_restraint()==null) || 
             (this.legal_restraint!=null &&
              this.legal_restraint.equals(other.getLegal_restraint())));
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
        if (getInsolvencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsolvencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsolvencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegal_restraint() != null) {
            _hashCode += getLegal_restraint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskCompanyReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskCompanyReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskCompany"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insolvencies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_restraint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_restraint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraint"));
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
