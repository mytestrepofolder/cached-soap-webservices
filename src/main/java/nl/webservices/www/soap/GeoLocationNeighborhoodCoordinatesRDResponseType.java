/**
 * GeoLocationNeighborhoodCoordinatesRDResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationNeighborhoodCoordinatesRDResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.RDCoordinates coordinates;

    public GeoLocationNeighborhoodCoordinatesRDResponseType() {
    }

    public GeoLocationNeighborhoodCoordinatesRDResponseType(
           nl.webservices.www.soap.RDCoordinates coordinates) {
           this.coordinates = coordinates;
    }


    /**
     * Gets the coordinates value for this GeoLocationNeighborhoodCoordinatesRDResponseType.
     * 
     * @return coordinates
     */
    public nl.webservices.www.soap.RDCoordinates getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this GeoLocationNeighborhoodCoordinatesRDResponseType.
     * 
     * @param coordinates
     */
    public void setCoordinates(nl.webservices.www.soap.RDCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationNeighborhoodCoordinatesRDResponseType)) return false;
        GeoLocationNeighborhoodCoordinatesRDResponseType other = (GeoLocationNeighborhoodCoordinatesRDResponseType) obj;
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
        if (getCoordinates() != null) {
            _hashCode += getCoordinates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationNeighborhoodCoordinatesRDResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationNeighborhoodCoordinatesRDResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RDCoordinates"));
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
