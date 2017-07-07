/**
 * CreditsafeCompanyReportFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeCompanyReportFull  implements java.io.Serializable {
    private java.lang.String company_id;

    private org.apache.axis.types.UnsignedLong order_number;

    private java.lang.String language;

    private nl.webservices.www.soap.CreditsafeLtdCompanySummary company_summary;

    private nl.webservices.www.soap.CreditsafeLtdCompanyIdentification company_identification;

    private nl.webservices.www.soap.CreditsafeLtdCreditScore credit_score;

    private nl.webservices.www.soap.CreditsafeLtdContactInformation contact_information;

    private nl.webservices.www.soap.CreditsafeLtdShareCapitalStructure share_capital_structure;

    private nl.webservices.www.soap.CreditsafeLtdDirectors directors;

    private nl.webservices.www.soap.CreditsafeLtdOtherInformation other_information;

    private nl.webservices.www.soap.CreditsafeLtdGroupStructure group_structure;

    private nl.webservices.www.soap.CreditsafeLtdFinancialStatement[] financial_statements;

    private nl.webservices.www.soap.CreditsafeAdditionalInformation additional_information;

    private byte[] document;

    public CreditsafeCompanyReportFull() {
    }

    public CreditsafeCompanyReportFull(
           java.lang.String company_id,
           org.apache.axis.types.UnsignedLong order_number,
           java.lang.String language,
           nl.webservices.www.soap.CreditsafeLtdCompanySummary company_summary,
           nl.webservices.www.soap.CreditsafeLtdCompanyIdentification company_identification,
           nl.webservices.www.soap.CreditsafeLtdCreditScore credit_score,
           nl.webservices.www.soap.CreditsafeLtdContactInformation contact_information,
           nl.webservices.www.soap.CreditsafeLtdShareCapitalStructure share_capital_structure,
           nl.webservices.www.soap.CreditsafeLtdDirectors directors,
           nl.webservices.www.soap.CreditsafeLtdOtherInformation other_information,
           nl.webservices.www.soap.CreditsafeLtdGroupStructure group_structure,
           nl.webservices.www.soap.CreditsafeLtdFinancialStatement[] financial_statements,
           nl.webservices.www.soap.CreditsafeAdditionalInformation additional_information,
           byte[] document) {
           this.company_id = company_id;
           this.order_number = order_number;
           this.language = language;
           this.company_summary = company_summary;
           this.company_identification = company_identification;
           this.credit_score = credit_score;
           this.contact_information = contact_information;
           this.share_capital_structure = share_capital_structure;
           this.directors = directors;
           this.other_information = other_information;
           this.group_structure = group_structure;
           this.financial_statements = financial_statements;
           this.additional_information = additional_information;
           this.document = document;
    }


    /**
     * Gets the company_id value for this CreditsafeCompanyReportFull.
     * 
     * @return company_id
     */
    public java.lang.String getCompany_id() {
        return company_id;
    }


    /**
     * Sets the company_id value for this CreditsafeCompanyReportFull.
     * 
     * @param company_id
     */
    public void setCompany_id(java.lang.String company_id) {
        this.company_id = company_id;
    }


    /**
     * Gets the order_number value for this CreditsafeCompanyReportFull.
     * 
     * @return order_number
     */
    public org.apache.axis.types.UnsignedLong getOrder_number() {
        return order_number;
    }


    /**
     * Sets the order_number value for this CreditsafeCompanyReportFull.
     * 
     * @param order_number
     */
    public void setOrder_number(org.apache.axis.types.UnsignedLong order_number) {
        this.order_number = order_number;
    }


    /**
     * Gets the language value for this CreditsafeCompanyReportFull.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CreditsafeCompanyReportFull.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the company_summary value for this CreditsafeCompanyReportFull.
     * 
     * @return company_summary
     */
    public nl.webservices.www.soap.CreditsafeLtdCompanySummary getCompany_summary() {
        return company_summary;
    }


    /**
     * Sets the company_summary value for this CreditsafeCompanyReportFull.
     * 
     * @param company_summary
     */
    public void setCompany_summary(nl.webservices.www.soap.CreditsafeLtdCompanySummary company_summary) {
        this.company_summary = company_summary;
    }


    /**
     * Gets the company_identification value for this CreditsafeCompanyReportFull.
     * 
     * @return company_identification
     */
    public nl.webservices.www.soap.CreditsafeLtdCompanyIdentification getCompany_identification() {
        return company_identification;
    }


    /**
     * Sets the company_identification value for this CreditsafeCompanyReportFull.
     * 
     * @param company_identification
     */
    public void setCompany_identification(nl.webservices.www.soap.CreditsafeLtdCompanyIdentification company_identification) {
        this.company_identification = company_identification;
    }


    /**
     * Gets the credit_score value for this CreditsafeCompanyReportFull.
     * 
     * @return credit_score
     */
    public nl.webservices.www.soap.CreditsafeLtdCreditScore getCredit_score() {
        return credit_score;
    }


    /**
     * Sets the credit_score value for this CreditsafeCompanyReportFull.
     * 
     * @param credit_score
     */
    public void setCredit_score(nl.webservices.www.soap.CreditsafeLtdCreditScore credit_score) {
        this.credit_score = credit_score;
    }


    /**
     * Gets the contact_information value for this CreditsafeCompanyReportFull.
     * 
     * @return contact_information
     */
    public nl.webservices.www.soap.CreditsafeLtdContactInformation getContact_information() {
        return contact_information;
    }


    /**
     * Sets the contact_information value for this CreditsafeCompanyReportFull.
     * 
     * @param contact_information
     */
    public void setContact_information(nl.webservices.www.soap.CreditsafeLtdContactInformation contact_information) {
        this.contact_information = contact_information;
    }


    /**
     * Gets the share_capital_structure value for this CreditsafeCompanyReportFull.
     * 
     * @return share_capital_structure
     */
    public nl.webservices.www.soap.CreditsafeLtdShareCapitalStructure getShare_capital_structure() {
        return share_capital_structure;
    }


    /**
     * Sets the share_capital_structure value for this CreditsafeCompanyReportFull.
     * 
     * @param share_capital_structure
     */
    public void setShare_capital_structure(nl.webservices.www.soap.CreditsafeLtdShareCapitalStructure share_capital_structure) {
        this.share_capital_structure = share_capital_structure;
    }


    /**
     * Gets the directors value for this CreditsafeCompanyReportFull.
     * 
     * @return directors
     */
    public nl.webservices.www.soap.CreditsafeLtdDirectors getDirectors() {
        return directors;
    }


    /**
     * Sets the directors value for this CreditsafeCompanyReportFull.
     * 
     * @param directors
     */
    public void setDirectors(nl.webservices.www.soap.CreditsafeLtdDirectors directors) {
        this.directors = directors;
    }


    /**
     * Gets the other_information value for this CreditsafeCompanyReportFull.
     * 
     * @return other_information
     */
    public nl.webservices.www.soap.CreditsafeLtdOtherInformation getOther_information() {
        return other_information;
    }


    /**
     * Sets the other_information value for this CreditsafeCompanyReportFull.
     * 
     * @param other_information
     */
    public void setOther_information(nl.webservices.www.soap.CreditsafeLtdOtherInformation other_information) {
        this.other_information = other_information;
    }


    /**
     * Gets the group_structure value for this CreditsafeCompanyReportFull.
     * 
     * @return group_structure
     */
    public nl.webservices.www.soap.CreditsafeLtdGroupStructure getGroup_structure() {
        return group_structure;
    }


    /**
     * Sets the group_structure value for this CreditsafeCompanyReportFull.
     * 
     * @param group_structure
     */
    public void setGroup_structure(nl.webservices.www.soap.CreditsafeLtdGroupStructure group_structure) {
        this.group_structure = group_structure;
    }


    /**
     * Gets the financial_statements value for this CreditsafeCompanyReportFull.
     * 
     * @return financial_statements
     */
    public nl.webservices.www.soap.CreditsafeLtdFinancialStatement[] getFinancial_statements() {
        return financial_statements;
    }


    /**
     * Sets the financial_statements value for this CreditsafeCompanyReportFull.
     * 
     * @param financial_statements
     */
    public void setFinancial_statements(nl.webservices.www.soap.CreditsafeLtdFinancialStatement[] financial_statements) {
        this.financial_statements = financial_statements;
    }


    /**
     * Gets the additional_information value for this CreditsafeCompanyReportFull.
     * 
     * @return additional_information
     */
    public nl.webservices.www.soap.CreditsafeAdditionalInformation getAdditional_information() {
        return additional_information;
    }


    /**
     * Sets the additional_information value for this CreditsafeCompanyReportFull.
     * 
     * @param additional_information
     */
    public void setAdditional_information(nl.webservices.www.soap.CreditsafeAdditionalInformation additional_information) {
        this.additional_information = additional_information;
    }


    /**
     * Gets the document value for this CreditsafeCompanyReportFull.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this CreditsafeCompanyReportFull.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeCompanyReportFull)) return false;
        CreditsafeCompanyReportFull other = (CreditsafeCompanyReportFull) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_id==null && other.getCompany_id()==null) || 
             (this.company_id!=null &&
              this.company_id.equals(other.getCompany_id()))) &&
            ((this.order_number==null && other.getOrder_number()==null) || 
             (this.order_number!=null &&
              this.order_number.equals(other.getOrder_number()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.company_summary==null && other.getCompany_summary()==null) || 
             (this.company_summary!=null &&
              this.company_summary.equals(other.getCompany_summary()))) &&
            ((this.company_identification==null && other.getCompany_identification()==null) || 
             (this.company_identification!=null &&
              this.company_identification.equals(other.getCompany_identification()))) &&
            ((this.credit_score==null && other.getCredit_score()==null) || 
             (this.credit_score!=null &&
              this.credit_score.equals(other.getCredit_score()))) &&
            ((this.contact_information==null && other.getContact_information()==null) || 
             (this.contact_information!=null &&
              this.contact_information.equals(other.getContact_information()))) &&
            ((this.share_capital_structure==null && other.getShare_capital_structure()==null) || 
             (this.share_capital_structure!=null &&
              this.share_capital_structure.equals(other.getShare_capital_structure()))) &&
            ((this.directors==null && other.getDirectors()==null) || 
             (this.directors!=null &&
              this.directors.equals(other.getDirectors()))) &&
            ((this.other_information==null && other.getOther_information()==null) || 
             (this.other_information!=null &&
              this.other_information.equals(other.getOther_information()))) &&
            ((this.group_structure==null && other.getGroup_structure()==null) || 
             (this.group_structure!=null &&
              this.group_structure.equals(other.getGroup_structure()))) &&
            ((this.financial_statements==null && other.getFinancial_statements()==null) || 
             (this.financial_statements!=null &&
              java.util.Arrays.equals(this.financial_statements, other.getFinancial_statements()))) &&
            ((this.additional_information==null && other.getAdditional_information()==null) || 
             (this.additional_information!=null &&
              this.additional_information.equals(other.getAdditional_information()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument())));
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
        if (getCompany_id() != null) {
            _hashCode += getCompany_id().hashCode();
        }
        if (getOrder_number() != null) {
            _hashCode += getOrder_number().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getCompany_summary() != null) {
            _hashCode += getCompany_summary().hashCode();
        }
        if (getCompany_identification() != null) {
            _hashCode += getCompany_identification().hashCode();
        }
        if (getCredit_score() != null) {
            _hashCode += getCredit_score().hashCode();
        }
        if (getContact_information() != null) {
            _hashCode += getContact_information().hashCode();
        }
        if (getShare_capital_structure() != null) {
            _hashCode += getShare_capital_structure().hashCode();
        }
        if (getDirectors() != null) {
            _hashCode += getDirectors().hashCode();
        }
        if (getOther_information() != null) {
            _hashCode += getOther_information().hashCode();
        }
        if (getGroup_structure() != null) {
            _hashCode += getGroup_structure().hashCode();
        }
        if (getFinancial_statements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinancial_statements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinancial_statements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditional_information() != null) {
            _hashCode += getAdditional_information().hashCode();
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeCompanyReportFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyReportFull"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "order_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCompanySummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_identification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCompanyIdentification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCreditScore"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdContactInformation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share_capital_structure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "share_capital_structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdShareCapitalStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "directors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdDirectors"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdOtherInformation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_structure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "group_structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdGroupStructure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_statements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_statements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdFinancialStatement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "additional_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeAdditionalInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
