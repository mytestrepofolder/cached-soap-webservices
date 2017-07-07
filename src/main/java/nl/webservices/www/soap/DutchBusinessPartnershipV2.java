/**
 * DutchBusinessPartnershipV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPartnershipV2  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.lang.String rsin_number;

    private java.lang.String name;

    private java.lang.String registration;

    private java.lang.String legal_form_text;

    private nl.webservices.www.soap.DutchBusinessDateV2 founding_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 function_start_date;

    private java.lang.String duration;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 limited_partnership_capital;

    private nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address;

    private nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address;

    private java.lang.Integer silent_partners;

    private java.lang.String[] remarks;

    public DutchBusinessPartnershipV2() {
    }

    public DutchBusinessPartnershipV2(
           java.lang.String dossier_number,
           java.lang.String rsin_number,
           java.lang.String name,
           java.lang.String registration,
           java.lang.String legal_form_text,
           nl.webservices.www.soap.DutchBusinessDateV2 founding_date,
           nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date,
           nl.webservices.www.soap.DutchBusinessDateV2 function_start_date,
           java.lang.String duration,
           nl.webservices.www.soap.DutchBusinessMoneyV2 limited_partnership_capital,
           nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address,
           nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address,
           java.lang.Integer silent_partners,
           java.lang.String[] remarks) {
           this.dossier_number = dossier_number;
           this.rsin_number = rsin_number;
           this.name = name;
           this.registration = registration;
           this.legal_form_text = legal_form_text;
           this.founding_date = founding_date;
           this.dissolution_date = dissolution_date;
           this.function_start_date = function_start_date;
           this.duration = duration;
           this.limited_partnership_capital = limited_partnership_capital;
           this.establishment_address = establishment_address;
           this.correspondence_address = correspondence_address;
           this.silent_partners = silent_partners;
           this.remarks = remarks;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessPartnershipV2.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessPartnershipV2.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the rsin_number value for this DutchBusinessPartnershipV2.
     * 
     * @return rsin_number
     */
    public java.lang.String getRsin_number() {
        return rsin_number;
    }


    /**
     * Sets the rsin_number value for this DutchBusinessPartnershipV2.
     * 
     * @param rsin_number
     */
    public void setRsin_number(java.lang.String rsin_number) {
        this.rsin_number = rsin_number;
    }


    /**
     * Gets the name value for this DutchBusinessPartnershipV2.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DutchBusinessPartnershipV2.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the registration value for this DutchBusinessPartnershipV2.
     * 
     * @return registration
     */
    public java.lang.String getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this DutchBusinessPartnershipV2.
     * 
     * @param registration
     */
    public void setRegistration(java.lang.String registration) {
        this.registration = registration;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessPartnershipV2.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessPartnershipV2.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the founding_date value for this DutchBusinessPartnershipV2.
     * 
     * @return founding_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getFounding_date() {
        return founding_date;
    }


    /**
     * Sets the founding_date value for this DutchBusinessPartnershipV2.
     * 
     * @param founding_date
     */
    public void setFounding_date(nl.webservices.www.soap.DutchBusinessDateV2 founding_date) {
        this.founding_date = founding_date;
    }


    /**
     * Gets the dissolution_date value for this DutchBusinessPartnershipV2.
     * 
     * @return dissolution_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDissolution_date() {
        return dissolution_date;
    }


    /**
     * Sets the dissolution_date value for this DutchBusinessPartnershipV2.
     * 
     * @param dissolution_date
     */
    public void setDissolution_date(nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date) {
        this.dissolution_date = dissolution_date;
    }


    /**
     * Gets the function_start_date value for this DutchBusinessPartnershipV2.
     * 
     * @return function_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getFunction_start_date() {
        return function_start_date;
    }


    /**
     * Sets the function_start_date value for this DutchBusinessPartnershipV2.
     * 
     * @param function_start_date
     */
    public void setFunction_start_date(nl.webservices.www.soap.DutchBusinessDateV2 function_start_date) {
        this.function_start_date = function_start_date;
    }


    /**
     * Gets the duration value for this DutchBusinessPartnershipV2.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DutchBusinessPartnershipV2.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the limited_partnership_capital value for this DutchBusinessPartnershipV2.
     * 
     * @return limited_partnership_capital
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getLimited_partnership_capital() {
        return limited_partnership_capital;
    }


    /**
     * Sets the limited_partnership_capital value for this DutchBusinessPartnershipV2.
     * 
     * @param limited_partnership_capital
     */
    public void setLimited_partnership_capital(nl.webservices.www.soap.DutchBusinessMoneyV2 limited_partnership_capital) {
        this.limited_partnership_capital = limited_partnership_capital;
    }


    /**
     * Gets the establishment_address value for this DutchBusinessPartnershipV2.
     * 
     * @return establishment_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getEstablishment_address() {
        return establishment_address;
    }


    /**
     * Sets the establishment_address value for this DutchBusinessPartnershipV2.
     * 
     * @param establishment_address
     */
    public void setEstablishment_address(nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address) {
        this.establishment_address = establishment_address;
    }


    /**
     * Gets the correspondence_address value for this DutchBusinessPartnershipV2.
     * 
     * @return correspondence_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getCorrespondence_address() {
        return correspondence_address;
    }


    /**
     * Sets the correspondence_address value for this DutchBusinessPartnershipV2.
     * 
     * @param correspondence_address
     */
    public void setCorrespondence_address(nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address) {
        this.correspondence_address = correspondence_address;
    }


    /**
     * Gets the silent_partners value for this DutchBusinessPartnershipV2.
     * 
     * @return silent_partners
     */
    public java.lang.Integer getSilent_partners() {
        return silent_partners;
    }


    /**
     * Sets the silent_partners value for this DutchBusinessPartnershipV2.
     * 
     * @param silent_partners
     */
    public void setSilent_partners(java.lang.Integer silent_partners) {
        this.silent_partners = silent_partners;
    }


    /**
     * Gets the remarks value for this DutchBusinessPartnershipV2.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessPartnershipV2.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPartnershipV2)) return false;
        DutchBusinessPartnershipV2 other = (DutchBusinessPartnershipV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.rsin_number==null && other.getRsin_number()==null) || 
             (this.rsin_number!=null &&
              this.rsin_number.equals(other.getRsin_number()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.founding_date==null && other.getFounding_date()==null) || 
             (this.founding_date!=null &&
              this.founding_date.equals(other.getFounding_date()))) &&
            ((this.dissolution_date==null && other.getDissolution_date()==null) || 
             (this.dissolution_date!=null &&
              this.dissolution_date.equals(other.getDissolution_date()))) &&
            ((this.function_start_date==null && other.getFunction_start_date()==null) || 
             (this.function_start_date!=null &&
              this.function_start_date.equals(other.getFunction_start_date()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.limited_partnership_capital==null && other.getLimited_partnership_capital()==null) || 
             (this.limited_partnership_capital!=null &&
              this.limited_partnership_capital.equals(other.getLimited_partnership_capital()))) &&
            ((this.establishment_address==null && other.getEstablishment_address()==null) || 
             (this.establishment_address!=null &&
              this.establishment_address.equals(other.getEstablishment_address()))) &&
            ((this.correspondence_address==null && other.getCorrespondence_address()==null) || 
             (this.correspondence_address!=null &&
              this.correspondence_address.equals(other.getCorrespondence_address()))) &&
            ((this.silent_partners==null && other.getSilent_partners()==null) || 
             (this.silent_partners!=null &&
              this.silent_partners.equals(other.getSilent_partners()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks())));
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
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getRsin_number() != null) {
            _hashCode += getRsin_number().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getFounding_date() != null) {
            _hashCode += getFounding_date().hashCode();
        }
        if (getDissolution_date() != null) {
            _hashCode += getDissolution_date().hashCode();
        }
        if (getFunction_start_date() != null) {
            _hashCode += getFunction_start_date().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getLimited_partnership_capital() != null) {
            _hashCode += getLimited_partnership_capital().hashCode();
        }
        if (getEstablishment_address() != null) {
            _hashCode += getEstablishment_address().hashCode();
        }
        if (getCorrespondence_address() != null) {
            _hashCode += getCorrespondence_address().hashCode();
        }
        if (getSilent_partners() != null) {
            _hashCode += getSilent_partners().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPartnershipV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPartnershipV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsin_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rsin_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("founding_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founding_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolution_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dissolution_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limited_partnership_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "limited_partnership_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("silent_partners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "silent_partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
