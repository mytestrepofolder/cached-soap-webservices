/**
 * RouteCoordinateLatLong.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RouteCoordinateLatLong  implements java.io.Serializable {
    private double latitude;

    private double longitude;

    public RouteCoordinateLatLong() {
    }

    public RouteCoordinateLatLong(
           double latitude,
           double longitude) {
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this RouteCoordinateLatLong.
     * 
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this RouteCoordinateLatLong.
     * 
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this RouteCoordinateLatLong.
     * 
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this RouteCoordinateLatLong.
     * 
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteCoordinateLatLong)) return false;
        RouteCoordinateLatLong other = (RouteCoordinateLatLong) obj;
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
        _hashCode += new Double(getLatitude()).hashCode();
        _hashCode += new Double(getLongitude()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteCoordinateLatLong.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinateLatLong"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
