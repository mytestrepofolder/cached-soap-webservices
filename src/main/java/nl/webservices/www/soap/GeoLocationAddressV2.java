/**
 * GeoLocationAddressV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationAddressV2  implements java.io.Serializable {
    private int house_no;

    private java.lang.String house_no_addition;

    private java.lang.String postcode;

    private java.lang.String streetname;

    private java.lang.String city;

    private java.lang.String district;

    private java.lang.String province;

    private int distance;

    private int x;

    private int y;

    private float latitude;

    private float longitude;

    public GeoLocationAddressV2() {
    }

    public GeoLocationAddressV2(
           int house_no,
           java.lang.String house_no_addition,
           java.lang.String postcode,
           java.lang.String streetname,
           java.lang.String city,
           java.lang.String district,
           java.lang.String province,
           int distance,
           int x,
           int y,
           float latitude,
           float longitude) {
           this.house_no = house_no;
           this.house_no_addition = house_no_addition;
           this.postcode = postcode;
           this.streetname = streetname;
           this.city = city;
           this.district = district;
           this.province = province;
           this.distance = distance;
           this.x = x;
           this.y = y;
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the house_no value for this GeoLocationAddressV2.
     * 
     * @return house_no
     */
    public int getHouse_no() {
        return house_no;
    }


    /**
     * Sets the house_no value for this GeoLocationAddressV2.
     * 
     * @param house_no
     */
    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }


    /**
     * Gets the house_no_addition value for this GeoLocationAddressV2.
     * 
     * @return house_no_addition
     */
    public java.lang.String getHouse_no_addition() {
        return house_no_addition;
    }


    /**
     * Sets the house_no_addition value for this GeoLocationAddressV2.
     * 
     * @param house_no_addition
     */
    public void setHouse_no_addition(java.lang.String house_no_addition) {
        this.house_no_addition = house_no_addition;
    }


    /**
     * Gets the postcode value for this GeoLocationAddressV2.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this GeoLocationAddressV2.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the streetname value for this GeoLocationAddressV2.
     * 
     * @return streetname
     */
    public java.lang.String getStreetname() {
        return streetname;
    }


    /**
     * Sets the streetname value for this GeoLocationAddressV2.
     * 
     * @param streetname
     */
    public void setStreetname(java.lang.String streetname) {
        this.streetname = streetname;
    }


    /**
     * Gets the city value for this GeoLocationAddressV2.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GeoLocationAddressV2.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the district value for this GeoLocationAddressV2.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this GeoLocationAddressV2.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the province value for this GeoLocationAddressV2.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this GeoLocationAddressV2.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the distance value for this GeoLocationAddressV2.
     * 
     * @return distance
     */
    public int getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this GeoLocationAddressV2.
     * 
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }


    /**
     * Gets the x value for this GeoLocationAddressV2.
     * 
     * @return x
     */
    public int getX() {
        return x;
    }


    /**
     * Sets the x value for this GeoLocationAddressV2.
     * 
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }


    /**
     * Gets the y value for this GeoLocationAddressV2.
     * 
     * @return y
     */
    public int getY() {
        return y;
    }


    /**
     * Sets the y value for this GeoLocationAddressV2.
     * 
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * Gets the latitude value for this GeoLocationAddressV2.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GeoLocationAddressV2.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GeoLocationAddressV2.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GeoLocationAddressV2.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationAddressV2)) return false;
        GeoLocationAddressV2 other = (GeoLocationAddressV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.house_no == other.getHouse_no() &&
            ((this.house_no_addition==null && other.getHouse_no_addition()==null) || 
             (this.house_no_addition!=null &&
              this.house_no_addition.equals(other.getHouse_no_addition()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.streetname==null && other.getStreetname()==null) || 
             (this.streetname!=null &&
              this.streetname.equals(other.getStreetname()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            this.distance == other.getDistance() &&
            this.x == other.getX() &&
            this.y == other.getY() &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude();
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
        _hashCode += getHouse_no();
        if (getHouse_no_addition() != null) {
            _hashCode += getHouse_no_addition().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getStreetname() != null) {
            _hashCode += getStreetname().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        _hashCode += getDistance();
        _hashCode += getX();
        _hashCode += getY();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationAddressV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GeoLocationAddressV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no_addition"));
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
        elemField.setFieldName("streetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "streetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "district"));
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
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
