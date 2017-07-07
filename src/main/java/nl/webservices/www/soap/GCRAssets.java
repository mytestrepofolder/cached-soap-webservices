/**
 * GCRAssets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRAssets  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRItem fixed_assets_total;

    private nl.webservices.www.soap.GCRItem[] fixed_assets_items;

    private nl.webservices.www.soap.GCRItem current_assets_total;

    private nl.webservices.www.soap.GCRItem[] current_assets_items;

    private java.math.BigDecimal balance_sheet_total;

    public GCRAssets() {
    }

    public GCRAssets(
           nl.webservices.www.soap.GCRItem fixed_assets_total,
           nl.webservices.www.soap.GCRItem[] fixed_assets_items,
           nl.webservices.www.soap.GCRItem current_assets_total,
           nl.webservices.www.soap.GCRItem[] current_assets_items,
           java.math.BigDecimal balance_sheet_total) {
           this.fixed_assets_total = fixed_assets_total;
           this.fixed_assets_items = fixed_assets_items;
           this.current_assets_total = current_assets_total;
           this.current_assets_items = current_assets_items;
           this.balance_sheet_total = balance_sheet_total;
    }


    /**
     * Gets the fixed_assets_total value for this GCRAssets.
     * 
     * @return fixed_assets_total
     */
    public nl.webservices.www.soap.GCRItem getFixed_assets_total() {
        return fixed_assets_total;
    }


    /**
     * Sets the fixed_assets_total value for this GCRAssets.
     * 
     * @param fixed_assets_total
     */
    public void setFixed_assets_total(nl.webservices.www.soap.GCRItem fixed_assets_total) {
        this.fixed_assets_total = fixed_assets_total;
    }


    /**
     * Gets the fixed_assets_items value for this GCRAssets.
     * 
     * @return fixed_assets_items
     */
    public nl.webservices.www.soap.GCRItem[] getFixed_assets_items() {
        return fixed_assets_items;
    }


    /**
     * Sets the fixed_assets_items value for this GCRAssets.
     * 
     * @param fixed_assets_items
     */
    public void setFixed_assets_items(nl.webservices.www.soap.GCRItem[] fixed_assets_items) {
        this.fixed_assets_items = fixed_assets_items;
    }


    /**
     * Gets the current_assets_total value for this GCRAssets.
     * 
     * @return current_assets_total
     */
    public nl.webservices.www.soap.GCRItem getCurrent_assets_total() {
        return current_assets_total;
    }


    /**
     * Sets the current_assets_total value for this GCRAssets.
     * 
     * @param current_assets_total
     */
    public void setCurrent_assets_total(nl.webservices.www.soap.GCRItem current_assets_total) {
        this.current_assets_total = current_assets_total;
    }


    /**
     * Gets the current_assets_items value for this GCRAssets.
     * 
     * @return current_assets_items
     */
    public nl.webservices.www.soap.GCRItem[] getCurrent_assets_items() {
        return current_assets_items;
    }


    /**
     * Sets the current_assets_items value for this GCRAssets.
     * 
     * @param current_assets_items
     */
    public void setCurrent_assets_items(nl.webservices.www.soap.GCRItem[] current_assets_items) {
        this.current_assets_items = current_assets_items;
    }


    /**
     * Gets the balance_sheet_total value for this GCRAssets.
     * 
     * @return balance_sheet_total
     */
    public java.math.BigDecimal getBalance_sheet_total() {
        return balance_sheet_total;
    }


    /**
     * Sets the balance_sheet_total value for this GCRAssets.
     * 
     * @param balance_sheet_total
     */
    public void setBalance_sheet_total(java.math.BigDecimal balance_sheet_total) {
        this.balance_sheet_total = balance_sheet_total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRAssets)) return false;
        GCRAssets other = (GCRAssets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fixed_assets_total==null && other.getFixed_assets_total()==null) || 
             (this.fixed_assets_total!=null &&
              this.fixed_assets_total.equals(other.getFixed_assets_total()))) &&
            ((this.fixed_assets_items==null && other.getFixed_assets_items()==null) || 
             (this.fixed_assets_items!=null &&
              java.util.Arrays.equals(this.fixed_assets_items, other.getFixed_assets_items()))) &&
            ((this.current_assets_total==null && other.getCurrent_assets_total()==null) || 
             (this.current_assets_total!=null &&
              this.current_assets_total.equals(other.getCurrent_assets_total()))) &&
            ((this.current_assets_items==null && other.getCurrent_assets_items()==null) || 
             (this.current_assets_items!=null &&
              java.util.Arrays.equals(this.current_assets_items, other.getCurrent_assets_items()))) &&
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
        if (getFixed_assets_total() != null) {
            _hashCode += getFixed_assets_total().hashCode();
        }
        if (getFixed_assets_items() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixed_assets_items());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixed_assets_items(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrent_assets_total() != null) {
            _hashCode += getCurrent_assets_total().hashCode();
        }
        if (getCurrent_assets_items() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrent_assets_items());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrent_assets_items(), i);
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
        new org.apache.axis.description.TypeDesc(GCRAssets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAssets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed_assets_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fixed_assets_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed_assets_items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fixed_assets_items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_assets_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_assets_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_assets_items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_assets_items"));
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
