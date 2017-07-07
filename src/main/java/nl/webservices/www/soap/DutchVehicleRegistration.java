/**
 * DutchVehicleRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleRegistration  implements java.io.Serializable {
    private java.util.Date date_apk_due_date;

    private java.util.Date date_first_issuing;

    private java.util.Date date_first_admission;

    private java.util.Date date_suspension_end_date;

    private java.util.Date date_tachograph_expiration;

    private java.util.Date date_latest_name_registration;

    private java.lang.Integer ownerships;

    public DutchVehicleRegistration() {
    }

    public DutchVehicleRegistration(
           java.util.Date date_apk_due_date,
           java.util.Date date_first_issuing,
           java.util.Date date_first_admission,
           java.util.Date date_suspension_end_date,
           java.util.Date date_tachograph_expiration,
           java.util.Date date_latest_name_registration,
           java.lang.Integer ownerships) {
           this.date_apk_due_date = date_apk_due_date;
           this.date_first_issuing = date_first_issuing;
           this.date_first_admission = date_first_admission;
           this.date_suspension_end_date = date_suspension_end_date;
           this.date_tachograph_expiration = date_tachograph_expiration;
           this.date_latest_name_registration = date_latest_name_registration;
           this.ownerships = ownerships;
    }


    /**
     * Gets the date_apk_due_date value for this DutchVehicleRegistration.
     * 
     * @return date_apk_due_date
     */
    public java.util.Date getDate_apk_due_date() {
        return date_apk_due_date;
    }


    /**
     * Sets the date_apk_due_date value for this DutchVehicleRegistration.
     * 
     * @param date_apk_due_date
     */
    public void setDate_apk_due_date(java.util.Date date_apk_due_date) {
        this.date_apk_due_date = date_apk_due_date;
    }


    /**
     * Gets the date_first_issuing value for this DutchVehicleRegistration.
     * 
     * @return date_first_issuing
     */
    public java.util.Date getDate_first_issuing() {
        return date_first_issuing;
    }


    /**
     * Sets the date_first_issuing value for this DutchVehicleRegistration.
     * 
     * @param date_first_issuing
     */
    public void setDate_first_issuing(java.util.Date date_first_issuing) {
        this.date_first_issuing = date_first_issuing;
    }


    /**
     * Gets the date_first_admission value for this DutchVehicleRegistration.
     * 
     * @return date_first_admission
     */
    public java.util.Date getDate_first_admission() {
        return date_first_admission;
    }


    /**
     * Sets the date_first_admission value for this DutchVehicleRegistration.
     * 
     * @param date_first_admission
     */
    public void setDate_first_admission(java.util.Date date_first_admission) {
        this.date_first_admission = date_first_admission;
    }


    /**
     * Gets the date_suspension_end_date value for this DutchVehicleRegistration.
     * 
     * @return date_suspension_end_date
     */
    public java.util.Date getDate_suspension_end_date() {
        return date_suspension_end_date;
    }


    /**
     * Sets the date_suspension_end_date value for this DutchVehicleRegistration.
     * 
     * @param date_suspension_end_date
     */
    public void setDate_suspension_end_date(java.util.Date date_suspension_end_date) {
        this.date_suspension_end_date = date_suspension_end_date;
    }


    /**
     * Gets the date_tachograph_expiration value for this DutchVehicleRegistration.
     * 
     * @return date_tachograph_expiration
     */
    public java.util.Date getDate_tachograph_expiration() {
        return date_tachograph_expiration;
    }


    /**
     * Sets the date_tachograph_expiration value for this DutchVehicleRegistration.
     * 
     * @param date_tachograph_expiration
     */
    public void setDate_tachograph_expiration(java.util.Date date_tachograph_expiration) {
        this.date_tachograph_expiration = date_tachograph_expiration;
    }


    /**
     * Gets the date_latest_name_registration value for this DutchVehicleRegistration.
     * 
     * @return date_latest_name_registration
     */
    public java.util.Date getDate_latest_name_registration() {
        return date_latest_name_registration;
    }


    /**
     * Sets the date_latest_name_registration value for this DutchVehicleRegistration.
     * 
     * @param date_latest_name_registration
     */
    public void setDate_latest_name_registration(java.util.Date date_latest_name_registration) {
        this.date_latest_name_registration = date_latest_name_registration;
    }


    /**
     * Gets the ownerships value for this DutchVehicleRegistration.
     * 
     * @return ownerships
     */
    public java.lang.Integer getOwnerships() {
        return ownerships;
    }


    /**
     * Sets the ownerships value for this DutchVehicleRegistration.
     * 
     * @param ownerships
     */
    public void setOwnerships(java.lang.Integer ownerships) {
        this.ownerships = ownerships;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleRegistration)) return false;
        DutchVehicleRegistration other = (DutchVehicleRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_apk_due_date==null && other.getDate_apk_due_date()==null) || 
             (this.date_apk_due_date!=null &&
              this.date_apk_due_date.equals(other.getDate_apk_due_date()))) &&
            ((this.date_first_issuing==null && other.getDate_first_issuing()==null) || 
             (this.date_first_issuing!=null &&
              this.date_first_issuing.equals(other.getDate_first_issuing()))) &&
            ((this.date_first_admission==null && other.getDate_first_admission()==null) || 
             (this.date_first_admission!=null &&
              this.date_first_admission.equals(other.getDate_first_admission()))) &&
            ((this.date_suspension_end_date==null && other.getDate_suspension_end_date()==null) || 
             (this.date_suspension_end_date!=null &&
              this.date_suspension_end_date.equals(other.getDate_suspension_end_date()))) &&
            ((this.date_tachograph_expiration==null && other.getDate_tachograph_expiration()==null) || 
             (this.date_tachograph_expiration!=null &&
              this.date_tachograph_expiration.equals(other.getDate_tachograph_expiration()))) &&
            ((this.date_latest_name_registration==null && other.getDate_latest_name_registration()==null) || 
             (this.date_latest_name_registration!=null &&
              this.date_latest_name_registration.equals(other.getDate_latest_name_registration()))) &&
            ((this.ownerships==null && other.getOwnerships()==null) || 
             (this.ownerships!=null &&
              this.ownerships.equals(other.getOwnerships())));
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
        if (getDate_apk_due_date() != null) {
            _hashCode += getDate_apk_due_date().hashCode();
        }
        if (getDate_first_issuing() != null) {
            _hashCode += getDate_first_issuing().hashCode();
        }
        if (getDate_first_admission() != null) {
            _hashCode += getDate_first_admission().hashCode();
        }
        if (getDate_suspension_end_date() != null) {
            _hashCode += getDate_suspension_end_date().hashCode();
        }
        if (getDate_tachograph_expiration() != null) {
            _hashCode += getDate_tachograph_expiration().hashCode();
        }
        if (getDate_latest_name_registration() != null) {
            _hashCode += getDate_latest_name_registration().hashCode();
        }
        if (getOwnerships() != null) {
            _hashCode += getOwnerships().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_apk_due_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_apk_due_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_issuing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_issuing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_admission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_admission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_suspension_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_suspension_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_tachograph_expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_tachograph_expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_latest_name_registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_latest_name_registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerships");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ownerships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
