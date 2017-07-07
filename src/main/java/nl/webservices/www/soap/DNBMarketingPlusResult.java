/**
 * DNBMarketingPlusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMarketingPlusResult  implements java.io.Serializable {
    private nl.webservices.www.soap.DNBMarketing marketing;

    private nl.webservices.www.soap.DNBMarketingPlus marketing_plus;

    public DNBMarketingPlusResult() {
    }

    public DNBMarketingPlusResult(
           nl.webservices.www.soap.DNBMarketing marketing,
           nl.webservices.www.soap.DNBMarketingPlus marketing_plus) {
           this.marketing = marketing;
           this.marketing_plus = marketing_plus;
    }


    /**
     * Gets the marketing value for this DNBMarketingPlusResult.
     * 
     * @return marketing
     */
    public nl.webservices.www.soap.DNBMarketing getMarketing() {
        return marketing;
    }


    /**
     * Sets the marketing value for this DNBMarketingPlusResult.
     * 
     * @param marketing
     */
    public void setMarketing(nl.webservices.www.soap.DNBMarketing marketing) {
        this.marketing = marketing;
    }


    /**
     * Gets the marketing_plus value for this DNBMarketingPlusResult.
     * 
     * @return marketing_plus
     */
    public nl.webservices.www.soap.DNBMarketingPlus getMarketing_plus() {
        return marketing_plus;
    }


    /**
     * Sets the marketing_plus value for this DNBMarketingPlusResult.
     * 
     * @param marketing_plus
     */
    public void setMarketing_plus(nl.webservices.www.soap.DNBMarketingPlus marketing_plus) {
        this.marketing_plus = marketing_plus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMarketingPlusResult)) return false;
        DNBMarketingPlusResult other = (DNBMarketingPlusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marketing==null && other.getMarketing()==null) || 
             (this.marketing!=null &&
              this.marketing.equals(other.getMarketing()))) &&
            ((this.marketing_plus==null && other.getMarketing_plus()==null) || 
             (this.marketing_plus!=null &&
              this.marketing_plus.equals(other.getMarketing_plus())));
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
        if (getMarketing() != null) {
            _hashCode += getMarketing().hashCode();
        }
        if (getMarketing_plus() != null) {
            _hashCode += getMarketing_plus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMarketingPlusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "marketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketing"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing_plus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "marketing_plus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlus"));
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
