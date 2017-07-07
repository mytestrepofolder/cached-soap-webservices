/**
 * MetaElementDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MetaElementDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String description;

    private java.lang.String documentation_url;

    private boolean required;

    private nl.webservices.www.soap.MetaValidationDefinition[] validations;

    private java.lang.String default_value;

    public MetaElementDefinition() {
    }

    public MetaElementDefinition(
           java.lang.String name,
           java.lang.String type,
           java.lang.String description,
           java.lang.String documentation_url,
           boolean required,
           nl.webservices.www.soap.MetaValidationDefinition[] validations,
           java.lang.String default_value) {
           this.name = name;
           this.type = type;
           this.description = description;
           this.documentation_url = documentation_url;
           this.required = required;
           this.validations = validations;
           this.default_value = default_value;
    }


    /**
     * Gets the name value for this MetaElementDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MetaElementDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this MetaElementDefinition.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MetaElementDefinition.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the description value for this MetaElementDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MetaElementDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentation_url value for this MetaElementDefinition.
     * 
     * @return documentation_url
     */
    public java.lang.String getDocumentation_url() {
        return documentation_url;
    }


    /**
     * Sets the documentation_url value for this MetaElementDefinition.
     * 
     * @param documentation_url
     */
    public void setDocumentation_url(java.lang.String documentation_url) {
        this.documentation_url = documentation_url;
    }


    /**
     * Gets the required value for this MetaElementDefinition.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this MetaElementDefinition.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the validations value for this MetaElementDefinition.
     * 
     * @return validations
     */
    public nl.webservices.www.soap.MetaValidationDefinition[] getValidations() {
        return validations;
    }


    /**
     * Sets the validations value for this MetaElementDefinition.
     * 
     * @param validations
     */
    public void setValidations(nl.webservices.www.soap.MetaValidationDefinition[] validations) {
        this.validations = validations;
    }


    /**
     * Gets the default_value value for this MetaElementDefinition.
     * 
     * @return default_value
     */
    public java.lang.String getDefault_value() {
        return default_value;
    }


    /**
     * Sets the default_value value for this MetaElementDefinition.
     * 
     * @param default_value
     */
    public void setDefault_value(java.lang.String default_value) {
        this.default_value = default_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaElementDefinition)) return false;
        MetaElementDefinition other = (MetaElementDefinition) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentation_url==null && other.getDocumentation_url()==null) || 
             (this.documentation_url!=null &&
              this.documentation_url.equals(other.getDocumentation_url()))) &&
            this.required == other.isRequired() &&
            ((this.validations==null && other.getValidations()==null) || 
             (this.validations!=null &&
              java.util.Arrays.equals(this.validations, other.getValidations()))) &&
            ((this.default_value==null && other.getDefault_value()==null) || 
             (this.default_value!=null &&
              this.default_value.equals(other.getDefault_value())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentation_url() != null) {
            _hashCode += getDocumentation_url().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValidations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefault_value() != null) {
            _hashCode += getDefault_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaElementDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaElementDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentation_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "documentation_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "validations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaValidationDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "default_value"));
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
