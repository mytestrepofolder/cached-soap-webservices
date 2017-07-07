/**
 * GCRPersonSimple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRPersonSimple  implements java.io.Serializable {
    private java.math.BigInteger graydon_person_id;

    private nl.webservices.www.soap.GCRPersonalDetails personal_details;

    private nl.webservices.www.soap.GCRAddress address;

    private nl.webservices.www.soap.GCRBirthInformation birth_information;

    public GCRPersonSimple() {
    }

    public GCRPersonSimple(
           java.math.BigInteger graydon_person_id,
           nl.webservices.www.soap.GCRPersonalDetails personal_details,
           nl.webservices.www.soap.GCRAddress address,
           nl.webservices.www.soap.GCRBirthInformation birth_information) {
           this.graydon_person_id = graydon_person_id;
           this.personal_details = personal_details;
           this.address = address;
           this.birth_information = birth_information;
    }


    /**
     * Gets the graydon_person_id value for this GCRPersonSimple.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRPersonSimple.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the personal_details value for this GCRPersonSimple.
     * 
     * @return personal_details
     */
    public nl.webservices.www.soap.GCRPersonalDetails getPersonal_details() {
        return personal_details;
    }


    /**
     * Sets the personal_details value for this GCRPersonSimple.
     * 
     * @param personal_details
     */
    public void setPersonal_details(nl.webservices.www.soap.GCRPersonalDetails personal_details) {
        this.personal_details = personal_details;
    }


    /**
     * Gets the address value for this GCRPersonSimple.
     * 
     * @return address
     */
    public nl.webservices.www.soap.GCRAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this GCRPersonSimple.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.GCRAddress address) {
        this.address = address;
    }


    /**
     * Gets the birth_information value for this GCRPersonSimple.
     * 
     * @return birth_information
     */
    public nl.webservices.www.soap.GCRBirthInformation getBirth_information() {
        return birth_information;
    }


    /**
     * Sets the birth_information value for this GCRPersonSimple.
     * 
     * @param birth_information
     */
    public void setBirth_information(nl.webservices.www.soap.GCRBirthInformation birth_information) {
        this.birth_information = birth_information;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRPersonSimple)) return false;
        GCRPersonSimple other = (GCRPersonSimple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graydon_person_id==null && other.getGraydon_person_id()==null) || 
             (this.graydon_person_id!=null &&
              this.graydon_person_id.equals(other.getGraydon_person_id()))) &&
            ((this.personal_details==null && other.getPersonal_details()==null) || 
             (this.personal_details!=null &&
              this.personal_details.equals(other.getPersonal_details()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.birth_information==null && other.getBirth_information()==null) || 
             (this.birth_information!=null &&
              this.birth_information.equals(other.getBirth_information())));
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
        if (getGraydon_person_id() != null) {
            _hashCode += getGraydon_person_id().hashCode();
        }
        if (getPersonal_details() != null) {
            _hashCode += getPersonal_details().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getBirth_information() != null) {
            _hashCode += getBirth_information().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRPersonSimple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonSimple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_person_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_person_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personal_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personal_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPersonalDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBirthInformation"));
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
