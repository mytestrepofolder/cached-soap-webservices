/**
 * GeoLocationLatLonToRDRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationLatLonToRDRequestType  implements java.io.Serializable {
    private float latitude;

    private float longitude;

    public GeoLocationLatLonToRDRequestType() {
    }

    public GeoLocationLatLonToRDRequestType(
           float latitude,
           float longitude) {
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this GeoLocationLatLonToRDRequestType.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GeoLocationLatLonToRDRequestType.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GeoLocationLatLonToRDRequestType.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GeoLocationLatLonToRDRequestType.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationLatLonToRDRequestType)) return false;
        GeoLocationLatLonToRDRequestType other = (GeoLocationLatLonToRDRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationLatLonToRDRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationLatLonToRDRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
