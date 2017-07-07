/**
 * RouteCoordinates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RouteCoordinates  implements java.io.Serializable {
    private nl.webservices.www.soap.RouteCoordinateLatLong latlong;

    private nl.webservices.www.soap.RouteCoordinateRD rd;

    public RouteCoordinates() {
    }

    public RouteCoordinates(
           nl.webservices.www.soap.RouteCoordinateLatLong latlong,
           nl.webservices.www.soap.RouteCoordinateRD rd) {
           this.latlong = latlong;
           this.rd = rd;
    }


    /**
     * Gets the latlong value for this RouteCoordinates.
     * 
     * @return latlong
     */
    public nl.webservices.www.soap.RouteCoordinateLatLong getLatlong() {
        return latlong;
    }


    /**
     * Sets the latlong value for this RouteCoordinates.
     * 
     * @param latlong
     */
    public void setLatlong(nl.webservices.www.soap.RouteCoordinateLatLong latlong) {
        this.latlong = latlong;
    }


    /**
     * Gets the rd value for this RouteCoordinates.
     * 
     * @return rd
     */
    public nl.webservices.www.soap.RouteCoordinateRD getRd() {
        return rd;
    }


    /**
     * Sets the rd value for this RouteCoordinates.
     * 
     * @param rd
     */
    public void setRd(nl.webservices.www.soap.RouteCoordinateRD rd) {
        this.rd = rd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteCoordinates)) return false;
        RouteCoordinates other = (RouteCoordinates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latlong==null && other.getLatlong()==null) || 
             (this.latlong!=null &&
              this.latlong.equals(other.getLatlong()))) &&
            ((this.rd==null && other.getRd()==null) || 
             (this.rd!=null &&
              this.rd.equals(other.getRd())));
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
        if (getLatlong() != null) {
            _hashCode += getLatlong().hashCode();
        }
        if (getRd() != null) {
            _hashCode += getRd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteCoordinates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latlong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latlong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinateLatLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinateRD"));
        elemField.setMinOccurs(0);
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
