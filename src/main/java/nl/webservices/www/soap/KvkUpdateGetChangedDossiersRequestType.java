/**
 * KvkUpdateGetChangedDossiersRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KvkUpdateGetChangedDossiersRequestType  implements java.io.Serializable {
    private java.util.Date changed_since;

    private java.lang.String[] update_types;

    private int page;

    public KvkUpdateGetChangedDossiersRequestType() {
    }

    public KvkUpdateGetChangedDossiersRequestType(
           java.util.Date changed_since,
           java.lang.String[] update_types,
           int page) {
           this.changed_since = changed_since;
           this.update_types = update_types;
           this.page = page;
    }


    /**
     * Gets the changed_since value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @return changed_since
     */
    public java.util.Date getChanged_since() {
        return changed_since;
    }


    /**
     * Sets the changed_since value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @param changed_since
     */
    public void setChanged_since(java.util.Date changed_since) {
        this.changed_since = changed_since;
    }


    /**
     * Gets the update_types value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @return update_types
     */
    public java.lang.String[] getUpdate_types() {
        return update_types;
    }


    /**
     * Sets the update_types value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @param update_types
     */
    public void setUpdate_types(java.lang.String[] update_types) {
        this.update_types = update_types;
    }


    /**
     * Gets the page value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this KvkUpdateGetChangedDossiersRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KvkUpdateGetChangedDossiersRequestType)) return false;
        KvkUpdateGetChangedDossiersRequestType other = (KvkUpdateGetChangedDossiersRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changed_since==null && other.getChanged_since()==null) || 
             (this.changed_since!=null &&
              this.changed_since.equals(other.getChanged_since()))) &&
            ((this.update_types==null && other.getUpdate_types()==null) || 
             (this.update_types!=null &&
              java.util.Arrays.equals(this.update_types, other.getUpdate_types()))) &&
            this.page == other.getPage();
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
        if (getChanged_since() != null) {
            _hashCode += getChanged_since().hashCode();
        }
        if (getUpdate_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdate_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdate_types(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KvkUpdateGetChangedDossiersRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kvkUpdateGetChangedDossiersRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changed_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "changed_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "update_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
