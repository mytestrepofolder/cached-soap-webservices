/**
 * LatLonCoordinatesMatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class LatLonCoordinatesMatch  implements java.io.Serializable {
    private float latitude;

    private float longitude;

    private java.lang.String citymatch;

    private java.lang.String streetmatch;

    public LatLonCoordinatesMatch() {
    }

    public LatLonCoordinatesMatch(
           float latitude,
           float longitude,
           java.lang.String citymatch,
           java.lang.String streetmatch) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.citymatch = citymatch;
           this.streetmatch = streetmatch;
    }


    /**
     * Gets the latitude value for this LatLonCoordinatesMatch.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LatLonCoordinatesMatch.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this LatLonCoordinatesMatch.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LatLonCoordinatesMatch.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the citymatch value for this LatLonCoordinatesMatch.
     * 
     * @return citymatch
     */
    public java.lang.String getCitymatch() {
        return citymatch;
    }


    /**
     * Sets the citymatch value for this LatLonCoordinatesMatch.
     * 
     * @param citymatch
     */
    public void setCitymatch(java.lang.String citymatch) {
        this.citymatch = citymatch;
    }


    /**
     * Gets the streetmatch value for this LatLonCoordinatesMatch.
     * 
     * @return streetmatch
     */
    public java.lang.String getStreetmatch() {
        return streetmatch;
    }


    /**
     * Sets the streetmatch value for this LatLonCoordinatesMatch.
     * 
     * @param streetmatch
     */
    public void setStreetmatch(java.lang.String streetmatch) {
        this.streetmatch = streetmatch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LatLonCoordinatesMatch)) return false;
        LatLonCoordinatesMatch other = (LatLonCoordinatesMatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            ((this.citymatch==null && other.getCitymatch()==null) || 
             (this.citymatch!=null &&
              this.citymatch.equals(other.getCitymatch()))) &&
            ((this.streetmatch==null && other.getStreetmatch()==null) || 
             (this.streetmatch!=null &&
              this.streetmatch.equals(other.getStreetmatch())));
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
        if (getCitymatch() != null) {
            _hashCode += getCitymatch().hashCode();
        }
        if (getStreetmatch() != null) {
            _hashCode += getStreetmatch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LatLonCoordinatesMatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LatLonCoordinatesMatch"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citymatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "citymatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetmatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "streetmatch"));
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
