/**
 * DutchVehiclePriceValuation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehiclePriceValuation  implements java.io.Serializable {
    private java.lang.String brand;

    private java.lang.String model;

    private java.lang.String type;

    private java.math.BigInteger retail;

    private java.math.BigInteger exchange;

    private java.math.BigInteger trade;

    private java.lang.String calculation_method;

    public DutchVehiclePriceValuation() {
    }

    public DutchVehiclePriceValuation(
           java.lang.String brand,
           java.lang.String model,
           java.lang.String type,
           java.math.BigInteger retail,
           java.math.BigInteger exchange,
           java.math.BigInteger trade,
           java.lang.String calculation_method) {
           this.brand = brand;
           this.model = model;
           this.type = type;
           this.retail = retail;
           this.exchange = exchange;
           this.trade = trade;
           this.calculation_method = calculation_method;
    }


    /**
     * Gets the brand value for this DutchVehiclePriceValuation.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this DutchVehiclePriceValuation.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the model value for this DutchVehiclePriceValuation.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this DutchVehiclePriceValuation.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the type value for this DutchVehiclePriceValuation.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DutchVehiclePriceValuation.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the retail value for this DutchVehiclePriceValuation.
     * 
     * @return retail
     */
    public java.math.BigInteger getRetail() {
        return retail;
    }


    /**
     * Sets the retail value for this DutchVehiclePriceValuation.
     * 
     * @param retail
     */
    public void setRetail(java.math.BigInteger retail) {
        this.retail = retail;
    }


    /**
     * Gets the exchange value for this DutchVehiclePriceValuation.
     * 
     * @return exchange
     */
    public java.math.BigInteger getExchange() {
        return exchange;
    }


    /**
     * Sets the exchange value for this DutchVehiclePriceValuation.
     * 
     * @param exchange
     */
    public void setExchange(java.math.BigInteger exchange) {
        this.exchange = exchange;
    }


    /**
     * Gets the trade value for this DutchVehiclePriceValuation.
     * 
     * @return trade
     */
    public java.math.BigInteger getTrade() {
        return trade;
    }


    /**
     * Sets the trade value for this DutchVehiclePriceValuation.
     * 
     * @param trade
     */
    public void setTrade(java.math.BigInteger trade) {
        this.trade = trade;
    }


    /**
     * Gets the calculation_method value for this DutchVehiclePriceValuation.
     * 
     * @return calculation_method
     */
    public java.lang.String getCalculation_method() {
        return calculation_method;
    }


    /**
     * Sets the calculation_method value for this DutchVehiclePriceValuation.
     * 
     * @param calculation_method
     */
    public void setCalculation_method(java.lang.String calculation_method) {
        this.calculation_method = calculation_method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehiclePriceValuation)) return false;
        DutchVehiclePriceValuation other = (DutchVehiclePriceValuation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.retail==null && other.getRetail()==null) || 
             (this.retail!=null &&
              this.retail.equals(other.getRetail()))) &&
            ((this.exchange==null && other.getExchange()==null) || 
             (this.exchange!=null &&
              this.exchange.equals(other.getExchange()))) &&
            ((this.trade==null && other.getTrade()==null) || 
             (this.trade!=null &&
              this.trade.equals(other.getTrade()))) &&
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
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRetail() != null) {
            _hashCode += getRetail().hashCode();
        }
        if (getExchange() != null) {
            _hashCode += getExchange().hashCode();
        }
        if (getTrade() != null) {
            _hashCode += getTrade().hashCode();
        }
        if (getCalculation_method() != null) {
            _hashCode += getCalculation_method().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehiclePriceValuation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePriceValuation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model"));
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
        elemField.setFieldName("retail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "retail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "exchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculation_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calculation_method"));
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
