/**
 * NbwoEstimateValueRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoEstimateValueRequestType  implements java.io.Serializable {
    private java.lang.String postcode;

    private int huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private java.lang.String prijspeil_datum;

    private java.lang.String woningtype;

    private int inhoud;

    private int grootte;

    public NbwoEstimateValueRequestType() {
    }

    public NbwoEstimateValueRequestType(
           java.lang.String postcode,
           int huisnummer,
           java.lang.String huisnummer_toevoeging,
           java.lang.String prijspeil_datum,
           java.lang.String woningtype,
           int inhoud,
           int grootte) {
           this.postcode = postcode;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.prijspeil_datum = prijspeil_datum;
           this.woningtype = woningtype;
           this.inhoud = inhoud;
           this.grootte = grootte;
    }


    /**
     * Gets the postcode value for this NbwoEstimateValueRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this NbwoEstimateValueRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the huisnummer value for this NbwoEstimateValueRequestType.
     * 
     * @return huisnummer
     */
    public int getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this NbwoEstimateValueRequestType.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this NbwoEstimateValueRequestType.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this NbwoEstimateValueRequestType.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the prijspeil_datum value for this NbwoEstimateValueRequestType.
     * 
     * @return prijspeil_datum
     */
    public java.lang.String getPrijspeil_datum() {
        return prijspeil_datum;
    }


    /**
     * Sets the prijspeil_datum value for this NbwoEstimateValueRequestType.
     * 
     * @param prijspeil_datum
     */
    public void setPrijspeil_datum(java.lang.String prijspeil_datum) {
        this.prijspeil_datum = prijspeil_datum;
    }


    /**
     * Gets the woningtype value for this NbwoEstimateValueRequestType.
     * 
     * @return woningtype
     */
    public java.lang.String getWoningtype() {
        return woningtype;
    }


    /**
     * Sets the woningtype value for this NbwoEstimateValueRequestType.
     * 
     * @param woningtype
     */
    public void setWoningtype(java.lang.String woningtype) {
        this.woningtype = woningtype;
    }


    /**
     * Gets the inhoud value for this NbwoEstimateValueRequestType.
     * 
     * @return inhoud
     */
    public int getInhoud() {
        return inhoud;
    }


    /**
     * Sets the inhoud value for this NbwoEstimateValueRequestType.
     * 
     * @param inhoud
     */
    public void setInhoud(int inhoud) {
        this.inhoud = inhoud;
    }


    /**
     * Gets the grootte value for this NbwoEstimateValueRequestType.
     * 
     * @return grootte
     */
    public int getGrootte() {
        return grootte;
    }


    /**
     * Sets the grootte value for this NbwoEstimateValueRequestType.
     * 
     * @param grootte
     */
    public void setGrootte(int grootte) {
        this.grootte = grootte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoEstimateValueRequestType)) return false;
        NbwoEstimateValueRequestType other = (NbwoEstimateValueRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            this.huisnummer == other.getHuisnummer() &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            ((this.prijspeil_datum==null && other.getPrijspeil_datum()==null) || 
             (this.prijspeil_datum!=null &&
              this.prijspeil_datum.equals(other.getPrijspeil_datum()))) &&
            ((this.woningtype==null && other.getWoningtype()==null) || 
             (this.woningtype!=null &&
              this.woningtype.equals(other.getWoningtype()))) &&
            this.inhoud == other.getInhoud() &&
            this.grootte == other.getGrootte();
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
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        _hashCode += getHuisnummer();
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        if (getPrijspeil_datum() != null) {
            _hashCode += getPrijspeil_datum().hashCode();
        }
        if (getWoningtype() != null) {
            _hashCode += getWoningtype().hashCode();
        }
        _hashCode += getInhoud();
        _hashCode += getGrootte();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbwoEstimateValueRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbwoEstimateValueRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prijspeil_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prijspeil_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woningtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "woningtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inhoud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inhoud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grootte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "grootte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
