/**
 * International.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class International  implements java.io.Serializable {
    private float matchrate;

    private java.lang.String street;

    private java.lang.String housenr;

    private java.lang.String pobox;

    private java.lang.String locality;

    private java.lang.String postcode;

    private java.lang.String province;

    private java.lang.String country;

    public International() {
    }

    public International(
           float matchrate,
           java.lang.String street,
           java.lang.String housenr,
           java.lang.String pobox,
           java.lang.String locality,
           java.lang.String postcode,
           java.lang.String province,
           java.lang.String country) {
           this.matchrate = matchrate;
           this.street = street;
           this.housenr = housenr;
           this.pobox = pobox;
           this.locality = locality;
           this.postcode = postcode;
           this.province = province;
           this.country = country;
    }


    /**
     * Gets the matchrate value for this International.
     * 
     * @return matchrate
     */
    public float getMatchrate() {
        return matchrate;
    }


    /**
     * Sets the matchrate value for this International.
     * 
     * @param matchrate
     */
    public void setMatchrate(float matchrate) {
        this.matchrate = matchrate;
    }


    /**
     * Gets the street value for this International.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this International.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the housenr value for this International.
     * 
     * @return housenr
     */
    public java.lang.String getHousenr() {
        return housenr;
    }


    /**
     * Sets the housenr value for this International.
     * 
     * @param housenr
     */
    public void setHousenr(java.lang.String housenr) {
        this.housenr = housenr;
    }


    /**
     * Gets the pobox value for this International.
     * 
     * @return pobox
     */
    public java.lang.String getPobox() {
        return pobox;
    }


    /**
     * Sets the pobox value for this International.
     * 
     * @param pobox
     */
    public void setPobox(java.lang.String pobox) {
        this.pobox = pobox;
    }


    /**
     * Gets the locality value for this International.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this International.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the postcode value for this International.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this International.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the province value for this International.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this International.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this International.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this International.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof International)) return false;
        International other = (International) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.matchrate == other.getMatchrate() &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.housenr==null && other.getHousenr()==null) || 
             (this.housenr!=null &&
              this.housenr.equals(other.getHousenr()))) &&
            ((this.pobox==null && other.getPobox()==null) || 
             (this.pobox!=null &&
              this.pobox.equals(other.getPobox()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        _hashCode += new Float(getMatchrate()).hashCode();
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHousenr() != null) {
            _hashCode += getHousenr().hashCode();
        }
        if (getPobox() != null) {
            _hashCode += getPobox().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(International.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "International"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "matchrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "housenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pobox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pobox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
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
