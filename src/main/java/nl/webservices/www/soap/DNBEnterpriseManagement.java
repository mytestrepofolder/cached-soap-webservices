/**
 * DNBEnterpriseManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBEnterpriseManagement  implements java.io.Serializable {
    private nl.webservices.www.soap.DNBQuickCheck quickcheck;

    private java.lang.Boolean main_branch_indication;

    private java.lang.Boolean indate_indicator;

    private java.lang.String registration_type;

    private java.lang.Boolean import_indicator;

    private java.lang.Boolean export_indicator;

    private java.lang.String location_ownership;

    private java.lang.Boolean claims_indicator;

    private java.lang.Integer paydex_score_earlier;

    private java.lang.Integer average_high_credit;

    private java.lang.Integer high_credit;

    private java.lang.Integer total_payments;

    private nl.webservices.www.soap.DNBRelatedBusiness headquarters;

    private nl.webservices.www.soap.DNBRelatedBusiness parent;

    private nl.webservices.www.soap.DNBRelatedBusiness domestic_ultimate;

    private nl.webservices.www.soap.DNBRelatedBusiness global_ultimate;

    private java.lang.Boolean is_subsidiary_location;

    private java.lang.String location_status;

    private java.lang.Boolean accounts_audited;

    private java.lang.Boolean statement_consolidated;

    private java.lang.Boolean figures_estimated;

    private java.lang.Boolean figures_forecast;

    private java.lang.Boolean year_period;

    private java.lang.Boolean figures_final;

    private java.lang.Boolean opening_statement;

    private java.lang.Boolean figures_proforma;

    private java.lang.Boolean trial_balance;

    private java.lang.Boolean figures_signed;

    private java.lang.Boolean figures_restated;

    private java.lang.Boolean figures_unbalanced;

    private java.lang.Boolean figures_qualified;

    private java.lang.Integer accounts_receivable;

    private java.lang.Integer liquid_assets;

    private java.lang.Integer inventory;

    private java.lang.Integer total_current_assets;

    private java.lang.Integer total_assets;

    private java.lang.Integer accounts_payable;

    private java.lang.Integer total_current_liabilities;

    private java.lang.Integer total_liabilities;

    private java.lang.Integer net_income;

    private java.math.BigDecimal quick_ratio;

    private java.math.BigDecimal current_ratio;

    private java.lang.Integer previous_net_worth;

    private java.lang.Integer previous_sales;

    private java.lang.String previous_statement_date;

    private java.lang.String line_of_business;

    private nl.webservices.www.soap.DNBScoreGroup[] failure_score;

    private nl.webservices.www.soap.DNBScoreGroup[] credit_score;

    private nl.webservices.www.soap.DNBScoreGroup[] global_failure_score;

    public DNBEnterpriseManagement() {
    }

    public DNBEnterpriseManagement(
           nl.webservices.www.soap.DNBQuickCheck quickcheck,
           java.lang.Boolean main_branch_indication,
           java.lang.Boolean indate_indicator,
           java.lang.String registration_type,
           java.lang.Boolean import_indicator,
           java.lang.Boolean export_indicator,
           java.lang.String location_ownership,
           java.lang.Boolean claims_indicator,
           java.lang.Integer paydex_score_earlier,
           java.lang.Integer average_high_credit,
           java.lang.Integer high_credit,
           java.lang.Integer total_payments,
           nl.webservices.www.soap.DNBRelatedBusiness headquarters,
           nl.webservices.www.soap.DNBRelatedBusiness parent,
           nl.webservices.www.soap.DNBRelatedBusiness domestic_ultimate,
           nl.webservices.www.soap.DNBRelatedBusiness global_ultimate,
           java.lang.Boolean is_subsidiary_location,
           java.lang.String location_status,
           java.lang.Boolean accounts_audited,
           java.lang.Boolean statement_consolidated,
           java.lang.Boolean figures_estimated,
           java.lang.Boolean figures_forecast,
           java.lang.Boolean year_period,
           java.lang.Boolean figures_final,
           java.lang.Boolean opening_statement,
           java.lang.Boolean figures_proforma,
           java.lang.Boolean trial_balance,
           java.lang.Boolean figures_signed,
           java.lang.Boolean figures_restated,
           java.lang.Boolean figures_unbalanced,
           java.lang.Boolean figures_qualified,
           java.lang.Integer accounts_receivable,
           java.lang.Integer liquid_assets,
           java.lang.Integer inventory,
           java.lang.Integer total_current_assets,
           java.lang.Integer total_assets,
           java.lang.Integer accounts_payable,
           java.lang.Integer total_current_liabilities,
           java.lang.Integer total_liabilities,
           java.lang.Integer net_income,
           java.math.BigDecimal quick_ratio,
           java.math.BigDecimal current_ratio,
           java.lang.Integer previous_net_worth,
           java.lang.Integer previous_sales,
           java.lang.String previous_statement_date,
           java.lang.String line_of_business,
           nl.webservices.www.soap.DNBScoreGroup[] failure_score,
           nl.webservices.www.soap.DNBScoreGroup[] credit_score,
           nl.webservices.www.soap.DNBScoreGroup[] global_failure_score) {
           this.quickcheck = quickcheck;
           this.main_branch_indication = main_branch_indication;
           this.indate_indicator = indate_indicator;
           this.registration_type = registration_type;
           this.import_indicator = import_indicator;
           this.export_indicator = export_indicator;
           this.location_ownership = location_ownership;
           this.claims_indicator = claims_indicator;
           this.paydex_score_earlier = paydex_score_earlier;
           this.average_high_credit = average_high_credit;
           this.high_credit = high_credit;
           this.total_payments = total_payments;
           this.headquarters = headquarters;
           this.parent = parent;
           this.domestic_ultimate = domestic_ultimate;
           this.global_ultimate = global_ultimate;
           this.is_subsidiary_location = is_subsidiary_location;
           this.location_status = location_status;
           this.accounts_audited = accounts_audited;
           this.statement_consolidated = statement_consolidated;
           this.figures_estimated = figures_estimated;
           this.figures_forecast = figures_forecast;
           this.year_period = year_period;
           this.figures_final = figures_final;
           this.opening_statement = opening_statement;
           this.figures_proforma = figures_proforma;
           this.trial_balance = trial_balance;
           this.figures_signed = figures_signed;
           this.figures_restated = figures_restated;
           this.figures_unbalanced = figures_unbalanced;
           this.figures_qualified = figures_qualified;
           this.accounts_receivable = accounts_receivable;
           this.liquid_assets = liquid_assets;
           this.inventory = inventory;
           this.total_current_assets = total_current_assets;
           this.total_assets = total_assets;
           this.accounts_payable = accounts_payable;
           this.total_current_liabilities = total_current_liabilities;
           this.total_liabilities = total_liabilities;
           this.net_income = net_income;
           this.quick_ratio = quick_ratio;
           this.current_ratio = current_ratio;
           this.previous_net_worth = previous_net_worth;
           this.previous_sales = previous_sales;
           this.previous_statement_date = previous_statement_date;
           this.line_of_business = line_of_business;
           this.failure_score = failure_score;
           this.credit_score = credit_score;
           this.global_failure_score = global_failure_score;
    }


    /**
     * Gets the quickcheck value for this DNBEnterpriseManagement.
     * 
     * @return quickcheck
     */
    public nl.webservices.www.soap.DNBQuickCheck getQuickcheck() {
        return quickcheck;
    }


    /**
     * Sets the quickcheck value for this DNBEnterpriseManagement.
     * 
     * @param quickcheck
     */
    public void setQuickcheck(nl.webservices.www.soap.DNBQuickCheck quickcheck) {
        this.quickcheck = quickcheck;
    }


    /**
     * Gets the main_branch_indication value for this DNBEnterpriseManagement.
     * 
     * @return main_branch_indication
     */
    public java.lang.Boolean getMain_branch_indication() {
        return main_branch_indication;
    }


    /**
     * Sets the main_branch_indication value for this DNBEnterpriseManagement.
     * 
     * @param main_branch_indication
     */
    public void setMain_branch_indication(java.lang.Boolean main_branch_indication) {
        this.main_branch_indication = main_branch_indication;
    }


    /**
     * Gets the indate_indicator value for this DNBEnterpriseManagement.
     * 
     * @return indate_indicator
     */
    public java.lang.Boolean getIndate_indicator() {
        return indate_indicator;
    }


    /**
     * Sets the indate_indicator value for this DNBEnterpriseManagement.
     * 
     * @param indate_indicator
     */
    public void setIndate_indicator(java.lang.Boolean indate_indicator) {
        this.indate_indicator = indate_indicator;
    }


    /**
     * Gets the registration_type value for this DNBEnterpriseManagement.
     * 
     * @return registration_type
     */
    public java.lang.String getRegistration_type() {
        return registration_type;
    }


    /**
     * Sets the registration_type value for this DNBEnterpriseManagement.
     * 
     * @param registration_type
     */
    public void setRegistration_type(java.lang.String registration_type) {
        this.registration_type = registration_type;
    }


    /**
     * Gets the import_indicator value for this DNBEnterpriseManagement.
     * 
     * @return import_indicator
     */
    public java.lang.Boolean getImport_indicator() {
        return import_indicator;
    }


    /**
     * Sets the import_indicator value for this DNBEnterpriseManagement.
     * 
     * @param import_indicator
     */
    public void setImport_indicator(java.lang.Boolean import_indicator) {
        this.import_indicator = import_indicator;
    }


    /**
     * Gets the export_indicator value for this DNBEnterpriseManagement.
     * 
     * @return export_indicator
     */
    public java.lang.Boolean getExport_indicator() {
        return export_indicator;
    }


    /**
     * Sets the export_indicator value for this DNBEnterpriseManagement.
     * 
     * @param export_indicator
     */
    public void setExport_indicator(java.lang.Boolean export_indicator) {
        this.export_indicator = export_indicator;
    }


    /**
     * Gets the location_ownership value for this DNBEnterpriseManagement.
     * 
     * @return location_ownership
     */
    public java.lang.String getLocation_ownership() {
        return location_ownership;
    }


    /**
     * Sets the location_ownership value for this DNBEnterpriseManagement.
     * 
     * @param location_ownership
     */
    public void setLocation_ownership(java.lang.String location_ownership) {
        this.location_ownership = location_ownership;
    }


    /**
     * Gets the claims_indicator value for this DNBEnterpriseManagement.
     * 
     * @return claims_indicator
     */
    public java.lang.Boolean getClaims_indicator() {
        return claims_indicator;
    }


    /**
     * Sets the claims_indicator value for this DNBEnterpriseManagement.
     * 
     * @param claims_indicator
     */
    public void setClaims_indicator(java.lang.Boolean claims_indicator) {
        this.claims_indicator = claims_indicator;
    }


    /**
     * Gets the paydex_score_earlier value for this DNBEnterpriseManagement.
     * 
     * @return paydex_score_earlier
     */
    public java.lang.Integer getPaydex_score_earlier() {
        return paydex_score_earlier;
    }


    /**
     * Sets the paydex_score_earlier value for this DNBEnterpriseManagement.
     * 
     * @param paydex_score_earlier
     */
    public void setPaydex_score_earlier(java.lang.Integer paydex_score_earlier) {
        this.paydex_score_earlier = paydex_score_earlier;
    }


    /**
     * Gets the average_high_credit value for this DNBEnterpriseManagement.
     * 
     * @return average_high_credit
     */
    public java.lang.Integer getAverage_high_credit() {
        return average_high_credit;
    }


    /**
     * Sets the average_high_credit value for this DNBEnterpriseManagement.
     * 
     * @param average_high_credit
     */
    public void setAverage_high_credit(java.lang.Integer average_high_credit) {
        this.average_high_credit = average_high_credit;
    }


    /**
     * Gets the high_credit value for this DNBEnterpriseManagement.
     * 
     * @return high_credit
     */
    public java.lang.Integer getHigh_credit() {
        return high_credit;
    }


    /**
     * Sets the high_credit value for this DNBEnterpriseManagement.
     * 
     * @param high_credit
     */
    public void setHigh_credit(java.lang.Integer high_credit) {
        this.high_credit = high_credit;
    }


    /**
     * Gets the total_payments value for this DNBEnterpriseManagement.
     * 
     * @return total_payments
     */
    public java.lang.Integer getTotal_payments() {
        return total_payments;
    }


    /**
     * Sets the total_payments value for this DNBEnterpriseManagement.
     * 
     * @param total_payments
     */
    public void setTotal_payments(java.lang.Integer total_payments) {
        this.total_payments = total_payments;
    }


    /**
     * Gets the headquarters value for this DNBEnterpriseManagement.
     * 
     * @return headquarters
     */
    public nl.webservices.www.soap.DNBRelatedBusiness getHeadquarters() {
        return headquarters;
    }


    /**
     * Sets the headquarters value for this DNBEnterpriseManagement.
     * 
     * @param headquarters
     */
    public void setHeadquarters(nl.webservices.www.soap.DNBRelatedBusiness headquarters) {
        this.headquarters = headquarters;
    }


    /**
     * Gets the parent value for this DNBEnterpriseManagement.
     * 
     * @return parent
     */
    public nl.webservices.www.soap.DNBRelatedBusiness getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this DNBEnterpriseManagement.
     * 
     * @param parent
     */
    public void setParent(nl.webservices.www.soap.DNBRelatedBusiness parent) {
        this.parent = parent;
    }


    /**
     * Gets the domestic_ultimate value for this DNBEnterpriseManagement.
     * 
     * @return domestic_ultimate
     */
    public nl.webservices.www.soap.DNBRelatedBusiness getDomestic_ultimate() {
        return domestic_ultimate;
    }


    /**
     * Sets the domestic_ultimate value for this DNBEnterpriseManagement.
     * 
     * @param domestic_ultimate
     */
    public void setDomestic_ultimate(nl.webservices.www.soap.DNBRelatedBusiness domestic_ultimate) {
        this.domestic_ultimate = domestic_ultimate;
    }


    /**
     * Gets the global_ultimate value for this DNBEnterpriseManagement.
     * 
     * @return global_ultimate
     */
    public nl.webservices.www.soap.DNBRelatedBusiness getGlobal_ultimate() {
        return global_ultimate;
    }


    /**
     * Sets the global_ultimate value for this DNBEnterpriseManagement.
     * 
     * @param global_ultimate
     */
    public void setGlobal_ultimate(nl.webservices.www.soap.DNBRelatedBusiness global_ultimate) {
        this.global_ultimate = global_ultimate;
    }


    /**
     * Gets the is_subsidiary_location value for this DNBEnterpriseManagement.
     * 
     * @return is_subsidiary_location
     */
    public java.lang.Boolean getIs_subsidiary_location() {
        return is_subsidiary_location;
    }


    /**
     * Sets the is_subsidiary_location value for this DNBEnterpriseManagement.
     * 
     * @param is_subsidiary_location
     */
    public void setIs_subsidiary_location(java.lang.Boolean is_subsidiary_location) {
        this.is_subsidiary_location = is_subsidiary_location;
    }


    /**
     * Gets the location_status value for this DNBEnterpriseManagement.
     * 
     * @return location_status
     */
    public java.lang.String getLocation_status() {
        return location_status;
    }


    /**
     * Sets the location_status value for this DNBEnterpriseManagement.
     * 
     * @param location_status
     */
    public void setLocation_status(java.lang.String location_status) {
        this.location_status = location_status;
    }


    /**
     * Gets the accounts_audited value for this DNBEnterpriseManagement.
     * 
     * @return accounts_audited
     */
    public java.lang.Boolean getAccounts_audited() {
        return accounts_audited;
    }


    /**
     * Sets the accounts_audited value for this DNBEnterpriseManagement.
     * 
     * @param accounts_audited
     */
    public void setAccounts_audited(java.lang.Boolean accounts_audited) {
        this.accounts_audited = accounts_audited;
    }


    /**
     * Gets the statement_consolidated value for this DNBEnterpriseManagement.
     * 
     * @return statement_consolidated
     */
    public java.lang.Boolean getStatement_consolidated() {
        return statement_consolidated;
    }


    /**
     * Sets the statement_consolidated value for this DNBEnterpriseManagement.
     * 
     * @param statement_consolidated
     */
    public void setStatement_consolidated(java.lang.Boolean statement_consolidated) {
        this.statement_consolidated = statement_consolidated;
    }


    /**
     * Gets the figures_estimated value for this DNBEnterpriseManagement.
     * 
     * @return figures_estimated
     */
    public java.lang.Boolean getFigures_estimated() {
        return figures_estimated;
    }


    /**
     * Sets the figures_estimated value for this DNBEnterpriseManagement.
     * 
     * @param figures_estimated
     */
    public void setFigures_estimated(java.lang.Boolean figures_estimated) {
        this.figures_estimated = figures_estimated;
    }


    /**
     * Gets the figures_forecast value for this DNBEnterpriseManagement.
     * 
     * @return figures_forecast
     */
    public java.lang.Boolean getFigures_forecast() {
        return figures_forecast;
    }


    /**
     * Sets the figures_forecast value for this DNBEnterpriseManagement.
     * 
     * @param figures_forecast
     */
    public void setFigures_forecast(java.lang.Boolean figures_forecast) {
        this.figures_forecast = figures_forecast;
    }


    /**
     * Gets the year_period value for this DNBEnterpriseManagement.
     * 
     * @return year_period
     */
    public java.lang.Boolean getYear_period() {
        return year_period;
    }


    /**
     * Sets the year_period value for this DNBEnterpriseManagement.
     * 
     * @param year_period
     */
    public void setYear_period(java.lang.Boolean year_period) {
        this.year_period = year_period;
    }


    /**
     * Gets the figures_final value for this DNBEnterpriseManagement.
     * 
     * @return figures_final
     */
    public java.lang.Boolean getFigures_final() {
        return figures_final;
    }


    /**
     * Sets the figures_final value for this DNBEnterpriseManagement.
     * 
     * @param figures_final
     */
    public void setFigures_final(java.lang.Boolean figures_final) {
        this.figures_final = figures_final;
    }


    /**
     * Gets the opening_statement value for this DNBEnterpriseManagement.
     * 
     * @return opening_statement
     */
    public java.lang.Boolean getOpening_statement() {
        return opening_statement;
    }


    /**
     * Sets the opening_statement value for this DNBEnterpriseManagement.
     * 
     * @param opening_statement
     */
    public void setOpening_statement(java.lang.Boolean opening_statement) {
        this.opening_statement = opening_statement;
    }


    /**
     * Gets the figures_proforma value for this DNBEnterpriseManagement.
     * 
     * @return figures_proforma
     */
    public java.lang.Boolean getFigures_proforma() {
        return figures_proforma;
    }


    /**
     * Sets the figures_proforma value for this DNBEnterpriseManagement.
     * 
     * @param figures_proforma
     */
    public void setFigures_proforma(java.lang.Boolean figures_proforma) {
        this.figures_proforma = figures_proforma;
    }


    /**
     * Gets the trial_balance value for this DNBEnterpriseManagement.
     * 
     * @return trial_balance
     */
    public java.lang.Boolean getTrial_balance() {
        return trial_balance;
    }


    /**
     * Sets the trial_balance value for this DNBEnterpriseManagement.
     * 
     * @param trial_balance
     */
    public void setTrial_balance(java.lang.Boolean trial_balance) {
        this.trial_balance = trial_balance;
    }


    /**
     * Gets the figures_signed value for this DNBEnterpriseManagement.
     * 
     * @return figures_signed
     */
    public java.lang.Boolean getFigures_signed() {
        return figures_signed;
    }


    /**
     * Sets the figures_signed value for this DNBEnterpriseManagement.
     * 
     * @param figures_signed
     */
    public void setFigures_signed(java.lang.Boolean figures_signed) {
        this.figures_signed = figures_signed;
    }


    /**
     * Gets the figures_restated value for this DNBEnterpriseManagement.
     * 
     * @return figures_restated
     */
    public java.lang.Boolean getFigures_restated() {
        return figures_restated;
    }


    /**
     * Sets the figures_restated value for this DNBEnterpriseManagement.
     * 
     * @param figures_restated
     */
    public void setFigures_restated(java.lang.Boolean figures_restated) {
        this.figures_restated = figures_restated;
    }


    /**
     * Gets the figures_unbalanced value for this DNBEnterpriseManagement.
     * 
     * @return figures_unbalanced
     */
    public java.lang.Boolean getFigures_unbalanced() {
        return figures_unbalanced;
    }


    /**
     * Sets the figures_unbalanced value for this DNBEnterpriseManagement.
     * 
     * @param figures_unbalanced
     */
    public void setFigures_unbalanced(java.lang.Boolean figures_unbalanced) {
        this.figures_unbalanced = figures_unbalanced;
    }


    /**
     * Gets the figures_qualified value for this DNBEnterpriseManagement.
     * 
     * @return figures_qualified
     */
    public java.lang.Boolean getFigures_qualified() {
        return figures_qualified;
    }


    /**
     * Sets the figures_qualified value for this DNBEnterpriseManagement.
     * 
     * @param figures_qualified
     */
    public void setFigures_qualified(java.lang.Boolean figures_qualified) {
        this.figures_qualified = figures_qualified;
    }


    /**
     * Gets the accounts_receivable value for this DNBEnterpriseManagement.
     * 
     * @return accounts_receivable
     */
    public java.lang.Integer getAccounts_receivable() {
        return accounts_receivable;
    }


    /**
     * Sets the accounts_receivable value for this DNBEnterpriseManagement.
     * 
     * @param accounts_receivable
     */
    public void setAccounts_receivable(java.lang.Integer accounts_receivable) {
        this.accounts_receivable = accounts_receivable;
    }


    /**
     * Gets the liquid_assets value for this DNBEnterpriseManagement.
     * 
     * @return liquid_assets
     */
    public java.lang.Integer getLiquid_assets() {
        return liquid_assets;
    }


    /**
     * Sets the liquid_assets value for this DNBEnterpriseManagement.
     * 
     * @param liquid_assets
     */
    public void setLiquid_assets(java.lang.Integer liquid_assets) {
        this.liquid_assets = liquid_assets;
    }


    /**
     * Gets the inventory value for this DNBEnterpriseManagement.
     * 
     * @return inventory
     */
    public java.lang.Integer getInventory() {
        return inventory;
    }


    /**
     * Sets the inventory value for this DNBEnterpriseManagement.
     * 
     * @param inventory
     */
    public void setInventory(java.lang.Integer inventory) {
        this.inventory = inventory;
    }


    /**
     * Gets the total_current_assets value for this DNBEnterpriseManagement.
     * 
     * @return total_current_assets
     */
    public java.lang.Integer getTotal_current_assets() {
        return total_current_assets;
    }


    /**
     * Sets the total_current_assets value for this DNBEnterpriseManagement.
     * 
     * @param total_current_assets
     */
    public void setTotal_current_assets(java.lang.Integer total_current_assets) {
        this.total_current_assets = total_current_assets;
    }


    /**
     * Gets the total_assets value for this DNBEnterpriseManagement.
     * 
     * @return total_assets
     */
    public java.lang.Integer getTotal_assets() {
        return total_assets;
    }


    /**
     * Sets the total_assets value for this DNBEnterpriseManagement.
     * 
     * @param total_assets
     */
    public void setTotal_assets(java.lang.Integer total_assets) {
        this.total_assets = total_assets;
    }


    /**
     * Gets the accounts_payable value for this DNBEnterpriseManagement.
     * 
     * @return accounts_payable
     */
    public java.lang.Integer getAccounts_payable() {
        return accounts_payable;
    }


    /**
     * Sets the accounts_payable value for this DNBEnterpriseManagement.
     * 
     * @param accounts_payable
     */
    public void setAccounts_payable(java.lang.Integer accounts_payable) {
        this.accounts_payable = accounts_payable;
    }


    /**
     * Gets the total_current_liabilities value for this DNBEnterpriseManagement.
     * 
     * @return total_current_liabilities
     */
    public java.lang.Integer getTotal_current_liabilities() {
        return total_current_liabilities;
    }


    /**
     * Sets the total_current_liabilities value for this DNBEnterpriseManagement.
     * 
     * @param total_current_liabilities
     */
    public void setTotal_current_liabilities(java.lang.Integer total_current_liabilities) {
        this.total_current_liabilities = total_current_liabilities;
    }


    /**
     * Gets the total_liabilities value for this DNBEnterpriseManagement.
     * 
     * @return total_liabilities
     */
    public java.lang.Integer getTotal_liabilities() {
        return total_liabilities;
    }


    /**
     * Sets the total_liabilities value for this DNBEnterpriseManagement.
     * 
     * @param total_liabilities
     */
    public void setTotal_liabilities(java.lang.Integer total_liabilities) {
        this.total_liabilities = total_liabilities;
    }


    /**
     * Gets the net_income value for this DNBEnterpriseManagement.
     * 
     * @return net_income
     */
    public java.lang.Integer getNet_income() {
        return net_income;
    }


    /**
     * Sets the net_income value for this DNBEnterpriseManagement.
     * 
     * @param net_income
     */
    public void setNet_income(java.lang.Integer net_income) {
        this.net_income = net_income;
    }


    /**
     * Gets the quick_ratio value for this DNBEnterpriseManagement.
     * 
     * @return quick_ratio
     */
    public java.math.BigDecimal getQuick_ratio() {
        return quick_ratio;
    }


    /**
     * Sets the quick_ratio value for this DNBEnterpriseManagement.
     * 
     * @param quick_ratio
     */
    public void setQuick_ratio(java.math.BigDecimal quick_ratio) {
        this.quick_ratio = quick_ratio;
    }


    /**
     * Gets the current_ratio value for this DNBEnterpriseManagement.
     * 
     * @return current_ratio
     */
    public java.math.BigDecimal getCurrent_ratio() {
        return current_ratio;
    }


    /**
     * Sets the current_ratio value for this DNBEnterpriseManagement.
     * 
     * @param current_ratio
     */
    public void setCurrent_ratio(java.math.BigDecimal current_ratio) {
        this.current_ratio = current_ratio;
    }


    /**
     * Gets the previous_net_worth value for this DNBEnterpriseManagement.
     * 
     * @return previous_net_worth
     */
    public java.lang.Integer getPrevious_net_worth() {
        return previous_net_worth;
    }


    /**
     * Sets the previous_net_worth value for this DNBEnterpriseManagement.
     * 
     * @param previous_net_worth
     */
    public void setPrevious_net_worth(java.lang.Integer previous_net_worth) {
        this.previous_net_worth = previous_net_worth;
    }


    /**
     * Gets the previous_sales value for this DNBEnterpriseManagement.
     * 
     * @return previous_sales
     */
    public java.lang.Integer getPrevious_sales() {
        return previous_sales;
    }


    /**
     * Sets the previous_sales value for this DNBEnterpriseManagement.
     * 
     * @param previous_sales
     */
    public void setPrevious_sales(java.lang.Integer previous_sales) {
        this.previous_sales = previous_sales;
    }


    /**
     * Gets the previous_statement_date value for this DNBEnterpriseManagement.
     * 
     * @return previous_statement_date
     */
    public java.lang.String getPrevious_statement_date() {
        return previous_statement_date;
    }


    /**
     * Sets the previous_statement_date value for this DNBEnterpriseManagement.
     * 
     * @param previous_statement_date
     */
    public void setPrevious_statement_date(java.lang.String previous_statement_date) {
        this.previous_statement_date = previous_statement_date;
    }


    /**
     * Gets the line_of_business value for this DNBEnterpriseManagement.
     * 
     * @return line_of_business
     */
    public java.lang.String getLine_of_business() {
        return line_of_business;
    }


    /**
     * Sets the line_of_business value for this DNBEnterpriseManagement.
     * 
     * @param line_of_business
     */
    public void setLine_of_business(java.lang.String line_of_business) {
        this.line_of_business = line_of_business;
    }


    /**
     * Gets the failure_score value for this DNBEnterpriseManagement.
     * 
     * @return failure_score
     */
    public nl.webservices.www.soap.DNBScoreGroup[] getFailure_score() {
        return failure_score;
    }


    /**
     * Sets the failure_score value for this DNBEnterpriseManagement.
     * 
     * @param failure_score
     */
    public void setFailure_score(nl.webservices.www.soap.DNBScoreGroup[] failure_score) {
        this.failure_score = failure_score;
    }


    /**
     * Gets the credit_score value for this DNBEnterpriseManagement.
     * 
     * @return credit_score
     */
    public nl.webservices.www.soap.DNBScoreGroup[] getCredit_score() {
        return credit_score;
    }


    /**
     * Sets the credit_score value for this DNBEnterpriseManagement.
     * 
     * @param credit_score
     */
    public void setCredit_score(nl.webservices.www.soap.DNBScoreGroup[] credit_score) {
        this.credit_score = credit_score;
    }


    /**
     * Gets the global_failure_score value for this DNBEnterpriseManagement.
     * 
     * @return global_failure_score
     */
    public nl.webservices.www.soap.DNBScoreGroup[] getGlobal_failure_score() {
        return global_failure_score;
    }


    /**
     * Sets the global_failure_score value for this DNBEnterpriseManagement.
     * 
     * @param global_failure_score
     */
    public void setGlobal_failure_score(nl.webservices.www.soap.DNBScoreGroup[] global_failure_score) {
        this.global_failure_score = global_failure_score;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBEnterpriseManagement)) return false;
        DNBEnterpriseManagement other = (DNBEnterpriseManagement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quickcheck==null && other.getQuickcheck()==null) || 
             (this.quickcheck!=null &&
              this.quickcheck.equals(other.getQuickcheck()))) &&
            ((this.main_branch_indication==null && other.getMain_branch_indication()==null) || 
             (this.main_branch_indication!=null &&
              this.main_branch_indication.equals(other.getMain_branch_indication()))) &&
            ((this.indate_indicator==null && other.getIndate_indicator()==null) || 
             (this.indate_indicator!=null &&
              this.indate_indicator.equals(other.getIndate_indicator()))) &&
            ((this.registration_type==null && other.getRegistration_type()==null) || 
             (this.registration_type!=null &&
              this.registration_type.equals(other.getRegistration_type()))) &&
            ((this.import_indicator==null && other.getImport_indicator()==null) || 
             (this.import_indicator!=null &&
              this.import_indicator.equals(other.getImport_indicator()))) &&
            ((this.export_indicator==null && other.getExport_indicator()==null) || 
             (this.export_indicator!=null &&
              this.export_indicator.equals(other.getExport_indicator()))) &&
            ((this.location_ownership==null && other.getLocation_ownership()==null) || 
             (this.location_ownership!=null &&
              this.location_ownership.equals(other.getLocation_ownership()))) &&
            ((this.claims_indicator==null && other.getClaims_indicator()==null) || 
             (this.claims_indicator!=null &&
              this.claims_indicator.equals(other.getClaims_indicator()))) &&
            ((this.paydex_score_earlier==null && other.getPaydex_score_earlier()==null) || 
             (this.paydex_score_earlier!=null &&
              this.paydex_score_earlier.equals(other.getPaydex_score_earlier()))) &&
            ((this.average_high_credit==null && other.getAverage_high_credit()==null) || 
             (this.average_high_credit!=null &&
              this.average_high_credit.equals(other.getAverage_high_credit()))) &&
            ((this.high_credit==null && other.getHigh_credit()==null) || 
             (this.high_credit!=null &&
              this.high_credit.equals(other.getHigh_credit()))) &&
            ((this.total_payments==null && other.getTotal_payments()==null) || 
             (this.total_payments!=null &&
              this.total_payments.equals(other.getTotal_payments()))) &&
            ((this.headquarters==null && other.getHeadquarters()==null) || 
             (this.headquarters!=null &&
              this.headquarters.equals(other.getHeadquarters()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.domestic_ultimate==null && other.getDomestic_ultimate()==null) || 
             (this.domestic_ultimate!=null &&
              this.domestic_ultimate.equals(other.getDomestic_ultimate()))) &&
            ((this.global_ultimate==null && other.getGlobal_ultimate()==null) || 
             (this.global_ultimate!=null &&
              this.global_ultimate.equals(other.getGlobal_ultimate()))) &&
            ((this.is_subsidiary_location==null && other.getIs_subsidiary_location()==null) || 
             (this.is_subsidiary_location!=null &&
              this.is_subsidiary_location.equals(other.getIs_subsidiary_location()))) &&
            ((this.location_status==null && other.getLocation_status()==null) || 
             (this.location_status!=null &&
              this.location_status.equals(other.getLocation_status()))) &&
            ((this.accounts_audited==null && other.getAccounts_audited()==null) || 
             (this.accounts_audited!=null &&
              this.accounts_audited.equals(other.getAccounts_audited()))) &&
            ((this.statement_consolidated==null && other.getStatement_consolidated()==null) || 
             (this.statement_consolidated!=null &&
              this.statement_consolidated.equals(other.getStatement_consolidated()))) &&
            ((this.figures_estimated==null && other.getFigures_estimated()==null) || 
             (this.figures_estimated!=null &&
              this.figures_estimated.equals(other.getFigures_estimated()))) &&
            ((this.figures_forecast==null && other.getFigures_forecast()==null) || 
             (this.figures_forecast!=null &&
              this.figures_forecast.equals(other.getFigures_forecast()))) &&
            ((this.year_period==null && other.getYear_period()==null) || 
             (this.year_period!=null &&
              this.year_period.equals(other.getYear_period()))) &&
            ((this.figures_final==null && other.getFigures_final()==null) || 
             (this.figures_final!=null &&
              this.figures_final.equals(other.getFigures_final()))) &&
            ((this.opening_statement==null && other.getOpening_statement()==null) || 
             (this.opening_statement!=null &&
              this.opening_statement.equals(other.getOpening_statement()))) &&
            ((this.figures_proforma==null && other.getFigures_proforma()==null) || 
             (this.figures_proforma!=null &&
              this.figures_proforma.equals(other.getFigures_proforma()))) &&
            ((this.trial_balance==null && other.getTrial_balance()==null) || 
             (this.trial_balance!=null &&
              this.trial_balance.equals(other.getTrial_balance()))) &&
            ((this.figures_signed==null && other.getFigures_signed()==null) || 
             (this.figures_signed!=null &&
              this.figures_signed.equals(other.getFigures_signed()))) &&
            ((this.figures_restated==null && other.getFigures_restated()==null) || 
             (this.figures_restated!=null &&
              this.figures_restated.equals(other.getFigures_restated()))) &&
            ((this.figures_unbalanced==null && other.getFigures_unbalanced()==null) || 
             (this.figures_unbalanced!=null &&
              this.figures_unbalanced.equals(other.getFigures_unbalanced()))) &&
            ((this.figures_qualified==null && other.getFigures_qualified()==null) || 
             (this.figures_qualified!=null &&
              this.figures_qualified.equals(other.getFigures_qualified()))) &&
            ((this.accounts_receivable==null && other.getAccounts_receivable()==null) || 
             (this.accounts_receivable!=null &&
              this.accounts_receivable.equals(other.getAccounts_receivable()))) &&
            ((this.liquid_assets==null && other.getLiquid_assets()==null) || 
             (this.liquid_assets!=null &&
              this.liquid_assets.equals(other.getLiquid_assets()))) &&
            ((this.inventory==null && other.getInventory()==null) || 
             (this.inventory!=null &&
              this.inventory.equals(other.getInventory()))) &&
            ((this.total_current_assets==null && other.getTotal_current_assets()==null) || 
             (this.total_current_assets!=null &&
              this.total_current_assets.equals(other.getTotal_current_assets()))) &&
            ((this.total_assets==null && other.getTotal_assets()==null) || 
             (this.total_assets!=null &&
              this.total_assets.equals(other.getTotal_assets()))) &&
            ((this.accounts_payable==null && other.getAccounts_payable()==null) || 
             (this.accounts_payable!=null &&
              this.accounts_payable.equals(other.getAccounts_payable()))) &&
            ((this.total_current_liabilities==null && other.getTotal_current_liabilities()==null) || 
             (this.total_current_liabilities!=null &&
              this.total_current_liabilities.equals(other.getTotal_current_liabilities()))) &&
            ((this.total_liabilities==null && other.getTotal_liabilities()==null) || 
             (this.total_liabilities!=null &&
              this.total_liabilities.equals(other.getTotal_liabilities()))) &&
            ((this.net_income==null && other.getNet_income()==null) || 
             (this.net_income!=null &&
              this.net_income.equals(other.getNet_income()))) &&
            ((this.quick_ratio==null && other.getQuick_ratio()==null) || 
             (this.quick_ratio!=null &&
              this.quick_ratio.equals(other.getQuick_ratio()))) &&
            ((this.current_ratio==null && other.getCurrent_ratio()==null) || 
             (this.current_ratio!=null &&
              this.current_ratio.equals(other.getCurrent_ratio()))) &&
            ((this.previous_net_worth==null && other.getPrevious_net_worth()==null) || 
             (this.previous_net_worth!=null &&
              this.previous_net_worth.equals(other.getPrevious_net_worth()))) &&
            ((this.previous_sales==null && other.getPrevious_sales()==null) || 
             (this.previous_sales!=null &&
              this.previous_sales.equals(other.getPrevious_sales()))) &&
            ((this.previous_statement_date==null && other.getPrevious_statement_date()==null) || 
             (this.previous_statement_date!=null &&
              this.previous_statement_date.equals(other.getPrevious_statement_date()))) &&
            ((this.line_of_business==null && other.getLine_of_business()==null) || 
             (this.line_of_business!=null &&
              this.line_of_business.equals(other.getLine_of_business()))) &&
            ((this.failure_score==null && other.getFailure_score()==null) || 
             (this.failure_score!=null &&
              java.util.Arrays.equals(this.failure_score, other.getFailure_score()))) &&
            ((this.credit_score==null && other.getCredit_score()==null) || 
             (this.credit_score!=null &&
              java.util.Arrays.equals(this.credit_score, other.getCredit_score()))) &&
            ((this.global_failure_score==null && other.getGlobal_failure_score()==null) || 
             (this.global_failure_score!=null &&
              java.util.Arrays.equals(this.global_failure_score, other.getGlobal_failure_score())));
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
        if (getQuickcheck() != null) {
            _hashCode += getQuickcheck().hashCode();
        }
        if (getMain_branch_indication() != null) {
            _hashCode += getMain_branch_indication().hashCode();
        }
        if (getIndate_indicator() != null) {
            _hashCode += getIndate_indicator().hashCode();
        }
        if (getRegistration_type() != null) {
            _hashCode += getRegistration_type().hashCode();
        }
        if (getImport_indicator() != null) {
            _hashCode += getImport_indicator().hashCode();
        }
        if (getExport_indicator() != null) {
            _hashCode += getExport_indicator().hashCode();
        }
        if (getLocation_ownership() != null) {
            _hashCode += getLocation_ownership().hashCode();
        }
        if (getClaims_indicator() != null) {
            _hashCode += getClaims_indicator().hashCode();
        }
        if (getPaydex_score_earlier() != null) {
            _hashCode += getPaydex_score_earlier().hashCode();
        }
        if (getAverage_high_credit() != null) {
            _hashCode += getAverage_high_credit().hashCode();
        }
        if (getHigh_credit() != null) {
            _hashCode += getHigh_credit().hashCode();
        }
        if (getTotal_payments() != null) {
            _hashCode += getTotal_payments().hashCode();
        }
        if (getHeadquarters() != null) {
            _hashCode += getHeadquarters().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getDomestic_ultimate() != null) {
            _hashCode += getDomestic_ultimate().hashCode();
        }
        if (getGlobal_ultimate() != null) {
            _hashCode += getGlobal_ultimate().hashCode();
        }
        if (getIs_subsidiary_location() != null) {
            _hashCode += getIs_subsidiary_location().hashCode();
        }
        if (getLocation_status() != null) {
            _hashCode += getLocation_status().hashCode();
        }
        if (getAccounts_audited() != null) {
            _hashCode += getAccounts_audited().hashCode();
        }
        if (getStatement_consolidated() != null) {
            _hashCode += getStatement_consolidated().hashCode();
        }
        if (getFigures_estimated() != null) {
            _hashCode += getFigures_estimated().hashCode();
        }
        if (getFigures_forecast() != null) {
            _hashCode += getFigures_forecast().hashCode();
        }
        if (getYear_period() != null) {
            _hashCode += getYear_period().hashCode();
        }
        if (getFigures_final() != null) {
            _hashCode += getFigures_final().hashCode();
        }
        if (getOpening_statement() != null) {
            _hashCode += getOpening_statement().hashCode();
        }
        if (getFigures_proforma() != null) {
            _hashCode += getFigures_proforma().hashCode();
        }
        if (getTrial_balance() != null) {
            _hashCode += getTrial_balance().hashCode();
        }
        if (getFigures_signed() != null) {
            _hashCode += getFigures_signed().hashCode();
        }
        if (getFigures_restated() != null) {
            _hashCode += getFigures_restated().hashCode();
        }
        if (getFigures_unbalanced() != null) {
            _hashCode += getFigures_unbalanced().hashCode();
        }
        if (getFigures_qualified() != null) {
            _hashCode += getFigures_qualified().hashCode();
        }
        if (getAccounts_receivable() != null) {
            _hashCode += getAccounts_receivable().hashCode();
        }
        if (getLiquid_assets() != null) {
            _hashCode += getLiquid_assets().hashCode();
        }
        if (getInventory() != null) {
            _hashCode += getInventory().hashCode();
        }
        if (getTotal_current_assets() != null) {
            _hashCode += getTotal_current_assets().hashCode();
        }
        if (getTotal_assets() != null) {
            _hashCode += getTotal_assets().hashCode();
        }
        if (getAccounts_payable() != null) {
            _hashCode += getAccounts_payable().hashCode();
        }
        if (getTotal_current_liabilities() != null) {
            _hashCode += getTotal_current_liabilities().hashCode();
        }
        if (getTotal_liabilities() != null) {
            _hashCode += getTotal_liabilities().hashCode();
        }
        if (getNet_income() != null) {
            _hashCode += getNet_income().hashCode();
        }
        if (getQuick_ratio() != null) {
            _hashCode += getQuick_ratio().hashCode();
        }
        if (getCurrent_ratio() != null) {
            _hashCode += getCurrent_ratio().hashCode();
        }
        if (getPrevious_net_worth() != null) {
            _hashCode += getPrevious_net_worth().hashCode();
        }
        if (getPrevious_sales() != null) {
            _hashCode += getPrevious_sales().hashCode();
        }
        if (getPrevious_statement_date() != null) {
            _hashCode += getPrevious_statement_date().hashCode();
        }
        if (getLine_of_business() != null) {
            _hashCode += getLine_of_business().hashCode();
        }
        if (getFailure_score() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailure_score());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailure_score(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredit_score() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit_score());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit_score(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobal_failure_score() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobal_failure_score());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobal_failure_score(), i);
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
        new org.apache.axis.description.TypeDesc(DNBEnterpriseManagement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBEnterpriseManagement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "quickcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBQuickCheck"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_branch_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_branch_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indate_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indate_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "import_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "export_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_ownership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "location_ownership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claims_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "claims_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paydex_score_earlier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paydex_score_earlier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average_high_credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "average_high_credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high_credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "high_credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_payments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_payments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headquarters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "headquarters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBRelatedBusiness"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBRelatedBusiness"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic_ultimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domestic_ultimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBRelatedBusiness"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_ultimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_ultimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBRelatedBusiness"));
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
        elemField.setFieldName("location_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "location_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts_audited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accounts_audited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement_consolidated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "statement_consolidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_estimated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_estimated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_final");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_final"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opening_statement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "opening_statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_proforma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_proforma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trial_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trial_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_signed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_signed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_restated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_restated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_unbalanced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_unbalanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figures_qualified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "figures_qualified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts_receivable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accounts_receivable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liquid_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liquid_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_current_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_current_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts_payable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accounts_payable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_current_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_current_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_income");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_income"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quick_ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "quick_ratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_ratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_net_worth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_net_worth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_statement_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_statement_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("failure_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "failure_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBScoreGroup"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBScoreGroup"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_failure_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "global_failure_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBScoreGroup"));
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
