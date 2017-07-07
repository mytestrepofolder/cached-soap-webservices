/**
 * GCRBalanceSheet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRBalanceSheet  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRItem[] items;

    private nl.webservices.www.soap.GCRAssets assets;

    private nl.webservices.www.soap.GCRLiabilities liabilities;

    public GCRBalanceSheet() {
    }

    public GCRBalanceSheet(
           nl.webservices.www.soap.GCRItem[] items,
           nl.webservices.www.soap.GCRAssets assets,
           nl.webservices.www.soap.GCRLiabilities liabilities) {
           this.items = items;
           this.assets = assets;
           this.liabilities = liabilities;
    }


    /**
     * Gets the items value for this GCRBalanceSheet.
     * 
     * @return items
     */
    public nl.webservices.www.soap.GCRItem[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this GCRBalanceSheet.
     * 
     * @param items
     */
    public void setItems(nl.webservices.www.soap.GCRItem[] items) {
        this.items = items;
    }


    /**
     * Gets the assets value for this GCRBalanceSheet.
     * 
     * @return assets
     */
    public nl.webservices.www.soap.GCRAssets getAssets() {
        return assets;
    }


    /**
     * Sets the assets value for this GCRBalanceSheet.
     * 
     * @param assets
     */
    public void setAssets(nl.webservices.www.soap.GCRAssets assets) {
        this.assets = assets;
    }


    /**
     * Gets the liabilities value for this GCRBalanceSheet.
     * 
     * @return liabilities
     */
    public nl.webservices.www.soap.GCRLiabilities getLiabilities() {
        return liabilities;
    }


    /**
     * Sets the liabilities value for this GCRBalanceSheet.
     * 
     * @param liabilities
     */
    public void setLiabilities(nl.webservices.www.soap.GCRLiabilities liabilities) {
        this.liabilities = liabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRBalanceSheet)) return false;
        GCRBalanceSheet other = (GCRBalanceSheet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.assets==null && other.getAssets()==null) || 
             (this.assets!=null &&
              this.assets.equals(other.getAssets()))) &&
            ((this.liabilities==null && other.getLiabilities()==null) || 
             (this.liabilities!=null &&
              this.liabilities.equals(other.getLiabilities())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssets() != null) {
            _hashCode += getAssets().hashCode();
        }
        if (getLiabilities() != null) {
            _hashCode += getLiabilities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRBalanceSheet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBalanceSheet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAssets"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiabilities"));
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
