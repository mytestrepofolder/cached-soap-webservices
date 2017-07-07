/**
 * DNBQuickCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBQuickCheck  implements java.io.Serializable {
    private java.lang.String duns;

    private java.lang.String dnb_key;

    private java.lang.String enquiry_duns;

    private java.lang.String business_number;

    private java.lang.String business_number_type;

    private java.lang.String business_number_description;

    private java.lang.String trade_name;

    private java.lang.String[] address;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String region;

    private java.lang.String subregion;

    private java.lang.String country_calling_code;

    private java.lang.String phone_number;

    private java.lang.String fax_number;

    private java.lang.String country;

    private java.lang.String ceo_name;

    private java.lang.String ceo_title;

    private java.lang.String principal_name;

    private java.lang.String principal_title;

    private java.lang.String currency;

    private java.lang.String statement_currency;

    private java.lang.Boolean debtor_inpossession;

    private java.lang.Boolean criminal_proceedings;

    private java.lang.Boolean suit_judgement;

    private java.lang.Boolean financial_embarrassment;

    private java.lang.Boolean financial_legal_events;

    private java.lang.Boolean operational_events;

    private java.lang.Boolean other_events;

    private java.lang.Boolean disaster;

    private java.lang.Boolean secured_filings;

    private java.lang.Boolean out_of_business;

    private java.lang.String history_indicator;

    private java.lang.String history_description;

    private java.lang.String income_statement_date;

    private java.lang.String income_statement_date_start;

    private java.lang.String income_statement_date_end;

    private java.lang.String financial_statement_date;

    private java.lang.Integer incorporation_year;

    private java.lang.Integer start_year;

    private java.lang.Integer current_control_year;

    private java.lang.String local_activity_code;

    private java.lang.String local_activity_code_type;

    private java.lang.String local_activity_description;

    private java.lang.String sic_activity_code;

    private java.lang.String sic_activity_description;

    private java.lang.String sic_version;

    private java.lang.String legal_form;

    private java.lang.String legal_form_description;

    private java.lang.Integer paydex_norm;

    private java.lang.Integer paydex_score;

    private java.lang.String dnb_rating;

    private java.lang.Integer maximum_credit;

    private java.lang.String maximum_credit_currency;

    private java.lang.Integer intangible_assets;

    private java.lang.Integer net_worth;

    private nl.webservices.www.soap.DNBMonetaryAmount tangible_net_worth;

    private java.lang.Integer sales;

    private nl.webservices.www.soap.DNBMonetaryAmount annual_sales;

    private nl.webservices.www.soap.DNBEmployeeCount employees_primary;

    private nl.webservices.www.soap.DNBEmployeeCount employees_total;

    private java.lang.String[] trade_names;

    public DNBQuickCheck() {
    }

    public DNBQuickCheck(
           java.lang.String duns,
           java.lang.String dnb_key,
           java.lang.String enquiry_duns,
           java.lang.String business_number,
           java.lang.String business_number_type,
           java.lang.String business_number_description,
           java.lang.String trade_name,
           java.lang.String[] address,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String region,
           java.lang.String subregion,
           java.lang.String country_calling_code,
           java.lang.String phone_number,
           java.lang.String fax_number,
           java.lang.String country,
           java.lang.String ceo_name,
           java.lang.String ceo_title,
           java.lang.String principal_name,
           java.lang.String principal_title,
           java.lang.String currency,
           java.lang.String statement_currency,
           java.lang.Boolean debtor_inpossession,
           java.lang.Boolean criminal_proceedings,
           java.lang.Boolean suit_judgement,
           java.lang.Boolean financial_embarrassment,
           java.lang.Boolean financial_legal_events,
           java.lang.Boolean operational_events,
           java.lang.Boolean other_events,
           java.lang.Boolean disaster,
           java.lang.Boolean secured_filings,
           java.lang.Boolean out_of_business,
           java.lang.String history_indicator,
           java.lang.String history_description,
           java.lang.String income_statement_date,
           java.lang.String income_statement_date_start,
           java.lang.String income_statement_date_end,
           java.lang.String financial_statement_date,
           java.lang.Integer incorporation_year,
           java.lang.Integer start_year,
           java.lang.Integer current_control_year,
           java.lang.String local_activity_code,
           java.lang.String local_activity_code_type,
           java.lang.String local_activity_description,
           java.lang.String sic_activity_code,
           java.lang.String sic_activity_description,
           java.lang.String sic_version,
           java.lang.String legal_form,
           java.lang.String legal_form_description,
           java.lang.Integer paydex_norm,
           java.lang.Integer paydex_score,
           java.lang.String dnb_rating,
           java.lang.Integer maximum_credit,
           java.lang.String maximum_credit_currency,
           java.lang.Integer intangible_assets,
           java.lang.Integer net_worth,
           nl.webservices.www.soap.DNBMonetaryAmount tangible_net_worth,
           java.lang.Integer sales,
           nl.webservices.www.soap.DNBMonetaryAmount annual_sales,
           nl.webservices.www.soap.DNBEmployeeCount employees_primary,
           nl.webservices.www.soap.DNBEmployeeCount employees_total,
           java.lang.String[] trade_names) {
           this.duns = duns;
           this.dnb_key = dnb_key;
           this.enquiry_duns = enquiry_duns;
           this.business_number = business_number;
           this.business_number_type = business_number_type;
           this.business_number_description = business_number_description;
           this.trade_name = trade_name;
           this.address = address;
           this.postcode = postcode;
           this.city = city;
           this.region = region;
           this.subregion = subregion;
           this.country_calling_code = country_calling_code;
           this.phone_number = phone_number;
           this.fax_number = fax_number;
           this.country = country;
           this.ceo_name = ceo_name;
           this.ceo_title = ceo_title;
           this.principal_name = principal_name;
           this.principal_title = principal_title;
           this.currency = currency;
           this.statement_currency = statement_currency;
           this.debtor_inpossession = debtor_inpossession;
           this.criminal_proceedings = criminal_proceedings;
           this.suit_judgement = suit_judgement;
           this.financial_embarrassment = financial_embarrassment;
           this.financial_legal_events = financial_legal_events;
           this.operational_events = operational_events;
           this.other_events = other_events;
           this.disaster = disaster;
           this.secured_filings = secured_filings;
           this.out_of_business = out_of_business;
           this.history_indicator = history_indicator;
           this.history_description = history_description;
           this.income_statement_date = income_statement_date;
           this.income_statement_date_start = income_statement_date_start;
           this.income_statement_date_end = income_statement_date_end;
           this.financial_statement_date = financial_statement_date;
           this.incorporation_year = incorporation_year;
           this.start_year = start_year;
           this.current_control_year = current_control_year;
           this.local_activity_code = local_activity_code;
           this.local_activity_code_type = local_activity_code_type;
           this.local_activity_description = local_activity_description;
           this.sic_activity_code = sic_activity_code;
           this.sic_activity_description = sic_activity_description;
           this.sic_version = sic_version;
           this.legal_form = legal_form;
           this.legal_form_description = legal_form_description;
           this.paydex_norm = paydex_norm;
           this.paydex_score = paydex_score;
           this.dnb_rating = dnb_rating;
           this.maximum_credit = maximum_credit;
           this.maximum_credit_currency = maximum_credit_currency;
           this.intangible_assets = intangible_assets;
           this.net_worth = net_worth;
           this.tangible_net_worth = tangible_net_worth;
           this.sales = sales;
           this.annual_sales = annual_sales;
           this.employees_primary = employees_primary;
           this.employees_total = employees_total;
           this.trade_names = trade_names;
    }


    /**
     * Gets the duns value for this DNBQuickCheck.
     * 
     * @return duns
     */
    public java.lang.String getDuns() {
        return duns;
    }


    /**
     * Sets the duns value for this DNBQuickCheck.
     * 
     * @param duns
     */
    public void setDuns(java.lang.String duns) {
        this.duns = duns;
    }


    /**
     * Gets the dnb_key value for this DNBQuickCheck.
     * 
     * @return dnb_key
     */
    public java.lang.String getDnb_key() {
        return dnb_key;
    }


    /**
     * Sets the dnb_key value for this DNBQuickCheck.
     * 
     * @param dnb_key
     */
    public void setDnb_key(java.lang.String dnb_key) {
        this.dnb_key = dnb_key;
    }


    /**
     * Gets the enquiry_duns value for this DNBQuickCheck.
     * 
     * @return enquiry_duns
     */
    public java.lang.String getEnquiry_duns() {
        return enquiry_duns;
    }


    /**
     * Sets the enquiry_duns value for this DNBQuickCheck.
     * 
     * @param enquiry_duns
     */
    public void setEnquiry_duns(java.lang.String enquiry_duns) {
        this.enquiry_duns = enquiry_duns;
    }


    /**
     * Gets the business_number value for this DNBQuickCheck.
     * 
     * @return business_number
     */
    public java.lang.String getBusiness_number() {
        return business_number;
    }


    /**
     * Sets the business_number value for this DNBQuickCheck.
     * 
     * @param business_number
     */
    public void setBusiness_number(java.lang.String business_number) {
        this.business_number = business_number;
    }


    /**
     * Gets the business_number_type value for this DNBQuickCheck.
     * 
     * @return business_number_type
     */
    public java.lang.String getBusiness_number_type() {
        return business_number_type;
    }


    /**
     * Sets the business_number_type value for this DNBQuickCheck.
     * 
     * @param business_number_type
     */
    public void setBusiness_number_type(java.lang.String business_number_type) {
        this.business_number_type = business_number_type;
    }


    /**
     * Gets the business_number_description value for this DNBQuickCheck.
     * 
     * @return business_number_description
     */
    public java.lang.String getBusiness_number_description() {
        return business_number_description;
    }


    /**
     * Sets the business_number_description value for this DNBQuickCheck.
     * 
     * @param business_number_description
     */
    public void setBusiness_number_description(java.lang.String business_number_description) {
        this.business_number_description = business_number_description;
    }


    /**
     * Gets the trade_name value for this DNBQuickCheck.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DNBQuickCheck.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the address value for this DNBQuickCheck.
     * 
     * @return address
     */
    public java.lang.String[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DNBQuickCheck.
     * 
     * @param address
     */
    public void setAddress(java.lang.String[] address) {
        this.address = address;
    }


    /**
     * Gets the postcode value for this DNBQuickCheck.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DNBQuickCheck.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this DNBQuickCheck.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DNBQuickCheck.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this DNBQuickCheck.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DNBQuickCheck.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the subregion value for this DNBQuickCheck.
     * 
     * @return subregion
     */
    public java.lang.String getSubregion() {
        return subregion;
    }


    /**
     * Sets the subregion value for this DNBQuickCheck.
     * 
     * @param subregion
     */
    public void setSubregion(java.lang.String subregion) {
        this.subregion = subregion;
    }


    /**
     * Gets the country_calling_code value for this DNBQuickCheck.
     * 
     * @return country_calling_code
     */
    public java.lang.String getCountry_calling_code() {
        return country_calling_code;
    }


    /**
     * Sets the country_calling_code value for this DNBQuickCheck.
     * 
     * @param country_calling_code
     */
    public void setCountry_calling_code(java.lang.String country_calling_code) {
        this.country_calling_code = country_calling_code;
    }


    /**
     * Gets the phone_number value for this DNBQuickCheck.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this DNBQuickCheck.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the fax_number value for this DNBQuickCheck.
     * 
     * @return fax_number
     */
    public java.lang.String getFax_number() {
        return fax_number;
    }


    /**
     * Sets the fax_number value for this DNBQuickCheck.
     * 
     * @param fax_number
     */
    public void setFax_number(java.lang.String fax_number) {
        this.fax_number = fax_number;
    }


    /**
     * Gets the country value for this DNBQuickCheck.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DNBQuickCheck.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the ceo_name value for this DNBQuickCheck.
     * 
     * @return ceo_name
     */
    public java.lang.String getCeo_name() {
        return ceo_name;
    }


    /**
     * Sets the ceo_name value for this DNBQuickCheck.
     * 
     * @param ceo_name
     */
    public void setCeo_name(java.lang.String ceo_name) {
        this.ceo_name = ceo_name;
    }


    /**
     * Gets the ceo_title value for this DNBQuickCheck.
     * 
     * @return ceo_title
     */
    public java.lang.String getCeo_title() {
        return ceo_title;
    }


    /**
     * Sets the ceo_title value for this DNBQuickCheck.
     * 
     * @param ceo_title
     */
    public void setCeo_title(java.lang.String ceo_title) {
        this.ceo_title = ceo_title;
    }


    /**
     * Gets the principal_name value for this DNBQuickCheck.
     * 
     * @return principal_name
     */
    public java.lang.String getPrincipal_name() {
        return principal_name;
    }


    /**
     * Sets the principal_name value for this DNBQuickCheck.
     * 
     * @param principal_name
     */
    public void setPrincipal_name(java.lang.String principal_name) {
        this.principal_name = principal_name;
    }


    /**
     * Gets the principal_title value for this DNBQuickCheck.
     * 
     * @return principal_title
     */
    public java.lang.String getPrincipal_title() {
        return principal_title;
    }


    /**
     * Sets the principal_title value for this DNBQuickCheck.
     * 
     * @param principal_title
     */
    public void setPrincipal_title(java.lang.String principal_title) {
        this.principal_title = principal_title;
    }


    /**
     * Gets the currency value for this DNBQuickCheck.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DNBQuickCheck.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the statement_currency value for this DNBQuickCheck.
     * 
     * @return statement_currency
     */
    public java.lang.String getStatement_currency() {
        return statement_currency;
    }


    /**
     * Sets the statement_currency value for this DNBQuickCheck.
     * 
     * @param statement_currency
     */
    public void setStatement_currency(java.lang.String statement_currency) {
        this.statement_currency = statement_currency;
    }


    /**
     * Gets the debtor_inpossession value for this DNBQuickCheck.
     * 
     * @return debtor_inpossession
     */
    public java.lang.Boolean getDebtor_inpossession() {
        return debtor_inpossession;
    }


    /**
     * Sets the debtor_inpossession value for this DNBQuickCheck.
     * 
     * @param debtor_inpossession
     */
    public void setDebtor_inpossession(java.lang.Boolean debtor_inpossession) {
        this.debtor_inpossession = debtor_inpossession;
    }


    /**
     * Gets the criminal_proceedings value for this DNBQuickCheck.
     * 
     * @return criminal_proceedings
     */
    public java.lang.Boolean getCriminal_proceedings() {
        return criminal_proceedings;
    }


    /**
     * Sets the criminal_proceedings value for this DNBQuickCheck.
     * 
     * @param criminal_proceedings
     */
    public void setCriminal_proceedings(java.lang.Boolean criminal_proceedings) {
        this.criminal_proceedings = criminal_proceedings;
    }


    /**
     * Gets the suit_judgement value for this DNBQuickCheck.
     * 
     * @return suit_judgement
     */
    public java.lang.Boolean getSuit_judgement() {
        return suit_judgement;
    }


    /**
     * Sets the suit_judgement value for this DNBQuickCheck.
     * 
     * @param suit_judgement
     */
    public void setSuit_judgement(java.lang.Boolean suit_judgement) {
        this.suit_judgement = suit_judgement;
    }


    /**
     * Gets the financial_embarrassment value for this DNBQuickCheck.
     * 
     * @return financial_embarrassment
     */
    public java.lang.Boolean getFinancial_embarrassment() {
        return financial_embarrassment;
    }


    /**
     * Sets the financial_embarrassment value for this DNBQuickCheck.
     * 
     * @param financial_embarrassment
     */
    public void setFinancial_embarrassment(java.lang.Boolean financial_embarrassment) {
        this.financial_embarrassment = financial_embarrassment;
    }


    /**
     * Gets the financial_legal_events value for this DNBQuickCheck.
     * 
     * @return financial_legal_events
     */
    public java.lang.Boolean getFinancial_legal_events() {
        return financial_legal_events;
    }


    /**
     * Sets the financial_legal_events value for this DNBQuickCheck.
     * 
     * @param financial_legal_events
     */
    public void setFinancial_legal_events(java.lang.Boolean financial_legal_events) {
        this.financial_legal_events = financial_legal_events;
    }


    /**
     * Gets the operational_events value for this DNBQuickCheck.
     * 
     * @return operational_events
     */
    public java.lang.Boolean getOperational_events() {
        return operational_events;
    }


    /**
     * Sets the operational_events value for this DNBQuickCheck.
     * 
     * @param operational_events
     */
    public void setOperational_events(java.lang.Boolean operational_events) {
        this.operational_events = operational_events;
    }


    /**
     * Gets the other_events value for this DNBQuickCheck.
     * 
     * @return other_events
     */
    public java.lang.Boolean getOther_events() {
        return other_events;
    }


    /**
     * Sets the other_events value for this DNBQuickCheck.
     * 
     * @param other_events
     */
    public void setOther_events(java.lang.Boolean other_events) {
        this.other_events = other_events;
    }


    /**
     * Gets the disaster value for this DNBQuickCheck.
     * 
     * @return disaster
     */
    public java.lang.Boolean getDisaster() {
        return disaster;
    }


    /**
     * Sets the disaster value for this DNBQuickCheck.
     * 
     * @param disaster
     */
    public void setDisaster(java.lang.Boolean disaster) {
        this.disaster = disaster;
    }


    /**
     * Gets the secured_filings value for this DNBQuickCheck.
     * 
     * @return secured_filings
     */
    public java.lang.Boolean getSecured_filings() {
        return secured_filings;
    }


    /**
     * Sets the secured_filings value for this DNBQuickCheck.
     * 
     * @param secured_filings
     */
    public void setSecured_filings(java.lang.Boolean secured_filings) {
        this.secured_filings = secured_filings;
    }


    /**
     * Gets the out_of_business value for this DNBQuickCheck.
     * 
     * @return out_of_business
     */
    public java.lang.Boolean getOut_of_business() {
        return out_of_business;
    }


    /**
     * Sets the out_of_business value for this DNBQuickCheck.
     * 
     * @param out_of_business
     */
    public void setOut_of_business(java.lang.Boolean out_of_business) {
        this.out_of_business = out_of_business;
    }


    /**
     * Gets the history_indicator value for this DNBQuickCheck.
     * 
     * @return history_indicator
     */
    public java.lang.String getHistory_indicator() {
        return history_indicator;
    }


    /**
     * Sets the history_indicator value for this DNBQuickCheck.
     * 
     * @param history_indicator
     */
    public void setHistory_indicator(java.lang.String history_indicator) {
        this.history_indicator = history_indicator;
    }


    /**
     * Gets the history_description value for this DNBQuickCheck.
     * 
     * @return history_description
     */
    public java.lang.String getHistory_description() {
        return history_description;
    }


    /**
     * Sets the history_description value for this DNBQuickCheck.
     * 
     * @param history_description
     */
    public void setHistory_description(java.lang.String history_description) {
        this.history_description = history_description;
    }


    /**
     * Gets the income_statement_date value for this DNBQuickCheck.
     * 
     * @return income_statement_date
     */
    public java.lang.String getIncome_statement_date() {
        return income_statement_date;
    }


    /**
     * Sets the income_statement_date value for this DNBQuickCheck.
     * 
     * @param income_statement_date
     */
    public void setIncome_statement_date(java.lang.String income_statement_date) {
        this.income_statement_date = income_statement_date;
    }


    /**
     * Gets the income_statement_date_start value for this DNBQuickCheck.
     * 
     * @return income_statement_date_start
     */
    public java.lang.String getIncome_statement_date_start() {
        return income_statement_date_start;
    }


    /**
     * Sets the income_statement_date_start value for this DNBQuickCheck.
     * 
     * @param income_statement_date_start
     */
    public void setIncome_statement_date_start(java.lang.String income_statement_date_start) {
        this.income_statement_date_start = income_statement_date_start;
    }


    /**
     * Gets the income_statement_date_end value for this DNBQuickCheck.
     * 
     * @return income_statement_date_end
     */
    public java.lang.String getIncome_statement_date_end() {
        return income_statement_date_end;
    }


    /**
     * Sets the income_statement_date_end value for this DNBQuickCheck.
     * 
     * @param income_statement_date_end
     */
    public void setIncome_statement_date_end(java.lang.String income_statement_date_end) {
        this.income_statement_date_end = income_statement_date_end;
    }


    /**
     * Gets the financial_statement_date value for this DNBQuickCheck.
     * 
     * @return financial_statement_date
     */
    public java.lang.String getFinancial_statement_date() {
        return financial_statement_date;
    }


    /**
     * Sets the financial_statement_date value for this DNBQuickCheck.
     * 
     * @param financial_statement_date
     */
    public void setFinancial_statement_date(java.lang.String financial_statement_date) {
        this.financial_statement_date = financial_statement_date;
    }


    /**
     * Gets the incorporation_year value for this DNBQuickCheck.
     * 
     * @return incorporation_year
     */
    public java.lang.Integer getIncorporation_year() {
        return incorporation_year;
    }


    /**
     * Sets the incorporation_year value for this DNBQuickCheck.
     * 
     * @param incorporation_year
     */
    public void setIncorporation_year(java.lang.Integer incorporation_year) {
        this.incorporation_year = incorporation_year;
    }


    /**
     * Gets the start_year value for this DNBQuickCheck.
     * 
     * @return start_year
     */
    public java.lang.Integer getStart_year() {
        return start_year;
    }


    /**
     * Sets the start_year value for this DNBQuickCheck.
     * 
     * @param start_year
     */
    public void setStart_year(java.lang.Integer start_year) {
        this.start_year = start_year;
    }


    /**
     * Gets the current_control_year value for this DNBQuickCheck.
     * 
     * @return current_control_year
     */
    public java.lang.Integer getCurrent_control_year() {
        return current_control_year;
    }


    /**
     * Sets the current_control_year value for this DNBQuickCheck.
     * 
     * @param current_control_year
     */
    public void setCurrent_control_year(java.lang.Integer current_control_year) {
        this.current_control_year = current_control_year;
    }


    /**
     * Gets the local_activity_code value for this DNBQuickCheck.
     * 
     * @return local_activity_code
     */
    public java.lang.String getLocal_activity_code() {
        return local_activity_code;
    }


    /**
     * Sets the local_activity_code value for this DNBQuickCheck.
     * 
     * @param local_activity_code
     */
    public void setLocal_activity_code(java.lang.String local_activity_code) {
        this.local_activity_code = local_activity_code;
    }


    /**
     * Gets the local_activity_code_type value for this DNBQuickCheck.
     * 
     * @return local_activity_code_type
     */
    public java.lang.String getLocal_activity_code_type() {
        return local_activity_code_type;
    }


    /**
     * Sets the local_activity_code_type value for this DNBQuickCheck.
     * 
     * @param local_activity_code_type
     */
    public void setLocal_activity_code_type(java.lang.String local_activity_code_type) {
        this.local_activity_code_type = local_activity_code_type;
    }


    /**
     * Gets the local_activity_description value for this DNBQuickCheck.
     * 
     * @return local_activity_description
     */
    public java.lang.String getLocal_activity_description() {
        return local_activity_description;
    }


    /**
     * Sets the local_activity_description value for this DNBQuickCheck.
     * 
     * @param local_activity_description
     */
    public void setLocal_activity_description(java.lang.String local_activity_description) {
        this.local_activity_description = local_activity_description;
    }


    /**
     * Gets the sic_activity_code value for this DNBQuickCheck.
     * 
     * @return sic_activity_code
     */
    public java.lang.String getSic_activity_code() {
        return sic_activity_code;
    }


    /**
     * Sets the sic_activity_code value for this DNBQuickCheck.
     * 
     * @param sic_activity_code
     */
    public void setSic_activity_code(java.lang.String sic_activity_code) {
        this.sic_activity_code = sic_activity_code;
    }


    /**
     * Gets the sic_activity_description value for this DNBQuickCheck.
     * 
     * @return sic_activity_description
     */
    public java.lang.String getSic_activity_description() {
        return sic_activity_description;
    }


    /**
     * Sets the sic_activity_description value for this DNBQuickCheck.
     * 
     * @param sic_activity_description
     */
    public void setSic_activity_description(java.lang.String sic_activity_description) {
        this.sic_activity_description = sic_activity_description;
    }


    /**
     * Gets the sic_version value for this DNBQuickCheck.
     * 
     * @return sic_version
     */
    public java.lang.String getSic_version() {
        return sic_version;
    }


    /**
     * Sets the sic_version value for this DNBQuickCheck.
     * 
     * @param sic_version
     */
    public void setSic_version(java.lang.String sic_version) {
        this.sic_version = sic_version;
    }


    /**
     * Gets the legal_form value for this DNBQuickCheck.
     * 
     * @return legal_form
     */
    public java.lang.String getLegal_form() {
        return legal_form;
    }


    /**
     * Sets the legal_form value for this DNBQuickCheck.
     * 
     * @param legal_form
     */
    public void setLegal_form(java.lang.String legal_form) {
        this.legal_form = legal_form;
    }


    /**
     * Gets the legal_form_description value for this DNBQuickCheck.
     * 
     * @return legal_form_description
     */
    public java.lang.String getLegal_form_description() {
        return legal_form_description;
    }


    /**
     * Sets the legal_form_description value for this DNBQuickCheck.
     * 
     * @param legal_form_description
     */
    public void setLegal_form_description(java.lang.String legal_form_description) {
        this.legal_form_description = legal_form_description;
    }


    /**
     * Gets the paydex_norm value for this DNBQuickCheck.
     * 
     * @return paydex_norm
     */
    public java.lang.Integer getPaydex_norm() {
        return paydex_norm;
    }


    /**
     * Sets the paydex_norm value for this DNBQuickCheck.
     * 
     * @param paydex_norm
     */
    public void setPaydex_norm(java.lang.Integer paydex_norm) {
        this.paydex_norm = paydex_norm;
    }


    /**
     * Gets the paydex_score value for this DNBQuickCheck.
     * 
     * @return paydex_score
     */
    public java.lang.Integer getPaydex_score() {
        return paydex_score;
    }


    /**
     * Sets the paydex_score value for this DNBQuickCheck.
     * 
     * @param paydex_score
     */
    public void setPaydex_score(java.lang.Integer paydex_score) {
        this.paydex_score = paydex_score;
    }


    /**
     * Gets the dnb_rating value for this DNBQuickCheck.
     * 
     * @return dnb_rating
     */
    public java.lang.String getDnb_rating() {
        return dnb_rating;
    }


    /**
     * Sets the dnb_rating value for this DNBQuickCheck.
     * 
     * @param dnb_rating
     */
    public void setDnb_rating(java.lang.String dnb_rating) {
        this.dnb_rating = dnb_rating;
    }


    /**
     * Gets the maximum_credit value for this DNBQuickCheck.
     * 
     * @return maximum_credit
     */
    public java.lang.Integer getMaximum_credit() {
        return maximum_credit;
    }


    /**
     * Sets the maximum_credit value for this DNBQuickCheck.
     * 
     * @param maximum_credit
     */
    public void setMaximum_credit(java.lang.Integer maximum_credit) {
        this.maximum_credit = maximum_credit;
    }


    /**
     * Gets the maximum_credit_currency value for this DNBQuickCheck.
     * 
     * @return maximum_credit_currency
     */
    public java.lang.String getMaximum_credit_currency() {
        return maximum_credit_currency;
    }


    /**
     * Sets the maximum_credit_currency value for this DNBQuickCheck.
     * 
     * @param maximum_credit_currency
     */
    public void setMaximum_credit_currency(java.lang.String maximum_credit_currency) {
        this.maximum_credit_currency = maximum_credit_currency;
    }


    /**
     * Gets the intangible_assets value for this DNBQuickCheck.
     * 
     * @return intangible_assets
     */
    public java.lang.Integer getIntangible_assets() {
        return intangible_assets;
    }


    /**
     * Sets the intangible_assets value for this DNBQuickCheck.
     * 
     * @param intangible_assets
     */
    public void setIntangible_assets(java.lang.Integer intangible_assets) {
        this.intangible_assets = intangible_assets;
    }


    /**
     * Gets the net_worth value for this DNBQuickCheck.
     * 
     * @return net_worth
     */
    public java.lang.Integer getNet_worth() {
        return net_worth;
    }


    /**
     * Sets the net_worth value for this DNBQuickCheck.
     * 
     * @param net_worth
     */
    public void setNet_worth(java.lang.Integer net_worth) {
        this.net_worth = net_worth;
    }


    /**
     * Gets the tangible_net_worth value for this DNBQuickCheck.
     * 
     * @return tangible_net_worth
     */
    public nl.webservices.www.soap.DNBMonetaryAmount getTangible_net_worth() {
        return tangible_net_worth;
    }


    /**
     * Sets the tangible_net_worth value for this DNBQuickCheck.
     * 
     * @param tangible_net_worth
     */
    public void setTangible_net_worth(nl.webservices.www.soap.DNBMonetaryAmount tangible_net_worth) {
        this.tangible_net_worth = tangible_net_worth;
    }


    /**
     * Gets the sales value for this DNBQuickCheck.
     * 
     * @return sales
     */
    public java.lang.Integer getSales() {
        return sales;
    }


    /**
     * Sets the sales value for this DNBQuickCheck.
     * 
     * @param sales
     */
    public void setSales(java.lang.Integer sales) {
        this.sales = sales;
    }


    /**
     * Gets the annual_sales value for this DNBQuickCheck.
     * 
     * @return annual_sales
     */
    public nl.webservices.www.soap.DNBMonetaryAmount getAnnual_sales() {
        return annual_sales;
    }


    /**
     * Sets the annual_sales value for this DNBQuickCheck.
     * 
     * @param annual_sales
     */
    public void setAnnual_sales(nl.webservices.www.soap.DNBMonetaryAmount annual_sales) {
        this.annual_sales = annual_sales;
    }


    /**
     * Gets the employees_primary value for this DNBQuickCheck.
     * 
     * @return employees_primary
     */
    public nl.webservices.www.soap.DNBEmployeeCount getEmployees_primary() {
        return employees_primary;
    }


    /**
     * Sets the employees_primary value for this DNBQuickCheck.
     * 
     * @param employees_primary
     */
    public void setEmployees_primary(nl.webservices.www.soap.DNBEmployeeCount employees_primary) {
        this.employees_primary = employees_primary;
    }


    /**
     * Gets the employees_total value for this DNBQuickCheck.
     * 
     * @return employees_total
     */
    public nl.webservices.www.soap.DNBEmployeeCount getEmployees_total() {
        return employees_total;
    }


    /**
     * Sets the employees_total value for this DNBQuickCheck.
     * 
     * @param employees_total
     */
    public void setEmployees_total(nl.webservices.www.soap.DNBEmployeeCount employees_total) {
        this.employees_total = employees_total;
    }


    /**
     * Gets the trade_names value for this DNBQuickCheck.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DNBQuickCheck.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBQuickCheck)) return false;
        DNBQuickCheck other = (DNBQuickCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duns==null && other.getDuns()==null) || 
             (this.duns!=null &&
              this.duns.equals(other.getDuns()))) &&
            ((this.dnb_key==null && other.getDnb_key()==null) || 
             (this.dnb_key!=null &&
              this.dnb_key.equals(other.getDnb_key()))) &&
            ((this.enquiry_duns==null && other.getEnquiry_duns()==null) || 
             (this.enquiry_duns!=null &&
              this.enquiry_duns.equals(other.getEnquiry_duns()))) &&
            ((this.business_number==null && other.getBusiness_number()==null) || 
             (this.business_number!=null &&
              this.business_number.equals(other.getBusiness_number()))) &&
            ((this.business_number_type==null && other.getBusiness_number_type()==null) || 
             (this.business_number_type!=null &&
              this.business_number_type.equals(other.getBusiness_number_type()))) &&
            ((this.business_number_description==null && other.getBusiness_number_description()==null) || 
             (this.business_number_description!=null &&
              this.business_number_description.equals(other.getBusiness_number_description()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.subregion==null && other.getSubregion()==null) || 
             (this.subregion!=null &&
              this.subregion.equals(other.getSubregion()))) &&
            ((this.country_calling_code==null && other.getCountry_calling_code()==null) || 
             (this.country_calling_code!=null &&
              this.country_calling_code.equals(other.getCountry_calling_code()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            ((this.fax_number==null && other.getFax_number()==null) || 
             (this.fax_number!=null &&
              this.fax_number.equals(other.getFax_number()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.ceo_name==null && other.getCeo_name()==null) || 
             (this.ceo_name!=null &&
              this.ceo_name.equals(other.getCeo_name()))) &&
            ((this.ceo_title==null && other.getCeo_title()==null) || 
             (this.ceo_title!=null &&
              this.ceo_title.equals(other.getCeo_title()))) &&
            ((this.principal_name==null && other.getPrincipal_name()==null) || 
             (this.principal_name!=null &&
              this.principal_name.equals(other.getPrincipal_name()))) &&
            ((this.principal_title==null && other.getPrincipal_title()==null) || 
             (this.principal_title!=null &&
              this.principal_title.equals(other.getPrincipal_title()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.statement_currency==null && other.getStatement_currency()==null) || 
             (this.statement_currency!=null &&
              this.statement_currency.equals(other.getStatement_currency()))) &&
            ((this.debtor_inpossession==null && other.getDebtor_inpossession()==null) || 
             (this.debtor_inpossession!=null &&
              this.debtor_inpossession.equals(other.getDebtor_inpossession()))) &&
            ((this.criminal_proceedings==null && other.getCriminal_proceedings()==null) || 
             (this.criminal_proceedings!=null &&
              this.criminal_proceedings.equals(other.getCriminal_proceedings()))) &&
            ((this.suit_judgement==null && other.getSuit_judgement()==null) || 
             (this.suit_judgement!=null &&
              this.suit_judgement.equals(other.getSuit_judgement()))) &&
            ((this.financial_embarrassment==null && other.getFinancial_embarrassment()==null) || 
             (this.financial_embarrassment!=null &&
              this.financial_embarrassment.equals(other.getFinancial_embarrassment()))) &&
            ((this.financial_legal_events==null && other.getFinancial_legal_events()==null) || 
             (this.financial_legal_events!=null &&
              this.financial_legal_events.equals(other.getFinancial_legal_events()))) &&
            ((this.operational_events==null && other.getOperational_events()==null) || 
             (this.operational_events!=null &&
              this.operational_events.equals(other.getOperational_events()))) &&
            ((this.other_events==null && other.getOther_events()==null) || 
             (this.other_events!=null &&
              this.other_events.equals(other.getOther_events()))) &&
            ((this.disaster==null && other.getDisaster()==null) || 
             (this.disaster!=null &&
              this.disaster.equals(other.getDisaster()))) &&
            ((this.secured_filings==null && other.getSecured_filings()==null) || 
             (this.secured_filings!=null &&
              this.secured_filings.equals(other.getSecured_filings()))) &&
            ((this.out_of_business==null && other.getOut_of_business()==null) || 
             (this.out_of_business!=null &&
              this.out_of_business.equals(other.getOut_of_business()))) &&
            ((this.history_indicator==null && other.getHistory_indicator()==null) || 
             (this.history_indicator!=null &&
              this.history_indicator.equals(other.getHistory_indicator()))) &&
            ((this.history_description==null && other.getHistory_description()==null) || 
             (this.history_description!=null &&
              this.history_description.equals(other.getHistory_description()))) &&
            ((this.income_statement_date==null && other.getIncome_statement_date()==null) || 
             (this.income_statement_date!=null &&
              this.income_statement_date.equals(other.getIncome_statement_date()))) &&
            ((this.income_statement_date_start==null && other.getIncome_statement_date_start()==null) || 
             (this.income_statement_date_start!=null &&
              this.income_statement_date_start.equals(other.getIncome_statement_date_start()))) &&
            ((this.income_statement_date_end==null && other.getIncome_statement_date_end()==null) || 
             (this.income_statement_date_end!=null &&
              this.income_statement_date_end.equals(other.getIncome_statement_date_end()))) &&
            ((this.financial_statement_date==null && other.getFinancial_statement_date()==null) || 
             (this.financial_statement_date!=null &&
              this.financial_statement_date.equals(other.getFinancial_statement_date()))) &&
            ((this.incorporation_year==null && other.getIncorporation_year()==null) || 
             (this.incorporation_year!=null &&
              this.incorporation_year.equals(other.getIncorporation_year()))) &&
            ((this.start_year==null && other.getStart_year()==null) || 
             (this.start_year!=null &&
              this.start_year.equals(other.getStart_year()))) &&
            ((this.current_control_year==null && other.getCurrent_control_year()==null) || 
             (this.current_control_year!=null &&
              this.current_control_year.equals(other.getCurrent_control_year()))) &&
            ((this.local_activity_code==null && other.getLocal_activity_code()==null) || 
             (this.local_activity_code!=null &&
              this.local_activity_code.equals(other.getLocal_activity_code()))) &&
            ((this.local_activity_code_type==null && other.getLocal_activity_code_type()==null) || 
             (this.local_activity_code_type!=null &&
              this.local_activity_code_type.equals(other.getLocal_activity_code_type()))) &&
            ((this.local_activity_description==null && other.getLocal_activity_description()==null) || 
             (this.local_activity_description!=null &&
              this.local_activity_description.equals(other.getLocal_activity_description()))) &&
            ((this.sic_activity_code==null && other.getSic_activity_code()==null) || 
             (this.sic_activity_code!=null &&
              this.sic_activity_code.equals(other.getSic_activity_code()))) &&
            ((this.sic_activity_description==null && other.getSic_activity_description()==null) || 
             (this.sic_activity_description!=null &&
              this.sic_activity_description.equals(other.getSic_activity_description()))) &&
            ((this.sic_version==null && other.getSic_version()==null) || 
             (this.sic_version!=null &&
              this.sic_version.equals(other.getSic_version()))) &&
            ((this.legal_form==null && other.getLegal_form()==null) || 
             (this.legal_form!=null &&
              this.legal_form.equals(other.getLegal_form()))) &&
            ((this.legal_form_description==null && other.getLegal_form_description()==null) || 
             (this.legal_form_description!=null &&
              this.legal_form_description.equals(other.getLegal_form_description()))) &&
            ((this.paydex_norm==null && other.getPaydex_norm()==null) || 
             (this.paydex_norm!=null &&
              this.paydex_norm.equals(other.getPaydex_norm()))) &&
            ((this.paydex_score==null && other.getPaydex_score()==null) || 
             (this.paydex_score!=null &&
              this.paydex_score.equals(other.getPaydex_score()))) &&
            ((this.dnb_rating==null && other.getDnb_rating()==null) || 
             (this.dnb_rating!=null &&
              this.dnb_rating.equals(other.getDnb_rating()))) &&
            ((this.maximum_credit==null && other.getMaximum_credit()==null) || 
             (this.maximum_credit!=null &&
              this.maximum_credit.equals(other.getMaximum_credit()))) &&
            ((this.maximum_credit_currency==null && other.getMaximum_credit_currency()==null) || 
             (this.maximum_credit_currency!=null &&
              this.maximum_credit_currency.equals(other.getMaximum_credit_currency()))) &&
            ((this.intangible_assets==null && other.getIntangible_assets()==null) || 
             (this.intangible_assets!=null &&
              this.intangible_assets.equals(other.getIntangible_assets()))) &&
            ((this.net_worth==null && other.getNet_worth()==null) || 
             (this.net_worth!=null &&
              this.net_worth.equals(other.getNet_worth()))) &&
            ((this.tangible_net_worth==null && other.getTangible_net_worth()==null) || 
             (this.tangible_net_worth!=null &&
              this.tangible_net_worth.equals(other.getTangible_net_worth()))) &&
            ((this.sales==null && other.getSales()==null) || 
             (this.sales!=null &&
              this.sales.equals(other.getSales()))) &&
            ((this.annual_sales==null && other.getAnnual_sales()==null) || 
             (this.annual_sales!=null &&
              this.annual_sales.equals(other.getAnnual_sales()))) &&
            ((this.employees_primary==null && other.getEmployees_primary()==null) || 
             (this.employees_primary!=null &&
              this.employees_primary.equals(other.getEmployees_primary()))) &&
            ((this.employees_total==null && other.getEmployees_total()==null) || 
             (this.employees_total!=null &&
              this.employees_total.equals(other.getEmployees_total()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names())));
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
        if (getDuns() != null) {
            _hashCode += getDuns().hashCode();
        }
        if (getDnb_key() != null) {
            _hashCode += getDnb_key().hashCode();
        }
        if (getEnquiry_duns() != null) {
            _hashCode += getEnquiry_duns().hashCode();
        }
        if (getBusiness_number() != null) {
            _hashCode += getBusiness_number().hashCode();
        }
        if (getBusiness_number_type() != null) {
            _hashCode += getBusiness_number_type().hashCode();
        }
        if (getBusiness_number_description() != null) {
            _hashCode += getBusiness_number_description().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSubregion() != null) {
            _hashCode += getSubregion().hashCode();
        }
        if (getCountry_calling_code() != null) {
            _hashCode += getCountry_calling_code().hashCode();
        }
        if (getPhone_number() != null) {
            _hashCode += getPhone_number().hashCode();
        }
        if (getFax_number() != null) {
            _hashCode += getFax_number().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCeo_name() != null) {
            _hashCode += getCeo_name().hashCode();
        }
        if (getCeo_title() != null) {
            _hashCode += getCeo_title().hashCode();
        }
        if (getPrincipal_name() != null) {
            _hashCode += getPrincipal_name().hashCode();
        }
        if (getPrincipal_title() != null) {
            _hashCode += getPrincipal_title().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getStatement_currency() != null) {
            _hashCode += getStatement_currency().hashCode();
        }
        if (getDebtor_inpossession() != null) {
            _hashCode += getDebtor_inpossession().hashCode();
        }
        if (getCriminal_proceedings() != null) {
            _hashCode += getCriminal_proceedings().hashCode();
        }
        if (getSuit_judgement() != null) {
            _hashCode += getSuit_judgement().hashCode();
        }
        if (getFinancial_embarrassment() != null) {
            _hashCode += getFinancial_embarrassment().hashCode();
        }
        if (getFinancial_legal_events() != null) {
            _hashCode += getFinancial_legal_events().hashCode();
        }
        if (getOperational_events() != null) {
            _hashCode += getOperational_events().hashCode();
        }
        if (getOther_events() != null) {
            _hashCode += getOther_events().hashCode();
        }
        if (getDisaster() != null) {
            _hashCode += getDisaster().hashCode();
        }
        if (getSecured_filings() != null) {
            _hashCode += getSecured_filings().hashCode();
        }
        if (getOut_of_business() != null) {
            _hashCode += getOut_of_business().hashCode();
        }
        if (getHistory_indicator() != null) {
            _hashCode += getHistory_indicator().hashCode();
        }
        if (getHistory_description() != null) {
            _hashCode += getHistory_description().hashCode();
        }
        if (getIncome_statement_date() != null) {
            _hashCode += getIncome_statement_date().hashCode();
        }
        if (getIncome_statement_date_start() != null) {
            _hashCode += getIncome_statement_date_start().hashCode();
        }
        if (getIncome_statement_date_end() != null) {
            _hashCode += getIncome_statement_date_end().hashCode();
        }
        if (getFinancial_statement_date() != null) {
            _hashCode += getFinancial_statement_date().hashCode();
        }
        if (getIncorporation_year() != null) {
            _hashCode += getIncorporation_year().hashCode();
        }
        if (getStart_year() != null) {
            _hashCode += getStart_year().hashCode();
        }
        if (getCurrent_control_year() != null) {
            _hashCode += getCurrent_control_year().hashCode();
        }
        if (getLocal_activity_code() != null) {
            _hashCode += getLocal_activity_code().hashCode();
        }
        if (getLocal_activity_code_type() != null) {
            _hashCode += getLocal_activity_code_type().hashCode();
        }
        if (getLocal_activity_description() != null) {
            _hashCode += getLocal_activity_description().hashCode();
        }
        if (getSic_activity_code() != null) {
            _hashCode += getSic_activity_code().hashCode();
        }
        if (getSic_activity_description() != null) {
            _hashCode += getSic_activity_description().hashCode();
        }
        if (getSic_version() != null) {
            _hashCode += getSic_version().hashCode();
        }
        if (getLegal_form() != null) {
            _hashCode += getLegal_form().hashCode();
        }
        if (getLegal_form_description() != null) {
            _hashCode += getLegal_form_description().hashCode();
        }
        if (getPaydex_norm() != null) {
            _hashCode += getPaydex_norm().hashCode();
        }
        if (getPaydex_score() != null) {
            _hashCode += getPaydex_score().hashCode();
        }
        if (getDnb_rating() != null) {
            _hashCode += getDnb_rating().hashCode();
        }
        if (getMaximum_credit() != null) {
            _hashCode += getMaximum_credit().hashCode();
        }
        if (getMaximum_credit_currency() != null) {
            _hashCode += getMaximum_credit_currency().hashCode();
        }
        if (getIntangible_assets() != null) {
            _hashCode += getIntangible_assets().hashCode();
        }
        if (getNet_worth() != null) {
            _hashCode += getNet_worth().hashCode();
        }
        if (getTangible_net_worth() != null) {
            _hashCode += getTangible_net_worth().hashCode();
        }
        if (getSales() != null) {
            _hashCode += getSales().hashCode();
        }
        if (getAnnual_sales() != null) {
            _hashCode += getAnnual_sales().hashCode();
        }
        if (getEmployees_primary() != null) {
            _hashCode += getEmployees_primary().hashCode();
        }
        if (getEmployees_total() != null) {
            _hashCode += getEmployees_total().hashCode();
        }
        if (getTrade_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrade_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrade_names(), i);
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
        new org.apache.axis.description.TypeDesc(DNBQuickCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBQuickCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnb_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnb_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiry_duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "enquiry_duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subregion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subregion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_calling_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_calling_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fax_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("principal_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "principal_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principal_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "principal_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "statement_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtor_inpossession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "debtor_inpossession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criminal_proceedings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "criminal_proceedings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suit_judgement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "suit_judgement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_embarrassment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_embarrassment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_legal_events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_legal_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operational_events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "operational_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disaster");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "disaster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secured_filings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secured_filings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "history_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "history_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("income_statement_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "income_statement_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("income_statement_date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "income_statement_date_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("income_statement_date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "income_statement_date_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_statement_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_statement_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incorporation_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "incorporation_year"));
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
        elemField.setFieldName("current_control_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_control_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local_activity_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "local_activity_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_activity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_activity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_activity_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_activity_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sic_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sic_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paydex_norm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paydex_norm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paydex_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paydex_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnb_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnb_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_credit_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_credit_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intangible_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "intangible_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_worth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_worth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tangible_net_worth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tangible_net_worth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMonetaryAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMonetaryAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBEmployeeCount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBEmployeeCount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
