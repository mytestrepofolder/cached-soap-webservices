/**
 * DutchBusinessEnterpriseV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessEnterpriseV2  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String registration;

    private java.lang.String legal_form_text;

    private java.lang.String activity;

    private java.lang.String description;

    private nl.webservices.www.soap.DutchBusinessDateV2 incorporation_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 founding_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 date_since;

    private nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel;

    private java.lang.String[] remarks;

    private nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes;

    private java.lang.String[] trade_names;

    public DutchBusinessEnterpriseV2() {
    }

    public DutchBusinessEnterpriseV2(
           java.lang.String name,
           java.lang.String registration,
           java.lang.String legal_form_text,
           java.lang.String activity,
           java.lang.String description,
           nl.webservices.www.soap.DutchBusinessDateV2 incorporation_date,
           nl.webservices.www.soap.DutchBusinessDateV2 founding_date,
           nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date,
           nl.webservices.www.soap.DutchBusinessDateV2 date_since,
           nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel,
           java.lang.String[] remarks,
           nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes,
           java.lang.String[] trade_names) {
           this.name = name;
           this.registration = registration;
           this.legal_form_text = legal_form_text;
           this.activity = activity;
           this.description = description;
           this.incorporation_date = incorporation_date;
           this.founding_date = founding_date;
           this.discontinuation_date = discontinuation_date;
           this.date_since = date_since;
           this.personnel = personnel;
           this.remarks = remarks;
           this.sbi_codes = sbi_codes;
           this.trade_names = trade_names;
    }


    /**
     * Gets the name value for this DutchBusinessEnterpriseV2.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DutchBusinessEnterpriseV2.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the registration value for this DutchBusinessEnterpriseV2.
     * 
     * @return registration
     */
    public java.lang.String getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this DutchBusinessEnterpriseV2.
     * 
     * @param registration
     */
    public void setRegistration(java.lang.String registration) {
        this.registration = registration;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessEnterpriseV2.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessEnterpriseV2.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the activity value for this DutchBusinessEnterpriseV2.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this DutchBusinessEnterpriseV2.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the description value for this DutchBusinessEnterpriseV2.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchBusinessEnterpriseV2.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the incorporation_date value for this DutchBusinessEnterpriseV2.
     * 
     * @return incorporation_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getIncorporation_date() {
        return incorporation_date;
    }


    /**
     * Sets the incorporation_date value for this DutchBusinessEnterpriseV2.
     * 
     * @param incorporation_date
     */
    public void setIncorporation_date(nl.webservices.www.soap.DutchBusinessDateV2 incorporation_date) {
        this.incorporation_date = incorporation_date;
    }


    /**
     * Gets the founding_date value for this DutchBusinessEnterpriseV2.
     * 
     * @return founding_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getFounding_date() {
        return founding_date;
    }


    /**
     * Sets the founding_date value for this DutchBusinessEnterpriseV2.
     * 
     * @param founding_date
     */
    public void setFounding_date(nl.webservices.www.soap.DutchBusinessDateV2 founding_date) {
        this.founding_date = founding_date;
    }


    /**
     * Gets the discontinuation_date value for this DutchBusinessEnterpriseV2.
     * 
     * @return discontinuation_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDiscontinuation_date() {
        return discontinuation_date;
    }


    /**
     * Sets the discontinuation_date value for this DutchBusinessEnterpriseV2.
     * 
     * @param discontinuation_date
     */
    public void setDiscontinuation_date(nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date) {
        this.discontinuation_date = discontinuation_date;
    }


    /**
     * Gets the date_since value for this DutchBusinessEnterpriseV2.
     * 
     * @return date_since
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDate_since() {
        return date_since;
    }


    /**
     * Sets the date_since value for this DutchBusinessEnterpriseV2.
     * 
     * @param date_since
     */
    public void setDate_since(nl.webservices.www.soap.DutchBusinessDateV2 date_since) {
        this.date_since = date_since;
    }


    /**
     * Gets the personnel value for this DutchBusinessEnterpriseV2.
     * 
     * @return personnel
     */
    public nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this DutchBusinessEnterpriseV2.
     * 
     * @param personnel
     */
    public void setPersonnel(nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel) {
        this.personnel = personnel;
    }


    /**
     * Gets the remarks value for this DutchBusinessEnterpriseV2.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessEnterpriseV2.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the sbi_codes value for this DutchBusinessEnterpriseV2.
     * 
     * @return sbi_codes
     */
    public nl.webservices.www.soap.DutchBusinessSbiCodeV2[] getSbi_codes() {
        return sbi_codes;
    }


    /**
     * Sets the sbi_codes value for this DutchBusinessEnterpriseV2.
     * 
     * @param sbi_codes
     */
    public void setSbi_codes(nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes) {
        this.sbi_codes = sbi_codes;
    }


    /**
     * Gets the trade_names value for this DutchBusinessEnterpriseV2.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DutchBusinessEnterpriseV2.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessEnterpriseV2)) return false;
        DutchBusinessEnterpriseV2 other = (DutchBusinessEnterpriseV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.incorporation_date==null && other.getIncorporation_date()==null) || 
             (this.incorporation_date!=null &&
              this.incorporation_date.equals(other.getIncorporation_date()))) &&
            ((this.founding_date==null && other.getFounding_date()==null) || 
             (this.founding_date!=null &&
              this.founding_date.equals(other.getFounding_date()))) &&
            ((this.discontinuation_date==null && other.getDiscontinuation_date()==null) || 
             (this.discontinuation_date!=null &&
              this.discontinuation_date.equals(other.getDiscontinuation_date()))) &&
            ((this.date_since==null && other.getDate_since()==null) || 
             (this.date_since!=null &&
              this.date_since.equals(other.getDate_since()))) &&
            ((this.personnel==null && other.getPersonnel()==null) || 
             (this.personnel!=null &&
              this.personnel.equals(other.getPersonnel()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.sbi_codes==null && other.getSbi_codes()==null) || 
             (this.sbi_codes!=null &&
              java.util.Arrays.equals(this.sbi_codes, other.getSbi_codes()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIncorporation_date() != null) {
            _hashCode += getIncorporation_date().hashCode();
        }
        if (getFounding_date() != null) {
            _hashCode += getFounding_date().hashCode();
        }
        if (getDiscontinuation_date() != null) {
            _hashCode += getDiscontinuation_date().hashCode();
        }
        if (getDate_since() != null) {
            _hashCode += getDate_since().hashCode();
        }
        if (getPersonnel() != null) {
            _hashCode += getPersonnel().hashCode();
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSbi_codes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbi_codes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbi_codes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(DutchBusinessEnterpriseV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEnterpriseV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incorporation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "incorporation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("founding_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founding_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discontinuation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "discontinuation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPersonnelInfoV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSbiCodeV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
