/**
 * CreditsafeLtdShareCapitalStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdShareCapitalStructure  implements java.io.Serializable {
    private java.math.BigDecimal nominal_share_capital;

    private java.math.BigDecimal issued_share_capital;

    private nl.webservices.www.soap.CreditsafeShareHolder[] share_holders;

    public CreditsafeLtdShareCapitalStructure() {
    }

    public CreditsafeLtdShareCapitalStructure(
           java.math.BigDecimal nominal_share_capital,
           java.math.BigDecimal issued_share_capital,
           nl.webservices.www.soap.CreditsafeShareHolder[] share_holders) {
           this.nominal_share_capital = nominal_share_capital;
           this.issued_share_capital = issued_share_capital;
           this.share_holders = share_holders;
    }


    /**
     * Gets the nominal_share_capital value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @return nominal_share_capital
     */
    public java.math.BigDecimal getNominal_share_capital() {
        return nominal_share_capital;
    }


    /**
     * Sets the nominal_share_capital value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @param nominal_share_capital
     */
    public void setNominal_share_capital(java.math.BigDecimal nominal_share_capital) {
        this.nominal_share_capital = nominal_share_capital;
    }


    /**
     * Gets the issued_share_capital value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @return issued_share_capital
     */
    public java.math.BigDecimal getIssued_share_capital() {
        return issued_share_capital;
    }


    /**
     * Sets the issued_share_capital value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @param issued_share_capital
     */
    public void setIssued_share_capital(java.math.BigDecimal issued_share_capital) {
        this.issued_share_capital = issued_share_capital;
    }


    /**
     * Gets the share_holders value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @return share_holders
     */
    public nl.webservices.www.soap.CreditsafeShareHolder[] getShare_holders() {
        return share_holders;
    }


    /**
     * Sets the share_holders value for this CreditsafeLtdShareCapitalStructure.
     * 
     * @param share_holders
     */
    public void setShare_holders(nl.webservices.www.soap.CreditsafeShareHolder[] share_holders) {
        this.share_holders = share_holders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdShareCapitalStructure)) return false;
        CreditsafeLtdShareCapitalStructure other = (CreditsafeLtdShareCapitalStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nominal_share_capital==null && other.getNominal_share_capital()==null) || 
             (this.nominal_share_capital!=null &&
              this.nominal_share_capital.equals(other.getNominal_share_capital()))) &&
            ((this.issued_share_capital==null && other.getIssued_share_capital()==null) || 
             (this.issued_share_capital!=null &&
              this.issued_share_capital.equals(other.getIssued_share_capital()))) &&
            ((this.share_holders==null && other.getShare_holders()==null) || 
             (this.share_holders!=null &&
              java.util.Arrays.equals(this.share_holders, other.getShare_holders())));
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
        if (getNominal_share_capital() != null) {
            _hashCode += getNominal_share_capital().hashCode();
        }
        if (getIssued_share_capital() != null) {
            _hashCode += getIssued_share_capital().hashCode();
        }
        if (getShare_holders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShare_holders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShare_holders(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdShareCapitalStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdShareCapitalStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nominal_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nominal_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "issued_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share_holders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "share_holders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeShareHolder"));
        elemField.setMinOccurs(0);
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
