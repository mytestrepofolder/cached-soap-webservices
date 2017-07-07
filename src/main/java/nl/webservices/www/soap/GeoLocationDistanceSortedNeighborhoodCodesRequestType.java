/**
 * GeoLocationDistanceSortedNeighborhoodCodesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationDistanceSortedNeighborhoodCodesRequestType  implements java.io.Serializable {
    private java.lang.String nbcodefrom;

    private java.lang.String[] nbcodes;

    public GeoLocationDistanceSortedNeighborhoodCodesRequestType() {
    }

    public GeoLocationDistanceSortedNeighborhoodCodesRequestType(
           java.lang.String nbcodefrom,
           java.lang.String[] nbcodes) {
           this.nbcodefrom = nbcodefrom;
           this.nbcodes = nbcodes;
    }


    /**
     * Gets the nbcodefrom value for this GeoLocationDistanceSortedNeighborhoodCodesRequestType.
     * 
     * @return nbcodefrom
     */
    public java.lang.String getNbcodefrom() {
        return nbcodefrom;
    }


    /**
     * Sets the nbcodefrom value for this GeoLocationDistanceSortedNeighborhoodCodesRequestType.
     * 
     * @param nbcodefrom
     */
    public void setNbcodefrom(java.lang.String nbcodefrom) {
        this.nbcodefrom = nbcodefrom;
    }


    /**
     * Gets the nbcodes value for this GeoLocationDistanceSortedNeighborhoodCodesRequestType.
     * 
     * @return nbcodes
     */
    public java.lang.String[] getNbcodes() {
        return nbcodes;
    }


    /**
     * Sets the nbcodes value for this GeoLocationDistanceSortedNeighborhoodCodesRequestType.
     * 
     * @param nbcodes
     */
    public void setNbcodes(java.lang.String[] nbcodes) {
        this.nbcodes = nbcodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationDistanceSortedNeighborhoodCodesRequestType)) return false;
        GeoLocationDistanceSortedNeighborhoodCodesRequestType other = (GeoLocationDistanceSortedNeighborhoodCodesRequestType) obj;
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
            ((this.nbcodes==null && other.getNbcodes()==null) || 
             (this.nbcodes!=null &&
              java.util.Arrays.equals(this.nbcodes, other.getNbcodes())));
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
        if (getNbcodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNbcodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNbcodes(), i);
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
        new org.apache.axis.description.TypeDesc(GeoLocationDistanceSortedNeighborhoodCodesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationDistanceSortedNeighborhoodCodesRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcodefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcodefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
