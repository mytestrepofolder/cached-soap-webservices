/**
 * GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType  implements java.io.Serializable {
    private java.lang.String nbcodefrom;

    private java.math.BigInteger radius;

    private java.math.BigInteger page;

    public GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType() {
    }

    public GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType(
           java.lang.String nbcodefrom,
           java.math.BigInteger radius,
           java.math.BigInteger page) {
           this.nbcodefrom = nbcodefrom;
           this.radius = radius;
           this.page = page;
    }


    /**
     * Gets the nbcodefrom value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @return nbcodefrom
     */
    public java.lang.String getNbcodefrom() {
        return nbcodefrom;
    }


    /**
     * Sets the nbcodefrom value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @param nbcodefrom
     */
    public void setNbcodefrom(java.lang.String nbcodefrom) {
        this.nbcodefrom = nbcodefrom;
    }


    /**
     * Gets the radius value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @return radius
     */
    public java.math.BigInteger getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @param radius
     */
    public void setRadius(java.math.BigInteger radius) {
        this.radius = radius;
    }


    /**
     * Gets the page value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @return page
     */
    public java.math.BigInteger getPage() {
        return page;
    }


    /**
     * Sets the page value for this GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.
     * 
     * @param page
     */
    public void setPage(java.math.BigInteger page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType)) return false;
        GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType other = (GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nbcodefrom==null && other.getNbcodefrom()==null) || 
             (this.nbcodefrom!=null &&
              this.nbcodefrom.equals(other.getNbcodefrom()))) &&
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
        if (getNbcodefrom() != null) {
            _hashCode += getNbcodefrom().hashCode();
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
        new org.apache.axis.description.TypeDesc(GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationDistanceSortedNeighborhoodCodesRadiusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcodefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcodefrom"));
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
