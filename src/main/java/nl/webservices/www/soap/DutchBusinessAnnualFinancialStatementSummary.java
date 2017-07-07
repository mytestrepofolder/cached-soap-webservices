/**
 * DutchBusinessAnnualFinancialStatementSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessAnnualFinancialStatementSummary  implements java.io.Serializable {
    private java.lang.Integer year;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 turnover;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 profit;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 assets;

    public DutchBusinessAnnualFinancialStatementSummary() {
    }

    public DutchBusinessAnnualFinancialStatementSummary(
           java.lang.Integer year,
           nl.webservices.www.soap.DutchBusinessMoneyV2 turnover,
           nl.webservices.www.soap.DutchBusinessMoneyV2 profit,
           nl.webservices.www.soap.DutchBusinessMoneyV2 assets) {
           this.year = year;
           this.turnover = turnover;
           this.profit = profit;
           this.assets = assets;
    }


    /**
     * Gets the year value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @return year
     */
    public java.lang.Integer getYear() {
        return year;
    }


    /**
     * Sets the year value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @param year
     */
    public void setYear(java.lang.Integer year) {
        this.year = year;
    }


    /**
     * Gets the turnover value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @return turnover
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getTurnover() {
        return turnover;
    }


    /**
     * Sets the turnover value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @param turnover
     */
    public void setTurnover(nl.webservices.www.soap.DutchBusinessMoneyV2 turnover) {
        this.turnover = turnover;
    }


    /**
     * Gets the profit value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @return profit
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @param profit
     */
    public void setProfit(nl.webservices.www.soap.DutchBusinessMoneyV2 profit) {
        this.profit = profit;
    }


    /**
     * Gets the assets value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @return assets
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getAssets() {
        return assets;
    }


    /**
     * Sets the assets value for this DutchBusinessAnnualFinancialStatementSummary.
     * 
     * @param assets
     */
    public void setAssets(nl.webservices.www.soap.DutchBusinessMoneyV2 assets) {
        this.assets = assets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessAnnualFinancialStatementSummary)) return false;
        DutchBusinessAnnualFinancialStatementSummary other = (DutchBusinessAnnualFinancialStatementSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.turnover==null && other.getTurnover()==null) || 
             (this.turnover!=null &&
              this.turnover.equals(other.getTurnover()))) &&
            ((this.profit==null && other.getProfit()==null) || 
             (this.profit!=null &&
              this.profit.equals(other.getProfit()))) &&
            ((this.assets==null && other.getAssets()==null) || 
             (this.assets!=null &&
              this.assets.equals(other.getAssets())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getTurnover() != null) {
            _hashCode += getTurnover().hashCode();
        }
        if (getProfit() != null) {
            _hashCode += getProfit().hashCode();
        }
        if (getAssets() != null) {
            _hashCode += getAssets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessAnnualFinancialStatementSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAnnualFinancialStatementSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turnover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "turnover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
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
