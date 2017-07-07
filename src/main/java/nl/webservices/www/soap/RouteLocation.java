/**
 * RouteLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RouteLocation  implements java.io.Serializable {
    private nl.webservices.www.soap.RouteAddress address;

    private nl.webservices.www.soap.RouteCoordinates coordinates;

    public RouteLocation() {
    }

    public RouteLocation(
           nl.webservices.www.soap.RouteAddress address,
           nl.webservices.www.soap.RouteCoordinates coordinates) {
           this.address = address;
           this.coordinates = coordinates;
    }


    /**
     * Gets the address value for this RouteLocation.
     * 
     * @return address
     */
    public nl.webservices.www.soap.RouteAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this RouteLocation.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.RouteAddress address) {
        this.address = address;
    }


    /**
     * Gets the coordinates value for this RouteLocation.
     * 
     * @return coordinates
     */
    public nl.webservices.www.soap.RouteCoordinates getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this RouteLocation.
     * 
     * @param coordinates
     */
    public void setCoordinates(nl.webservices.www.soap.RouteCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteLocation)) return false;
        RouteLocation other = (RouteLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCoordinates() != null) {
            _hashCode += getCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinates"));
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
