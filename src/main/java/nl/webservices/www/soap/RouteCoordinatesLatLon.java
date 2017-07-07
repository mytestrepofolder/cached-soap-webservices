/**
 * RouteCoordinatesLatLon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RouteCoordinatesLatLon  implements java.io.Serializable {
    private int number;

    private java.lang.String coordinates;

    public RouteCoordinatesLatLon() {
    }

    public RouteCoordinatesLatLon(
           int number,
           java.lang.String coordinates) {
           this.number = number;
           this.coordinates = coordinates;
    }


    /**
     * Gets the number value for this RouteCoordinatesLatLon.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this RouteCoordinatesLatLon.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the coordinates value for this RouteCoordinatesLatLon.
     * 
     * @return coordinates
     */
    public java.lang.String getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this RouteCoordinatesLatLon.
     * 
     * @param coordinates
     */
    public void setCoordinates(java.lang.String coordinates) {
        this.coordinates = coordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteCoordinatesLatLon)) return false;
        RouteCoordinatesLatLon other = (RouteCoordinatesLatLon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.number == other.getNumber() &&
            ((this.coordinates==null && other.getCoordinates()==null) || 
             (this.coordinates!=null &&
              this.coordinates.equals(other.getCoordinates())));
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
        _hashCode += getNumber();
        if (getCoordinates() != null) {
            _hashCode += getCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteCoordinatesLatLon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinatesLatLon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coordinates"));
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
