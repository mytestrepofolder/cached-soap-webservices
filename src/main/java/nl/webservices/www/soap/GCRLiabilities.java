/**
 * GCRLiabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRLiabilities  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRItem[] liabilities_items;

    private java.math.BigDecimal balance_sheet_total;

    public GCRLiabilities() {
    }

    public GCRLiabilities(
           nl.webservices.www.soap.GCRItem[] liabilities_items,
           java.math.BigDecimal balance_sheet_total) {
           this.liabilities_items = liabilities_items;
           this.balance_sheet_total = balance_sheet_total;
    }


    /**
     * Gets the liabilities_items value for this GCRLiabilities.
     * 
     * @return liabilities_items
     */
    public nl.webservices.www.soap.GCRItem[] getLiabilities_items() {
        return liabilities_items;
    }


    /**
     * Sets the liabilities_items value for this GCRLiabilities.
     * 
     * @param liabilities_items
     */
    public void setLiabilities_items(nl.webservices.www.soap.GCRItem[] liabilities_items) {
        this.liabilities_items = liabilities_items;
    }


    /**
     * Gets the balance_sheet_total value for this GCRLiabilities.
     * 
     * @return balance_sheet_total
     */
    public java.math.BigDecimal getBalance_sheet_total() {
        return balance_sheet_total;
    }


    /**
     * Sets the balance_sheet_total value for this GCRLiabilities.
     * 
     * @param balance_sheet_total
     */
    public void setBalance_sheet_total(java.math.BigDecimal balance_sheet_total) {
        this.balance_sheet_total = balance_sheet_total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRLiabilities)) return false;
        GCRLiabilities other = (GCRLiabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liabilities_items==null && other.getLiabilities_items()==null) || 
             (this.liabilities_items!=null &&
              java.util.Arrays.equals(this.liabilities_items, other.getLiabilities_items()))) &&
            ((this.balance_sheet_total==null && other.getBalance_sheet_total()==null) || 
             (this.balance_sheet_total!=null &&
              this.balance_sheet_total.equals(other.getBalance_sheet_total())));
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
        if (getLiabilities_items() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiabilities_items());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiabilities_items(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance_sheet_total() != null) {
            _hashCode += getBalance_sheet_total().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRLiabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilities_items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liabilities_items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_sheet_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balance_sheet_total"));
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
