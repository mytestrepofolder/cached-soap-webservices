/**
 * CreditsafeLtdFinancialStatement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdFinancialStatement  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeProfitAndLossFigures profit_and_loss;

    private nl.webservices.www.soap.CreditsafeBalanceSheet balance_sheet;

    private nl.webservices.www.soap.CreditsafeOtherFinancials other_financials;

    private nl.webservices.www.soap.CreditsafeFinancialRatios ratios;

    public CreditsafeLtdFinancialStatement() {
    }

    public CreditsafeLtdFinancialStatement(
           nl.webservices.www.soap.CreditsafeProfitAndLossFigures profit_and_loss,
           nl.webservices.www.soap.CreditsafeBalanceSheet balance_sheet,
           nl.webservices.www.soap.CreditsafeOtherFinancials other_financials,
           nl.webservices.www.soap.CreditsafeFinancialRatios ratios) {
           this.profit_and_loss = profit_and_loss;
           this.balance_sheet = balance_sheet;
           this.other_financials = other_financials;
           this.ratios = ratios;
    }


    /**
     * Gets the profit_and_loss value for this CreditsafeLtdFinancialStatement.
     * 
     * @return profit_and_loss
     */
    public nl.webservices.www.soap.CreditsafeProfitAndLossFigures getProfit_and_loss() {
        return profit_and_loss;
    }


    /**
     * Sets the profit_and_loss value for this CreditsafeLtdFinancialStatement.
     * 
     * @param profit_and_loss
     */
    public void setProfit_and_loss(nl.webservices.www.soap.CreditsafeProfitAndLossFigures profit_and_loss) {
        this.profit_and_loss = profit_and_loss;
    }


    /**
     * Gets the balance_sheet value for this CreditsafeLtdFinancialStatement.
     * 
     * @return balance_sheet
     */
    public nl.webservices.www.soap.CreditsafeBalanceSheet getBalance_sheet() {
        return balance_sheet;
    }


    /**
     * Sets the balance_sheet value for this CreditsafeLtdFinancialStatement.
     * 
     * @param balance_sheet
     */
    public void setBalance_sheet(nl.webservices.www.soap.CreditsafeBalanceSheet balance_sheet) {
        this.balance_sheet = balance_sheet;
    }


    /**
     * Gets the other_financials value for this CreditsafeLtdFinancialStatement.
     * 
     * @return other_financials
     */
    public nl.webservices.www.soap.CreditsafeOtherFinancials getOther_financials() {
        return other_financials;
    }


    /**
     * Sets the other_financials value for this CreditsafeLtdFinancialStatement.
     * 
     * @param other_financials
     */
    public void setOther_financials(nl.webservices.www.soap.CreditsafeOtherFinancials other_financials) {
        this.other_financials = other_financials;
    }


    /**
     * Gets the ratios value for this CreditsafeLtdFinancialStatement.
     * 
     * @return ratios
     */
    public nl.webservices.www.soap.CreditsafeFinancialRatios getRatios() {
        return ratios;
    }


    /**
     * Sets the ratios value for this CreditsafeLtdFinancialStatement.
     * 
     * @param ratios
     */
    public void setRatios(nl.webservices.www.soap.CreditsafeFinancialRatios ratios) {
        this.ratios = ratios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdFinancialStatement)) return false;
        CreditsafeLtdFinancialStatement other = (CreditsafeLtdFinancialStatement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profit_and_loss==null && other.getProfit_and_loss()==null) || 
             (this.profit_and_loss!=null &&
              this.profit_and_loss.equals(other.getProfit_and_loss()))) &&
            ((this.balance_sheet==null && other.getBalance_sheet()==null) || 
             (this.balance_sheet!=null &&
              this.balance_sheet.equals(other.getBalance_sheet()))) &&
            ((this.other_financials==null && other.getOther_financials()==null) || 
             (this.other_financials!=null &&
              this.other_financials.equals(other.getOther_financials()))) &&
            ((this.ratios==null && other.getRatios()==null) || 
             (this.ratios!=null &&
              this.ratios.equals(other.getRatios())));
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
        if (getProfit_and_loss() != null) {
            _hashCode += getProfit_and_loss().hashCode();
        }
        if (getBalance_sheet() != null) {
            _hashCode += getBalance_sheet().hashCode();
        }
        if (getOther_financials() != null) {
            _hashCode += getOther_financials().hashCode();
        }
        if (getRatios() != null) {
            _hashCode += getRatios().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeLtdFinancialStatement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdFinancialStatement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit_and_loss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "profit_and_loss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeProfitAndLossFigures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_sheet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balance_sheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBalanceSheet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_financials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_financials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeOtherFinancials"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeFinancialRatios"));
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
