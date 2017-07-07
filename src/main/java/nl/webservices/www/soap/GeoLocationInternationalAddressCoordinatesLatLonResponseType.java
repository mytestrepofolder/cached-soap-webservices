/**
 * GeoLocationInternationalAddressCoordinatesLatLonResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationInternationalAddressCoordinatesLatLonResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.LatLonCoordinatesInternationalAddress[] coordinates;

    public GeoLocationInternationalAddressCoordinatesLatLonResponseType() {
    }

    public GeoLocationInternationalAddressCoordinatesLatLonResponseType(
           nl.webservices.www.soap.LatLonCoordinatesInternationalAddress[] coordinates) {
           this.coordinates = coordinates;
    }


    /**
     * Gets the coordinates value for this GeoLocationInternationalAddressCoordinatesLatLonResponseType.
     * 
     * @return coordinates
     */
    public nl.webservices.www.soap.LatLonCoordinatesInternationalAddress[] getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this GeoLocationInternationalAddressCoordinatesLatLonResponseType.
     * 
     * @param coordinates
     */
    public void setCoordinates(nl.webservices.www.soap.LatLonCoordinatesInternationalAddress[] coordinates) {
        this.coordinates = coordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationInternationalAddressCoordinatesLatLonResponseType)) return false;
        GeoLocationInternationalAddressCoordinatesLatLonResponseType other = (GeoLocationInternationalAddressCoordinatesLatLonResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinates==null && other.getCoordinates()==null) || 
             (this.coordinates!=null &&
              java.util.Arrays.equals(this.coordinates, other.getCoordinates())));
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
        if (getCoordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationInternationalAddressCoordinatesLatLonResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationInternationalAddressCoordinatesLatLonResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LatLonCoordinatesInternationalAddress"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
