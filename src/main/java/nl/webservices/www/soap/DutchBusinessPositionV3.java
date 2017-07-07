/**
 * DutchBusinessPositionV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPositionV3  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchBusinessPersonV3 functionary;

    private nl.webservices.www.soap.DutchBusinessOrganizationReferenceV3 organisation;

    private nl.webservices.www.soap.DutchBusinessAddressV3 residential_address;

    private nl.webservices.www.soap.DutchBusinessAddressV3 correspondence_address;

    private nl.webservices.www.soap.DutchBusinessAddressV3 establishment_address;

    private java.lang.Boolean longest_serving;

    private java.lang.String function_type;

    private java.lang.String function_description;

    private java.lang.String function_title;

    private nl.webservices.www.soap.DutchBusinessDateV3 function_start_date;

    private nl.webservices.www.soap.DutchBusinessDateV3 function_registration_date;

    private nl.webservices.www.soap.DutchBusinessDateV3 function_end_date;

    private java.lang.String function_authorization;

    private java.lang.String function_authorization_description;

    private nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_start_date;

    private java.lang.String function_authorization_signing_power;

    private nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_end_date;

    private java.lang.String authorization_description;

    private java.lang.String authorization_establishment_number;

    private nl.webservices.www.soap.DutchBusinessDateV3 authorization_start_date;

    private nl.webservices.www.soap.DutchBusinessDateV3 authorization_end_date;

    private java.lang.String[] authorization_constraints;

    private java.lang.String inauguration;

    private java.lang.String inauguration_function;

    private java.lang.String inauguration_duration;

    private nl.webservices.www.soap.DutchBusinessDateV3 inauguration_date;

    private java.lang.String inauguration_body;

    private java.lang.String under_receivership;

    private java.lang.String rights_against_third_parties;

    private java.lang.String release_of_covenant;

    private nl.webservices.www.soap.DutchBusinessDateV3 date_since;

    private nl.webservices.www.soap.DutchBusinessDateV3 date_joined;

    private java.lang.String[] remarks;

    public DutchBusinessPositionV3() {
    }

    public DutchBusinessPositionV3(
           nl.webservices.www.soap.DutchBusinessPersonV3 functionary,
           nl.webservices.www.soap.DutchBusinessOrganizationReferenceV3 organisation,
           nl.webservices.www.soap.DutchBusinessAddressV3 residential_address,
           nl.webservices.www.soap.DutchBusinessAddressV3 correspondence_address,
           nl.webservices.www.soap.DutchBusinessAddressV3 establishment_address,
           java.lang.Boolean longest_serving,
           java.lang.String function_type,
           java.lang.String function_description,
           java.lang.String function_title,
           nl.webservices.www.soap.DutchBusinessDateV3 function_start_date,
           nl.webservices.www.soap.DutchBusinessDateV3 function_registration_date,
           nl.webservices.www.soap.DutchBusinessDateV3 function_end_date,
           java.lang.String function_authorization,
           java.lang.String function_authorization_description,
           nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_start_date,
           java.lang.String function_authorization_signing_power,
           nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_end_date,
           java.lang.String authorization_description,
           java.lang.String authorization_establishment_number,
           nl.webservices.www.soap.DutchBusinessDateV3 authorization_start_date,
           nl.webservices.www.soap.DutchBusinessDateV3 authorization_end_date,
           java.lang.String[] authorization_constraints,
           java.lang.String inauguration,
           java.lang.String inauguration_function,
           java.lang.String inauguration_duration,
           nl.webservices.www.soap.DutchBusinessDateV3 inauguration_date,
           java.lang.String inauguration_body,
           java.lang.String under_receivership,
           java.lang.String rights_against_third_parties,
           java.lang.String release_of_covenant,
           nl.webservices.www.soap.DutchBusinessDateV3 date_since,
           nl.webservices.www.soap.DutchBusinessDateV3 date_joined,
           java.lang.String[] remarks) {
           this.functionary = functionary;
           this.organisation = organisation;
           this.residential_address = residential_address;
           this.correspondence_address = correspondence_address;
           this.establishment_address = establishment_address;
           this.longest_serving = longest_serving;
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
           this.authorization_establishment_number = authorization_establishment_number;
           this.authorization_start_date = authorization_start_date;
           this.authorization_end_date = authorization_end_date;
           this.authorization_constraints = authorization_constraints;
           this.inauguration = inauguration;
           this.inauguration_function = inauguration_function;
           this.inauguration_duration = inauguration_duration;
           this.inauguration_date = inauguration_date;
           this.inauguration_body = inauguration_body;
           this.under_receivership = under_receivership;
           this.rights_against_third_parties = rights_against_third_parties;
           this.release_of_covenant = release_of_covenant;
           this.date_since = date_since;
           this.date_joined = date_joined;
           this.remarks = remarks;
    }


    /**
     * Gets the functionary value for this DutchBusinessPositionV3.
     * 
     * @return functionary
     */
    public nl.webservices.www.soap.DutchBusinessPersonV3 getFunctionary() {
        return functionary;
    }


    /**
     * Sets the functionary value for this DutchBusinessPositionV3.
     * 
     * @param functionary
     */
    public void setFunctionary(nl.webservices.www.soap.DutchBusinessPersonV3 functionary) {
        this.functionary = functionary;
    }


    /**
     * Gets the organisation value for this DutchBusinessPositionV3.
     * 
     * @return organisation
     */
    public nl.webservices.www.soap.DutchBusinessOrganizationReferenceV3 getOrganisation() {
        return organisation;
    }


    /**
     * Sets the organisation value for this DutchBusinessPositionV3.
     * 
     * @param organisation
     */
    public void setOrganisation(nl.webservices.www.soap.DutchBusinessOrganizationReferenceV3 organisation) {
        this.organisation = organisation;
    }


    /**
     * Gets the residential_address value for this DutchBusinessPositionV3.
     * 
     * @return residential_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getResidential_address() {
        return residential_address;
    }


    /**
     * Sets the residential_address value for this DutchBusinessPositionV3.
     * 
     * @param residential_address
     */
    public void setResidential_address(nl.webservices.www.soap.DutchBusinessAddressV3 residential_address) {
        this.residential_address = residential_address;
    }


    /**
     * Gets the correspondence_address value for this DutchBusinessPositionV3.
     * 
     * @return correspondence_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getCorrespondence_address() {
        return correspondence_address;
    }


    /**
     * Sets the correspondence_address value for this DutchBusinessPositionV3.
     * 
     * @param correspondence_address
     */
    public void setCorrespondence_address(nl.webservices.www.soap.DutchBusinessAddressV3 correspondence_address) {
        this.correspondence_address = correspondence_address;
    }


    /**
     * Gets the establishment_address value for this DutchBusinessPositionV3.
     * 
     * @return establishment_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getEstablishment_address() {
        return establishment_address;
    }


    /**
     * Sets the establishment_address value for this DutchBusinessPositionV3.
     * 
     * @param establishment_address
     */
    public void setEstablishment_address(nl.webservices.www.soap.DutchBusinessAddressV3 establishment_address) {
        this.establishment_address = establishment_address;
    }


    /**
     * Gets the longest_serving value for this DutchBusinessPositionV3.
     * 
     * @return longest_serving
     */
    public java.lang.Boolean getLongest_serving() {
        return longest_serving;
    }


    /**
     * Sets the longest_serving value for this DutchBusinessPositionV3.
     * 
     * @param longest_serving
     */
    public void setLongest_serving(java.lang.Boolean longest_serving) {
        this.longest_serving = longest_serving;
    }


    /**
     * Gets the function_type value for this DutchBusinessPositionV3.
     * 
     * @return function_type
     */
    public java.lang.String getFunction_type() {
        return function_type;
    }


    /**
     * Sets the function_type value for this DutchBusinessPositionV3.
     * 
     * @param function_type
     */
    public void setFunction_type(java.lang.String function_type) {
        this.function_type = function_type;
    }


    /**
     * Gets the function_description value for this DutchBusinessPositionV3.
     * 
     * @return function_description
     */
    public java.lang.String getFunction_description() {
        return function_description;
    }


    /**
     * Sets the function_description value for this DutchBusinessPositionV3.
     * 
     * @param function_description
     */
    public void setFunction_description(java.lang.String function_description) {
        this.function_description = function_description;
    }


    /**
     * Gets the function_title value for this DutchBusinessPositionV3.
     * 
     * @return function_title
     */
    public java.lang.String getFunction_title() {
        return function_title;
    }


    /**
     * Sets the function_title value for this DutchBusinessPositionV3.
     * 
     * @param function_title
     */
    public void setFunction_title(java.lang.String function_title) {
        this.function_title = function_title;
    }


    /**
     * Gets the function_start_date value for this DutchBusinessPositionV3.
     * 
     * @return function_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getFunction_start_date() {
        return function_start_date;
    }


    /**
     * Sets the function_start_date value for this DutchBusinessPositionV3.
     * 
     * @param function_start_date
     */
    public void setFunction_start_date(nl.webservices.www.soap.DutchBusinessDateV3 function_start_date) {
        this.function_start_date = function_start_date;
    }


    /**
     * Gets the function_registration_date value for this DutchBusinessPositionV3.
     * 
     * @return function_registration_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getFunction_registration_date() {
        return function_registration_date;
    }


    /**
     * Sets the function_registration_date value for this DutchBusinessPositionV3.
     * 
     * @param function_registration_date
     */
    public void setFunction_registration_date(nl.webservices.www.soap.DutchBusinessDateV3 function_registration_date) {
        this.function_registration_date = function_registration_date;
    }


    /**
     * Gets the function_end_date value for this DutchBusinessPositionV3.
     * 
     * @return function_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getFunction_end_date() {
        return function_end_date;
    }


    /**
     * Sets the function_end_date value for this DutchBusinessPositionV3.
     * 
     * @param function_end_date
     */
    public void setFunction_end_date(nl.webservices.www.soap.DutchBusinessDateV3 function_end_date) {
        this.function_end_date = function_end_date;
    }


    /**
     * Gets the function_authorization value for this DutchBusinessPositionV3.
     * 
     * @return function_authorization
     */
    public java.lang.String getFunction_authorization() {
        return function_authorization;
    }


    /**
     * Sets the function_authorization value for this DutchBusinessPositionV3.
     * 
     * @param function_authorization
     */
    public void setFunction_authorization(java.lang.String function_authorization) {
        this.function_authorization = function_authorization;
    }


    /**
     * Gets the function_authorization_description value for this DutchBusinessPositionV3.
     * 
     * @return function_authorization_description
     */
    public java.lang.String getFunction_authorization_description() {
        return function_authorization_description;
    }


    /**
     * Sets the function_authorization_description value for this DutchBusinessPositionV3.
     * 
     * @param function_authorization_description
     */
    public void setFunction_authorization_description(java.lang.String function_authorization_description) {
        this.function_authorization_description = function_authorization_description;
    }


    /**
     * Gets the function_authorization_start_date value for this DutchBusinessPositionV3.
     * 
     * @return function_authorization_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getFunction_authorization_start_date() {
        return function_authorization_start_date;
    }


    /**
     * Sets the function_authorization_start_date value for this DutchBusinessPositionV3.
     * 
     * @param function_authorization_start_date
     */
    public void setFunction_authorization_start_date(nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_start_date) {
        this.function_authorization_start_date = function_authorization_start_date;
    }


    /**
     * Gets the function_authorization_signing_power value for this DutchBusinessPositionV3.
     * 
     * @return function_authorization_signing_power
     */
    public java.lang.String getFunction_authorization_signing_power() {
        return function_authorization_signing_power;
    }


    /**
     * Sets the function_authorization_signing_power value for this DutchBusinessPositionV3.
     * 
     * @param function_authorization_signing_power
     */
    public void setFunction_authorization_signing_power(java.lang.String function_authorization_signing_power) {
        this.function_authorization_signing_power = function_authorization_signing_power;
    }


    /**
     * Gets the function_authorization_end_date value for this DutchBusinessPositionV3.
     * 
     * @return function_authorization_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getFunction_authorization_end_date() {
        return function_authorization_end_date;
    }


    /**
     * Sets the function_authorization_end_date value for this DutchBusinessPositionV3.
     * 
     * @param function_authorization_end_date
     */
    public void setFunction_authorization_end_date(nl.webservices.www.soap.DutchBusinessDateV3 function_authorization_end_date) {
        this.function_authorization_end_date = function_authorization_end_date;
    }


    /**
     * Gets the authorization_description value for this DutchBusinessPositionV3.
     * 
     * @return authorization_description
     */
    public java.lang.String getAuthorization_description() {
        return authorization_description;
    }


    /**
     * Sets the authorization_description value for this DutchBusinessPositionV3.
     * 
     * @param authorization_description
     */
    public void setAuthorization_description(java.lang.String authorization_description) {
        this.authorization_description = authorization_description;
    }


    /**
     * Gets the authorization_establishment_number value for this DutchBusinessPositionV3.
     * 
     * @return authorization_establishment_number
     */
    public java.lang.String getAuthorization_establishment_number() {
        return authorization_establishment_number;
    }


    /**
     * Sets the authorization_establishment_number value for this DutchBusinessPositionV3.
     * 
     * @param authorization_establishment_number
     */
    public void setAuthorization_establishment_number(java.lang.String authorization_establishment_number) {
        this.authorization_establishment_number = authorization_establishment_number;
    }


    /**
     * Gets the authorization_start_date value for this DutchBusinessPositionV3.
     * 
     * @return authorization_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getAuthorization_start_date() {
        return authorization_start_date;
    }


    /**
     * Sets the authorization_start_date value for this DutchBusinessPositionV3.
     * 
     * @param authorization_start_date
     */
    public void setAuthorization_start_date(nl.webservices.www.soap.DutchBusinessDateV3 authorization_start_date) {
        this.authorization_start_date = authorization_start_date;
    }


    /**
     * Gets the authorization_end_date value for this DutchBusinessPositionV3.
     * 
     * @return authorization_end_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getAuthorization_end_date() {
        return authorization_end_date;
    }


    /**
     * Sets the authorization_end_date value for this DutchBusinessPositionV3.
     * 
     * @param authorization_end_date
     */
    public void setAuthorization_end_date(nl.webservices.www.soap.DutchBusinessDateV3 authorization_end_date) {
        this.authorization_end_date = authorization_end_date;
    }


    /**
     * Gets the authorization_constraints value for this DutchBusinessPositionV3.
     * 
     * @return authorization_constraints
     */
    public java.lang.String[] getAuthorization_constraints() {
        return authorization_constraints;
    }


    /**
     * Sets the authorization_constraints value for this DutchBusinessPositionV3.
     * 
     * @param authorization_constraints
     */
    public void setAuthorization_constraints(java.lang.String[] authorization_constraints) {
        this.authorization_constraints = authorization_constraints;
    }


    /**
     * Gets the inauguration value for this DutchBusinessPositionV3.
     * 
     * @return inauguration
     */
    public java.lang.String getInauguration() {
        return inauguration;
    }


    /**
     * Sets the inauguration value for this DutchBusinessPositionV3.
     * 
     * @param inauguration
     */
    public void setInauguration(java.lang.String inauguration) {
        this.inauguration = inauguration;
    }


    /**
     * Gets the inauguration_function value for this DutchBusinessPositionV3.
     * 
     * @return inauguration_function
     */
    public java.lang.String getInauguration_function() {
        return inauguration_function;
    }


    /**
     * Sets the inauguration_function value for this DutchBusinessPositionV3.
     * 
     * @param inauguration_function
     */
    public void setInauguration_function(java.lang.String inauguration_function) {
        this.inauguration_function = inauguration_function;
    }


    /**
     * Gets the inauguration_duration value for this DutchBusinessPositionV3.
     * 
     * @return inauguration_duration
     */
    public java.lang.String getInauguration_duration() {
        return inauguration_duration;
    }


    /**
     * Sets the inauguration_duration value for this DutchBusinessPositionV3.
     * 
     * @param inauguration_duration
     */
    public void setInauguration_duration(java.lang.String inauguration_duration) {
        this.inauguration_duration = inauguration_duration;
    }


    /**
     * Gets the inauguration_date value for this DutchBusinessPositionV3.
     * 
     * @return inauguration_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getInauguration_date() {
        return inauguration_date;
    }


    /**
     * Sets the inauguration_date value for this DutchBusinessPositionV3.
     * 
     * @param inauguration_date
     */
    public void setInauguration_date(nl.webservices.www.soap.DutchBusinessDateV3 inauguration_date) {
        this.inauguration_date = inauguration_date;
    }


    /**
     * Gets the inauguration_body value for this DutchBusinessPositionV3.
     * 
     * @return inauguration_body
     */
    public java.lang.String getInauguration_body() {
        return inauguration_body;
    }


    /**
     * Sets the inauguration_body value for this DutchBusinessPositionV3.
     * 
     * @param inauguration_body
     */
    public void setInauguration_body(java.lang.String inauguration_body) {
        this.inauguration_body = inauguration_body;
    }


    /**
     * Gets the under_receivership value for this DutchBusinessPositionV3.
     * 
     * @return under_receivership
     */
    public java.lang.String getUnder_receivership() {
        return under_receivership;
    }


    /**
     * Sets the under_receivership value for this DutchBusinessPositionV3.
     * 
     * @param under_receivership
     */
    public void setUnder_receivership(java.lang.String under_receivership) {
        this.under_receivership = under_receivership;
    }


    /**
     * Gets the rights_against_third_parties value for this DutchBusinessPositionV3.
     * 
     * @return rights_against_third_parties
     */
    public java.lang.String getRights_against_third_parties() {
        return rights_against_third_parties;
    }


    /**
     * Sets the rights_against_third_parties value for this DutchBusinessPositionV3.
     * 
     * @param rights_against_third_parties
     */
    public void setRights_against_third_parties(java.lang.String rights_against_third_parties) {
        this.rights_against_third_parties = rights_against_third_parties;
    }


    /**
     * Gets the release_of_covenant value for this DutchBusinessPositionV3.
     * 
     * @return release_of_covenant
     */
    public java.lang.String getRelease_of_covenant() {
        return release_of_covenant;
    }


    /**
     * Sets the release_of_covenant value for this DutchBusinessPositionV3.
     * 
     * @param release_of_covenant
     */
    public void setRelease_of_covenant(java.lang.String release_of_covenant) {
        this.release_of_covenant = release_of_covenant;
    }


    /**
     * Gets the date_since value for this DutchBusinessPositionV3.
     * 
     * @return date_since
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getDate_since() {
        return date_since;
    }


    /**
     * Sets the date_since value for this DutchBusinessPositionV3.
     * 
     * @param date_since
     */
    public void setDate_since(nl.webservices.www.soap.DutchBusinessDateV3 date_since) {
        this.date_since = date_since;
    }


    /**
     * Gets the date_joined value for this DutchBusinessPositionV3.
     * 
     * @return date_joined
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getDate_joined() {
        return date_joined;
    }


    /**
     * Sets the date_joined value for this DutchBusinessPositionV3.
     * 
     * @param date_joined
     */
    public void setDate_joined(nl.webservices.www.soap.DutchBusinessDateV3 date_joined) {
        this.date_joined = date_joined;
    }


    /**
     * Gets the remarks value for this DutchBusinessPositionV3.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessPositionV3.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPositionV3)) return false;
        DutchBusinessPositionV3 other = (DutchBusinessPositionV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.functionary==null && other.getFunctionary()==null) || 
             (this.functionary!=null &&
              this.functionary.equals(other.getFunctionary()))) &&
            ((this.organisation==null && other.getOrganisation()==null) || 
             (this.organisation!=null &&
              this.organisation.equals(other.getOrganisation()))) &&
            ((this.residential_address==null && other.getResidential_address()==null) || 
             (this.residential_address!=null &&
              this.residential_address.equals(other.getResidential_address()))) &&
            ((this.correspondence_address==null && other.getCorrespondence_address()==null) || 
             (this.correspondence_address!=null &&
              this.correspondence_address.equals(other.getCorrespondence_address()))) &&
            ((this.establishment_address==null && other.getEstablishment_address()==null) || 
             (this.establishment_address!=null &&
              this.establishment_address.equals(other.getEstablishment_address()))) &&
            ((this.longest_serving==null && other.getLongest_serving()==null) || 
             (this.longest_serving!=null &&
              this.longest_serving.equals(other.getLongest_serving()))) &&
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
            ((this.authorization_establishment_number==null && other.getAuthorization_establishment_number()==null) || 
             (this.authorization_establishment_number!=null &&
              this.authorization_establishment_number.equals(other.getAuthorization_establishment_number()))) &&
            ((this.authorization_start_date==null && other.getAuthorization_start_date()==null) || 
             (this.authorization_start_date!=null &&
              this.authorization_start_date.equals(other.getAuthorization_start_date()))) &&
            ((this.authorization_end_date==null && other.getAuthorization_end_date()==null) || 
             (this.authorization_end_date!=null &&
              this.authorization_end_date.equals(other.getAuthorization_end_date()))) &&
            ((this.authorization_constraints==null && other.getAuthorization_constraints()==null) || 
             (this.authorization_constraints!=null &&
              java.util.Arrays.equals(this.authorization_constraints, other.getAuthorization_constraints()))) &&
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
            ((this.date_since==null && other.getDate_since()==null) || 
             (this.date_since!=null &&
              this.date_since.equals(other.getDate_since()))) &&
            ((this.date_joined==null && other.getDate_joined()==null) || 
             (this.date_joined!=null &&
              this.date_joined.equals(other.getDate_joined()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks())));
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
        if (getFunctionary() != null) {
            _hashCode += getFunctionary().hashCode();
        }
        if (getOrganisation() != null) {
            _hashCode += getOrganisation().hashCode();
        }
        if (getResidential_address() != null) {
            _hashCode += getResidential_address().hashCode();
        }
        if (getCorrespondence_address() != null) {
            _hashCode += getCorrespondence_address().hashCode();
        }
        if (getEstablishment_address() != null) {
            _hashCode += getEstablishment_address().hashCode();
        }
        if (getLongest_serving() != null) {
            _hashCode += getLongest_serving().hashCode();
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
        if (getAuthorization_establishment_number() != null) {
            _hashCode += getAuthorization_establishment_number().hashCode();
        }
        if (getAuthorization_start_date() != null) {
            _hashCode += getAuthorization_start_date().hashCode();
        }
        if (getAuthorization_end_date() != null) {
            _hashCode += getAuthorization_end_date().hashCode();
        }
        if (getAuthorization_constraints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorization_constraints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorization_constraints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDate_since() != null) {
            _hashCode += getDate_since().hashCode();
        }
        if (getDate_joined() != null) {
            _hashCode += getDate_joined().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPositionV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPositionV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "functionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPersonV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "organisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessOrganizationReferenceV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residential_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residential_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "correspondence_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longest_serving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longest_serving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_registration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_registration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
        elemField.setFieldName("authorization_establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization_constraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authorization_constraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
        elemField.setFieldName("date_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_joined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_joined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
