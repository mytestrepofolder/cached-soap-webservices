/**
 * CreditsafeQuartiles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeQuartiles  implements java.io.Serializable {
    private java.math.BigDecimal lower;

    private java.math.BigDecimal median;

    private java.math.BigDecimal upper;

    public CreditsafeQuartiles() {
    }

    public CreditsafeQuartiles(
           java.math.BigDecimal lower,
           java.math.BigDecimal median,
           java.math.BigDecimal upper) {
           this.lower = lower;
           this.median = median;
           this.upper = upper;
    }


    /**
     * Gets the lower value for this CreditsafeQuartiles.
     * 
     * @return lower
     */
    public java.math.BigDecimal getLower() {
        return lower;
    }


    /**
     * Sets the lower value for this CreditsafeQuartiles.
     * 
     * @param lower
     */
    public void setLower(java.math.BigDecimal lower) {
        this.lower = lower;
    }


    /**
     * Gets the median value for this CreditsafeQuartiles.
     * 
     * @return median
     */
    public java.math.BigDecimal getMedian() {
        return median;
    }


    /**
     * Sets the median value for this CreditsafeQuartiles.
     * 
     * @param median
     */
    public void setMedian(java.math.BigDecimal median) {
        this.median = median;
    }


    /**
     * Gets the upper value for this CreditsafeQuartiles.
     * 
     * @return upper
     */
    public java.math.BigDecimal getUpper() {
        return upper;
    }


    /**
     * Sets the upper value for this CreditsafeQuartiles.
     * 
     * @param upper
     */
    public void setUpper(java.math.BigDecimal upper) {
        this.upper = upper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeQuartiles)) return false;
        CreditsafeQuartiles other = (CreditsafeQuartiles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lower==null && other.getLower()==null) || 
             (this.lower!=null &&
              this.lower.equals(other.getLower()))) &&
            ((this.median==null && other.getMedian()==null) || 
             (this.median!=null &&
              this.median.equals(other.getMedian()))) &&
            ((this.upper==null && other.getUpper()==null) || 
             (this.upper!=null &&
              this.upper.equals(other.getUpper())));
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
        if (getLower() != null) {
            _hashCode += getLower().hashCode();
        }
        if (getMedian() != null) {
            _hashCode += getMedian().hashCode();
        }
        if (getUpper() != null) {
            _hashCode += getUpper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeQuartiles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeQuartiles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "lower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("median");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "median"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "upper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
