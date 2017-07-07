/**
 * AantekeningRecht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AantekeningRecht  implements java.io.Serializable {
    private java.lang.String stuk_id;

    private java.lang.String betrokkene_id;

    private java.lang.String omschrijving_aantekening;

    private java.lang.String beschrijving_aantekening;

    private java.util.Date einddatum_aantekening;

    public AantekeningRecht() {
    }

    public AantekeningRecht(
           java.lang.String stuk_id,
           java.lang.String betrokkene_id,
           java.lang.String omschrijving_aantekening,
           java.lang.String beschrijving_aantekening,
           java.util.Date einddatum_aantekening) {
           this.stuk_id = stuk_id;
           this.betrokkene_id = betrokkene_id;
           this.omschrijving_aantekening = omschrijving_aantekening;
           this.beschrijving_aantekening = beschrijving_aantekening;
           this.einddatum_aantekening = einddatum_aantekening;
    }


    /**
     * Gets the stuk_id value for this AantekeningRecht.
     * 
     * @return stuk_id
     */
    public java.lang.String getStuk_id() {
        return stuk_id;
    }


    /**
     * Sets the stuk_id value for this AantekeningRecht.
     * 
     * @param stuk_id
     */
    public void setStuk_id(java.lang.String stuk_id) {
        this.stuk_id = stuk_id;
    }


    /**
     * Gets the betrokkene_id value for this AantekeningRecht.
     * 
     * @return betrokkene_id
     */
    public java.lang.String getBetrokkene_id() {
        return betrokkene_id;
    }


    /**
     * Sets the betrokkene_id value for this AantekeningRecht.
     * 
     * @param betrokkene_id
     */
    public void setBetrokkene_id(java.lang.String betrokkene_id) {
        this.betrokkene_id = betrokkene_id;
    }


    /**
     * Gets the omschrijving_aantekening value for this AantekeningRecht.
     * 
     * @return omschrijving_aantekening
     */
    public java.lang.String getOmschrijving_aantekening() {
        return omschrijving_aantekening;
    }


    /**
     * Sets the omschrijving_aantekening value for this AantekeningRecht.
     * 
     * @param omschrijving_aantekening
     */
    public void setOmschrijving_aantekening(java.lang.String omschrijving_aantekening) {
        this.omschrijving_aantekening = omschrijving_aantekening;
    }


    /**
     * Gets the beschrijving_aantekening value for this AantekeningRecht.
     * 
     * @return beschrijving_aantekening
     */
    public java.lang.String getBeschrijving_aantekening() {
        return beschrijving_aantekening;
    }


    /**
     * Sets the beschrijving_aantekening value for this AantekeningRecht.
     * 
     * @param beschrijving_aantekening
     */
    public void setBeschrijving_aantekening(java.lang.String beschrijving_aantekening) {
        this.beschrijving_aantekening = beschrijving_aantekening;
    }


    /**
     * Gets the einddatum_aantekening value for this AantekeningRecht.
     * 
     * @return einddatum_aantekening
     */
    public java.util.Date getEinddatum_aantekening() {
        return einddatum_aantekening;
    }


    /**
     * Sets the einddatum_aantekening value for this AantekeningRecht.
     * 
     * @param einddatum_aantekening
     */
    public void setEinddatum_aantekening(java.util.Date einddatum_aantekening) {
        this.einddatum_aantekening = einddatum_aantekening;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AantekeningRecht)) return false;
        AantekeningRecht other = (AantekeningRecht) obj;
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
            ((this.omschrijving_aantekening==null && other.getOmschrijving_aantekening()==null) || 
             (this.omschrijving_aantekening!=null &&
              this.omschrijving_aantekening.equals(other.getOmschrijving_aantekening()))) &&
            ((this.beschrijving_aantekening==null && other.getBeschrijving_aantekening()==null) || 
             (this.beschrijving_aantekening!=null &&
              this.beschrijving_aantekening.equals(other.getBeschrijving_aantekening()))) &&
            ((this.einddatum_aantekening==null && other.getEinddatum_aantekening()==null) || 
             (this.einddatum_aantekening!=null &&
              this.einddatum_aantekening.equals(other.getEinddatum_aantekening())));
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
        if (getOmschrijving_aantekening() != null) {
            _hashCode += getOmschrijving_aantekening().hashCode();
        }
        if (getBeschrijving_aantekening() != null) {
            _hashCode += getBeschrijving_aantekening().hashCode();
        }
        if (getEinddatum_aantekening() != null) {
            _hashCode += getEinddatum_aantekening().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AantekeningRecht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "AantekeningRecht"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving_aantekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving_aantekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beschrijving_aantekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "beschrijving_aantekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einddatum_aantekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "einddatum_aantekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
