/**
 * MetaMethodDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MetaMethodDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String service_name;

    private boolean deprecated;

    private java.lang.String description;

    private java.lang.String documentation;

    private java.lang.String documentation_url;

    private nl.webservices.www.soap.MetaElementDefinition[] input_elements;

    private nl.webservices.www.soap.MetaElementDefinition[] output_elements;

    private nl.webservices.www.soap.MetaMethodReference[] related_methods;

    public MetaMethodDefinition() {
    }

    public MetaMethodDefinition(
           java.lang.String name,
           java.lang.String service_name,
           boolean deprecated,
           java.lang.String description,
           java.lang.String documentation,
           java.lang.String documentation_url,
           nl.webservices.www.soap.MetaElementDefinition[] input_elements,
           nl.webservices.www.soap.MetaElementDefinition[] output_elements,
           nl.webservices.www.soap.MetaMethodReference[] related_methods) {
           this.name = name;
           this.service_name = service_name;
           this.deprecated = deprecated;
           this.description = description;
           this.documentation = documentation;
           this.documentation_url = documentation_url;
           this.input_elements = input_elements;
           this.output_elements = output_elements;
           this.related_methods = related_methods;
    }


    /**
     * Gets the name value for this MetaMethodDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MetaMethodDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the service_name value for this MetaMethodDefinition.
     * 
     * @return service_name
     */
    public java.lang.String getService_name() {
        return service_name;
    }


    /**
     * Sets the service_name value for this MetaMethodDefinition.
     * 
     * @param service_name
     */
    public void setService_name(java.lang.String service_name) {
        this.service_name = service_name;
    }


    /**
     * Gets the deprecated value for this MetaMethodDefinition.
     * 
     * @return deprecated
     */
    public boolean isDeprecated() {
        return deprecated;
    }


    /**
     * Sets the deprecated value for this MetaMethodDefinition.
     * 
     * @param deprecated
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }


    /**
     * Gets the description value for this MetaMethodDefinition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MetaMethodDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentation value for this MetaMethodDefinition.
     * 
     * @return documentation
     */
    public java.lang.String getDocumentation() {
        return documentation;
    }


    /**
     * Sets the documentation value for this MetaMethodDefinition.
     * 
     * @param documentation
     */
    public void setDocumentation(java.lang.String documentation) {
        this.documentation = documentation;
    }


    /**
     * Gets the documentation_url value for this MetaMethodDefinition.
     * 
     * @return documentation_url
     */
    public java.lang.String getDocumentation_url() {
        return documentation_url;
    }


    /**
     * Sets the documentation_url value for this MetaMethodDefinition.
     * 
     * @param documentation_url
     */
    public void setDocumentation_url(java.lang.String documentation_url) {
        this.documentation_url = documentation_url;
    }


    /**
     * Gets the input_elements value for this MetaMethodDefinition.
     * 
     * @return input_elements
     */
    public nl.webservices.www.soap.MetaElementDefinition[] getInput_elements() {
        return input_elements;
    }


    /**
     * Sets the input_elements value for this MetaMethodDefinition.
     * 
     * @param input_elements
     */
    public void setInput_elements(nl.webservices.www.soap.MetaElementDefinition[] input_elements) {
        this.input_elements = input_elements;
    }


    /**
     * Gets the output_elements value for this MetaMethodDefinition.
     * 
     * @return output_elements
     */
    public nl.webservices.www.soap.MetaElementDefinition[] getOutput_elements() {
        return output_elements;
    }


    /**
     * Sets the output_elements value for this MetaMethodDefinition.
     * 
     * @param output_elements
     */
    public void setOutput_elements(nl.webservices.www.soap.MetaElementDefinition[] output_elements) {
        this.output_elements = output_elements;
    }


    /**
     * Gets the related_methods value for this MetaMethodDefinition.
     * 
     * @return related_methods
     */
    public nl.webservices.www.soap.MetaMethodReference[] getRelated_methods() {
        return related_methods;
    }


    /**
     * Sets the related_methods value for this MetaMethodDefinition.
     * 
     * @param related_methods
     */
    public void setRelated_methods(nl.webservices.www.soap.MetaMethodReference[] related_methods) {
        this.related_methods = related_methods;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaMethodDefinition)) return false;
        MetaMethodDefinition other = (MetaMethodDefinition) obj;
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
            ((this.service_name==null && other.getService_name()==null) || 
             (this.service_name!=null &&
              this.service_name.equals(other.getService_name()))) &&
            this.deprecated == other.isDeprecated() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentation==null && other.getDocumentation()==null) || 
             (this.documentation!=null &&
              this.documentation.equals(other.getDocumentation()))) &&
            ((this.documentation_url==null && other.getDocumentation_url()==null) || 
             (this.documentation_url!=null &&
              this.documentation_url.equals(other.getDocumentation_url()))) &&
            ((this.input_elements==null && other.getInput_elements()==null) || 
             (this.input_elements!=null &&
              java.util.Arrays.equals(this.input_elements, other.getInput_elements()))) &&
            ((this.output_elements==null && other.getOutput_elements()==null) || 
             (this.output_elements!=null &&
              java.util.Arrays.equals(this.output_elements, other.getOutput_elements()))) &&
            ((this.related_methods==null && other.getRelated_methods()==null) || 
             (this.related_methods!=null &&
              java.util.Arrays.equals(this.related_methods, other.getRelated_methods())));
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
        if (getService_name() != null) {
            _hashCode += getService_name().hashCode();
        }
        _hashCode += (isDeprecated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentation() != null) {
            _hashCode += getDocumentation().hashCode();
        }
        if (getDocumentation_url() != null) {
            _hashCode += getDocumentation_url().hashCode();
        }
        if (getInput_elements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInput_elements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInput_elements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutput_elements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutput_elements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutput_elements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelated_methods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelated_methods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelated_methods(), i);
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
        new org.apache.axis.description.TypeDesc(MetaMethodDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaMethodDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "service_name"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "documentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentation_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "documentation_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input_elements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "input_elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaElementDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output_elements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "output_elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaElementDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_methods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "related_methods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "MetaMethodReference"));
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
