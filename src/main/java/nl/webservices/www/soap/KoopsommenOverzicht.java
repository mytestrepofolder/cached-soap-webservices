/**
 * KoopsommenOverzicht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KoopsommenOverzicht  implements java.io.Serializable {
    private java.util.Date eind_datum;

    private java.lang.String straatnaam;

    private int huisnr_van;

    private int huisnr_tm;

    private java.lang.String reeksindicatie;

    private java.lang.String gemeente;

    private nl.webservices.www.soap.Koopsom[] koopsommen;

    public KoopsommenOverzicht() {
    }

    public KoopsommenOverzicht(
           java.util.Date eind_datum,
           java.lang.String straatnaam,
           int huisnr_van,
           int huisnr_tm,
           java.lang.String reeksindicatie,
           java.lang.String gemeente,
           nl.webservices.www.soap.Koopsom[] koopsommen) {
           this.eind_datum = eind_datum;
           this.straatnaam = straatnaam;
           this.huisnr_van = huisnr_van;
           this.huisnr_tm = huisnr_tm;
           this.reeksindicatie = reeksindicatie;
           this.gemeente = gemeente;
           this.koopsommen = koopsommen;
    }


    /**
     * Gets the eind_datum value for this KoopsommenOverzicht.
     * 
     * @return eind_datum
     */
    public java.util.Date getEind_datum() {
        return eind_datum;
    }


    /**
     * Sets the eind_datum value for this KoopsommenOverzicht.
     * 
     * @param eind_datum
     */
    public void setEind_datum(java.util.Date eind_datum) {
        this.eind_datum = eind_datum;
    }


    /**
     * Gets the straatnaam value for this KoopsommenOverzicht.
     * 
     * @return straatnaam
     */
    public java.lang.String getStraatnaam() {
        return straatnaam;
    }


    /**
     * Sets the straatnaam value for this KoopsommenOverzicht.
     * 
     * @param straatnaam
     */
    public void setStraatnaam(java.lang.String straatnaam) {
        this.straatnaam = straatnaam;
    }


    /**
     * Gets the huisnr_van value for this KoopsommenOverzicht.
     * 
     * @return huisnr_van
     */
    public int getHuisnr_van() {
        return huisnr_van;
    }


    /**
     * Sets the huisnr_van value for this KoopsommenOverzicht.
     * 
     * @param huisnr_van
     */
    public void setHuisnr_van(int huisnr_van) {
        this.huisnr_van = huisnr_van;
    }


    /**
     * Gets the huisnr_tm value for this KoopsommenOverzicht.
     * 
     * @return huisnr_tm
     */
    public int getHuisnr_tm() {
        return huisnr_tm;
    }


    /**
     * Sets the huisnr_tm value for this KoopsommenOverzicht.
     * 
     * @param huisnr_tm
     */
    public void setHuisnr_tm(int huisnr_tm) {
        this.huisnr_tm = huisnr_tm;
    }


    /**
     * Gets the reeksindicatie value for this KoopsommenOverzicht.
     * 
     * @return reeksindicatie
     */
    public java.lang.String getReeksindicatie() {
        return reeksindicatie;
    }


    /**
     * Sets the reeksindicatie value for this KoopsommenOverzicht.
     * 
     * @param reeksindicatie
     */
    public void setReeksindicatie(java.lang.String reeksindicatie) {
        this.reeksindicatie = reeksindicatie;
    }


    /**
     * Gets the gemeente value for this KoopsommenOverzicht.
     * 
     * @return gemeente
     */
    public java.lang.String getGemeente() {
        return gemeente;
    }


    /**
     * Sets the gemeente value for this KoopsommenOverzicht.
     * 
     * @param gemeente
     */
    public void setGemeente(java.lang.String gemeente) {
        this.gemeente = gemeente;
    }


    /**
     * Gets the koopsommen value for this KoopsommenOverzicht.
     * 
     * @return koopsommen
     */
    public nl.webservices.www.soap.Koopsom[] getKoopsommen() {
        return koopsommen;
    }


    /**
     * Sets the koopsommen value for this KoopsommenOverzicht.
     * 
     * @param koopsommen
     */
    public void setKoopsommen(nl.webservices.www.soap.Koopsom[] koopsommen) {
        this.koopsommen = koopsommen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KoopsommenOverzicht)) return false;
        KoopsommenOverzicht other = (KoopsommenOverzicht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eind_datum==null && other.getEind_datum()==null) || 
             (this.eind_datum!=null &&
              this.eind_datum.equals(other.getEind_datum()))) &&
            ((this.straatnaam==null && other.getStraatnaam()==null) || 
             (this.straatnaam!=null &&
              this.straatnaam.equals(other.getStraatnaam()))) &&
            this.huisnr_van == other.getHuisnr_van() &&
            this.huisnr_tm == other.getHuisnr_tm() &&
            ((this.reeksindicatie==null && other.getReeksindicatie()==null) || 
             (this.reeksindicatie!=null &&
              this.reeksindicatie.equals(other.getReeksindicatie()))) &&
            ((this.gemeente==null && other.getGemeente()==null) || 
             (this.gemeente!=null &&
              this.gemeente.equals(other.getGemeente()))) &&
            ((this.koopsommen==null && other.getKoopsommen()==null) || 
             (this.koopsommen!=null &&
              java.util.Arrays.equals(this.koopsommen, other.getKoopsommen())));
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
        if (getEind_datum() != null) {
            _hashCode += getEind_datum().hashCode();
        }
        if (getStraatnaam() != null) {
            _hashCode += getStraatnaam().hashCode();
        }
        _hashCode += getHuisnr_van();
        _hashCode += getHuisnr_tm();
        if (getReeksindicatie() != null) {
            _hashCode += getReeksindicatie().hashCode();
        }
        if (getGemeente() != null) {
            _hashCode += getGemeente().hashCode();
        }
        if (getKoopsommen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKoopsommen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKoopsommen(), i);
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
        new org.apache.axis.description.TypeDesc(KoopsommenOverzicht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KoopsommenOverzicht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eind_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "eind_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straatnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straatnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnr_van");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnr_van"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnr_tm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnr_tm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reeksindicatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reeksindicatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsommen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsommen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Koopsom"));
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
