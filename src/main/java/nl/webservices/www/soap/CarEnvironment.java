/**
 * CarEnvironment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarEnvironment  implements java.io.Serializable {
    private java.lang.String emission_code;

    private java.lang.String energy_label;

    private java.lang.Boolean g3_indication;

    private java.lang.String particulate_filter;

    private java.math.BigDecimal fuel_usage_city;

    private java.math.BigDecimal fuel_usage_highway;

    private java.math.BigDecimal fuel_usage_combined;

    public CarEnvironment() {
    }

    public CarEnvironment(
           java.lang.String emission_code,
           java.lang.String energy_label,
           java.lang.Boolean g3_indication,
           java.lang.String particulate_filter,
           java.math.BigDecimal fuel_usage_city,
           java.math.BigDecimal fuel_usage_highway,
           java.math.BigDecimal fuel_usage_combined) {
           this.emission_code = emission_code;
           this.energy_label = energy_label;
           this.g3_indication = g3_indication;
           this.particulate_filter = particulate_filter;
           this.fuel_usage_city = fuel_usage_city;
           this.fuel_usage_highway = fuel_usage_highway;
           this.fuel_usage_combined = fuel_usage_combined;
    }


    /**
     * Gets the emission_code value for this CarEnvironment.
     * 
     * @return emission_code
     */
    public java.lang.String getEmission_code() {
        return emission_code;
    }


    /**
     * Sets the emission_code value for this CarEnvironment.
     * 
     * @param emission_code
     */
    public void setEmission_code(java.lang.String emission_code) {
        this.emission_code = emission_code;
    }


    /**
     * Gets the energy_label value for this CarEnvironment.
     * 
     * @return energy_label
     */
    public java.lang.String getEnergy_label() {
        return energy_label;
    }


    /**
     * Sets the energy_label value for this CarEnvironment.
     * 
     * @param energy_label
     */
    public void setEnergy_label(java.lang.String energy_label) {
        this.energy_label = energy_label;
    }


    /**
     * Gets the g3_indication value for this CarEnvironment.
     * 
     * @return g3_indication
     */
    public java.lang.Boolean getG3_indication() {
        return g3_indication;
    }


    /**
     * Sets the g3_indication value for this CarEnvironment.
     * 
     * @param g3_indication
     */
    public void setG3_indication(java.lang.Boolean g3_indication) {
        this.g3_indication = g3_indication;
    }


    /**
     * Gets the particulate_filter value for this CarEnvironment.
     * 
     * @return particulate_filter
     */
    public java.lang.String getParticulate_filter() {
        return particulate_filter;
    }


    /**
     * Sets the particulate_filter value for this CarEnvironment.
     * 
     * @param particulate_filter
     */
    public void setParticulate_filter(java.lang.String particulate_filter) {
        this.particulate_filter = particulate_filter;
    }


    /**
     * Gets the fuel_usage_city value for this CarEnvironment.
     * 
     * @return fuel_usage_city
     */
    public java.math.BigDecimal getFuel_usage_city() {
        return fuel_usage_city;
    }


    /**
     * Sets the fuel_usage_city value for this CarEnvironment.
     * 
     * @param fuel_usage_city
     */
    public void setFuel_usage_city(java.math.BigDecimal fuel_usage_city) {
        this.fuel_usage_city = fuel_usage_city;
    }


    /**
     * Gets the fuel_usage_highway value for this CarEnvironment.
     * 
     * @return fuel_usage_highway
     */
    public java.math.BigDecimal getFuel_usage_highway() {
        return fuel_usage_highway;
    }


    /**
     * Sets the fuel_usage_highway value for this CarEnvironment.
     * 
     * @param fuel_usage_highway
     */
    public void setFuel_usage_highway(java.math.BigDecimal fuel_usage_highway) {
        this.fuel_usage_highway = fuel_usage_highway;
    }


    /**
     * Gets the fuel_usage_combined value for this CarEnvironment.
     * 
     * @return fuel_usage_combined
     */
    public java.math.BigDecimal getFuel_usage_combined() {
        return fuel_usage_combined;
    }


    /**
     * Sets the fuel_usage_combined value for this CarEnvironment.
     * 
     * @param fuel_usage_combined
     */
    public void setFuel_usage_combined(java.math.BigDecimal fuel_usage_combined) {
        this.fuel_usage_combined = fuel_usage_combined;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarEnvironment)) return false;
        CarEnvironment other = (CarEnvironment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emission_code==null && other.getEmission_code()==null) || 
             (this.emission_code!=null &&
              this.emission_code.equals(other.getEmission_code()))) &&
            ((this.energy_label==null && other.getEnergy_label()==null) || 
             (this.energy_label!=null &&
              this.energy_label.equals(other.getEnergy_label()))) &&
            ((this.g3_indication==null && other.getG3_indication()==null) || 
             (this.g3_indication!=null &&
              this.g3_indication.equals(other.getG3_indication()))) &&
            ((this.particulate_filter==null && other.getParticulate_filter()==null) || 
             (this.particulate_filter!=null &&
              this.particulate_filter.equals(other.getParticulate_filter()))) &&
            ((this.fuel_usage_city==null && other.getFuel_usage_city()==null) || 
             (this.fuel_usage_city!=null &&
              this.fuel_usage_city.equals(other.getFuel_usage_city()))) &&
            ((this.fuel_usage_highway==null && other.getFuel_usage_highway()==null) || 
             (this.fuel_usage_highway!=null &&
              this.fuel_usage_highway.equals(other.getFuel_usage_highway()))) &&
            ((this.fuel_usage_combined==null && other.getFuel_usage_combined()==null) || 
             (this.fuel_usage_combined!=null &&
              this.fuel_usage_combined.equals(other.getFuel_usage_combined())));
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
        if (getEmission_code() != null) {
            _hashCode += getEmission_code().hashCode();
        }
        if (getEnergy_label() != null) {
            _hashCode += getEnergy_label().hashCode();
        }
        if (getG3_indication() != null) {
            _hashCode += getG3_indication().hashCode();
        }
        if (getParticulate_filter() != null) {
            _hashCode += getParticulate_filter().hashCode();
        }
        if (getFuel_usage_city() != null) {
            _hashCode += getFuel_usage_city().hashCode();
        }
        if (getFuel_usage_highway() != null) {
            _hashCode += getFuel_usage_highway().hashCode();
        }
        if (getFuel_usage_combined() != null) {
            _hashCode += getFuel_usage_combined().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarEnvironment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarEnvironment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energy_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "energy_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g3_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "g3_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particulate_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "particulate_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_usage_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_usage_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_usage_highway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_usage_highway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_usage_combined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_usage_combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
