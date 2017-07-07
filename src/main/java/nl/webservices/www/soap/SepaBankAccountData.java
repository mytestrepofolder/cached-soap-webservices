/**
 * SepaBankAccountData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SepaBankAccountData  implements java.io.Serializable {
    private java.lang.String bban;

    private java.lang.String iban;

    private java.lang.String bic;

    public SepaBankAccountData() {
    }

    public SepaBankAccountData(
           java.lang.String bban,
           java.lang.String iban,
           java.lang.String bic) {
           this.bban = bban;
           this.iban = iban;
           this.bic = bic;
    }


    /**
     * Gets the bban value for this SepaBankAccountData.
     * 
     * @return bban
     */
    public java.lang.String getBban() {
        return bban;
    }


    /**
     * Sets the bban value for this SepaBankAccountData.
     * 
     * @param bban
     */
    public void setBban(java.lang.String bban) {
        this.bban = bban;
    }


    /**
     * Gets the iban value for this SepaBankAccountData.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this SepaBankAccountData.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the bic value for this SepaBankAccountData.
     * 
     * @return bic
     */
    public java.lang.String getBic() {
        return bic;
    }


    /**
     * Sets the bic value for this SepaBankAccountData.
     * 
     * @param bic
     */
    public void setBic(java.lang.String bic) {
        this.bic = bic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SepaBankAccountData)) return false;
        SepaBankAccountData other = (SepaBankAccountData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bban==null && other.getBban()==null) || 
             (this.bban!=null &&
              this.bban.equals(other.getBban()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.bic==null && other.getBic()==null) || 
             (this.bic!=null &&
              this.bic.equals(other.getBic())));
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
        if (getBban() != null) {
            _hashCode += getBban().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SepaBankAccountData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SepaBankAccountData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bic"));
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
