/**
 * DutchVehicleEnvironment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleEnvironment  implements java.io.Serializable {
    private java.lang.String fuel_type;

    private java.lang.String fuel_code;

    private java.math.BigDecimal usage_city;

    private java.math.BigDecimal usage_highway;

    private java.math.BigDecimal usage_combined;

    private java.math.BigDecimal max_power;

    private java.math.BigDecimal max_power_continuous;

    private java.lang.Integer noise_level_stationary;

    private java.lang.Integer noise_level_stationary_rpm;

    private java.lang.Integer noise_level_driving;

    private java.lang.String emission_code;

    private java.lang.Integer co2_emission_combined;

    private java.lang.Integer co2_emission_weighted;

    private java.math.BigDecimal particulate_emission;

    private java.lang.String particulate_filter;

    private java.math.BigDecimal emission_particles_light;

    private java.math.BigDecimal emission_particles_heavy;

    public DutchVehicleEnvironment() {
    }

    public DutchVehicleEnvironment(
           java.lang.String fuel_type,
           java.lang.String fuel_code,
           java.math.BigDecimal usage_city,
           java.math.BigDecimal usage_highway,
           java.math.BigDecimal usage_combined,
           java.math.BigDecimal max_power,
           java.math.BigDecimal max_power_continuous,
           java.lang.Integer noise_level_stationary,
           java.lang.Integer noise_level_stationary_rpm,
           java.lang.Integer noise_level_driving,
           java.lang.String emission_code,
           java.lang.Integer co2_emission_combined,
           java.lang.Integer co2_emission_weighted,
           java.math.BigDecimal particulate_emission,
           java.lang.String particulate_filter,
           java.math.BigDecimal emission_particles_light,
           java.math.BigDecimal emission_particles_heavy) {
           this.fuel_type = fuel_type;
           this.fuel_code = fuel_code;
           this.usage_city = usage_city;
           this.usage_highway = usage_highway;
           this.usage_combined = usage_combined;
           this.max_power = max_power;
           this.max_power_continuous = max_power_continuous;
           this.noise_level_stationary = noise_level_stationary;
           this.noise_level_stationary_rpm = noise_level_stationary_rpm;
           this.noise_level_driving = noise_level_driving;
           this.emission_code = emission_code;
           this.co2_emission_combined = co2_emission_combined;
           this.co2_emission_weighted = co2_emission_weighted;
           this.particulate_emission = particulate_emission;
           this.particulate_filter = particulate_filter;
           this.emission_particles_light = emission_particles_light;
           this.emission_particles_heavy = emission_particles_heavy;
    }


    /**
     * Gets the fuel_type value for this DutchVehicleEnvironment.
     * 
     * @return fuel_type
     */
    public java.lang.String getFuel_type() {
        return fuel_type;
    }


    /**
     * Sets the fuel_type value for this DutchVehicleEnvironment.
     * 
     * @param fuel_type
     */
    public void setFuel_type(java.lang.String fuel_type) {
        this.fuel_type = fuel_type;
    }


    /**
     * Gets the fuel_code value for this DutchVehicleEnvironment.
     * 
     * @return fuel_code
     */
    public java.lang.String getFuel_code() {
        return fuel_code;
    }


    /**
     * Sets the fuel_code value for this DutchVehicleEnvironment.
     * 
     * @param fuel_code
     */
    public void setFuel_code(java.lang.String fuel_code) {
        this.fuel_code = fuel_code;
    }


    /**
     * Gets the usage_city value for this DutchVehicleEnvironment.
     * 
     * @return usage_city
     */
    public java.math.BigDecimal getUsage_city() {
        return usage_city;
    }


    /**
     * Sets the usage_city value for this DutchVehicleEnvironment.
     * 
     * @param usage_city
     */
    public void setUsage_city(java.math.BigDecimal usage_city) {
        this.usage_city = usage_city;
    }


    /**
     * Gets the usage_highway value for this DutchVehicleEnvironment.
     * 
     * @return usage_highway
     */
    public java.math.BigDecimal getUsage_highway() {
        return usage_highway;
    }


    /**
     * Sets the usage_highway value for this DutchVehicleEnvironment.
     * 
     * @param usage_highway
     */
    public void setUsage_highway(java.math.BigDecimal usage_highway) {
        this.usage_highway = usage_highway;
    }


    /**
     * Gets the usage_combined value for this DutchVehicleEnvironment.
     * 
     * @return usage_combined
     */
    public java.math.BigDecimal getUsage_combined() {
        return usage_combined;
    }


    /**
     * Sets the usage_combined value for this DutchVehicleEnvironment.
     * 
     * @param usage_combined
     */
    public void setUsage_combined(java.math.BigDecimal usage_combined) {
        this.usage_combined = usage_combined;
    }


    /**
     * Gets the max_power value for this DutchVehicleEnvironment.
     * 
     * @return max_power
     */
    public java.math.BigDecimal getMax_power() {
        return max_power;
    }


    /**
     * Sets the max_power value for this DutchVehicleEnvironment.
     * 
     * @param max_power
     */
    public void setMax_power(java.math.BigDecimal max_power) {
        this.max_power = max_power;
    }


    /**
     * Gets the max_power_continuous value for this DutchVehicleEnvironment.
     * 
     * @return max_power_continuous
     */
    public java.math.BigDecimal getMax_power_continuous() {
        return max_power_continuous;
    }


    /**
     * Sets the max_power_continuous value for this DutchVehicleEnvironment.
     * 
     * @param max_power_continuous
     */
    public void setMax_power_continuous(java.math.BigDecimal max_power_continuous) {
        this.max_power_continuous = max_power_continuous;
    }


    /**
     * Gets the noise_level_stationary value for this DutchVehicleEnvironment.
     * 
     * @return noise_level_stationary
     */
    public java.lang.Integer getNoise_level_stationary() {
        return noise_level_stationary;
    }


    /**
     * Sets the noise_level_stationary value for this DutchVehicleEnvironment.
     * 
     * @param noise_level_stationary
     */
    public void setNoise_level_stationary(java.lang.Integer noise_level_stationary) {
        this.noise_level_stationary = noise_level_stationary;
    }


    /**
     * Gets the noise_level_stationary_rpm value for this DutchVehicleEnvironment.
     * 
     * @return noise_level_stationary_rpm
     */
    public java.lang.Integer getNoise_level_stationary_rpm() {
        return noise_level_stationary_rpm;
    }


    /**
     * Sets the noise_level_stationary_rpm value for this DutchVehicleEnvironment.
     * 
     * @param noise_level_stationary_rpm
     */
    public void setNoise_level_stationary_rpm(java.lang.Integer noise_level_stationary_rpm) {
        this.noise_level_stationary_rpm = noise_level_stationary_rpm;
    }


    /**
     * Gets the noise_level_driving value for this DutchVehicleEnvironment.
     * 
     * @return noise_level_driving
     */
    public java.lang.Integer getNoise_level_driving() {
        return noise_level_driving;
    }


    /**
     * Sets the noise_level_driving value for this DutchVehicleEnvironment.
     * 
     * @param noise_level_driving
     */
    public void setNoise_level_driving(java.lang.Integer noise_level_driving) {
        this.noise_level_driving = noise_level_driving;
    }


    /**
     * Gets the emission_code value for this DutchVehicleEnvironment.
     * 
     * @return emission_code
     */
    public java.lang.String getEmission_code() {
        return emission_code;
    }


    /**
     * Sets the emission_code value for this DutchVehicleEnvironment.
     * 
     * @param emission_code
     */
    public void setEmission_code(java.lang.String emission_code) {
        this.emission_code = emission_code;
    }


    /**
     * Gets the co2_emission_combined value for this DutchVehicleEnvironment.
     * 
     * @return co2_emission_combined
     */
    public java.lang.Integer getCo2_emission_combined() {
        return co2_emission_combined;
    }


    /**
     * Sets the co2_emission_combined value for this DutchVehicleEnvironment.
     * 
     * @param co2_emission_combined
     */
    public void setCo2_emission_combined(java.lang.Integer co2_emission_combined) {
        this.co2_emission_combined = co2_emission_combined;
    }


    /**
     * Gets the co2_emission_weighted value for this DutchVehicleEnvironment.
     * 
     * @return co2_emission_weighted
     */
    public java.lang.Integer getCo2_emission_weighted() {
        return co2_emission_weighted;
    }


    /**
     * Sets the co2_emission_weighted value for this DutchVehicleEnvironment.
     * 
     * @param co2_emission_weighted
     */
    public void setCo2_emission_weighted(java.lang.Integer co2_emission_weighted) {
        this.co2_emission_weighted = co2_emission_weighted;
    }


    /**
     * Gets the particulate_emission value for this DutchVehicleEnvironment.
     * 
     * @return particulate_emission
     */
    public java.math.BigDecimal getParticulate_emission() {
        return particulate_emission;
    }


    /**
     * Sets the particulate_emission value for this DutchVehicleEnvironment.
     * 
     * @param particulate_emission
     */
    public void setParticulate_emission(java.math.BigDecimal particulate_emission) {
        this.particulate_emission = particulate_emission;
    }


    /**
     * Gets the particulate_filter value for this DutchVehicleEnvironment.
     * 
     * @return particulate_filter
     */
    public java.lang.String getParticulate_filter() {
        return particulate_filter;
    }


    /**
     * Sets the particulate_filter value for this DutchVehicleEnvironment.
     * 
     * @param particulate_filter
     */
    public void setParticulate_filter(java.lang.String particulate_filter) {
        this.particulate_filter = particulate_filter;
    }


    /**
     * Gets the emission_particles_light value for this DutchVehicleEnvironment.
     * 
     * @return emission_particles_light
     */
    public java.math.BigDecimal getEmission_particles_light() {
        return emission_particles_light;
    }


    /**
     * Sets the emission_particles_light value for this DutchVehicleEnvironment.
     * 
     * @param emission_particles_light
     */
    public void setEmission_particles_light(java.math.BigDecimal emission_particles_light) {
        this.emission_particles_light = emission_particles_light;
    }


    /**
     * Gets the emission_particles_heavy value for this DutchVehicleEnvironment.
     * 
     * @return emission_particles_heavy
     */
    public java.math.BigDecimal getEmission_particles_heavy() {
        return emission_particles_heavy;
    }


    /**
     * Sets the emission_particles_heavy value for this DutchVehicleEnvironment.
     * 
     * @param emission_particles_heavy
     */
    public void setEmission_particles_heavy(java.math.BigDecimal emission_particles_heavy) {
        this.emission_particles_heavy = emission_particles_heavy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleEnvironment)) return false;
        DutchVehicleEnvironment other = (DutchVehicleEnvironment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fuel_type==null && other.getFuel_type()==null) || 
             (this.fuel_type!=null &&
              this.fuel_type.equals(other.getFuel_type()))) &&
            ((this.fuel_code==null && other.getFuel_code()==null) || 
             (this.fuel_code!=null &&
              this.fuel_code.equals(other.getFuel_code()))) &&
            ((this.usage_city==null && other.getUsage_city()==null) || 
             (this.usage_city!=null &&
              this.usage_city.equals(other.getUsage_city()))) &&
            ((this.usage_highway==null && other.getUsage_highway()==null) || 
             (this.usage_highway!=null &&
              this.usage_highway.equals(other.getUsage_highway()))) &&
            ((this.usage_combined==null && other.getUsage_combined()==null) || 
             (this.usage_combined!=null &&
              this.usage_combined.equals(other.getUsage_combined()))) &&
            ((this.max_power==null && other.getMax_power()==null) || 
             (this.max_power!=null &&
              this.max_power.equals(other.getMax_power()))) &&
            ((this.max_power_continuous==null && other.getMax_power_continuous()==null) || 
             (this.max_power_continuous!=null &&
              this.max_power_continuous.equals(other.getMax_power_continuous()))) &&
            ((this.noise_level_stationary==null && other.getNoise_level_stationary()==null) || 
             (this.noise_level_stationary!=null &&
              this.noise_level_stationary.equals(other.getNoise_level_stationary()))) &&
            ((this.noise_level_stationary_rpm==null && other.getNoise_level_stationary_rpm()==null) || 
             (this.noise_level_stationary_rpm!=null &&
              this.noise_level_stationary_rpm.equals(other.getNoise_level_stationary_rpm()))) &&
            ((this.noise_level_driving==null && other.getNoise_level_driving()==null) || 
             (this.noise_level_driving!=null &&
              this.noise_level_driving.equals(other.getNoise_level_driving()))) &&
            ((this.emission_code==null && other.getEmission_code()==null) || 
             (this.emission_code!=null &&
              this.emission_code.equals(other.getEmission_code()))) &&
            ((this.co2_emission_combined==null && other.getCo2_emission_combined()==null) || 
             (this.co2_emission_combined!=null &&
              this.co2_emission_combined.equals(other.getCo2_emission_combined()))) &&
            ((this.co2_emission_weighted==null && other.getCo2_emission_weighted()==null) || 
             (this.co2_emission_weighted!=null &&
              this.co2_emission_weighted.equals(other.getCo2_emission_weighted()))) &&
            ((this.particulate_emission==null && other.getParticulate_emission()==null) || 
             (this.particulate_emission!=null &&
              this.particulate_emission.equals(other.getParticulate_emission()))) &&
            ((this.particulate_filter==null && other.getParticulate_filter()==null) || 
             (this.particulate_filter!=null &&
              this.particulate_filter.equals(other.getParticulate_filter()))) &&
            ((this.emission_particles_light==null && other.getEmission_particles_light()==null) || 
             (this.emission_particles_light!=null &&
              this.emission_particles_light.equals(other.getEmission_particles_light()))) &&
            ((this.emission_particles_heavy==null && other.getEmission_particles_heavy()==null) || 
             (this.emission_particles_heavy!=null &&
              this.emission_particles_heavy.equals(other.getEmission_particles_heavy())));
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
        if (getFuel_type() != null) {
            _hashCode += getFuel_type().hashCode();
        }
        if (getFuel_code() != null) {
            _hashCode += getFuel_code().hashCode();
        }
        if (getUsage_city() != null) {
            _hashCode += getUsage_city().hashCode();
        }
        if (getUsage_highway() != null) {
            _hashCode += getUsage_highway().hashCode();
        }
        if (getUsage_combined() != null) {
            _hashCode += getUsage_combined().hashCode();
        }
        if (getMax_power() != null) {
            _hashCode += getMax_power().hashCode();
        }
        if (getMax_power_continuous() != null) {
            _hashCode += getMax_power_continuous().hashCode();
        }
        if (getNoise_level_stationary() != null) {
            _hashCode += getNoise_level_stationary().hashCode();
        }
        if (getNoise_level_stationary_rpm() != null) {
            _hashCode += getNoise_level_stationary_rpm().hashCode();
        }
        if (getNoise_level_driving() != null) {
            _hashCode += getNoise_level_driving().hashCode();
        }
        if (getEmission_code() != null) {
            _hashCode += getEmission_code().hashCode();
        }
        if (getCo2_emission_combined() != null) {
            _hashCode += getCo2_emission_combined().hashCode();
        }
        if (getCo2_emission_weighted() != null) {
            _hashCode += getCo2_emission_weighted().hashCode();
        }
        if (getParticulate_emission() != null) {
            _hashCode += getParticulate_emission().hashCode();
        }
        if (getParticulate_filter() != null) {
            _hashCode += getParticulate_filter().hashCode();
        }
        if (getEmission_particles_light() != null) {
            _hashCode += getEmission_particles_light().hashCode();
        }
        if (getEmission_particles_heavy() != null) {
            _hashCode += getEmission_particles_heavy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleEnvironment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleEnvironment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usage_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_highway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usage_highway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_combined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usage_combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "max_power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_power_continuous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "max_power_continuous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noise_level_stationary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "noise_level_stationary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noise_level_stationary_rpm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "noise_level_stationary_rpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noise_level_driving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "noise_level_driving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2_emission_combined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "co2_emission_combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2_emission_weighted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "co2_emission_weighted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particulate_emission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "particulate_emission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("emission_particles_light");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_particles_light"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_particles_heavy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_particles_heavy"));
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
