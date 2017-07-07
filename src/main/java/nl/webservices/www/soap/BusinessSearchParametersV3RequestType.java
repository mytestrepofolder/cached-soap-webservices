/**
 * BusinessSearchParametersV3RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessSearchParametersV3RequestType  implements java.io.Serializable {
    private java.lang.String tradename;

    private java.lang.String cityname;

    private java.lang.String streetname;

    private java.lang.String postcode;

    private int houseno;

    private java.lang.String housenoaddition;

    private java.lang.String telephoneno;

    private int page;

    public BusinessSearchParametersV3RequestType() {
    }

    public BusinessSearchParametersV3RequestType(
           java.lang.String tradename,
           java.lang.String cityname,
           java.lang.String streetname,
           java.lang.String postcode,
           int houseno,
           java.lang.String housenoaddition,
           java.lang.String telephoneno,
           int page) {
           this.tradename = tradename;
           this.cityname = cityname;
           this.streetname = streetname;
           this.postcode = postcode;
           this.houseno = houseno;
           this.housenoaddition = housenoaddition;
           this.telephoneno = telephoneno;
           this.page = page;
    }


    /**
     * Gets the tradename value for this BusinessSearchParametersV3RequestType.
     * 
     * @return tradename
     */
    public java.lang.String getTradename() {
        return tradename;
    }


    /**
     * Sets the tradename value for this BusinessSearchParametersV3RequestType.
     * 
     * @param tradename
     */
    public void setTradename(java.lang.String tradename) {
        this.tradename = tradename;
    }


    /**
     * Gets the cityname value for this BusinessSearchParametersV3RequestType.
     * 
     * @return cityname
     */
    public java.lang.String getCityname() {
        return cityname;
    }


    /**
     * Sets the cityname value for this BusinessSearchParametersV3RequestType.
     * 
     * @param cityname
     */
    public void setCityname(java.lang.String cityname) {
        this.cityname = cityname;
    }


    /**
     * Gets the streetname value for this BusinessSearchParametersV3RequestType.
     * 
     * @return streetname
     */
    public java.lang.String getStreetname() {
        return streetname;
    }


    /**
     * Sets the streetname value for this BusinessSearchParametersV3RequestType.
     * 
     * @param streetname
     */
    public void setStreetname(java.lang.String streetname) {
        this.streetname = streetname;
    }


    /**
     * Gets the postcode value for this BusinessSearchParametersV3RequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this BusinessSearchParametersV3RequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the houseno value for this BusinessSearchParametersV3RequestType.
     * 
     * @return houseno
     */
    public int getHouseno() {
        return houseno;
    }


    /**
     * Sets the houseno value for this BusinessSearchParametersV3RequestType.
     * 
     * @param houseno
     */
    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }


    /**
     * Gets the housenoaddition value for this BusinessSearchParametersV3RequestType.
     * 
     * @return housenoaddition
     */
    public java.lang.String getHousenoaddition() {
        return housenoaddition;
    }


    /**
     * Sets the housenoaddition value for this BusinessSearchParametersV3RequestType.
     * 
     * @param housenoaddition
     */
    public void setHousenoaddition(java.lang.String housenoaddition) {
        this.housenoaddition = housenoaddition;
    }


    /**
     * Gets the telephoneno value for this BusinessSearchParametersV3RequestType.
     * 
     * @return telephoneno
     */
    public java.lang.String getTelephoneno() {
        return telephoneno;
    }


    /**
     * Sets the telephoneno value for this BusinessSearchParametersV3RequestType.
     * 
     * @param telephoneno
     */
    public void setTelephoneno(java.lang.String telephoneno) {
        this.telephoneno = telephoneno;
    }


    /**
     * Gets the page value for this BusinessSearchParametersV3RequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this BusinessSearchParametersV3RequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSearchParametersV3RequestType)) return false;
        BusinessSearchParametersV3RequestType other = (BusinessSearchParametersV3RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradename==null && other.getTradename()==null) || 
             (this.tradename!=null &&
              this.tradename.equals(other.getTradename()))) &&
            ((this.cityname==null && other.getCityname()==null) || 
             (this.cityname!=null &&
              this.cityname.equals(other.getCityname()))) &&
            ((this.streetname==null && other.getStreetname()==null) || 
             (this.streetname!=null &&
              this.streetname.equals(other.getStreetname()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            this.houseno == other.getHouseno() &&
            ((this.housenoaddition==null && other.getHousenoaddition()==null) || 
             (this.housenoaddition!=null &&
              this.housenoaddition.equals(other.getHousenoaddition()))) &&
            ((this.telephoneno==null && other.getTelephoneno()==null) || 
             (this.telephoneno!=null &&
              this.telephoneno.equals(other.getTelephoneno()))) &&
            this.page == other.getPage();
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
        if (getTradename() != null) {
            _hashCode += getTradename().hashCode();
        }
        if (getCityname() != null) {
            _hashCode += getCityname().hashCode();
        }
        if (getStreetname() != null) {
            _hashCode += getStreetname().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        _hashCode += getHouseno();
        if (getHousenoaddition() != null) {
            _hashCode += getHousenoaddition().hashCode();
        }
        if (getTelephoneno() != null) {
            _hashCode += getTelephoneno().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessSearchParametersV3RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessSearchParametersV3RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tradename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "streetname"));
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
        elemField.setFieldName("houseno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "houseno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housenoaddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "housenoaddition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephoneno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
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
