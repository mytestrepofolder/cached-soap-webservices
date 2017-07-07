/**
 * BovagMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BovagMember  implements java.io.Serializable {
    private java.lang.String bovag_id;

    private java.lang.String name;

    private java.lang.String certificate_url;

    private nl.webservices.www.soap.BovagDepartment[] departments;

    private nl.webservices.www.soap.DutchBusinessIdentifiers dutch_business_identifiers;

    public BovagMember() {
    }

    public BovagMember(
           java.lang.String bovag_id,
           java.lang.String name,
           java.lang.String certificate_url,
           nl.webservices.www.soap.BovagDepartment[] departments,
           nl.webservices.www.soap.DutchBusinessIdentifiers dutch_business_identifiers) {
           this.bovag_id = bovag_id;
           this.name = name;
           this.certificate_url = certificate_url;
           this.departments = departments;
           this.dutch_business_identifiers = dutch_business_identifiers;
    }


    /**
     * Gets the bovag_id value for this BovagMember.
     * 
     * @return bovag_id
     */
    public java.lang.String getBovag_id() {
        return bovag_id;
    }


    /**
     * Sets the bovag_id value for this BovagMember.
     * 
     * @param bovag_id
     */
    public void setBovag_id(java.lang.String bovag_id) {
        this.bovag_id = bovag_id;
    }


    /**
     * Gets the name value for this BovagMember.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BovagMember.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the certificate_url value for this BovagMember.
     * 
     * @return certificate_url
     */
    public java.lang.String getCertificate_url() {
        return certificate_url;
    }


    /**
     * Sets the certificate_url value for this BovagMember.
     * 
     * @param certificate_url
     */
    public void setCertificate_url(java.lang.String certificate_url) {
        this.certificate_url = certificate_url;
    }


    /**
     * Gets the departments value for this BovagMember.
     * 
     * @return departments
     */
    public nl.webservices.www.soap.BovagDepartment[] getDepartments() {
        return departments;
    }


    /**
     * Sets the departments value for this BovagMember.
     * 
     * @param departments
     */
    public void setDepartments(nl.webservices.www.soap.BovagDepartment[] departments) {
        this.departments = departments;
    }


    /**
     * Gets the dutch_business_identifiers value for this BovagMember.
     * 
     * @return dutch_business_identifiers
     */
    public nl.webservices.www.soap.DutchBusinessIdentifiers getDutch_business_identifiers() {
        return dutch_business_identifiers;
    }


    /**
     * Sets the dutch_business_identifiers value for this BovagMember.
     * 
     * @param dutch_business_identifiers
     */
    public void setDutch_business_identifiers(nl.webservices.www.soap.DutchBusinessIdentifiers dutch_business_identifiers) {
        this.dutch_business_identifiers = dutch_business_identifiers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BovagMember)) return false;
        BovagMember other = (BovagMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bovag_id==null && other.getBovag_id()==null) || 
             (this.bovag_id!=null &&
              this.bovag_id.equals(other.getBovag_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.certificate_url==null && other.getCertificate_url()==null) || 
             (this.certificate_url!=null &&
              this.certificate_url.equals(other.getCertificate_url()))) &&
            ((this.departments==null && other.getDepartments()==null) || 
             (this.departments!=null &&
              java.util.Arrays.equals(this.departments, other.getDepartments()))) &&
            ((this.dutch_business_identifiers==null && other.getDutch_business_identifiers()==null) || 
             (this.dutch_business_identifiers!=null &&
              this.dutch_business_identifiers.equals(other.getDutch_business_identifiers())));
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
        if (getBovag_id() != null) {
            _hashCode += getBovag_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCertificate_url() != null) {
            _hashCode += getCertificate_url().hashCode();
        }
        if (getDepartments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDutch_business_identifiers() != null) {
            _hashCode += getDutch_business_identifiers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BovagMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BovagMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bovag_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bovag_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "certificate_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "departments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BovagDepartment"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutch_business_identifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutch_business_identifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessIdentifiers"));
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
