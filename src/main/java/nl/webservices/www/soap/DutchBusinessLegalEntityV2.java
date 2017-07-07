/**
 * DutchBusinessLegalEntityV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessLegalEntityV2  implements java.io.Serializable {
    private java.lang.String rsin_number;

    private java.lang.String name;

    private java.lang.String alternative_name;

    private java.lang.String shortened_name;

    private java.lang.String registration;

    private java.lang.String legal_form_text;

    private java.lang.String legal_form_change;

    private java.lang.String foreign_legal_form_description;

    private java.lang.String activity;

    private java.lang.String company_arrangement;

    private java.lang.String legal_name;

    private java.lang.String statutory_seat;

    private nl.webservices.www.soap.DutchBusinessDateV2 registration_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 founding_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date;

    private java.lang.String dissolution_reason;

    private nl.webservices.www.soap.DutchBusinessDateV2 removal_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 registration_end_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 legal_entity_end_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 liquidation_closure_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 liquidation_reopening_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 deed_incorporation_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 deed_last_statutes_amendment_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 last_statutes_amendment_date;

    private java.lang.String liability;

    private java.lang.String merger_description;

    private java.lang.String annual_report_submission;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 authorized_share_capital;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 issued_share_capital;

    private nl.webservices.www.soap.DutchBusinessMoneyV2 paid_up_share_capital;

    private java.lang.String duration;

    private nl.webservices.www.soap.DutchBusinessDateV2 duration_end_date;

    private java.lang.String shares;

    private java.lang.String share_holders;

    private java.lang.String[] remarks;

    private nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address;

    private nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address;

    private java.lang.String[] telephone_numbers;

    private java.lang.String[] fax_numbers;

    private java.lang.String[] email_addresses;

    private java.lang.String[] domain_names;

    private nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes;

    public DutchBusinessLegalEntityV2() {
    }

    public DutchBusinessLegalEntityV2(
           java.lang.String rsin_number,
           java.lang.String name,
           java.lang.String alternative_name,
           java.lang.String shortened_name,
           java.lang.String registration,
           java.lang.String legal_form_text,
           java.lang.String legal_form_change,
           java.lang.String foreign_legal_form_description,
           java.lang.String activity,
           java.lang.String company_arrangement,
           java.lang.String legal_name,
           java.lang.String statutory_seat,
           nl.webservices.www.soap.DutchBusinessDateV2 registration_date,
           nl.webservices.www.soap.DutchBusinessDateV2 founding_date,
           nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date,
           nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date,
           java.lang.String dissolution_reason,
           nl.webservices.www.soap.DutchBusinessDateV2 removal_date,
           nl.webservices.www.soap.DutchBusinessDateV2 registration_end_date,
           nl.webservices.www.soap.DutchBusinessDateV2 legal_entity_end_date,
           nl.webservices.www.soap.DutchBusinessDateV2 liquidation_closure_date,
           nl.webservices.www.soap.DutchBusinessDateV2 liquidation_reopening_date,
           nl.webservices.www.soap.DutchBusinessDateV2 deed_incorporation_date,
           nl.webservices.www.soap.DutchBusinessDateV2 deed_last_statutes_amendment_date,
           nl.webservices.www.soap.DutchBusinessDateV2 last_statutes_amendment_date,
           java.lang.String liability,
           java.lang.String merger_description,
           java.lang.String annual_report_submission,
           nl.webservices.www.soap.DutchBusinessMoneyV2 authorized_share_capital,
           nl.webservices.www.soap.DutchBusinessMoneyV2 issued_share_capital,
           nl.webservices.www.soap.DutchBusinessMoneyV2 paid_up_share_capital,
           java.lang.String duration,
           nl.webservices.www.soap.DutchBusinessDateV2 duration_end_date,
           java.lang.String shares,
           java.lang.String share_holders,
           java.lang.String[] remarks,
           nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address,
           nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address,
           java.lang.String[] telephone_numbers,
           java.lang.String[] fax_numbers,
           java.lang.String[] email_addresses,
           java.lang.String[] domain_names,
           nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes) {
           this.rsin_number = rsin_number;
           this.name = name;
           this.alternative_name = alternative_name;
           this.shortened_name = shortened_name;
           this.registration = registration;
           this.legal_form_text = legal_form_text;
           this.legal_form_change = legal_form_change;
           this.foreign_legal_form_description = foreign_legal_form_description;
           this.activity = activity;
           this.company_arrangement = company_arrangement;
           this.legal_name = legal_name;
           this.statutory_seat = statutory_seat;
           this.registration_date = registration_date;
           this.founding_date = founding_date;
           this.discontinuation_date = discontinuation_date;
           this.dissolution_date = dissolution_date;
           this.dissolution_reason = dissolution_reason;
           this.removal_date = removal_date;
           this.registration_end_date = registration_end_date;
           this.legal_entity_end_date = legal_entity_end_date;
           this.liquidation_closure_date = liquidation_closure_date;
           this.liquidation_reopening_date = liquidation_reopening_date;
           this.deed_incorporation_date = deed_incorporation_date;
           this.deed_last_statutes_amendment_date = deed_last_statutes_amendment_date;
           this.last_statutes_amendment_date = last_statutes_amendment_date;
           this.liability = liability;
           this.merger_description = merger_description;
           this.annual_report_submission = annual_report_submission;
           this.authorized_share_capital = authorized_share_capital;
           this.issued_share_capital = issued_share_capital;
           this.paid_up_share_capital = paid_up_share_capital;
           this.duration = duration;
           this.duration_end_date = duration_end_date;
           this.shares = shares;
           this.share_holders = share_holders;
           this.remarks = remarks;
           this.establishment_address = establishment_address;
           this.correspondence_address = correspondence_address;
           this.telephone_numbers = telephone_numbers;
           this.fax_numbers = fax_numbers;
           this.email_addresses = email_addresses;
           this.domain_names = domain_names;
           this.sbi_codes = sbi_codes;
    }


    /**
     * Gets the rsin_number value for this DutchBusinessLegalEntityV2.
     * 
     * @return rsin_number
     */
    public java.lang.String getRsin_number() {
        return rsin_number;
    }


    /**
     * Sets the rsin_number value for this DutchBusinessLegalEntityV2.
     * 
     * @param rsin_number
     */
    public void setRsin_number(java.lang.String rsin_number) {
        this.rsin_number = rsin_number;
    }


    /**
     * Gets the name value for this DutchBusinessLegalEntityV2.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DutchBusinessLegalEntityV2.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the alternative_name value for this DutchBusinessLegalEntityV2.
     * 
     * @return alternative_name
     */
    public java.lang.String getAlternative_name() {
        return alternative_name;
    }


    /**
     * Sets the alternative_name value for this DutchBusinessLegalEntityV2.
     * 
     * @param alternative_name
     */
    public void setAlternative_name(java.lang.String alternative_name) {
        this.alternative_name = alternative_name;
    }


    /**
     * Gets the shortened_name value for this DutchBusinessLegalEntityV2.
     * 
     * @return shortened_name
     */
    public java.lang.String getShortened_name() {
        return shortened_name;
    }


    /**
     * Sets the shortened_name value for this DutchBusinessLegalEntityV2.
     * 
     * @param shortened_name
     */
    public void setShortened_name(java.lang.String shortened_name) {
        this.shortened_name = shortened_name;
    }


    /**
     * Gets the registration value for this DutchBusinessLegalEntityV2.
     * 
     * @return registration
     */
    public java.lang.String getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this DutchBusinessLegalEntityV2.
     * 
     * @param registration
     */
    public void setRegistration(java.lang.String registration) {
        this.registration = registration;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessLegalEntityV2.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessLegalEntityV2.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the legal_form_change value for this DutchBusinessLegalEntityV2.
     * 
     * @return legal_form_change
     */
    public java.lang.String getLegal_form_change() {
        return legal_form_change;
    }


    /**
     * Sets the legal_form_change value for this DutchBusinessLegalEntityV2.
     * 
     * @param legal_form_change
     */
    public void setLegal_form_change(java.lang.String legal_form_change) {
        this.legal_form_change = legal_form_change;
    }


    /**
     * Gets the foreign_legal_form_description value for this DutchBusinessLegalEntityV2.
     * 
     * @return foreign_legal_form_description
     */
    public java.lang.String getForeign_legal_form_description() {
        return foreign_legal_form_description;
    }


    /**
     * Sets the foreign_legal_form_description value for this DutchBusinessLegalEntityV2.
     * 
     * @param foreign_legal_form_description
     */
    public void setForeign_legal_form_description(java.lang.String foreign_legal_form_description) {
        this.foreign_legal_form_description = foreign_legal_form_description;
    }


    /**
     * Gets the activity value for this DutchBusinessLegalEntityV2.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this DutchBusinessLegalEntityV2.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the company_arrangement value for this DutchBusinessLegalEntityV2.
     * 
     * @return company_arrangement
     */
    public java.lang.String getCompany_arrangement() {
        return company_arrangement;
    }


    /**
     * Sets the company_arrangement value for this DutchBusinessLegalEntityV2.
     * 
     * @param company_arrangement
     */
    public void setCompany_arrangement(java.lang.String company_arrangement) {
        this.company_arrangement = company_arrangement;
    }


    /**
     * Gets the legal_name value for this DutchBusinessLegalEntityV2.
     * 
     * @return legal_name
     */
    public java.lang.String getLegal_name() {
        return legal_name;
    }


    /**
     * Sets the legal_name value for this DutchBusinessLegalEntityV2.
     * 
     * @param legal_name
     */
    public void setLegal_name(java.lang.String legal_name) {
        this.legal_name = legal_name;
    }


    /**
     * Gets the statutory_seat value for this DutchBusinessLegalEntityV2.
     * 
     * @return statutory_seat
     */
    public java.lang.String getStatutory_seat() {
        return statutory_seat;
    }


    /**
     * Sets the statutory_seat value for this DutchBusinessLegalEntityV2.
     * 
     * @param statutory_seat
     */
    public void setStatutory_seat(java.lang.String statutory_seat) {
        this.statutory_seat = statutory_seat;
    }


    /**
     * Gets the registration_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return registration_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getRegistration_date() {
        return registration_date;
    }


    /**
     * Sets the registration_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param registration_date
     */
    public void setRegistration_date(nl.webservices.www.soap.DutchBusinessDateV2 registration_date) {
        this.registration_date = registration_date;
    }


    /**
     * Gets the founding_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return founding_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getFounding_date() {
        return founding_date;
    }


    /**
     * Sets the founding_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param founding_date
     */
    public void setFounding_date(nl.webservices.www.soap.DutchBusinessDateV2 founding_date) {
        this.founding_date = founding_date;
    }


    /**
     * Gets the discontinuation_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return discontinuation_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDiscontinuation_date() {
        return discontinuation_date;
    }


    /**
     * Sets the discontinuation_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param discontinuation_date
     */
    public void setDiscontinuation_date(nl.webservices.www.soap.DutchBusinessDateV2 discontinuation_date) {
        this.discontinuation_date = discontinuation_date;
    }


    /**
     * Gets the dissolution_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return dissolution_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDissolution_date() {
        return dissolution_date;
    }


    /**
     * Sets the dissolution_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param dissolution_date
     */
    public void setDissolution_date(nl.webservices.www.soap.DutchBusinessDateV2 dissolution_date) {
        this.dissolution_date = dissolution_date;
    }


    /**
     * Gets the dissolution_reason value for this DutchBusinessLegalEntityV2.
     * 
     * @return dissolution_reason
     */
    public java.lang.String getDissolution_reason() {
        return dissolution_reason;
    }


    /**
     * Sets the dissolution_reason value for this DutchBusinessLegalEntityV2.
     * 
     * @param dissolution_reason
     */
    public void setDissolution_reason(java.lang.String dissolution_reason) {
        this.dissolution_reason = dissolution_reason;
    }


    /**
     * Gets the removal_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return removal_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getRemoval_date() {
        return removal_date;
    }


    /**
     * Sets the removal_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param removal_date
     */
    public void setRemoval_date(nl.webservices.www.soap.DutchBusinessDateV2 removal_date) {
        this.removal_date = removal_date;
    }


    /**
     * Gets the registration_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return registration_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getRegistration_end_date() {
        return registration_end_date;
    }


    /**
     * Sets the registration_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param registration_end_date
     */
    public void setRegistration_end_date(nl.webservices.www.soap.DutchBusinessDateV2 registration_end_date) {
        this.registration_end_date = registration_end_date;
    }


    /**
     * Gets the legal_entity_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return legal_entity_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getLegal_entity_end_date() {
        return legal_entity_end_date;
    }


    /**
     * Sets the legal_entity_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param legal_entity_end_date
     */
    public void setLegal_entity_end_date(nl.webservices.www.soap.DutchBusinessDateV2 legal_entity_end_date) {
        this.legal_entity_end_date = legal_entity_end_date;
    }


    /**
     * Gets the liquidation_closure_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return liquidation_closure_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getLiquidation_closure_date() {
        return liquidation_closure_date;
    }


    /**
     * Sets the liquidation_closure_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param liquidation_closure_date
     */
    public void setLiquidation_closure_date(nl.webservices.www.soap.DutchBusinessDateV2 liquidation_closure_date) {
        this.liquidation_closure_date = liquidation_closure_date;
    }


    /**
     * Gets the liquidation_reopening_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return liquidation_reopening_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getLiquidation_reopening_date() {
        return liquidation_reopening_date;
    }


    /**
     * Sets the liquidation_reopening_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param liquidation_reopening_date
     */
    public void setLiquidation_reopening_date(nl.webservices.www.soap.DutchBusinessDateV2 liquidation_reopening_date) {
        this.liquidation_reopening_date = liquidation_reopening_date;
    }


    /**
     * Gets the deed_incorporation_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return deed_incorporation_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDeed_incorporation_date() {
        return deed_incorporation_date;
    }


    /**
     * Sets the deed_incorporation_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param deed_incorporation_date
     */
    public void setDeed_incorporation_date(nl.webservices.www.soap.DutchBusinessDateV2 deed_incorporation_date) {
        this.deed_incorporation_date = deed_incorporation_date;
    }


    /**
     * Gets the deed_last_statutes_amendment_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return deed_last_statutes_amendment_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDeed_last_statutes_amendment_date() {
        return deed_last_statutes_amendment_date;
    }


    /**
     * Sets the deed_last_statutes_amendment_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param deed_last_statutes_amendment_date
     */
    public void setDeed_last_statutes_amendment_date(nl.webservices.www.soap.DutchBusinessDateV2 deed_last_statutes_amendment_date) {
        this.deed_last_statutes_amendment_date = deed_last_statutes_amendment_date;
    }


    /**
     * Gets the last_statutes_amendment_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return last_statutes_amendment_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getLast_statutes_amendment_date() {
        return last_statutes_amendment_date;
    }


    /**
     * Sets the last_statutes_amendment_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param last_statutes_amendment_date
     */
    public void setLast_statutes_amendment_date(nl.webservices.www.soap.DutchBusinessDateV2 last_statutes_amendment_date) {
        this.last_statutes_amendment_date = last_statutes_amendment_date;
    }


    /**
     * Gets the liability value for this DutchBusinessLegalEntityV2.
     * 
     * @return liability
     */
    public java.lang.String getLiability() {
        return liability;
    }


    /**
     * Sets the liability value for this DutchBusinessLegalEntityV2.
     * 
     * @param liability
     */
    public void setLiability(java.lang.String liability) {
        this.liability = liability;
    }


    /**
     * Gets the merger_description value for this DutchBusinessLegalEntityV2.
     * 
     * @return merger_description
     */
    public java.lang.String getMerger_description() {
        return merger_description;
    }


    /**
     * Sets the merger_description value for this DutchBusinessLegalEntityV2.
     * 
     * @param merger_description
     */
    public void setMerger_description(java.lang.String merger_description) {
        this.merger_description = merger_description;
    }


    /**
     * Gets the annual_report_submission value for this DutchBusinessLegalEntityV2.
     * 
     * @return annual_report_submission
     */
    public java.lang.String getAnnual_report_submission() {
        return annual_report_submission;
    }


    /**
     * Sets the annual_report_submission value for this DutchBusinessLegalEntityV2.
     * 
     * @param annual_report_submission
     */
    public void setAnnual_report_submission(java.lang.String annual_report_submission) {
        this.annual_report_submission = annual_report_submission;
    }


    /**
     * Gets the authorized_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @return authorized_share_capital
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getAuthorized_share_capital() {
        return authorized_share_capital;
    }


    /**
     * Sets the authorized_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @param authorized_share_capital
     */
    public void setAuthorized_share_capital(nl.webservices.www.soap.DutchBusinessMoneyV2 authorized_share_capital) {
        this.authorized_share_capital = authorized_share_capital;
    }


    /**
     * Gets the issued_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @return issued_share_capital
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getIssued_share_capital() {
        return issued_share_capital;
    }


    /**
     * Sets the issued_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @param issued_share_capital
     */
    public void setIssued_share_capital(nl.webservices.www.soap.DutchBusinessMoneyV2 issued_share_capital) {
        this.issued_share_capital = issued_share_capital;
    }


    /**
     * Gets the paid_up_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @return paid_up_share_capital
     */
    public nl.webservices.www.soap.DutchBusinessMoneyV2 getPaid_up_share_capital() {
        return paid_up_share_capital;
    }


    /**
     * Sets the paid_up_share_capital value for this DutchBusinessLegalEntityV2.
     * 
     * @param paid_up_share_capital
     */
    public void setPaid_up_share_capital(nl.webservices.www.soap.DutchBusinessMoneyV2 paid_up_share_capital) {
        this.paid_up_share_capital = paid_up_share_capital;
    }


    /**
     * Gets the duration value for this DutchBusinessLegalEntityV2.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DutchBusinessLegalEntityV2.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the duration_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @return duration_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDuration_end_date() {
        return duration_end_date;
    }


    /**
     * Sets the duration_end_date value for this DutchBusinessLegalEntityV2.
     * 
     * @param duration_end_date
     */
    public void setDuration_end_date(nl.webservices.www.soap.DutchBusinessDateV2 duration_end_date) {
        this.duration_end_date = duration_end_date;
    }


    /**
     * Gets the shares value for this DutchBusinessLegalEntityV2.
     * 
     * @return shares
     */
    public java.lang.String getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this DutchBusinessLegalEntityV2.
     * 
     * @param shares
     */
    public void setShares(java.lang.String shares) {
        this.shares = shares;
    }


    /**
     * Gets the share_holders value for this DutchBusinessLegalEntityV2.
     * 
     * @return share_holders
     */
    public java.lang.String getShare_holders() {
        return share_holders;
    }


    /**
     * Sets the share_holders value for this DutchBusinessLegalEntityV2.
     * 
     * @param share_holders
     */
    public void setShare_holders(java.lang.String share_holders) {
        this.share_holders = share_holders;
    }


    /**
     * Gets the remarks value for this DutchBusinessLegalEntityV2.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessLegalEntityV2.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the establishment_address value for this DutchBusinessLegalEntityV2.
     * 
     * @return establishment_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getEstablishment_address() {
        return establishment_address;
    }


    /**
     * Sets the establishment_address value for this DutchBusinessLegalEntityV2.
     * 
     * @param establishment_address
     */
    public void setEstablishment_address(nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address) {
        this.establishment_address = establishment_address;
    }


    /**
     * Gets the correspondence_address value for this DutchBusinessLegalEntityV2.
     * 
     * @return correspondence_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getCorrespondence_address() {
        return correspondence_address;
    }


    /**
     * Sets the correspondence_address value for this DutchBusinessLegalEntityV2.
     * 
     * @param correspondence_address
     */
    public void setCorrespondence_address(nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address) {
        this.correspondence_address = correspondence_address;
    }


    /**
     * Gets the telephone_numbers value for this DutchBusinessLegalEntityV2.
     * 
     * @return telephone_numbers
     */
    public java.lang.String[] getTelephone_numbers() {
        return telephone_numbers;
    }


    /**
     * Sets the telephone_numbers value for this DutchBusinessLegalEntityV2.
     * 
     * @param telephone_numbers
     */
    public void setTelephone_numbers(java.lang.String[] telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }


    /**
     * Gets the fax_numbers value for this DutchBusinessLegalEntityV2.
     * 
     * @return fax_numbers
     */
    public java.lang.String[] getFax_numbers() {
        return fax_numbers;
    }


    /**
     * Sets the fax_numbers value for this DutchBusinessLegalEntityV2.
     * 
     * @param fax_numbers
     */
    public void setFax_numbers(java.lang.String[] fax_numbers) {
        this.fax_numbers = fax_numbers;
    }


    /**
     * Gets the email_addresses value for this DutchBusinessLegalEntityV2.
     * 
     * @return email_addresses
     */
    public java.lang.String[] getEmail_addresses() {
        return email_addresses;
    }


    /**
     * Sets the email_addresses value for this DutchBusinessLegalEntityV2.
     * 
     * @param email_addresses
     */
    public void setEmail_addresses(java.lang.String[] email_addresses) {
        this.email_addresses = email_addresses;
    }


    /**
     * Gets the domain_names value for this DutchBusinessLegalEntityV2.
     * 
     * @return domain_names
     */
    public java.lang.String[] getDomain_names() {
        return domain_names;
    }


    /**
     * Sets the domain_names value for this DutchBusinessLegalEntityV2.
     * 
     * @param domain_names
     */
    public void setDomain_names(java.lang.String[] domain_names) {
        this.domain_names = domain_names;
    }


    /**
     * Gets the sbi_codes value for this DutchBusinessLegalEntityV2.
     * 
     * @return sbi_codes
     */
    public nl.webservices.www.soap.DutchBusinessSbiCodeV2[] getSbi_codes() {
        return sbi_codes;
    }


    /**
     * Sets the sbi_codes value for this DutchBusinessLegalEntityV2.
     * 
     * @param sbi_codes
     */
    public void setSbi_codes(nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes) {
        this.sbi_codes = sbi_codes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessLegalEntityV2)) return false;
        DutchBusinessLegalEntityV2 other = (DutchBusinessLegalEntityV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsin_number==null && other.getRsin_number()==null) || 
             (this.rsin_number!=null &&
              this.rsin_number.equals(other.getRsin_number()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.alternative_name==null && other.getAlternative_name()==null) || 
             (this.alternative_name!=null &&
              this.alternative_name.equals(other.getAlternative_name()))) &&
            ((this.shortened_name==null && other.getShortened_name()==null) || 
             (this.shortened_name!=null &&
              this.shortened_name.equals(other.getShortened_name()))) &&
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.legal_form_change==null && other.getLegal_form_change()==null) || 
             (this.legal_form_change!=null &&
              this.legal_form_change.equals(other.getLegal_form_change()))) &&
            ((this.foreign_legal_form_description==null && other.getForeign_legal_form_description()==null) || 
             (this.foreign_legal_form_description!=null &&
              this.foreign_legal_form_description.equals(other.getForeign_legal_form_description()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.company_arrangement==null && other.getCompany_arrangement()==null) || 
             (this.company_arrangement!=null &&
              this.company_arrangement.equals(other.getCompany_arrangement()))) &&
            ((this.legal_name==null && other.getLegal_name()==null) || 
             (this.legal_name!=null &&
              this.legal_name.equals(other.getLegal_name()))) &&
            ((this.statutory_seat==null && other.getStatutory_seat()==null) || 
             (this.statutory_seat!=null &&
              this.statutory_seat.equals(other.getStatutory_seat()))) &&
            ((this.registration_date==null && other.getRegistration_date()==null) || 
             (this.registration_date!=null &&
              this.registration_date.equals(other.getRegistration_date()))) &&
            ((this.founding_date==null && other.getFounding_date()==null) || 
             (this.founding_date!=null &&
              this.founding_date.equals(other.getFounding_date()))) &&
            ((this.discontinuation_date==null && other.getDiscontinuation_date()==null) || 
             (this.discontinuation_date!=null &&
              this.discontinuation_date.equals(other.getDiscontinuation_date()))) &&
            ((this.dissolution_date==null && other.getDissolution_date()==null) || 
             (this.dissolution_date!=null &&
              this.dissolution_date.equals(other.getDissolution_date()))) &&
            ((this.dissolution_reason==null && other.getDissolution_reason()==null) || 
             (this.dissolution_reason!=null &&
              this.dissolution_reason.equals(other.getDissolution_reason()))) &&
            ((this.removal_date==null && other.getRemoval_date()==null) || 
             (this.removal_date!=null &&
              this.removal_date.equals(other.getRemoval_date()))) &&
            ((this.registration_end_date==null && other.getRegistration_end_date()==null) || 
             (this.registration_end_date!=null &&
              this.registration_end_date.equals(other.getRegistration_end_date()))) &&
            ((this.legal_entity_end_date==null && other.getLegal_entity_end_date()==null) || 
             (this.legal_entity_end_date!=null &&
              this.legal_entity_end_date.equals(other.getLegal_entity_end_date()))) &&
            ((this.liquidation_closure_date==null && other.getLiquidation_closure_date()==null) || 
             (this.liquidation_closure_date!=null &&
              this.liquidation_closure_date.equals(other.getLiquidation_closure_date()))) &&
            ((this.liquidation_reopening_date==null && other.getLiquidation_reopening_date()==null) || 
             (this.liquidation_reopening_date!=null &&
              this.liquidation_reopening_date.equals(other.getLiquidation_reopening_date()))) &&
            ((this.deed_incorporation_date==null && other.getDeed_incorporation_date()==null) || 
             (this.deed_incorporation_date!=null &&
              this.deed_incorporation_date.equals(other.getDeed_incorporation_date()))) &&
            ((this.deed_last_statutes_amendment_date==null && other.getDeed_last_statutes_amendment_date()==null) || 
             (this.deed_last_statutes_amendment_date!=null &&
              this.deed_last_statutes_amendment_date.equals(other.getDeed_last_statutes_amendment_date()))) &&
            ((this.last_statutes_amendment_date==null && other.getLast_statutes_amendment_date()==null) || 
             (this.last_statutes_amendment_date!=null &&
              this.last_statutes_amendment_date.equals(other.getLast_statutes_amendment_date()))) &&
            ((this.liability==null && other.getLiability()==null) || 
             (this.liability!=null &&
              this.liability.equals(other.getLiability()))) &&
            ((this.merger_description==null && other.getMerger_description()==null) || 
             (this.merger_description!=null &&
              this.merger_description.equals(other.getMerger_description()))) &&
            ((this.annual_report_submission==null && other.getAnnual_report_submission()==null) || 
             (this.annual_report_submission!=null &&
              this.annual_report_submission.equals(other.getAnnual_report_submission()))) &&
            ((this.authorized_share_capital==null && other.getAuthorized_share_capital()==null) || 
             (this.authorized_share_capital!=null &&
              this.authorized_share_capital.equals(other.getAuthorized_share_capital()))) &&
            ((this.issued_share_capital==null && other.getIssued_share_capital()==null) || 
             (this.issued_share_capital!=null &&
              this.issued_share_capital.equals(other.getIssued_share_capital()))) &&
            ((this.paid_up_share_capital==null && other.getPaid_up_share_capital()==null) || 
             (this.paid_up_share_capital!=null &&
              this.paid_up_share_capital.equals(other.getPaid_up_share_capital()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.duration_end_date==null && other.getDuration_end_date()==null) || 
             (this.duration_end_date!=null &&
              this.duration_end_date.equals(other.getDuration_end_date()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.share_holders==null && other.getShare_holders()==null) || 
             (this.share_holders!=null &&
              this.share_holders.equals(other.getShare_holders()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.establishment_address==null && other.getEstablishment_address()==null) || 
             (this.establishment_address!=null &&
              this.establishment_address.equals(other.getEstablishment_address()))) &&
            ((this.correspondence_address==null && other.getCorrespondence_address()==null) || 
             (this.correspondence_address!=null &&
              this.correspondence_address.equals(other.getCorrespondence_address()))) &&
            ((this.telephone_numbers==null && other.getTelephone_numbers()==null) || 
             (this.telephone_numbers!=null &&
              java.util.Arrays.equals(this.telephone_numbers, other.getTelephone_numbers()))) &&
            ((this.fax_numbers==null && other.getFax_numbers()==null) || 
             (this.fax_numbers!=null &&
              java.util.Arrays.equals(this.fax_numbers, other.getFax_numbers()))) &&
            ((this.email_addresses==null && other.getEmail_addresses()==null) || 
             (this.email_addresses!=null &&
              java.util.Arrays.equals(this.email_addresses, other.getEmail_addresses()))) &&
            ((this.domain_names==null && other.getDomain_names()==null) || 
             (this.domain_names!=null &&
              java.util.Arrays.equals(this.domain_names, other.getDomain_names()))) &&
            ((this.sbi_codes==null && other.getSbi_codes()==null) || 
             (this.sbi_codes!=null &&
              java.util.Arrays.equals(this.sbi_codes, other.getSbi_codes())));
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
        if (getRsin_number() != null) {
            _hashCode += getRsin_number().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAlternative_name() != null) {
            _hashCode += getAlternative_name().hashCode();
        }
        if (getShortened_name() != null) {
            _hashCode += getShortened_name().hashCode();
        }
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getLegal_form_change() != null) {
            _hashCode += getLegal_form_change().hashCode();
        }
        if (getForeign_legal_form_description() != null) {
            _hashCode += getForeign_legal_form_description().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getCompany_arrangement() != null) {
            _hashCode += getCompany_arrangement().hashCode();
        }
        if (getLegal_name() != null) {
            _hashCode += getLegal_name().hashCode();
        }
        if (getStatutory_seat() != null) {
            _hashCode += getStatutory_seat().hashCode();
        }
        if (getRegistration_date() != null) {
            _hashCode += getRegistration_date().hashCode();
        }
        if (getFounding_date() != null) {
            _hashCode += getFounding_date().hashCode();
        }
        if (getDiscontinuation_date() != null) {
            _hashCode += getDiscontinuation_date().hashCode();
        }
        if (getDissolution_date() != null) {
            _hashCode += getDissolution_date().hashCode();
        }
        if (getDissolution_reason() != null) {
            _hashCode += getDissolution_reason().hashCode();
        }
        if (getRemoval_date() != null) {
            _hashCode += getRemoval_date().hashCode();
        }
        if (getRegistration_end_date() != null) {
            _hashCode += getRegistration_end_date().hashCode();
        }
        if (getLegal_entity_end_date() != null) {
            _hashCode += getLegal_entity_end_date().hashCode();
        }
        if (getLiquidation_closure_date() != null) {
            _hashCode += getLiquidation_closure_date().hashCode();
        }
        if (getLiquidation_reopening_date() != null) {
            _hashCode += getLiquidation_reopening_date().hashCode();
        }
        if (getDeed_incorporation_date() != null) {
            _hashCode += getDeed_incorporation_date().hashCode();
        }
        if (getDeed_last_statutes_amendment_date() != null) {
            _hashCode += getDeed_last_statutes_amendment_date().hashCode();
        }
        if (getLast_statutes_amendment_date() != null) {
            _hashCode += getLast_statutes_amendment_date().hashCode();
        }
        if (getLiability() != null) {
            _hashCode += getLiability().hashCode();
        }
        if (getMerger_description() != null) {
            _hashCode += getMerger_description().hashCode();
        }
        if (getAnnual_report_submission() != null) {
            _hashCode += getAnnual_report_submission().hashCode();
        }
        if (getAuthorized_share_capital() != null) {
            _hashCode += getAuthorized_share_capital().hashCode();
        }
        if (getIssued_share_capital() != null) {
            _hashCode += getIssued_share_capital().hashCode();
        }
        if (getPaid_up_share_capital() != null) {
            _hashCode += getPaid_up_share_capital().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getDuration_end_date() != null) {
            _hashCode += getDuration_end_date().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getShare_holders() != null) {
            _hashCode += getShare_holders().hashCode();
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstablishment_address() != null) {
            _hashCode += getEstablishment_address().hashCode();
        }
        if (getCorrespondence_address() != null) {
            _hashCode += getCorrespondence_address().hashCode();
        }
        if (getTelephone_numbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephone_numbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephone_numbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFax_numbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFax_numbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFax_numbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail_addresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail_addresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail_addresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomain_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomain_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomain_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSbi_codes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbi_codes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbi_codes(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessLegalEntityV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessLegalEntityV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsin_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rsin_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternative_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alternative_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortened_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "shortened_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_change");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreign_legal_form_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "foreign_legal_form_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_arrangement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_arrangement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statutory_seat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "statutory_seat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("founding_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founding_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discontinuation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "discontinuation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolution_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dissolution_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolution_reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dissolution_reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "removal_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_entity_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_entity_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liquidation_closure_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liquidation_closure_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liquidation_reopening_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liquidation_reopening_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deed_incorporation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deed_incorporation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deed_last_statutes_amendment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deed_last_statutes_amendment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_statutes_amendment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_statutes_amendment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merger_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "merger_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_report_submission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "annual_report_submission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorized_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorized_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "issued_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid_up_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paid_up_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessMoneyV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duration_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share_holders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "share_holders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fax_numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "email_addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domain_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSbiCodeV2"));
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
