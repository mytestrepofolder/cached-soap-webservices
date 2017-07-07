/**
 * CreditsafeDirector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeDirector  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String address;

    private java.lang.String gender;

    private java.util.Calendar appointment_date;

    private java.util.Calendar date_of_birth;

    private java.lang.String position;

    public CreditsafeDirector() {
    }

    public CreditsafeDirector(
           java.lang.String name,
           java.lang.String address,
           java.lang.String gender,
           java.util.Calendar appointment_date,
           java.util.Calendar date_of_birth,
           java.lang.String position) {
           this.name = name;
           this.address = address;
           this.gender = gender;
           this.appointment_date = appointment_date;
           this.date_of_birth = date_of_birth;
           this.position = position;
    }


    /**
     * Gets the name value for this CreditsafeDirector.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreditsafeDirector.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this CreditsafeDirector.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CreditsafeDirector.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the gender value for this CreditsafeDirector.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CreditsafeDirector.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the appointment_date value for this CreditsafeDirector.
     * 
     * @return appointment_date
     */
    public java.util.Calendar getAppointment_date() {
        return appointment_date;
    }


    /**
     * Sets the appointment_date value for this CreditsafeDirector.
     * 
     * @param appointment_date
     */
    public void setAppointment_date(java.util.Calendar appointment_date) {
        this.appointment_date = appointment_date;
    }


    /**
     * Gets the date_of_birth value for this CreditsafeDirector.
     * 
     * @return date_of_birth
     */
    public java.util.Calendar getDate_of_birth() {
        return date_of_birth;
    }


    /**
     * Sets the date_of_birth value for this CreditsafeDirector.
     * 
     * @param date_of_birth
     */
    public void setDate_of_birth(java.util.Calendar date_of_birth) {
        this.date_of_birth = date_of_birth;
    }


    /**
     * Gets the position value for this CreditsafeDirector.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this CreditsafeDirector.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeDirector)) return false;
        CreditsafeDirector other = (CreditsafeDirector) obj;
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
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.appointment_date==null && other.getAppointment_date()==null) || 
             (this.appointment_date!=null &&
              this.appointment_date.equals(other.getAppointment_date()))) &&
            ((this.date_of_birth==null && other.getDate_of_birth()==null) || 
             (this.date_of_birth!=null &&
              this.date_of_birth.equals(other.getDate_of_birth()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getAppointment_date() != null) {
            _hashCode += getAppointment_date().hashCode();
        }
        if (getDate_of_birth() != null) {
            _hashCode += getDate_of_birth().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeDirector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeDirector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "appointment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "position"));
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
