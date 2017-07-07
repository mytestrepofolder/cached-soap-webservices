/**
 * RoutePlannerEUDescriptionCoordinatesLatLonResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerEUDescriptionCoordinatesLatLonResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.RouteDescriptionCoordinatesLatLon route;

    public RoutePlannerEUDescriptionCoordinatesLatLonResponseType() {
    }

    public RoutePlannerEUDescriptionCoordinatesLatLonResponseType(
           nl.webservices.www.soap.RouteDescriptionCoordinatesLatLon route) {
           this.route = route;
    }


    /**
     * Gets the route value for this RoutePlannerEUDescriptionCoordinatesLatLonResponseType.
     * 
     * @return route
     */
    public nl.webservices.www.soap.RouteDescriptionCoordinatesLatLon getRoute() {
        return route;
    }


    /**
     * Sets the route value for this RoutePlannerEUDescriptionCoordinatesLatLonResponseType.
     * 
     * @param route
     */
    public void setRoute(nl.webservices.www.soap.RouteDescriptionCoordinatesLatLon route) {
        this.route = route;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerEUDescriptionCoordinatesLatLonResponseType)) return false;
        RoutePlannerEUDescriptionCoordinatesLatLonResponseType other = (RoutePlannerEUDescriptionCoordinatesLatLonResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.route==null && other.getRoute()==null) || 
             (this.route!=null &&
              this.route.equals(other.getRoute())));
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
        if (getRoute() != null) {
            _hashCode += getRoute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerEUDescriptionCoordinatesLatLonResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerEUDescriptionCoordinatesLatLonResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "route"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteDescriptionCoordinatesLatLon"));
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
