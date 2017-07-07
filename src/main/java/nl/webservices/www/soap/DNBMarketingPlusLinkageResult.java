/**
 * DNBMarketingPlusLinkageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMarketingPlusLinkageResult  implements java.io.Serializable {
    private nl.webservices.www.soap.DNBMarketing marketing;

    private nl.webservices.www.soap.DNBMarketingPlus marketing_plus;

    private nl.webservices.www.soap.DNBMarketingPlusLinkage marketing_plus_linkage;

    public DNBMarketingPlusLinkageResult() {
    }

    public DNBMarketingPlusLinkageResult(
           nl.webservices.www.soap.DNBMarketing marketing,
           nl.webservices.www.soap.DNBMarketingPlus marketing_plus,
           nl.webservices.www.soap.DNBMarketingPlusLinkage marketing_plus_linkage) {
           this.marketing = marketing;
           this.marketing_plus = marketing_plus;
           this.marketing_plus_linkage = marketing_plus_linkage;
    }


    /**
     * Gets the marketing value for this DNBMarketingPlusLinkageResult.
     * 
     * @return marketing
     */
    public nl.webservices.www.soap.DNBMarketing getMarketing() {
        return marketing;
    }


    /**
     * Sets the marketing value for this DNBMarketingPlusLinkageResult.
     * 
     * @param marketing
     */
    public void setMarketing(nl.webservices.www.soap.DNBMarketing marketing) {
        this.marketing = marketing;
    }


    /**
     * Gets the marketing_plus value for this DNBMarketingPlusLinkageResult.
     * 
     * @return marketing_plus
     */
    public nl.webservices.www.soap.DNBMarketingPlus getMarketing_plus() {
        return marketing_plus;
    }


    /**
     * Sets the marketing_plus value for this DNBMarketingPlusLinkageResult.
     * 
     * @param marketing_plus
     */
    public void setMarketing_plus(nl.webservices.www.soap.DNBMarketingPlus marketing_plus) {
        this.marketing_plus = marketing_plus;
    }


    /**
     * Gets the marketing_plus_linkage value for this DNBMarketingPlusLinkageResult.
     * 
     * @return marketing_plus_linkage
     */
    public nl.webservices.www.soap.DNBMarketingPlusLinkage getMarketing_plus_linkage() {
        return marketing_plus_linkage;
    }


    /**
     * Sets the marketing_plus_linkage value for this DNBMarketingPlusLinkageResult.
     * 
     * @param marketing_plus_linkage
     */
    public void setMarketing_plus_linkage(nl.webservices.www.soap.DNBMarketingPlusLinkage marketing_plus_linkage) {
        this.marketing_plus_linkage = marketing_plus_linkage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMarketingPlusLinkageResult)) return false;
        DNBMarketingPlusLinkageResult other = (DNBMarketingPlusLinkageResult) obj;
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
              this.marketing_plus.equals(other.getMarketing_plus()))) &&
            ((this.marketing_plus_linkage==null && other.getMarketing_plus_linkage()==null) || 
             (this.marketing_plus_linkage!=null &&
              this.marketing_plus_linkage.equals(other.getMarketing_plus_linkage())));
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
        if (getMarketing_plus_linkage() != null) {
            _hashCode += getMarketing_plus_linkage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMarketingPlusLinkageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlusLinkageResult"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing_plus_linkage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "marketing_plus_linkage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlusLinkage"));
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
