/**
 * DutchBusinessExtractHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessExtractHistory  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchBusinessExtractChangeForecast forecast;

    private nl.webservices.www.soap.DutchBusinessExtractReference[] references;

    public DutchBusinessExtractHistory() {
    }

    public DutchBusinessExtractHistory(
           nl.webservices.www.soap.DutchBusinessExtractChangeForecast forecast,
           nl.webservices.www.soap.DutchBusinessExtractReference[] references) {
           this.forecast = forecast;
           this.references = references;
    }


    /**
     * Gets the forecast value for this DutchBusinessExtractHistory.
     * 
     * @return forecast
     */
    public nl.webservices.www.soap.DutchBusinessExtractChangeForecast getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this DutchBusinessExtractHistory.
     * 
     * @param forecast
     */
    public void setForecast(nl.webservices.www.soap.DutchBusinessExtractChangeForecast forecast) {
        this.forecast = forecast;
    }


    /**
     * Gets the references value for this DutchBusinessExtractHistory.
     * 
     * @return references
     */
    public nl.webservices.www.soap.DutchBusinessExtractReference[] getReferences() {
        return references;
    }


    /**
     * Sets the references value for this DutchBusinessExtractHistory.
     * 
     * @param references
     */
    public void setReferences(nl.webservices.www.soap.DutchBusinessExtractReference[] references) {
        this.references = references;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessExtractHistory)) return false;
        DutchBusinessExtractHistory other = (DutchBusinessExtractHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              this.forecast.equals(other.getForecast()))) &&
            ((this.references==null && other.getReferences()==null) || 
             (this.references!=null &&
              java.util.Arrays.equals(this.references, other.getReferences())));
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
        if (getForecast() != null) {
            _hashCode += getForecast().hashCode();
        }
        if (getReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferences(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessExtractHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractChangeForecast"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "references"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractReference"));
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
