/**
 * CreditsafeBeProtestedBill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeProtestedBill  implements java.io.Serializable {
    private java.lang.String drawee_name;

    private java.lang.String drawee_address;

    private java.math.BigDecimal bill_amount;

    private java.lang.String bill_currency;

    private java.math.BigDecimal maturity_of_bill_in_months;

    private java.util.Date payment_date;

    private java.lang.String name_of_drawer;

    private java.lang.String city_of_drawer;

    public CreditsafeBeProtestedBill() {
    }

    public CreditsafeBeProtestedBill(
           java.lang.String drawee_name,
           java.lang.String drawee_address,
           java.math.BigDecimal bill_amount,
           java.lang.String bill_currency,
           java.math.BigDecimal maturity_of_bill_in_months,
           java.util.Date payment_date,
           java.lang.String name_of_drawer,
           java.lang.String city_of_drawer) {
           this.drawee_name = drawee_name;
           this.drawee_address = drawee_address;
           this.bill_amount = bill_amount;
           this.bill_currency = bill_currency;
           this.maturity_of_bill_in_months = maturity_of_bill_in_months;
           this.payment_date = payment_date;
           this.name_of_drawer = name_of_drawer;
           this.city_of_drawer = city_of_drawer;
    }


    /**
     * Gets the drawee_name value for this CreditsafeBeProtestedBill.
     * 
     * @return drawee_name
     */
    public java.lang.String getDrawee_name() {
        return drawee_name;
    }


    /**
     * Sets the drawee_name value for this CreditsafeBeProtestedBill.
     * 
     * @param drawee_name
     */
    public void setDrawee_name(java.lang.String drawee_name) {
        this.drawee_name = drawee_name;
    }


    /**
     * Gets the drawee_address value for this CreditsafeBeProtestedBill.
     * 
     * @return drawee_address
     */
    public java.lang.String getDrawee_address() {
        return drawee_address;
    }


    /**
     * Sets the drawee_address value for this CreditsafeBeProtestedBill.
     * 
     * @param drawee_address
     */
    public void setDrawee_address(java.lang.String drawee_address) {
        this.drawee_address = drawee_address;
    }


    /**
     * Gets the bill_amount value for this CreditsafeBeProtestedBill.
     * 
     * @return bill_amount
     */
    public java.math.BigDecimal getBill_amount() {
        return bill_amount;
    }


    /**
     * Sets the bill_amount value for this CreditsafeBeProtestedBill.
     * 
     * @param bill_amount
     */
    public void setBill_amount(java.math.BigDecimal bill_amount) {
        this.bill_amount = bill_amount;
    }


    /**
     * Gets the bill_currency value for this CreditsafeBeProtestedBill.
     * 
     * @return bill_currency
     */
    public java.lang.String getBill_currency() {
        return bill_currency;
    }


    /**
     * Sets the bill_currency value for this CreditsafeBeProtestedBill.
     * 
     * @param bill_currency
     */
    public void setBill_currency(java.lang.String bill_currency) {
        this.bill_currency = bill_currency;
    }


    /**
     * Gets the maturity_of_bill_in_months value for this CreditsafeBeProtestedBill.
     * 
     * @return maturity_of_bill_in_months
     */
    public java.math.BigDecimal getMaturity_of_bill_in_months() {
        return maturity_of_bill_in_months;
    }


    /**
     * Sets the maturity_of_bill_in_months value for this CreditsafeBeProtestedBill.
     * 
     * @param maturity_of_bill_in_months
     */
    public void setMaturity_of_bill_in_months(java.math.BigDecimal maturity_of_bill_in_months) {
        this.maturity_of_bill_in_months = maturity_of_bill_in_months;
    }


    /**
     * Gets the payment_date value for this CreditsafeBeProtestedBill.
     * 
     * @return payment_date
     */
    public java.util.Date getPayment_date() {
        return payment_date;
    }


    /**
     * Sets the payment_date value for this CreditsafeBeProtestedBill.
     * 
     * @param payment_date
     */
    public void setPayment_date(java.util.Date payment_date) {
        this.payment_date = payment_date;
    }


    /**
     * Gets the name_of_drawer value for this CreditsafeBeProtestedBill.
     * 
     * @return name_of_drawer
     */
    public java.lang.String getName_of_drawer() {
        return name_of_drawer;
    }


    /**
     * Sets the name_of_drawer value for this CreditsafeBeProtestedBill.
     * 
     * @param name_of_drawer
     */
    public void setName_of_drawer(java.lang.String name_of_drawer) {
        this.name_of_drawer = name_of_drawer;
    }


    /**
     * Gets the city_of_drawer value for this CreditsafeBeProtestedBill.
     * 
     * @return city_of_drawer
     */
    public java.lang.String getCity_of_drawer() {
        return city_of_drawer;
    }


    /**
     * Sets the city_of_drawer value for this CreditsafeBeProtestedBill.
     * 
     * @param city_of_drawer
     */
    public void setCity_of_drawer(java.lang.String city_of_drawer) {
        this.city_of_drawer = city_of_drawer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeProtestedBill)) return false;
        CreditsafeBeProtestedBill other = (CreditsafeBeProtestedBill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.drawee_name==null && other.getDrawee_name()==null) || 
             (this.drawee_name!=null &&
              this.drawee_name.equals(other.getDrawee_name()))) &&
            ((this.drawee_address==null && other.getDrawee_address()==null) || 
             (this.drawee_address!=null &&
              this.drawee_address.equals(other.getDrawee_address()))) &&
            ((this.bill_amount==null && other.getBill_amount()==null) || 
             (this.bill_amount!=null &&
              this.bill_amount.equals(other.getBill_amount()))) &&
            ((this.bill_currency==null && other.getBill_currency()==null) || 
             (this.bill_currency!=null &&
              this.bill_currency.equals(other.getBill_currency()))) &&
            ((this.maturity_of_bill_in_months==null && other.getMaturity_of_bill_in_months()==null) || 
             (this.maturity_of_bill_in_months!=null &&
              this.maturity_of_bill_in_months.equals(other.getMaturity_of_bill_in_months()))) &&
            ((this.payment_date==null && other.getPayment_date()==null) || 
             (this.payment_date!=null &&
              this.payment_date.equals(other.getPayment_date()))) &&
            ((this.name_of_drawer==null && other.getName_of_drawer()==null) || 
             (this.name_of_drawer!=null &&
              this.name_of_drawer.equals(other.getName_of_drawer()))) &&
            ((this.city_of_drawer==null && other.getCity_of_drawer()==null) || 
             (this.city_of_drawer!=null &&
              this.city_of_drawer.equals(other.getCity_of_drawer())));
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
        if (getDrawee_name() != null) {
            _hashCode += getDrawee_name().hashCode();
        }
        if (getDrawee_address() != null) {
            _hashCode += getDrawee_address().hashCode();
        }
        if (getBill_amount() != null) {
            _hashCode += getBill_amount().hashCode();
        }
        if (getBill_currency() != null) {
            _hashCode += getBill_currency().hashCode();
        }
        if (getMaturity_of_bill_in_months() != null) {
            _hashCode += getMaturity_of_bill_in_months().hashCode();
        }
        if (getPayment_date() != null) {
            _hashCode += getPayment_date().hashCode();
        }
        if (getName_of_drawer() != null) {
            _hashCode += getName_of_drawer().hashCode();
        }
        if (getCity_of_drawer() != null) {
            _hashCode += getCity_of_drawer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBeProtestedBill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeProtestedBill"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawee_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "drawee_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawee_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "drawee_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bill_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bill_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maturity_of_bill_in_months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maturity_of_bill_in_months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_of_drawer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name_of_drawer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_of_drawer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city_of_drawer"));
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
