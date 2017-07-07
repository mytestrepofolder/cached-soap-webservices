/**
 * BusinessDossierSBI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessDossierSBI  implements java.io.Serializable {
    private java.lang.String primarySBICode;

    private java.lang.String secondarySBICode1;

    private java.lang.String secondarySBICode2;

    private java.lang.String primarySBICodeText;

    private java.lang.String secondarySBICode1Text;

    private java.lang.String secondarySBICode2Text;

    public BusinessDossierSBI() {
    }

    public BusinessDossierSBI(
           java.lang.String primarySBICode,
           java.lang.String secondarySBICode1,
           java.lang.String secondarySBICode2,
           java.lang.String primarySBICodeText,
           java.lang.String secondarySBICode1Text,
           java.lang.String secondarySBICode2Text) {
           this.primarySBICode = primarySBICode;
           this.secondarySBICode1 = secondarySBICode1;
           this.secondarySBICode2 = secondarySBICode2;
           this.primarySBICodeText = primarySBICodeText;
           this.secondarySBICode1Text = secondarySBICode1Text;
           this.secondarySBICode2Text = secondarySBICode2Text;
    }


    /**
     * Gets the primarySBICode value for this BusinessDossierSBI.
     * 
     * @return primarySBICode
     */
    public java.lang.String getPrimarySBICode() {
        return primarySBICode;
    }


    /**
     * Sets the primarySBICode value for this BusinessDossierSBI.
     * 
     * @param primarySBICode
     */
    public void setPrimarySBICode(java.lang.String primarySBICode) {
        this.primarySBICode = primarySBICode;
    }


    /**
     * Gets the secondarySBICode1 value for this BusinessDossierSBI.
     * 
     * @return secondarySBICode1
     */
    public java.lang.String getSecondarySBICode1() {
        return secondarySBICode1;
    }


    /**
     * Sets the secondarySBICode1 value for this BusinessDossierSBI.
     * 
     * @param secondarySBICode1
     */
    public void setSecondarySBICode1(java.lang.String secondarySBICode1) {
        this.secondarySBICode1 = secondarySBICode1;
    }


    /**
     * Gets the secondarySBICode2 value for this BusinessDossierSBI.
     * 
     * @return secondarySBICode2
     */
    public java.lang.String getSecondarySBICode2() {
        return secondarySBICode2;
    }


    /**
     * Sets the secondarySBICode2 value for this BusinessDossierSBI.
     * 
     * @param secondarySBICode2
     */
    public void setSecondarySBICode2(java.lang.String secondarySBICode2) {
        this.secondarySBICode2 = secondarySBICode2;
    }


    /**
     * Gets the primarySBICodeText value for this BusinessDossierSBI.
     * 
     * @return primarySBICodeText
     */
    public java.lang.String getPrimarySBICodeText() {
        return primarySBICodeText;
    }


    /**
     * Sets the primarySBICodeText value for this BusinessDossierSBI.
     * 
     * @param primarySBICodeText
     */
    public void setPrimarySBICodeText(java.lang.String primarySBICodeText) {
        this.primarySBICodeText = primarySBICodeText;
    }


    /**
     * Gets the secondarySBICode1Text value for this BusinessDossierSBI.
     * 
     * @return secondarySBICode1Text
     */
    public java.lang.String getSecondarySBICode1Text() {
        return secondarySBICode1Text;
    }


    /**
     * Sets the secondarySBICode1Text value for this BusinessDossierSBI.
     * 
     * @param secondarySBICode1Text
     */
    public void setSecondarySBICode1Text(java.lang.String secondarySBICode1Text) {
        this.secondarySBICode1Text = secondarySBICode1Text;
    }


    /**
     * Gets the secondarySBICode2Text value for this BusinessDossierSBI.
     * 
     * @return secondarySBICode2Text
     */
    public java.lang.String getSecondarySBICode2Text() {
        return secondarySBICode2Text;
    }


    /**
     * Sets the secondarySBICode2Text value for this BusinessDossierSBI.
     * 
     * @param secondarySBICode2Text
     */
    public void setSecondarySBICode2Text(java.lang.String secondarySBICode2Text) {
        this.secondarySBICode2Text = secondarySBICode2Text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDossierSBI)) return false;
        BusinessDossierSBI other = (BusinessDossierSBI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primarySBICode==null && other.getPrimarySBICode()==null) || 
             (this.primarySBICode!=null &&
              this.primarySBICode.equals(other.getPrimarySBICode()))) &&
            ((this.secondarySBICode1==null && other.getSecondarySBICode1()==null) || 
             (this.secondarySBICode1!=null &&
              this.secondarySBICode1.equals(other.getSecondarySBICode1()))) &&
            ((this.secondarySBICode2==null && other.getSecondarySBICode2()==null) || 
             (this.secondarySBICode2!=null &&
              this.secondarySBICode2.equals(other.getSecondarySBICode2()))) &&
            ((this.primarySBICodeText==null && other.getPrimarySBICodeText()==null) || 
             (this.primarySBICodeText!=null &&
              this.primarySBICodeText.equals(other.getPrimarySBICodeText()))) &&
            ((this.secondarySBICode1Text==null && other.getSecondarySBICode1Text()==null) || 
             (this.secondarySBICode1Text!=null &&
              this.secondarySBICode1Text.equals(other.getSecondarySBICode1Text()))) &&
            ((this.secondarySBICode2Text==null && other.getSecondarySBICode2Text()==null) || 
             (this.secondarySBICode2Text!=null &&
              this.secondarySBICode2Text.equals(other.getSecondarySBICode2Text())));
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
        if (getPrimarySBICode() != null) {
            _hashCode += getPrimarySBICode().hashCode();
        }
        if (getSecondarySBICode1() != null) {
            _hashCode += getSecondarySBICode1().hashCode();
        }
        if (getSecondarySBICode2() != null) {
            _hashCode += getSecondarySBICode2().hashCode();
        }
        if (getPrimarySBICodeText() != null) {
            _hashCode += getPrimarySBICodeText().hashCode();
        }
        if (getSecondarySBICode1Text() != null) {
            _hashCode += getSecondarySBICode1Text().hashCode();
        }
        if (getSecondarySBICode2Text() != null) {
            _hashCode += getSecondarySBICode2Text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessDossierSBI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessDossierSBI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySBICode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PrimarySBICode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySBICodeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PrimarySBICodeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode1Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode1Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode2Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode2Text"));
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
