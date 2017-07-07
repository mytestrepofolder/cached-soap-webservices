/**
 * GCRBankAndInsurerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRBankAndInsurerData  implements java.io.Serializable {
    private org.apache.axis.types.Year financial_year;

    private java.lang.Integer month_end_financial_year;

    private java.lang.Integer day_end_financial_year;

    private java.lang.Integer length_financial_year_in_months;

    private java.lang.Boolean reliable;

    private java.lang.String account_code;

    private java.lang.String account_text;

    private nl.webservices.www.soap.GCRFiling filing;

    private org.apache.axis.types.Year financial_year_graydon;

    private java.lang.String currency_code;

    private java.lang.String scale_code;

    private java.lang.String scale_text;

    private java.util.Date date_of_drawing_up;

    private java.lang.String balance_sheet_code;

    private java.lang.String balance_sheet_text;

    private nl.webservices.www.soap.GCRBankAndInsurerKeyFigures bank_and_insurer_key_figures;

    private nl.webservices.www.soap.GCRRatio[] ratios;

    public GCRBankAndInsurerData() {
    }

    public GCRBankAndInsurerData(
           org.apache.axis.types.Year financial_year,
           java.lang.Integer month_end_financial_year,
           java.lang.Integer day_end_financial_year,
           java.lang.Integer length_financial_year_in_months,
           java.lang.Boolean reliable,
           java.lang.String account_code,
           java.lang.String account_text,
           nl.webservices.www.soap.GCRFiling filing,
           org.apache.axis.types.Year financial_year_graydon,
           java.lang.String currency_code,
           java.lang.String scale_code,
           java.lang.String scale_text,
           java.util.Date date_of_drawing_up,
           java.lang.String balance_sheet_code,
           java.lang.String balance_sheet_text,
           nl.webservices.www.soap.GCRBankAndInsurerKeyFigures bank_and_insurer_key_figures,
           nl.webservices.www.soap.GCRRatio[] ratios) {
           this.financial_year = financial_year;
           this.month_end_financial_year = month_end_financial_year;
           this.day_end_financial_year = day_end_financial_year;
           this.length_financial_year_in_months = length_financial_year_in_months;
           this.reliable = reliable;
           this.account_code = account_code;
           this.account_text = account_text;
           this.filing = filing;
           this.financial_year_graydon = financial_year_graydon;
           this.currency_code = currency_code;
           this.scale_code = scale_code;
           this.scale_text = scale_text;
           this.date_of_drawing_up = date_of_drawing_up;
           this.balance_sheet_code = balance_sheet_code;
           this.balance_sheet_text = balance_sheet_text;
           this.bank_and_insurer_key_figures = bank_and_insurer_key_figures;
           this.ratios = ratios;
    }


    /**
     * Gets the financial_year value for this GCRBankAndInsurerData.
     * 
     * @return financial_year
     */
    public org.apache.axis.types.Year getFinancial_year() {
        return financial_year;
    }


    /**
     * Sets the financial_year value for this GCRBankAndInsurerData.
     * 
     * @param financial_year
     */
    public void setFinancial_year(org.apache.axis.types.Year financial_year) {
        this.financial_year = financial_year;
    }


    /**
     * Gets the month_end_financial_year value for this GCRBankAndInsurerData.
     * 
     * @return month_end_financial_year
     */
    public java.lang.Integer getMonth_end_financial_year() {
        return month_end_financial_year;
    }


    /**
     * Sets the month_end_financial_year value for this GCRBankAndInsurerData.
     * 
     * @param month_end_financial_year
     */
    public void setMonth_end_financial_year(java.lang.Integer month_end_financial_year) {
        this.month_end_financial_year = month_end_financial_year;
    }


    /**
     * Gets the day_end_financial_year value for this GCRBankAndInsurerData.
     * 
     * @return day_end_financial_year
     */
    public java.lang.Integer getDay_end_financial_year() {
        return day_end_financial_year;
    }


    /**
     * Sets the day_end_financial_year value for this GCRBankAndInsurerData.
     * 
     * @param day_end_financial_year
     */
    public void setDay_end_financial_year(java.lang.Integer day_end_financial_year) {
        this.day_end_financial_year = day_end_financial_year;
    }


    /**
     * Gets the length_financial_year_in_months value for this GCRBankAndInsurerData.
     * 
     * @return length_financial_year_in_months
     */
    public java.lang.Integer getLength_financial_year_in_months() {
        return length_financial_year_in_months;
    }


    /**
     * Sets the length_financial_year_in_months value for this GCRBankAndInsurerData.
     * 
     * @param length_financial_year_in_months
     */
    public void setLength_financial_year_in_months(java.lang.Integer length_financial_year_in_months) {
        this.length_financial_year_in_months = length_financial_year_in_months;
    }


    /**
     * Gets the reliable value for this GCRBankAndInsurerData.
     * 
     * @return reliable
     */
    public java.lang.Boolean getReliable() {
        return reliable;
    }


    /**
     * Sets the reliable value for this GCRBankAndInsurerData.
     * 
     * @param reliable
     */
    public void setReliable(java.lang.Boolean reliable) {
        this.reliable = reliable;
    }


    /**
     * Gets the account_code value for this GCRBankAndInsurerData.
     * 
     * @return account_code
     */
    public java.lang.String getAccount_code() {
        return account_code;
    }


    /**
     * Sets the account_code value for this GCRBankAndInsurerData.
     * 
     * @param account_code
     */
    public void setAccount_code(java.lang.String account_code) {
        this.account_code = account_code;
    }


    /**
     * Gets the account_text value for this GCRBankAndInsurerData.
     * 
     * @return account_text
     */
    public java.lang.String getAccount_text() {
        return account_text;
    }


    /**
     * Sets the account_text value for this GCRBankAndInsurerData.
     * 
     * @param account_text
     */
    public void setAccount_text(java.lang.String account_text) {
        this.account_text = account_text;
    }


    /**
     * Gets the filing value for this GCRBankAndInsurerData.
     * 
     * @return filing
     */
    public nl.webservices.www.soap.GCRFiling getFiling() {
        return filing;
    }


    /**
     * Sets the filing value for this GCRBankAndInsurerData.
     * 
     * @param filing
     */
    public void setFiling(nl.webservices.www.soap.GCRFiling filing) {
        this.filing = filing;
    }


    /**
     * Gets the financial_year_graydon value for this GCRBankAndInsurerData.
     * 
     * @return financial_year_graydon
     */
    public org.apache.axis.types.Year getFinancial_year_graydon() {
        return financial_year_graydon;
    }


    /**
     * Sets the financial_year_graydon value for this GCRBankAndInsurerData.
     * 
     * @param financial_year_graydon
     */
    public void setFinancial_year_graydon(org.apache.axis.types.Year financial_year_graydon) {
        this.financial_year_graydon = financial_year_graydon;
    }


    /**
     * Gets the currency_code value for this GCRBankAndInsurerData.
     * 
     * @return currency_code
     */
    public java.lang.String getCurrency_code() {
        return currency_code;
    }


    /**
     * Sets the currency_code value for this GCRBankAndInsurerData.
     * 
     * @param currency_code
     */
    public void setCurrency_code(java.lang.String currency_code) {
        this.currency_code = currency_code;
    }


    /**
     * Gets the scale_code value for this GCRBankAndInsurerData.
     * 
     * @return scale_code
     */
    public java.lang.String getScale_code() {
        return scale_code;
    }


    /**
     * Sets the scale_code value for this GCRBankAndInsurerData.
     * 
     * @param scale_code
     */
    public void setScale_code(java.lang.String scale_code) {
        this.scale_code = scale_code;
    }


    /**
     * Gets the scale_text value for this GCRBankAndInsurerData.
     * 
     * @return scale_text
     */
    public java.lang.String getScale_text() {
        return scale_text;
    }


    /**
     * Sets the scale_text value for this GCRBankAndInsurerData.
     * 
     * @param scale_text
     */
    public void setScale_text(java.lang.String scale_text) {
        this.scale_text = scale_text;
    }


    /**
     * Gets the date_of_drawing_up value for this GCRBankAndInsurerData.
     * 
     * @return date_of_drawing_up
     */
    public java.util.Date getDate_of_drawing_up() {
        return date_of_drawing_up;
    }


    /**
     * Sets the date_of_drawing_up value for this GCRBankAndInsurerData.
     * 
     * @param date_of_drawing_up
     */
    public void setDate_of_drawing_up(java.util.Date date_of_drawing_up) {
        this.date_of_drawing_up = date_of_drawing_up;
    }


    /**
     * Gets the balance_sheet_code value for this GCRBankAndInsurerData.
     * 
     * @return balance_sheet_code
     */
    public java.lang.String getBalance_sheet_code() {
        return balance_sheet_code;
    }


    /**
     * Sets the balance_sheet_code value for this GCRBankAndInsurerData.
     * 
     * @param balance_sheet_code
     */
    public void setBalance_sheet_code(java.lang.String balance_sheet_code) {
        this.balance_sheet_code = balance_sheet_code;
    }


    /**
     * Gets the balance_sheet_text value for this GCRBankAndInsurerData.
     * 
     * @return balance_sheet_text
     */
    public java.lang.String getBalance_sheet_text() {
        return balance_sheet_text;
    }


    /**
     * Sets the balance_sheet_text value for this GCRBankAndInsurerData.
     * 
     * @param balance_sheet_text
     */
    public void setBalance_sheet_text(java.lang.String balance_sheet_text) {
        this.balance_sheet_text = balance_sheet_text;
    }


    /**
     * Gets the bank_and_insurer_key_figures value for this GCRBankAndInsurerData.
     * 
     * @return bank_and_insurer_key_figures
     */
    public nl.webservices.www.soap.GCRBankAndInsurerKeyFigures getBank_and_insurer_key_figures() {
        return bank_and_insurer_key_figures;
    }


    /**
     * Sets the bank_and_insurer_key_figures value for this GCRBankAndInsurerData.
     * 
     * @param bank_and_insurer_key_figures
     */
    public void setBank_and_insurer_key_figures(nl.webservices.www.soap.GCRBankAndInsurerKeyFigures bank_and_insurer_key_figures) {
        this.bank_and_insurer_key_figures = bank_and_insurer_key_figures;
    }


    /**
     * Gets the ratios value for this GCRBankAndInsurerData.
     * 
     * @return ratios
     */
    public nl.webservices.www.soap.GCRRatio[] getRatios() {
        return ratios;
    }


    /**
     * Sets the ratios value for this GCRBankAndInsurerData.
     * 
     * @param ratios
     */
    public void setRatios(nl.webservices.www.soap.GCRRatio[] ratios) {
        this.ratios = ratios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRBankAndInsurerData)) return false;
        GCRBankAndInsurerData other = (GCRBankAndInsurerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.financial_year==null && other.getFinancial_year()==null) || 
             (this.financial_year!=null &&
              this.financial_year.equals(other.getFinancial_year()))) &&
            ((this.month_end_financial_year==null && other.getMonth_end_financial_year()==null) || 
             (this.month_end_financial_year!=null &&
              this.month_end_financial_year.equals(other.getMonth_end_financial_year()))) &&
            ((this.day_end_financial_year==null && other.getDay_end_financial_year()==null) || 
             (this.day_end_financial_year!=null &&
              this.day_end_financial_year.equals(other.getDay_end_financial_year()))) &&
            ((this.length_financial_year_in_months==null && other.getLength_financial_year_in_months()==null) || 
             (this.length_financial_year_in_months!=null &&
              this.length_financial_year_in_months.equals(other.getLength_financial_year_in_months()))) &&
            ((this.reliable==null && other.getReliable()==null) || 
             (this.reliable!=null &&
              this.reliable.equals(other.getReliable()))) &&
            ((this.account_code==null && other.getAccount_code()==null) || 
             (this.account_code!=null &&
              this.account_code.equals(other.getAccount_code()))) &&
            ((this.account_text==null && other.getAccount_text()==null) || 
             (this.account_text!=null &&
              this.account_text.equals(other.getAccount_text()))) &&
            ((this.filing==null && other.getFiling()==null) || 
             (this.filing!=null &&
              this.filing.equals(other.getFiling()))) &&
            ((this.financial_year_graydon==null && other.getFinancial_year_graydon()==null) || 
             (this.financial_year_graydon!=null &&
              this.financial_year_graydon.equals(other.getFinancial_year_graydon()))) &&
            ((this.currency_code==null && other.getCurrency_code()==null) || 
             (this.currency_code!=null &&
              this.currency_code.equals(other.getCurrency_code()))) &&
            ((this.scale_code==null && other.getScale_code()==null) || 
             (this.scale_code!=null &&
              this.scale_code.equals(other.getScale_code()))) &&
            ((this.scale_text==null && other.getScale_text()==null) || 
             (this.scale_text!=null &&
              this.scale_text.equals(other.getScale_text()))) &&
            ((this.date_of_drawing_up==null && other.getDate_of_drawing_up()==null) || 
             (this.date_of_drawing_up!=null &&
              this.date_of_drawing_up.equals(other.getDate_of_drawing_up()))) &&
            ((this.balance_sheet_code==null && other.getBalance_sheet_code()==null) || 
             (this.balance_sheet_code!=null &&
              this.balance_sheet_code.equals(other.getBalance_sheet_code()))) &&
            ((this.balance_sheet_text==null && other.getBalance_sheet_text()==null) || 
             (this.balance_sheet_text!=null &&
              this.balance_sheet_text.equals(other.getBalance_sheet_text()))) &&
            ((this.bank_and_insurer_key_figures==null && other.getBank_and_insurer_key_figures()==null) || 
             (this.bank_and_insurer_key_figures!=null &&
              this.bank_and_insurer_key_figures.equals(other.getBank_and_insurer_key_figures()))) &&
            ((this.ratios==null && other.getRatios()==null) || 
             (this.ratios!=null &&
              java.util.Arrays.equals(this.ratios, other.getRatios())));
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
        if (getFinancial_year() != null) {
            _hashCode += getFinancial_year().hashCode();
        }
        if (getMonth_end_financial_year() != null) {
            _hashCode += getMonth_end_financial_year().hashCode();
        }
        if (getDay_end_financial_year() != null) {
            _hashCode += getDay_end_financial_year().hashCode();
        }
        if (getLength_financial_year_in_months() != null) {
            _hashCode += getLength_financial_year_in_months().hashCode();
        }
        if (getReliable() != null) {
            _hashCode += getReliable().hashCode();
        }
        if (getAccount_code() != null) {
            _hashCode += getAccount_code().hashCode();
        }
        if (getAccount_text() != null) {
            _hashCode += getAccount_text().hashCode();
        }
        if (getFiling() != null) {
            _hashCode += getFiling().hashCode();
        }
        if (getFinancial_year_graydon() != null) {
            _hashCode += getFinancial_year_graydon().hashCode();
        }
        if (getCurrency_code() != null) {
            _hashCode += getCurrency_code().hashCode();
        }
        if (getScale_code() != null) {
            _hashCode += getScale_code().hashCode();
        }
        if (getScale_text() != null) {
            _hashCode += getScale_text().hashCode();
        }
        if (getDate_of_drawing_up() != null) {
            _hashCode += getDate_of_drawing_up().hashCode();
        }
        if (getBalance_sheet_code() != null) {
            _hashCode += getBalance_sheet_code().hashCode();
        }
        if (getBalance_sheet_text() != null) {
            _hashCode += getBalance_sheet_text().hashCode();
        }
        if (getBank_and_insurer_key_figures() != null) {
            _hashCode += getBank_and_insurer_key_figures().hashCode();
        }
        if (getRatios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatios(), i);
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
        new org.apache.axis.description.TypeDesc(GCRBankAndInsurerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBankAndInsurerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month_end_financial_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "month_end_financial_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day_end_financial_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "day_end_financial_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length_financial_year_in_months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "length_financial_year_in_months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reliable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reliable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "account_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "account_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "filing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFiling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_year_graydon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_year_graydon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currency_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "scale_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "scale_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_drawing_up");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_drawing_up"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_sheet_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balance_sheet_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_sheet_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balance_sheet_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_and_insurer_key_figures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bank_and_insurer_key_figures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBankAndInsurerKeyFigures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRatio"));
        elemField.setMinOccurs(0);
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
