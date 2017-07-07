/**
 * DutchBusinessEstablishment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessEstablishment  implements java.io.Serializable {
    private java.lang.String establishment_number;

    private java.lang.Boolean main_establishment;

    private java.lang.String status;

    private java.lang.String legal_form_text;

    private java.lang.String[] trade_names;

    private java.lang.String activity;

    private java.lang.String description;

    private java.lang.String[] sbi_codes;

    private java.lang.String[] sbi_codes_text;

    private java.lang.String establishment_postcode;

    private java.lang.String establishment_city;

    private java.lang.String establishment_street;

    private java.lang.Integer establishment_house_number;

    private java.lang.String establishment_house_number_addition;

    private java.lang.String establishment_country;

    private java.lang.String correspondence_postcode;

    private java.lang.String correspondence_city;

    private java.lang.String correspondence_street;

    private java.lang.Integer correspondence_house_number;

    private java.lang.String correspondence_house_number_addition;

    private java.lang.String correspondence_country;

    private java.lang.String curator_postcode;

    private java.lang.String curator_city;

    private java.lang.String curator_street;

    private java.lang.Integer curator_house_number;

    private java.lang.String curator_house_number_addition;

    private java.lang.String curator_country;

    private java.lang.String[] telephone_numbers;

    private java.lang.String[] fax_numbers;

    private java.lang.String[] email_addresses;

    private java.lang.String[] domain_names;

    private nl.webservices.www.soap.DutchBusinessDate establishment_date;

    private nl.webservices.www.soap.DutchBusinessDate date_since;

    private java.lang.Integer personnel;

    public DutchBusinessEstablishment() {
    }

    public DutchBusinessEstablishment(
           java.lang.String establishment_number,
           java.lang.Boolean main_establishment,
           java.lang.String status,
           java.lang.String legal_form_text,
           java.lang.String[] trade_names,
           java.lang.String activity,
           java.lang.String description,
           java.lang.String[] sbi_codes,
           java.lang.String[] sbi_codes_text,
           java.lang.String establishment_postcode,
           java.lang.String establishment_city,
           java.lang.String establishment_street,
           java.lang.Integer establishment_house_number,
           java.lang.String establishment_house_number_addition,
           java.lang.String establishment_country,
           java.lang.String correspondence_postcode,
           java.lang.String correspondence_city,
           java.lang.String correspondence_street,
           java.lang.Integer correspondence_house_number,
           java.lang.String correspondence_house_number_addition,
           java.lang.String correspondence_country,
           java.lang.String curator_postcode,
           java.lang.String curator_city,
           java.lang.String curator_street,
           java.lang.Integer curator_house_number,
           java.lang.String curator_house_number_addition,
           java.lang.String curator_country,
           java.lang.String[] telephone_numbers,
           java.lang.String[] fax_numbers,
           java.lang.String[] email_addresses,
           java.lang.String[] domain_names,
           nl.webservices.www.soap.DutchBusinessDate establishment_date,
           nl.webservices.www.soap.DutchBusinessDate date_since,
           java.lang.Integer personnel) {
           this.establishment_number = establishment_number;
           this.main_establishment = main_establishment;
           this.status = status;
           this.legal_form_text = legal_form_text;
           this.trade_names = trade_names;
           this.activity = activity;
           this.description = description;
           this.sbi_codes = sbi_codes;
           this.sbi_codes_text = sbi_codes_text;
           this.establishment_postcode = establishment_postcode;
           this.establishment_city = establishment_city;
           this.establishment_street = establishment_street;
           this.establishment_house_number = establishment_house_number;
           this.establishment_house_number_addition = establishment_house_number_addition;
           this.establishment_country = establishment_country;
           this.correspondence_postcode = correspondence_postcode;
           this.correspondence_city = correspondence_city;
           this.correspondence_street = correspondence_street;
           this.correspondence_house_number = correspondence_house_number;
           this.correspondence_house_number_addition = correspondence_house_number_addition;
           this.correspondence_country = correspondence_country;
           this.curator_postcode = curator_postcode;
           this.curator_city = curator_city;
           this.curator_street = curator_street;
           this.curator_house_number = curator_house_number;
           this.curator_house_number_addition = curator_house_number_addition;
           this.curator_country = curator_country;
           this.telephone_numbers = telephone_numbers;
           this.fax_numbers = fax_numbers;
           this.email_addresses = email_addresses;
           this.domain_names = domain_names;
           this.establishment_date = establishment_date;
           this.date_since = date_since;
           this.personnel = personnel;
    }


    /**
     * Gets the establishment_number value for this DutchBusinessEstablishment.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this DutchBusinessEstablishment.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the main_establishment value for this DutchBusinessEstablishment.
     * 
     * @return main_establishment
     */
    public java.lang.Boolean getMain_establishment() {
        return main_establishment;
    }


    /**
     * Sets the main_establishment value for this DutchBusinessEstablishment.
     * 
     * @param main_establishment
     */
    public void setMain_establishment(java.lang.Boolean main_establishment) {
        this.main_establishment = main_establishment;
    }


    /**
     * Gets the status value for this DutchBusinessEstablishment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DutchBusinessEstablishment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessEstablishment.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessEstablishment.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the trade_names value for this DutchBusinessEstablishment.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DutchBusinessEstablishment.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the activity value for this DutchBusinessEstablishment.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this DutchBusinessEstablishment.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the description value for this DutchBusinessEstablishment.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchBusinessEstablishment.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sbi_codes value for this DutchBusinessEstablishment.
     * 
     * @return sbi_codes
     */
    public java.lang.String[] getSbi_codes() {
        return sbi_codes;
    }


    /**
     * Sets the sbi_codes value for this DutchBusinessEstablishment.
     * 
     * @param sbi_codes
     */
    public void setSbi_codes(java.lang.String[] sbi_codes) {
        this.sbi_codes = sbi_codes;
    }


    /**
     * Gets the sbi_codes_text value for this DutchBusinessEstablishment.
     * 
     * @return sbi_codes_text
     */
    public java.lang.String[] getSbi_codes_text() {
        return sbi_codes_text;
    }


    /**
     * Sets the sbi_codes_text value for this DutchBusinessEstablishment.
     * 
     * @param sbi_codes_text
     */
    public void setSbi_codes_text(java.lang.String[] sbi_codes_text) {
        this.sbi_codes_text = sbi_codes_text;
    }


    /**
     * Gets the establishment_postcode value for this DutchBusinessEstablishment.
     * 
     * @return establishment_postcode
     */
    public java.lang.String getEstablishment_postcode() {
        return establishment_postcode;
    }


    /**
     * Sets the establishment_postcode value for this DutchBusinessEstablishment.
     * 
     * @param establishment_postcode
     */
    public void setEstablishment_postcode(java.lang.String establishment_postcode) {
        this.establishment_postcode = establishment_postcode;
    }


    /**
     * Gets the establishment_city value for this DutchBusinessEstablishment.
     * 
     * @return establishment_city
     */
    public java.lang.String getEstablishment_city() {
        return establishment_city;
    }


    /**
     * Sets the establishment_city value for this DutchBusinessEstablishment.
     * 
     * @param establishment_city
     */
    public void setEstablishment_city(java.lang.String establishment_city) {
        this.establishment_city = establishment_city;
    }


    /**
     * Gets the establishment_street value for this DutchBusinessEstablishment.
     * 
     * @return establishment_street
     */
    public java.lang.String getEstablishment_street() {
        return establishment_street;
    }


    /**
     * Sets the establishment_street value for this DutchBusinessEstablishment.
     * 
     * @param establishment_street
     */
    public void setEstablishment_street(java.lang.String establishment_street) {
        this.establishment_street = establishment_street;
    }


    /**
     * Gets the establishment_house_number value for this DutchBusinessEstablishment.
     * 
     * @return establishment_house_number
     */
    public java.lang.Integer getEstablishment_house_number() {
        return establishment_house_number;
    }


    /**
     * Sets the establishment_house_number value for this DutchBusinessEstablishment.
     * 
     * @param establishment_house_number
     */
    public void setEstablishment_house_number(java.lang.Integer establishment_house_number) {
        this.establishment_house_number = establishment_house_number;
    }


    /**
     * Gets the establishment_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @return establishment_house_number_addition
     */
    public java.lang.String getEstablishment_house_number_addition() {
        return establishment_house_number_addition;
    }


    /**
     * Sets the establishment_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @param establishment_house_number_addition
     */
    public void setEstablishment_house_number_addition(java.lang.String establishment_house_number_addition) {
        this.establishment_house_number_addition = establishment_house_number_addition;
    }


    /**
     * Gets the establishment_country value for this DutchBusinessEstablishment.
     * 
     * @return establishment_country
     */
    public java.lang.String getEstablishment_country() {
        return establishment_country;
    }


    /**
     * Sets the establishment_country value for this DutchBusinessEstablishment.
     * 
     * @param establishment_country
     */
    public void setEstablishment_country(java.lang.String establishment_country) {
        this.establishment_country = establishment_country;
    }


    /**
     * Gets the correspondence_postcode value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_postcode
     */
    public java.lang.String getCorrespondence_postcode() {
        return correspondence_postcode;
    }


    /**
     * Sets the correspondence_postcode value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_postcode
     */
    public void setCorrespondence_postcode(java.lang.String correspondence_postcode) {
        this.correspondence_postcode = correspondence_postcode;
    }


    /**
     * Gets the correspondence_city value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_city
     */
    public java.lang.String getCorrespondence_city() {
        return correspondence_city;
    }


    /**
     * Sets the correspondence_city value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_city
     */
    public void setCorrespondence_city(java.lang.String correspondence_city) {
        this.correspondence_city = correspondence_city;
    }


    /**
     * Gets the correspondence_street value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_street
     */
    public java.lang.String getCorrespondence_street() {
        return correspondence_street;
    }


    /**
     * Sets the correspondence_street value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_street
     */
    public void setCorrespondence_street(java.lang.String correspondence_street) {
        this.correspondence_street = correspondence_street;
    }


    /**
     * Gets the correspondence_house_number value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_house_number
     */
    public java.lang.Integer getCorrespondence_house_number() {
        return correspondence_house_number;
    }


    /**
     * Sets the correspondence_house_number value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_house_number
     */
    public void setCorrespondence_house_number(java.lang.Integer correspondence_house_number) {
        this.correspondence_house_number = correspondence_house_number;
    }


    /**
     * Gets the correspondence_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_house_number_addition
     */
    public java.lang.String getCorrespondence_house_number_addition() {
        return correspondence_house_number_addition;
    }


    /**
     * Sets the correspondence_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_house_number_addition
     */
    public void setCorrespondence_house_number_addition(java.lang.String correspondence_house_number_addition) {
        this.correspondence_house_number_addition = correspondence_house_number_addition;
    }


    /**
     * Gets the correspondence_country value for this DutchBusinessEstablishment.
     * 
     * @return correspondence_country
     */
    public java.lang.String getCorrespondence_country() {
        return correspondence_country;
    }


    /**
     * Sets the correspondence_country value for this DutchBusinessEstablishment.
     * 
     * @param correspondence_country
     */
    public void setCorrespondence_country(java.lang.String correspondence_country) {
        this.correspondence_country = correspondence_country;
    }


    /**
     * Gets the curator_postcode value for this DutchBusinessEstablishment.
     * 
     * @return curator_postcode
     */
    public java.lang.String getCurator_postcode() {
        return curator_postcode;
    }


    /**
     * Sets the curator_postcode value for this DutchBusinessEstablishment.
     * 
     * @param curator_postcode
     */
    public void setCurator_postcode(java.lang.String curator_postcode) {
        this.curator_postcode = curator_postcode;
    }


    /**
     * Gets the curator_city value for this DutchBusinessEstablishment.
     * 
     * @return curator_city
     */
    public java.lang.String getCurator_city() {
        return curator_city;
    }


    /**
     * Sets the curator_city value for this DutchBusinessEstablishment.
     * 
     * @param curator_city
     */
    public void setCurator_city(java.lang.String curator_city) {
        this.curator_city = curator_city;
    }


    /**
     * Gets the curator_street value for this DutchBusinessEstablishment.
     * 
     * @return curator_street
     */
    public java.lang.String getCurator_street() {
        return curator_street;
    }


    /**
     * Sets the curator_street value for this DutchBusinessEstablishment.
     * 
     * @param curator_street
     */
    public void setCurator_street(java.lang.String curator_street) {
        this.curator_street = curator_street;
    }


    /**
     * Gets the curator_house_number value for this DutchBusinessEstablishment.
     * 
     * @return curator_house_number
     */
    public java.lang.Integer getCurator_house_number() {
        return curator_house_number;
    }


    /**
     * Sets the curator_house_number value for this DutchBusinessEstablishment.
     * 
     * @param curator_house_number
     */
    public void setCurator_house_number(java.lang.Integer curator_house_number) {
        this.curator_house_number = curator_house_number;
    }


    /**
     * Gets the curator_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @return curator_house_number_addition
     */
    public java.lang.String getCurator_house_number_addition() {
        return curator_house_number_addition;
    }


    /**
     * Sets the curator_house_number_addition value for this DutchBusinessEstablishment.
     * 
     * @param curator_house_number_addition
     */
    public void setCurator_house_number_addition(java.lang.String curator_house_number_addition) {
        this.curator_house_number_addition = curator_house_number_addition;
    }


    /**
     * Gets the curator_country value for this DutchBusinessEstablishment.
     * 
     * @return curator_country
     */
    public java.lang.String getCurator_country() {
        return curator_country;
    }


    /**
     * Sets the curator_country value for this DutchBusinessEstablishment.
     * 
     * @param curator_country
     */
    public void setCurator_country(java.lang.String curator_country) {
        this.curator_country = curator_country;
    }


    /**
     * Gets the telephone_numbers value for this DutchBusinessEstablishment.
     * 
     * @return telephone_numbers
     */
    public java.lang.String[] getTelephone_numbers() {
        return telephone_numbers;
    }


    /**
     * Sets the telephone_numbers value for this DutchBusinessEstablishment.
     * 
     * @param telephone_numbers
     */
    public void setTelephone_numbers(java.lang.String[] telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }


    /**
     * Gets the fax_numbers value for this DutchBusinessEstablishment.
     * 
     * @return fax_numbers
     */
    public java.lang.String[] getFax_numbers() {
        return fax_numbers;
    }


    /**
     * Sets the fax_numbers value for this DutchBusinessEstablishment.
     * 
     * @param fax_numbers
     */
    public void setFax_numbers(java.lang.String[] fax_numbers) {
        this.fax_numbers = fax_numbers;
    }


    /**
     * Gets the email_addresses value for this DutchBusinessEstablishment.
     * 
     * @return email_addresses
     */
    public java.lang.String[] getEmail_addresses() {
        return email_addresses;
    }


    /**
     * Sets the email_addresses value for this DutchBusinessEstablishment.
     * 
     * @param email_addresses
     */
    public void setEmail_addresses(java.lang.String[] email_addresses) {
        this.email_addresses = email_addresses;
    }


    /**
     * Gets the domain_names value for this DutchBusinessEstablishment.
     * 
     * @return domain_names
     */
    public java.lang.String[] getDomain_names() {
        return domain_names;
    }


    /**
     * Sets the domain_names value for this DutchBusinessEstablishment.
     * 
     * @param domain_names
     */
    public void setDomain_names(java.lang.String[] domain_names) {
        this.domain_names = domain_names;
    }


    /**
     * Gets the establishment_date value for this DutchBusinessEstablishment.
     * 
     * @return establishment_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getEstablishment_date() {
        return establishment_date;
    }


    /**
     * Sets the establishment_date value for this DutchBusinessEstablishment.
     * 
     * @param establishment_date
     */
    public void setEstablishment_date(nl.webservices.www.soap.DutchBusinessDate establishment_date) {
        this.establishment_date = establishment_date;
    }


    /**
     * Gets the date_since value for this DutchBusinessEstablishment.
     * 
     * @return date_since
     */
    public nl.webservices.www.soap.DutchBusinessDate getDate_since() {
        return date_since;
    }


    /**
     * Sets the date_since value for this DutchBusinessEstablishment.
     * 
     * @param date_since
     */
    public void setDate_since(nl.webservices.www.soap.DutchBusinessDate date_since) {
        this.date_since = date_since;
    }


    /**
     * Gets the personnel value for this DutchBusinessEstablishment.
     * 
     * @return personnel
     */
    public java.lang.Integer getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this DutchBusinessEstablishment.
     * 
     * @param personnel
     */
    public void setPersonnel(java.lang.Integer personnel) {
        this.personnel = personnel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessEstablishment)) return false;
        DutchBusinessEstablishment other = (DutchBusinessEstablishment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.main_establishment==null && other.getMain_establishment()==null) || 
             (this.main_establishment!=null &&
              this.main_establishment.equals(other.getMain_establishment()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sbi_codes==null && other.getSbi_codes()==null) || 
             (this.sbi_codes!=null &&
              java.util.Arrays.equals(this.sbi_codes, other.getSbi_codes()))) &&
            ((this.sbi_codes_text==null && other.getSbi_codes_text()==null) || 
             (this.sbi_codes_text!=null &&
              java.util.Arrays.equals(this.sbi_codes_text, other.getSbi_codes_text()))) &&
            ((this.establishment_postcode==null && other.getEstablishment_postcode()==null) || 
             (this.establishment_postcode!=null &&
              this.establishment_postcode.equals(other.getEstablishment_postcode()))) &&
            ((this.establishment_city==null && other.getEstablishment_city()==null) || 
             (this.establishment_city!=null &&
              this.establishment_city.equals(other.getEstablishment_city()))) &&
            ((this.establishment_street==null && other.getEstablishment_street()==null) || 
             (this.establishment_street!=null &&
              this.establishment_street.equals(other.getEstablishment_street()))) &&
            ((this.establishment_house_number==null && other.getEstablishment_house_number()==null) || 
             (this.establishment_house_number!=null &&
              this.establishment_house_number.equals(other.getEstablishment_house_number()))) &&
            ((this.establishment_house_number_addition==null && other.getEstablishment_house_number_addition()==null) || 
             (this.establishment_house_number_addition!=null &&
              this.establishment_house_number_addition.equals(other.getEstablishment_house_number_addition()))) &&
            ((this.establishment_country==null && other.getEstablishment_country()==null) || 
             (this.establishment_country!=null &&
              this.establishment_country.equals(other.getEstablishment_country()))) &&
            ((this.correspondence_postcode==null && other.getCorrespondence_postcode()==null) || 
             (this.correspondence_postcode!=null &&
              this.correspondence_postcode.equals(other.getCorrespondence_postcode()))) &&
            ((this.correspondence_city==null && other.getCorrespondence_city()==null) || 
             (this.correspondence_city!=null &&
              this.correspondence_city.equals(other.getCorrespondence_city()))) &&
            ((this.correspondence_street==null && other.getCorrespondence_street()==null) || 
             (this.correspondence_street!=null &&
              this.correspondence_street.equals(other.getCorrespondence_street()))) &&
            ((this.correspondence_house_number==null && other.getCorrespondence_house_number()==null) || 
             (this.correspondence_house_number!=null &&
              this.correspondence_house_number.equals(other.getCorrespondence_house_number()))) &&
            ((this.correspondence_house_number_addition==null && other.getCorrespondence_house_number_addition()==null) || 
             (this.correspondence_house_number_addition!=null &&
              this.correspondence_house_number_addition.equals(other.getCorrespondence_house_number_addition()))) &&
            ((this.correspondence_country==null && other.getCorrespondence_country()==null) || 
             (this.correspondence_country!=null &&
              this.correspondence_country.equals(other.getCorrespondence_country()))) &&
            ((this.curator_postcode==null && other.getCurator_postcode()==null) || 
             (this.curator_postcode!=null &&
              this.curator_postcode.equals(other.getCurator_postcode()))) &&
            ((this.curator_city==null && other.getCurator_city()==null) || 
             (this.curator_city!=null &&
              this.curator_city.equals(other.getCurator_city()))) &&
            ((this.curator_street==null && other.getCurator_street()==null) || 
             (this.curator_street!=null &&
              this.curator_street.equals(other.getCurator_street()))) &&
            ((this.curator_house_number==null && other.getCurator_house_number()==null) || 
             (this.curator_house_number!=null &&
              this.curator_house_number.equals(other.getCurator_house_number()))) &&
            ((this.curator_house_number_addition==null && other.getCurator_house_number_addition()==null) || 
             (this.curator_house_number_addition!=null &&
              this.curator_house_number_addition.equals(other.getCurator_house_number_addition()))) &&
            ((this.curator_country==null && other.getCurator_country()==null) || 
             (this.curator_country!=null &&
              this.curator_country.equals(other.getCurator_country()))) &&
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
            ((this.establishment_date==null && other.getEstablishment_date()==null) || 
             (this.establishment_date!=null &&
              this.establishment_date.equals(other.getEstablishment_date()))) &&
            ((this.date_since==null && other.getDate_since()==null) || 
             (this.date_since!=null &&
              this.date_since.equals(other.getDate_since()))) &&
            ((this.personnel==null && other.getPersonnel()==null) || 
             (this.personnel!=null &&
              this.personnel.equals(other.getPersonnel())));
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
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getMain_establishment() != null) {
            _hashCode += getMain_establishment().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
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
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getSbi_codes_text() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbi_codes_text());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbi_codes_text(), i);
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
        if (getEstablishment_house_number() != null) {
            _hashCode += getEstablishment_house_number().hashCode();
        }
        if (getEstablishment_house_number_addition() != null) {
            _hashCode += getEstablishment_house_number_addition().hashCode();
        }
        if (getEstablishment_country() != null) {
            _hashCode += getEstablishment_country().hashCode();
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
        if (getCorrespondence_house_number() != null) {
            _hashCode += getCorrespondence_house_number().hashCode();
        }
        if (getCorrespondence_house_number_addition() != null) {
            _hashCode += getCorrespondence_house_number_addition().hashCode();
        }
        if (getCorrespondence_country() != null) {
            _hashCode += getCorrespondence_country().hashCode();
        }
        if (getCurator_postcode() != null) {
            _hashCode += getCurator_postcode().hashCode();
        }
        if (getCurator_city() != null) {
            _hashCode += getCurator_city().hashCode();
        }
        if (getCurator_street() != null) {
            _hashCode += getCurator_street().hashCode();
        }
        if (getCurator_house_number() != null) {
            _hashCode += getCurator_house_number().hashCode();
        }
        if (getCurator_house_number_addition() != null) {
            _hashCode += getCurator_house_number_addition().hashCode();
        }
        if (getCurator_country() != null) {
            _hashCode += getCurator_country().hashCode();
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
        if (getEstablishment_date() != null) {
            _hashCode += getEstablishment_date().hashCode();
        }
        if (getDate_since() != null) {
            _hashCode += getDate_since().hashCode();
        }
        if (getPersonnel() != null) {
            _hashCode += getPersonnel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessEstablishment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEstablishment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_establishment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_establishment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "status"));
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
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_codes_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curator_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curator_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("establishment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
