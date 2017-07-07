/**
 * DNBBusinessVerification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBBusinessVerification  implements java.io.Serializable {
    private java.lang.String duns;

    private java.lang.String dnb_key;

    private java.lang.String enquiry_duns;

    private java.lang.String business_number;

    private java.lang.String business_number_type;

    private java.lang.String business_number_description;

    private java.lang.String trade_name;

    private java.lang.String[] address;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String region;

    private java.lang.String subregion;

    private java.lang.String country_calling_code;

    private java.lang.String phone_number;

    private java.lang.String fax_number;

    private java.lang.String country;

    private java.lang.Boolean main_branch_indication;

    private java.lang.Boolean out_of_business;

    private java.lang.Integer incorporation_year;

    private java.lang.Integer start_year;

    private java.lang.String sic_activity_code;

    private java.lang.String sic_activity_description;

    private java.lang.String sic_version;

    private java.lang.String[] trade_names;

    public DNBBusinessVerification() {
    }

    public DNBBusinessVerification(
           java.lang.String duns,
           java.lang.String dnb_key,
           java.lang.String enquiry_duns,
           java.lang.String business_number,
           java.lang.String business_number_type,
           java.lang.String business_number_description,
           java.lang.String trade_name,
           java.lang.String[] address,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String region,
           java.lang.String subregion,
           java.lang.String country_calling_code,
           java.lang.String phone_number,
           java.lang.String fax_number,
           java.lang.String country,
           java.lang.Boolean main_branch_indication,
           java.lang.Boolean out_of_business,
           java.lang.Integer incorporation_year,
           java.lang.Integer start_year,
           java.lang.String sic_activity_code,
           java.lang.String sic_activity_description,
           java.lang.String sic_version,
           java.lang.String[] trade_names) {
           this.duns = duns;
           this.dnb_key = dnb_key;
           this.enquiry_duns = enquiry_duns;
           this.business_number = business_number;
           this.business_number_type = business_number_type;
           this.business_number_description = business_number_description;
           this.trade_name = trade_name;
           this.address = address;
           this.postcode = postcode;
           this.city = city;
           this.region = region;
           this.subregion = subregion;
           this.country_calling_code = country_calling_code;
           this.phone_number = phone_number;
           this.fax_number = fax_number;
           this.country = country;
           this.main_branch_indication = main_branch_indication;
           this.out_of_business = out_of_business;
           this.incorporation_year = incorporation_year;
           this.start_year = start_year;
           this.sic_activity_code = sic_activity_code;
           this.sic_activity_description = sic_activity_description;
           this.sic_version = sic_version;
           this.trade_names = trade_names;
    }


    /**
     * Gets the duns value for this DNBBusinessVerification.
     * 
     * @return duns
     */
    public java.lang.String getDuns() {
        return duns;
    }


    /**
     * Sets the duns value for this DNBBusinessVerification.
     * 
     * @param duns
     */
    public void setDuns(java.lang.String duns) {
        this.duns = duns;
    }


    /**
     * Gets the dnb_key value for this DNBBusinessVerification.
     * 
     * @return dnb_key
     */
    public java.lang.String getDnb_key() {
        return dnb_key;
    }


    /**
     * Sets the dnb_key value for this DNBBusinessVerification.
     * 
     * @param dnb_key
     */
    public void setDnb_key(java.lang.String dnb_key) {
        this.dnb_key = dnb_key;
    }


    /**
     * Gets the enquiry_duns value for this DNBBusinessVerification.
     * 
     * @return enquiry_duns
     */
    public java.lang.String getEnquiry_duns() {
        return enquiry_duns;
    }


    /**
     * Sets the enquiry_duns value for this DNBBusinessVerification.
     * 
     * @param enquiry_duns
     */
    public void setEnquiry_duns(java.lang.String enquiry_duns) {
        this.enquiry_duns = enquiry_duns;
    }


    /**
     * Gets the business_number value for this DNBBusinessVerification.
     * 
     * @return business_number
     */
    public java.lang.String getBusiness_number() {
        return business_number;
    }


    /**
     * Sets the business_number value for this DNBBusinessVerification.
     * 
     * @param business_number
     */
    public void setBusiness_number(java.lang.String business_number) {
        this.business_number = business_number;
    }


    /**
     * Gets the business_number_type value for this DNBBusinessVerification.
     * 
     * @return business_number_type
     */
    public java.lang.String getBusiness_number_type() {
        return business_number_type;
    }


    /**
     * Sets the business_number_type value for this DNBBusinessVerification.
     * 
     * @param business_number_type
     */
    public void setBusiness_number_type(java.lang.String business_number_type) {
        this.business_number_type = business_number_type;
    }


    /**
     * Gets the business_number_description value for this DNBBusinessVerification.
     * 
     * @return business_number_description
     */
    public java.lang.String getBusiness_number_description() {
        return business_number_description;
    }


    /**
     * Sets the business_number_description value for this DNBBusinessVerification.
     * 
     * @param business_number_description
     */
    public void setBusiness_number_description(java.lang.String business_number_description) {
        this.business_number_description = business_number_description;
    }


    /**
     * Gets the trade_name value for this DNBBusinessVerification.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DNBBusinessVerification.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the address value for this DNBBusinessVerification.
     * 
     * @return address
     */
    public java.lang.String[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DNBBusinessVerification.
     * 
     * @param address
     */
    public void setAddress(java.lang.String[] address) {
        this.address = address;
    }


    /**
     * Gets the postcode value for this DNBBusinessVerification.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DNBBusinessVerification.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this DNBBusinessVerification.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DNBBusinessVerification.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this DNBBusinessVerification.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DNBBusinessVerification.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the subregion value for this DNBBusinessVerification.
     * 
     * @return subregion
     */
    public java.lang.String getSubregion() {
        return subregion;
    }


    /**
     * Sets the subregion value for this DNBBusinessVerification.
     * 
     * @param subregion
     */
    public void setSubregion(java.lang.String subregion) {
        this.subregion = subregion;
    }


    /**
     * Gets the country_calling_code value for this DNBBusinessVerification.
     * 
     * @return country_calling_code
     */
    public java.lang.String getCountry_calling_code() {
        return country_calling_code;
    }


    /**
     * Sets the country_calling_code value for this DNBBusinessVerification.
     * 
     * @param country_calling_code
     */
    public void setCountry_calling_code(java.lang.String country_calling_code) {
        this.country_calling_code = country_calling_code;
    }


    /**
     * Gets the phone_number value for this DNBBusinessVerification.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this DNBBusinessVerification.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the fax_number value for this DNBBusinessVerification.
     * 
     * @return fax_number
     */
    public java.lang.String getFax_number() {
        return fax_number;
    }


    /**
     * Sets the fax_number value for this DNBBusinessVerification.
     * 
     * @param fax_number
     */
    public void setFax_number(java.lang.String fax_number) {
        this.fax_number = fax_number;
    }


    /**
     * Gets the country value for this DNBBusinessVerification.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DNBBusinessVerification.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the main_branch_indication value for this DNBBusinessVerification.
     * 
     * @return main_branch_indication
     */
    public java.lang.Boolean getMain_branch_indication() {
        return main_branch_indication;
    }


    /**
     * Sets the main_branch_indication value for this DNBBusinessVerification.
     * 
     * @param main_branch_indication
     */
    public void setMain_branch_indication(java.lang.Boolean main_branch_indication) {
        this.main_branch_indication = main_branch_indication;
    }


    /**
     * Gets the out_of_business value for this DNBBusinessVerification.
     * 
     * @return out_of_business
     */
    public java.lang.Boolean getOut_of_business() {
        return out_of_business;
    }


    /**
     * Sets the out_of_business value for this DNBBusinessVerification.
     * 
     * @param out_of_business
     */
    public void setOut_of_business(java.lang.Boolean out_of_business) {
        this.out_of_business = out_of_business;
    }


    /**
     * Gets the incorporation_year value for this DNBBusinessVerification.
     * 
     * @return incorporation_year
     */
    public java.lang.Integer getIncorporation_year() {
        return incorporation_year;
    }


    /**
     * Sets the incorporation_year value for this DNBBusinessVerification.
     * 
     * @param incorporation_year
     */
    public void setIncorporation_year(java.lang.Integer incorporation_year) {
        this.incorporation_year = incorporation_year;
    }


    /**
     * Gets the start_year value for this DNBBusinessVerification.
     * 
     * @return start_year
     */
    public java.lang.Integer getStart_year() {
        return start_year;
    }


    /**
     * Sets the start_year value for this DNBBusinessVerification.
     * 
     * @param start_year
     */
    public void setStart_year(java.lang.Integer start_year) {
        this.start_year = start_year;
    }


    /**
     * Gets the sic_activity_code value for this DNBBusinessVerification.
     * 
     * @return sic_activity_code
     */
    public java.lang.String getSic_activity_code() {
        return sic_activity_code;
    }


    /**
     * Sets the sic_activity_code value for this DNBBusinessVerification.
     * 
     * @param sic_activity_code
     */
    public void setSic_activity_code(java.lang.String sic_activity_code) {
        this.sic_activity_code = sic_activity_code;
    }


    /**
     * Gets the sic_activity_description value for this DNBBusinessVerification.
     * 
     * @return sic_activity_description
     */
    public java.lang.String getSic_activity_description() {
        return sic_activity_description;
    }


    /**
     * Sets the sic_activity_description value for this DNBBusinessVerification.
     * 
     * @param sic_activity_description
     */
    public void setSic_activity_description(java.lang.String sic_activity_description) {
        this.sic_activity_description = sic_activity_description;
    }


    /**
     * Gets the sic_version value for this DNBBusinessVerification.
     * 
     * @return sic_version
     */
    public java.lang.String getSic_version() {
        return sic_version;
    }


    /**
     * Sets the sic_version value for this DNBBusinessVerification.
     * 
     * @param sic_version
     */
    public void setSic_version(java.lang.String sic_version) {
        this.sic_version = sic_version;
    }


    /**
     * Gets the trade_names value for this DNBBusinessVerification.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DNBBusinessVerification.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBBusinessVerification)) return false;
        DNBBusinessVerification other = (DNBBusinessVerification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duns==null && other.getDuns()==null) || 
             (this.duns!=null &&
              this.duns.equals(other.getDuns()))) &&
            ((this.dnb_key==null && other.getDnb_key()==null) || 
             (this.dnb_key!=null &&
              this.dnb_key.equals(other.getDnb_key()))) &&
            ((this.enquiry_duns==null && other.getEnquiry_duns()==null) || 
             (this.enquiry_duns!=null &&
              this.enquiry_duns.equals(other.getEnquiry_duns()))) &&
            ((this.business_number==null && other.getBusiness_number()==null) || 
             (this.business_number!=null &&
              this.business_number.equals(other.getBusiness_number()))) &&
            ((this.business_number_type==null && other.getBusiness_number_type()==null) || 
             (this.business_number_type!=null &&
              this.business_number_type.equals(other.getBusiness_number_type()))) &&
            ((this.business_number_description==null && other.getBusiness_number_description()==null) || 
             (this.business_number_description!=null &&
              this.business_number_description.equals(other.getBusiness_number_description()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.subregion==null && other.getSubregion()==null) || 
             (this.subregion!=null &&
              this.subregion.equals(other.getSubregion()))) &&
            ((this.country_calling_code==null && other.getCountry_calling_code()==null) || 
             (this.country_calling_code!=null &&
              this.country_calling_code.equals(other.getCountry_calling_code()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            ((this.fax_number==null && other.getFax_number()==null) || 
             (this.fax_number!=null &&
              this.fax_number.equals(other.getFax_number()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.main_branch_indication==null && other.getMain_branch_indication()==null) || 
             (this.main_branch_indication!=null &&
              this.main_branch_indication.equals(other.getMain_branch_indication()))) &&
            ((this.out_of_business==null && other.getOut_of_business()==null) || 
             (this.out_of_business!=null &&
              this.out_of_business.equals(other.getOut_of_business()))) &&
            ((this.incorporation_year==null && other.getIncorporation_year()==null) || 
             (this.incorporation_year!=null &&
              this.incorporation_year.equals(other.getIncorporation_year()))) &&
            ((this.start_year==null && other.getStart_year()==null) || 
             (this.start_year!=null &&
              this.start_year.equals(other.getStart_year()))) &&
            ((this.sic_activity_code==null && other.getSic_activity_code()==null) || 
             (this.sic_activity_code!=null &&
              this.sic_activity_code.equals(other.getSic_activity_code()))) &&
            ((this.sic_activity_description==null && other.getSic_activity_description()==null) || 
             (this.sic_activity_description!=null &&
              this.sic_activity_description.equals(other.getSic_activity_description()))) &&
            ((this.sic_version==null && other.getSic_version()==null) || 
             (this.sic_version!=null &&
              this.sic_version.equals(other.getSic_version()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names())));
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
        if (getDuns() != null) {
            _hashCode += getDuns().hashCode();
        }
        if (getDnb_key() != null) {
            _hashCode += getDnb_key().hashCode();
        }
        if (getEnquiry_duns() != null) {
            _hashCode += getEnquiry_duns().hashCode();
        }
        if (getBusiness_number() != null) {
            _hashCode += getBusiness_number().hashCode();
        }
        if (getBusiness_number_type() != null) {
            _hashCode += getBusiness_number_type().hashCode();
        }
        if (getBusiness_number_description() != null) {
            _hashCode += getBusiness_number_description().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSubregion() != null) {
            _hashCode += getSubregion().hashCode();
        }
        if (getCountry_calling_code() != null) {
            _hashCode += getCountry_calling_code().hashCode();
        }
        if (getPhone_number() != null) {
            _hashCode += getPhone_number().hashCode();
        }
        if (getFax_number() != null) {
            _hashCode += getFax_number().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getMain_branch_indication() != null) {
            _hashCode += getMain_branch_indication().hashCode();
        }
        if (getOut_of_business() != null) {
            _hashCode += getOut_of_business().hashCode();
        }
        if (getIncorporation_year() != null) {
            _hashCode += getIncorporation_year().hashCode();
        }
        if (getStart_year() != null) {
            _hashCode += getStart_year().hashCode();
        }
        if (getSic_activity_code() != null) {
            _hashCode += getSic_activity_code().hashCode();
        }
        if (getSic_activity_description() != null) {
            _hashCode += getSic_activity_description().hashCode();
        }
        if (getSic_version() != null) {
            _hashCode += getSic_version().hashCode();
        }
        if (getTrade_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrade_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrade_names(), i);
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
        new org.apache.axis.description.TypeDesc(DNBBusinessVerification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBBusinessVerification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnb_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnb_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiry_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "enquiry_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subregion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subregion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_calling_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_calling_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fax_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_branch_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_branch_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("out_of_business");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "out_of_business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incorporation_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "incorporation_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_activity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_activity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_activity_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_activity_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
