/**
 * CreditsafeBalanceSheet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBalanceSheet  implements java.io.Serializable {
    private java.util.Calendar year_end_date;

    private org.apache.axis.types.UnsignedInt number_of_weeks;

    private java.lang.String currency;

    private java.lang.Boolean consolidated_accounts;

    private java.math.BigDecimal land_and_buildings;

    private java.math.BigDecimal plant_and_machinery;

    private java.math.BigDecimal other_tangible_assets;

    private java.math.BigDecimal total_tangible_assets;

    private java.math.BigDecimal goodwill;

    private java.math.BigDecimal other_intangible_assets;

    private java.math.BigDecimal total_intangible_assets;

    private java.math.BigDecimal investments;

    private java.math.BigDecimal loans_to_group;

    private java.math.BigDecimal other_loans;

    private java.math.BigDecimal miscellaneous_fixed_assets;

    private java.math.BigDecimal total_other_fixed_assets;

    private java.math.BigDecimal total_fixed_assets;

    private java.math.BigDecimal raw_materials;

    private java.math.BigDecimal work_in_progress;

    private java.math.BigDecimal finished_goods;

    private java.math.BigDecimal other_inventories;

    private java.math.BigDecimal total_inventories;

    private java.math.BigDecimal trade_receivables;

    private java.math.BigDecimal group_receivables;

    private java.math.BigDecimal receivables_due_after1Year;

    private java.math.BigDecimal miscellaneous_receivables;

    private java.math.BigDecimal total_receivables;

    private java.math.BigDecimal cash;

    private java.math.BigDecimal other_current_assets;

    private java.math.BigDecimal total_current_assets;

    private java.math.BigDecimal total_assets;

    private java.math.BigDecimal trade_payables;

    private java.math.BigDecimal bank_liabilities;

    private java.math.BigDecimal other_loans_or_finance;

    private java.math.BigDecimal group_payables;

    private java.math.BigDecimal miscellaneous_liabilities;

    private java.math.BigDecimal total_current_liabilities;

    private java.math.BigDecimal trade_payables_due_after1Year;

    private java.math.BigDecimal bank_liabilities_due_after1Year;

    private java.math.BigDecimal other_loans_or_finance_due_after1Year;

    private java.math.BigDecimal group_payables_due_after1Year;

    private java.math.BigDecimal miscellaneous_liabilities_due_after1Year;

    private java.math.BigDecimal total_long_term_liabilities;

    private java.math.BigDecimal total_liabilities;

    private java.math.BigDecimal called_up_share_capital;

    private java.math.BigDecimal share_premium;

    private java.math.BigDecimal revenue_reserves;

    private java.math.BigDecimal other_reserves;

    private java.math.BigDecimal total_shareholders_equity;

    public CreditsafeBalanceSheet() {
    }

    public CreditsafeBalanceSheet(
           java.util.Calendar year_end_date,
           org.apache.axis.types.UnsignedInt number_of_weeks,
           java.lang.String currency,
           java.lang.Boolean consolidated_accounts,
           java.math.BigDecimal land_and_buildings,
           java.math.BigDecimal plant_and_machinery,
           java.math.BigDecimal other_tangible_assets,
           java.math.BigDecimal total_tangible_assets,
           java.math.BigDecimal goodwill,
           java.math.BigDecimal other_intangible_assets,
           java.math.BigDecimal total_intangible_assets,
           java.math.BigDecimal investments,
           java.math.BigDecimal loans_to_group,
           java.math.BigDecimal other_loans,
           java.math.BigDecimal miscellaneous_fixed_assets,
           java.math.BigDecimal total_other_fixed_assets,
           java.math.BigDecimal total_fixed_assets,
           java.math.BigDecimal raw_materials,
           java.math.BigDecimal work_in_progress,
           java.math.BigDecimal finished_goods,
           java.math.BigDecimal other_inventories,
           java.math.BigDecimal total_inventories,
           java.math.BigDecimal trade_receivables,
           java.math.BigDecimal group_receivables,
           java.math.BigDecimal receivables_due_after1Year,
           java.math.BigDecimal miscellaneous_receivables,
           java.math.BigDecimal total_receivables,
           java.math.BigDecimal cash,
           java.math.BigDecimal other_current_assets,
           java.math.BigDecimal total_current_assets,
           java.math.BigDecimal total_assets,
           java.math.BigDecimal trade_payables,
           java.math.BigDecimal bank_liabilities,
           java.math.BigDecimal other_loans_or_finance,
           java.math.BigDecimal group_payables,
           java.math.BigDecimal miscellaneous_liabilities,
           java.math.BigDecimal total_current_liabilities,
           java.math.BigDecimal trade_payables_due_after1Year,
           java.math.BigDecimal bank_liabilities_due_after1Year,
           java.math.BigDecimal other_loans_or_finance_due_after1Year,
           java.math.BigDecimal group_payables_due_after1Year,
           java.math.BigDecimal miscellaneous_liabilities_due_after1Year,
           java.math.BigDecimal total_long_term_liabilities,
           java.math.BigDecimal total_liabilities,
           java.math.BigDecimal called_up_share_capital,
           java.math.BigDecimal share_premium,
           java.math.BigDecimal revenue_reserves,
           java.math.BigDecimal other_reserves,
           java.math.BigDecimal total_shareholders_equity) {
           this.year_end_date = year_end_date;
           this.number_of_weeks = number_of_weeks;
           this.currency = currency;
           this.consolidated_accounts = consolidated_accounts;
           this.land_and_buildings = land_and_buildings;
           this.plant_and_machinery = plant_and_machinery;
           this.other_tangible_assets = other_tangible_assets;
           this.total_tangible_assets = total_tangible_assets;
           this.goodwill = goodwill;
           this.other_intangible_assets = other_intangible_assets;
           this.total_intangible_assets = total_intangible_assets;
           this.investments = investments;
           this.loans_to_group = loans_to_group;
           this.other_loans = other_loans;
           this.miscellaneous_fixed_assets = miscellaneous_fixed_assets;
           this.total_other_fixed_assets = total_other_fixed_assets;
           this.total_fixed_assets = total_fixed_assets;
           this.raw_materials = raw_materials;
           this.work_in_progress = work_in_progress;
           this.finished_goods = finished_goods;
           this.other_inventories = other_inventories;
           this.total_inventories = total_inventories;
           this.trade_receivables = trade_receivables;
           this.group_receivables = group_receivables;
           this.receivables_due_after1Year = receivables_due_after1Year;
           this.miscellaneous_receivables = miscellaneous_receivables;
           this.total_receivables = total_receivables;
           this.cash = cash;
           this.other_current_assets = other_current_assets;
           this.total_current_assets = total_current_assets;
           this.total_assets = total_assets;
           this.trade_payables = trade_payables;
           this.bank_liabilities = bank_liabilities;
           this.other_loans_or_finance = other_loans_or_finance;
           this.group_payables = group_payables;
           this.miscellaneous_liabilities = miscellaneous_liabilities;
           this.total_current_liabilities = total_current_liabilities;
           this.trade_payables_due_after1Year = trade_payables_due_after1Year;
           this.bank_liabilities_due_after1Year = bank_liabilities_due_after1Year;
           this.other_loans_or_finance_due_after1Year = other_loans_or_finance_due_after1Year;
           this.group_payables_due_after1Year = group_payables_due_after1Year;
           this.miscellaneous_liabilities_due_after1Year = miscellaneous_liabilities_due_after1Year;
           this.total_long_term_liabilities = total_long_term_liabilities;
           this.total_liabilities = total_liabilities;
           this.called_up_share_capital = called_up_share_capital;
           this.share_premium = share_premium;
           this.revenue_reserves = revenue_reserves;
           this.other_reserves = other_reserves;
           this.total_shareholders_equity = total_shareholders_equity;
    }


    /**
     * Gets the year_end_date value for this CreditsafeBalanceSheet.
     * 
     * @return year_end_date
     */
    public java.util.Calendar getYear_end_date() {
        return year_end_date;
    }


    /**
     * Sets the year_end_date value for this CreditsafeBalanceSheet.
     * 
     * @param year_end_date
     */
    public void setYear_end_date(java.util.Calendar year_end_date) {
        this.year_end_date = year_end_date;
    }


    /**
     * Gets the number_of_weeks value for this CreditsafeBalanceSheet.
     * 
     * @return number_of_weeks
     */
    public org.apache.axis.types.UnsignedInt getNumber_of_weeks() {
        return number_of_weeks;
    }


    /**
     * Sets the number_of_weeks value for this CreditsafeBalanceSheet.
     * 
     * @param number_of_weeks
     */
    public void setNumber_of_weeks(org.apache.axis.types.UnsignedInt number_of_weeks) {
        this.number_of_weeks = number_of_weeks;
    }


    /**
     * Gets the currency value for this CreditsafeBalanceSheet.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CreditsafeBalanceSheet.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the consolidated_accounts value for this CreditsafeBalanceSheet.
     * 
     * @return consolidated_accounts
     */
    public java.lang.Boolean getConsolidated_accounts() {
        return consolidated_accounts;
    }


    /**
     * Sets the consolidated_accounts value for this CreditsafeBalanceSheet.
     * 
     * @param consolidated_accounts
     */
    public void setConsolidated_accounts(java.lang.Boolean consolidated_accounts) {
        this.consolidated_accounts = consolidated_accounts;
    }


    /**
     * Gets the land_and_buildings value for this CreditsafeBalanceSheet.
     * 
     * @return land_and_buildings
     */
    public java.math.BigDecimal getLand_and_buildings() {
        return land_and_buildings;
    }


    /**
     * Sets the land_and_buildings value for this CreditsafeBalanceSheet.
     * 
     * @param land_and_buildings
     */
    public void setLand_and_buildings(java.math.BigDecimal land_and_buildings) {
        this.land_and_buildings = land_and_buildings;
    }


    /**
     * Gets the plant_and_machinery value for this CreditsafeBalanceSheet.
     * 
     * @return plant_and_machinery
     */
    public java.math.BigDecimal getPlant_and_machinery() {
        return plant_and_machinery;
    }


    /**
     * Sets the plant_and_machinery value for this CreditsafeBalanceSheet.
     * 
     * @param plant_and_machinery
     */
    public void setPlant_and_machinery(java.math.BigDecimal plant_and_machinery) {
        this.plant_and_machinery = plant_and_machinery;
    }


    /**
     * Gets the other_tangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @return other_tangible_assets
     */
    public java.math.BigDecimal getOther_tangible_assets() {
        return other_tangible_assets;
    }


    /**
     * Sets the other_tangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @param other_tangible_assets
     */
    public void setOther_tangible_assets(java.math.BigDecimal other_tangible_assets) {
        this.other_tangible_assets = other_tangible_assets;
    }


    /**
     * Gets the total_tangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_tangible_assets
     */
    public java.math.BigDecimal getTotal_tangible_assets() {
        return total_tangible_assets;
    }


    /**
     * Sets the total_tangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_tangible_assets
     */
    public void setTotal_tangible_assets(java.math.BigDecimal total_tangible_assets) {
        this.total_tangible_assets = total_tangible_assets;
    }


    /**
     * Gets the goodwill value for this CreditsafeBalanceSheet.
     * 
     * @return goodwill
     */
    public java.math.BigDecimal getGoodwill() {
        return goodwill;
    }


    /**
     * Sets the goodwill value for this CreditsafeBalanceSheet.
     * 
     * @param goodwill
     */
    public void setGoodwill(java.math.BigDecimal goodwill) {
        this.goodwill = goodwill;
    }


    /**
     * Gets the other_intangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @return other_intangible_assets
     */
    public java.math.BigDecimal getOther_intangible_assets() {
        return other_intangible_assets;
    }


    /**
     * Sets the other_intangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @param other_intangible_assets
     */
    public void setOther_intangible_assets(java.math.BigDecimal other_intangible_assets) {
        this.other_intangible_assets = other_intangible_assets;
    }


    /**
     * Gets the total_intangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_intangible_assets
     */
    public java.math.BigDecimal getTotal_intangible_assets() {
        return total_intangible_assets;
    }


    /**
     * Sets the total_intangible_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_intangible_assets
     */
    public void setTotal_intangible_assets(java.math.BigDecimal total_intangible_assets) {
        this.total_intangible_assets = total_intangible_assets;
    }


    /**
     * Gets the investments value for this CreditsafeBalanceSheet.
     * 
     * @return investments
     */
    public java.math.BigDecimal getInvestments() {
        return investments;
    }


    /**
     * Sets the investments value for this CreditsafeBalanceSheet.
     * 
     * @param investments
     */
    public void setInvestments(java.math.BigDecimal investments) {
        this.investments = investments;
    }


    /**
     * Gets the loans_to_group value for this CreditsafeBalanceSheet.
     * 
     * @return loans_to_group
     */
    public java.math.BigDecimal getLoans_to_group() {
        return loans_to_group;
    }


    /**
     * Sets the loans_to_group value for this CreditsafeBalanceSheet.
     * 
     * @param loans_to_group
     */
    public void setLoans_to_group(java.math.BigDecimal loans_to_group) {
        this.loans_to_group = loans_to_group;
    }


    /**
     * Gets the other_loans value for this CreditsafeBalanceSheet.
     * 
     * @return other_loans
     */
    public java.math.BigDecimal getOther_loans() {
        return other_loans;
    }


    /**
     * Sets the other_loans value for this CreditsafeBalanceSheet.
     * 
     * @param other_loans
     */
    public void setOther_loans(java.math.BigDecimal other_loans) {
        this.other_loans = other_loans;
    }


    /**
     * Gets the miscellaneous_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @return miscellaneous_fixed_assets
     */
    public java.math.BigDecimal getMiscellaneous_fixed_assets() {
        return miscellaneous_fixed_assets;
    }


    /**
     * Sets the miscellaneous_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @param miscellaneous_fixed_assets
     */
    public void setMiscellaneous_fixed_assets(java.math.BigDecimal miscellaneous_fixed_assets) {
        this.miscellaneous_fixed_assets = miscellaneous_fixed_assets;
    }


    /**
     * Gets the total_other_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_other_fixed_assets
     */
    public java.math.BigDecimal getTotal_other_fixed_assets() {
        return total_other_fixed_assets;
    }


    /**
     * Sets the total_other_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_other_fixed_assets
     */
    public void setTotal_other_fixed_assets(java.math.BigDecimal total_other_fixed_assets) {
        this.total_other_fixed_assets = total_other_fixed_assets;
    }


    /**
     * Gets the total_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_fixed_assets
     */
    public java.math.BigDecimal getTotal_fixed_assets() {
        return total_fixed_assets;
    }


    /**
     * Sets the total_fixed_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_fixed_assets
     */
    public void setTotal_fixed_assets(java.math.BigDecimal total_fixed_assets) {
        this.total_fixed_assets = total_fixed_assets;
    }


    /**
     * Gets the raw_materials value for this CreditsafeBalanceSheet.
     * 
     * @return raw_materials
     */
    public java.math.BigDecimal getRaw_materials() {
        return raw_materials;
    }


    /**
     * Sets the raw_materials value for this CreditsafeBalanceSheet.
     * 
     * @param raw_materials
     */
    public void setRaw_materials(java.math.BigDecimal raw_materials) {
        this.raw_materials = raw_materials;
    }


    /**
     * Gets the work_in_progress value for this CreditsafeBalanceSheet.
     * 
     * @return work_in_progress
     */
    public java.math.BigDecimal getWork_in_progress() {
        return work_in_progress;
    }


    /**
     * Sets the work_in_progress value for this CreditsafeBalanceSheet.
     * 
     * @param work_in_progress
     */
    public void setWork_in_progress(java.math.BigDecimal work_in_progress) {
        this.work_in_progress = work_in_progress;
    }


    /**
     * Gets the finished_goods value for this CreditsafeBalanceSheet.
     * 
     * @return finished_goods
     */
    public java.math.BigDecimal getFinished_goods() {
        return finished_goods;
    }


    /**
     * Sets the finished_goods value for this CreditsafeBalanceSheet.
     * 
     * @param finished_goods
     */
    public void setFinished_goods(java.math.BigDecimal finished_goods) {
        this.finished_goods = finished_goods;
    }


    /**
     * Gets the other_inventories value for this CreditsafeBalanceSheet.
     * 
     * @return other_inventories
     */
    public java.math.BigDecimal getOther_inventories() {
        return other_inventories;
    }


    /**
     * Sets the other_inventories value for this CreditsafeBalanceSheet.
     * 
     * @param other_inventories
     */
    public void setOther_inventories(java.math.BigDecimal other_inventories) {
        this.other_inventories = other_inventories;
    }


    /**
     * Gets the total_inventories value for this CreditsafeBalanceSheet.
     * 
     * @return total_inventories
     */
    public java.math.BigDecimal getTotal_inventories() {
        return total_inventories;
    }


    /**
     * Sets the total_inventories value for this CreditsafeBalanceSheet.
     * 
     * @param total_inventories
     */
    public void setTotal_inventories(java.math.BigDecimal total_inventories) {
        this.total_inventories = total_inventories;
    }


    /**
     * Gets the trade_receivables value for this CreditsafeBalanceSheet.
     * 
     * @return trade_receivables
     */
    public java.math.BigDecimal getTrade_receivables() {
        return trade_receivables;
    }


    /**
     * Sets the trade_receivables value for this CreditsafeBalanceSheet.
     * 
     * @param trade_receivables
     */
    public void setTrade_receivables(java.math.BigDecimal trade_receivables) {
        this.trade_receivables = trade_receivables;
    }


    /**
     * Gets the group_receivables value for this CreditsafeBalanceSheet.
     * 
     * @return group_receivables
     */
    public java.math.BigDecimal getGroup_receivables() {
        return group_receivables;
    }


    /**
     * Sets the group_receivables value for this CreditsafeBalanceSheet.
     * 
     * @param group_receivables
     */
    public void setGroup_receivables(java.math.BigDecimal group_receivables) {
        this.group_receivables = group_receivables;
    }


    /**
     * Gets the receivables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return receivables_due_after1Year
     */
    public java.math.BigDecimal getReceivables_due_after1Year() {
        return receivables_due_after1Year;
    }


    /**
     * Sets the receivables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param receivables_due_after1Year
     */
    public void setReceivables_due_after1Year(java.math.BigDecimal receivables_due_after1Year) {
        this.receivables_due_after1Year = receivables_due_after1Year;
    }


    /**
     * Gets the miscellaneous_receivables value for this CreditsafeBalanceSheet.
     * 
     * @return miscellaneous_receivables
     */
    public java.math.BigDecimal getMiscellaneous_receivables() {
        return miscellaneous_receivables;
    }


    /**
     * Sets the miscellaneous_receivables value for this CreditsafeBalanceSheet.
     * 
     * @param miscellaneous_receivables
     */
    public void setMiscellaneous_receivables(java.math.BigDecimal miscellaneous_receivables) {
        this.miscellaneous_receivables = miscellaneous_receivables;
    }


    /**
     * Gets the total_receivables value for this CreditsafeBalanceSheet.
     * 
     * @return total_receivables
     */
    public java.math.BigDecimal getTotal_receivables() {
        return total_receivables;
    }


    /**
     * Sets the total_receivables value for this CreditsafeBalanceSheet.
     * 
     * @param total_receivables
     */
    public void setTotal_receivables(java.math.BigDecimal total_receivables) {
        this.total_receivables = total_receivables;
    }


    /**
     * Gets the cash value for this CreditsafeBalanceSheet.
     * 
     * @return cash
     */
    public java.math.BigDecimal getCash() {
        return cash;
    }


    /**
     * Sets the cash value for this CreditsafeBalanceSheet.
     * 
     * @param cash
     */
    public void setCash(java.math.BigDecimal cash) {
        this.cash = cash;
    }


    /**
     * Gets the other_current_assets value for this CreditsafeBalanceSheet.
     * 
     * @return other_current_assets
     */
    public java.math.BigDecimal getOther_current_assets() {
        return other_current_assets;
    }


    /**
     * Sets the other_current_assets value for this CreditsafeBalanceSheet.
     * 
     * @param other_current_assets
     */
    public void setOther_current_assets(java.math.BigDecimal other_current_assets) {
        this.other_current_assets = other_current_assets;
    }


    /**
     * Gets the total_current_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_current_assets
     */
    public java.math.BigDecimal getTotal_current_assets() {
        return total_current_assets;
    }


    /**
     * Sets the total_current_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_current_assets
     */
    public void setTotal_current_assets(java.math.BigDecimal total_current_assets) {
        this.total_current_assets = total_current_assets;
    }


    /**
     * Gets the total_assets value for this CreditsafeBalanceSheet.
     * 
     * @return total_assets
     */
    public java.math.BigDecimal getTotal_assets() {
        return total_assets;
    }


    /**
     * Sets the total_assets value for this CreditsafeBalanceSheet.
     * 
     * @param total_assets
     */
    public void setTotal_assets(java.math.BigDecimal total_assets) {
        this.total_assets = total_assets;
    }


    /**
     * Gets the trade_payables value for this CreditsafeBalanceSheet.
     * 
     * @return trade_payables
     */
    public java.math.BigDecimal getTrade_payables() {
        return trade_payables;
    }


    /**
     * Sets the trade_payables value for this CreditsafeBalanceSheet.
     * 
     * @param trade_payables
     */
    public void setTrade_payables(java.math.BigDecimal trade_payables) {
        this.trade_payables = trade_payables;
    }


    /**
     * Gets the bank_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @return bank_liabilities
     */
    public java.math.BigDecimal getBank_liabilities() {
        return bank_liabilities;
    }


    /**
     * Sets the bank_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @param bank_liabilities
     */
    public void setBank_liabilities(java.math.BigDecimal bank_liabilities) {
        this.bank_liabilities = bank_liabilities;
    }


    /**
     * Gets the other_loans_or_finance value for this CreditsafeBalanceSheet.
     * 
     * @return other_loans_or_finance
     */
    public java.math.BigDecimal getOther_loans_or_finance() {
        return other_loans_or_finance;
    }


    /**
     * Sets the other_loans_or_finance value for this CreditsafeBalanceSheet.
     * 
     * @param other_loans_or_finance
     */
    public void setOther_loans_or_finance(java.math.BigDecimal other_loans_or_finance) {
        this.other_loans_or_finance = other_loans_or_finance;
    }


    /**
     * Gets the group_payables value for this CreditsafeBalanceSheet.
     * 
     * @return group_payables
     */
    public java.math.BigDecimal getGroup_payables() {
        return group_payables;
    }


    /**
     * Sets the group_payables value for this CreditsafeBalanceSheet.
     * 
     * @param group_payables
     */
    public void setGroup_payables(java.math.BigDecimal group_payables) {
        this.group_payables = group_payables;
    }


    /**
     * Gets the miscellaneous_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @return miscellaneous_liabilities
     */
    public java.math.BigDecimal getMiscellaneous_liabilities() {
        return miscellaneous_liabilities;
    }


    /**
     * Sets the miscellaneous_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @param miscellaneous_liabilities
     */
    public void setMiscellaneous_liabilities(java.math.BigDecimal miscellaneous_liabilities) {
        this.miscellaneous_liabilities = miscellaneous_liabilities;
    }


    /**
     * Gets the total_current_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @return total_current_liabilities
     */
    public java.math.BigDecimal getTotal_current_liabilities() {
        return total_current_liabilities;
    }


    /**
     * Sets the total_current_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @param total_current_liabilities
     */
    public void setTotal_current_liabilities(java.math.BigDecimal total_current_liabilities) {
        this.total_current_liabilities = total_current_liabilities;
    }


    /**
     * Gets the trade_payables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return trade_payables_due_after1Year
     */
    public java.math.BigDecimal getTrade_payables_due_after1Year() {
        return trade_payables_due_after1Year;
    }


    /**
     * Sets the trade_payables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param trade_payables_due_after1Year
     */
    public void setTrade_payables_due_after1Year(java.math.BigDecimal trade_payables_due_after1Year) {
        this.trade_payables_due_after1Year = trade_payables_due_after1Year;
    }


    /**
     * Gets the bank_liabilities_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return bank_liabilities_due_after1Year
     */
    public java.math.BigDecimal getBank_liabilities_due_after1Year() {
        return bank_liabilities_due_after1Year;
    }


    /**
     * Sets the bank_liabilities_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param bank_liabilities_due_after1Year
     */
    public void setBank_liabilities_due_after1Year(java.math.BigDecimal bank_liabilities_due_after1Year) {
        this.bank_liabilities_due_after1Year = bank_liabilities_due_after1Year;
    }


    /**
     * Gets the other_loans_or_finance_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return other_loans_or_finance_due_after1Year
     */
    public java.math.BigDecimal getOther_loans_or_finance_due_after1Year() {
        return other_loans_or_finance_due_after1Year;
    }


    /**
     * Sets the other_loans_or_finance_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param other_loans_or_finance_due_after1Year
     */
    public void setOther_loans_or_finance_due_after1Year(java.math.BigDecimal other_loans_or_finance_due_after1Year) {
        this.other_loans_or_finance_due_after1Year = other_loans_or_finance_due_after1Year;
    }


    /**
     * Gets the group_payables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return group_payables_due_after1Year
     */
    public java.math.BigDecimal getGroup_payables_due_after1Year() {
        return group_payables_due_after1Year;
    }


    /**
     * Sets the group_payables_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param group_payables_due_after1Year
     */
    public void setGroup_payables_due_after1Year(java.math.BigDecimal group_payables_due_after1Year) {
        this.group_payables_due_after1Year = group_payables_due_after1Year;
    }


    /**
     * Gets the miscellaneous_liabilities_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @return miscellaneous_liabilities_due_after1Year
     */
    public java.math.BigDecimal getMiscellaneous_liabilities_due_after1Year() {
        return miscellaneous_liabilities_due_after1Year;
    }


    /**
     * Sets the miscellaneous_liabilities_due_after1Year value for this CreditsafeBalanceSheet.
     * 
     * @param miscellaneous_liabilities_due_after1Year
     */
    public void setMiscellaneous_liabilities_due_after1Year(java.math.BigDecimal miscellaneous_liabilities_due_after1Year) {
        this.miscellaneous_liabilities_due_after1Year = miscellaneous_liabilities_due_after1Year;
    }


    /**
     * Gets the total_long_term_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @return total_long_term_liabilities
     */
    public java.math.BigDecimal getTotal_long_term_liabilities() {
        return total_long_term_liabilities;
    }


    /**
     * Sets the total_long_term_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @param total_long_term_liabilities
     */
    public void setTotal_long_term_liabilities(java.math.BigDecimal total_long_term_liabilities) {
        this.total_long_term_liabilities = total_long_term_liabilities;
    }


    /**
     * Gets the total_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @return total_liabilities
     */
    public java.math.BigDecimal getTotal_liabilities() {
        return total_liabilities;
    }


    /**
     * Sets the total_liabilities value for this CreditsafeBalanceSheet.
     * 
     * @param total_liabilities
     */
    public void setTotal_liabilities(java.math.BigDecimal total_liabilities) {
        this.total_liabilities = total_liabilities;
    }


    /**
     * Gets the called_up_share_capital value for this CreditsafeBalanceSheet.
     * 
     * @return called_up_share_capital
     */
    public java.math.BigDecimal getCalled_up_share_capital() {
        return called_up_share_capital;
    }


    /**
     * Sets the called_up_share_capital value for this CreditsafeBalanceSheet.
     * 
     * @param called_up_share_capital
     */
    public void setCalled_up_share_capital(java.math.BigDecimal called_up_share_capital) {
        this.called_up_share_capital = called_up_share_capital;
    }


    /**
     * Gets the share_premium value for this CreditsafeBalanceSheet.
     * 
     * @return share_premium
     */
    public java.math.BigDecimal getShare_premium() {
        return share_premium;
    }


    /**
     * Sets the share_premium value for this CreditsafeBalanceSheet.
     * 
     * @param share_premium
     */
    public void setShare_premium(java.math.BigDecimal share_premium) {
        this.share_premium = share_premium;
    }


    /**
     * Gets the revenue_reserves value for this CreditsafeBalanceSheet.
     * 
     * @return revenue_reserves
     */
    public java.math.BigDecimal getRevenue_reserves() {
        return revenue_reserves;
    }


    /**
     * Sets the revenue_reserves value for this CreditsafeBalanceSheet.
     * 
     * @param revenue_reserves
     */
    public void setRevenue_reserves(java.math.BigDecimal revenue_reserves) {
        this.revenue_reserves = revenue_reserves;
    }


    /**
     * Gets the other_reserves value for this CreditsafeBalanceSheet.
     * 
     * @return other_reserves
     */
    public java.math.BigDecimal getOther_reserves() {
        return other_reserves;
    }


    /**
     * Sets the other_reserves value for this CreditsafeBalanceSheet.
     * 
     * @param other_reserves
     */
    public void setOther_reserves(java.math.BigDecimal other_reserves) {
        this.other_reserves = other_reserves;
    }


    /**
     * Gets the total_shareholders_equity value for this CreditsafeBalanceSheet.
     * 
     * @return total_shareholders_equity
     */
    public java.math.BigDecimal getTotal_shareholders_equity() {
        return total_shareholders_equity;
    }


    /**
     * Sets the total_shareholders_equity value for this CreditsafeBalanceSheet.
     * 
     * @param total_shareholders_equity
     */
    public void setTotal_shareholders_equity(java.math.BigDecimal total_shareholders_equity) {
        this.total_shareholders_equity = total_shareholders_equity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBalanceSheet)) return false;
        CreditsafeBalanceSheet other = (CreditsafeBalanceSheet) obj;
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
            ((this.land_and_buildings==null && other.getLand_and_buildings()==null) || 
             (this.land_and_buildings!=null &&
              this.land_and_buildings.equals(other.getLand_and_buildings()))) &&
            ((this.plant_and_machinery==null && other.getPlant_and_machinery()==null) || 
             (this.plant_and_machinery!=null &&
              this.plant_and_machinery.equals(other.getPlant_and_machinery()))) &&
            ((this.other_tangible_assets==null && other.getOther_tangible_assets()==null) || 
             (this.other_tangible_assets!=null &&
              this.other_tangible_assets.equals(other.getOther_tangible_assets()))) &&
            ((this.total_tangible_assets==null && other.getTotal_tangible_assets()==null) || 
             (this.total_tangible_assets!=null &&
              this.total_tangible_assets.equals(other.getTotal_tangible_assets()))) &&
            ((this.goodwill==null && other.getGoodwill()==null) || 
             (this.goodwill!=null &&
              this.goodwill.equals(other.getGoodwill()))) &&
            ((this.other_intangible_assets==null && other.getOther_intangible_assets()==null) || 
             (this.other_intangible_assets!=null &&
              this.other_intangible_assets.equals(other.getOther_intangible_assets()))) &&
            ((this.total_intangible_assets==null && other.getTotal_intangible_assets()==null) || 
             (this.total_intangible_assets!=null &&
              this.total_intangible_assets.equals(other.getTotal_intangible_assets()))) &&
            ((this.investments==null && other.getInvestments()==null) || 
             (this.investments!=null &&
              this.investments.equals(other.getInvestments()))) &&
            ((this.loans_to_group==null && other.getLoans_to_group()==null) || 
             (this.loans_to_group!=null &&
              this.loans_to_group.equals(other.getLoans_to_group()))) &&
            ((this.other_loans==null && other.getOther_loans()==null) || 
             (this.other_loans!=null &&
              this.other_loans.equals(other.getOther_loans()))) &&
            ((this.miscellaneous_fixed_assets==null && other.getMiscellaneous_fixed_assets()==null) || 
             (this.miscellaneous_fixed_assets!=null &&
              this.miscellaneous_fixed_assets.equals(other.getMiscellaneous_fixed_assets()))) &&
            ((this.total_other_fixed_assets==null && other.getTotal_other_fixed_assets()==null) || 
             (this.total_other_fixed_assets!=null &&
              this.total_other_fixed_assets.equals(other.getTotal_other_fixed_assets()))) &&
            ((this.total_fixed_assets==null && other.getTotal_fixed_assets()==null) || 
             (this.total_fixed_assets!=null &&
              this.total_fixed_assets.equals(other.getTotal_fixed_assets()))) &&
            ((this.raw_materials==null && other.getRaw_materials()==null) || 
             (this.raw_materials!=null &&
              this.raw_materials.equals(other.getRaw_materials()))) &&
            ((this.work_in_progress==null && other.getWork_in_progress()==null) || 
             (this.work_in_progress!=null &&
              this.work_in_progress.equals(other.getWork_in_progress()))) &&
            ((this.finished_goods==null && other.getFinished_goods()==null) || 
             (this.finished_goods!=null &&
              this.finished_goods.equals(other.getFinished_goods()))) &&
            ((this.other_inventories==null && other.getOther_inventories()==null) || 
             (this.other_inventories!=null &&
              this.other_inventories.equals(other.getOther_inventories()))) &&
            ((this.total_inventories==null && other.getTotal_inventories()==null) || 
             (this.total_inventories!=null &&
              this.total_inventories.equals(other.getTotal_inventories()))) &&
            ((this.trade_receivables==null && other.getTrade_receivables()==null) || 
             (this.trade_receivables!=null &&
              this.trade_receivables.equals(other.getTrade_receivables()))) &&
            ((this.group_receivables==null && other.getGroup_receivables()==null) || 
             (this.group_receivables!=null &&
              this.group_receivables.equals(other.getGroup_receivables()))) &&
            ((this.receivables_due_after1Year==null && other.getReceivables_due_after1Year()==null) || 
             (this.receivables_due_after1Year!=null &&
              this.receivables_due_after1Year.equals(other.getReceivables_due_after1Year()))) &&
            ((this.miscellaneous_receivables==null && other.getMiscellaneous_receivables()==null) || 
             (this.miscellaneous_receivables!=null &&
              this.miscellaneous_receivables.equals(other.getMiscellaneous_receivables()))) &&
            ((this.total_receivables==null && other.getTotal_receivables()==null) || 
             (this.total_receivables!=null &&
              this.total_receivables.equals(other.getTotal_receivables()))) &&
            ((this.cash==null && other.getCash()==null) || 
             (this.cash!=null &&
              this.cash.equals(other.getCash()))) &&
            ((this.other_current_assets==null && other.getOther_current_assets()==null) || 
             (this.other_current_assets!=null &&
              this.other_current_assets.equals(other.getOther_current_assets()))) &&
            ((this.total_current_assets==null && other.getTotal_current_assets()==null) || 
             (this.total_current_assets!=null &&
              this.total_current_assets.equals(other.getTotal_current_assets()))) &&
            ((this.total_assets==null && other.getTotal_assets()==null) || 
             (this.total_assets!=null &&
              this.total_assets.equals(other.getTotal_assets()))) &&
            ((this.trade_payables==null && other.getTrade_payables()==null) || 
             (this.trade_payables!=null &&
              this.trade_payables.equals(other.getTrade_payables()))) &&
            ((this.bank_liabilities==null && other.getBank_liabilities()==null) || 
             (this.bank_liabilities!=null &&
              this.bank_liabilities.equals(other.getBank_liabilities()))) &&
            ((this.other_loans_or_finance==null && other.getOther_loans_or_finance()==null) || 
             (this.other_loans_or_finance!=null &&
              this.other_loans_or_finance.equals(other.getOther_loans_or_finance()))) &&
            ((this.group_payables==null && other.getGroup_payables()==null) || 
             (this.group_payables!=null &&
              this.group_payables.equals(other.getGroup_payables()))) &&
            ((this.miscellaneous_liabilities==null && other.getMiscellaneous_liabilities()==null) || 
             (this.miscellaneous_liabilities!=null &&
              this.miscellaneous_liabilities.equals(other.getMiscellaneous_liabilities()))) &&
            ((this.total_current_liabilities==null && other.getTotal_current_liabilities()==null) || 
             (this.total_current_liabilities!=null &&
              this.total_current_liabilities.equals(other.getTotal_current_liabilities()))) &&
            ((this.trade_payables_due_after1Year==null && other.getTrade_payables_due_after1Year()==null) || 
             (this.trade_payables_due_after1Year!=null &&
              this.trade_payables_due_after1Year.equals(other.getTrade_payables_due_after1Year()))) &&
            ((this.bank_liabilities_due_after1Year==null && other.getBank_liabilities_due_after1Year()==null) || 
             (this.bank_liabilities_due_after1Year!=null &&
              this.bank_liabilities_due_after1Year.equals(other.getBank_liabilities_due_after1Year()))) &&
            ((this.other_loans_or_finance_due_after1Year==null && other.getOther_loans_or_finance_due_after1Year()==null) || 
             (this.other_loans_or_finance_due_after1Year!=null &&
              this.other_loans_or_finance_due_after1Year.equals(other.getOther_loans_or_finance_due_after1Year()))) &&
            ((this.group_payables_due_after1Year==null && other.getGroup_payables_due_after1Year()==null) || 
             (this.group_payables_due_after1Year!=null &&
              this.group_payables_due_after1Year.equals(other.getGroup_payables_due_after1Year()))) &&
            ((this.miscellaneous_liabilities_due_after1Year==null && other.getMiscellaneous_liabilities_due_after1Year()==null) || 
             (this.miscellaneous_liabilities_due_after1Year!=null &&
              this.miscellaneous_liabilities_due_after1Year.equals(other.getMiscellaneous_liabilities_due_after1Year()))) &&
            ((this.total_long_term_liabilities==null && other.getTotal_long_term_liabilities()==null) || 
             (this.total_long_term_liabilities!=null &&
              this.total_long_term_liabilities.equals(other.getTotal_long_term_liabilities()))) &&
            ((this.total_liabilities==null && other.getTotal_liabilities()==null) || 
             (this.total_liabilities!=null &&
              this.total_liabilities.equals(other.getTotal_liabilities()))) &&
            ((this.called_up_share_capital==null && other.getCalled_up_share_capital()==null) || 
             (this.called_up_share_capital!=null &&
              this.called_up_share_capital.equals(other.getCalled_up_share_capital()))) &&
            ((this.share_premium==null && other.getShare_premium()==null) || 
             (this.share_premium!=null &&
              this.share_premium.equals(other.getShare_premium()))) &&
            ((this.revenue_reserves==null && other.getRevenue_reserves()==null) || 
             (this.revenue_reserves!=null &&
              this.revenue_reserves.equals(other.getRevenue_reserves()))) &&
            ((this.other_reserves==null && other.getOther_reserves()==null) || 
             (this.other_reserves!=null &&
              this.other_reserves.equals(other.getOther_reserves()))) &&
            ((this.total_shareholders_equity==null && other.getTotal_shareholders_equity()==null) || 
             (this.total_shareholders_equity!=null &&
              this.total_shareholders_equity.equals(other.getTotal_shareholders_equity())));
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
        if (getLand_and_buildings() != null) {
            _hashCode += getLand_and_buildings().hashCode();
        }
        if (getPlant_and_machinery() != null) {
            _hashCode += getPlant_and_machinery().hashCode();
        }
        if (getOther_tangible_assets() != null) {
            _hashCode += getOther_tangible_assets().hashCode();
        }
        if (getTotal_tangible_assets() != null) {
            _hashCode += getTotal_tangible_assets().hashCode();
        }
        if (getGoodwill() != null) {
            _hashCode += getGoodwill().hashCode();
        }
        if (getOther_intangible_assets() != null) {
            _hashCode += getOther_intangible_assets().hashCode();
        }
        if (getTotal_intangible_assets() != null) {
            _hashCode += getTotal_intangible_assets().hashCode();
        }
        if (getInvestments() != null) {
            _hashCode += getInvestments().hashCode();
        }
        if (getLoans_to_group() != null) {
            _hashCode += getLoans_to_group().hashCode();
        }
        if (getOther_loans() != null) {
            _hashCode += getOther_loans().hashCode();
        }
        if (getMiscellaneous_fixed_assets() != null) {
            _hashCode += getMiscellaneous_fixed_assets().hashCode();
        }
        if (getTotal_other_fixed_assets() != null) {
            _hashCode += getTotal_other_fixed_assets().hashCode();
        }
        if (getTotal_fixed_assets() != null) {
            _hashCode += getTotal_fixed_assets().hashCode();
        }
        if (getRaw_materials() != null) {
            _hashCode += getRaw_materials().hashCode();
        }
        if (getWork_in_progress() != null) {
            _hashCode += getWork_in_progress().hashCode();
        }
        if (getFinished_goods() != null) {
            _hashCode += getFinished_goods().hashCode();
        }
        if (getOther_inventories() != null) {
            _hashCode += getOther_inventories().hashCode();
        }
        if (getTotal_inventories() != null) {
            _hashCode += getTotal_inventories().hashCode();
        }
        if (getTrade_receivables() != null) {
            _hashCode += getTrade_receivables().hashCode();
        }
        if (getGroup_receivables() != null) {
            _hashCode += getGroup_receivables().hashCode();
        }
        if (getReceivables_due_after1Year() != null) {
            _hashCode += getReceivables_due_after1Year().hashCode();
        }
        if (getMiscellaneous_receivables() != null) {
            _hashCode += getMiscellaneous_receivables().hashCode();
        }
        if (getTotal_receivables() != null) {
            _hashCode += getTotal_receivables().hashCode();
        }
        if (getCash() != null) {
            _hashCode += getCash().hashCode();
        }
        if (getOther_current_assets() != null) {
            _hashCode += getOther_current_assets().hashCode();
        }
        if (getTotal_current_assets() != null) {
            _hashCode += getTotal_current_assets().hashCode();
        }
        if (getTotal_assets() != null) {
            _hashCode += getTotal_assets().hashCode();
        }
        if (getTrade_payables() != null) {
            _hashCode += getTrade_payables().hashCode();
        }
        if (getBank_liabilities() != null) {
            _hashCode += getBank_liabilities().hashCode();
        }
        if (getOther_loans_or_finance() != null) {
            _hashCode += getOther_loans_or_finance().hashCode();
        }
        if (getGroup_payables() != null) {
            _hashCode += getGroup_payables().hashCode();
        }
        if (getMiscellaneous_liabilities() != null) {
            _hashCode += getMiscellaneous_liabilities().hashCode();
        }
        if (getTotal_current_liabilities() != null) {
            _hashCode += getTotal_current_liabilities().hashCode();
        }
        if (getTrade_payables_due_after1Year() != null) {
            _hashCode += getTrade_payables_due_after1Year().hashCode();
        }
        if (getBank_liabilities_due_after1Year() != null) {
            _hashCode += getBank_liabilities_due_after1Year().hashCode();
        }
        if (getOther_loans_or_finance_due_after1Year() != null) {
            _hashCode += getOther_loans_or_finance_due_after1Year().hashCode();
        }
        if (getGroup_payables_due_after1Year() != null) {
            _hashCode += getGroup_payables_due_after1Year().hashCode();
        }
        if (getMiscellaneous_liabilities_due_after1Year() != null) {
            _hashCode += getMiscellaneous_liabilities_due_after1Year().hashCode();
        }
        if (getTotal_long_term_liabilities() != null) {
            _hashCode += getTotal_long_term_liabilities().hashCode();
        }
        if (getTotal_liabilities() != null) {
            _hashCode += getTotal_liabilities().hashCode();
        }
        if (getCalled_up_share_capital() != null) {
            _hashCode += getCalled_up_share_capital().hashCode();
        }
        if (getShare_premium() != null) {
            _hashCode += getShare_premium().hashCode();
        }
        if (getRevenue_reserves() != null) {
            _hashCode += getRevenue_reserves().hashCode();
        }
        if (getOther_reserves() != null) {
            _hashCode += getOther_reserves().hashCode();
        }
        if (getTotal_shareholders_equity() != null) {
            _hashCode += getTotal_shareholders_equity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBalanceSheet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBalanceSheet"));
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
        elemField.setFieldName("land_and_buildings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "land_and_buildings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plant_and_machinery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plant_and_machinery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_tangible_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_tangible_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_tangible_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_tangible_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodwill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "goodwill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_intangible_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_intangible_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_intangible_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_intangible_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "investments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loans_to_group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "loans_to_group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_loans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_loans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneous_fixed_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "miscellaneous_fixed_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_other_fixed_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_other_fixed_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_fixed_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_fixed_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raw_materials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "raw_materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("work_in_progress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "work_in_progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finished_goods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "finished_goods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_inventories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_inventories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_inventories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_inventories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_receivables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_receivables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_receivables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "group_receivables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivables_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "receivables_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneous_receivables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "miscellaneous_receivables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_receivables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_receivables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_current_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_current_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_current_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_current_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_assets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_payables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_payables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bank_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_loans_or_finance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_loans_or_finance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_payables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "group_payables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneous_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "miscellaneous_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_current_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_current_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_payables_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_payables_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_liabilities_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bank_liabilities_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_loans_or_finance_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_loans_or_finance_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_payables_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "group_payables_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneous_liabilities_due_after1Year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "miscellaneous_liabilities_due_after1year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_long_term_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_long_term_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_liabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_liabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("called_up_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "called_up_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share_premium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "share_premium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue_reserves");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "revenue_reserves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_reserves");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_reserves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_shareholders_equity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total_shareholders_equity"));
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
