/**
 * RangeAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RangeAddress  implements java.io.Serializable {
    private nl.webservices.www.soap.PCReeks reeks;

    private java.lang.Integer huisnr;

    private java.lang.String huisnr_toevoeging;

    public RangeAddress() {
    }

    public RangeAddress(
           nl.webservices.www.soap.PCReeks reeks,
           java.lang.Integer huisnr,
           java.lang.String huisnr_toevoeging) {
           this.reeks = reeks;
           this.huisnr = huisnr;
           this.huisnr_toevoeging = huisnr_toevoeging;
    }


    /**
     * Gets the reeks value for this RangeAddress.
     * 
     * @return reeks
     */
    public nl.webservices.www.soap.PCReeks getReeks() {
        return reeks;
    }


    /**
     * Sets the reeks value for this RangeAddress.
     * 
     * @param reeks
     */
    public void setReeks(nl.webservices.www.soap.PCReeks reeks) {
        this.reeks = reeks;
    }


    /**
     * Gets the huisnr value for this RangeAddress.
     * 
     * @return huisnr
     */
    public java.lang.Integer getHuisnr() {
        return huisnr;
    }


    /**
     * Sets the huisnr value for this RangeAddress.
     * 
     * @param huisnr
     */
    public void setHuisnr(java.lang.Integer huisnr) {
        this.huisnr = huisnr;
    }


    /**
     * Gets the huisnr_toevoeging value for this RangeAddress.
     * 
     * @return huisnr_toevoeging
     */
    public java.lang.String getHuisnr_toevoeging() {
        return huisnr_toevoeging;
    }


    /**
     * Sets the huisnr_toevoeging value for this RangeAddress.
     * 
     * @param huisnr_toevoeging
     */
    public void setHuisnr_toevoeging(java.lang.String huisnr_toevoeging) {
        this.huisnr_toevoeging = huisnr_toevoeging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeAddress)) return false;
        RangeAddress other = (RangeAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reeks==null && other.getReeks()==null) || 
             (this.reeks!=null &&
              this.reeks.equals(other.getReeks()))) &&
            ((this.huisnr==null && other.getHuisnr()==null) || 
             (this.huisnr!=null &&
              this.huisnr.equals(other.getHuisnr()))) &&
            ((this.huisnr_toevoeging==null && other.getHuisnr_toevoeging()==null) || 
             (this.huisnr_toevoeging!=null &&
              this.huisnr_toevoeging.equals(other.getHuisnr_toevoeging())));
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
        if (getReeks() != null) {
            _hashCode += getReeks().hashCode();
        }
        if (getHuisnr() != null) {
            _hashCode += getHuisnr().hashCode();
        }
        if (getHuisnr_toevoeging() != null) {
            _hashCode += getHuisnr_toevoeging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RangeAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RangeAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reeks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reeks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PCReeks"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnr_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnr_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
