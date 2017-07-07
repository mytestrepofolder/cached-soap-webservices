/**
 * CreditsafeBeNegativeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeNegativeInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeBeNSSODetail[] nsso_details;

    private nl.webservices.www.soap.CreditsafeBeProtestedBill[] protested_bills;

    private nl.webservices.www.soap.CreditsafeBeBankruptcyEvent[] bankruptcy_events;

    public CreditsafeBeNegativeInformation() {
    }

    public CreditsafeBeNegativeInformation(
           nl.webservices.www.soap.CreditsafeBeNSSODetail[] nsso_details,
           nl.webservices.www.soap.CreditsafeBeProtestedBill[] protested_bills,
           nl.webservices.www.soap.CreditsafeBeBankruptcyEvent[] bankruptcy_events) {
           this.nsso_details = nsso_details;
           this.protested_bills = protested_bills;
           this.bankruptcy_events = bankruptcy_events;
    }


    /**
     * Gets the nsso_details value for this CreditsafeBeNegativeInformation.
     * 
     * @return nsso_details
     */
    public nl.webservices.www.soap.CreditsafeBeNSSODetail[] getNsso_details() {
        return nsso_details;
    }


    /**
     * Sets the nsso_details value for this CreditsafeBeNegativeInformation.
     * 
     * @param nsso_details
     */
    public void setNsso_details(nl.webservices.www.soap.CreditsafeBeNSSODetail[] nsso_details) {
        this.nsso_details = nsso_details;
    }


    /**
     * Gets the protested_bills value for this CreditsafeBeNegativeInformation.
     * 
     * @return protested_bills
     */
    public nl.webservices.www.soap.CreditsafeBeProtestedBill[] getProtested_bills() {
        return protested_bills;
    }


    /**
     * Sets the protested_bills value for this CreditsafeBeNegativeInformation.
     * 
     * @param protested_bills
     */
    public void setProtested_bills(nl.webservices.www.soap.CreditsafeBeProtestedBill[] protested_bills) {
        this.protested_bills = protested_bills;
    }


    /**
     * Gets the bankruptcy_events value for this CreditsafeBeNegativeInformation.
     * 
     * @return bankruptcy_events
     */
    public nl.webservices.www.soap.CreditsafeBeBankruptcyEvent[] getBankruptcy_events() {
        return bankruptcy_events;
    }


    /**
     * Sets the bankruptcy_events value for this CreditsafeBeNegativeInformation.
     * 
     * @param bankruptcy_events
     */
    public void setBankruptcy_events(nl.webservices.www.soap.CreditsafeBeBankruptcyEvent[] bankruptcy_events) {
        this.bankruptcy_events = bankruptcy_events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeNegativeInformation)) return false;
        CreditsafeBeNegativeInformation other = (CreditsafeBeNegativeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nsso_details==null && other.getNsso_details()==null) || 
             (this.nsso_details!=null &&
              java.util.Arrays.equals(this.nsso_details, other.getNsso_details()))) &&
            ((this.protested_bills==null && other.getProtested_bills()==null) || 
             (this.protested_bills!=null &&
              java.util.Arrays.equals(this.protested_bills, other.getProtested_bills()))) &&
            ((this.bankruptcy_events==null && other.getBankruptcy_events()==null) || 
             (this.bankruptcy_events!=null &&
              java.util.Arrays.equals(this.bankruptcy_events, other.getBankruptcy_events())));
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
        if (getNsso_details() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNsso_details());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNsso_details(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProtested_bills() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtested_bills());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtested_bills(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBankruptcy_events() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankruptcy_events());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankruptcy_events(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeBeNegativeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeNegativeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsso_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nsso_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeNSSODetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protested_bills");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "protested_bills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeProtestedBill"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankruptcy_events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bankruptcy_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeBankruptcyEvent"));
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
