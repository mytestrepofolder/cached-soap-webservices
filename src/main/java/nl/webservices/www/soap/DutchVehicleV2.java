/**
 * DutchVehicleV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleV2  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchVehicleData basic_data;

    private nl.webservices.www.soap.DutchVehicleStatus status;

    private nl.webservices.www.soap.DutchVehicleRegistration registration;

    private nl.webservices.www.soap.DutchVehicleFeature details;

    private nl.webservices.www.soap.DutchVehicleTaxData tax;

    private nl.webservices.www.soap.DutchVehicleTechnicalWeight technical_weight;

    private nl.webservices.www.soap.DutchVehicleEngine engine;

    private nl.webservices.www.soap.DutchVehicleEnvironment[] environmental_impact;

    private nl.webservices.www.soap.DutchVehicleAxle[] axle_information;

    private nl.webservices.www.soap.DutchVehicleTypeApproval type_approval;

    private nl.webservices.www.soap.DutchVehicleBodyApproval[] body_approval;

    private nl.webservices.www.soap.DutchVehicleRemark[] remark;

    private nl.webservices.www.soap.DutchVehicleRecall recall;

    private nl.webservices.www.soap.DutchVehicleMileage mileage;

    public DutchVehicleV2() {
    }

    public DutchVehicleV2(
           nl.webservices.www.soap.DutchVehicleData basic_data,
           nl.webservices.www.soap.DutchVehicleStatus status,
           nl.webservices.www.soap.DutchVehicleRegistration registration,
           nl.webservices.www.soap.DutchVehicleFeature details,
           nl.webservices.www.soap.DutchVehicleTaxData tax,
           nl.webservices.www.soap.DutchVehicleTechnicalWeight technical_weight,
           nl.webservices.www.soap.DutchVehicleEngine engine,
           nl.webservices.www.soap.DutchVehicleEnvironment[] environmental_impact,
           nl.webservices.www.soap.DutchVehicleAxle[] axle_information,
           nl.webservices.www.soap.DutchVehicleTypeApproval type_approval,
           nl.webservices.www.soap.DutchVehicleBodyApproval[] body_approval,
           nl.webservices.www.soap.DutchVehicleRemark[] remark,
           nl.webservices.www.soap.DutchVehicleRecall recall,
           nl.webservices.www.soap.DutchVehicleMileage mileage) {
           this.basic_data = basic_data;
           this.status = status;
           this.registration = registration;
           this.details = details;
           this.tax = tax;
           this.technical_weight = technical_weight;
           this.engine = engine;
           this.environmental_impact = environmental_impact;
           this.axle_information = axle_information;
           this.type_approval = type_approval;
           this.body_approval = body_approval;
           this.remark = remark;
           this.recall = recall;
           this.mileage = mileage;
    }


    /**
     * Gets the basic_data value for this DutchVehicleV2.
     * 
     * @return basic_data
     */
    public nl.webservices.www.soap.DutchVehicleData getBasic_data() {
        return basic_data;
    }


    /**
     * Sets the basic_data value for this DutchVehicleV2.
     * 
     * @param basic_data
     */
    public void setBasic_data(nl.webservices.www.soap.DutchVehicleData basic_data) {
        this.basic_data = basic_data;
    }


    /**
     * Gets the status value for this DutchVehicleV2.
     * 
     * @return status
     */
    public nl.webservices.www.soap.DutchVehicleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DutchVehicleV2.
     * 
     * @param status
     */
    public void setStatus(nl.webservices.www.soap.DutchVehicleStatus status) {
        this.status = status;
    }


    /**
     * Gets the registration value for this DutchVehicleV2.
     * 
     * @return registration
     */
    public nl.webservices.www.soap.DutchVehicleRegistration getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this DutchVehicleV2.
     * 
     * @param registration
     */
    public void setRegistration(nl.webservices.www.soap.DutchVehicleRegistration registration) {
        this.registration = registration;
    }


    /**
     * Gets the details value for this DutchVehicleV2.
     * 
     * @return details
     */
    public nl.webservices.www.soap.DutchVehicleFeature getDetails() {
        return details;
    }


    /**
     * Sets the details value for this DutchVehicleV2.
     * 
     * @param details
     */
    public void setDetails(nl.webservices.www.soap.DutchVehicleFeature details) {
        this.details = details;
    }


    /**
     * Gets the tax value for this DutchVehicleV2.
     * 
     * @return tax
     */
    public nl.webservices.www.soap.DutchVehicleTaxData getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this DutchVehicleV2.
     * 
     * @param tax
     */
    public void setTax(nl.webservices.www.soap.DutchVehicleTaxData tax) {
        this.tax = tax;
    }


    /**
     * Gets the technical_weight value for this DutchVehicleV2.
     * 
     * @return technical_weight
     */
    public nl.webservices.www.soap.DutchVehicleTechnicalWeight getTechnical_weight() {
        return technical_weight;
    }


    /**
     * Sets the technical_weight value for this DutchVehicleV2.
     * 
     * @param technical_weight
     */
    public void setTechnical_weight(nl.webservices.www.soap.DutchVehicleTechnicalWeight technical_weight) {
        this.technical_weight = technical_weight;
    }


    /**
     * Gets the engine value for this DutchVehicleV2.
     * 
     * @return engine
     */
    public nl.webservices.www.soap.DutchVehicleEngine getEngine() {
        return engine;
    }


    /**
     * Sets the engine value for this DutchVehicleV2.
     * 
     * @param engine
     */
    public void setEngine(nl.webservices.www.soap.DutchVehicleEngine engine) {
        this.engine = engine;
    }


    /**
     * Gets the environmental_impact value for this DutchVehicleV2.
     * 
     * @return environmental_impact
     */
    public nl.webservices.www.soap.DutchVehicleEnvironment[] getEnvironmental_impact() {
        return environmental_impact;
    }


    /**
     * Sets the environmental_impact value for this DutchVehicleV2.
     * 
     * @param environmental_impact
     */
    public void setEnvironmental_impact(nl.webservices.www.soap.DutchVehicleEnvironment[] environmental_impact) {
        this.environmental_impact = environmental_impact;
    }


    /**
     * Gets the axle_information value for this DutchVehicleV2.
     * 
     * @return axle_information
     */
    public nl.webservices.www.soap.DutchVehicleAxle[] getAxle_information() {
        return axle_information;
    }


    /**
     * Sets the axle_information value for this DutchVehicleV2.
     * 
     * @param axle_information
     */
    public void setAxle_information(nl.webservices.www.soap.DutchVehicleAxle[] axle_information) {
        this.axle_information = axle_information;
    }


    /**
     * Gets the type_approval value for this DutchVehicleV2.
     * 
     * @return type_approval
     */
    public nl.webservices.www.soap.DutchVehicleTypeApproval getType_approval() {
        return type_approval;
    }


    /**
     * Sets the type_approval value for this DutchVehicleV2.
     * 
     * @param type_approval
     */
    public void setType_approval(nl.webservices.www.soap.DutchVehicleTypeApproval type_approval) {
        this.type_approval = type_approval;
    }


    /**
     * Gets the body_approval value for this DutchVehicleV2.
     * 
     * @return body_approval
     */
    public nl.webservices.www.soap.DutchVehicleBodyApproval[] getBody_approval() {
        return body_approval;
    }


    /**
     * Sets the body_approval value for this DutchVehicleV2.
     * 
     * @param body_approval
     */
    public void setBody_approval(nl.webservices.www.soap.DutchVehicleBodyApproval[] body_approval) {
        this.body_approval = body_approval;
    }


    /**
     * Gets the remark value for this DutchVehicleV2.
     * 
     * @return remark
     */
    public nl.webservices.www.soap.DutchVehicleRemark[] getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this DutchVehicleV2.
     * 
     * @param remark
     */
    public void setRemark(nl.webservices.www.soap.DutchVehicleRemark[] remark) {
        this.remark = remark;
    }


    /**
     * Gets the recall value for this DutchVehicleV2.
     * 
     * @return recall
     */
    public nl.webservices.www.soap.DutchVehicleRecall getRecall() {
        return recall;
    }


    /**
     * Sets the recall value for this DutchVehicleV2.
     * 
     * @param recall
     */
    public void setRecall(nl.webservices.www.soap.DutchVehicleRecall recall) {
        this.recall = recall;
    }


    /**
     * Gets the mileage value for this DutchVehicleV2.
     * 
     * @return mileage
     */
    public nl.webservices.www.soap.DutchVehicleMileage getMileage() {
        return mileage;
    }


    /**
     * Sets the mileage value for this DutchVehicleV2.
     * 
     * @param mileage
     */
    public void setMileage(nl.webservices.www.soap.DutchVehicleMileage mileage) {
        this.mileage = mileage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleV2)) return false;
        DutchVehicleV2 other = (DutchVehicleV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basic_data==null && other.getBasic_data()==null) || 
             (this.basic_data!=null &&
              this.basic_data.equals(other.getBasic_data()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.technical_weight==null && other.getTechnical_weight()==null) || 
             (this.technical_weight!=null &&
              this.technical_weight.equals(other.getTechnical_weight()))) &&
            ((this.engine==null && other.getEngine()==null) || 
             (this.engine!=null &&
              this.engine.equals(other.getEngine()))) &&
            ((this.environmental_impact==null && other.getEnvironmental_impact()==null) || 
             (this.environmental_impact!=null &&
              java.util.Arrays.equals(this.environmental_impact, other.getEnvironmental_impact()))) &&
            ((this.axle_information==null && other.getAxle_information()==null) || 
             (this.axle_information!=null &&
              java.util.Arrays.equals(this.axle_information, other.getAxle_information()))) &&
            ((this.type_approval==null && other.getType_approval()==null) || 
             (this.type_approval!=null &&
              this.type_approval.equals(other.getType_approval()))) &&
            ((this.body_approval==null && other.getBody_approval()==null) || 
             (this.body_approval!=null &&
              java.util.Arrays.equals(this.body_approval, other.getBody_approval()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              java.util.Arrays.equals(this.remark, other.getRemark()))) &&
            ((this.recall==null && other.getRecall()==null) || 
             (this.recall!=null &&
              this.recall.equals(other.getRecall()))) &&
            ((this.mileage==null && other.getMileage()==null) || 
             (this.mileage!=null &&
              this.mileage.equals(other.getMileage())));
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
        if (getBasic_data() != null) {
            _hashCode += getBasic_data().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getTechnical_weight() != null) {
            _hashCode += getTechnical_weight().hashCode();
        }
        if (getEngine() != null) {
            _hashCode += getEngine().hashCode();
        }
        if (getEnvironmental_impact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvironmental_impact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvironmental_impact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAxle_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAxle_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAxle_information(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType_approval() != null) {
            _hashCode += getType_approval().hashCode();
        }
        if (getBody_approval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBody_approval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBody_approval(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemark() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemark());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemark(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecall() != null) {
            _hashCode += getRecall().hashCode();
        }
        if (getMileage() != null) {
            _hashCode += getMileage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "basic_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleRegistration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleFeature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleTaxData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technical_weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "technical_weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleTechnicalWeight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "engine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleEngine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmental_impact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "environmental_impact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleEnvironment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axle_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "axle_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleAxle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_approval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_approval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleTypeApproval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_approval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_approval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleBodyApproval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleRemark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "recall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleRecall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleMileage"));
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
