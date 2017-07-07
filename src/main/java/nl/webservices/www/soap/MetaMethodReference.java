/**
 * MetaMethodReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MetaMethodReference  implements java.io.Serializable {
    private java.lang.String name;

    private boolean deprecated;

    private java.lang.String description;

    private java.lang.String documentation_url;

    public MetaMethodReference() {
    }

    public MetaMethodReference(
           java.lang.String name,
           boolean deprecated,
           java.lang.String description,
           java.lang.String documentation_url) {
           this.name = name;
           this.deprecated = deprecated;
           this.description = description;
           this.documentation_url = documentation_url;
    }


    /**
     * Gets the name value for this MetaMethodReference.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MetaMethodReference.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the deprecated value for this MetaMethodReference.
     * 
     * @return deprecated
     */
    public boolean isDeprecated() {
        return deprecated;
    }


    /**
     * Sets the deprecated value for this MetaMethodReference.
     * 
     * @param deprecated
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }


    /**
     * Gets the description value for this MetaMethodReference.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MetaMethodReference.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentation_url value for this MetaMethodReference.
     * 
     * @return documentation_url
     */
    public java.lang.String getDocumentation_url() {
        return documentation_url;
    }


    /**
     * Sets the documentation_url value for this MetaMethodReference.
     * 
     * @param documentation_url
     */
    public void setDocumentation_url(java.lang.String documentation_url) {
        this.documentation_url = documentation_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaMethodReference)) return false;
        MetaMethodReference other = (MetaMethodReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.deprecated == other.isDeprecated() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentation_url==null && other.getDocumentation_url()==null) || 
             (this.documentation_url!=null &&
              this.documentation_url.equals(other.getDocumentation_url())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isDeprecated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentation_url() != null) {
            _hashCode += getDocumentation_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaMethodReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaMethodReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprecated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deprecated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentation_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "documentation_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
