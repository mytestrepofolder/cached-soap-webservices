/**
 * GCROfficialData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCROfficialData  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce;

    private java.lang.String vat_number;

    private java.lang.Integer present_legal_form_code;

    private java.lang.String present_legal_form_text;

    private java.lang.Integer present_legal_form_fine_code;

    private java.lang.String present_legal_form_fine_text;

    private java.lang.String number_of_non_executive_partners;

    private java.lang.String publication_duty_code;

    private java.lang.String publication_duty_text;

    private nl.webservices.www.soap.GCRCapital[] capital;

    private nl.webservices.www.soap.GCRFounded[] founded;

    private nl.webservices.www.soap.GCRDiscontinuance discontinuance;

    public GCROfficialData() {
    }

    public GCROfficialData(
           nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce,
           java.lang.String vat_number,
           java.lang.Integer present_legal_form_code,
           java.lang.String present_legal_form_text,
           java.lang.Integer present_legal_form_fine_code,
           java.lang.String present_legal_form_fine_text,
           java.lang.String number_of_non_executive_partners,
           java.lang.String publication_duty_code,
           java.lang.String publication_duty_text,
           nl.webservices.www.soap.GCRCapital[] capital,
           nl.webservices.www.soap.GCRFounded[] founded,
           nl.webservices.www.soap.GCRDiscontinuance discontinuance) {
           this.chamber_of_commerce = chamber_of_commerce;
           this.vat_number = vat_number;
           this.present_legal_form_code = present_legal_form_code;
           this.present_legal_form_text = present_legal_form_text;
           this.present_legal_form_fine_code = present_legal_form_fine_code;
           this.present_legal_form_fine_text = present_legal_form_fine_text;
           this.number_of_non_executive_partners = number_of_non_executive_partners;
           this.publication_duty_code = publication_duty_code;
           this.publication_duty_text = publication_duty_text;
           this.capital = capital;
           this.founded = founded;
           this.discontinuance = discontinuance;
    }


    /**
     * Gets the chamber_of_commerce value for this GCROfficialData.
     * 
     * @return chamber_of_commerce
     */
    public nl.webservices.www.soap.GCRChamberOfCommerce getChamber_of_commerce() {
        return chamber_of_commerce;
    }


    /**
     * Sets the chamber_of_commerce value for this GCROfficialData.
     * 
     * @param chamber_of_commerce
     */
    public void setChamber_of_commerce(nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce) {
        this.chamber_of_commerce = chamber_of_commerce;
    }


    /**
     * Gets the vat_number value for this GCROfficialData.
     * 
     * @return vat_number
     */
    public java.lang.String getVat_number() {
        return vat_number;
    }


    /**
     * Sets the vat_number value for this GCROfficialData.
     * 
     * @param vat_number
     */
    public void setVat_number(java.lang.String vat_number) {
        this.vat_number = vat_number;
    }


    /**
     * Gets the present_legal_form_code value for this GCROfficialData.
     * 
     * @return present_legal_form_code
     */
    public java.lang.Integer getPresent_legal_form_code() {
        return present_legal_form_code;
    }


    /**
     * Sets the present_legal_form_code value for this GCROfficialData.
     * 
     * @param present_legal_form_code
     */
    public void setPresent_legal_form_code(java.lang.Integer present_legal_form_code) {
        this.present_legal_form_code = present_legal_form_code;
    }


    /**
     * Gets the present_legal_form_text value for this GCROfficialData.
     * 
     * @return present_legal_form_text
     */
    public java.lang.String getPresent_legal_form_text() {
        return present_legal_form_text;
    }


    /**
     * Sets the present_legal_form_text value for this GCROfficialData.
     * 
     * @param present_legal_form_text
     */
    public void setPresent_legal_form_text(java.lang.String present_legal_form_text) {
        this.present_legal_form_text = present_legal_form_text;
    }


    /**
     * Gets the present_legal_form_fine_code value for this GCROfficialData.
     * 
     * @return present_legal_form_fine_code
     */
    public java.lang.Integer getPresent_legal_form_fine_code() {
        return present_legal_form_fine_code;
    }


    /**
     * Sets the present_legal_form_fine_code value for this GCROfficialData.
     * 
     * @param present_legal_form_fine_code
     */
    public void setPresent_legal_form_fine_code(java.lang.Integer present_legal_form_fine_code) {
        this.present_legal_form_fine_code = present_legal_form_fine_code;
    }


    /**
     * Gets the present_legal_form_fine_text value for this GCROfficialData.
     * 
     * @return present_legal_form_fine_text
     */
    public java.lang.String getPresent_legal_form_fine_text() {
        return present_legal_form_fine_text;
    }


    /**
     * Sets the present_legal_form_fine_text value for this GCROfficialData.
     * 
     * @param present_legal_form_fine_text
     */
    public void setPresent_legal_form_fine_text(java.lang.String present_legal_form_fine_text) {
        this.present_legal_form_fine_text = present_legal_form_fine_text;
    }


    /**
     * Gets the number_of_non_executive_partners value for this GCROfficialData.
     * 
     * @return number_of_non_executive_partners
     */
    public java.lang.String getNumber_of_non_executive_partners() {
        return number_of_non_executive_partners;
    }


    /**
     * Sets the number_of_non_executive_partners value for this GCROfficialData.
     * 
     * @param number_of_non_executive_partners
     */
    public void setNumber_of_non_executive_partners(java.lang.String number_of_non_executive_partners) {
        this.number_of_non_executive_partners = number_of_non_executive_partners;
    }


    /**
     * Gets the publication_duty_code value for this GCROfficialData.
     * 
     * @return publication_duty_code
     */
    public java.lang.String getPublication_duty_code() {
        return publication_duty_code;
    }


    /**
     * Sets the publication_duty_code value for this GCROfficialData.
     * 
     * @param publication_duty_code
     */
    public void setPublication_duty_code(java.lang.String publication_duty_code) {
        this.publication_duty_code = publication_duty_code;
    }


    /**
     * Gets the publication_duty_text value for this GCROfficialData.
     * 
     * @return publication_duty_text
     */
    public java.lang.String getPublication_duty_text() {
        return publication_duty_text;
    }


    /**
     * Sets the publication_duty_text value for this GCROfficialData.
     * 
     * @param publication_duty_text
     */
    public void setPublication_duty_text(java.lang.String publication_duty_text) {
        this.publication_duty_text = publication_duty_text;
    }


    /**
     * Gets the capital value for this GCROfficialData.
     * 
     * @return capital
     */
    public nl.webservices.www.soap.GCRCapital[] getCapital() {
        return capital;
    }


    /**
     * Sets the capital value for this GCROfficialData.
     * 
     * @param capital
     */
    public void setCapital(nl.webservices.www.soap.GCRCapital[] capital) {
        this.capital = capital;
    }


    /**
     * Gets the founded value for this GCROfficialData.
     * 
     * @return founded
     */
    public nl.webservices.www.soap.GCRFounded[] getFounded() {
        return founded;
    }


    /**
     * Sets the founded value for this GCROfficialData.
     * 
     * @param founded
     */
    public void setFounded(nl.webservices.www.soap.GCRFounded[] founded) {
        this.founded = founded;
    }


    /**
     * Gets the discontinuance value for this GCROfficialData.
     * 
     * @return discontinuance
     */
    public nl.webservices.www.soap.GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }


    /**
     * Sets the discontinuance value for this GCROfficialData.
     * 
     * @param discontinuance
     */
    public void setDiscontinuance(nl.webservices.www.soap.GCRDiscontinuance discontinuance) {
        this.discontinuance = discontinuance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCROfficialData)) return false;
        GCROfficialData other = (GCROfficialData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chamber_of_commerce==null && other.getChamber_of_commerce()==null) || 
             (this.chamber_of_commerce!=null &&
              this.chamber_of_commerce.equals(other.getChamber_of_commerce()))) &&
            ((this.vat_number==null && other.getVat_number()==null) || 
             (this.vat_number!=null &&
              this.vat_number.equals(other.getVat_number()))) &&
            ((this.present_legal_form_code==null && other.getPresent_legal_form_code()==null) || 
             (this.present_legal_form_code!=null &&
              this.present_legal_form_code.equals(other.getPresent_legal_form_code()))) &&
            ((this.present_legal_form_text==null && other.getPresent_legal_form_text()==null) || 
             (this.present_legal_form_text!=null &&
              this.present_legal_form_text.equals(other.getPresent_legal_form_text()))) &&
            ((this.present_legal_form_fine_code==null && other.getPresent_legal_form_fine_code()==null) || 
             (this.present_legal_form_fine_code!=null &&
              this.present_legal_form_fine_code.equals(other.getPresent_legal_form_fine_code()))) &&
            ((this.present_legal_form_fine_text==null && other.getPresent_legal_form_fine_text()==null) || 
             (this.present_legal_form_fine_text!=null &&
              this.present_legal_form_fine_text.equals(other.getPresent_legal_form_fine_text()))) &&
            ((this.number_of_non_executive_partners==null && other.getNumber_of_non_executive_partners()==null) || 
             (this.number_of_non_executive_partners!=null &&
              this.number_of_non_executive_partners.equals(other.getNumber_of_non_executive_partners()))) &&
            ((this.publication_duty_code==null && other.getPublication_duty_code()==null) || 
             (this.publication_duty_code!=null &&
              this.publication_duty_code.equals(other.getPublication_duty_code()))) &&
            ((this.publication_duty_text==null && other.getPublication_duty_text()==null) || 
             (this.publication_duty_text!=null &&
              this.publication_duty_text.equals(other.getPublication_duty_text()))) &&
            ((this.capital==null && other.getCapital()==null) || 
             (this.capital!=null &&
              java.util.Arrays.equals(this.capital, other.getCapital()))) &&
            ((this.founded==null && other.getFounded()==null) || 
             (this.founded!=null &&
              java.util.Arrays.equals(this.founded, other.getFounded()))) &&
            ((this.discontinuance==null && other.getDiscontinuance()==null) || 
             (this.discontinuance!=null &&
              this.discontinuance.equals(other.getDiscontinuance())));
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
        if (getChamber_of_commerce() != null) {
            _hashCode += getChamber_of_commerce().hashCode();
        }
        if (getVat_number() != null) {
            _hashCode += getVat_number().hashCode();
        }
        if (getPresent_legal_form_code() != null) {
            _hashCode += getPresent_legal_form_code().hashCode();
        }
        if (getPresent_legal_form_text() != null) {
            _hashCode += getPresent_legal_form_text().hashCode();
        }
        if (getPresent_legal_form_fine_code() != null) {
            _hashCode += getPresent_legal_form_fine_code().hashCode();
        }
        if (getPresent_legal_form_fine_text() != null) {
            _hashCode += getPresent_legal_form_fine_text().hashCode();
        }
        if (getNumber_of_non_executive_partners() != null) {
            _hashCode += getNumber_of_non_executive_partners().hashCode();
        }
        if (getPublication_duty_code() != null) {
            _hashCode += getPublication_duty_code().hashCode();
        }
        if (getPublication_duty_text() != null) {
            _hashCode += getPublication_duty_text().hashCode();
        }
        if (getCapital() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCapital());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCapital(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFounded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFounded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFounded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscontinuance() != null) {
            _hashCode += getDiscontinuance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCROfficialData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCROfficialData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamber_of_commerce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "chamber_of_commerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRChamberOfCommerce"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vat_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_fine_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_fine_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_fine_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_fine_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_non_executive_partners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number_of_non_executive_partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication_duty_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publication_duty_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication_duty_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publication_duty_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCapital"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("founded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFounded"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discontinuance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "discontinuance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDiscontinuance"));
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
