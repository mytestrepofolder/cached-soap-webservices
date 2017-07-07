/**
 * KadasterUittrekselKadastraleKaartPerceelV3RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterUittrekselKadastraleKaartPerceelV3RequestType  implements java.io.Serializable {
    private java.lang.String gemeentecode;

    private java.lang.String gemeentenaam;

    private java.lang.String sectie;

    private java.lang.String perceelnummer;

    private java.lang.String relatiecode;

    private java.lang.String volgnummer;

    private java.lang.String format;

    public KadasterUittrekselKadastraleKaartPerceelV3RequestType() {
    }

    public KadasterUittrekselKadastraleKaartPerceelV3RequestType(
           java.lang.String gemeentecode,
           java.lang.String gemeentenaam,
           java.lang.String sectie,
           java.lang.String perceelnummer,
           java.lang.String relatiecode,
           java.lang.String volgnummer,
           java.lang.String format) {
           this.gemeentecode = gemeentecode;
           this.gemeentenaam = gemeentenaam;
           this.sectie = sectie;
           this.perceelnummer = perceelnummer;
           this.relatiecode = relatiecode;
           this.volgnummer = volgnummer;
           this.format = format;
    }


    /**
     * Gets the gemeentecode value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return gemeentecode
     */
    public java.lang.String getGemeentecode() {
        return gemeentecode;
    }


    /**
     * Sets the gemeentecode value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param gemeentecode
     */
    public void setGemeentecode(java.lang.String gemeentecode) {
        this.gemeentecode = gemeentecode;
    }


    /**
     * Gets the gemeentenaam value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return gemeentenaam
     */
    public java.lang.String getGemeentenaam() {
        return gemeentenaam;
    }


    /**
     * Sets the gemeentenaam value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param gemeentenaam
     */
    public void setGemeentenaam(java.lang.String gemeentenaam) {
        this.gemeentenaam = gemeentenaam;
    }


    /**
     * Gets the sectie value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return sectie
     */
    public java.lang.String getSectie() {
        return sectie;
    }


    /**
     * Sets the sectie value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param sectie
     */
    public void setSectie(java.lang.String sectie) {
        this.sectie = sectie;
    }


    /**
     * Gets the perceelnummer value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return perceelnummer
     */
    public java.lang.String getPerceelnummer() {
        return perceelnummer;
    }


    /**
     * Sets the perceelnummer value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param perceelnummer
     */
    public void setPerceelnummer(java.lang.String perceelnummer) {
        this.perceelnummer = perceelnummer;
    }


    /**
     * Gets the relatiecode value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return relatiecode
     */
    public java.lang.String getRelatiecode() {
        return relatiecode;
    }


    /**
     * Sets the relatiecode value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param relatiecode
     */
    public void setRelatiecode(java.lang.String relatiecode) {
        this.relatiecode = relatiecode;
    }


    /**
     * Gets the volgnummer value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return volgnummer
     */
    public java.lang.String getVolgnummer() {
        return volgnummer;
    }


    /**
     * Sets the volgnummer value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param volgnummer
     */
    public void setVolgnummer(java.lang.String volgnummer) {
        this.volgnummer = volgnummer;
    }


    /**
     * Gets the format value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this KadasterUittrekselKadastraleKaartPerceelV3RequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterUittrekselKadastraleKaartPerceelV3RequestType)) return false;
        KadasterUittrekselKadastraleKaartPerceelV3RequestType other = (KadasterUittrekselKadastraleKaartPerceelV3RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gemeentecode==null && other.getGemeentecode()==null) || 
             (this.gemeentecode!=null &&
              this.gemeentecode.equals(other.getGemeentecode()))) &&
            ((this.gemeentenaam==null && other.getGemeentenaam()==null) || 
             (this.gemeentenaam!=null &&
              this.gemeentenaam.equals(other.getGemeentenaam()))) &&
            ((this.sectie==null && other.getSectie()==null) || 
             (this.sectie!=null &&
              this.sectie.equals(other.getSectie()))) &&
            ((this.perceelnummer==null && other.getPerceelnummer()==null) || 
             (this.perceelnummer!=null &&
              this.perceelnummer.equals(other.getPerceelnummer()))) &&
            ((this.relatiecode==null && other.getRelatiecode()==null) || 
             (this.relatiecode!=null &&
              this.relatiecode.equals(other.getRelatiecode()))) &&
            ((this.volgnummer==null && other.getVolgnummer()==null) || 
             (this.volgnummer!=null &&
              this.volgnummer.equals(other.getVolgnummer()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat())));
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
        if (getGemeentecode() != null) {
            _hashCode += getGemeentecode().hashCode();
        }
        if (getGemeentenaam() != null) {
            _hashCode += getGemeentenaam().hashCode();
        }
        if (getSectie() != null) {
            _hashCode += getSectie().hashCode();
        }
        if (getPerceelnummer() != null) {
            _hashCode += getPerceelnummer().hashCode();
        }
        if (getRelatiecode() != null) {
            _hashCode += getRelatiecode().hashCode();
        }
        if (getVolgnummer() != null) {
            _hashCode += getVolgnummer().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterUittrekselKadastraleKaartPerceelV3RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterUittrekselKadastraleKaartPerceelV3RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentenaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentenaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sectie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perceelnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "perceelnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatiecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "relatiecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volgnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "volgnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
