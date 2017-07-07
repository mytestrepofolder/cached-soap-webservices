/**
 * DNBMarketingPlus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMarketingPlus  implements java.io.Serializable {
    private nl.webservices.www.soap.DNBAddress correspondence_address;

    private java.lang.Boolean correspondence_deliverability_indication;

    private java.lang.Boolean establishment_deliverability_indication;

    private java.lang.String location_status;

    private java.lang.Boolean is_subsidiary_location;

    private java.lang.Integer legal_form;

    private java.lang.String line_of_business;

    private nl.webservices.www.soap.DNBSICCode[] sic_activity_codes;

    private nl.webservices.www.soap.DNBSICCode[] sic8_activity_codes;

    private java.lang.String local_activity_code;

    private java.lang.Integer local_activity_code_type;

    private java.lang.Integer start_year;

    private java.lang.String ceo_name;

    private java.lang.String ceo_title;

    private java.lang.String[] executive_names;

    private java.lang.String statement_date;

    private java.lang.String currency;

    private java.lang.Long annual_sales;

    private java.lang.Long annual_sales_us;

    private java.lang.Integer annual_sales_indication;

    private java.lang.Long net_worth;

    private java.lang.Long net_worth_us;

    private java.lang.Long net_income;

    private java.lang.Long net_income_us;

    private java.lang.Boolean import_indication;

    private java.lang.Boolean export_indication;

    private java.lang.Boolean agent_indication;

    private java.lang.Integer employees;

    private java.lang.Integer employees_indication;

    private java.lang.Integer employees_total;

    private java.lang.Integer employees_total_indication;

    private java.lang.Boolean employees_total_includes_principals;

    private java.lang.String report_date;

    private java.lang.Boolean out_of_business;

    public DNBMarketingPlus() {
    }

    public DNBMarketingPlus(
           nl.webservices.www.soap.DNBAddress correspondence_address,
           java.lang.Boolean correspondence_deliverability_indication,
           java.lang.Boolean establishment_deliverability_indication,
           java.lang.String location_status,
           java.lang.Boolean is_subsidiary_location,
           java.lang.Integer legal_form,
           java.lang.String line_of_business,
           nl.webservices.www.soap.DNBSICCode[] sic_activity_codes,
           nl.webservices.www.soap.DNBSICCode[] sic8_activity_codes,
           java.lang.String local_activity_code,
           java.lang.Integer local_activity_code_type,
           java.lang.Integer start_year,
           java.lang.String ceo_name,
           java.lang.String ceo_title,
           java.lang.String[] executive_names,
           java.lang.String statement_date,
           java.lang.String currency,
           java.lang.Long annual_sales,
           java.lang.Long annual_sales_us,
           java.lang.Integer annual_sales_indication,
           java.lang.Long net_worth,
           java.lang.Long net_worth_us,
           java.lang.Long net_income,
           java.lang.Long net_income_us,
           java.lang.Boolean import_indication,
           java.lang.Boolean export_indication,
           java.lang.Boolean agent_indication,
           java.lang.Integer employees,
           java.lang.Integer employees_indication,
           java.lang.Integer employees_total,
           java.lang.Integer employees_total_indication,
           java.lang.Boolean employees_total_includes_principals,
           java.lang.String report_date,
           java.lang.Boolean out_of_business) {
           this.correspondence_address = correspondence_address;
           this.correspondence_deliverability_indication = correspondence_deliverability_indication;
           this.establishment_deliverability_indication = establishment_deliverability_indication;
           this.location_status = location_status;
           this.is_subsidiary_location = is_subsidiary_location;
           this.legal_form = legal_form;
           this.line_of_business = line_of_business;
           this.sic_activity_codes = sic_activity_codes;
           this.sic8_activity_codes = sic8_activity_codes;
           this.local_activity_code = local_activity_code;
           this.local_activity_code_type = local_activity_code_type;
           this.start_year = start_year;
           this.ceo_name = ceo_name;
           this.ceo_title = ceo_title;
           this.executive_names = executive_names;
           this.statement_date = statement_date;
           this.currency = currency;
           this.annual_sales = annual_sales;
           this.annual_sales_us = annual_sales_us;
           this.annual_sales_indication = annual_sales_indication;
           this.net_worth = net_worth;
           this.net_worth_us = net_worth_us;
           this.net_income = net_income;
           this.net_income_us = net_income_us;
           this.import_indication = import_indication;
           this.export_indication = export_indication;
           this.agent_indication = agent_indication;
           this.employees = employees;
           this.employees_indication = employees_indication;
           this.employees_total = employees_total;
           this.employees_total_indication = employees_total_indication;
           this.employees_total_includes_principals = employees_total_includes_principals;
           this.report_date = report_date;
           this.out_of_business = out_of_business;
    }


    /**
     * Gets the correspondence_address value for this DNBMarketingPlus.
     * 
     * @return correspondence_address
     */
    public nl.webservices.www.soap.DNBAddress getCorrespondence_address() {
        return correspondence_address;
    }


    /**
     * Sets the correspondence_address value for this DNBMarketingPlus.
     * 
     * @param correspondence_address
     */
    public void setCorrespondence_address(nl.webservices.www.soap.DNBAddress correspondence_address) {
        this.correspondence_address = correspondence_address;
    }


    /**
     * Gets the correspondence_deliverability_indication value for this DNBMarketingPlus.
     * 
     * @return correspondence_deliverability_indication
     */
    public java.lang.Boolean getCorrespondence_deliverability_indication() {
        return correspondence_deliverability_indication;
    }


    /**
     * Sets the correspondence_deliverability_indication value for this DNBMarketingPlus.
     * 
     * @param correspondence_deliverability_indication
     */
    public void setCorrespondence_deliverability_indication(java.lang.Boolean correspondence_deliverability_indication) {
        this.correspondence_deliverability_indication = correspondence_deliverability_indication;
    }


    /**
     * Gets the establishment_deliverability_indication value for this DNBMarketingPlus.
     * 
     * @return establishment_deliverability_indication
     */
    public java.lang.Boolean getEstablishment_deliverability_indication() {
        return establishment_deliverability_indication;
    }


    /**
     * Sets the establishment_deliverability_indication value for this DNBMarketingPlus.
     * 
     * @param establishment_deliverability_indication
     */
    public void setEstablishment_deliverability_indication(java.lang.Boolean establishment_deliverability_indication) {
        this.establishment_deliverability_indication = establishment_deliverability_indication;
    }


    /**
     * Gets the location_status value for this DNBMarketingPlus.
     * 
     * @return location_status
     */
    public java.lang.String getLocation_status() {
        return location_status;
    }


    /**
     * Sets the location_status value for this DNBMarketingPlus.
     * 
     * @param location_status
     */
    public void setLocation_status(java.lang.String location_status) {
        this.location_status = location_status;
    }


    /**
     * Gets the is_subsidiary_location value for this DNBMarketingPlus.
     * 
     * @return is_subsidiary_location
     */
    public java.lang.Boolean getIs_subsidiary_location() {
        return is_subsidiary_location;
    }


    /**
     * Sets the is_subsidiary_location value for this DNBMarketingPlus.
     * 
     * @param is_subsidiary_location
     */
    public void setIs_subsidiary_location(java.lang.Boolean is_subsidiary_location) {
        this.is_subsidiary_location = is_subsidiary_location;
    }


    /**
     * Gets the legal_form value for this DNBMarketingPlus.
     * 
     * @return legal_form
     */
    public java.lang.Integer getLegal_form() {
        return legal_form;
    }


    /**
     * Sets the legal_form value for this DNBMarketingPlus.
     * 
     * @param legal_form
     */
    public void setLegal_form(java.lang.Integer legal_form) {
        this.legal_form = legal_form;
    }


    /**
     * Gets the line_of_business value for this DNBMarketingPlus.
     * 
     * @return line_of_business
     */
    public java.lang.String getLine_of_business() {
        return line_of_business;
    }


    /**
     * Sets the line_of_business value for this DNBMarketingPlus.
     * 
     * @param line_of_business
     */
    public void setLine_of_business(java.lang.String line_of_business) {
        this.line_of_business = line_of_business;
    }


    /**
     * Gets the sic_activity_codes value for this DNBMarketingPlus.
     * 
     * @return sic_activity_codes
     */
    public nl.webservices.www.soap.DNBSICCode[] getSic_activity_codes() {
        return sic_activity_codes;
    }


    /**
     * Sets the sic_activity_codes value for this DNBMarketingPlus.
     * 
     * @param sic_activity_codes
     */
    public void setSic_activity_codes(nl.webservices.www.soap.DNBSICCode[] sic_activity_codes) {
        this.sic_activity_codes = sic_activity_codes;
    }


    /**
     * Gets the sic8_activity_codes value for this DNBMarketingPlus.
     * 
     * @return sic8_activity_codes
     */
    public nl.webservices.www.soap.DNBSICCode[] getSic8_activity_codes() {
        return sic8_activity_codes;
    }


    /**
     * Sets the sic8_activity_codes value for this DNBMarketingPlus.
     * 
     * @param sic8_activity_codes
     */
    public void setSic8_activity_codes(nl.webservices.www.soap.DNBSICCode[] sic8_activity_codes) {
        this.sic8_activity_codes = sic8_activity_codes;
    }


    /**
     * Gets the local_activity_code value for this DNBMarketingPlus.
     * 
     * @return local_activity_code
     */
    public java.lang.String getLocal_activity_code() {
        return local_activity_code;
    }


    /**
     * Sets the local_activity_code value for this DNBMarketingPlus.
     * 
     * @param local_activity_code
     */
    public void setLocal_activity_code(java.lang.String local_activity_code) {
        this.local_activity_code = local_activity_code;
    }


    /**
     * Gets the local_activity_code_type value for this DNBMarketingPlus.
     * 
     * @return local_activity_code_type
     */
    public java.lang.Integer getLocal_activity_code_type() {
        return local_activity_code_type;
    }


    /**
     * Sets the local_activity_code_type value for this DNBMarketingPlus.
     * 
     * @param local_activity_code_type
     */
    public void setLocal_activity_code_type(java.lang.Integer local_activity_code_type) {
        this.local_activity_code_type = local_activity_code_type;
    }


    /**
     * Gets the start_year value for this DNBMarketingPlus.
     * 
     * @return start_year
     */
    public java.lang.Integer getStart_year() {
        return start_year;
    }


    /**
     * Sets the start_year value for this DNBMarketingPlus.
     * 
     * @param start_year
     */
    public void setStart_year(java.lang.Integer start_year) {
        this.start_year = start_year;
    }


    /**
     * Gets the ceo_name value for this DNBMarketingPlus.
     * 
     * @return ceo_name
     */
    public java.lang.String getCeo_name() {
        return ceo_name;
    }


    /**
     * Sets the ceo_name value for this DNBMarketingPlus.
     * 
     * @param ceo_name
     */
    public void setCeo_name(java.lang.String ceo_name) {
        this.ceo_name = ceo_name;
    }


    /**
     * Gets the ceo_title value for this DNBMarketingPlus.
     * 
     * @return ceo_title
     */
    public java.lang.String getCeo_title() {
        return ceo_title;
    }


    /**
     * Sets the ceo_title value for this DNBMarketingPlus.
     * 
     * @param ceo_title
     */
    public void setCeo_title(java.lang.String ceo_title) {
        this.ceo_title = ceo_title;
    }


    /**
     * Gets the executive_names value for this DNBMarketingPlus.
     * 
     * @return executive_names
     */
    public java.lang.String[] getExecutive_names() {
        return executive_names;
    }


    /**
     * Sets the executive_names value for this DNBMarketingPlus.
     * 
     * @param executive_names
     */
    public void setExecutive_names(java.lang.String[] executive_names) {
        this.executive_names = executive_names;
    }


    /**
     * Gets the statement_date value for this DNBMarketingPlus.
     * 
     * @return statement_date
     */
    public java.lang.String getStatement_date() {
        return statement_date;
    }


    /**
     * Sets the statement_date value for this DNBMarketingPlus.
     * 
     * @param statement_date
     */
    public void setStatement_date(java.lang.String statement_date) {
        this.statement_date = statement_date;
    }


    /**
     * Gets the currency value for this DNBMarketingPlus.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DNBMarketingPlus.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the annual_sales value for this DNBMarketingPlus.
     * 
     * @return annual_sales
     */
    public java.lang.Long getAnnual_sales() {
        return annual_sales;
    }


    /**
     * Sets the annual_sales value for this DNBMarketingPlus.
     * 
     * @param annual_sales
     */
    public void setAnnual_sales(java.lang.Long annual_sales) {
        this.annual_sales = annual_sales;
    }


    /**
     * Gets the annual_sales_us value for this DNBMarketingPlus.
     * 
     * @return annual_sales_us
     */
    public java.lang.Long getAnnual_sales_us() {
        return annual_sales_us;
    }


    /**
     * Sets the annual_sales_us value for this DNBMarketingPlus.
     * 
     * @param annual_sales_us
     */
    public void setAnnual_sales_us(java.lang.Long annual_sales_us) {
        this.annual_sales_us = annual_sales_us;
    }


    /**
     * Gets the annual_sales_indication value for this DNBMarketingPlus.
     * 
     * @return annual_sales_indication
     */
    public java.lang.Integer getAnnual_sales_indication() {
        return annual_sales_indication;
    }


    /**
     * Sets the annual_sales_indication value for this DNBMarketingPlus.
     * 
     * @param annual_sales_indication
     */
    public void setAnnual_sales_indication(java.lang.Integer annual_sales_indication) {
        this.annual_sales_indication = annual_sales_indication;
    }


    /**
     * Gets the net_worth value for this DNBMarketingPlus.
     * 
     * @return net_worth
     */
    public java.lang.Long getNet_worth() {
        return net_worth;
    }


    /**
     * Sets the net_worth value for this DNBMarketingPlus.
     * 
     * @param net_worth
     */
    public void setNet_worth(java.lang.Long net_worth) {
        this.net_worth = net_worth;
    }


    /**
     * Gets the net_worth_us value for this DNBMarketingPlus.
     * 
     * @return net_worth_us
     */
    public java.lang.Long getNet_worth_us() {
        return net_worth_us;
    }


    /**
     * Sets the net_worth_us value for this DNBMarketingPlus.
     * 
     * @param net_worth_us
     */
    public void setNet_worth_us(java.lang.Long net_worth_us) {
        this.net_worth_us = net_worth_us;
    }


    /**
     * Gets the net_income value for this DNBMarketingPlus.
     * 
     * @return net_income
     */
    public java.lang.Long getNet_income() {
        return net_income;
    }


    /**
     * Sets the net_income value for this DNBMarketingPlus.
     * 
     * @param net_income
     */
    public void setNet_income(java.lang.Long net_income) {
        this.net_income = net_income;
    }


    /**
     * Gets the net_income_us value for this DNBMarketingPlus.
     * 
     * @return net_income_us
     */
    public java.lang.Long getNet_income_us() {
        return net_income_us;
    }


    /**
     * Sets the net_income_us value for this DNBMarketingPlus.
     * 
     * @param net_income_us
     */
    public void setNet_income_us(java.lang.Long net_income_us) {
        this.net_income_us = net_income_us;
    }


    /**
     * Gets the import_indication value for this DNBMarketingPlus.
     * 
     * @return import_indication
     */
    public java.lang.Boolean getImport_indication() {
        return import_indication;
    }


    /**
     * Sets the import_indication value for this DNBMarketingPlus.
     * 
     * @param import_indication
     */
    public void setImport_indication(java.lang.Boolean import_indication) {
        this.import_indication = import_indication;
    }


    /**
     * Gets the export_indication value for this DNBMarketingPlus.
     * 
     * @return export_indication
     */
    public java.lang.Boolean getExport_indication() {
        return export_indication;
    }


    /**
     * Sets the export_indication value for this DNBMarketingPlus.
     * 
     * @param export_indication
     */
    public void setExport_indication(java.lang.Boolean export_indication) {
        this.export_indication = export_indication;
    }


    /**
     * Gets the agent_indication value for this DNBMarketingPlus.
     * 
     * @return agent_indication
     */
    public java.lang.Boolean getAgent_indication() {
        return agent_indication;
    }


    /**
     * Sets the agent_indication value for this DNBMarketingPlus.
     * 
     * @param agent_indication
     */
    public void setAgent_indication(java.lang.Boolean agent_indication) {
        this.agent_indication = agent_indication;
    }


    /**
     * Gets the employees value for this DNBMarketingPlus.
     * 
     * @return employees
     */
    public java.lang.Integer getEmployees() {
        return employees;
    }


    /**
     * Sets the employees value for this DNBMarketingPlus.
     * 
     * @param employees
     */
    public void setEmployees(java.lang.Integer employees) {
        this.employees = employees;
    }


    /**
     * Gets the employees_indication value for this DNBMarketingPlus.
     * 
     * @return employees_indication
     */
    public java.lang.Integer getEmployees_indication() {
        return employees_indication;
    }


    /**
     * Sets the employees_indication value for this DNBMarketingPlus.
     * 
     * @param employees_indication
     */
    public void setEmployees_indication(java.lang.Integer employees_indication) {
        this.employees_indication = employees_indication;
    }


    /**
     * Gets the employees_total value for this DNBMarketingPlus.
     * 
     * @return employees_total
     */
    public java.lang.Integer getEmployees_total() {
        return employees_total;
    }


    /**
     * Sets the employees_total value for this DNBMarketingPlus.
     * 
     * @param employees_total
     */
    public void setEmployees_total(java.lang.Integer employees_total) {
        this.employees_total = employees_total;
    }


    /**
     * Gets the employees_total_indication value for this DNBMarketingPlus.
     * 
     * @return employees_total_indication
     */
    public java.lang.Integer getEmployees_total_indication() {
        return employees_total_indication;
    }


    /**
     * Sets the employees_total_indication value for this DNBMarketingPlus.
     * 
     * @param employees_total_indication
     */
    public void setEmployees_total_indication(java.lang.Integer employees_total_indication) {
        this.employees_total_indication = employees_total_indication;
    }


    /**
     * Gets the employees_total_includes_principals value for this DNBMarketingPlus.
     * 
     * @return employees_total_includes_principals
     */
    public java.lang.Boolean getEmployees_total_includes_principals() {
        return employees_total_includes_principals;
    }


    /**
     * Sets the employees_total_includes_principals value for this DNBMarketingPlus.
     * 
     * @param employees_total_includes_principals
     */
    public void setEmployees_total_includes_principals(java.lang.Boolean employees_total_includes_principals) {
        this.employees_total_includes_principals = employees_total_includes_principals;
    }


    /**
     * Gets the report_date value for this DNBMarketingPlus.
     * 
     * @return report_date
     */
    public java.lang.String getReport_date() {
        return report_date;
    }


    /**
     * Sets the report_date value for this DNBMarketingPlus.
     * 
     * @param report_date
     */
    public void setReport_date(java.lang.String report_date) {
        this.report_date = report_date;
    }


    /**
     * Gets the out_of_business value for this DNBMarketingPlus.
     * 
     * @return out_of_business
     */
    public java.lang.Boolean getOut_of_business() {
        return out_of_business;
    }


    /**
     * Sets the out_of_business value for this DNBMarketingPlus.
     * 
     * @param out_of_business
     */
    public void setOut_of_business(java.lang.Boolean out_of_business) {
        this.out_of_business = out_of_business;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMarketingPlus)) return false;
        DNBMarketingPlus other = (DNBMarketingPlus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correspondence_address==null && other.getCorrespondence_address()==null) || 
             (this.correspondence_address!=null &&
              this.correspondence_address.equals(other.getCorrespondence_address()))) &&
            ((this.correspondence_deliverability_indication==null && other.getCorrespondence_deliverability_indication()==null) || 
             (this.correspondence_deliverability_indication!=null &&
              this.correspondence_deliverability_indication.equals(other.getCorrespondence_deliverability_indication()))) &&
            ((this.establishment_deliverability_indication==null && other.getEstablishment_deliverability_indication()==null) || 
             (this.establishment_deliverability_indication!=null &&
              this.establishment_deliverability_indication.equals(other.getEstablishment_deliverability_indication()))) &&
            ((this.location_status==null && other.getLocation_status()==null) || 
             (this.location_status!=null &&
              this.location_status.equals(other.getLocation_status()))) &&
            ((this.is_subsidiary_location==null && other.getIs_subsidiary_location()==null) || 
             (this.is_subsidiary_location!=null &&
              this.is_subsidiary_location.equals(other.getIs_subsidiary_location()))) &&
            ((this.legal_form==null && other.getLegal_form()==null) || 
             (this.legal_form!=null &&
              this.legal_form.equals(other.getLegal_form()))) &&
            ((this.line_of_business==null && other.getLine_of_business()==null) || 
             (this.line_of_business!=null &&
              this.line_of_business.equals(other.getLine_of_business()))) &&
            ((this.sic_activity_codes==null && other.getSic_activity_codes()==null) || 
             (this.sic_activity_codes!=null &&
              java.util.Arrays.equals(this.sic_activity_codes, other.getSic_activity_codes()))) &&
            ((this.sic8_activity_codes==null && other.getSic8_activity_codes()==null) || 
             (this.sic8_activity_codes!=null &&
              java.util.Arrays.equals(this.sic8_activity_codes, other.getSic8_activity_codes()))) &&
            ((this.local_activity_code==null && other.getLocal_activity_code()==null) || 
             (this.local_activity_code!=null &&
              this.local_activity_code.equals(other.getLocal_activity_code()))) &&
            ((this.local_activity_code_type==null && other.getLocal_activity_code_type()==null) || 
             (this.local_activity_code_type!=null &&
              this.local_activity_code_type.equals(other.getLocal_activity_code_type()))) &&
            ((this.start_year==null && other.getStart_year()==null) || 
             (this.start_year!=null &&
              this.start_year.equals(other.getStart_year()))) &&
            ((this.ceo_name==null && other.getCeo_name()==null) || 
             (this.ceo_name!=null &&
              this.ceo_name.equals(other.getCeo_name()))) &&
            ((this.ceo_title==null && other.getCeo_title()==null) || 
             (this.ceo_title!=null &&
              this.ceo_title.equals(other.getCeo_title()))) &&
            ((this.executive_names==null && other.getExecutive_names()==null) || 
             (this.executive_names!=null &&
              java.util.Arrays.equals(this.executive_names, other.getExecutive_names()))) &&
            ((this.statement_date==null && other.getStatement_date()==null) || 
             (this.statement_date!=null &&
              this.statement_date.equals(other.getStatement_date()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.annual_sales==null && other.getAnnual_sales()==null) || 
             (this.annual_sales!=null &&
              this.annual_sales.equals(other.getAnnual_sales()))) &&
            ((this.annual_sales_us==null && other.getAnnual_sales_us()==null) || 
             (this.annual_sales_us!=null &&
              this.annual_sales_us.equals(other.getAnnual_sales_us()))) &&
            ((this.annual_sales_indication==null && other.getAnnual_sales_indication()==null) || 
             (this.annual_sales_indication!=null &&
              this.annual_sales_indication.equals(other.getAnnual_sales_indication()))) &&
            ((this.net_worth==null && other.getNet_worth()==null) || 
             (this.net_worth!=null &&
              this.net_worth.equals(other.getNet_worth()))) &&
            ((this.net_worth_us==null && other.getNet_worth_us()==null) || 
             (this.net_worth_us!=null &&
              this.net_worth_us.equals(other.getNet_worth_us()))) &&
            ((this.net_income==null && other.getNet_income()==null) || 
             (this.net_income!=null &&
              this.net_income.equals(other.getNet_income()))) &&
            ((this.net_income_us==null && other.getNet_income_us()==null) || 
             (this.net_income_us!=null &&
              this.net_income_us.equals(other.getNet_income_us()))) &&
            ((this.import_indication==null && other.getImport_indication()==null) || 
             (this.import_indication!=null &&
              this.import_indication.equals(other.getImport_indication()))) &&
            ((this.export_indication==null && other.getExport_indication()==null) || 
             (this.export_indication!=null &&
              this.export_indication.equals(other.getExport_indication()))) &&
            ((this.agent_indication==null && other.getAgent_indication()==null) || 
             (this.agent_indication!=null &&
              this.agent_indication.equals(other.getAgent_indication()))) &&
            ((this.employees==null && other.getEmployees()==null) || 
             (this.employees!=null &&
              this.employees.equals(other.getEmployees()))) &&
            ((this.employees_indication==null && other.getEmployees_indication()==null) || 
             (this.employees_indication!=null &&
              this.employees_indication.equals(other.getEmployees_indication()))) &&
            ((this.employees_total==null && other.getEmployees_total()==null) || 
             (this.employees_total!=null &&
              this.employees_total.equals(other.getEmployees_total()))) &&
            ((this.employees_total_indication==null && other.getEmployees_total_indication()==null) || 
             (this.employees_total_indication!=null &&
              this.employees_total_indication.equals(other.getEmployees_total_indication()))) &&
            ((this.employees_total_includes_principals==null && other.getEmployees_total_includes_principals()==null) || 
             (this.employees_total_includes_principals!=null &&
              this.employees_total_includes_principals.equals(other.getEmployees_total_includes_principals()))) &&
            ((this.report_date==null && other.getReport_date()==null) || 
             (this.report_date!=null &&
              this.report_date.equals(other.getReport_date()))) &&
            ((this.out_of_business==null && other.getOut_of_business()==null) || 
             (this.out_of_business!=null &&
              this.out_of_business.equals(other.getOut_of_business())));
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
        if (getCorrespondence_address() != null) {
            _hashCode += getCorrespondence_address().hashCode();
        }
        if (getCorrespondence_deliverability_indication() != null) {
            _hashCode += getCorrespondence_deliverability_indication().hashCode();
        }
        if (getEstablishment_deliverability_indication() != null) {
            _hashCode += getEstablishment_deliverability_indication().hashCode();
        }
        if (getLocation_status() != null) {
            _hashCode += getLocation_status().hashCode();
        }
        if (getIs_subsidiary_location() != null) {
            _hashCode += getIs_subsidiary_location().hashCode();
        }
        if (getLegal_form() != null) {
            _hashCode += getLegal_form().hashCode();
        }
        if (getLine_of_business() != null) {
            _hashCode += getLine_of_business().hashCode();
        }
        if (getSic_activity_codes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSic_activity_codes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSic_activity_codes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSic8_activity_codes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSic8_activity_codes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSic8_activity_codes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocal_activity_code() != null) {
            _hashCode += getLocal_activity_code().hashCode();
        }
        if (getLocal_activity_code_type() != null) {
            _hashCode += getLocal_activity_code_type().hashCode();
        }
        if (getStart_year() != null) {
            _hashCode += getStart_year().hashCode();
        }
        if (getCeo_name() != null) {
            _hashCode += getCeo_name().hashCode();
        }
        if (getCeo_title() != null) {
            _hashCode += getCeo_title().hashCode();
        }
        if (getExecutive_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecutive_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecutive_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatement_date() != null) {
            _hashCode += getStatement_date().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getAnnual_sales() != null) {
            _hashCode += getAnnual_sales().hashCode();
        }
        if (getAnnual_sales_us() != null) {
            _hashCode += getAnnual_sales_us().hashCode();
        }
        if (getAnnual_sales_indication() != null) {
            _hashCode += getAnnual_sales_indication().hashCode();
        }
        if (getNet_worth() != null) {
            _hashCode += getNet_worth().hashCode();
        }
        if (getNet_worth_us() != null) {
            _hashCode += getNet_worth_us().hashCode();
        }
        if (getNet_income() != null) {
            _hashCode += getNet_income().hashCode();
        }
        if (getNet_income_us() != null) {
            _hashCode += getNet_income_us().hashCode();
        }
        if (getImport_indication() != null) {
            _hashCode += getImport_indication().hashCode();
        }
        if (getExport_indication() != null) {
            _hashCode += getExport_indication().hashCode();
        }
        if (getAgent_indication() != null) {
            _hashCode += getAgent_indication().hashCode();
        }
        if (getEmployees() != null) {
            _hashCode += getEmployees().hashCode();
        }
        if (getEmployees_indication() != null) {
            _hashCode += getEmployees_indication().hashCode();
        }
        if (getEmployees_total() != null) {
            _hashCode += getEmployees_total().hashCode();
        }
        if (getEmployees_total_indication() != null) {
            _hashCode += getEmployees_total_indication().hashCode();
        }
        if (getEmployees_total_includes_principals() != null) {
            _hashCode += getEmployees_total_includes_principals().hashCode();
        }
        if (getReport_date() != null) {
            _hashCode += getReport_date().hashCode();
        }
        if (getOut_of_business() != null) {
            _hashCode += getOut_of_business().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMarketingPlus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMarketingPlus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_deliverability_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_deliverability_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_deliverability_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_deliverability_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "location_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_subsidiary_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_subsidiary_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line_of_business");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "line_of_business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_activity_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_activity_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBSICCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic8_activity_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic8_activity_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBSICCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local_activity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "local_activity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local_activity_code_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "local_activity_code_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceo_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ceo_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceo_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ceo_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executive_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "executive_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "statement_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_sales_us");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_sales_us"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_sales_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_sales_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_worth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_worth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_worth_us");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_worth_us"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_income");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_income"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_income_us");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_income_us"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "import_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "export_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "agent_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_total_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_total_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_total_includes_principals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_total_includes_principals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "report_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("out_of_business");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "out_of_business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
