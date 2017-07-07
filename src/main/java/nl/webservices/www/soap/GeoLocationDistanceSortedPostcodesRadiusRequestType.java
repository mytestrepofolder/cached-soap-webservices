/**
 * GeoLocationDistanceSortedPostcodesRadiusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationDistanceSortedPostcodesRadiusRequestType  implements java.io.Serializable {
    private java.lang.String postcodefrom;

    private java.math.BigInteger radius;

    private java.math.BigInteger page;

    public GeoLocationDistanceSortedPostcodesRadiusRequestType() {
    }

    public GeoLocationDistanceSortedPostcodesRadiusRequestType(
           java.lang.String postcodefrom,
           java.math.BigInteger radius,
           java.math.BigInteger page) {
           this.postcodefrom = postcodefrom;
           this.radius = radius;
           this.page = page;
    }


    /**
     * Gets the postcodefrom value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @return postcodefrom
     */
    public java.lang.String getPostcodefrom() {
        return postcodefrom;
    }


    /**
     * Sets the postcodefrom value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @param postcodefrom
     */
    public void setPostcodefrom(java.lang.String postcodefrom) {
        this.postcodefrom = postcodefrom;
    }


    /**
     * Gets the radius value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @return radius
     */
    public java.math.BigInteger getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @param radius
     */
    public void setRadius(java.math.BigInteger radius) {
        this.radius = radius;
    }


    /**
     * Gets the page value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @return page
     */
    public java.math.BigInteger getPage() {
        return page;
    }


    /**
     * Sets the page value for this GeoLocationDistanceSortedPostcodesRadiusRequestType.
     * 
     * @param page
     */
    public void setPage(java.math.BigInteger page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationDistanceSortedPostcodesRadiusRequestType)) return false;
        GeoLocationDistanceSortedPostcodesRadiusRequestType other = (GeoLocationDistanceSortedPostcodesRadiusRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcodefrom==null && other.getPostcodefrom()==null) || 
             (this.postcodefrom!=null &&
              this.postcodefrom.equals(other.getPostcodefrom()))) &&
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage())));
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
        if (getPostcodefrom() != null) {
            _hashCode += getPostcodefrom().hashCode();
        }
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationDistanceSortedPostcodesRadiusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationDistanceSortedPostcodesRadiusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcodefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcodefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
