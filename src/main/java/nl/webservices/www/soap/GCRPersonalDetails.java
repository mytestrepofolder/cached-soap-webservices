/**
 * GCRPersonalDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRPersonalDetails  implements java.io.Serializable {
    private java.lang.String gender_code;

    private java.lang.String gender_text;

    private nl.webservices.www.soap.GCRTitle[] titles;

    private java.lang.String initials;

    private java.lang.String prefixes;

    private java.lang.String name;

    public GCRPersonalDetails() {
    }

    public GCRPersonalDetails(
           java.lang.String gender_code,
           java.lang.String gender_text,
           nl.webservices.www.soap.GCRTitle[] titles,
           java.lang.String initials,
           java.lang.String prefixes,
           java.lang.String name) {
           this.gender_code = gender_code;
           this.gender_text = gender_text;
           this.titles = titles;
           this.initials = initials;
           this.prefixes = prefixes;
           this.name = name;
    }


    /**
     * Gets the gender_code value for this GCRPersonalDetails.
     * 
     * @return gender_code
     */
    public java.lang.String getGender_code() {
        return gender_code;
    }


    /**
     * Sets the gender_code value for this GCRPersonalDetails.
     * 
     * @param gender_code
     */
    public void setGender_code(java.lang.String gender_code) {
        this.gender_code = gender_code;
    }


    /**
     * Gets the gender_text value for this GCRPersonalDetails.
     * 
     * @return gender_text
     */
    public java.lang.String getGender_text() {
        return gender_text;
    }


    /**
     * Sets the gender_text value for this GCRPersonalDetails.
     * 
     * @param gender_text
     */
    public void setGender_text(java.lang.String gender_text) {
        this.gender_text = gender_text;
    }


    /**
     * Gets the titles value for this GCRPersonalDetails.
     * 
     * @return titles
     */
    public nl.webservices.www.soap.GCRTitle[] getTitles() {
        return titles;
    }


    /**
     * Sets the titles value for this GCRPersonalDetails.
     * 
     * @param titles
     */
    public void setTitles(nl.webservices.www.soap.GCRTitle[] titles) {
        this.titles = titles;
    }


    /**
     * Gets the initials value for this GCRPersonalDetails.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this GCRPersonalDetails.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the prefixes value for this GCRPersonalDetails.
     * 
     * @return prefixes
     */
    public java.lang.String getPrefixes() {
        return prefixes;
    }


    /**
     * Sets the prefixes value for this GCRPersonalDetails.
     * 
     * @param prefixes
     */
    public void setPrefixes(java.lang.String prefixes) {
        this.prefixes = prefixes;
    }


    /**
     * Gets the name value for this GCRPersonalDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GCRPersonalDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRPersonalDetails)) return false;
        GCRPersonalDetails other = (GCRPersonalDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gender_code==null && other.getGender_code()==null) || 
             (this.gender_code!=null &&
              this.gender_code.equals(other.getGender_code()))) &&
            ((this.gender_text==null && other.getGender_text()==null) || 
             (this.gender_text!=null &&
              this.gender_text.equals(other.getGender_text()))) &&
            ((this.titles==null && other.getTitles()==null) || 
             (this.titles!=null &&
              java.util.Arrays.equals(this.titles, other.getTitles()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.prefixes==null && other.getPrefixes()==null) || 
             (this.prefixes!=null &&
              this.prefixes.equals(other.getPrefixes()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getGender_code() != null) {
            _hashCode += getGender_code().hashCode();
        }
        if (getGender_text() != null) {
            _hashCode += getGender_text().hashCode();
        }
        if (getTitles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getPrefixes() != null) {
            _hashCode += getPrefixes().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRPersonalDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonalDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefixes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
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
