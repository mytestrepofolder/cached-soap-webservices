/**
 * CreditsafeOtherFinancials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeOtherFinancials  implements java.io.Serializable {
    private java.lang.String contingent_liabilities;

    private java.math.BigDecimal working_capital;

    private java.math.BigDecimal net_worth;

    public CreditsafeOtherFinancials() {
    }

    public CreditsafeOtherFinancials(
           java.lang.String contingent_liabilities,
           java.math.BigDecimal working_capital,
           java.math.BigDecimal net_worth) {
           this.contingent_liabilities = contingent_liabilities;
           this.working_capital = working_capital;
           this.net_worth = net_worth;
    }


    /**
     * Gets the contingent_liabilities value for this CreditsafeOtherFinancials.
     * 
     * @return contingent_liabilities
     */
    public java.lang.String getContingent_liabilities() {
        return contingent_liabilities;
    }


    /**
     * Sets the contingent_liabilities value for this CreditsafeOtherFinancials.
     * 
     * @param contingent_liabilities
     */
    public void setContingent_liabilities(java.lang.String contingent_liabilities) {
        this.contingent_liabilities = contingent_liabilities;
    }


    /**
     * Gets the working_capital value for this CreditsafeOtherFinancials.
     * 
     * @return working_capital
     */
    public java.math.BigDecimal getWorking_capital() {
        return working_capital;
    }


    /**
     * Sets the working_capital value for this CreditsafeOtherFinancials.
     * 
     * @param working_capital
     */
    public void setWorking_capital(java.math.BigDecimal working_capital) {
        this.working_capital = working_capital;
    }


    /**
     * Gets the net_worth value for this CreditsafeOtherFinancials.
     * 
     * @return net_worth
     */
    public java.math.BigDecimal getNet_worth() {
        return net_worth;
    }


    /**
     * Sets the net_worth value for this CreditsafeOtherFinancials.
     * 
     * @param net_worth
     */
    public void setNet_worth(java.math.BigDecimal net_worth) {
        this.net_worth = net_worth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeOtherFinancials)) return false;
        CreditsafeOtherFinancials other = (CreditsafeOtherFinancials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contingent_liabilities==null && other.getContingent_liabilities()==null) || 
             (this.contingent_liabilities!=null &&
              this.contingent_liabilities.equals(other.getContingent_liabilities()))) &&
            ((this.working_capital==null && other.getWorking_capital()==null) || 
             (this.working_capital!=null &&
              this.working_capital.equals(other.getWorking_capital()))) &&
            ((this.net_worth==null && other.getNet_worth()==null) || 
             (this.net_worth!=null &&
              this.net_worth.equals(other.getNet_worth())));
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
        if (getContingent_liabilities() != null) {
            _hashCode += getContingent_liabilities().hashCode();
        }
        if (getWorking_capital() != null) {
            _hashCode += getWorking_capital().hashCode();
        }
        if (getNet_worth() != null) {
            _hashCode += getNet_worth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeOtherFinancials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeOtherFinancials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contingent_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contingent_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("working_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "working_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_worth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_worth"));
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
