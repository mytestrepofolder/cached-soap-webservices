/**
 * DNBMarketingPlusLinkage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMarketingPlusLinkage  implements java.io.Serializable {
    private java.lang.String domestic_ultimate_duns;

    private java.lang.String domestic_ultimate_name;

    private nl.webservices.www.soap.DNBAddress domestic_ultimate_address;

    private java.lang.Boolean global_ultimate_indication;

    private java.lang.String global_ultimate_duns;

    private java.lang.String global_ultimate_name;

    private nl.webservices.www.soap.DNBAddress global_ultimate_address;

    private java.lang.String headquarters_duns;

    private java.lang.String headquarters_name;

    private nl.webservices.www.soap.DNBAddress headquarters_address;

    private java.lang.Integer family_member_count;

    private java.lang.String linkage_report_date;

    public DNBMarketingPlusLinkage() {
    }

    public DNBMarketingPlusLinkage(
           java.lang.String domestic_ultimate_duns,
           java.lang.String domestic_ultimate_name,
           nl.webservices.www.soap.DNBAddress domestic_ultimate_address,
           java.lang.Boolean global_ultimate_indication,
           java.lang.String global_ultimate_duns,
           java.lang.String global_ultimate_name,
           nl.webservices.www.soap.DNBAddress global_ultimate_address,
           java.lang.String headquarters_duns,
           java.lang.String headquarters_name,
           nl.webservices.www.soap.DNBAddress headquarters_address,
           java.lang.Integer family_member_count,
           java.lang.String linkage_report_date) {
           this.domestic_ultimate_duns = domestic_ultimate_duns;
           this.domestic_ultimate_name = domestic_ultimate_name;
           this.domestic_ultimate_address = domestic_ultimate_address;
           this.global_ultimate_indication = global_ultimate_indication;
           this.global_ultimate_duns = global_ultimate_duns;
           this.global_ultimate_name = global_ultimate_name;
           this.global_ultimate_address = global_ultimate_address;
           this.headquarters_duns = headquarters_duns;
           this.headquarters_name = headquarters_name;
           this.headquarters_address = headquarters_address;
           this.family_member_count = family_member_count;
           this.linkage_report_date = linkage_report_date;
    }


    /**
     * Gets the domestic_ultimate_duns value for this DNBMarketingPlusLinkage.
     * 
     * @return domestic_ultimate_duns
     */
    public java.lang.String getDomestic_ultimate_duns() {
        return domestic_ultimate_duns;
    }


    /**
     * Sets the domestic_ultimate_duns value for this DNBMarketingPlusLinkage.
     * 
     * @param domestic_ultimate_duns
     */
    public void setDomestic_ultimate_duns(java.lang.String domestic_ultimate_duns) {
        this.domestic_ultimate_duns = domestic_ultimate_duns;
    }


    /**
     * Gets the domestic_ultimate_name value for this DNBMarketingPlusLinkage.
     * 
     * @return domestic_ultimate_name
     */
    public java.lang.String getDomestic_ultimate_name() {
        return domestic_ultimate_name;
    }


    /**
     * Sets the domestic_ultimate_name value for this DNBMarketingPlusLinkage.
     * 
     * @param domestic_ultimate_name
     */
    public void setDomestic_ultimate_name(java.lang.String domestic_ultimate_name) {
        this.domestic_ultimate_name = domestic_ultimate_name;
    }


    /**
     * Gets the domestic_ultimate_address value for this DNBMarketingPlusLinkage.
     * 
     * @return domestic_ultimate_address
     */
    public nl.webservices.www.soap.DNBAddress getDomestic_ultimate_address() {
        return domestic_ultimate_address;
    }


    /**
     * Sets the domestic_ultimate_address value for this DNBMarketingPlusLinkage.
     * 
     * @param domestic_ultimate_address
     */
    public void setDomestic_ultimate_address(nl.webservices.www.soap.DNBAddress domestic_ultimate_address) {
        this.domestic_ultimate_address = domestic_ultimate_address;
    }


    /**
     * Gets the global_ultimate_indication value for this DNBMarketingPlusLinkage.
     * 
     * @return global_ultimate_indication
     */
    public java.lang.Boolean getGlobal_ultimate_indication() {
        return global_ultimate_indication;
    }


    /**
     * Sets the global_ultimate_indication value for this DNBMarketingPlusLinkage.
     * 
     * @param global_ultimate_indication
     */
    public void setGlobal_ultimate_indication(java.lang.Boolean global_ultimate_indication) {
        this.global_ultimate_indication = global_ultimate_indication;
    }


    /**
     * Gets the global_ultimate_duns value for this DNBMarketingPlusLinkage.
     * 
     * @return global_ultimate_duns
     */
    public java.lang.String getGlobal_ultimate_duns() {
        return global_ultimate_duns;
    }


    /**
     * Sets the global_ultimate_duns value for this DNBMarketingPlusLinkage.
     * 
     * @param global_ultimate_duns
     */
    public void setGlobal_ultimate_duns(java.lang.String global_ultimate_duns) {
        this.global_ultimate_duns = global_ultimate_duns;
    }


    /**
     * Gets the global_ultimate_name value for this DNBMarketingPlusLinkage.
     * 
     * @return global_ultimate_name
     */
    public java.lang.String getGlobal_ultimate_name() {
        return global_ultimate_name;
    }


    /**
     * Sets the global_ultimate_name value for this DNBMarketingPlusLinkage.
     * 
     * @param global_ultimate_name
     */
    public void setGlobal_ultimate_name(java.lang.String global_ultimate_name) {
        this.global_ultimate_name = global_ultimate_name;
    }


    /**
     * Gets the global_ultimate_address value for this DNBMarketingPlusLinkage.
     * 
     * @return global_ultimate_address
     */
    public nl.webservices.www.soap.DNBAddress getGlobal_ultimate_address() {
        return global_ultimate_address;
    }


    /**
     * Sets the global_ultimate_address value for this DNBMarketingPlusLinkage.
     * 
     * @param global_ultimate_address
     */
    public void setGlobal_ultimate_address(nl.webservices.www.soap.DNBAddress global_ultimate_address) {
        this.global_ultimate_address = global_ultimate_address;
    }


    /**
     * Gets the headquarters_duns value for this DNBMarketingPlusLinkage.
     * 
     * @return headquarters_duns
     */
    public java.lang.String getHeadquarters_duns() {
        return headquarters_duns;
    }


    /**
     * Sets the headquarters_duns value for this DNBMarketingPlusLinkage.
     * 
     * @param headquarters_duns
     */
    public void setHeadquarters_duns(java.lang.String headquarters_duns) {
        this.headquarters_duns = headquarters_duns;
    }


    /**
     * Gets the headquarters_name value for this DNBMarketingPlusLinkage.
     * 
     * @return headquarters_name
     */
    public java.lang.String getHeadquarters_name() {
        return headquarters_name;
    }


    /**
     * Sets the headquarters_name value for this DNBMarketingPlusLinkage.
     * 
     * @param headquarters_name
     */
    public void setHeadquarters_name(java.lang.String headquarters_name) {
        this.headquarters_name = headquarters_name;
    }


    /**
     * Gets the headquarters_address value for this DNBMarketingPlusLinkage.
     * 
     * @return headquarters_address
     */
    public nl.webservices.www.soap.DNBAddress getHeadquarters_address() {
        return headquarters_address;
    }


    /**
     * Sets the headquarters_address value for this DNBMarketingPlusLinkage.
     * 
     * @param headquarters_address
     */
    public void setHeadquarters_address(nl.webservices.www.soap.DNBAddress headquarters_address) {
        this.headquarters_address = headquarters_address;
    }


    /**
     * Gets the family_member_count value for this DNBMarketingPlusLinkage.
     * 
     * @return family_member_count
     */
    public java.lang.Integer getFamily_member_count() {
        return family_member_count;
    }


    /**
     * Sets the family_member_count value for this DNBMarketingPlusLinkage.
     * 
     * @param family_member_count
     */
    public void setFamily_member_count(java.lang.Integer family_member_count) {
        this.family_member_count = family_member_count;
    }


    /**
     * Gets the linkage_report_date value for this DNBMarketingPlusLinkage.
     * 
     * @return linkage_report_date
     */
    public java.lang.String getLinkage_report_date() {
        return linkage_report_date;
    }


    /**
     * Sets the linkage_report_date value for this DNBMarketingPlusLinkage.
     * 
     * @param linkage_report_date
     */
    public void setLinkage_report_date(java.lang.String linkage_report_date) {
        this.linkage_report_date = linkage_report_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMarketingPlusLinkage)) return false;
        DNBMarketingPlusLinkage other = (DNBMarketingPlusLinkage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domestic_ultimate_duns==null && other.getDomestic_ultimate_duns()==null) || 
             (this.domestic_ultimate_duns!=null &&
              this.domestic_ultimate_duns.equals(other.getDomestic_ultimate_duns()))) &&
            ((this.domestic_ultimate_name==null && other.getDomestic_ultimate_name()==null) || 
             (this.domestic_ultimate_name!=null &&
              this.domestic_ultimate_name.equals(other.getDomestic_ultimate_name()))) &&
            ((this.domestic_ultimate_address==null && other.getDomestic_ultimate_address()==null) || 
             (this.domestic_ultimate_address!=null &&
              this.domestic_ultimate_address.equals(other.getDomestic_ultimate_address()))) &&
            ((this.global_ultimate_indication==null && other.getGlobal_ultimate_indication()==null) || 
             (this.global_ultimate_indication!=null &&
              this.global_ultimate_indication.equals(other.getGlobal_ultimate_indication()))) &&
            ((this.global_ultimate_duns==null && other.getGlobal_ultimate_duns()==null) || 
             (this.global_ultimate_duns!=null &&
              this.global_ultimate_duns.equals(other.getGlobal_ultimate_duns()))) &&
            ((this.global_ultimate_name==null && other.getGlobal_ultimate_name()==null) || 
             (this.global_ultimate_name!=null &&
              this.global_ultimate_name.equals(other.getGlobal_ultimate_name()))) &&
            ((this.global_ultimate_address==null && other.getGlobal_ultimate_address()==null) || 
             (this.global_ultimate_address!=null &&
              this.global_ultimate_address.equals(other.getGlobal_ultimate_address()))) &&
            ((this.headquarters_duns==null && other.getHeadquarters_duns()==null) || 
             (this.headquarters_duns!=null &&
              this.headquarters_duns.equals(other.getHeadquarters_duns()))) &&
            ((this.headquarters_name==null && other.getHeadquarters_name()==null) || 
             (this.headquarters_name!=null &&
              this.headquarters_name.equals(other.getHeadquarters_name()))) &&
            ((this.headquarters_address==null && other.getHeadquarters_address()==null) || 
             (this.headquarters_address!=null &&
              this.headquarters_address.equals(other.getHeadquarters_address()))) &&
            ((this.family_member_count==null && other.getFamily_member_count()==null) || 
             (this.family_member_count!=null &&
              this.family_member_count.equals(other.getFamily_member_count()))) &&
            ((this.linkage_report_date==null && other.getLinkage_report_date()==null) || 
             (this.linkage_report_date!=null &&
              this.linkage_report_date.equals(other.getLinkage_report_date())));
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
        if (getDomestic_ultimate_duns() != null) {
            _hashCode += getDomestic_ultimate_duns().hashCode();
        }
        if (getDomestic_ultimate_name() != null) {
            _hashCode += getDomestic_ultimate_name().hashCode();
        }
        if (getDomestic_ultimate_address() != null) {
            _hashCode += getDomestic_ultimate_address().hashCode();
        }
        if (getGlobal_ultimate_indication() != null) {
            _hashCode += getGlobal_ultimate_indication().hashCode();
        }
        if (getGlobal_ultimate_duns() != null) {
            _hashCode += getGlobal_ultimate_duns().hashCode();
        }
        if (getGlobal_ultimate_name() != null) {
            _hashCode += getGlobal_ultimate_name().hashCode();
        }
        if (getGlobal_ultimate_address() != null) {
            _hashCode += getGlobal_ultimate_address().hashCode();
        }
        if (getHeadquarters_duns() != null) {
            _hashCode += getHeadquarters_duns().hashCode();
        }
        if (getHeadquarters_name() != null) {
            _hashCode += getHeadquarters_name().hashCode();
        }
        if (getHeadquarters_address() != null) {
            _hashCode += getHeadquarters_address().hashCode();
        }
        if (getFamily_member_count() != null) {
            _hashCode += getFamily_member_count().hashCode();
        }
        if (getLinkage_report_date() != null) {
            _hashCode += getLinkage_report_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMarketingPlusLinkage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlusLinkage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic_ultimate_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domestic_ultimate_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic_ultimate_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domestic_ultimate_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic_ultimate_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domestic_ultimate_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_ultimate_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_ultimate_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_ultimate_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_ultimate_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_ultimate_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_ultimate_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_ultimate_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_ultimate_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headquarters_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "headquarters_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headquarters_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "headquarters_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headquarters_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "headquarters_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family_member_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "family_member_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkage_report_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "linkage_report_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
