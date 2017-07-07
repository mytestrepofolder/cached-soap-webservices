/**
 * CreditsafeProfitAndLossFigures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeProfitAndLossFigures  implements java.io.Serializable {
    private java.util.Calendar year_end_date;

    private org.apache.axis.types.UnsignedInt number_of_weeks;

    private java.lang.String currency;

    private java.lang.Boolean consolidated_accounts;

    private java.math.BigDecimal revenue;

    private java.math.BigDecimal operating_costs;

    private java.math.BigDecimal operating_profit;

    private java.math.BigDecimal wages_and_salaries;

    private java.math.BigDecimal pension_costs;

    private java.math.BigDecimal depreciation;

    private java.math.BigDecimal amortisation;

    private java.math.BigDecimal financial_income;

    private java.math.BigDecimal financial_expenses;

    private java.math.BigDecimal extraordinary_income;

    private java.math.BigDecimal extraordinary_costs;

    private java.math.BigDecimal profit_before_tax;

    private java.math.BigDecimal tax;

    private java.math.BigDecimal profit_after_tax;

    private java.math.BigDecimal dividends;

    private java.math.BigDecimal minority_interests;

    private java.math.BigDecimal other_appropriations;

    private java.math.BigDecimal retained_profit;

    public CreditsafeProfitAndLossFigures() {
    }

    public CreditsafeProfitAndLossFigures(
           java.util.Calendar year_end_date,
           org.apache.axis.types.UnsignedInt number_of_weeks,
           java.lang.String currency,
           java.lang.Boolean consolidated_accounts,
           java.math.BigDecimal revenue,
           java.math.BigDecimal operating_costs,
           java.math.BigDecimal operating_profit,
           java.math.BigDecimal wages_and_salaries,
           java.math.BigDecimal pension_costs,
           java.math.BigDecimal depreciation,
           java.math.BigDecimal amortisation,
           java.math.BigDecimal financial_income,
           java.math.BigDecimal financial_expenses,
           java.math.BigDecimal extraordinary_income,
           java.math.BigDecimal extraordinary_costs,
           java.math.BigDecimal profit_before_tax,
           java.math.BigDecimal tax,
           java.math.BigDecimal profit_after_tax,
           java.math.BigDecimal dividends,
           java.math.BigDecimal minority_interests,
           java.math.BigDecimal other_appropriations,
           java.math.BigDecimal retained_profit) {
           this.year_end_date = year_end_date;
           this.number_of_weeks = number_of_weeks;
           this.currency = currency;
           this.consolidated_accounts = consolidated_accounts;
           this.revenue = revenue;
           this.operating_costs = operating_costs;
           this.operating_profit = operating_profit;
           this.wages_and_salaries = wages_and_salaries;
           this.pension_costs = pension_costs;
           this.depreciation = depreciation;
           this.amortisation = amortisation;
           this.financial_income = financial_income;
           this.financial_expenses = financial_expenses;
           this.extraordinary_income = extraordinary_income;
           this.extraordinary_costs = extraordinary_costs;
           this.profit_before_tax = profit_before_tax;
           this.tax = tax;
           this.profit_after_tax = profit_after_tax;
           this.dividends = dividends;
           this.minority_interests = minority_interests;
           this.other_appropriations = other_appropriations;
           this.retained_profit = retained_profit;
    }


    /**
     * Gets the year_end_date value for this CreditsafeProfitAndLossFigures.
     * 
     * @return year_end_date
     */
    public java.util.Calendar getYear_end_date() {
        return year_end_date;
    }


    /**
     * Sets the year_end_date value for this CreditsafeProfitAndLossFigures.
     * 
     * @param year_end_date
     */
    public void setYear_end_date(java.util.Calendar year_end_date) {
        this.year_end_date = year_end_date;
    }


    /**
     * Gets the number_of_weeks value for this CreditsafeProfitAndLossFigures.
     * 
     * @return number_of_weeks
     */
    public org.apache.axis.types.UnsignedInt getNumber_of_weeks() {
        return number_of_weeks;
    }


    /**
     * Sets the number_of_weeks value for this CreditsafeProfitAndLossFigures.
     * 
     * @param number_of_weeks
     */
    public void setNumber_of_weeks(org.apache.axis.types.UnsignedInt number_of_weeks) {
        this.number_of_weeks = number_of_weeks;
    }


    /**
     * Gets the currency value for this CreditsafeProfitAndLossFigures.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CreditsafeProfitAndLossFigures.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the consolidated_accounts value for this CreditsafeProfitAndLossFigures.
     * 
     * @return consolidated_accounts
     */
    public java.lang.Boolean getConsolidated_accounts() {
        return consolidated_accounts;
    }


    /**
     * Sets the consolidated_accounts value for this CreditsafeProfitAndLossFigures.
     * 
     * @param consolidated_accounts
     */
    public void setConsolidated_accounts(java.lang.Boolean consolidated_accounts) {
        this.consolidated_accounts = consolidated_accounts;
    }


    /**
     * Gets the revenue value for this CreditsafeProfitAndLossFigures.
     * 
     * @return revenue
     */
    public java.math.BigDecimal getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this CreditsafeProfitAndLossFigures.
     * 
     * @param revenue
     */
    public void setRevenue(java.math.BigDecimal revenue) {
        this.revenue = revenue;
    }


    /**
     * Gets the operating_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @return operating_costs
     */
    public java.math.BigDecimal getOperating_costs() {
        return operating_costs;
    }


    /**
     * Sets the operating_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @param operating_costs
     */
    public void setOperating_costs(java.math.BigDecimal operating_costs) {
        this.operating_costs = operating_costs;
    }


    /**
     * Gets the operating_profit value for this CreditsafeProfitAndLossFigures.
     * 
     * @return operating_profit
     */
    public java.math.BigDecimal getOperating_profit() {
        return operating_profit;
    }


    /**
     * Sets the operating_profit value for this CreditsafeProfitAndLossFigures.
     * 
     * @param operating_profit
     */
    public void setOperating_profit(java.math.BigDecimal operating_profit) {
        this.operating_profit = operating_profit;
    }


    /**
     * Gets the wages_and_salaries value for this CreditsafeProfitAndLossFigures.
     * 
     * @return wages_and_salaries
     */
    public java.math.BigDecimal getWages_and_salaries() {
        return wages_and_salaries;
    }


    /**
     * Sets the wages_and_salaries value for this CreditsafeProfitAndLossFigures.
     * 
     * @param wages_and_salaries
     */
    public void setWages_and_salaries(java.math.BigDecimal wages_and_salaries) {
        this.wages_and_salaries = wages_and_salaries;
    }


    /**
     * Gets the pension_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @return pension_costs
     */
    public java.math.BigDecimal getPension_costs() {
        return pension_costs;
    }


    /**
     * Sets the pension_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @param pension_costs
     */
    public void setPension_costs(java.math.BigDecimal pension_costs) {
        this.pension_costs = pension_costs;
    }


    /**
     * Gets the depreciation value for this CreditsafeProfitAndLossFigures.
     * 
     * @return depreciation
     */
    public java.math.BigDecimal getDepreciation() {
        return depreciation;
    }


    /**
     * Sets the depreciation value for this CreditsafeProfitAndLossFigures.
     * 
     * @param depreciation
     */
    public void setDepreciation(java.math.BigDecimal depreciation) {
        this.depreciation = depreciation;
    }


    /**
     * Gets the amortisation value for this CreditsafeProfitAndLossFigures.
     * 
     * @return amortisation
     */
    public java.math.BigDecimal getAmortisation() {
        return amortisation;
    }


    /**
     * Sets the amortisation value for this CreditsafeProfitAndLossFigures.
     * 
     * @param amortisation
     */
    public void setAmortisation(java.math.BigDecimal amortisation) {
        this.amortisation = amortisation;
    }


    /**
     * Gets the financial_income value for this CreditsafeProfitAndLossFigures.
     * 
     * @return financial_income
     */
    public java.math.BigDecimal getFinancial_income() {
        return financial_income;
    }


    /**
     * Sets the financial_income value for this CreditsafeProfitAndLossFigures.
     * 
     * @param financial_income
     */
    public void setFinancial_income(java.math.BigDecimal financial_income) {
        this.financial_income = financial_income;
    }


    /**
     * Gets the financial_expenses value for this CreditsafeProfitAndLossFigures.
     * 
     * @return financial_expenses
     */
    public java.math.BigDecimal getFinancial_expenses() {
        return financial_expenses;
    }


    /**
     * Sets the financial_expenses value for this CreditsafeProfitAndLossFigures.
     * 
     * @param financial_expenses
     */
    public void setFinancial_expenses(java.math.BigDecimal financial_expenses) {
        this.financial_expenses = financial_expenses;
    }


    /**
     * Gets the extraordinary_income value for this CreditsafeProfitAndLossFigures.
     * 
     * @return extraordinary_income
     */
    public java.math.BigDecimal getExtraordinary_income() {
        return extraordinary_income;
    }


    /**
     * Sets the extraordinary_income value for this CreditsafeProfitAndLossFigures.
     * 
     * @param extraordinary_income
     */
    public void setExtraordinary_income(java.math.BigDecimal extraordinary_income) {
        this.extraordinary_income = extraordinary_income;
    }


    /**
     * Gets the extraordinary_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @return extraordinary_costs
     */
    public java.math.BigDecimal getExtraordinary_costs() {
        return extraordinary_costs;
    }


    /**
     * Sets the extraordinary_costs value for this CreditsafeProfitAndLossFigures.
     * 
     * @param extraordinary_costs
     */
    public void setExtraordinary_costs(java.math.BigDecimal extraordinary_costs) {
        this.extraordinary_costs = extraordinary_costs;
    }


    /**
     * Gets the profit_before_tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @return profit_before_tax
     */
    public java.math.BigDecimal getProfit_before_tax() {
        return profit_before_tax;
    }


    /**
     * Sets the profit_before_tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @param profit_before_tax
     */
    public void setProfit_before_tax(java.math.BigDecimal profit_before_tax) {
        this.profit_before_tax = profit_before_tax;
    }


    /**
     * Gets the tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @return tax
     */
    public java.math.BigDecimal getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @param tax
     */
    public void setTax(java.math.BigDecimal tax) {
        this.tax = tax;
    }


    /**
     * Gets the profit_after_tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @return profit_after_tax
     */
    public java.math.BigDecimal getProfit_after_tax() {
        return profit_after_tax;
    }


    /**
     * Sets the profit_after_tax value for this CreditsafeProfitAndLossFigures.
     * 
     * @param profit_after_tax
     */
    public void setProfit_after_tax(java.math.BigDecimal profit_after_tax) {
        this.profit_after_tax = profit_after_tax;
    }


    /**
     * Gets the dividends value for this CreditsafeProfitAndLossFigures.
     * 
     * @return dividends
     */
    public java.math.BigDecimal getDividends() {
        return dividends;
    }


    /**
     * Sets the dividends value for this CreditsafeProfitAndLossFigures.
     * 
     * @param dividends
     */
    public void setDividends(java.math.BigDecimal dividends) {
        this.dividends = dividends;
    }


    /**
     * Gets the minority_interests value for this CreditsafeProfitAndLossFigures.
     * 
     * @return minority_interests
     */
    public java.math.BigDecimal getMinority_interests() {
        return minority_interests;
    }


    /**
     * Sets the minority_interests value for this CreditsafeProfitAndLossFigures.
     * 
     * @param minority_interests
     */
    public void setMinority_interests(java.math.BigDecimal minority_interests) {
        this.minority_interests = minority_interests;
    }


    /**
     * Gets the other_appropriations value for this CreditsafeProfitAndLossFigures.
     * 
     * @return other_appropriations
     */
    public java.math.BigDecimal getOther_appropriations() {
        return other_appropriations;
    }


    /**
     * Sets the other_appropriations value for this CreditsafeProfitAndLossFigures.
     * 
     * @param other_appropriations
     */
    public void setOther_appropriations(java.math.BigDecimal other_appropriations) {
        this.other_appropriations = other_appropriations;
    }


    /**
     * Gets the retained_profit value for this CreditsafeProfitAndLossFigures.
     * 
     * @return retained_profit
     */
    public java.math.BigDecimal getRetained_profit() {
        return retained_profit;
    }


    /**
     * Sets the retained_profit value for this CreditsafeProfitAndLossFigures.
     * 
     * @param retained_profit
     */
    public void setRetained_profit(java.math.BigDecimal retained_profit) {
        this.retained_profit = retained_profit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeProfitAndLossFigures)) return false;
        CreditsafeProfitAndLossFigures other = (CreditsafeProfitAndLossFigures) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year_end_date==null && other.getYear_end_date()==null) || 
             (this.year_end_date!=null &&
              this.year_end_date.equals(other.getYear_end_date()))) &&
            ((this.number_of_weeks==null && other.getNumber_of_weeks()==null) || 
             (this.number_of_weeks!=null &&
              this.number_of_weeks.equals(other.getNumber_of_weeks()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.consolidated_accounts==null && other.getConsolidated_accounts()==null) || 
             (this.consolidated_accounts!=null &&
              this.consolidated_accounts.equals(other.getConsolidated_accounts()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              this.revenue.equals(other.getRevenue()))) &&
            ((this.operating_costs==null && other.getOperating_costs()==null) || 
             (this.operating_costs!=null &&
              this.operating_costs.equals(other.getOperating_costs()))) &&
            ((this.operating_profit==null && other.getOperating_profit()==null) || 
             (this.operating_profit!=null &&
              this.operating_profit.equals(other.getOperating_profit()))) &&
            ((this.wages_and_salaries==null && other.getWages_and_salaries()==null) || 
             (this.wages_and_salaries!=null &&
              this.wages_and_salaries.equals(other.getWages_and_salaries()))) &&
            ((this.pension_costs==null && other.getPension_costs()==null) || 
             (this.pension_costs!=null &&
              this.pension_costs.equals(other.getPension_costs()))) &&
            ((this.depreciation==null && other.getDepreciation()==null) || 
             (this.depreciation!=null &&
              this.depreciation.equals(other.getDepreciation()))) &&
            ((this.amortisation==null && other.getAmortisation()==null) || 
             (this.amortisation!=null &&
              this.amortisation.equals(other.getAmortisation()))) &&
            ((this.financial_income==null && other.getFinancial_income()==null) || 
             (this.financial_income!=null &&
              this.financial_income.equals(other.getFinancial_income()))) &&
            ((this.financial_expenses==null && other.getFinancial_expenses()==null) || 
             (this.financial_expenses!=null &&
              this.financial_expenses.equals(other.getFinancial_expenses()))) &&
            ((this.extraordinary_income==null && other.getExtraordinary_income()==null) || 
             (this.extraordinary_income!=null &&
              this.extraordinary_income.equals(other.getExtraordinary_income()))) &&
            ((this.extraordinary_costs==null && other.getExtraordinary_costs()==null) || 
             (this.extraordinary_costs!=null &&
              this.extraordinary_costs.equals(other.getExtraordinary_costs()))) &&
            ((this.profit_before_tax==null && other.getProfit_before_tax()==null) || 
             (this.profit_before_tax!=null &&
              this.profit_before_tax.equals(other.getProfit_before_tax()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.profit_after_tax==null && other.getProfit_after_tax()==null) || 
             (this.profit_after_tax!=null &&
              this.profit_after_tax.equals(other.getProfit_after_tax()))) &&
            ((this.dividends==null && other.getDividends()==null) || 
             (this.dividends!=null &&
              this.dividends.equals(other.getDividends()))) &&
            ((this.minority_interests==null && other.getMinority_interests()==null) || 
             (this.minority_interests!=null &&
              this.minority_interests.equals(other.getMinority_interests()))) &&
            ((this.other_appropriations==null && other.getOther_appropriations()==null) || 
             (this.other_appropriations!=null &&
              this.other_appropriations.equals(other.getOther_appropriations()))) &&
            ((this.retained_profit==null && other.getRetained_profit()==null) || 
             (this.retained_profit!=null &&
              this.retained_profit.equals(other.getRetained_profit())));
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
        if (getYear_end_date() != null) {
            _hashCode += getYear_end_date().hashCode();
        }
        if (getNumber_of_weeks() != null) {
            _hashCode += getNumber_of_weeks().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getConsolidated_accounts() != null) {
            _hashCode += getConsolidated_accounts().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getOperating_costs() != null) {
            _hashCode += getOperating_costs().hashCode();
        }
        if (getOperating_profit() != null) {
            _hashCode += getOperating_profit().hashCode();
        }
        if (getWages_and_salaries() != null) {
            _hashCode += getWages_and_salaries().hashCode();
        }
        if (getPension_costs() != null) {
            _hashCode += getPension_costs().hashCode();
        }
        if (getDepreciation() != null) {
            _hashCode += getDepreciation().hashCode();
        }
        if (getAmortisation() != null) {
            _hashCode += getAmortisation().hashCode();
        }
        if (getFinancial_income() != null) {
            _hashCode += getFinancial_income().hashCode();
        }
        if (getFinancial_expenses() != null) {
            _hashCode += getFinancial_expenses().hashCode();
        }
        if (getExtraordinary_income() != null) {
            _hashCode += getExtraordinary_income().hashCode();
        }
        if (getExtraordinary_costs() != null) {
            _hashCode += getExtraordinary_costs().hashCode();
        }
        if (getProfit_before_tax() != null) {
            _hashCode += getProfit_before_tax().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getProfit_after_tax() != null) {
            _hashCode += getProfit_after_tax().hashCode();
        }
        if (getDividends() != null) {
            _hashCode += getDividends().hashCode();
        }
        if (getMinority_interests() != null) {
            _hashCode += getMinority_interests().hashCode();
        }
        if (getOther_appropriations() != null) {
            _hashCode += getOther_appropriations().hashCode();
        }
        if (getRetained_profit() != null) {
            _hashCode += getRetained_profit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeProfitAndLossFigures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeProfitAndLossFigures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_weeks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number_of_weeks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidated_accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "consolidated_accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operating_costs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "operating_costs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operating_profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "operating_profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wages_and_salaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "wages_and_salaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pension_costs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pension_costs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depreciation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "depreciation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "amortisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_income");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_income"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_expenses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_expenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraordinary_income");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extraordinary_income"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraordinary_costs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extraordinary_costs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit_before_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "profit_before_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit_after_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "profit_after_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dividends");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dividends"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minority_interests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "minority_interests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_appropriations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_appropriations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retained_profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "retained_profit"));
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
