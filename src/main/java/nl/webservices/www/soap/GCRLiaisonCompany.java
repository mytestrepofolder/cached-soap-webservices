/**
 * GCRLiaisonCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRLiaisonCompany  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRLiaisonContactDetails contact_details;

    private nl.webservices.www.soap.GCRLiaisonOfficialData official_data;

    private nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities;

    public GCRLiaisonCompany() {
    }

    public GCRLiaisonCompany(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRLiaisonContactDetails contact_details,
           nl.webservices.www.soap.GCRLiaisonOfficialData official_data,
           nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.official_data = official_data;
           this.financial_calamities = financial_calamities;
    }


    /**
     * Gets the graydon_company_id value for this GCRLiaisonCompany.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRLiaisonCompany.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRLiaisonCompany.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRLiaisonContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRLiaisonCompany.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRLiaisonContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the official_data value for this GCRLiaisonCompany.
     * 
     * @return official_data
     */
    public nl.webservices.www.soap.GCRLiaisonOfficialData getOfficial_data() {
        return official_data;
    }


    /**
     * Sets the official_data value for this GCRLiaisonCompany.
     * 
     * @param official_data
     */
    public void setOfficial_data(nl.webservices.www.soap.GCRLiaisonOfficialData official_data) {
        this.official_data = official_data;
    }


    /**
     * Gets the financial_calamities value for this GCRLiaisonCompany.
     * 
     * @return financial_calamities
     */
    public nl.webservices.www.soap.GCRFinancialCalamity[] getFinancial_calamities() {
        return financial_calamities;
    }


    /**
     * Sets the financial_calamities value for this GCRLiaisonCompany.
     * 
     * @param financial_calamities
     */
    public void setFinancial_calamities(nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
        this.financial_calamities = financial_calamities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRLiaisonCompany)) return false;
        GCRLiaisonCompany other = (GCRLiaisonCompany) obj;
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
            ((this.contact_details==null && other.getContact_details()==null) || 
             (this.contact_details!=null &&
              this.contact_details.equals(other.getContact_details()))) &&
            ((this.official_data==null && other.getOfficial_data()==null) || 
             (this.official_data!=null &&
              this.official_data.equals(other.getOfficial_data()))) &&
            ((this.financial_calamities==null && other.getFinancial_calamities()==null) || 
             (this.financial_calamities!=null &&
              java.util.Arrays.equals(this.financial_calamities, other.getFinancial_calamities())));
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
        if (getContact_details() != null) {
            _hashCode += getContact_details().hashCode();
        }
        if (getOfficial_data() != null) {
            _hashCode += getOfficial_data().hashCode();
        }
        if (getFinancial_calamities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinancial_calamities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinancial_calamities(), i);
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
        new org.apache.axis.description.TypeDesc(GCRLiaisonCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaisonCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaisonContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaisonOfficialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_calamities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_calamities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialCalamity"));
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
