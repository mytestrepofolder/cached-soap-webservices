/**
 * DNBMarketing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMarketing  implements java.io.Serializable {
    private java.lang.String duns;

    private java.lang.String business_number;

    private java.lang.Integer business_number_type;

    private java.lang.String primary_name;

    private java.lang.String trade_name;

    private java.lang.String former_duns;

    private java.lang.String former_primary_name;

    private nl.webservices.www.soap.DNBAddress establishment_address;

    private java.lang.String country_calling_code;

    private java.lang.String phone_number;

    private java.lang.String fax_number;

    private boolean marketability_indication;

    public DNBMarketing() {
    }

    public DNBMarketing(
           java.lang.String duns,
           java.lang.String business_number,
           java.lang.Integer business_number_type,
           java.lang.String primary_name,
           java.lang.String trade_name,
           java.lang.String former_duns,
           java.lang.String former_primary_name,
           nl.webservices.www.soap.DNBAddress establishment_address,
           java.lang.String country_calling_code,
           java.lang.String phone_number,
           java.lang.String fax_number,
           boolean marketability_indication) {
           this.duns = duns;
           this.business_number = business_number;
           this.business_number_type = business_number_type;
           this.primary_name = primary_name;
           this.trade_name = trade_name;
           this.former_duns = former_duns;
           this.former_primary_name = former_primary_name;
           this.establishment_address = establishment_address;
           this.country_calling_code = country_calling_code;
           this.phone_number = phone_number;
           this.fax_number = fax_number;
           this.marketability_indication = marketability_indication;
    }


    /**
     * Gets the duns value for this DNBMarketing.
     * 
     * @return duns
     */
    public java.lang.String getDuns() {
        return duns;
    }


    /**
     * Sets the duns value for this DNBMarketing.
     * 
     * @param duns
     */
    public void setDuns(java.lang.String duns) {
        this.duns = duns;
    }


    /**
     * Gets the business_number value for this DNBMarketing.
     * 
     * @return business_number
     */
    public java.lang.String getBusiness_number() {
        return business_number;
    }


    /**
     * Sets the business_number value for this DNBMarketing.
     * 
     * @param business_number
     */
    public void setBusiness_number(java.lang.String business_number) {
        this.business_number = business_number;
    }


    /**
     * Gets the business_number_type value for this DNBMarketing.
     * 
     * @return business_number_type
     */
    public java.lang.Integer getBusiness_number_type() {
        return business_number_type;
    }


    /**
     * Sets the business_number_type value for this DNBMarketing.
     * 
     * @param business_number_type
     */
    public void setBusiness_number_type(java.lang.Integer business_number_type) {
        this.business_number_type = business_number_type;
    }


    /**
     * Gets the primary_name value for this DNBMarketing.
     * 
     * @return primary_name
     */
    public java.lang.String getPrimary_name() {
        return primary_name;
    }


    /**
     * Sets the primary_name value for this DNBMarketing.
     * 
     * @param primary_name
     */
    public void setPrimary_name(java.lang.String primary_name) {
        this.primary_name = primary_name;
    }


    /**
     * Gets the trade_name value for this DNBMarketing.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DNBMarketing.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the former_duns value for this DNBMarketing.
     * 
     * @return former_duns
     */
    public java.lang.String getFormer_duns() {
        return former_duns;
    }


    /**
     * Sets the former_duns value for this DNBMarketing.
     * 
     * @param former_duns
     */
    public void setFormer_duns(java.lang.String former_duns) {
        this.former_duns = former_duns;
    }


    /**
     * Gets the former_primary_name value for this DNBMarketing.
     * 
     * @return former_primary_name
     */
    public java.lang.String getFormer_primary_name() {
        return former_primary_name;
    }


    /**
     * Sets the former_primary_name value for this DNBMarketing.
     * 
     * @param former_primary_name
     */
    public void setFormer_primary_name(java.lang.String former_primary_name) {
        this.former_primary_name = former_primary_name;
    }


    /**
     * Gets the establishment_address value for this DNBMarketing.
     * 
     * @return establishment_address
     */
    public nl.webservices.www.soap.DNBAddress getEstablishment_address() {
        return establishment_address;
    }


    /**
     * Sets the establishment_address value for this DNBMarketing.
     * 
     * @param establishment_address
     */
    public void setEstablishment_address(nl.webservices.www.soap.DNBAddress establishment_address) {
        this.establishment_address = establishment_address;
    }


    /**
     * Gets the country_calling_code value for this DNBMarketing.
     * 
     * @return country_calling_code
     */
    public java.lang.String getCountry_calling_code() {
        return country_calling_code;
    }


    /**
     * Sets the country_calling_code value for this DNBMarketing.
     * 
     * @param country_calling_code
     */
    public void setCountry_calling_code(java.lang.String country_calling_code) {
        this.country_calling_code = country_calling_code;
    }


    /**
     * Gets the phone_number value for this DNBMarketing.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this DNBMarketing.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the fax_number value for this DNBMarketing.
     * 
     * @return fax_number
     */
    public java.lang.String getFax_number() {
        return fax_number;
    }


    /**
     * Sets the fax_number value for this DNBMarketing.
     * 
     * @param fax_number
     */
    public void setFax_number(java.lang.String fax_number) {
        this.fax_number = fax_number;
    }


    /**
     * Gets the marketability_indication value for this DNBMarketing.
     * 
     * @return marketability_indication
     */
    public boolean isMarketability_indication() {
        return marketability_indication;
    }


    /**
     * Sets the marketability_indication value for this DNBMarketing.
     * 
     * @param marketability_indication
     */
    public void setMarketability_indication(boolean marketability_indication) {
        this.marketability_indication = marketability_indication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMarketing)) return false;
        DNBMarketing other = (DNBMarketing) obj;
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
            ((this.business_number==null && other.getBusiness_number()==null) || 
             (this.business_number!=null &&
              this.business_number.equals(other.getBusiness_number()))) &&
            ((this.business_number_type==null && other.getBusiness_number_type()==null) || 
             (this.business_number_type!=null &&
              this.business_number_type.equals(other.getBusiness_number_type()))) &&
            ((this.primary_name==null && other.getPrimary_name()==null) || 
             (this.primary_name!=null &&
              this.primary_name.equals(other.getPrimary_name()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.former_duns==null && other.getFormer_duns()==null) || 
             (this.former_duns!=null &&
              this.former_duns.equals(other.getFormer_duns()))) &&
            ((this.former_primary_name==null && other.getFormer_primary_name()==null) || 
             (this.former_primary_name!=null &&
              this.former_primary_name.equals(other.getFormer_primary_name()))) &&
            ((this.establishment_address==null && other.getEstablishment_address()==null) || 
             (this.establishment_address!=null &&
              this.establishment_address.equals(other.getEstablishment_address()))) &&
            ((this.country_calling_code==null && other.getCountry_calling_code()==null) || 
             (this.country_calling_code!=null &&
              this.country_calling_code.equals(other.getCountry_calling_code()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            ((this.fax_number==null && other.getFax_number()==null) || 
             (this.fax_number!=null &&
              this.fax_number.equals(other.getFax_number()))) &&
            this.marketability_indication == other.isMarketability_indication();
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
        if (getBusiness_number() != null) {
            _hashCode += getBusiness_number().hashCode();
        }
        if (getBusiness_number_type() != null) {
            _hashCode += getBusiness_number_type().hashCode();
        }
        if (getPrimary_name() != null) {
            _hashCode += getPrimary_name().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getFormer_duns() != null) {
            _hashCode += getFormer_duns().hashCode();
        }
        if (getFormer_primary_name() != null) {
            _hashCode += getFormer_primary_name().hashCode();
        }
        if (getEstablishment_address() != null) {
            _hashCode += getEstablishment_address().hashCode();
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
        _hashCode += (isMarketability_indication() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMarketing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duns"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "primary_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("former_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "former_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("former_primary_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "former_primary_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_calling_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_calling_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("marketability_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "marketability_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
