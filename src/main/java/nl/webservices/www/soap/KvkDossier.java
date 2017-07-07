/**
 * KvkDossier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KvkDossier  implements java.io.Serializable {
    private nl.webservices.www.soap.KvkUpdateReference update_info;

    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String main_establishment_number;

    private boolean indication_main_establishment;

    private java.lang.String rsin_number;

    private java.lang.String chamber_number;

    private java.lang.String legal_form_code;

    private java.lang.String legal_form_text;

    private java.lang.String indication_organisation_code;

    private java.lang.String legal_name;

    private java.lang.String trade_name_45;

    private java.lang.String trade_name_full;

    private java.lang.String[] trade_names;

    private java.lang.String establishment_postcode;

    private java.lang.String establishment_city;

    private java.lang.String establishment_street;

    private int establishment_house_number;

    private java.lang.String establishment_house_number_addition;

    private java.lang.String correspondence_postcode;

    private java.lang.String correspondence_city;

    private java.lang.String correspondence_street;

    private int correspondence_house_number;

    private java.lang.String correspondence_house_number_addition;

    private java.lang.String correspondence_country;

    private java.lang.String telephone_number;

    private java.lang.String mobile_number;

    private java.lang.String domain_name;

    private java.lang.String contact_title1;

    private java.lang.String contact_title2;

    private java.lang.String contact_initials;

    private java.lang.String contact_prefix;

    private java.lang.String contact_surname;

    private java.lang.String contact_gender;

    private java.lang.String primary_sbi_code;

    private java.lang.String secondary_sbi_code1;

    private java.lang.String secondary_sbi_code2;

    private java.lang.String primary_sbi_code_text;

    private java.lang.String secondary_sbi_code1_text;

    private java.lang.String secondary_sbi_code2_text;

    private int personnel;

    private int class_personnel;

    private int personnel_fulltime;

    private int class_personnel_fulltime;

    private nl.webservices.www.soap.KvkDate personnel_reference_date;

    private java.lang.Boolean indication_import;

    private java.lang.Boolean indication_export;

    private boolean indication_economically_active;

    private boolean indication_non_mailing;

    private boolean indication_bankruptcy;

    private boolean indication_dip;

    private java.lang.Long authorized_share_capital;

    private java.lang.String authorized_share_capital_currency;

    private java.lang.Long paid_up_share_capital;

    private java.lang.String paid_up_share_capital_currency;

    private java.lang.Long issued_share_capital;

    private java.lang.String issued_share_capital_currency;

    private nl.webservices.www.soap.KvkDate founding_date;

    private nl.webservices.www.soap.KvkDate continuation_date;

    private nl.webservices.www.soap.KvkDate establishment_date;

    public KvkDossier() {
    }

    public KvkDossier(
           nl.webservices.www.soap.KvkUpdateReference update_info,
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String main_establishment_number,
           boolean indication_main_establishment,
           java.lang.String rsin_number,
           java.lang.String chamber_number,
           java.lang.String legal_form_code,
           java.lang.String legal_form_text,
           java.lang.String indication_organisation_code,
           java.lang.String legal_name,
           java.lang.String trade_name_45,
           java.lang.String trade_name_full,
           java.lang.String[] trade_names,
           java.lang.String establishment_postcode,
           java.lang.String establishment_city,
           java.lang.String establishment_street,
           int establishment_house_number,
           java.lang.String establishment_house_number_addition,
           java.lang.String correspondence_postcode,
           java.lang.String correspondence_city,
           java.lang.String correspondence_street,
           int correspondence_house_number,
           java.lang.String correspondence_house_number_addition,
           java.lang.String correspondence_country,
           java.lang.String telephone_number,
           java.lang.String mobile_number,
           java.lang.String domain_name,
           java.lang.String contact_title1,
           java.lang.String contact_title2,
           java.lang.String contact_initials,
           java.lang.String contact_prefix,
           java.lang.String contact_surname,
           java.lang.String contact_gender,
           java.lang.String primary_sbi_code,
           java.lang.String secondary_sbi_code1,
           java.lang.String secondary_sbi_code2,
           java.lang.String primary_sbi_code_text,
           java.lang.String secondary_sbi_code1_text,
           java.lang.String secondary_sbi_code2_text,
           int personnel,
           int class_personnel,
           int personnel_fulltime,
           int class_personnel_fulltime,
           nl.webservices.www.soap.KvkDate personnel_reference_date,
           java.lang.Boolean indication_import,
           java.lang.Boolean indication_export,
           boolean indication_economically_active,
           boolean indication_non_mailing,
           boolean indication_bankruptcy,
           boolean indication_dip,
           java.lang.Long authorized_share_capital,
           java.lang.String authorized_share_capital_currency,
           java.lang.Long paid_up_share_capital,
           java.lang.String paid_up_share_capital_currency,
           java.lang.Long issued_share_capital,
           java.lang.String issued_share_capital_currency,
           nl.webservices.www.soap.KvkDate founding_date,
           nl.webservices.www.soap.KvkDate continuation_date,
           nl.webservices.www.soap.KvkDate establishment_date) {
           this.update_info = update_info;
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.main_establishment_number = main_establishment_number;
           this.indication_main_establishment = indication_main_establishment;
           this.rsin_number = rsin_number;
           this.chamber_number = chamber_number;
           this.legal_form_code = legal_form_code;
           this.legal_form_text = legal_form_text;
           this.indication_organisation_code = indication_organisation_code;
           this.legal_name = legal_name;
           this.trade_name_45 = trade_name_45;
           this.trade_name_full = trade_name_full;
           this.trade_names = trade_names;
           this.establishment_postcode = establishment_postcode;
           this.establishment_city = establishment_city;
           this.establishment_street = establishment_street;
           this.establishment_house_number = establishment_house_number;
           this.establishment_house_number_addition = establishment_house_number_addition;
           this.correspondence_postcode = correspondence_postcode;
           this.correspondence_city = correspondence_city;
           this.correspondence_street = correspondence_street;
           this.correspondence_house_number = correspondence_house_number;
           this.correspondence_house_number_addition = correspondence_house_number_addition;
           this.correspondence_country = correspondence_country;
           this.telephone_number = telephone_number;
           this.mobile_number = mobile_number;
           this.domain_name = domain_name;
           this.contact_title1 = contact_title1;
           this.contact_title2 = contact_title2;
           this.contact_initials = contact_initials;
           this.contact_prefix = contact_prefix;
           this.contact_surname = contact_surname;
           this.contact_gender = contact_gender;
           this.primary_sbi_code = primary_sbi_code;
           this.secondary_sbi_code1 = secondary_sbi_code1;
           this.secondary_sbi_code2 = secondary_sbi_code2;
           this.primary_sbi_code_text = primary_sbi_code_text;
           this.secondary_sbi_code1_text = secondary_sbi_code1_text;
           this.secondary_sbi_code2_text = secondary_sbi_code2_text;
           this.personnel = personnel;
           this.class_personnel = class_personnel;
           this.personnel_fulltime = personnel_fulltime;
           this.class_personnel_fulltime = class_personnel_fulltime;
           this.personnel_reference_date = personnel_reference_date;
           this.indication_import = indication_import;
           this.indication_export = indication_export;
           this.indication_economically_active = indication_economically_active;
           this.indication_non_mailing = indication_non_mailing;
           this.indication_bankruptcy = indication_bankruptcy;
           this.indication_dip = indication_dip;
           this.authorized_share_capital = authorized_share_capital;
           this.authorized_share_capital_currency = authorized_share_capital_currency;
           this.paid_up_share_capital = paid_up_share_capital;
           this.paid_up_share_capital_currency = paid_up_share_capital_currency;
           this.issued_share_capital = issued_share_capital;
           this.issued_share_capital_currency = issued_share_capital_currency;
           this.founding_date = founding_date;
           this.continuation_date = continuation_date;
           this.establishment_date = establishment_date;
    }


    /**
     * Gets the update_info value for this KvkDossier.
     * 
     * @return update_info
     */
    public nl.webservices.www.soap.KvkUpdateReference getUpdate_info() {
        return update_info;
    }


    /**
     * Sets the update_info value for this KvkDossier.
     * 
     * @param update_info
     */
    public void setUpdate_info(nl.webservices.www.soap.KvkUpdateReference update_info) {
        this.update_info = update_info;
    }


    /**
     * Gets the dossier_number value for this KvkDossier.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this KvkDossier.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this KvkDossier.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this KvkDossier.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the main_establishment_number value for this KvkDossier.
     * 
     * @return main_establishment_number
     */
    public java.lang.String getMain_establishment_number() {
        return main_establishment_number;
    }


    /**
     * Sets the main_establishment_number value for this KvkDossier.
     * 
     * @param main_establishment_number
     */
    public void setMain_establishment_number(java.lang.String main_establishment_number) {
        this.main_establishment_number = main_establishment_number;
    }


    /**
     * Gets the indication_main_establishment value for this KvkDossier.
     * 
     * @return indication_main_establishment
     */
    public boolean isIndication_main_establishment() {
        return indication_main_establishment;
    }


    /**
     * Sets the indication_main_establishment value for this KvkDossier.
     * 
     * @param indication_main_establishment
     */
    public void setIndication_main_establishment(boolean indication_main_establishment) {
        this.indication_main_establishment = indication_main_establishment;
    }


    /**
     * Gets the rsin_number value for this KvkDossier.
     * 
     * @return rsin_number
     */
    public java.lang.String getRsin_number() {
        return rsin_number;
    }


    /**
     * Sets the rsin_number value for this KvkDossier.
     * 
     * @param rsin_number
     */
    public void setRsin_number(java.lang.String rsin_number) {
        this.rsin_number = rsin_number;
    }


    /**
     * Gets the chamber_number value for this KvkDossier.
     * 
     * @return chamber_number
     */
    public java.lang.String getChamber_number() {
        return chamber_number;
    }


    /**
     * Sets the chamber_number value for this KvkDossier.
     * 
     * @param chamber_number
     */
    public void setChamber_number(java.lang.String chamber_number) {
        this.chamber_number = chamber_number;
    }


    /**
     * Gets the legal_form_code value for this KvkDossier.
     * 
     * @return legal_form_code
     */
    public java.lang.String getLegal_form_code() {
        return legal_form_code;
    }


    /**
     * Sets the legal_form_code value for this KvkDossier.
     * 
     * @param legal_form_code
     */
    public void setLegal_form_code(java.lang.String legal_form_code) {
        this.legal_form_code = legal_form_code;
    }


    /**
     * Gets the legal_form_text value for this KvkDossier.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this KvkDossier.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the indication_organisation_code value for this KvkDossier.
     * 
     * @return indication_organisation_code
     */
    public java.lang.String getIndication_organisation_code() {
        return indication_organisation_code;
    }


    /**
     * Sets the indication_organisation_code value for this KvkDossier.
     * 
     * @param indication_organisation_code
     */
    public void setIndication_organisation_code(java.lang.String indication_organisation_code) {
        this.indication_organisation_code = indication_organisation_code;
    }


    /**
     * Gets the legal_name value for this KvkDossier.
     * 
     * @return legal_name
     */
    public java.lang.String getLegal_name() {
        return legal_name;
    }


    /**
     * Sets the legal_name value for this KvkDossier.
     * 
     * @param legal_name
     */
    public void setLegal_name(java.lang.String legal_name) {
        this.legal_name = legal_name;
    }


    /**
     * Gets the trade_name_45 value for this KvkDossier.
     * 
     * @return trade_name_45
     */
    public java.lang.String getTrade_name_45() {
        return trade_name_45;
    }


    /**
     * Sets the trade_name_45 value for this KvkDossier.
     * 
     * @param trade_name_45
     */
    public void setTrade_name_45(java.lang.String trade_name_45) {
        this.trade_name_45 = trade_name_45;
    }


    /**
     * Gets the trade_name_full value for this KvkDossier.
     * 
     * @return trade_name_full
     */
    public java.lang.String getTrade_name_full() {
        return trade_name_full;
    }


    /**
     * Sets the trade_name_full value for this KvkDossier.
     * 
     * @param trade_name_full
     */
    public void setTrade_name_full(java.lang.String trade_name_full) {
        this.trade_name_full = trade_name_full;
    }


    /**
     * Gets the trade_names value for this KvkDossier.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this KvkDossier.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the establishment_postcode value for this KvkDossier.
     * 
     * @return establishment_postcode
     */
    public java.lang.String getEstablishment_postcode() {
        return establishment_postcode;
    }


    /**
     * Sets the establishment_postcode value for this KvkDossier.
     * 
     * @param establishment_postcode
     */
    public void setEstablishment_postcode(java.lang.String establishment_postcode) {
        this.establishment_postcode = establishment_postcode;
    }


    /**
     * Gets the establishment_city value for this KvkDossier.
     * 
     * @return establishment_city
     */
    public java.lang.String getEstablishment_city() {
        return establishment_city;
    }


    /**
     * Sets the establishment_city value for this KvkDossier.
     * 
     * @param establishment_city
     */
    public void setEstablishment_city(java.lang.String establishment_city) {
        this.establishment_city = establishment_city;
    }


    /**
     * Gets the establishment_street value for this KvkDossier.
     * 
     * @return establishment_street
     */
    public java.lang.String getEstablishment_street() {
        return establishment_street;
    }


    /**
     * Sets the establishment_street value for this KvkDossier.
     * 
     * @param establishment_street
     */
    public void setEstablishment_street(java.lang.String establishment_street) {
        this.establishment_street = establishment_street;
    }


    /**
     * Gets the establishment_house_number value for this KvkDossier.
     * 
     * @return establishment_house_number
     */
    public int getEstablishment_house_number() {
        return establishment_house_number;
    }


    /**
     * Sets the establishment_house_number value for this KvkDossier.
     * 
     * @param establishment_house_number
     */
    public void setEstablishment_house_number(int establishment_house_number) {
        this.establishment_house_number = establishment_house_number;
    }


    /**
     * Gets the establishment_house_number_addition value for this KvkDossier.
     * 
     * @return establishment_house_number_addition
     */
    public java.lang.String getEstablishment_house_number_addition() {
        return establishment_house_number_addition;
    }


    /**
     * Sets the establishment_house_number_addition value for this KvkDossier.
     * 
     * @param establishment_house_number_addition
     */
    public void setEstablishment_house_number_addition(java.lang.String establishment_house_number_addition) {
        this.establishment_house_number_addition = establishment_house_number_addition;
    }


    /**
     * Gets the correspondence_postcode value for this KvkDossier.
     * 
     * @return correspondence_postcode
     */
    public java.lang.String getCorrespondence_postcode() {
        return correspondence_postcode;
    }


    /**
     * Sets the correspondence_postcode value for this KvkDossier.
     * 
     * @param correspondence_postcode
     */
    public void setCorrespondence_postcode(java.lang.String correspondence_postcode) {
        this.correspondence_postcode = correspondence_postcode;
    }


    /**
     * Gets the correspondence_city value for this KvkDossier.
     * 
     * @return correspondence_city
     */
    public java.lang.String getCorrespondence_city() {
        return correspondence_city;
    }


    /**
     * Sets the correspondence_city value for this KvkDossier.
     * 
     * @param correspondence_city
     */
    public void setCorrespondence_city(java.lang.String correspondence_city) {
        this.correspondence_city = correspondence_city;
    }


    /**
     * Gets the correspondence_street value for this KvkDossier.
     * 
     * @return correspondence_street
     */
    public java.lang.String getCorrespondence_street() {
        return correspondence_street;
    }


    /**
     * Sets the correspondence_street value for this KvkDossier.
     * 
     * @param correspondence_street
     */
    public void setCorrespondence_street(java.lang.String correspondence_street) {
        this.correspondence_street = correspondence_street;
    }


    /**
     * Gets the correspondence_house_number value for this KvkDossier.
     * 
     * @return correspondence_house_number
     */
    public int getCorrespondence_house_number() {
        return correspondence_house_number;
    }


    /**
     * Sets the correspondence_house_number value for this KvkDossier.
     * 
     * @param correspondence_house_number
     */
    public void setCorrespondence_house_number(int correspondence_house_number) {
        this.correspondence_house_number = correspondence_house_number;
    }


    /**
     * Gets the correspondence_house_number_addition value for this KvkDossier.
     * 
     * @return correspondence_house_number_addition
     */
    public java.lang.String getCorrespondence_house_number_addition() {
        return correspondence_house_number_addition;
    }


    /**
     * Sets the correspondence_house_number_addition value for this KvkDossier.
     * 
     * @param correspondence_house_number_addition
     */
    public void setCorrespondence_house_number_addition(java.lang.String correspondence_house_number_addition) {
        this.correspondence_house_number_addition = correspondence_house_number_addition;
    }


    /**
     * Gets the correspondence_country value for this KvkDossier.
     * 
     * @return correspondence_country
     */
    public java.lang.String getCorrespondence_country() {
        return correspondence_country;
    }


    /**
     * Sets the correspondence_country value for this KvkDossier.
     * 
     * @param correspondence_country
     */
    public void setCorrespondence_country(java.lang.String correspondence_country) {
        this.correspondence_country = correspondence_country;
    }


    /**
     * Gets the telephone_number value for this KvkDossier.
     * 
     * @return telephone_number
     */
    public java.lang.String getTelephone_number() {
        return telephone_number;
    }


    /**
     * Sets the telephone_number value for this KvkDossier.
     * 
     * @param telephone_number
     */
    public void setTelephone_number(java.lang.String telephone_number) {
        this.telephone_number = telephone_number;
    }


    /**
     * Gets the mobile_number value for this KvkDossier.
     * 
     * @return mobile_number
     */
    public java.lang.String getMobile_number() {
        return mobile_number;
    }


    /**
     * Sets the mobile_number value for this KvkDossier.
     * 
     * @param mobile_number
     */
    public void setMobile_number(java.lang.String mobile_number) {
        this.mobile_number = mobile_number;
    }


    /**
     * Gets the domain_name value for this KvkDossier.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this KvkDossier.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the contact_title1 value for this KvkDossier.
     * 
     * @return contact_title1
     */
    public java.lang.String getContact_title1() {
        return contact_title1;
    }


    /**
     * Sets the contact_title1 value for this KvkDossier.
     * 
     * @param contact_title1
     */
    public void setContact_title1(java.lang.String contact_title1) {
        this.contact_title1 = contact_title1;
    }


    /**
     * Gets the contact_title2 value for this KvkDossier.
     * 
     * @return contact_title2
     */
    public java.lang.String getContact_title2() {
        return contact_title2;
    }


    /**
     * Sets the contact_title2 value for this KvkDossier.
     * 
     * @param contact_title2
     */
    public void setContact_title2(java.lang.String contact_title2) {
        this.contact_title2 = contact_title2;
    }


    /**
     * Gets the contact_initials value for this KvkDossier.
     * 
     * @return contact_initials
     */
    public java.lang.String getContact_initials() {
        return contact_initials;
    }


    /**
     * Sets the contact_initials value for this KvkDossier.
     * 
     * @param contact_initials
     */
    public void setContact_initials(java.lang.String contact_initials) {
        this.contact_initials = contact_initials;
    }


    /**
     * Gets the contact_prefix value for this KvkDossier.
     * 
     * @return contact_prefix
     */
    public java.lang.String getContact_prefix() {
        return contact_prefix;
    }


    /**
     * Sets the contact_prefix value for this KvkDossier.
     * 
     * @param contact_prefix
     */
    public void setContact_prefix(java.lang.String contact_prefix) {
        this.contact_prefix = contact_prefix;
    }


    /**
     * Gets the contact_surname value for this KvkDossier.
     * 
     * @return contact_surname
     */
    public java.lang.String getContact_surname() {
        return contact_surname;
    }


    /**
     * Sets the contact_surname value for this KvkDossier.
     * 
     * @param contact_surname
     */
    public void setContact_surname(java.lang.String contact_surname) {
        this.contact_surname = contact_surname;
    }


    /**
     * Gets the contact_gender value for this KvkDossier.
     * 
     * @return contact_gender
     */
    public java.lang.String getContact_gender() {
        return contact_gender;
    }


    /**
     * Sets the contact_gender value for this KvkDossier.
     * 
     * @param contact_gender
     */
    public void setContact_gender(java.lang.String contact_gender) {
        this.contact_gender = contact_gender;
    }


    /**
     * Gets the primary_sbi_code value for this KvkDossier.
     * 
     * @return primary_sbi_code
     */
    public java.lang.String getPrimary_sbi_code() {
        return primary_sbi_code;
    }


    /**
     * Sets the primary_sbi_code value for this KvkDossier.
     * 
     * @param primary_sbi_code
     */
    public void setPrimary_sbi_code(java.lang.String primary_sbi_code) {
        this.primary_sbi_code = primary_sbi_code;
    }


    /**
     * Gets the secondary_sbi_code1 value for this KvkDossier.
     * 
     * @return secondary_sbi_code1
     */
    public java.lang.String getSecondary_sbi_code1() {
        return secondary_sbi_code1;
    }


    /**
     * Sets the secondary_sbi_code1 value for this KvkDossier.
     * 
     * @param secondary_sbi_code1
     */
    public void setSecondary_sbi_code1(java.lang.String secondary_sbi_code1) {
        this.secondary_sbi_code1 = secondary_sbi_code1;
    }


    /**
     * Gets the secondary_sbi_code2 value for this KvkDossier.
     * 
     * @return secondary_sbi_code2
     */
    public java.lang.String getSecondary_sbi_code2() {
        return secondary_sbi_code2;
    }


    /**
     * Sets the secondary_sbi_code2 value for this KvkDossier.
     * 
     * @param secondary_sbi_code2
     */
    public void setSecondary_sbi_code2(java.lang.String secondary_sbi_code2) {
        this.secondary_sbi_code2 = secondary_sbi_code2;
    }


    /**
     * Gets the primary_sbi_code_text value for this KvkDossier.
     * 
     * @return primary_sbi_code_text
     */
    public java.lang.String getPrimary_sbi_code_text() {
        return primary_sbi_code_text;
    }


    /**
     * Sets the primary_sbi_code_text value for this KvkDossier.
     * 
     * @param primary_sbi_code_text
     */
    public void setPrimary_sbi_code_text(java.lang.String primary_sbi_code_text) {
        this.primary_sbi_code_text = primary_sbi_code_text;
    }


    /**
     * Gets the secondary_sbi_code1_text value for this KvkDossier.
     * 
     * @return secondary_sbi_code1_text
     */
    public java.lang.String getSecondary_sbi_code1_text() {
        return secondary_sbi_code1_text;
    }


    /**
     * Sets the secondary_sbi_code1_text value for this KvkDossier.
     * 
     * @param secondary_sbi_code1_text
     */
    public void setSecondary_sbi_code1_text(java.lang.String secondary_sbi_code1_text) {
        this.secondary_sbi_code1_text = secondary_sbi_code1_text;
    }


    /**
     * Gets the secondary_sbi_code2_text value for this KvkDossier.
     * 
     * @return secondary_sbi_code2_text
     */
    public java.lang.String getSecondary_sbi_code2_text() {
        return secondary_sbi_code2_text;
    }


    /**
     * Sets the secondary_sbi_code2_text value for this KvkDossier.
     * 
     * @param secondary_sbi_code2_text
     */
    public void setSecondary_sbi_code2_text(java.lang.String secondary_sbi_code2_text) {
        this.secondary_sbi_code2_text = secondary_sbi_code2_text;
    }


    /**
     * Gets the personnel value for this KvkDossier.
     * 
     * @return personnel
     */
    public int getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this KvkDossier.
     * 
     * @param personnel
     */
    public void setPersonnel(int personnel) {
        this.personnel = personnel;
    }


    /**
     * Gets the class_personnel value for this KvkDossier.
     * 
     * @return class_personnel
     */
    public int getClass_personnel() {
        return class_personnel;
    }


    /**
     * Sets the class_personnel value for this KvkDossier.
     * 
     * @param class_personnel
     */
    public void setClass_personnel(int class_personnel) {
        this.class_personnel = class_personnel;
    }


    /**
     * Gets the personnel_fulltime value for this KvkDossier.
     * 
     * @return personnel_fulltime
     */
    public int getPersonnel_fulltime() {
        return personnel_fulltime;
    }


    /**
     * Sets the personnel_fulltime value for this KvkDossier.
     * 
     * @param personnel_fulltime
     */
    public void setPersonnel_fulltime(int personnel_fulltime) {
        this.personnel_fulltime = personnel_fulltime;
    }


    /**
     * Gets the class_personnel_fulltime value for this KvkDossier.
     * 
     * @return class_personnel_fulltime
     */
    public int getClass_personnel_fulltime() {
        return class_personnel_fulltime;
    }


    /**
     * Sets the class_personnel_fulltime value for this KvkDossier.
     * 
     * @param class_personnel_fulltime
     */
    public void setClass_personnel_fulltime(int class_personnel_fulltime) {
        this.class_personnel_fulltime = class_personnel_fulltime;
    }


    /**
     * Gets the personnel_reference_date value for this KvkDossier.
     * 
     * @return personnel_reference_date
     */
    public nl.webservices.www.soap.KvkDate getPersonnel_reference_date() {
        return personnel_reference_date;
    }


    /**
     * Sets the personnel_reference_date value for this KvkDossier.
     * 
     * @param personnel_reference_date
     */
    public void setPersonnel_reference_date(nl.webservices.www.soap.KvkDate personnel_reference_date) {
        this.personnel_reference_date = personnel_reference_date;
    }


    /**
     * Gets the indication_import value for this KvkDossier.
     * 
     * @return indication_import
     */
    public java.lang.Boolean getIndication_import() {
        return indication_import;
    }


    /**
     * Sets the indication_import value for this KvkDossier.
     * 
     * @param indication_import
     */
    public void setIndication_import(java.lang.Boolean indication_import) {
        this.indication_import = indication_import;
    }


    /**
     * Gets the indication_export value for this KvkDossier.
     * 
     * @return indication_export
     */
    public java.lang.Boolean getIndication_export() {
        return indication_export;
    }


    /**
     * Sets the indication_export value for this KvkDossier.
     * 
     * @param indication_export
     */
    public void setIndication_export(java.lang.Boolean indication_export) {
        this.indication_export = indication_export;
    }


    /**
     * Gets the indication_economically_active value for this KvkDossier.
     * 
     * @return indication_economically_active
     */
    public boolean isIndication_economically_active() {
        return indication_economically_active;
    }


    /**
     * Sets the indication_economically_active value for this KvkDossier.
     * 
     * @param indication_economically_active
     */
    public void setIndication_economically_active(boolean indication_economically_active) {
        this.indication_economically_active = indication_economically_active;
    }


    /**
     * Gets the indication_non_mailing value for this KvkDossier.
     * 
     * @return indication_non_mailing
     */
    public boolean isIndication_non_mailing() {
        return indication_non_mailing;
    }


    /**
     * Sets the indication_non_mailing value for this KvkDossier.
     * 
     * @param indication_non_mailing
     */
    public void setIndication_non_mailing(boolean indication_non_mailing) {
        this.indication_non_mailing = indication_non_mailing;
    }


    /**
     * Gets the indication_bankruptcy value for this KvkDossier.
     * 
     * @return indication_bankruptcy
     */
    public boolean isIndication_bankruptcy() {
        return indication_bankruptcy;
    }


    /**
     * Sets the indication_bankruptcy value for this KvkDossier.
     * 
     * @param indication_bankruptcy
     */
    public void setIndication_bankruptcy(boolean indication_bankruptcy) {
        this.indication_bankruptcy = indication_bankruptcy;
    }


    /**
     * Gets the indication_dip value for this KvkDossier.
     * 
     * @return indication_dip
     */
    public boolean isIndication_dip() {
        return indication_dip;
    }


    /**
     * Sets the indication_dip value for this KvkDossier.
     * 
     * @param indication_dip
     */
    public void setIndication_dip(boolean indication_dip) {
        this.indication_dip = indication_dip;
    }


    /**
     * Gets the authorized_share_capital value for this KvkDossier.
     * 
     * @return authorized_share_capital
     */
    public java.lang.Long getAuthorized_share_capital() {
        return authorized_share_capital;
    }


    /**
     * Sets the authorized_share_capital value for this KvkDossier.
     * 
     * @param authorized_share_capital
     */
    public void setAuthorized_share_capital(java.lang.Long authorized_share_capital) {
        this.authorized_share_capital = authorized_share_capital;
    }


    /**
     * Gets the authorized_share_capital_currency value for this KvkDossier.
     * 
     * @return authorized_share_capital_currency
     */
    public java.lang.String getAuthorized_share_capital_currency() {
        return authorized_share_capital_currency;
    }


    /**
     * Sets the authorized_share_capital_currency value for this KvkDossier.
     * 
     * @param authorized_share_capital_currency
     */
    public void setAuthorized_share_capital_currency(java.lang.String authorized_share_capital_currency) {
        this.authorized_share_capital_currency = authorized_share_capital_currency;
    }


    /**
     * Gets the paid_up_share_capital value for this KvkDossier.
     * 
     * @return paid_up_share_capital
     */
    public java.lang.Long getPaid_up_share_capital() {
        return paid_up_share_capital;
    }


    /**
     * Sets the paid_up_share_capital value for this KvkDossier.
     * 
     * @param paid_up_share_capital
     */
    public void setPaid_up_share_capital(java.lang.Long paid_up_share_capital) {
        this.paid_up_share_capital = paid_up_share_capital;
    }


    /**
     * Gets the paid_up_share_capital_currency value for this KvkDossier.
     * 
     * @return paid_up_share_capital_currency
     */
    public java.lang.String getPaid_up_share_capital_currency() {
        return paid_up_share_capital_currency;
    }


    /**
     * Sets the paid_up_share_capital_currency value for this KvkDossier.
     * 
     * @param paid_up_share_capital_currency
     */
    public void setPaid_up_share_capital_currency(java.lang.String paid_up_share_capital_currency) {
        this.paid_up_share_capital_currency = paid_up_share_capital_currency;
    }


    /**
     * Gets the issued_share_capital value for this KvkDossier.
     * 
     * @return issued_share_capital
     */
    public java.lang.Long getIssued_share_capital() {
        return issued_share_capital;
    }


    /**
     * Sets the issued_share_capital value for this KvkDossier.
     * 
     * @param issued_share_capital
     */
    public void setIssued_share_capital(java.lang.Long issued_share_capital) {
        this.issued_share_capital = issued_share_capital;
    }


    /**
     * Gets the issued_share_capital_currency value for this KvkDossier.
     * 
     * @return issued_share_capital_currency
     */
    public java.lang.String getIssued_share_capital_currency() {
        return issued_share_capital_currency;
    }


    /**
     * Sets the issued_share_capital_currency value for this KvkDossier.
     * 
     * @param issued_share_capital_currency
     */
    public void setIssued_share_capital_currency(java.lang.String issued_share_capital_currency) {
        this.issued_share_capital_currency = issued_share_capital_currency;
    }


    /**
     * Gets the founding_date value for this KvkDossier.
     * 
     * @return founding_date
     */
    public nl.webservices.www.soap.KvkDate getFounding_date() {
        return founding_date;
    }


    /**
     * Sets the founding_date value for this KvkDossier.
     * 
     * @param founding_date
     */
    public void setFounding_date(nl.webservices.www.soap.KvkDate founding_date) {
        this.founding_date = founding_date;
    }


    /**
     * Gets the continuation_date value for this KvkDossier.
     * 
     * @return continuation_date
     */
    public nl.webservices.www.soap.KvkDate getContinuation_date() {
        return continuation_date;
    }


    /**
     * Sets the continuation_date value for this KvkDossier.
     * 
     * @param continuation_date
     */
    public void setContinuation_date(nl.webservices.www.soap.KvkDate continuation_date) {
        this.continuation_date = continuation_date;
    }


    /**
     * Gets the establishment_date value for this KvkDossier.
     * 
     * @return establishment_date
     */
    public nl.webservices.www.soap.KvkDate getEstablishment_date() {
        return establishment_date;
    }


    /**
     * Sets the establishment_date value for this KvkDossier.
     * 
     * @param establishment_date
     */
    public void setEstablishment_date(nl.webservices.www.soap.KvkDate establishment_date) {
        this.establishment_date = establishment_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KvkDossier)) return false;
        KvkDossier other = (KvkDossier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.update_info==null && other.getUpdate_info()==null) || 
             (this.update_info!=null &&
              this.update_info.equals(other.getUpdate_info()))) &&
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.main_establishment_number==null && other.getMain_establishment_number()==null) || 
             (this.main_establishment_number!=null &&
              this.main_establishment_number.equals(other.getMain_establishment_number()))) &&
            this.indication_main_establishment == other.isIndication_main_establishment() &&
            ((this.rsin_number==null && other.getRsin_number()==null) || 
             (this.rsin_number!=null &&
              this.rsin_number.equals(other.getRsin_number()))) &&
            ((this.chamber_number==null && other.getChamber_number()==null) || 
             (this.chamber_number!=null &&
              this.chamber_number.equals(other.getChamber_number()))) &&
            ((this.legal_form_code==null && other.getLegal_form_code()==null) || 
             (this.legal_form_code!=null &&
              this.legal_form_code.equals(other.getLegal_form_code()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.indication_organisation_code==null && other.getIndication_organisation_code()==null) || 
             (this.indication_organisation_code!=null &&
              this.indication_organisation_code.equals(other.getIndication_organisation_code()))) &&
            ((this.legal_name==null && other.getLegal_name()==null) || 
             (this.legal_name!=null &&
              this.legal_name.equals(other.getLegal_name()))) &&
            ((this.trade_name_45==null && other.getTrade_name_45()==null) || 
             (this.trade_name_45!=null &&
              this.trade_name_45.equals(other.getTrade_name_45()))) &&
            ((this.trade_name_full==null && other.getTrade_name_full()==null) || 
             (this.trade_name_full!=null &&
              this.trade_name_full.equals(other.getTrade_name_full()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.establishment_postcode==null && other.getEstablishment_postcode()==null) || 
             (this.establishment_postcode!=null &&
              this.establishment_postcode.equals(other.getEstablishment_postcode()))) &&
            ((this.establishment_city==null && other.getEstablishment_city()==null) || 
             (this.establishment_city!=null &&
              this.establishment_city.equals(other.getEstablishment_city()))) &&
            ((this.establishment_street==null && other.getEstablishment_street()==null) || 
             (this.establishment_street!=null &&
              this.establishment_street.equals(other.getEstablishment_street()))) &&
            this.establishment_house_number == other.getEstablishment_house_number() &&
            ((this.establishment_house_number_addition==null && other.getEstablishment_house_number_addition()==null) || 
             (this.establishment_house_number_addition!=null &&
              this.establishment_house_number_addition.equals(other.getEstablishment_house_number_addition()))) &&
            ((this.correspondence_postcode==null && other.getCorrespondence_postcode()==null) || 
             (this.correspondence_postcode!=null &&
              this.correspondence_postcode.equals(other.getCorrespondence_postcode()))) &&
            ((this.correspondence_city==null && other.getCorrespondence_city()==null) || 
             (this.correspondence_city!=null &&
              this.correspondence_city.equals(other.getCorrespondence_city()))) &&
            ((this.correspondence_street==null && other.getCorrespondence_street()==null) || 
             (this.correspondence_street!=null &&
              this.correspondence_street.equals(other.getCorrespondence_street()))) &&
            this.correspondence_house_number == other.getCorrespondence_house_number() &&
            ((this.correspondence_house_number_addition==null && other.getCorrespondence_house_number_addition()==null) || 
             (this.correspondence_house_number_addition!=null &&
              this.correspondence_house_number_addition.equals(other.getCorrespondence_house_number_addition()))) &&
            ((this.correspondence_country==null && other.getCorrespondence_country()==null) || 
             (this.correspondence_country!=null &&
              this.correspondence_country.equals(other.getCorrespondence_country()))) &&
            ((this.telephone_number==null && other.getTelephone_number()==null) || 
             (this.telephone_number!=null &&
              this.telephone_number.equals(other.getTelephone_number()))) &&
            ((this.mobile_number==null && other.getMobile_number()==null) || 
             (this.mobile_number!=null &&
              this.mobile_number.equals(other.getMobile_number()))) &&
            ((this.domain_name==null && other.getDomain_name()==null) || 
             (this.domain_name!=null &&
              this.domain_name.equals(other.getDomain_name()))) &&
            ((this.contact_title1==null && other.getContact_title1()==null) || 
             (this.contact_title1!=null &&
              this.contact_title1.equals(other.getContact_title1()))) &&
            ((this.contact_title2==null && other.getContact_title2()==null) || 
             (this.contact_title2!=null &&
              this.contact_title2.equals(other.getContact_title2()))) &&
            ((this.contact_initials==null && other.getContact_initials()==null) || 
             (this.contact_initials!=null &&
              this.contact_initials.equals(other.getContact_initials()))) &&
            ((this.contact_prefix==null && other.getContact_prefix()==null) || 
             (this.contact_prefix!=null &&
              this.contact_prefix.equals(other.getContact_prefix()))) &&
            ((this.contact_surname==null && other.getContact_surname()==null) || 
             (this.contact_surname!=null &&
              this.contact_surname.equals(other.getContact_surname()))) &&
            ((this.contact_gender==null && other.getContact_gender()==null) || 
             (this.contact_gender!=null &&
              this.contact_gender.equals(other.getContact_gender()))) &&
            ((this.primary_sbi_code==null && other.getPrimary_sbi_code()==null) || 
             (this.primary_sbi_code!=null &&
              this.primary_sbi_code.equals(other.getPrimary_sbi_code()))) &&
            ((this.secondary_sbi_code1==null && other.getSecondary_sbi_code1()==null) || 
             (this.secondary_sbi_code1!=null &&
              this.secondary_sbi_code1.equals(other.getSecondary_sbi_code1()))) &&
            ((this.secondary_sbi_code2==null && other.getSecondary_sbi_code2()==null) || 
             (this.secondary_sbi_code2!=null &&
              this.secondary_sbi_code2.equals(other.getSecondary_sbi_code2()))) &&
            ((this.primary_sbi_code_text==null && other.getPrimary_sbi_code_text()==null) || 
             (this.primary_sbi_code_text!=null &&
              this.primary_sbi_code_text.equals(other.getPrimary_sbi_code_text()))) &&
            ((this.secondary_sbi_code1_text==null && other.getSecondary_sbi_code1_text()==null) || 
             (this.secondary_sbi_code1_text!=null &&
              this.secondary_sbi_code1_text.equals(other.getSecondary_sbi_code1_text()))) &&
            ((this.secondary_sbi_code2_text==null && other.getSecondary_sbi_code2_text()==null) || 
             (this.secondary_sbi_code2_text!=null &&
              this.secondary_sbi_code2_text.equals(other.getSecondary_sbi_code2_text()))) &&
            this.personnel == other.getPersonnel() &&
            this.class_personnel == other.getClass_personnel() &&
            this.personnel_fulltime == other.getPersonnel_fulltime() &&
            this.class_personnel_fulltime == other.getClass_personnel_fulltime() &&
            ((this.personnel_reference_date==null && other.getPersonnel_reference_date()==null) || 
             (this.personnel_reference_date!=null &&
              this.personnel_reference_date.equals(other.getPersonnel_reference_date()))) &&
            ((this.indication_import==null && other.getIndication_import()==null) || 
             (this.indication_import!=null &&
              this.indication_import.equals(other.getIndication_import()))) &&
            ((this.indication_export==null && other.getIndication_export()==null) || 
             (this.indication_export!=null &&
              this.indication_export.equals(other.getIndication_export()))) &&
            this.indication_economically_active == other.isIndication_economically_active() &&
            this.indication_non_mailing == other.isIndication_non_mailing() &&
            this.indication_bankruptcy == other.isIndication_bankruptcy() &&
            this.indication_dip == other.isIndication_dip() &&
            ((this.authorized_share_capital==null && other.getAuthorized_share_capital()==null) || 
             (this.authorized_share_capital!=null &&
              this.authorized_share_capital.equals(other.getAuthorized_share_capital()))) &&
            ((this.authorized_share_capital_currency==null && other.getAuthorized_share_capital_currency()==null) || 
             (this.authorized_share_capital_currency!=null &&
              this.authorized_share_capital_currency.equals(other.getAuthorized_share_capital_currency()))) &&
            ((this.paid_up_share_capital==null && other.getPaid_up_share_capital()==null) || 
             (this.paid_up_share_capital!=null &&
              this.paid_up_share_capital.equals(other.getPaid_up_share_capital()))) &&
            ((this.paid_up_share_capital_currency==null && other.getPaid_up_share_capital_currency()==null) || 
             (this.paid_up_share_capital_currency!=null &&
              this.paid_up_share_capital_currency.equals(other.getPaid_up_share_capital_currency()))) &&
            ((this.issued_share_capital==null && other.getIssued_share_capital()==null) || 
             (this.issued_share_capital!=null &&
              this.issued_share_capital.equals(other.getIssued_share_capital()))) &&
            ((this.issued_share_capital_currency==null && other.getIssued_share_capital_currency()==null) || 
             (this.issued_share_capital_currency!=null &&
              this.issued_share_capital_currency.equals(other.getIssued_share_capital_currency()))) &&
            ((this.founding_date==null && other.getFounding_date()==null) || 
             (this.founding_date!=null &&
              this.founding_date.equals(other.getFounding_date()))) &&
            ((this.continuation_date==null && other.getContinuation_date()==null) || 
             (this.continuation_date!=null &&
              this.continuation_date.equals(other.getContinuation_date()))) &&
            ((this.establishment_date==null && other.getEstablishment_date()==null) || 
             (this.establishment_date!=null &&
              this.establishment_date.equals(other.getEstablishment_date())));
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
        if (getUpdate_info() != null) {
            _hashCode += getUpdate_info().hashCode();
        }
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getMain_establishment_number() != null) {
            _hashCode += getMain_establishment_number().hashCode();
        }
        _hashCode += (isIndication_main_establishment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRsin_number() != null) {
            _hashCode += getRsin_number().hashCode();
        }
        if (getChamber_number() != null) {
            _hashCode += getChamber_number().hashCode();
        }
        if (getLegal_form_code() != null) {
            _hashCode += getLegal_form_code().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getIndication_organisation_code() != null) {
            _hashCode += getIndication_organisation_code().hashCode();
        }
        if (getLegal_name() != null) {
            _hashCode += getLegal_name().hashCode();
        }
        if (getTrade_name_45() != null) {
            _hashCode += getTrade_name_45().hashCode();
        }
        if (getTrade_name_full() != null) {
            _hashCode += getTrade_name_full().hashCode();
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
        if (getEstablishment_postcode() != null) {
            _hashCode += getEstablishment_postcode().hashCode();
        }
        if (getEstablishment_city() != null) {
            _hashCode += getEstablishment_city().hashCode();
        }
        if (getEstablishment_street() != null) {
            _hashCode += getEstablishment_street().hashCode();
        }
        _hashCode += getEstablishment_house_number();
        if (getEstablishment_house_number_addition() != null) {
            _hashCode += getEstablishment_house_number_addition().hashCode();
        }
        if (getCorrespondence_postcode() != null) {
            _hashCode += getCorrespondence_postcode().hashCode();
        }
        if (getCorrespondence_city() != null) {
            _hashCode += getCorrespondence_city().hashCode();
        }
        if (getCorrespondence_street() != null) {
            _hashCode += getCorrespondence_street().hashCode();
        }
        _hashCode += getCorrespondence_house_number();
        if (getCorrespondence_house_number_addition() != null) {
            _hashCode += getCorrespondence_house_number_addition().hashCode();
        }
        if (getCorrespondence_country() != null) {
            _hashCode += getCorrespondence_country().hashCode();
        }
        if (getTelephone_number() != null) {
            _hashCode += getTelephone_number().hashCode();
        }
        if (getMobile_number() != null) {
            _hashCode += getMobile_number().hashCode();
        }
        if (getDomain_name() != null) {
            _hashCode += getDomain_name().hashCode();
        }
        if (getContact_title1() != null) {
            _hashCode += getContact_title1().hashCode();
        }
        if (getContact_title2() != null) {
            _hashCode += getContact_title2().hashCode();
        }
        if (getContact_initials() != null) {
            _hashCode += getContact_initials().hashCode();
        }
        if (getContact_prefix() != null) {
            _hashCode += getContact_prefix().hashCode();
        }
        if (getContact_surname() != null) {
            _hashCode += getContact_surname().hashCode();
        }
        if (getContact_gender() != null) {
            _hashCode += getContact_gender().hashCode();
        }
        if (getPrimary_sbi_code() != null) {
            _hashCode += getPrimary_sbi_code().hashCode();
        }
        if (getSecondary_sbi_code1() != null) {
            _hashCode += getSecondary_sbi_code1().hashCode();
        }
        if (getSecondary_sbi_code2() != null) {
            _hashCode += getSecondary_sbi_code2().hashCode();
        }
        if (getPrimary_sbi_code_text() != null) {
            _hashCode += getPrimary_sbi_code_text().hashCode();
        }
        if (getSecondary_sbi_code1_text() != null) {
            _hashCode += getSecondary_sbi_code1_text().hashCode();
        }
        if (getSecondary_sbi_code2_text() != null) {
            _hashCode += getSecondary_sbi_code2_text().hashCode();
        }
        _hashCode += getPersonnel();
        _hashCode += getClass_personnel();
        _hashCode += getPersonnel_fulltime();
        _hashCode += getClass_personnel_fulltime();
        if (getPersonnel_reference_date() != null) {
            _hashCode += getPersonnel_reference_date().hashCode();
        }
        if (getIndication_import() != null) {
            _hashCode += getIndication_import().hashCode();
        }
        if (getIndication_export() != null) {
            _hashCode += getIndication_export().hashCode();
        }
        _hashCode += (isIndication_economically_active() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndication_non_mailing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndication_bankruptcy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndication_dip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAuthorized_share_capital() != null) {
            _hashCode += getAuthorized_share_capital().hashCode();
        }
        if (getAuthorized_share_capital_currency() != null) {
            _hashCode += getAuthorized_share_capital_currency().hashCode();
        }
        if (getPaid_up_share_capital() != null) {
            _hashCode += getPaid_up_share_capital().hashCode();
        }
        if (getPaid_up_share_capital_currency() != null) {
            _hashCode += getPaid_up_share_capital_currency().hashCode();
        }
        if (getIssued_share_capital() != null) {
            _hashCode += getIssued_share_capital().hashCode();
        }
        if (getIssued_share_capital_currency() != null) {
            _hashCode += getIssued_share_capital_currency().hashCode();
        }
        if (getFounding_date() != null) {
            _hashCode += getFounding_date().hashCode();
        }
        if (getContinuation_date() != null) {
            _hashCode += getContinuation_date().hashCode();
        }
        if (getEstablishment_date() != null) {
            _hashCode += getEstablishment_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KvkDossier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDossier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "update_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkUpdateReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_main_establishment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_main_establishment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsin_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rsin_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamber_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "chamber_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_organisation_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_organisation_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name_45");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name_45"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name_full");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name_full"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mobile_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_title1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_title1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_title2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_title2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_sbi_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "primary_sbi_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_sbi_code1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secondary_sbi_code1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_sbi_code2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secondary_sbi_code2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_sbi_code_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "primary_sbi_code_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_sbi_code1_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secondary_sbi_code1_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_sbi_code2_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secondary_sbi_code2_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "class_personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel_fulltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel_fulltime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_personnel_fulltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "class_personnel_fulltime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel_reference_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel_reference_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_import");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_import"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_export");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_export"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_economically_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_economically_active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_non_mailing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_non_mailing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_bankruptcy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_bankruptcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_dip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_dip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorized_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorized_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorized_share_capital_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorized_share_capital_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid_up_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paid_up_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid_up_share_capital_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paid_up_share_capital_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued_share_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "issued_share_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued_share_capital_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "issued_share_capital_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("founding_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founding_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continuation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "continuation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDate"));
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
