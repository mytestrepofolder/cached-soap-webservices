/**
 * KvkReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KvkReference  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String trade_name;

    private java.lang.String establishment_city;

    private java.lang.String establishment_street;

    private java.lang.String correspondence_city;

    private java.lang.String correspondence_street;

    private boolean indication_economically_active;

    public KvkReference() {
    }

    public KvkReference(
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String trade_name,
           java.lang.String establishment_city,
           java.lang.String establishment_street,
           java.lang.String correspondence_city,
           java.lang.String correspondence_street,
           boolean indication_economically_active) {
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.trade_name = trade_name;
           this.establishment_city = establishment_city;
           this.establishment_street = establishment_street;
           this.correspondence_city = correspondence_city;
           this.correspondence_street = correspondence_street;
           this.indication_economically_active = indication_economically_active;
    }


    /**
     * Gets the dossier_number value for this KvkReference.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this KvkReference.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this KvkReference.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this KvkReference.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the trade_name value for this KvkReference.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this KvkReference.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the establishment_city value for this KvkReference.
     * 
     * @return establishment_city
     */
    public java.lang.String getEstablishment_city() {
        return establishment_city;
    }


    /**
     * Sets the establishment_city value for this KvkReference.
     * 
     * @param establishment_city
     */
    public void setEstablishment_city(java.lang.String establishment_city) {
        this.establishment_city = establishment_city;
    }


    /**
     * Gets the establishment_street value for this KvkReference.
     * 
     * @return establishment_street
     */
    public java.lang.String getEstablishment_street() {
        return establishment_street;
    }


    /**
     * Sets the establishment_street value for this KvkReference.
     * 
     * @param establishment_street
     */
    public void setEstablishment_street(java.lang.String establishment_street) {
        this.establishment_street = establishment_street;
    }


    /**
     * Gets the correspondence_city value for this KvkReference.
     * 
     * @return correspondence_city
     */
    public java.lang.String getCorrespondence_city() {
        return correspondence_city;
    }


    /**
     * Sets the correspondence_city value for this KvkReference.
     * 
     * @param correspondence_city
     */
    public void setCorrespondence_city(java.lang.String correspondence_city) {
        this.correspondence_city = correspondence_city;
    }


    /**
     * Gets the correspondence_street value for this KvkReference.
     * 
     * @return correspondence_street
     */
    public java.lang.String getCorrespondence_street() {
        return correspondence_street;
    }


    /**
     * Sets the correspondence_street value for this KvkReference.
     * 
     * @param correspondence_street
     */
    public void setCorrespondence_street(java.lang.String correspondence_street) {
        this.correspondence_street = correspondence_street;
    }


    /**
     * Gets the indication_economically_active value for this KvkReference.
     * 
     * @return indication_economically_active
     */
    public boolean isIndication_economically_active() {
        return indication_economically_active;
    }


    /**
     * Sets the indication_economically_active value for this KvkReference.
     * 
     * @param indication_economically_active
     */
    public void setIndication_economically_active(boolean indication_economically_active) {
        this.indication_economically_active = indication_economically_active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KvkReference)) return false;
        KvkReference other = (KvkReference) obj;
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
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.establishment_city==null && other.getEstablishment_city()==null) || 
             (this.establishment_city!=null &&
              this.establishment_city.equals(other.getEstablishment_city()))) &&
            ((this.establishment_street==null && other.getEstablishment_street()==null) || 
             (this.establishment_street!=null &&
              this.establishment_street.equals(other.getEstablishment_street()))) &&
            ((this.correspondence_city==null && other.getCorrespondence_city()==null) || 
             (this.correspondence_city!=null &&
              this.correspondence_city.equals(other.getCorrespondence_city()))) &&
            ((this.correspondence_street==null && other.getCorrespondence_street()==null) || 
             (this.correspondence_street!=null &&
              this.correspondence_street.equals(other.getCorrespondence_street()))) &&
            this.indication_economically_active == other.isIndication_economically_active();
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
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getEstablishment_city() != null) {
            _hashCode += getEstablishment_city().hashCode();
        }
        if (getEstablishment_street() != null) {
            _hashCode += getEstablishment_street().hashCode();
        }
        if (getCorrespondence_city() != null) {
            _hashCode += getCorrespondence_city().hashCode();
        }
        if (getCorrespondence_street() != null) {
            _hashCode += getCorrespondence_street().hashCode();
        }
        _hashCode += (isIndication_economically_active() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KvkReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_number"));
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
        elemField.setFieldName("establishment_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_economically_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_economically_active"));
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
