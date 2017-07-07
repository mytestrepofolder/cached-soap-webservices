/**
 * GeoLocationHaversineDistanceRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationHaversineDistanceRequestType  implements java.io.Serializable {
    private float latitude_coord_1;

    private float longitude_coord_1;

    private float latitude_coord_2;

    private float longitude_coord_2;

    private boolean in_radians;

    public GeoLocationHaversineDistanceRequestType() {
    }

    public GeoLocationHaversineDistanceRequestType(
           float latitude_coord_1,
           float longitude_coord_1,
           float latitude_coord_2,
           float longitude_coord_2,
           boolean in_radians) {
           this.latitude_coord_1 = latitude_coord_1;
           this.longitude_coord_1 = longitude_coord_1;
           this.latitude_coord_2 = latitude_coord_2;
           this.longitude_coord_2 = longitude_coord_2;
           this.in_radians = in_radians;
    }


    /**
     * Gets the latitude_coord_1 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @return latitude_coord_1
     */
    public float getLatitude_coord_1() {
        return latitude_coord_1;
    }


    /**
     * Sets the latitude_coord_1 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @param latitude_coord_1
     */
    public void setLatitude_coord_1(float latitude_coord_1) {
        this.latitude_coord_1 = latitude_coord_1;
    }


    /**
     * Gets the longitude_coord_1 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @return longitude_coord_1
     */
    public float getLongitude_coord_1() {
        return longitude_coord_1;
    }


    /**
     * Sets the longitude_coord_1 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @param longitude_coord_1
     */
    public void setLongitude_coord_1(float longitude_coord_1) {
        this.longitude_coord_1 = longitude_coord_1;
    }


    /**
     * Gets the latitude_coord_2 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @return latitude_coord_2
     */
    public float getLatitude_coord_2() {
        return latitude_coord_2;
    }


    /**
     * Sets the latitude_coord_2 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @param latitude_coord_2
     */
    public void setLatitude_coord_2(float latitude_coord_2) {
        this.latitude_coord_2 = latitude_coord_2;
    }


    /**
     * Gets the longitude_coord_2 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @return longitude_coord_2
     */
    public float getLongitude_coord_2() {
        return longitude_coord_2;
    }


    /**
     * Sets the longitude_coord_2 value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @param longitude_coord_2
     */
    public void setLongitude_coord_2(float longitude_coord_2) {
        this.longitude_coord_2 = longitude_coord_2;
    }


    /**
     * Gets the in_radians value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @return in_radians
     */
    public boolean isIn_radians() {
        return in_radians;
    }


    /**
     * Sets the in_radians value for this GeoLocationHaversineDistanceRequestType.
     * 
     * @param in_radians
     */
    public void setIn_radians(boolean in_radians) {
        this.in_radians = in_radians;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationHaversineDistanceRequestType)) return false;
        GeoLocationHaversineDistanceRequestType other = (GeoLocationHaversineDistanceRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude_coord_1 == other.getLatitude_coord_1() &&
            this.longitude_coord_1 == other.getLongitude_coord_1() &&
            this.latitude_coord_2 == other.getLatitude_coord_2() &&
            this.longitude_coord_2 == other.getLongitude_coord_2() &&
            this.in_radians == other.isIn_radians();
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
        _hashCode += new Float(getLatitude_coord_1()).hashCode();
        _hashCode += new Float(getLongitude_coord_1()).hashCode();
        _hashCode += new Float(getLatitude_coord_2()).hashCode();
        _hashCode += new Float(getLongitude_coord_2()).hashCode();
        _hashCode += (isIn_radians() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationHaversineDistanceRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationHaversineDistanceRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude_coord_1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitude_coord_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude_coord_1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitude_coord_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude_coord_2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitude_coord_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude_coord_2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitude_coord_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_radians");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "in_radians"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
