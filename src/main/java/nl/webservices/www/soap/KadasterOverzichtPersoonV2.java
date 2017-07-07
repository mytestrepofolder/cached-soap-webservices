/**
 * KadasterOverzichtPersoonV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterOverzichtPersoonV2  implements java.io.Serializable {
    private java.lang.String akr_subject_nr;

    private java.lang.String kadastrale_identificatie;

    private nl.webservices.www.soap.KadasterOverzichtNatuurlijkPersoon natuurlijk_persoon;

    private nl.webservices.www.soap.KadasterOverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon;

    private java.lang.String melding;

    public KadasterOverzichtPersoonV2() {
    }

    public KadasterOverzichtPersoonV2(
           java.lang.String akr_subject_nr,
           java.lang.String kadastrale_identificatie,
           nl.webservices.www.soap.KadasterOverzichtNatuurlijkPersoon natuurlijk_persoon,
           nl.webservices.www.soap.KadasterOverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon,
           java.lang.String melding) {
           this.akr_subject_nr = akr_subject_nr;
           this.kadastrale_identificatie = kadastrale_identificatie;
           this.natuurlijk_persoon = natuurlijk_persoon;
           this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
           this.melding = melding;
    }


    /**
     * Gets the akr_subject_nr value for this KadasterOverzichtPersoonV2.
     * 
     * @return akr_subject_nr
     */
    public java.lang.String getAkr_subject_nr() {
        return akr_subject_nr;
    }


    /**
     * Sets the akr_subject_nr value for this KadasterOverzichtPersoonV2.
     * 
     * @param akr_subject_nr
     */
    public void setAkr_subject_nr(java.lang.String akr_subject_nr) {
        this.akr_subject_nr = akr_subject_nr;
    }


    /**
     * Gets the kadastrale_identificatie value for this KadasterOverzichtPersoonV2.
     * 
     * @return kadastrale_identificatie
     */
    public java.lang.String getKadastrale_identificatie() {
        return kadastrale_identificatie;
    }


    /**
     * Sets the kadastrale_identificatie value for this KadasterOverzichtPersoonV2.
     * 
     * @param kadastrale_identificatie
     */
    public void setKadastrale_identificatie(java.lang.String kadastrale_identificatie) {
        this.kadastrale_identificatie = kadastrale_identificatie;
    }


    /**
     * Gets the natuurlijk_persoon value for this KadasterOverzichtPersoonV2.
     * 
     * @return natuurlijk_persoon
     */
    public nl.webservices.www.soap.KadasterOverzichtNatuurlijkPersoon getNatuurlijk_persoon() {
        return natuurlijk_persoon;
    }


    /**
     * Sets the natuurlijk_persoon value for this KadasterOverzichtPersoonV2.
     * 
     * @param natuurlijk_persoon
     */
    public void setNatuurlijk_persoon(nl.webservices.www.soap.KadasterOverzichtNatuurlijkPersoon natuurlijk_persoon) {
        this.natuurlijk_persoon = natuurlijk_persoon;
    }


    /**
     * Gets the niet_natuurlijk_persoon value for this KadasterOverzichtPersoonV2.
     * 
     * @return niet_natuurlijk_persoon
     */
    public nl.webservices.www.soap.KadasterOverzichtNietNatuurlijkPersoon getNiet_natuurlijk_persoon() {
        return niet_natuurlijk_persoon;
    }


    /**
     * Sets the niet_natuurlijk_persoon value for this KadasterOverzichtPersoonV2.
     * 
     * @param niet_natuurlijk_persoon
     */
    public void setNiet_natuurlijk_persoon(nl.webservices.www.soap.KadasterOverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon) {
        this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
    }


    /**
     * Gets the melding value for this KadasterOverzichtPersoonV2.
     * 
     * @return melding
     */
    public java.lang.String getMelding() {
        return melding;
    }


    /**
     * Sets the melding value for this KadasterOverzichtPersoonV2.
     * 
     * @param melding
     */
    public void setMelding(java.lang.String melding) {
        this.melding = melding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterOverzichtPersoonV2)) return false;
        KadasterOverzichtPersoonV2 other = (KadasterOverzichtPersoonV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.akr_subject_nr==null && other.getAkr_subject_nr()==null) || 
             (this.akr_subject_nr!=null &&
              this.akr_subject_nr.equals(other.getAkr_subject_nr()))) &&
            ((this.kadastrale_identificatie==null && other.getKadastrale_identificatie()==null) || 
             (this.kadastrale_identificatie!=null &&
              this.kadastrale_identificatie.equals(other.getKadastrale_identificatie()))) &&
            ((this.natuurlijk_persoon==null && other.getNatuurlijk_persoon()==null) || 
             (this.natuurlijk_persoon!=null &&
              this.natuurlijk_persoon.equals(other.getNatuurlijk_persoon()))) &&
            ((this.niet_natuurlijk_persoon==null && other.getNiet_natuurlijk_persoon()==null) || 
             (this.niet_natuurlijk_persoon!=null &&
              this.niet_natuurlijk_persoon.equals(other.getNiet_natuurlijk_persoon()))) &&
            ((this.melding==null && other.getMelding()==null) || 
             (this.melding!=null &&
              this.melding.equals(other.getMelding())));
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
        if (getAkr_subject_nr() != null) {
            _hashCode += getAkr_subject_nr().hashCode();
        }
        if (getKadastrale_identificatie() != null) {
            _hashCode += getKadastrale_identificatie().hashCode();
        }
        if (getNatuurlijk_persoon() != null) {
            _hashCode += getNatuurlijk_persoon().hashCode();
        }
        if (getNiet_natuurlijk_persoon() != null) {
            _hashCode += getNiet_natuurlijk_persoon().hashCode();
        }
        if (getMelding() != null) {
            _hashCode += getMelding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterOverzichtPersoonV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtPersoonV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akr_subject_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "akr_subject_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_identificatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_identificatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niet_natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "niet_natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtNietNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("melding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "melding"));
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
