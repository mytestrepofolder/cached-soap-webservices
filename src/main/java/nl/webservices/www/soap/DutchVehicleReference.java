/**
 * DutchVehicleReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleReference  implements java.io.Serializable {
    private java.lang.String version;

    private java.util.Date date_first_admission;

    private java.lang.Integer year_manufactored;

    private java.lang.String fuel_type;

    private java.lang.Integer weight;

    private java.lang.Integer maximum_mass_payload;

    public DutchVehicleReference() {
    }

    public DutchVehicleReference(
           java.lang.String version,
           java.util.Date date_first_admission,
           java.lang.Integer year_manufactored,
           java.lang.String fuel_type,
           java.lang.Integer weight,
           java.lang.Integer maximum_mass_payload) {
           this.version = version;
           this.date_first_admission = date_first_admission;
           this.year_manufactored = year_manufactored;
           this.fuel_type = fuel_type;
           this.weight = weight;
           this.maximum_mass_payload = maximum_mass_payload;
    }


    /**
     * Gets the version value for this DutchVehicleReference.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DutchVehicleReference.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the date_first_admission value for this DutchVehicleReference.
     * 
     * @return date_first_admission
     */
    public java.util.Date getDate_first_admission() {
        return date_first_admission;
    }


    /**
     * Sets the date_first_admission value for this DutchVehicleReference.
     * 
     * @param date_first_admission
     */
    public void setDate_first_admission(java.util.Date date_first_admission) {
        this.date_first_admission = date_first_admission;
    }


    /**
     * Gets the year_manufactored value for this DutchVehicleReference.
     * 
     * @return year_manufactored
     */
    public java.lang.Integer getYear_manufactored() {
        return year_manufactored;
    }


    /**
     * Sets the year_manufactored value for this DutchVehicleReference.
     * 
     * @param year_manufactored
     */
    public void setYear_manufactored(java.lang.Integer year_manufactored) {
        this.year_manufactored = year_manufactored;
    }


    /**
     * Gets the fuel_type value for this DutchVehicleReference.
     * 
     * @return fuel_type
     */
    public java.lang.String getFuel_type() {
        return fuel_type;
    }


    /**
     * Sets the fuel_type value for this DutchVehicleReference.
     * 
     * @param fuel_type
     */
    public void setFuel_type(java.lang.String fuel_type) {
        this.fuel_type = fuel_type;
    }


    /**
     * Gets the weight value for this DutchVehicleReference.
     * 
     * @return weight
     */
    public java.lang.Integer getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DutchVehicleReference.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Integer weight) {
        this.weight = weight;
    }


    /**
     * Gets the maximum_mass_payload value for this DutchVehicleReference.
     * 
     * @return maximum_mass_payload
     */
    public java.lang.Integer getMaximum_mass_payload() {
        return maximum_mass_payload;
    }


    /**
     * Sets the maximum_mass_payload value for this DutchVehicleReference.
     * 
     * @param maximum_mass_payload
     */
    public void setMaximum_mass_payload(java.lang.Integer maximum_mass_payload) {
        this.maximum_mass_payload = maximum_mass_payload;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleReference)) return false;
        DutchVehicleReference other = (DutchVehicleReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.date_first_admission==null && other.getDate_first_admission()==null) || 
             (this.date_first_admission!=null &&
              this.date_first_admission.equals(other.getDate_first_admission()))) &&
            ((this.year_manufactored==null && other.getYear_manufactored()==null) || 
             (this.year_manufactored!=null &&
              this.year_manufactored.equals(other.getYear_manufactored()))) &&
            ((this.fuel_type==null && other.getFuel_type()==null) || 
             (this.fuel_type!=null &&
              this.fuel_type.equals(other.getFuel_type()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.maximum_mass_payload==null && other.getMaximum_mass_payload()==null) || 
             (this.maximum_mass_payload!=null &&
              this.maximum_mass_payload.equals(other.getMaximum_mass_payload())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDate_first_admission() != null) {
            _hashCode += getDate_first_admission().hashCode();
        }
        if (getYear_manufactored() != null) {
            _hashCode += getYear_manufactored().hashCode();
        }
        if (getFuel_type() != null) {
            _hashCode += getFuel_type().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getMaximum_mass_payload() != null) {
            _hashCode += getMaximum_mass_payload().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("year_manufactored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year_manufactored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_payload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_payload"));
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
