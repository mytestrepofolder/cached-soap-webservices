/**
 * CreditsafeCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeCompany  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String registration_number;

    private java.lang.String type;

    private java.lang.String status;

    private java.lang.String office_type;

    private java.lang.String address;

    private java.lang.String[] available_report_types;

    private java.lang.String[] available_languages;

    private java.lang.String id;

    private java.lang.String country;

    private boolean online_reports;

    public CreditsafeCompany() {
    }

    public CreditsafeCompany(
           java.lang.String name,
           java.lang.String registration_number,
           java.lang.String type,
           java.lang.String status,
           java.lang.String office_type,
           java.lang.String address,
           java.lang.String[] available_report_types,
           java.lang.String[] available_languages,
           java.lang.String id,
           java.lang.String country,
           boolean online_reports) {
           this.name = name;
           this.registration_number = registration_number;
           this.type = type;
           this.status = status;
           this.office_type = office_type;
           this.address = address;
           this.available_report_types = available_report_types;
           this.available_languages = available_languages;
           this.id = id;
           this.country = country;
           this.online_reports = online_reports;
    }


    /**
     * Gets the name value for this CreditsafeCompany.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreditsafeCompany.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the registration_number value for this CreditsafeCompany.
     * 
     * @return registration_number
     */
    public java.lang.String getRegistration_number() {
        return registration_number;
    }


    /**
     * Sets the registration_number value for this CreditsafeCompany.
     * 
     * @param registration_number
     */
    public void setRegistration_number(java.lang.String registration_number) {
        this.registration_number = registration_number;
    }


    /**
     * Gets the type value for this CreditsafeCompany.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CreditsafeCompany.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the status value for this CreditsafeCompany.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreditsafeCompany.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the office_type value for this CreditsafeCompany.
     * 
     * @return office_type
     */
    public java.lang.String getOffice_type() {
        return office_type;
    }


    /**
     * Sets the office_type value for this CreditsafeCompany.
     * 
     * @param office_type
     */
    public void setOffice_type(java.lang.String office_type) {
        this.office_type = office_type;
    }


    /**
     * Gets the address value for this CreditsafeCompany.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CreditsafeCompany.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the available_report_types value for this CreditsafeCompany.
     * 
     * @return available_report_types
     */
    public java.lang.String[] getAvailable_report_types() {
        return available_report_types;
    }


    /**
     * Sets the available_report_types value for this CreditsafeCompany.
     * 
     * @param available_report_types
     */
    public void setAvailable_report_types(java.lang.String[] available_report_types) {
        this.available_report_types = available_report_types;
    }


    /**
     * Gets the available_languages value for this CreditsafeCompany.
     * 
     * @return available_languages
     */
    public java.lang.String[] getAvailable_languages() {
        return available_languages;
    }


    /**
     * Sets the available_languages value for this CreditsafeCompany.
     * 
     * @param available_languages
     */
    public void setAvailable_languages(java.lang.String[] available_languages) {
        this.available_languages = available_languages;
    }


    /**
     * Gets the id value for this CreditsafeCompany.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CreditsafeCompany.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the country value for this CreditsafeCompany.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CreditsafeCompany.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the online_reports value for this CreditsafeCompany.
     * 
     * @return online_reports
     */
    public boolean isOnline_reports() {
        return online_reports;
    }


    /**
     * Sets the online_reports value for this CreditsafeCompany.
     * 
     * @param online_reports
     */
    public void setOnline_reports(boolean online_reports) {
        this.online_reports = online_reports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeCompany)) return false;
        CreditsafeCompany other = (CreditsafeCompany) obj;
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
            ((this.registration_number==null && other.getRegistration_number()==null) || 
             (this.registration_number!=null &&
              this.registration_number.equals(other.getRegistration_number()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.office_type==null && other.getOffice_type()==null) || 
             (this.office_type!=null &&
              this.office_type.equals(other.getOffice_type()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.available_report_types==null && other.getAvailable_report_types()==null) || 
             (this.available_report_types!=null &&
              java.util.Arrays.equals(this.available_report_types, other.getAvailable_report_types()))) &&
            ((this.available_languages==null && other.getAvailable_languages()==null) || 
             (this.available_languages!=null &&
              java.util.Arrays.equals(this.available_languages, other.getAvailable_languages()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.online_reports == other.isOnline_reports();
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
        if (getRegistration_number() != null) {
            _hashCode += getRegistration_number().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOffice_type() != null) {
            _hashCode += getOffice_type().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAvailable_report_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_report_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_report_types(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailable_languages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_languages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_languages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += (isOnline_reports() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("office_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "office_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_report_types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "available_report_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_languages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "available_languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("online_reports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "online_reports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
