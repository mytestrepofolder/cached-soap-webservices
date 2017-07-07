/**
 * GCRAlarmContactDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRAlarmContactDetails  implements java.io.Serializable {
    private java.lang.String company_name;

    private nl.webservices.www.soap.GCRTradeName[] trade_names;

    private nl.webservices.www.soap.GCRAddress[] addresses;

    public GCRAlarmContactDetails() {
    }

    public GCRAlarmContactDetails(
           java.lang.String company_name,
           nl.webservices.www.soap.GCRTradeName[] trade_names,
           nl.webservices.www.soap.GCRAddress[] addresses) {
           this.company_name = company_name;
           this.trade_names = trade_names;
           this.addresses = addresses;
    }


    /**
     * Gets the company_name value for this GCRAlarmContactDetails.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this GCRAlarmContactDetails.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the trade_names value for this GCRAlarmContactDetails.
     * 
     * @return trade_names
     */
    public nl.webservices.www.soap.GCRTradeName[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this GCRAlarmContactDetails.
     * 
     * @param trade_names
     */
    public void setTrade_names(nl.webservices.www.soap.GCRTradeName[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the addresses value for this GCRAlarmContactDetails.
     * 
     * @return addresses
     */
    public nl.webservices.www.soap.GCRAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this GCRAlarmContactDetails.
     * 
     * @param addresses
     */
    public void setAddresses(nl.webservices.www.soap.GCRAddress[] addresses) {
        this.addresses = addresses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRAlarmContactDetails)) return false;
        GCRAlarmContactDetails other = (GCRAlarmContactDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses())));
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
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
        }
        if (getTrade_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrade_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrade_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
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
        new org.apache.axis.description.TypeDesc(GCRAlarmContactDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarmContactDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTradeName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAddress"));
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
