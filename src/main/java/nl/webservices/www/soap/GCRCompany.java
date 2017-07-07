/**
 * GCRCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompany  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRContactDetails contact_details;

    private nl.webservices.www.soap.GCROfficialData official_data;

    private nl.webservices.www.soap.GCRHistory history;

    private nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry;

    private nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies;

    private nl.webservices.www.soap.GCRAnnualFigures[] annual_figures;

    private nl.webservices.www.soap.GCRFinancialDetails financial_details;

    private nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities;

    public GCRCompany() {
    }

    public GCRCompany(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRContactDetails contact_details,
           nl.webservices.www.soap.GCROfficialData official_data,
           nl.webservices.www.soap.GCRHistory history,
           nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry,
           nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies,
           nl.webservices.www.soap.GCRAnnualFigures[] annual_figures,
           nl.webservices.www.soap.GCRFinancialDetails financial_details,
           nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.official_data = official_data;
           this.history = history;
           this.sectors_of_industry = sectors_of_industry;
           this.positions_in_other_companies = positions_in_other_companies;
           this.annual_figures = annual_figures;
           this.financial_details = financial_details;
           this.financial_calamities = financial_calamities;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompany.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompany.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRCompany.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRCompany.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the official_data value for this GCRCompany.
     * 
     * @return official_data
     */
    public nl.webservices.www.soap.GCROfficialData getOfficial_data() {
        return official_data;
    }


    /**
     * Sets the official_data value for this GCRCompany.
     * 
     * @param official_data
     */
    public void setOfficial_data(nl.webservices.www.soap.GCROfficialData official_data) {
        this.official_data = official_data;
    }


    /**
     * Gets the history value for this GCRCompany.
     * 
     * @return history
     */
    public nl.webservices.www.soap.GCRHistory getHistory() {
        return history;
    }


    /**
     * Sets the history value for this GCRCompany.
     * 
     * @param history
     */
    public void setHistory(nl.webservices.www.soap.GCRHistory history) {
        this.history = history;
    }


    /**
     * Gets the sectors_of_industry value for this GCRCompany.
     * 
     * @return sectors_of_industry
     */
    public nl.webservices.www.soap.GCRSectorOfIndustry[] getSectors_of_industry() {
        return sectors_of_industry;
    }


    /**
     * Sets the sectors_of_industry value for this GCRCompany.
     * 
     * @param sectors_of_industry
     */
    public void setSectors_of_industry(nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry) {
        this.sectors_of_industry = sectors_of_industry;
    }


    /**
     * Gets the positions_in_other_companies value for this GCRCompany.
     * 
     * @return positions_in_other_companies
     */
    public nl.webservices.www.soap.GCRJobTitle[] getPositions_in_other_companies() {
        return positions_in_other_companies;
    }


    /**
     * Sets the positions_in_other_companies value for this GCRCompany.
     * 
     * @param positions_in_other_companies
     */
    public void setPositions_in_other_companies(nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies) {
        this.positions_in_other_companies = positions_in_other_companies;
    }


    /**
     * Gets the annual_figures value for this GCRCompany.
     * 
     * @return annual_figures
     */
    public nl.webservices.www.soap.GCRAnnualFigures[] getAnnual_figures() {
        return annual_figures;
    }


    /**
     * Sets the annual_figures value for this GCRCompany.
     * 
     * @param annual_figures
     */
    public void setAnnual_figures(nl.webservices.www.soap.GCRAnnualFigures[] annual_figures) {
        this.annual_figures = annual_figures;
    }


    /**
     * Gets the financial_details value for this GCRCompany.
     * 
     * @return financial_details
     */
    public nl.webservices.www.soap.GCRFinancialDetails getFinancial_details() {
        return financial_details;
    }


    /**
     * Sets the financial_details value for this GCRCompany.
     * 
     * @param financial_details
     */
    public void setFinancial_details(nl.webservices.www.soap.GCRFinancialDetails financial_details) {
        this.financial_details = financial_details;
    }


    /**
     * Gets the financial_calamities value for this GCRCompany.
     * 
     * @return financial_calamities
     */
    public nl.webservices.www.soap.GCRFinancialCalamity[] getFinancial_calamities() {
        return financial_calamities;
    }


    /**
     * Sets the financial_calamities value for this GCRCompany.
     * 
     * @param financial_calamities
     */
    public void setFinancial_calamities(nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
        this.financial_calamities = financial_calamities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompany)) return false;
        GCRCompany other = (GCRCompany) obj;
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
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              this.history.equals(other.getHistory()))) &&
            ((this.sectors_of_industry==null && other.getSectors_of_industry()==null) || 
             (this.sectors_of_industry!=null &&
              java.util.Arrays.equals(this.sectors_of_industry, other.getSectors_of_industry()))) &&
            ((this.positions_in_other_companies==null && other.getPositions_in_other_companies()==null) || 
             (this.positions_in_other_companies!=null &&
              java.util.Arrays.equals(this.positions_in_other_companies, other.getPositions_in_other_companies()))) &&
            ((this.annual_figures==null && other.getAnnual_figures()==null) || 
             (this.annual_figures!=null &&
              java.util.Arrays.equals(this.annual_figures, other.getAnnual_figures()))) &&
            ((this.financial_details==null && other.getFinancial_details()==null) || 
             (this.financial_details!=null &&
              this.financial_details.equals(other.getFinancial_details()))) &&
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
        if (getHistory() != null) {
            _hashCode += getHistory().hashCode();
        }
        if (getSectors_of_industry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSectors_of_industry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSectors_of_industry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPositions_in_other_companies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPositions_in_other_companies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPositions_in_other_companies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnual_figures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnual_figures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnual_figures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinancial_details() != null) {
            _hashCode += getFinancial_details().hashCode();
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
        new org.apache.axis.description.TypeDesc(GCRCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCROfficialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectors_of_industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sectors_of_industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSectorOfIndustry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positions_in_other_companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "positions_in_other_companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRJobTitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_figures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_figures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAnnualFigures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialDetails"));
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
