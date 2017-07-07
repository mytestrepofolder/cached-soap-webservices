/**
 * GCRAnnualFigures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRAnnualFigures  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRCompanyAnnualAccount[] company_annual_accounts;

    private nl.webservices.www.soap.GCRBankAndInsurerData[] bank_and_insurer_data;

    public GCRAnnualFigures() {
    }

    public GCRAnnualFigures(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRCompanyAnnualAccount[] company_annual_accounts,
           nl.webservices.www.soap.GCRBankAndInsurerData[] bank_and_insurer_data) {
           this.graydon_company_id = graydon_company_id;
           this.company_annual_accounts = company_annual_accounts;
           this.bank_and_insurer_data = bank_and_insurer_data;
    }


    /**
     * Gets the graydon_company_id value for this GCRAnnualFigures.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRAnnualFigures.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the company_annual_accounts value for this GCRAnnualFigures.
     * 
     * @return company_annual_accounts
     */
    public nl.webservices.www.soap.GCRCompanyAnnualAccount[] getCompany_annual_accounts() {
        return company_annual_accounts;
    }


    /**
     * Sets the company_annual_accounts value for this GCRAnnualFigures.
     * 
     * @param company_annual_accounts
     */
    public void setCompany_annual_accounts(nl.webservices.www.soap.GCRCompanyAnnualAccount[] company_annual_accounts) {
        this.company_annual_accounts = company_annual_accounts;
    }


    /**
     * Gets the bank_and_insurer_data value for this GCRAnnualFigures.
     * 
     * @return bank_and_insurer_data
     */
    public nl.webservices.www.soap.GCRBankAndInsurerData[] getBank_and_insurer_data() {
        return bank_and_insurer_data;
    }


    /**
     * Sets the bank_and_insurer_data value for this GCRAnnualFigures.
     * 
     * @param bank_and_insurer_data
     */
    public void setBank_and_insurer_data(nl.webservices.www.soap.GCRBankAndInsurerData[] bank_and_insurer_data) {
        this.bank_and_insurer_data = bank_and_insurer_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRAnnualFigures)) return false;
        GCRAnnualFigures other = (GCRAnnualFigures) obj;
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
            ((this.company_annual_accounts==null && other.getCompany_annual_accounts()==null) || 
             (this.company_annual_accounts!=null &&
              java.util.Arrays.equals(this.company_annual_accounts, other.getCompany_annual_accounts()))) &&
            ((this.bank_and_insurer_data==null && other.getBank_and_insurer_data()==null) || 
             (this.bank_and_insurer_data!=null &&
              java.util.Arrays.equals(this.bank_and_insurer_data, other.getBank_and_insurer_data())));
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
        if (getCompany_annual_accounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompany_annual_accounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompany_annual_accounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBank_and_insurer_data() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBank_and_insurer_data());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBank_and_insurer_data(), i);
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
        new org.apache.axis.description.TypeDesc(GCRAnnualFigures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAnnualFigures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_annual_accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_annual_accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyAnnualAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_and_insurer_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bank_and_insurer_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBankAndInsurerData"));
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
