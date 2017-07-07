/**
 * DutchVehiclePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehiclePrice  implements java.io.Serializable {
    private java.math.BigDecimal purchase_price;

    private java.math.BigDecimal vehicle_purchase_tax;

    private java.math.BigDecimal value_added_tax;

    private java.math.BigDecimal net_purchase_price;

    private java.lang.String calculation_method;

    public DutchVehiclePrice() {
    }

    public DutchVehiclePrice(
           java.math.BigDecimal purchase_price,
           java.math.BigDecimal vehicle_purchase_tax,
           java.math.BigDecimal value_added_tax,
           java.math.BigDecimal net_purchase_price,
           java.lang.String calculation_method) {
           this.purchase_price = purchase_price;
           this.vehicle_purchase_tax = vehicle_purchase_tax;
           this.value_added_tax = value_added_tax;
           this.net_purchase_price = net_purchase_price;
           this.calculation_method = calculation_method;
    }


    /**
     * Gets the purchase_price value for this DutchVehiclePrice.
     * 
     * @return purchase_price
     */
    public java.math.BigDecimal getPurchase_price() {
        return purchase_price;
    }


    /**
     * Sets the purchase_price value for this DutchVehiclePrice.
     * 
     * @param purchase_price
     */
    public void setPurchase_price(java.math.BigDecimal purchase_price) {
        this.purchase_price = purchase_price;
    }


    /**
     * Gets the vehicle_purchase_tax value for this DutchVehiclePrice.
     * 
     * @return vehicle_purchase_tax
     */
    public java.math.BigDecimal getVehicle_purchase_tax() {
        return vehicle_purchase_tax;
    }


    /**
     * Sets the vehicle_purchase_tax value for this DutchVehiclePrice.
     * 
     * @param vehicle_purchase_tax
     */
    public void setVehicle_purchase_tax(java.math.BigDecimal vehicle_purchase_tax) {
        this.vehicle_purchase_tax = vehicle_purchase_tax;
    }


    /**
     * Gets the value_added_tax value for this DutchVehiclePrice.
     * 
     * @return value_added_tax
     */
    public java.math.BigDecimal getValue_added_tax() {
        return value_added_tax;
    }


    /**
     * Sets the value_added_tax value for this DutchVehiclePrice.
     * 
     * @param value_added_tax
     */
    public void setValue_added_tax(java.math.BigDecimal value_added_tax) {
        this.value_added_tax = value_added_tax;
    }


    /**
     * Gets the net_purchase_price value for this DutchVehiclePrice.
     * 
     * @return net_purchase_price
     */
    public java.math.BigDecimal getNet_purchase_price() {
        return net_purchase_price;
    }


    /**
     * Sets the net_purchase_price value for this DutchVehiclePrice.
     * 
     * @param net_purchase_price
     */
    public void setNet_purchase_price(java.math.BigDecimal net_purchase_price) {
        this.net_purchase_price = net_purchase_price;
    }


    /**
     * Gets the calculation_method value for this DutchVehiclePrice.
     * 
     * @return calculation_method
     */
    public java.lang.String getCalculation_method() {
        return calculation_method;
    }


    /**
     * Sets the calculation_method value for this DutchVehiclePrice.
     * 
     * @param calculation_method
     */
    public void setCalculation_method(java.lang.String calculation_method) {
        this.calculation_method = calculation_method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehiclePrice)) return false;
        DutchVehiclePrice other = (DutchVehiclePrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchase_price==null && other.getPurchase_price()==null) || 
             (this.purchase_price!=null &&
              this.purchase_price.equals(other.getPurchase_price()))) &&
            ((this.vehicle_purchase_tax==null && other.getVehicle_purchase_tax()==null) || 
             (this.vehicle_purchase_tax!=null &&
              this.vehicle_purchase_tax.equals(other.getVehicle_purchase_tax()))) &&
            ((this.value_added_tax==null && other.getValue_added_tax()==null) || 
             (this.value_added_tax!=null &&
              this.value_added_tax.equals(other.getValue_added_tax()))) &&
            ((this.net_purchase_price==null && other.getNet_purchase_price()==null) || 
             (this.net_purchase_price!=null &&
              this.net_purchase_price.equals(other.getNet_purchase_price()))) &&
            ((this.calculation_method==null && other.getCalculation_method()==null) || 
             (this.calculation_method!=null &&
              this.calculation_method.equals(other.getCalculation_method())));
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
        if (getPurchase_price() != null) {
            _hashCode += getPurchase_price().hashCode();
        }
        if (getVehicle_purchase_tax() != null) {
            _hashCode += getVehicle_purchase_tax().hashCode();
        }
        if (getValue_added_tax() != null) {
            _hashCode += getValue_added_tax().hashCode();
        }
        if (getNet_purchase_price() != null) {
            _hashCode += getNet_purchase_price().hashCode();
        }
        if (getCalculation_method() != null) {
            _hashCode += getCalculation_method().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehiclePrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "purchase_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle_purchase_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vehicle_purchase_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_added_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "value_added_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_purchase_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_purchase_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculation_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calculation_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
