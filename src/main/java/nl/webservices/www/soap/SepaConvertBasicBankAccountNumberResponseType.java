/**
 * SepaConvertBasicBankAccountNumberResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SepaConvertBasicBankAccountNumberResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.SepaBankAccountData bankaccount;

    public SepaConvertBasicBankAccountNumberResponseType() {
    }

    public SepaConvertBasicBankAccountNumberResponseType(
           nl.webservices.www.soap.SepaBankAccountData bankaccount) {
           this.bankaccount = bankaccount;
    }


    /**
     * Gets the bankaccount value for this SepaConvertBasicBankAccountNumberResponseType.
     * 
     * @return bankaccount
     */
    public nl.webservices.www.soap.SepaBankAccountData getBankaccount() {
        return bankaccount;
    }


    /**
     * Sets the bankaccount value for this SepaConvertBasicBankAccountNumberResponseType.
     * 
     * @param bankaccount
     */
    public void setBankaccount(nl.webservices.www.soap.SepaBankAccountData bankaccount) {
        this.bankaccount = bankaccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SepaConvertBasicBankAccountNumberResponseType)) return false;
        SepaConvertBasicBankAccountNumberResponseType other = (SepaConvertBasicBankAccountNumberResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankaccount==null && other.getBankaccount()==null) || 
             (this.bankaccount!=null &&
              this.bankaccount.equals(other.getBankaccount())));
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
        if (getBankaccount() != null) {
            _hashCode += getBankaccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SepaConvertBasicBankAccountNumberResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sepaConvertBasicBankAccountNumberResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bankaccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SepaBankAccountData"));
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
