/**
 * GCRPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRPerson  implements java.io.Serializable {
    private java.math.BigInteger graydon_person_id;

    private nl.webservices.www.soap.GCRPersonalDetails personal_details;

    private nl.webservices.www.soap.GCRTelephoneNumber telephone_number;

    private nl.webservices.www.soap.GCRAddress address;

    private nl.webservices.www.soap.GCRBirthInformation birth_information;

    private nl.webservices.www.soap.GCRJobTitle[] job_titles;

    private nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities;

    public GCRPerson() {
    }

    public GCRPerson(
           java.math.BigInteger graydon_person_id,
           nl.webservices.www.soap.GCRPersonalDetails personal_details,
           nl.webservices.www.soap.GCRTelephoneNumber telephone_number,
           nl.webservices.www.soap.GCRAddress address,
           nl.webservices.www.soap.GCRBirthInformation birth_information,
           nl.webservices.www.soap.GCRJobTitle[] job_titles,
           nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
           this.graydon_person_id = graydon_person_id;
           this.personal_details = personal_details;
           this.telephone_number = telephone_number;
           this.address = address;
           this.birth_information = birth_information;
           this.job_titles = job_titles;
           this.financial_calamities = financial_calamities;
    }


    /**
     * Gets the graydon_person_id value for this GCRPerson.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRPerson.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the personal_details value for this GCRPerson.
     * 
     * @return personal_details
     */
    public nl.webservices.www.soap.GCRPersonalDetails getPersonal_details() {
        return personal_details;
    }


    /**
     * Sets the personal_details value for this GCRPerson.
     * 
     * @param personal_details
     */
    public void setPersonal_details(nl.webservices.www.soap.GCRPersonalDetails personal_details) {
        this.personal_details = personal_details;
    }


    /**
     * Gets the telephone_number value for this GCRPerson.
     * 
     * @return telephone_number
     */
    public nl.webservices.www.soap.GCRTelephoneNumber getTelephone_number() {
        return telephone_number;
    }


    /**
     * Sets the telephone_number value for this GCRPerson.
     * 
     * @param telephone_number
     */
    public void setTelephone_number(nl.webservices.www.soap.GCRTelephoneNumber telephone_number) {
        this.telephone_number = telephone_number;
    }


    /**
     * Gets the address value for this GCRPerson.
     * 
     * @return address
     */
    public nl.webservices.www.soap.GCRAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this GCRPerson.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.GCRAddress address) {
        this.address = address;
    }


    /**
     * Gets the birth_information value for this GCRPerson.
     * 
     * @return birth_information
     */
    public nl.webservices.www.soap.GCRBirthInformation getBirth_information() {
        return birth_information;
    }


    /**
     * Sets the birth_information value for this GCRPerson.
     * 
     * @param birth_information
     */
    public void setBirth_information(nl.webservices.www.soap.GCRBirthInformation birth_information) {
        this.birth_information = birth_information;
    }


    /**
     * Gets the job_titles value for this GCRPerson.
     * 
     * @return job_titles
     */
    public nl.webservices.www.soap.GCRJobTitle[] getJob_titles() {
        return job_titles;
    }


    /**
     * Sets the job_titles value for this GCRPerson.
     * 
     * @param job_titles
     */
    public void setJob_titles(nl.webservices.www.soap.GCRJobTitle[] job_titles) {
        this.job_titles = job_titles;
    }


    /**
     * Gets the financial_calamities value for this GCRPerson.
     * 
     * @return financial_calamities
     */
    public nl.webservices.www.soap.GCRFinancialCalamity[] getFinancial_calamities() {
        return financial_calamities;
    }


    /**
     * Sets the financial_calamities value for this GCRPerson.
     * 
     * @param financial_calamities
     */
    public void setFinancial_calamities(nl.webservices.www.soap.GCRFinancialCalamity[] financial_calamities) {
        this.financial_calamities = financial_calamities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRPerson)) return false;
        GCRPerson other = (GCRPerson) obj;
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
            ((this.telephone_number==null && other.getTelephone_number()==null) || 
             (this.telephone_number!=null &&
              this.telephone_number.equals(other.getTelephone_number()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.birth_information==null && other.getBirth_information()==null) || 
             (this.birth_information!=null &&
              this.birth_information.equals(other.getBirth_information()))) &&
            ((this.job_titles==null && other.getJob_titles()==null) || 
             (this.job_titles!=null &&
              java.util.Arrays.equals(this.job_titles, other.getJob_titles()))) &&
            ((this.financial_calamities==null && other.getFinancial_calamities()==null) || 
             (this.financial_calamities!=null &&
              java.util.Arrays.equals(this.financial_calamities, other.getFinancial_calamities())));
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
        if (getTelephone_number() != null) {
            _hashCode += getTelephone_number().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getBirth_information() != null) {
            _hashCode += getBirth_information().hashCode();
        }
        if (getJob_titles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJob_titles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJob_titles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinancial_calamities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinancial_calamities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinancial_calamities(), i);
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
        new org.apache.axis.description.TypeDesc(GCRPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPerson"));
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
        elemField.setFieldName("telephone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTelephoneNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "job_titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRJobTitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_calamities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_calamities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialCalamity"));
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
