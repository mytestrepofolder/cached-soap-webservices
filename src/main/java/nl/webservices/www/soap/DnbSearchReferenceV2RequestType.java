/**
 * DnbSearchReferenceV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DnbSearchReferenceV2RequestType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String streetname;

    private java.lang.String houseno;

    private java.lang.String housenoaddition;

    private java.lang.String postcode;

    private java.lang.String cityname;

    private java.lang.String region;

    private java.lang.String country;

    private int page;

    public DnbSearchReferenceV2RequestType() {
    }

    public DnbSearchReferenceV2RequestType(
           java.lang.String name,
           java.lang.String streetname,
           java.lang.String houseno,
           java.lang.String housenoaddition,
           java.lang.String postcode,
           java.lang.String cityname,
           java.lang.String region,
           java.lang.String country,
           int page) {
           this.name = name;
           this.streetname = streetname;
           this.houseno = houseno;
           this.housenoaddition = housenoaddition;
           this.postcode = postcode;
           this.cityname = cityname;
           this.region = region;
           this.country = country;
           this.page = page;
    }


    /**
     * Gets the name value for this DnbSearchReferenceV2RequestType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DnbSearchReferenceV2RequestType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the streetname value for this DnbSearchReferenceV2RequestType.
     * 
     * @return streetname
     */
    public java.lang.String getStreetname() {
        return streetname;
    }


    /**
     * Sets the streetname value for this DnbSearchReferenceV2RequestType.
     * 
     * @param streetname
     */
    public void setStreetname(java.lang.String streetname) {
        this.streetname = streetname;
    }


    /**
     * Gets the houseno value for this DnbSearchReferenceV2RequestType.
     * 
     * @return houseno
     */
    public java.lang.String getHouseno() {
        return houseno;
    }


    /**
     * Sets the houseno value for this DnbSearchReferenceV2RequestType.
     * 
     * @param houseno
     */
    public void setHouseno(java.lang.String houseno) {
        this.houseno = houseno;
    }


    /**
     * Gets the housenoaddition value for this DnbSearchReferenceV2RequestType.
     * 
     * @return housenoaddition
     */
    public java.lang.String getHousenoaddition() {
        return housenoaddition;
    }


    /**
     * Sets the housenoaddition value for this DnbSearchReferenceV2RequestType.
     * 
     * @param housenoaddition
     */
    public void setHousenoaddition(java.lang.String housenoaddition) {
        this.housenoaddition = housenoaddition;
    }


    /**
     * Gets the postcode value for this DnbSearchReferenceV2RequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DnbSearchReferenceV2RequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the cityname value for this DnbSearchReferenceV2RequestType.
     * 
     * @return cityname
     */
    public java.lang.String getCityname() {
        return cityname;
    }


    /**
     * Sets the cityname value for this DnbSearchReferenceV2RequestType.
     * 
     * @param cityname
     */
    public void setCityname(java.lang.String cityname) {
        this.cityname = cityname;
    }


    /**
     * Gets the region value for this DnbSearchReferenceV2RequestType.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DnbSearchReferenceV2RequestType.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the country value for this DnbSearchReferenceV2RequestType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DnbSearchReferenceV2RequestType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the page value for this DnbSearchReferenceV2RequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this DnbSearchReferenceV2RequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DnbSearchReferenceV2RequestType)) return false;
        DnbSearchReferenceV2RequestType other = (DnbSearchReferenceV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.streetname==null && other.getStreetname()==null) || 
             (this.streetname!=null &&
              this.streetname.equals(other.getStreetname()))) &&
            ((this.houseno==null && other.getHouseno()==null) || 
             (this.houseno!=null &&
              this.houseno.equals(other.getHouseno()))) &&
            ((this.housenoaddition==null && other.getHousenoaddition()==null) || 
             (this.housenoaddition!=null &&
              this.housenoaddition.equals(other.getHousenoaddition()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.cityname==null && other.getCityname()==null) || 
             (this.cityname!=null &&
              this.cityname.equals(other.getCityname()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStreetname() != null) {
            _hashCode += getStreetname().hashCode();
        }
        if (getHouseno() != null) {
            _hashCode += getHouseno().hashCode();
        }
        if (getHousenoaddition() != null) {
            _hashCode += getHousenoaddition().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCityname() != null) {
            _hashCode += getCityname().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnbSearchReferenceV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnbSearchReferenceV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
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
        elemField.setFieldName("houseno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "houseno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housenoaddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "housenoaddition"));
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
        elemField.setFieldName("cityname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
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
