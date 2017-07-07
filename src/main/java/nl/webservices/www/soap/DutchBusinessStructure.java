/**
 * DutchBusinessStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessStructure  implements java.io.Serializable {
    private java.lang.String ultimate_parent;

    private java.lang.Integer number_of_subsidiaries;

    private java.lang.String parent;

    public DutchBusinessStructure() {
    }

    public DutchBusinessStructure(
           java.lang.String ultimate_parent,
           java.lang.Integer number_of_subsidiaries,
           java.lang.String parent) {
           this.ultimate_parent = ultimate_parent;
           this.number_of_subsidiaries = number_of_subsidiaries;
           this.parent = parent;
    }


    /**
     * Gets the ultimate_parent value for this DutchBusinessStructure.
     * 
     * @return ultimate_parent
     */
    public java.lang.String getUltimate_parent() {
        return ultimate_parent;
    }


    /**
     * Sets the ultimate_parent value for this DutchBusinessStructure.
     * 
     * @param ultimate_parent
     */
    public void setUltimate_parent(java.lang.String ultimate_parent) {
        this.ultimate_parent = ultimate_parent;
    }


    /**
     * Gets the number_of_subsidiaries value for this DutchBusinessStructure.
     * 
     * @return number_of_subsidiaries
     */
    public java.lang.Integer getNumber_of_subsidiaries() {
        return number_of_subsidiaries;
    }


    /**
     * Sets the number_of_subsidiaries value for this DutchBusinessStructure.
     * 
     * @param number_of_subsidiaries
     */
    public void setNumber_of_subsidiaries(java.lang.Integer number_of_subsidiaries) {
        this.number_of_subsidiaries = number_of_subsidiaries;
    }


    /**
     * Gets the parent value for this DutchBusinessStructure.
     * 
     * @return parent
     */
    public java.lang.String getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this DutchBusinessStructure.
     * 
     * @param parent
     */
    public void setParent(java.lang.String parent) {
        this.parent = parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessStructure)) return false;
        DutchBusinessStructure other = (DutchBusinessStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ultimate_parent==null && other.getUltimate_parent()==null) || 
             (this.ultimate_parent!=null &&
              this.ultimate_parent.equals(other.getUltimate_parent()))) &&
            ((this.number_of_subsidiaries==null && other.getNumber_of_subsidiaries()==null) || 
             (this.number_of_subsidiaries!=null &&
              this.number_of_subsidiaries.equals(other.getNumber_of_subsidiaries()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent())));
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
        if (getUltimate_parent() != null) {
            _hashCode += getUltimate_parent().hashCode();
        }
        if (getNumber_of_subsidiaries() != null) {
            _hashCode += getNumber_of_subsidiaries().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimate_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ultimate_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_subsidiaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number_of_subsidiaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
