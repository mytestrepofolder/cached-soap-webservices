/**
 * GCRCompanyItself.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyItself  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRContactDetails contact_details;

    private nl.webservices.www.soap.GCROfficialData official_data;

    private nl.webservices.www.soap.GCRHistory history;

    private nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies;

    private nl.webservices.www.soap.GCRAnnualFigures[] annual_figures;

    private nl.webservices.www.soap.GCRFinancialDetails financial_details;

    private nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities;

    private nl.webservices.www.soap.GCRPersonnel personnel;

    private nl.webservices.www.soap.GCRCreditAdviceData credit_advice_data;

    private nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry;

    private nl.webservices.www.soap.GCRCalamity calamity;

    private nl.webservices.www.soap.GCRPaymentInformation[] payment_information;

    private nl.webservices.www.soap.GCRDeclarationOfLiability[] declarations_of_liability;

    private nl.webservices.www.soap.GCRLiaison[] concern_liaisons;

    private nl.webservices.www.soap.GCRCompanyManagement company_management;

    public GCRCompanyItself() {
    }

    public GCRCompanyItself(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRContactDetails contact_details,
           nl.webservices.www.soap.GCROfficialData official_data,
           nl.webservices.www.soap.GCRHistory history,
           nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies,
           nl.webservices.www.soap.GCRAnnualFigures[] annual_figures,
           nl.webservices.www.soap.GCRFinancialDetails financial_details,
           nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities,
           nl.webservices.www.soap.GCRPersonnel personnel,
           nl.webservices.www.soap.GCRCreditAdviceData credit_advice_data,
           nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry,
           nl.webservices.www.soap.GCRCalamity calamity,
           nl.webservices.www.soap.GCRPaymentInformation[] payment_information,
           nl.webservices.www.soap.GCRDeclarationOfLiability[] declarations_of_liability,
           nl.webservices.www.soap.GCRLiaison[] concern_liaisons,
           nl.webservices.www.soap.GCRCompanyManagement company_management) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.official_data = official_data;
           this.history = history;
           this.positions_in_other_companies = positions_in_other_companies;
           this.annual_figures = annual_figures;
           this.financial_details = financial_details;
           this.financial_calamities = financial_calamities;
           this.personnel = personnel;
           this.credit_advice_data = credit_advice_data;
           this.sectors_of_industry = sectors_of_industry;
           this.calamity = calamity;
           this.payment_information = payment_information;
           this.declarations_of_liability = declarations_of_liability;
           this.concern_liaisons = concern_liaisons;
           this.company_management = company_management;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompanyItself.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompanyItself.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRCompanyItself.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRCompanyItself.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the official_data value for this GCRCompanyItself.
     * 
     * @return official_data
     */
    public nl.webservices.www.soap.GCROfficialData getOfficial_data() {
        return official_data;
    }


    /**
     * Sets the official_data value for this GCRCompanyItself.
     * 
     * @param official_data
     */
    public void setOfficial_data(nl.webservices.www.soap.GCROfficialData official_data) {
        this.official_data = official_data;
    }


    /**
     * Gets the history value for this GCRCompanyItself.
     * 
     * @return history
     */
    public nl.webservices.www.soap.GCRHistory getHistory() {
        return history;
    }


    /**
     * Sets the history value for this GCRCompanyItself.
     * 
     * @param history
     */
    public void setHistory(nl.webservices.www.soap.GCRHistory history) {
        this.history = history;
    }


    /**
     * Gets the positions_in_other_companies value for this GCRCompanyItself.
     * 
     * @return positions_in_other_companies
     */
    public nl.webservices.www.soap.GCRJobTitle[] getPositions_in_other_companies() {
        return positions_in_other_companies;
    }


    /**
     * Sets the positions_in_other_companies value for this GCRCompanyItself.
     * 
     * @param positions_in_other_companies
     */
    public void setPositions_in_other_companies(nl.webservices.www.soap.GCRJobTitle[] positions_in_other_companies) {
        this.positions_in_other_companies = positions_in_other_companies;
    }


    /**
     * Gets the annual_figures value for this GCRCompanyItself.
     * 
     * @return annual_figures
     */
    public nl.webservices.www.soap.GCRAnnualFigures[] getAnnual_figures() {
        return annual_figures;
    }


    /**
     * Sets the annual_figures value for this GCRCompanyItself.
     * 
     * @param annual_figures
     */
    public void setAnnual_figures(nl.webservices.www.soap.GCRAnnualFigures[] annual_figures) {
        this.annual_figures = annual_figures;
    }


    /**
     * Gets the financial_details value for this GCRCompanyItself.
     * 
     * @return financial_details
     */
    public nl.webservices.www.soap.GCRFinancialDetails getFinancial_details() {
        return financial_details;
    }


    /**
     * Sets the financial_details value for this GCRCompanyItself.
     * 
     * @param financial_details
     */
    public void setFinancial_details(nl.webservices.www.soap.GCRFinancialDetails financial_details) {
        this.financial_details = financial_details;
    }


    /**
     * Gets the financial_calamities value for this GCRCompanyItself.
     * 
     * @return financial_calamities
     */
    public nl.webservices.www.soap.GCRFinancialCalamity[] getFinancial_calamities() {
        return financial_calamities;
    }


    /**
     * Sets the financial_calamities value for this GCRCompanyItself.
     * 
     * @param financial_calamities
     */
    public void setFinancial_calamities(nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
        this.financial_calamities = financial_calamities;
    }


    /**
     * Gets the personnel value for this GCRCompanyItself.
     * 
     * @return personnel
     */
    public nl.webservices.www.soap.GCRPersonnel getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this GCRCompanyItself.
     * 
     * @param personnel
     */
    public void setPersonnel(nl.webservices.www.soap.GCRPersonnel personnel) {
        this.personnel = personnel;
    }


    /**
     * Gets the credit_advice_data value for this GCRCompanyItself.
     * 
     * @return credit_advice_data
     */
    public nl.webservices.www.soap.GCRCreditAdviceData getCredit_advice_data() {
        return credit_advice_data;
    }


    /**
     * Sets the credit_advice_data value for this GCRCompanyItself.
     * 
     * @param credit_advice_data
     */
    public void setCredit_advice_data(nl.webservices.www.soap.GCRCreditAdviceData credit_advice_data) {
        this.credit_advice_data = credit_advice_data;
    }


    /**
     * Gets the sectors_of_industry value for this GCRCompanyItself.
     * 
     * @return sectors_of_industry
     */
    public nl.webservices.www.soap.GCRSectorOfIndustry[] getSectors_of_industry() {
        return sectors_of_industry;
    }


    /**
     * Sets the sectors_of_industry value for this GCRCompanyItself.
     * 
     * @param sectors_of_industry
     */
    public void setSectors_of_industry(nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry) {
        this.sectors_of_industry = sectors_of_industry;
    }


    /**
     * Gets the calamity value for this GCRCompanyItself.
     * 
     * @return calamity
     */
    public nl.webservices.www.soap.GCRCalamity getCalamity() {
        return calamity;
    }


    /**
     * Sets the calamity value for this GCRCompanyItself.
     * 
     * @param calamity
     */
    public void setCalamity(nl.webservices.www.soap.GCRCalamity calamity) {
        this.calamity = calamity;
    }


    /**
     * Gets the payment_information value for this GCRCompanyItself.
     * 
     * @return payment_information
     */
    public nl.webservices.www.soap.GCRPaymentInformation[] getPayment_information() {
        return payment_information;
    }


    /**
     * Sets the payment_information value for this GCRCompanyItself.
     * 
     * @param payment_information
     */
    public void setPayment_information(nl.webservices.www.soap.GCRPaymentInformation[] payment_information) {
        this.payment_information = payment_information;
    }


    /**
     * Gets the declarations_of_liability value for this GCRCompanyItself.
     * 
     * @return declarations_of_liability
     */
    public nl.webservices.www.soap.GCRDeclarationOfLiability[] getDeclarations_of_liability() {
        return declarations_of_liability;
    }


    /**
     * Sets the declarations_of_liability value for this GCRCompanyItself.
     * 
     * @param declarations_of_liability
     */
    public void setDeclarations_of_liability(nl.webservices.www.soap.GCRDeclarationOfLiability[] declarations_of_liability) {
        this.declarations_of_liability = declarations_of_liability;
    }


    /**
     * Gets the concern_liaisons value for this GCRCompanyItself.
     * 
     * @return concern_liaisons
     */
    public nl.webservices.www.soap.GCRLiaison[] getConcern_liaisons() {
        return concern_liaisons;
    }


    /**
     * Sets the concern_liaisons value for this GCRCompanyItself.
     * 
     * @param concern_liaisons
     */
    public void setConcern_liaisons(nl.webservices.www.soap.GCRLiaison[] concern_liaisons) {
        this.concern_liaisons = concern_liaisons;
    }


    /**
     * Gets the company_management value for this GCRCompanyItself.
     * 
     * @return company_management
     */
    public nl.webservices.www.soap.GCRCompanyManagement getCompany_management() {
        return company_management;
    }


    /**
     * Sets the company_management value for this GCRCompanyItself.
     * 
     * @param company_management
     */
    public void setCompany_management(nl.webservices.www.soap.GCRCompanyManagement company_management) {
        this.company_management = company_management;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyItself)) return false;
        GCRCompanyItself other = (GCRCompanyItself) obj;
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
              java.util.Arrays.equals(this.financial_calamities, other.getFinancial_calamities()))) &&
            ((this.personnel==null && other.getPersonnel()==null) || 
             (this.personnel!=null &&
              this.personnel.equals(other.getPersonnel()))) &&
            ((this.credit_advice_data==null && other.getCredit_advice_data()==null) || 
             (this.credit_advice_data!=null &&
              this.credit_advice_data.equals(other.getCredit_advice_data()))) &&
            ((this.sectors_of_industry==null && other.getSectors_of_industry()==null) || 
             (this.sectors_of_industry!=null &&
              java.util.Arrays.equals(this.sectors_of_industry, other.getSectors_of_industry()))) &&
            ((this.calamity==null && other.getCalamity()==null) || 
             (this.calamity!=null &&
              this.calamity.equals(other.getCalamity()))) &&
            ((this.payment_information==null && other.getPayment_information()==null) || 
             (this.payment_information!=null &&
              java.util.Arrays.equals(this.payment_information, other.getPayment_information()))) &&
            ((this.declarations_of_liability==null && other.getDeclarations_of_liability()==null) || 
             (this.declarations_of_liability!=null &&
              java.util.Arrays.equals(this.declarations_of_liability, other.getDeclarations_of_liability()))) &&
            ((this.concern_liaisons==null && other.getConcern_liaisons()==null) || 
             (this.concern_liaisons!=null &&
              java.util.Arrays.equals(this.concern_liaisons, other.getConcern_liaisons()))) &&
            ((this.company_management==null && other.getCompany_management()==null) || 
             (this.company_management!=null &&
              this.company_management.equals(other.getCompany_management())));
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
        if (getPersonnel() != null) {
            _hashCode += getPersonnel().hashCode();
        }
        if (getCredit_advice_data() != null) {
            _hashCode += getCredit_advice_data().hashCode();
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
        if (getCalamity() != null) {
            _hashCode += getCalamity().hashCode();
        }
        if (getPayment_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayment_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayment_information(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeclarations_of_liability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeclarations_of_liability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeclarations_of_liability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getCompany_management() != null) {
            _hashCode += getCompany_management().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCompanyItself.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyItself"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditAdviceData"));
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
        elemField.setFieldName("calamity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calamity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPaymentInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarations_of_liability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "declarations_of_liability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDeclarationOfLiability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concern_liaisons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "concern_liaisons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaison"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_management");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_management"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyManagement"));
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
