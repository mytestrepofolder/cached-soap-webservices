/**
 * CarATDValuation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarATDValuation  implements java.io.Serializable {
    private int type_id;

    private int price_retail;

    private int price_exchange;

    private int price_trade;

    private java.lang.String[] type_names;

    public CarATDValuation() {
    }

    public CarATDValuation(
           int type_id,
           int price_retail,
           int price_exchange,
           int price_trade,
           java.lang.String[] type_names) {
           this.type_id = type_id;
           this.price_retail = price_retail;
           this.price_exchange = price_exchange;
           this.price_trade = price_trade;
           this.type_names = type_names;
    }


    /**
     * Gets the type_id value for this CarATDValuation.
     * 
     * @return type_id
     */
    public int getType_id() {
        return type_id;
    }


    /**
     * Sets the type_id value for this CarATDValuation.
     * 
     * @param type_id
     */
    public void setType_id(int type_id) {
        this.type_id = type_id;
    }


    /**
     * Gets the price_retail value for this CarATDValuation.
     * 
     * @return price_retail
     */
    public int getPrice_retail() {
        return price_retail;
    }


    /**
     * Sets the price_retail value for this CarATDValuation.
     * 
     * @param price_retail
     */
    public void setPrice_retail(int price_retail) {
        this.price_retail = price_retail;
    }


    /**
     * Gets the price_exchange value for this CarATDValuation.
     * 
     * @return price_exchange
     */
    public int getPrice_exchange() {
        return price_exchange;
    }


    /**
     * Sets the price_exchange value for this CarATDValuation.
     * 
     * @param price_exchange
     */
    public void setPrice_exchange(int price_exchange) {
        this.price_exchange = price_exchange;
    }


    /**
     * Gets the price_trade value for this CarATDValuation.
     * 
     * @return price_trade
     */
    public int getPrice_trade() {
        return price_trade;
    }


    /**
     * Sets the price_trade value for this CarATDValuation.
     * 
     * @param price_trade
     */
    public void setPrice_trade(int price_trade) {
        this.price_trade = price_trade;
    }


    /**
     * Gets the type_names value for this CarATDValuation.
     * 
     * @return type_names
     */
    public java.lang.String[] getType_names() {
        return type_names;
    }


    /**
     * Sets the type_names value for this CarATDValuation.
     * 
     * @param type_names
     */
    public void setType_names(java.lang.String[] type_names) {
        this.type_names = type_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarATDValuation)) return false;
        CarATDValuation other = (CarATDValuation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.type_id == other.getType_id() &&
            this.price_retail == other.getPrice_retail() &&
            this.price_exchange == other.getPrice_exchange() &&
            this.price_trade == other.getPrice_trade() &&
            ((this.type_names==null && other.getType_names()==null) || 
             (this.type_names!=null &&
              java.util.Arrays.equals(this.type_names, other.getType_names())));
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
        _hashCode += getType_id();
        _hashCode += getPrice_retail();
        _hashCode += getPrice_exchange();
        _hashCode += getPrice_trade();
        if (getType_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType_names(), i);
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
        new org.apache.axis.description.TypeDesc(CarATDValuation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarATDValuation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_retail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price_retail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_exchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price_exchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_trade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price_trade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
