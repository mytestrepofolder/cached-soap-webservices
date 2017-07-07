/**
 * LocatieBinnenland.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class LocatieBinnenland  implements java.io.Serializable {
    private java.lang.String gemeente;

    private java.lang.String straatnaam;

    private java.lang.String postcode;

    private java.lang.Integer huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private java.lang.String huisletter;

    public LocatieBinnenland() {
    }

    public LocatieBinnenland(
           java.lang.String gemeente,
           java.lang.String straatnaam,
           java.lang.String postcode,
           java.lang.Integer huisnummer,
           java.lang.String huisnummer_toevoeging,
           java.lang.String huisletter) {
           this.gemeente = gemeente;
           this.straatnaam = straatnaam;
           this.postcode = postcode;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.huisletter = huisletter;
    }


    /**
     * Gets the gemeente value for this LocatieBinnenland.
     * 
     * @return gemeente
     */
    public java.lang.String getGemeente() {
        return gemeente;
    }


    /**
     * Sets the gemeente value for this LocatieBinnenland.
     * 
     * @param gemeente
     */
    public void setGemeente(java.lang.String gemeente) {
        this.gemeente = gemeente;
    }


    /**
     * Gets the straatnaam value for this LocatieBinnenland.
     * 
     * @return straatnaam
     */
    public java.lang.String getStraatnaam() {
        return straatnaam;
    }


    /**
     * Sets the straatnaam value for this LocatieBinnenland.
     * 
     * @param straatnaam
     */
    public void setStraatnaam(java.lang.String straatnaam) {
        this.straatnaam = straatnaam;
    }


    /**
     * Gets the postcode value for this LocatieBinnenland.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this LocatieBinnenland.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the huisnummer value for this LocatieBinnenland.
     * 
     * @return huisnummer
     */
    public java.lang.Integer getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this LocatieBinnenland.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(java.lang.Integer huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this LocatieBinnenland.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this LocatieBinnenland.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the huisletter value for this LocatieBinnenland.
     * 
     * @return huisletter
     */
    public java.lang.String getHuisletter() {
        return huisletter;
    }


    /**
     * Sets the huisletter value for this LocatieBinnenland.
     * 
     * @param huisletter
     */
    public void setHuisletter(java.lang.String huisletter) {
        this.huisletter = huisletter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocatieBinnenland)) return false;
        LocatieBinnenland other = (LocatieBinnenland) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gemeente==null && other.getGemeente()==null) || 
             (this.gemeente!=null &&
              this.gemeente.equals(other.getGemeente()))) &&
            ((this.straatnaam==null && other.getStraatnaam()==null) || 
             (this.straatnaam!=null &&
              this.straatnaam.equals(other.getStraatnaam()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.huisnummer==null && other.getHuisnummer()==null) || 
             (this.huisnummer!=null &&
              this.huisnummer.equals(other.getHuisnummer()))) &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            ((this.huisletter==null && other.getHuisletter()==null) || 
             (this.huisletter!=null &&
              this.huisletter.equals(other.getHuisletter())));
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
        if (getGemeente() != null) {
            _hashCode += getGemeente().hashCode();
        }
        if (getStraatnaam() != null) {
            _hashCode += getStraatnaam().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getHuisnummer() != null) {
            _hashCode += getHuisnummer().hashCode();
        }
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        if (getHuisletter() != null) {
            _hashCode += getHuisletter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocatieBinnenland.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBinnenland"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straatnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straatnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisletter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisletter"));
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
