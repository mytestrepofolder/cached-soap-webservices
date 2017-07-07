/**
 * GCRCompanyItselfCalamity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyItselfCalamity  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRContactDetails contact_details;

    private nl.webservices.www.soap.GCROfficialData official_data;

    private nl.webservices.www.soap.GCRHistory history;

    private nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry;

    private nl.webservices.www.soap.GCRShareHolder[] share_holders;

    private nl.webservices.www.soap.GCRBranchOffice[] branch_offices;

    private nl.webservices.www.soap.GCRParticipation[] participations;

    private nl.webservices.www.soap.GCRImportExport import_export;

    private nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information;

    private nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities;

    private nl.webservices.www.soap.GCRLiaison[] concern_liaisons;

    private nl.webservices.www.soap.GCRCompanyManagement company_management;

    public GCRCompanyItselfCalamity() {
    }

    public GCRCompanyItselfCalamity(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRContactDetails contact_details,
           nl.webservices.www.soap.GCROfficialData official_data,
           nl.webservices.www.soap.GCRHistory history,
           nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry,
           nl.webservices.www.soap.GCRShareHolder[] share_holders,
           nl.webservices.www.soap.GCRBranchOffice[] branch_offices,
           nl.webservices.www.soap.GCRParticipation[] participations,
           nl.webservices.www.soap.GCRImportExport import_export,
           nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information,
           nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities,
           nl.webservices.www.soap.GCRLiaison[] concern_liaisons,
           nl.webservices.www.soap.GCRCompanyManagement company_management) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.official_data = official_data;
           this.history = history;
           this.sectors_of_industry = sectors_of_industry;
           this.share_holders = share_holders;
           this.branch_offices = branch_offices;
           this.participations = participations;
           this.import_export = import_export;
           this.special_company_information = special_company_information;
           this.financial_calamities = financial_calamities;
           this.concern_liaisons = concern_liaisons;
           this.company_management = company_management;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompanyItselfCalamity.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompanyItselfCalamity.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRCompanyItselfCalamity.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRCompanyItselfCalamity.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the official_data value for this GCRCompanyItselfCalamity.
     * 
     * @return official_data
     */
    public nl.webservices.www.soap.GCROfficialData getOfficial_data() {
        return official_data;
    }


    /**
     * Sets the official_data value for this GCRCompanyItselfCalamity.
     * 
     * @param official_data
     */
    public void setOfficial_data(nl.webservices.www.soap.GCROfficialData official_data) {
        this.official_data = official_data;
    }


    /**
     * Gets the history value for this GCRCompanyItselfCalamity.
     * 
     * @return history
     */
    public nl.webservices.www.soap.GCRHistory getHistory() {
        return history;
    }


    /**
     * Sets the history value for this GCRCompanyItselfCalamity.
     * 
     * @param history
     */
    public void setHistory(nl.webservices.www.soap.GCRHistory history) {
        this.history = history;
    }


    /**
     * Gets the sectors_of_industry value for this GCRCompanyItselfCalamity.
     * 
     * @return sectors_of_industry
     */
    public nl.webservices.www.soap.GCRSectorOfIndustry[] getSectors_of_industry() {
        return sectors_of_industry;
    }


    /**
     * Sets the sectors_of_industry value for this GCRCompanyItselfCalamity.
     * 
     * @param sectors_of_industry
     */
    public void setSectors_of_industry(nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry) {
        this.sectors_of_industry = sectors_of_industry;
    }


    /**
     * Gets the share_holders value for this GCRCompanyItselfCalamity.
     * 
     * @return share_holders
     */
    public nl.webservices.www.soap.GCRShareHolder[] getShare_holders() {
        return share_holders;
    }


    /**
     * Sets the share_holders value for this GCRCompanyItselfCalamity.
     * 
     * @param share_holders
     */
    public void setShare_holders(nl.webservices.www.soap.GCRShareHolder[] share_holders) {
        this.share_holders = share_holders;
    }


    /**
     * Gets the branch_offices value for this GCRCompanyItselfCalamity.
     * 
     * @return branch_offices
     */
    public nl.webservices.www.soap.GCRBranchOffice[] getBranch_offices() {
        return branch_offices;
    }


    /**
     * Sets the branch_offices value for this GCRCompanyItselfCalamity.
     * 
     * @param branch_offices
     */
    public void setBranch_offices(nl.webservices.www.soap.GCRBranchOffice[] branch_offices) {
        this.branch_offices = branch_offices;
    }


    /**
     * Gets the participations value for this GCRCompanyItselfCalamity.
     * 
     * @return participations
     */
    public nl.webservices.www.soap.GCRParticipation[] getParticipations() {
        return participations;
    }


    /**
     * Sets the participations value for this GCRCompanyItselfCalamity.
     * 
     * @param participations
     */
    public void setParticipations(nl.webservices.www.soap.GCRParticipation[] participations) {
        this.participations = participations;
    }


    /**
     * Gets the import_export value for this GCRCompanyItselfCalamity.
     * 
     * @return import_export
     */
    public nl.webservices.www.soap.GCRImportExport getImport_export() {
        return import_export;
    }


    /**
     * Sets the import_export value for this GCRCompanyItselfCalamity.
     * 
     * @param import_export
     */
    public void setImport_export(nl.webservices.www.soap.GCRImportExport import_export) {
        this.import_export = import_export;
    }


    /**
     * Gets the special_company_information value for this GCRCompanyItselfCalamity.
     * 
     * @return special_company_information
     */
    public nl.webservices.www.soap.GCRSpecialCompanyInformation[] getSpecial_company_information() {
        return special_company_information;
    }


    /**
     * Sets the special_company_information value for this GCRCompanyItselfCalamity.
     * 
     * @param special_company_information
     */
    public void setSpecial_company_information(nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information) {
        this.special_company_information = special_company_information;
    }


    /**
     * Gets the financial_calamities value for this GCRCompanyItselfCalamity.
     * 
     * @return financial_calamities
     */
    public nl.webservices.www.soap.GCRFinancialCalamity[] getFinancial_calamities() {
        return financial_calamities;
    }


    /**
     * Sets the financial_calamities value for this GCRCompanyItselfCalamity.
     * 
     * @param financial_calamities
     */
    public void setFinancial_calamities(nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
        this.financial_calamities = financial_calamities;
    }


    /**
     * Gets the concern_liaisons value for this GCRCompanyItselfCalamity.
     * 
     * @return concern_liaisons
     */
    public nl.webservices.www.soap.GCRLiaison[] getConcern_liaisons() {
        return concern_liaisons;
    }


    /**
     * Sets the concern_liaisons value for this GCRCompanyItselfCalamity.
     * 
     * @param concern_liaisons
     */
    public void setConcern_liaisons(nl.webservices.www.soap.GCRLiaison[] concern_liaisons) {
        this.concern_liaisons = concern_liaisons;
    }


    /**
     * Gets the company_management value for this GCRCompanyItselfCalamity.
     * 
     * @return company_management
     */
    public nl.webservices.www.soap.GCRCompanyManagement getCompany_management() {
        return company_management;
    }


    /**
     * Sets the company_management value for this GCRCompanyItselfCalamity.
     * 
     * @param company_management
     */
    public void setCompany_management(nl.webservices.www.soap.GCRCompanyManagement company_management) {
        this.company_management = company_management;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyItselfCalamity)) return false;
        GCRCompanyItselfCalamity other = (GCRCompanyItselfCalamity) obj;
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
            ((this.share_holders==null && other.getShare_holders()==null) || 
             (this.share_holders!=null &&
              java.util.Arrays.equals(this.share_holders, other.getShare_holders()))) &&
            ((this.branch_offices==null && other.getBranch_offices()==null) || 
             (this.branch_offices!=null &&
              java.util.Arrays.equals(this.branch_offices, other.getBranch_offices()))) &&
            ((this.participations==null && other.getParticipations()==null) || 
             (this.participations!=null &&
              java.util.Arrays.equals(this.participations, other.getParticipations()))) &&
            ((this.import_export==null && other.getImport_export()==null) || 
             (this.import_export!=null &&
              this.import_export.equals(other.getImport_export()))) &&
            ((this.special_company_information==null && other.getSpecial_company_information()==null) || 
             (this.special_company_information!=null &&
              java.util.Arrays.equals(this.special_company_information, other.getSpecial_company_information()))) &&
            ((this.financial_calamities==null && other.getFinancial_calamities()==null) || 
             (this.financial_calamities!=null &&
              java.util.Arrays.equals(this.financial_calamities, other.getFinancial_calamities()))) &&
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
        if (getShare_holders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShare_holders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShare_holders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBranch_offices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBranch_offices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBranch_offices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParticipations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParticipations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParticipations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImport_export() != null) {
            _hashCode += getImport_export().hashCode();
        }
        if (getSpecial_company_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecial_company_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecial_company_information(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GCRCompanyItselfCalamity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyItselfCalamity"));
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
        elemField.setFieldName("share_holders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "share_holders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRShareHolder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch_offices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "branch_offices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBranchOffice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "participations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRParticipation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_export");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "import_export"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRImportExport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_company_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "special_company_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSpecialCompanyInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
