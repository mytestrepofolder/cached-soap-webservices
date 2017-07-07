/**
 * GCRCalamityEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCalamityEvent  implements java.io.Serializable {
    private int event_code;

    private java.lang.String event_text;

    private java.util.Date event_date;

    private java.util.Date expiration_date;

    private java.lang.String damage_amount;

    private java.lang.String damage_currency;

    private java.lang.Integer insurance_code;

    private java.lang.String insurance_text;

    private java.math.BigInteger instigator_graydon_company_id;

    public GCRCalamityEvent() {
    }

    public GCRCalamityEvent(
           int event_code,
           java.lang.String event_text,
           java.util.Date event_date,
           java.util.Date expiration_date,
           java.lang.String damage_amount,
           java.lang.String damage_currency,
           java.lang.Integer insurance_code,
           java.lang.String insurance_text,
           java.math.BigInteger instigator_graydon_company_id) {
           this.event_code = event_code;
           this.event_text = event_text;
           this.event_date = event_date;
           this.expiration_date = expiration_date;
           this.damage_amount = damage_amount;
           this.damage_currency = damage_currency;
           this.insurance_code = insurance_code;
           this.insurance_text = insurance_text;
           this.instigator_graydon_company_id = instigator_graydon_company_id;
    }


    /**
     * Gets the event_code value for this GCRCalamityEvent.
     * 
     * @return event_code
     */
    public int getEvent_code() {
        return event_code;
    }


    /**
     * Sets the event_code value for this GCRCalamityEvent.
     * 
     * @param event_code
     */
    public void setEvent_code(int event_code) {
        this.event_code = event_code;
    }


    /**
     * Gets the event_text value for this GCRCalamityEvent.
     * 
     * @return event_text
     */
    public java.lang.String getEvent_text() {
        return event_text;
    }


    /**
     * Sets the event_text value for this GCRCalamityEvent.
     * 
     * @param event_text
     */
    public void setEvent_text(java.lang.String event_text) {
        this.event_text = event_text;
    }


    /**
     * Gets the event_date value for this GCRCalamityEvent.
     * 
     * @return event_date
     */
    public java.util.Date getEvent_date() {
        return event_date;
    }


    /**
     * Sets the event_date value for this GCRCalamityEvent.
     * 
     * @param event_date
     */
    public void setEvent_date(java.util.Date event_date) {
        this.event_date = event_date;
    }


    /**
     * Gets the expiration_date value for this GCRCalamityEvent.
     * 
     * @return expiration_date
     */
    public java.util.Date getExpiration_date() {
        return expiration_date;
    }


    /**
     * Sets the expiration_date value for this GCRCalamityEvent.
     * 
     * @param expiration_date
     */
    public void setExpiration_date(java.util.Date expiration_date) {
        this.expiration_date = expiration_date;
    }


    /**
     * Gets the damage_amount value for this GCRCalamityEvent.
     * 
     * @return damage_amount
     */
    public java.lang.String getDamage_amount() {
        return damage_amount;
    }


    /**
     * Sets the damage_amount value for this GCRCalamityEvent.
     * 
     * @param damage_amount
     */
    public void setDamage_amount(java.lang.String damage_amount) {
        this.damage_amount = damage_amount;
    }


    /**
     * Gets the damage_currency value for this GCRCalamityEvent.
     * 
     * @return damage_currency
     */
    public java.lang.String getDamage_currency() {
        return damage_currency;
    }


    /**
     * Sets the damage_currency value for this GCRCalamityEvent.
     * 
     * @param damage_currency
     */
    public void setDamage_currency(java.lang.String damage_currency) {
        this.damage_currency = damage_currency;
    }


    /**
     * Gets the insurance_code value for this GCRCalamityEvent.
     * 
     * @return insurance_code
     */
    public java.lang.Integer getInsurance_code() {
        return insurance_code;
    }


    /**
     * Sets the insurance_code value for this GCRCalamityEvent.
     * 
     * @param insurance_code
     */
    public void setInsurance_code(java.lang.Integer insurance_code) {
        this.insurance_code = insurance_code;
    }


    /**
     * Gets the insurance_text value for this GCRCalamityEvent.
     * 
     * @return insurance_text
     */
    public java.lang.String getInsurance_text() {
        return insurance_text;
    }


    /**
     * Sets the insurance_text value for this GCRCalamityEvent.
     * 
     * @param insurance_text
     */
    public void setInsurance_text(java.lang.String insurance_text) {
        this.insurance_text = insurance_text;
    }


    /**
     * Gets the instigator_graydon_company_id value for this GCRCalamityEvent.
     * 
     * @return instigator_graydon_company_id
     */
    public java.math.BigInteger getInstigator_graydon_company_id() {
        return instigator_graydon_company_id;
    }


    /**
     * Sets the instigator_graydon_company_id value for this GCRCalamityEvent.
     * 
     * @param instigator_graydon_company_id
     */
    public void setInstigator_graydon_company_id(java.math.BigInteger instigator_graydon_company_id) {
        this.instigator_graydon_company_id = instigator_graydon_company_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCalamityEvent)) return false;
        GCRCalamityEvent other = (GCRCalamityEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.event_code == other.getEvent_code() &&
            ((this.event_text==null && other.getEvent_text()==null) || 
             (this.event_text!=null &&
              this.event_text.equals(other.getEvent_text()))) &&
            ((this.event_date==null && other.getEvent_date()==null) || 
             (this.event_date!=null &&
              this.event_date.equals(other.getEvent_date()))) &&
            ((this.expiration_date==null && other.getExpiration_date()==null) || 
             (this.expiration_date!=null &&
              this.expiration_date.equals(other.getExpiration_date()))) &&
            ((this.damage_amount==null && other.getDamage_amount()==null) || 
             (this.damage_amount!=null &&
              this.damage_amount.equals(other.getDamage_amount()))) &&
            ((this.damage_currency==null && other.getDamage_currency()==null) || 
             (this.damage_currency!=null &&
              this.damage_currency.equals(other.getDamage_currency()))) &&
            ((this.insurance_code==null && other.getInsurance_code()==null) || 
             (this.insurance_code!=null &&
              this.insurance_code.equals(other.getInsurance_code()))) &&
            ((this.insurance_text==null && other.getInsurance_text()==null) || 
             (this.insurance_text!=null &&
              this.insurance_text.equals(other.getInsurance_text()))) &&
            ((this.instigator_graydon_company_id==null && other.getInstigator_graydon_company_id()==null) || 
             (this.instigator_graydon_company_id!=null &&
              this.instigator_graydon_company_id.equals(other.getInstigator_graydon_company_id())));
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
        _hashCode += getEvent_code();
        if (getEvent_text() != null) {
            _hashCode += getEvent_text().hashCode();
        }
        if (getEvent_date() != null) {
            _hashCode += getEvent_date().hashCode();
        }
        if (getExpiration_date() != null) {
            _hashCode += getExpiration_date().hashCode();
        }
        if (getDamage_amount() != null) {
            _hashCode += getDamage_amount().hashCode();
        }
        if (getDamage_currency() != null) {
            _hashCode += getDamage_currency().hashCode();
        }
        if (getInsurance_code() != null) {
            _hashCode += getInsurance_code().hashCode();
        }
        if (getInsurance_text() != null) {
            _hashCode += getInsurance_text().hashCode();
        }
        if (getInstigator_graydon_company_id() != null) {
            _hashCode += getInstigator_graydon_company_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCalamityEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamityEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "event_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "event_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "event_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "expiration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damage_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "damage_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damage_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "damage_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insurance_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insurance_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instigator_graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "instigator_graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
