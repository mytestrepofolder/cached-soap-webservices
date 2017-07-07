/**
 * PRBeperking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PRBeperking  implements java.io.Serializable {
    private java.lang.String stuk_id;

    private java.lang.String betrokkene_id;

    private java.lang.String gemeente_id;

    private java.lang.String gemeentelijke_registratie_id;

    private java.lang.String omschrijving_pr_beperking;

    private java.lang.String beschrijving_pr_beperking;

    private java.lang.String splitsing_pr_beperking;

    public PRBeperking() {
    }

    public PRBeperking(
           java.lang.String stuk_id,
           java.lang.String betrokkene_id,
           java.lang.String gemeente_id,
           java.lang.String gemeentelijke_registratie_id,
           java.lang.String omschrijving_pr_beperking,
           java.lang.String beschrijving_pr_beperking,
           java.lang.String splitsing_pr_beperking) {
           this.stuk_id = stuk_id;
           this.betrokkene_id = betrokkene_id;
           this.gemeente_id = gemeente_id;
           this.gemeentelijke_registratie_id = gemeentelijke_registratie_id;
           this.omschrijving_pr_beperking = omschrijving_pr_beperking;
           this.beschrijving_pr_beperking = beschrijving_pr_beperking;
           this.splitsing_pr_beperking = splitsing_pr_beperking;
    }


    /**
     * Gets the stuk_id value for this PRBeperking.
     * 
     * @return stuk_id
     */
    public java.lang.String getStuk_id() {
        return stuk_id;
    }


    /**
     * Sets the stuk_id value for this PRBeperking.
     * 
     * @param stuk_id
     */
    public void setStuk_id(java.lang.String stuk_id) {
        this.stuk_id = stuk_id;
    }


    /**
     * Gets the betrokkene_id value for this PRBeperking.
     * 
     * @return betrokkene_id
     */
    public java.lang.String getBetrokkene_id() {
        return betrokkene_id;
    }


    /**
     * Sets the betrokkene_id value for this PRBeperking.
     * 
     * @param betrokkene_id
     */
    public void setBetrokkene_id(java.lang.String betrokkene_id) {
        this.betrokkene_id = betrokkene_id;
    }


    /**
     * Gets the gemeente_id value for this PRBeperking.
     * 
     * @return gemeente_id
     */
    public java.lang.String getGemeente_id() {
        return gemeente_id;
    }


    /**
     * Sets the gemeente_id value for this PRBeperking.
     * 
     * @param gemeente_id
     */
    public void setGemeente_id(java.lang.String gemeente_id) {
        this.gemeente_id = gemeente_id;
    }


    /**
     * Gets the gemeentelijke_registratie_id value for this PRBeperking.
     * 
     * @return gemeentelijke_registratie_id
     */
    public java.lang.String getGemeentelijke_registratie_id() {
        return gemeentelijke_registratie_id;
    }


    /**
     * Sets the gemeentelijke_registratie_id value for this PRBeperking.
     * 
     * @param gemeentelijke_registratie_id
     */
    public void setGemeentelijke_registratie_id(java.lang.String gemeentelijke_registratie_id) {
        this.gemeentelijke_registratie_id = gemeentelijke_registratie_id;
    }


    /**
     * Gets the omschrijving_pr_beperking value for this PRBeperking.
     * 
     * @return omschrijving_pr_beperking
     */
    public java.lang.String getOmschrijving_pr_beperking() {
        return omschrijving_pr_beperking;
    }


    /**
     * Sets the omschrijving_pr_beperking value for this PRBeperking.
     * 
     * @param omschrijving_pr_beperking
     */
    public void setOmschrijving_pr_beperking(java.lang.String omschrijving_pr_beperking) {
        this.omschrijving_pr_beperking = omschrijving_pr_beperking;
    }


    /**
     * Gets the beschrijving_pr_beperking value for this PRBeperking.
     * 
     * @return beschrijving_pr_beperking
     */
    public java.lang.String getBeschrijving_pr_beperking() {
        return beschrijving_pr_beperking;
    }


    /**
     * Sets the beschrijving_pr_beperking value for this PRBeperking.
     * 
     * @param beschrijving_pr_beperking
     */
    public void setBeschrijving_pr_beperking(java.lang.String beschrijving_pr_beperking) {
        this.beschrijving_pr_beperking = beschrijving_pr_beperking;
    }


    /**
     * Gets the splitsing_pr_beperking value for this PRBeperking.
     * 
     * @return splitsing_pr_beperking
     */
    public java.lang.String getSplitsing_pr_beperking() {
        return splitsing_pr_beperking;
    }


    /**
     * Sets the splitsing_pr_beperking value for this PRBeperking.
     * 
     * @param splitsing_pr_beperking
     */
    public void setSplitsing_pr_beperking(java.lang.String splitsing_pr_beperking) {
        this.splitsing_pr_beperking = splitsing_pr_beperking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRBeperking)) return false;
        PRBeperking other = (PRBeperking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stuk_id==null && other.getStuk_id()==null) || 
             (this.stuk_id!=null &&
              this.stuk_id.equals(other.getStuk_id()))) &&
            ((this.betrokkene_id==null && other.getBetrokkene_id()==null) || 
             (this.betrokkene_id!=null &&
              this.betrokkene_id.equals(other.getBetrokkene_id()))) &&
            ((this.gemeente_id==null && other.getGemeente_id()==null) || 
             (this.gemeente_id!=null &&
              this.gemeente_id.equals(other.getGemeente_id()))) &&
            ((this.gemeentelijke_registratie_id==null && other.getGemeentelijke_registratie_id()==null) || 
             (this.gemeentelijke_registratie_id!=null &&
              this.gemeentelijke_registratie_id.equals(other.getGemeentelijke_registratie_id()))) &&
            ((this.omschrijving_pr_beperking==null && other.getOmschrijving_pr_beperking()==null) || 
             (this.omschrijving_pr_beperking!=null &&
              this.omschrijving_pr_beperking.equals(other.getOmschrijving_pr_beperking()))) &&
            ((this.beschrijving_pr_beperking==null && other.getBeschrijving_pr_beperking()==null) || 
             (this.beschrijving_pr_beperking!=null &&
              this.beschrijving_pr_beperking.equals(other.getBeschrijving_pr_beperking()))) &&
            ((this.splitsing_pr_beperking==null && other.getSplitsing_pr_beperking()==null) || 
             (this.splitsing_pr_beperking!=null &&
              this.splitsing_pr_beperking.equals(other.getSplitsing_pr_beperking())));
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
        if (getStuk_id() != null) {
            _hashCode += getStuk_id().hashCode();
        }
        if (getBetrokkene_id() != null) {
            _hashCode += getBetrokkene_id().hashCode();
        }
        if (getGemeente_id() != null) {
            _hashCode += getGemeente_id().hashCode();
        }
        if (getGemeentelijke_registratie_id() != null) {
            _hashCode += getGemeentelijke_registratie_id().hashCode();
        }
        if (getOmschrijving_pr_beperking() != null) {
            _hashCode += getOmschrijving_pr_beperking().hashCode();
        }
        if (getBeschrijving_pr_beperking() != null) {
            _hashCode += getBeschrijving_pr_beperking().hashCode();
        }
        if (getSplitsing_pr_beperking() != null) {
            _hashCode += getSplitsing_pr_beperking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRBeperking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuk_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stuk_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrokkene_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "betrokkene_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeente_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeente_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentelijke_registratie_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentelijke_registratie_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving_pr_beperking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving_pr_beperking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beschrijving_pr_beperking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "beschrijving_pr_beperking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitsing_pr_beperking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "splitsing_pr_beperking"));
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
