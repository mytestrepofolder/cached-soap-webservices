/**
 * DutchBusinessPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPosition  implements java.io.Serializable {
    private java.lang.String[] trade_names;

    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String name;

    private java.lang.String first_name;

    private java.lang.String title;

    private java.lang.String initials;

    private java.lang.String last_name;

    private java.lang.String function_type;

    private java.lang.String function_description;

    private java.lang.String function_title;

    private nl.webservices.www.soap.DutchBusinessDate function_start_date;

    private nl.webservices.www.soap.DutchBusinessDate function_registration_date;

    private nl.webservices.www.soap.DutchBusinessDate function_end_date;

    private java.lang.String function_authorization;

    private java.lang.String function_authorization_description;

    private nl.webservices.www.soap.DutchBusinessDate function_authorization_start_date;

    private java.lang.String function_authorization_signing_power;

    private nl.webservices.www.soap.DutchBusinessDate function_authorization_end_date;

    private java.lang.String authorization_description;

    private nl.webservices.www.soap.DutchBusinessDate authorization_start_date;

    private nl.webservices.www.soap.DutchBusinessDate authorization_end_date;

    private java.lang.String inauguration;

    private java.lang.String inauguration_function;

    private java.lang.String inauguration_duration;

    private nl.webservices.www.soap.DutchBusinessDate inauguration_date;

    private java.lang.String inauguration_body;

    private java.lang.String under_receivership;

    private java.lang.String rights_against_third_parties;

    private java.lang.String release_of_covenant;

    private nl.webservices.www.soap.DutchBusinessDate date_deceased;

    private nl.webservices.www.soap.DutchBusinessDate date_of_birth;

    private java.lang.String place_of_birth;

    private java.lang.String country_of_birth;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String street;

    private java.lang.Integer house_number;

    private java.lang.String house_number_addition;

    private java.lang.String country;

    private java.lang.String[] telephone_numbers;

    private nl.webservices.www.soap.DutchBusinessDate date_since;

    private nl.webservices.www.soap.DutchBusinessDate date_joined;

    private java.lang.String status;

    public DutchBusinessPosition() {
    }

    public DutchBusinessPosition(
           java.lang.String[] trade_names,
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String name,
           java.lang.String first_name,
           java.lang.String title,
           java.lang.String initials,
           java.lang.String last_name,
           java.lang.String function_type,
           java.lang.String function_description,
           java.lang.String function_title,
           nl.webservices.www.soap.DutchBusinessDate function_start_date,
           nl.webservices.www.soap.DutchBusinessDate function_registration_date,
           nl.webservices.www.soap.DutchBusinessDate function_end_date,
           java.lang.String function_authorization,
           java.lang.String function_authorization_description,
           nl.webservices.www.soap.DutchBusinessDate function_authorization_start_date,
           java.lang.String function_authorization_signing_power,
           nl.webservices.www.soap.DutchBusinessDate function_authorization_end_date,
           java.lang.String authorization_description,
           nl.webservices.www.soap.DutchBusinessDate authorization_start_date,
           nl.webservices.www.soap.DutchBusinessDate authorization_end_date,
           java.lang.String inauguration,
           java.lang.String inauguration_function,
           java.lang.String inauguration_duration,
           nl.webservices.www.soap.DutchBusinessDate inauguration_date,
           java.lang.String inauguration_body,
           java.lang.String under_receivership,
           java.lang.String rights_against_third_parties,
           java.lang.String release_of_covenant,
           nl.webservices.www.soap.DutchBusinessDate date_deceased,
           nl.webservices.www.soap.DutchBusinessDate date_of_birth,
           java.lang.String place_of_birth,
           java.lang.String country_of_birth,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String street,
           java.lang.Integer house_number,
           java.lang.String house_number_addition,
           java.lang.String country,
           java.lang.String[] telephone_numbers,
           nl.webservices.www.soap.DutchBusinessDate date_since,
           nl.webservices.www.soap.DutchBusinessDate date_joined,
           java.lang.String status) {
           this.trade_names = trade_names;
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.name = name;
           this.first_name = first_name;
           this.title = title;
           this.initials = initials;
           this.last_name = last_name;
           this.function_type = function_type;
           this.function_description = function_description;
           this.function_title = function_title;
           this.function_start_date = function_start_date;
           this.function_registration_date = function_registration_date;
           this.function_end_date = function_end_date;
           this.function_authorization = function_authorization;
           this.function_authorization_description = function_authorization_description;
           this.function_authorization_start_date = function_authorization_start_date;
           this.function_authorization_signing_power = function_authorization_signing_power;
           this.function_authorization_end_date = function_authorization_end_date;
           this.authorization_description = authorization_description;
           this.authorization_start_date = authorization_start_date;
           this.authorization_end_date = authorization_end_date;
           this.inauguration = inauguration;
           this.inauguration_function = inauguration_function;
           this.inauguration_duration = inauguration_duration;
           this.inauguration_date = inauguration_date;
           this.inauguration_body = inauguration_body;
           this.under_receivership = under_receivership;
           this.rights_against_third_parties = rights_against_third_parties;
           this.release_of_covenant = release_of_covenant;
           this.date_deceased = date_deceased;
           this.date_of_birth = date_of_birth;
           this.place_of_birth = place_of_birth;
           this.country_of_birth = country_of_birth;
           this.postcode = postcode;
           this.city = city;
           this.street = street;
           this.house_number = house_number;
           this.house_number_addition = house_number_addition;
           this.country = country;
           this.telephone_numbers = telephone_numbers;
           this.date_since = date_since;
           this.date_joined = date_joined;
           this.status = status;
    }


    /**
     * Gets the trade_names value for this DutchBusinessPosition.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DutchBusinessPosition.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessPosition.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessPosition.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this DutchBusinessPosition.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this DutchBusinessPosition.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the name value for this DutchBusinessPosition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DutchBusinessPosition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the first_name value for this DutchBusinessPosition.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this DutchBusinessPosition.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the title value for this DutchBusinessPosition.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DutchBusinessPosition.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the initials value for this DutchBusinessPosition.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this DutchBusinessPosition.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the last_name value for this DutchBusinessPosition.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this DutchBusinessPosition.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the function_type value for this DutchBusinessPosition.
     * 
     * @return function_type
     */
    public java.lang.String getFunction_type() {
        return function_type;
    }


    /**
     * Sets the function_type value for this DutchBusinessPosition.
     * 
     * @param function_type
     */
    public void setFunction_type(java.lang.String function_type) {
        this.function_type = function_type;
    }


    /**
     * Gets the function_description value for this DutchBusinessPosition.
     * 
     * @return function_description
     */
    public java.lang.String getFunction_description() {
        return function_description;
    }


    /**
     * Sets the function_description value for this DutchBusinessPosition.
     * 
     * @param function_description
     */
    public void setFunction_description(java.lang.String function_description) {
        this.function_description = function_description;
    }


    /**
     * Gets the function_title value for this DutchBusinessPosition.
     * 
     * @return function_title
     */
    public java.lang.String getFunction_title() {
        return function_title;
    }


    /**
     * Sets the function_title value for this DutchBusinessPosition.
     * 
     * @param function_title
     */
    public void setFunction_title(java.lang.String function_title) {
        this.function_title = function_title;
    }


    /**
     * Gets the function_start_date value for this DutchBusinessPosition.
     * 
     * @return function_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_start_date() {
        return function_start_date;
    }


    /**
     * Sets the function_start_date value for this DutchBusinessPosition.
     * 
     * @param function_start_date
     */
    public void setFunction_start_date(nl.webservices.www.soap.DutchBusinessDate function_start_date) {
        this.function_start_date = function_start_date;
    }


    /**
     * Gets the function_registration_date value for this DutchBusinessPosition.
     * 
     * @return function_registration_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_registration_date() {
        return function_registration_date;
    }


    /**
     * Sets the function_registration_date value for this DutchBusinessPosition.
     * 
     * @param function_registration_date
     */
    public void setFunction_registration_date(nl.webservices.www.soap.DutchBusinessDate function_registration_date) {
        this.function_registration_date = function_registration_date;
    }


    /**
     * Gets the function_end_date value for this DutchBusinessPosition.
     * 
     * @return function_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_end_date() {
        return function_end_date;
    }


    /**
     * Sets the function_end_date value for this DutchBusinessPosition.
     * 
     * @param function_end_date
     */
    public void setFunction_end_date(nl.webservices.www.soap.DutchBusinessDate function_end_date) {
        this.function_end_date = function_end_date;
    }


    /**
     * Gets the function_authorization value for this DutchBusinessPosition.
     * 
     * @return function_authorization
     */
    public java.lang.String getFunction_authorization() {
        return function_authorization;
    }


    /**
     * Sets the function_authorization value for this DutchBusinessPosition.
     * 
     * @param function_authorization
     */
    public void setFunction_authorization(java.lang.String function_authorization) {
        this.function_authorization = function_authorization;
    }


    /**
     * Gets the function_authorization_description value for this DutchBusinessPosition.
     * 
     * @return function_authorization_description
     */
    public java.lang.String getFunction_authorization_description() {
        return function_authorization_description;
    }


    /**
     * Sets the function_authorization_description value for this DutchBusinessPosition.
     * 
     * @param function_authorization_description
     */
    public void setFunction_authorization_description(java.lang.String function_authorization_description) {
        this.function_authorization_description = function_authorization_description;
    }


    /**
     * Gets the function_authorization_start_date value for this DutchBusinessPosition.
     * 
     * @return function_authorization_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_authorization_start_date() {
        return function_authorization_start_date;
    }


    /**
     * Sets the function_authorization_start_date value for this DutchBusinessPosition.
     * 
     * @param function_authorization_start_date
     */
    public void setFunction_authorization_start_date(nl.webservices.www.soap.DutchBusinessDate function_authorization_start_date) {
        this.function_authorization_start_date = function_authorization_start_date;
    }


    /**
     * Gets the function_authorization_signing_power value for this DutchBusinessPosition.
     * 
     * @return function_authorization_signing_power
     */
    public java.lang.String getFunction_authorization_signing_power() {
        return function_authorization_signing_power;
    }


    /**
     * Sets the function_authorization_signing_power value for this DutchBusinessPosition.
     * 
     * @param function_authorization_signing_power
     */
    public void setFunction_authorization_signing_power(java.lang.String function_authorization_signing_power) {
        this.function_authorization_signing_power = function_authorization_signing_power;
    }


    /**
     * Gets the function_authorization_end_date value for this DutchBusinessPosition.
     * 
     * @return function_authorization_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_authorization_end_date() {
        return function_authorization_end_date;
    }


    /**
     * Sets the function_authorization_end_date value for this DutchBusinessPosition.
     * 
     * @param function_authorization_end_date
     */
    public void setFunction_authorization_end_date(nl.webservices.www.soap.DutchBusinessDate function_authorization_end_date) {
        this.function_authorization_end_date = function_authorization_end_date;
    }


    /**
     * Gets the authorization_description value for this DutchBusinessPosition.
     * 
     * @return authorization_description
     */
    public java.lang.String getAuthorization_description() {
        return authorization_description;
    }


    /**
     * Sets the authorization_description value for this DutchBusinessPosition.
     * 
     * @param authorization_description
     */
    public void setAuthorization_description(java.lang.String authorization_description) {
        this.authorization_description = authorization_description;
    }


    /**
     * Gets the authorization_start_date value for this DutchBusinessPosition.
     * 
     * @return authorization_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getAuthorization_start_date() {
        return authorization_start_date;
    }


    /**
     * Sets the authorization_start_date value for this DutchBusinessPosition.
     * 
     * @param authorization_start_date
     */
    public void setAuthorization_start_date(nl.webservices.www.soap.DutchBusinessDate authorization_start_date) {
        this.authorization_start_date = authorization_start_date;
    }


    /**
     * Gets the authorization_end_date value for this DutchBusinessPosition.
     * 
     * @return authorization_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getAuthorization_end_date() {
        return authorization_end_date;
    }


    /**
     * Sets the authorization_end_date value for this DutchBusinessPosition.
     * 
     * @param authorization_end_date
     */
    public void setAuthorization_end_date(nl.webservices.www.soap.DutchBusinessDate authorization_end_date) {
        this.authorization_end_date = authorization_end_date;
    }


    /**
     * Gets the inauguration value for this DutchBusinessPosition.
     * 
     * @return inauguration
     */
    public java.lang.String getInauguration() {
        return inauguration;
    }


    /**
     * Sets the inauguration value for this DutchBusinessPosition.
     * 
     * @param inauguration
     */
    public void setInauguration(java.lang.String inauguration) {
        this.inauguration = inauguration;
    }


    /**
     * Gets the inauguration_function value for this DutchBusinessPosition.
     * 
     * @return inauguration_function
     */
    public java.lang.String getInauguration_function() {
        return inauguration_function;
    }


    /**
     * Sets the inauguration_function value for this DutchBusinessPosition.
     * 
     * @param inauguration_function
     */
    public void setInauguration_function(java.lang.String inauguration_function) {
        this.inauguration_function = inauguration_function;
    }


    /**
     * Gets the inauguration_duration value for this DutchBusinessPosition.
     * 
     * @return inauguration_duration
     */
    public java.lang.String getInauguration_duration() {
        return inauguration_duration;
    }


    /**
     * Sets the inauguration_duration value for this DutchBusinessPosition.
     * 
     * @param inauguration_duration
     */
    public void setInauguration_duration(java.lang.String inauguration_duration) {
        this.inauguration_duration = inauguration_duration;
    }


    /**
     * Gets the inauguration_date value for this DutchBusinessPosition.
     * 
     * @return inauguration_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getInauguration_date() {
        return inauguration_date;
    }


    /**
     * Sets the inauguration_date value for this DutchBusinessPosition.
     * 
     * @param inauguration_date
     */
    public void setInauguration_date(nl.webservices.www.soap.DutchBusinessDate inauguration_date) {
        this.inauguration_date = inauguration_date;
    }


    /**
     * Gets the inauguration_body value for this DutchBusinessPosition.
     * 
     * @return inauguration_body
     */
    public java.lang.String getInauguration_body() {
        return inauguration_body;
    }


    /**
     * Sets the inauguration_body value for this DutchBusinessPosition.
     * 
     * @param inauguration_body
     */
    public void setInauguration_body(java.lang.String inauguration_body) {
        this.inauguration_body = inauguration_body;
    }


    /**
     * Gets the under_receivership value for this DutchBusinessPosition.
     * 
     * @return under_receivership
     */
    public java.lang.String getUnder_receivership() {
        return under_receivership;
    }


    /**
     * Sets the under_receivership value for this DutchBusinessPosition.
     * 
     * @param under_receivership
     */
    public void setUnder_receivership(java.lang.String under_receivership) {
        this.under_receivership = under_receivership;
    }


    /**
     * Gets the rights_against_third_parties value for this DutchBusinessPosition.
     * 
     * @return rights_against_third_parties
     */
    public java.lang.String getRights_against_third_parties() {
        return rights_against_third_parties;
    }


    /**
     * Sets the rights_against_third_parties value for this DutchBusinessPosition.
     * 
     * @param rights_against_third_parties
     */
    public void setRights_against_third_parties(java.lang.String rights_against_third_parties) {
        this.rights_against_third_parties = rights_against_third_parties;
    }


    /**
     * Gets the release_of_covenant value for this DutchBusinessPosition.
     * 
     * @return release_of_covenant
     */
    public java.lang.String getRelease_of_covenant() {
        return release_of_covenant;
    }


    /**
     * Sets the release_of_covenant value for this DutchBusinessPosition.
     * 
     * @param release_of_covenant
     */
    public void setRelease_of_covenant(java.lang.String release_of_covenant) {
        this.release_of_covenant = release_of_covenant;
    }


    /**
     * Gets the date_deceased value for this DutchBusinessPosition.
     * 
     * @return date_deceased
     */
    public nl.webservices.www.soap.DutchBusinessDate getDate_deceased() {
        return date_deceased;
    }


    /**
     * Sets the date_deceased value for this DutchBusinessPosition.
     * 
     * @param date_deceased
     */
    public void setDate_deceased(nl.webservices.www.soap.DutchBusinessDate date_deceased) {
        this.date_deceased = date_deceased;
    }


    /**
     * Gets the date_of_birth value for this DutchBusinessPosition.
     * 
     * @return date_of_birth
     */
    public nl.webservices.www.soap.DutchBusinessDate getDate_of_birth() {
        return date_of_birth;
    }


    /**
     * Sets the date_of_birth value for this DutchBusinessPosition.
     * 
     * @param date_of_birth
     */
    public void setDate_of_birth(nl.webservices.www.soap.DutchBusinessDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }


    /**
     * Gets the place_of_birth value for this DutchBusinessPosition.
     * 
     * @return place_of_birth
     */
    public java.lang.String getPlace_of_birth() {
        return place_of_birth;
    }


    /**
     * Sets the place_of_birth value for this DutchBusinessPosition.
     * 
     * @param place_of_birth
     */
    public void setPlace_of_birth(java.lang.String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }


    /**
     * Gets the country_of_birth value for this DutchBusinessPosition.
     * 
     * @return country_of_birth
     */
    public java.lang.String getCountry_of_birth() {
        return country_of_birth;
    }


    /**
     * Sets the country_of_birth value for this DutchBusinessPosition.
     * 
     * @param country_of_birth
     */
    public void setCountry_of_birth(java.lang.String country_of_birth) {
        this.country_of_birth = country_of_birth;
    }


    /**
     * Gets the postcode value for this DutchBusinessPosition.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DutchBusinessPosition.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this DutchBusinessPosition.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DutchBusinessPosition.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the street value for this DutchBusinessPosition.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this DutchBusinessPosition.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_number value for this DutchBusinessPosition.
     * 
     * @return house_number
     */
    public java.lang.Integer getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this DutchBusinessPosition.
     * 
     * @param house_number
     */
    public void setHouse_number(java.lang.Integer house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the house_number_addition value for this DutchBusinessPosition.
     * 
     * @return house_number_addition
     */
    public java.lang.String getHouse_number_addition() {
        return house_number_addition;
    }


    /**
     * Sets the house_number_addition value for this DutchBusinessPosition.
     * 
     * @param house_number_addition
     */
    public void setHouse_number_addition(java.lang.String house_number_addition) {
        this.house_number_addition = house_number_addition;
    }


    /**
     * Gets the country value for this DutchBusinessPosition.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DutchBusinessPosition.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the telephone_numbers value for this DutchBusinessPosition.
     * 
     * @return telephone_numbers
     */
    public java.lang.String[] getTelephone_numbers() {
        return telephone_numbers;
    }


    /**
     * Sets the telephone_numbers value for this DutchBusinessPosition.
     * 
     * @param telephone_numbers
     */
    public void setTelephone_numbers(java.lang.String[] telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }


    /**
     * Gets the date_since value for this DutchBusinessPosition.
     * 
     * @return date_since
     */
    public nl.webservices.www.soap.DutchBusinessDate getDate_since() {
        return date_since;
    }


    /**
     * Sets the date_since value for this DutchBusinessPosition.
     * 
     * @param date_since
     */
    public void setDate_since(nl.webservices.www.soap.DutchBusinessDate date_since) {
        this.date_since = date_since;
    }


    /**
     * Gets the date_joined value for this DutchBusinessPosition.
     * 
     * @return date_joined
     */
    public nl.webservices.www.soap.DutchBusinessDate getDate_joined() {
        return date_joined;
    }


    /**
     * Sets the date_joined value for this DutchBusinessPosition.
     * 
     * @param date_joined
     */
    public void setDate_joined(nl.webservices.www.soap.DutchBusinessDate date_joined) {
        this.date_joined = date_joined;
    }


    /**
     * Gets the status value for this DutchBusinessPosition.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DutchBusinessPosition.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPosition)) return false;
        DutchBusinessPosition other = (DutchBusinessPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.function_type==null && other.getFunction_type()==null) || 
             (this.function_type!=null &&
              this.function_type.equals(other.getFunction_type()))) &&
            ((this.function_description==null && other.getFunction_description()==null) || 
             (this.function_description!=null &&
              this.function_description.equals(other.getFunction_description()))) &&
            ((this.function_title==null && other.getFunction_title()==null) || 
             (this.function_title!=null &&
              this.function_title.equals(other.getFunction_title()))) &&
            ((this.function_start_date==null && other.getFunction_start_date()==null) || 
             (this.function_start_date!=null &&
              this.function_start_date.equals(other.getFunction_start_date()))) &&
            ((this.function_registration_date==null && other.getFunction_registration_date()==null) || 
             (this.function_registration_date!=null &&
              this.function_registration_date.equals(other.getFunction_registration_date()))) &&
            ((this.function_end_date==null && other.getFunction_end_date()==null) || 
             (this.function_end_date!=null &&
              this.function_end_date.equals(other.getFunction_end_date()))) &&
            ((this.function_authorization==null && other.getFunction_authorization()==null) || 
             (this.function_authorization!=null &&
              this.function_authorization.equals(other.getFunction_authorization()))) &&
            ((this.function_authorization_description==null && other.getFunction_authorization_description()==null) || 
             (this.function_authorization_description!=null &&
              this.function_authorization_description.equals(other.getFunction_authorization_description()))) &&
            ((this.function_authorization_start_date==null && other.getFunction_authorization_start_date()==null) || 
             (this.function_authorization_start_date!=null &&
              this.function_authorization_start_date.equals(other.getFunction_authorization_start_date()))) &&
            ((this.function_authorization_signing_power==null && other.getFunction_authorization_signing_power()==null) || 
             (this.function_authorization_signing_power!=null &&
              this.function_authorization_signing_power.equals(other.getFunction_authorization_signing_power()))) &&
            ((this.function_authorization_end_date==null && other.getFunction_authorization_end_date()==null) || 
             (this.function_authorization_end_date!=null &&
              this.function_authorization_end_date.equals(other.getFunction_authorization_end_date()))) &&
            ((this.authorization_description==null && other.getAuthorization_description()==null) || 
             (this.authorization_description!=null &&
              this.authorization_description.equals(other.getAuthorization_description()))) &&
            ((this.authorization_start_date==null && other.getAuthorization_start_date()==null) || 
             (this.authorization_start_date!=null &&
              this.authorization_start_date.equals(other.getAuthorization_start_date()))) &&
            ((this.authorization_end_date==null && other.getAuthorization_end_date()==null) || 
             (this.authorization_end_date!=null &&
              this.authorization_end_date.equals(other.getAuthorization_end_date()))) &&
            ((this.inauguration==null && other.getInauguration()==null) || 
             (this.inauguration!=null &&
              this.inauguration.equals(other.getInauguration()))) &&
            ((this.inauguration_function==null && other.getInauguration_function()==null) || 
             (this.inauguration_function!=null &&
              this.inauguration_function.equals(other.getInauguration_function()))) &&
            ((this.inauguration_duration==null && other.getInauguration_duration()==null) || 
             (this.inauguration_duration!=null &&
              this.inauguration_duration.equals(other.getInauguration_duration()))) &&
            ((this.inauguration_date==null && other.getInauguration_date()==null) || 
             (this.inauguration_date!=null &&
              this.inauguration_date.equals(other.getInauguration_date()))) &&
            ((this.inauguration_body==null && other.getInauguration_body()==null) || 
             (this.inauguration_body!=null &&
              this.inauguration_body.equals(other.getInauguration_body()))) &&
            ((this.under_receivership==null && other.getUnder_receivership()==null) || 
             (this.under_receivership!=null &&
              this.under_receivership.equals(other.getUnder_receivership()))) &&
            ((this.rights_against_third_parties==null && other.getRights_against_third_parties()==null) || 
             (this.rights_against_third_parties!=null &&
              this.rights_against_third_parties.equals(other.getRights_against_third_parties()))) &&
            ((this.release_of_covenant==null && other.getRelease_of_covenant()==null) || 
             (this.release_of_covenant!=null &&
              this.release_of_covenant.equals(other.getRelease_of_covenant()))) &&
            ((this.date_deceased==null && other.getDate_deceased()==null) || 
             (this.date_deceased!=null &&
              this.date_deceased.equals(other.getDate_deceased()))) &&
            ((this.date_of_birth==null && other.getDate_of_birth()==null) || 
             (this.date_of_birth!=null &&
              this.date_of_birth.equals(other.getDate_of_birth()))) &&
            ((this.place_of_birth==null && other.getPlace_of_birth()==null) || 
             (this.place_of_birth!=null &&
              this.place_of_birth.equals(other.getPlace_of_birth()))) &&
            ((this.country_of_birth==null && other.getCountry_of_birth()==null) || 
             (this.country_of_birth!=null &&
              this.country_of_birth.equals(other.getCountry_of_birth()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house_number==null && other.getHouse_number()==null) || 
             (this.house_number!=null &&
              this.house_number.equals(other.getHouse_number()))) &&
            ((this.house_number_addition==null && other.getHouse_number_addition()==null) || 
             (this.house_number_addition!=null &&
              this.house_number_addition.equals(other.getHouse_number_addition()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.telephone_numbers==null && other.getTelephone_numbers()==null) || 
             (this.telephone_numbers!=null &&
              java.util.Arrays.equals(this.telephone_numbers, other.getTelephone_numbers()))) &&
            ((this.date_since==null && other.getDate_since()==null) || 
             (this.date_since!=null &&
              this.date_since.equals(other.getDate_since()))) &&
            ((this.date_joined==null && other.getDate_joined()==null) || 
             (this.date_joined!=null &&
              this.date_joined.equals(other.getDate_joined()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getFunction_type() != null) {
            _hashCode += getFunction_type().hashCode();
        }
        if (getFunction_description() != null) {
            _hashCode += getFunction_description().hashCode();
        }
        if (getFunction_title() != null) {
            _hashCode += getFunction_title().hashCode();
        }
        if (getFunction_start_date() != null) {
            _hashCode += getFunction_start_date().hashCode();
        }
        if (getFunction_registration_date() != null) {
            _hashCode += getFunction_registration_date().hashCode();
        }
        if (getFunction_end_date() != null) {
            _hashCode += getFunction_end_date().hashCode();
        }
        if (getFunction_authorization() != null) {
            _hashCode += getFunction_authorization().hashCode();
        }
        if (getFunction_authorization_description() != null) {
            _hashCode += getFunction_authorization_description().hashCode();
        }
        if (getFunction_authorization_start_date() != null) {
            _hashCode += getFunction_authorization_start_date().hashCode();
        }
        if (getFunction_authorization_signing_power() != null) {
            _hashCode += getFunction_authorization_signing_power().hashCode();
        }
        if (getFunction_authorization_end_date() != null) {
            _hashCode += getFunction_authorization_end_date().hashCode();
        }
        if (getAuthorization_description() != null) {
            _hashCode += getAuthorization_description().hashCode();
        }
        if (getAuthorization_start_date() != null) {
            _hashCode += getAuthorization_start_date().hashCode();
        }
        if (getAuthorization_end_date() != null) {
            _hashCode += getAuthorization_end_date().hashCode();
        }
        if (getInauguration() != null) {
            _hashCode += getInauguration().hashCode();
        }
        if (getInauguration_function() != null) {
            _hashCode += getInauguration_function().hashCode();
        }
        if (getInauguration_duration() != null) {
            _hashCode += getInauguration_duration().hashCode();
        }
        if (getInauguration_date() != null) {
            _hashCode += getInauguration_date().hashCode();
        }
        if (getInauguration_body() != null) {
            _hashCode += getInauguration_body().hashCode();
        }
        if (getUnder_receivership() != null) {
            _hashCode += getUnder_receivership().hashCode();
        }
        if (getRights_against_third_parties() != null) {
            _hashCode += getRights_against_third_parties().hashCode();
        }
        if (getRelease_of_covenant() != null) {
            _hashCode += getRelease_of_covenant().hashCode();
        }
        if (getDate_deceased() != null) {
            _hashCode += getDate_deceased().hashCode();
        }
        if (getDate_of_birth() != null) {
            _hashCode += getDate_of_birth().hashCode();
        }
        if (getPlace_of_birth() != null) {
            _hashCode += getPlace_of_birth().hashCode();
        }
        if (getCountry_of_birth() != null) {
            _hashCode += getCountry_of_birth().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse_number() != null) {
            _hashCode += getHouse_number().hashCode();
        }
        if (getHouse_number_addition() != null) {
            _hashCode += getHouse_number_addition().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        if (getDate_since() != null) {
            _hashCode += getDate_since().hashCode();
        }
        if (getDate_joined() != null) {
            _hashCode += getDate_joined().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_registration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_registration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization_signing_power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization_signing_power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inauguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inauguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inauguration_function");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inauguration_function"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inauguration_duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inauguration_duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inauguration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inauguration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inauguration_body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inauguration_body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("under_receivership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "under_receivership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rights_against_third_parties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rights_against_third_parties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_of_covenant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "release_of_covenant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_deceased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_deceased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "place_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
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
        elemField.setFieldName("date_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_joined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_joined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
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
