/**
 * KadasterCoordinates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterCoordinates  implements java.io.Serializable {
    private int x;

    private int y;

    private float latitude;

    private float longitude;

    private boolean within_structure;

    public KadasterCoordinates() {
    }

    public KadasterCoordinates(
           int x,
           int y,
           float latitude,
           float longitude,
           boolean within_structure) {
           this.x = x;
           this.y = y;
           this.latitude = latitude;
           this.longitude = longitude;
           this.within_structure = within_structure;
    }


    /**
     * Gets the x value for this KadasterCoordinates.
     * 
     * @return x
     */
    public int getX() {
        return x;
    }


    /**
     * Sets the x value for this KadasterCoordinates.
     * 
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }


    /**
     * Gets the y value for this KadasterCoordinates.
     * 
     * @return y
     */
    public int getY() {
        return y;
    }


    /**
     * Sets the y value for this KadasterCoordinates.
     * 
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * Gets the latitude value for this KadasterCoordinates.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this KadasterCoordinates.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this KadasterCoordinates.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this KadasterCoordinates.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the within_structure value for this KadasterCoordinates.
     * 
     * @return within_structure
     */
    public boolean isWithin_structure() {
        return within_structure;
    }


    /**
     * Sets the within_structure value for this KadasterCoordinates.
     * 
     * @param within_structure
     */
    public void setWithin_structure(boolean within_structure) {
        this.within_structure = within_structure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterCoordinates)) return false;
        KadasterCoordinates other = (KadasterCoordinates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.x == other.getX() &&
            this.y == other.getY() &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.within_structure == other.isWithin_structure();
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
        _hashCode += getX();
        _hashCode += getY();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += (isWithin_structure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterCoordinates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadasterCoordinates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("within_structure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "within_structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
