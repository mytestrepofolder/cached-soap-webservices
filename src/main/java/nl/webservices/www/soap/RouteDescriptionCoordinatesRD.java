/**
 * RouteDescriptionCoordinatesRD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RouteDescriptionCoordinatesRD  implements java.io.Serializable {
    private nl.webservices.www.soap.RouteCoordinatesRD routecoordinates;

    private nl.webservices.www.soap.RoutePart[] parts;

    public RouteDescriptionCoordinatesRD() {
    }

    public RouteDescriptionCoordinatesRD(
           nl.webservices.www.soap.RouteCoordinatesRD routecoordinates,
           nl.webservices.www.soap.RoutePart[] parts) {
           this.routecoordinates = routecoordinates;
           this.parts = parts;
    }


    /**
     * Gets the routecoordinates value for this RouteDescriptionCoordinatesRD.
     * 
     * @return routecoordinates
     */
    public nl.webservices.www.soap.RouteCoordinatesRD getRoutecoordinates() {
        return routecoordinates;
    }


    /**
     * Sets the routecoordinates value for this RouteDescriptionCoordinatesRD.
     * 
     * @param routecoordinates
     */
    public void setRoutecoordinates(nl.webservices.www.soap.RouteCoordinatesRD routecoordinates) {
        this.routecoordinates = routecoordinates;
    }


    /**
     * Gets the parts value for this RouteDescriptionCoordinatesRD.
     * 
     * @return parts
     */
    public nl.webservices.www.soap.RoutePart[] getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this RouteDescriptionCoordinatesRD.
     * 
     * @param parts
     */
    public void setParts(nl.webservices.www.soap.RoutePart[] parts) {
        this.parts = parts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteDescriptionCoordinatesRD)) return false;
        RouteDescriptionCoordinatesRD other = (RouteDescriptionCoordinatesRD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routecoordinates==null && other.getRoutecoordinates()==null) || 
             (this.routecoordinates!=null &&
              this.routecoordinates.equals(other.getRoutecoordinates()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              java.util.Arrays.equals(this.parts, other.getParts())));
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
        if (getRoutecoordinates() != null) {
            _hashCode += getRoutecoordinates().hashCode();
        }
        if (getParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParts(), i);
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
        new org.apache.axis.description.TypeDesc(RouteDescriptionCoordinatesRD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteDescriptionCoordinatesRD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routecoordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routecoordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteCoordinatesRD"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RoutePart"));
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
