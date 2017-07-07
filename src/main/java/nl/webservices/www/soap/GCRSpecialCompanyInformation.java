/**
 * GCRSpecialCompanyInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRSpecialCompanyInformation  implements java.io.Serializable {
    private java.lang.String special_company_code;

    private java.lang.String special_company_text;

    private nl.webservices.www.soap.GCRTextSequence[] texts;

    public GCRSpecialCompanyInformation() {
    }

    public GCRSpecialCompanyInformation(
           java.lang.String special_company_code,
           java.lang.String special_company_text,
           nl.webservices.www.soap.GCRTextSequence[] texts) {
           this.special_company_code = special_company_code;
           this.special_company_text = special_company_text;
           this.texts = texts;
    }


    /**
     * Gets the special_company_code value for this GCRSpecialCompanyInformation.
     * 
     * @return special_company_code
     */
    public java.lang.String getSpecial_company_code() {
        return special_company_code;
    }


    /**
     * Sets the special_company_code value for this GCRSpecialCompanyInformation.
     * 
     * @param special_company_code
     */
    public void setSpecial_company_code(java.lang.String special_company_code) {
        this.special_company_code = special_company_code;
    }


    /**
     * Gets the special_company_text value for this GCRSpecialCompanyInformation.
     * 
     * @return special_company_text
     */
    public java.lang.String getSpecial_company_text() {
        return special_company_text;
    }


    /**
     * Sets the special_company_text value for this GCRSpecialCompanyInformation.
     * 
     * @param special_company_text
     */
    public void setSpecial_company_text(java.lang.String special_company_text) {
        this.special_company_text = special_company_text;
    }


    /**
     * Gets the texts value for this GCRSpecialCompanyInformation.
     * 
     * @return texts
     */
    public nl.webservices.www.soap.GCRTextSequence[] getTexts() {
        return texts;
    }


    /**
     * Sets the texts value for this GCRSpecialCompanyInformation.
     * 
     * @param texts
     */
    public void setTexts(nl.webservices.www.soap.GCRTextSequence[] texts) {
        this.texts = texts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRSpecialCompanyInformation)) return false;
        GCRSpecialCompanyInformation other = (GCRSpecialCompanyInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.special_company_code==null && other.getSpecial_company_code()==null) || 
             (this.special_company_code!=null &&
              this.special_company_code.equals(other.getSpecial_company_code()))) &&
            ((this.special_company_text==null && other.getSpecial_company_text()==null) || 
             (this.special_company_text!=null &&
              this.special_company_text.equals(other.getSpecial_company_text()))) &&
            ((this.texts==null && other.getTexts()==null) || 
             (this.texts!=null &&
              java.util.Arrays.equals(this.texts, other.getTexts())));
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
        if (getSpecial_company_code() != null) {
            _hashCode += getSpecial_company_code().hashCode();
        }
        if (getSpecial_company_text() != null) {
            _hashCode += getSpecial_company_text().hashCode();
        }
        if (getTexts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTexts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTexts(), i);
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
        new org.apache.axis.description.TypeDesc(GCRSpecialCompanyInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSpecialCompanyInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_company_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "special_company_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_company_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "special_company_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("texts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "texts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTextSequence"));
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
