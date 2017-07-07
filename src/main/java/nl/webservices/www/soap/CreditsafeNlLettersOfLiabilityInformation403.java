/**
 * CreditsafeNlLettersOfLiabilityInformation403.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlLettersOfLiabilityInformation403  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt financial_year;

    private java.lang.String company_name;

    private org.apache.axis.types.UnsignedInt company_number;

    private java.util.Calendar date_submitted;

    private nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability;

    private nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability_2Nd_parent;

    public CreditsafeNlLettersOfLiabilityInformation403() {
    }

    public CreditsafeNlLettersOfLiabilityInformation403(
           org.apache.axis.types.UnsignedInt financial_year,
           java.lang.String company_name,
           org.apache.axis.types.UnsignedInt company_number,
           java.util.Calendar date_submitted,
           nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability,
           nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability_2Nd_parent) {
           this.financial_year = financial_year;
           this.company_name = company_name;
           this.company_number = company_number;
           this.date_submitted = date_submitted;
           this.letters_of_liability = letters_of_liability;
           this.letters_of_liability_2Nd_parent = letters_of_liability_2Nd_parent;
    }


    /**
     * Gets the financial_year value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return financial_year
     */
    public org.apache.axis.types.UnsignedInt getFinancial_year() {
        return financial_year;
    }


    /**
     * Sets the financial_year value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param financial_year
     */
    public void setFinancial_year(org.apache.axis.types.UnsignedInt financial_year) {
        this.financial_year = financial_year;
    }


    /**
     * Gets the company_name value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the company_number value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return company_number
     */
    public org.apache.axis.types.UnsignedInt getCompany_number() {
        return company_number;
    }


    /**
     * Sets the company_number value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param company_number
     */
    public void setCompany_number(org.apache.axis.types.UnsignedInt company_number) {
        this.company_number = company_number;
    }


    /**
     * Gets the date_submitted value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return date_submitted
     */
    public java.util.Calendar getDate_submitted() {
        return date_submitted;
    }


    /**
     * Sets the date_submitted value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param date_submitted
     */
    public void setDate_submitted(java.util.Calendar date_submitted) {
        this.date_submitted = date_submitted;
    }


    /**
     * Gets the letters_of_liability value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return letters_of_liability
     */
    public nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] getLetters_of_liability() {
        return letters_of_liability;
    }


    /**
     * Sets the letters_of_liability value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param letters_of_liability
     */
    public void setLetters_of_liability(nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability) {
        this.letters_of_liability = letters_of_liability;
    }


    /**
     * Gets the letters_of_liability_2Nd_parent value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @return letters_of_liability_2Nd_parent
     */
    public nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] getLetters_of_liability_2Nd_parent() {
        return letters_of_liability_2Nd_parent;
    }


    /**
     * Sets the letters_of_liability_2Nd_parent value for this CreditsafeNlLettersOfLiabilityInformation403.
     * 
     * @param letters_of_liability_2Nd_parent
     */
    public void setLetters_of_liability_2Nd_parent(nl.webservices.www.soap.CreditsafeNlLettersOfLiability[] letters_of_liability_2Nd_parent) {
        this.letters_of_liability_2Nd_parent = letters_of_liability_2Nd_parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlLettersOfLiabilityInformation403)) return false;
        CreditsafeNlLettersOfLiabilityInformation403 other = (CreditsafeNlLettersOfLiabilityInformation403) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.financial_year==null && other.getFinancial_year()==null) || 
             (this.financial_year!=null &&
              this.financial_year.equals(other.getFinancial_year()))) &&
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
            ((this.company_number==null && other.getCompany_number()==null) || 
             (this.company_number!=null &&
              this.company_number.equals(other.getCompany_number()))) &&
            ((this.date_submitted==null && other.getDate_submitted()==null) || 
             (this.date_submitted!=null &&
              this.date_submitted.equals(other.getDate_submitted()))) &&
            ((this.letters_of_liability==null && other.getLetters_of_liability()==null) || 
             (this.letters_of_liability!=null &&
              java.util.Arrays.equals(this.letters_of_liability, other.getLetters_of_liability()))) &&
            ((this.letters_of_liability_2Nd_parent==null && other.getLetters_of_liability_2Nd_parent()==null) || 
             (this.letters_of_liability_2Nd_parent!=null &&
              java.util.Arrays.equals(this.letters_of_liability_2Nd_parent, other.getLetters_of_liability_2Nd_parent())));
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
        if (getFinancial_year() != null) {
            _hashCode += getFinancial_year().hashCode();
        }
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
        }
        if (getCompany_number() != null) {
            _hashCode += getCompany_number().hashCode();
        }
        if (getDate_submitted() != null) {
            _hashCode += getDate_submitted().hashCode();
        }
        if (getLetters_of_liability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLetters_of_liability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLetters_of_liability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLetters_of_liability_2Nd_parent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLetters_of_liability_2Nd_parent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLetters_of_liability_2Nd_parent(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeNlLettersOfLiabilityInformation403.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlLettersOfLiabilityInformation403"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_submitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letters_of_liability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "letters_of_liability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlLettersOfLiability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letters_of_liability_2Nd_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "letters_of_liability_2nd_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlLettersOfLiability"));
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
