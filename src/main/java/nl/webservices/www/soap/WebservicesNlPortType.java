/**
 * WebservicesNlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public interface WebservicesNlPortType extends java.rmi.Remote {

    /**
     * Retrieve a token with which a new account may be created via
     * the Webview
     */
    public nl.webservices.www.soap.AccountGetCreationTokenResponseType accountGetCreationToken(nl.webservices.www.soap.AccountGetCreationTokenRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the id of an account created with a token retrieved using
     * accountGetCreationToken
     */
    public nl.webservices.www.soap.AccountGetCreationStatusResponseType accountGetCreationStatus(nl.webservices.www.soap.AccountGetCreationStatusRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a token that can be used order account balance via
     * the <Webview Interface>
     */
    public nl.webservices.www.soap.AccountGetOrderTokenResponseType accountGetOrderToken(nl.webservices.www.soap.AccountGetOrderTokenRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Removes all sessions of a user, or just a single session if
     * reactid is not 0
     */
    public nl.webservices.www.soap.UserSessionRemoveResponseType userSessionRemove(nl.webservices.www.soap.UserSessionRemoveRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Lists all the current sessions of a user
     */
    public nl.webservices.www.soap.UserSessionListResponseType userSessionList(nl.webservices.www.soap.UserSessionListRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the users balance
     */
    public nl.webservices.www.soap.UserViewBalanceResponseType userViewBalance(nl.webservices.www.soap.UserViewBalanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Change the user's balance
     */
    public nl.webservices.www.soap.UserEditBalanceResponseType userEditBalance(nl.webservices.www.soap.UserEditBalanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the accounts balance
     */
    public nl.webservices.www.soap.AccountViewBalanceResponseType accountViewBalance(nl.webservices.www.soap.AccountViewBalanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * View users details
     */
    public nl.webservices.www.soap.UserViewV2ResponseType userViewV2(nl.webservices.www.soap.UserViewV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Edit a users details, the users current password is required
     */
    public nl.webservices.www.soap.UserEditV2ResponseType userEditV2(nl.webservices.www.soap.UserEditV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Edit details only an admin may change, such as a users nickname
     * and password.notificationrecipients must have one of the following
     * values: accountcontact, user, 
     *                     accountcontact_and_user. Otherwise it will default
     * to accountcontact.
     */
    public nl.webservices.www.soap.UserEditExtendedV2ResponseType userEditExtendedV2(nl.webservices.www.soap.UserEditExtendedV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Create and notify a new user
     */
    public nl.webservices.www.soap.UserCreateV2ResponseType userCreateV2(nl.webservices.www.soap.UserCreateV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Create a WebservicesNl test user
     */
    public nl.webservices.www.soap.CreateTestUserResponseType createTestUser(nl.webservices.www.soap.CreateTestUserRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Change a users password
     */
    public nl.webservices.www.soap.UserChangePasswordResponseType userChangePassword(nl.webservices.www.soap.UserChangePasswordRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Deletes a user
     */
    public nl.webservices.www.soap.UserRemoveResponseType userRemove(nl.webservices.www.soap.UserRemoveRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Activates the user and sends user login information to users
     * email address
     */
    public nl.webservices.www.soap.UserNotifyResponseType userNotify(nl.webservices.www.soap.UserNotifyRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all groups the user may assign to other users
     */
    public nl.webservices.www.soap.UserListAssignableGroupsResponseType userListAssignableGroups(nl.webservices.www.soap.UserListAssignableGroupsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Add a user to a group
     */
    public nl.webservices.www.soap.UserAddGroupResponseType userAddGroup(nl.webservices.www.soap.UserAddGroupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Remove a user from a group
     */
    public nl.webservices.www.soap.UserRemoveGroupResponseType userRemoveGroup(nl.webservices.www.soap.UserRemoveGroupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * View the account details
     */
    public nl.webservices.www.soap.AccountViewV2ResponseType accountViewV2(nl.webservices.www.soap.AccountViewV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Edit an accounts details
     */
    public nl.webservices.www.soap.AccountEditV2ResponseType accountEditV2(nl.webservices.www.soap.AccountEditV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all users in the account
     */
    public nl.webservices.www.soap.AccountUserListV2ResponseType accountUserListV2(nl.webservices.www.soap.AccountUserListV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of users that are in the account and match the
     * search phrase
     */
    public nl.webservices.www.soap.AccountUserSearchV2ResponseType accountUserSearchV2(nl.webservices.www.soap.AccountUserSearchV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Sets host restrictions for the account
     */
    public nl.webservices.www.soap.AccountEditHostRestrictionsResponseType accountEditHostRestrictions(nl.webservices.www.soap.AccountEditHostRestrictionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Gets host restrictions for the account
     */
    public nl.webservices.www.soap.AccountViewHostRestrictionsResponseType accountViewHostRestrictions(nl.webservices.www.soap.AccountViewHostRestrictionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Edit host restrictions for this user
     */
    public nl.webservices.www.soap.UserEditHostRestrictionsResponseType userEditHostRestrictions(nl.webservices.www.soap.UserEditHostRestrictionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * View host restrictions for this user
     */
    public nl.webservices.www.soap.UserViewHostRestrictionsResponseType userViewHostRestrictions(nl.webservices.www.soap.UserViewHostRestrictionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get an address by providing its complete postcode (including
     * house number). This is a reeks level function.
     */
    public nl.webservices.www.soap.AddressReeksPostcodeSearchResponseType addressReeksPostcodeSearch(nl.webservices.www.soap.AddressReeksPostcodeSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get an address by providing the address, postcode, city. This
     * is a reeks level function.
     */
    public nl.webservices.www.soap.AddressReeksAddressSearchResponseType addressReeksAddressSearch(nl.webservices.www.soap.AddressReeksAddressSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look for an address by province, municipality, city, street,
     * house number and house number addition. Returns a list of matches.
     * This is a reeks level function.
     */
    public nl.webservices.www.soap.AddressReeksFullParameterSearchResponseType addressReeksFullParameterSearch(nl.webservices.www.soap.AddressReeksFullParameterSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look for an address by province, municipality, city, street,
     * house number and house number addition. Returns a list of matches.
     * This is a reeks level function.
     */
    public nl.webservices.www.soap.AddressReeksParameterSearchResponseType addressReeksParameterSearch(nl.webservices.www.soap.AddressReeksParameterSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look for an perceel address by simply providing a phrase such
     * as "Somestreet 123". Returns a list of matches. This is a perceel
     * level function (more accurate than reeks level).
     */
    public nl.webservices.www.soap.AddressPerceelPhraseSearchResponseType addressPerceelPhraseSearch(nl.webservices.www.soap.AddressPerceelPhraseSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look for an perceel address by province, municipality, city,
     * street, house number and house number addition. Returns a list of
     * matches This is a perceel level function (more accurate than reeks
     * level).
     */
    public nl.webservices.www.soap.AddressPerceelFullParameterSearchV2ResponseType addressPerceelFullParameterSearchV2(nl.webservices.www.soap.AddressPerceelFullParameterSearchV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all neighborhood codes in the province
     */
    public nl.webservices.www.soap.AddressProvinceListNeighborhoodsResponseType addressProvinceListNeighborhoods(nl.webservices.www.soap.AddressProvinceListNeighborhoodsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of municipalities which are in the specified
     * province
     */
    public nl.webservices.www.soap.AddressProvinceListDistrictsResponseType addressProvinceListDistricts(nl.webservices.www.soap.AddressProvinceListDistrictsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all provinces
     */
    public nl.webservices.www.soap.AddressProvinceListResponseType addressProvinceList(nl.webservices.www.soap.AddressProvinceListRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of provinces which match the given name
     */
    public nl.webservices.www.soap.AddressProvinceSearchResponseType addressProvinceSearch(nl.webservices.www.soap.AddressProvinceSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of municipalities which match the given name
     */
    public nl.webservices.www.soap.AddressDistrictSearchResponseType addressDistrictSearch(nl.webservices.www.soap.AddressDistrictSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of cities which are in the specified municipality
     */
    public nl.webservices.www.soap.AddressDistrictListCitiesResponseType addressDistrictListCities(nl.webservices.www.soap.AddressDistrictListCitiesRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all neighborhood codes in the municipality
     */
    public nl.webservices.www.soap.AddressDistrictListNeighborhoodsResponseType addressDistrictListNeighborhoods(nl.webservices.www.soap.AddressDistrictListNeighborhoodsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for all cities that match a phrase. Cities are also
     * matched if input matches a commonly used alternative city name. Exact
     * matches on the official name are listed first, the rest of the results
     * is sorted alphabetically.
     */
    public nl.webservices.www.soap.AddressCitySearchV2ResponseType addressCitySearchV2(nl.webservices.www.soap.AddressCitySearchV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all neighborhood codes in the city
     */
    public nl.webservices.www.soap.AddressCityListNeighborhoodsResponseType addressCityListNeighborhoods(nl.webservices.www.soap.AddressCityListNeighborhoodsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This is a deprecated function. Please use "addressPerceelFullParameterSearchV2"
     * instead.
     */
    public nl.webservices.www.soap.AddressPerceelFullParameterSearchResponseType addressPerceelFullParameterSearch(nl.webservices.www.soap.AddressPerceelFullParameterSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This is a deprecated function. Please use "addressPerceelFullParameterSearchV2"
     * or "addressPerceelPhraseSearch" instead.
     */
    public nl.webservices.www.soap.AddressPerceelParameterSearchResponseType addressPerceelParameterSearch(nl.webservices.www.soap.AddressPerceelParameterSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This function is deprecated and will not be available in the
     * future. Use "addressReeksAddressSearch" or "addressReeksFullParameterSearch"
     * instead.
     */
    public nl.webservices.www.soap.AddressReeksPhraseSearchResponseType addressReeksPhraseSearch(nl.webservices.www.soap.AddressReeksPhraseSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This function is about to be removed!
     */
    public nl.webservices.www.soap.AddressNeighborhoodNameResponseType addressNeighborhoodName(nl.webservices.www.soap.AddressNeighborhoodNameRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This function is about to be removed!
     */
    public nl.webservices.www.soap.AddressNeighborhoodPhraseSearchResponseType addressNeighborhoodPhraseSearch(nl.webservices.www.soap.AddressNeighborhoodPhraseSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the telephone area codes belonging to the neighborhood
     */
    public nl.webservices.www.soap.AreaCodeLookupResponseType areaCodeLookup(nl.webservices.www.soap.AreaCodeLookupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the neighborhood codes of the neighborhoods that have the
     * specified area code
     */
    public nl.webservices.www.soap.AreaCodeToNeighborhoodcodeResponseType areaCodeToNeighborhoodcode(nl.webservices.www.soap.AreaCodeToNeighborhoodcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the telephone areacodes related to a given postcode
     */
    public nl.webservices.www.soap.AreaCodePostcodeLookupResponseType areaCodePostcodeLookup(nl.webservices.www.soap.AreaCodePostcodeLookupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Logs the user in using username and password, returns a reactid
     * for authentication in further requests
     */
    public nl.webservices.www.soap.LoginResponseType login(nl.webservices.www.soap.LoginRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Logs the user out, destroys the session associated with the
     * reactid
     */
    public void logout() throws java.rmi.RemoteException;

    /**
     * Retrieve a Bovag member using a Bovag identifier.
     */
    public nl.webservices.www.soap.BovagGetMemberByBovagIdResponseType bovagGetMemberByBovagId(nl.webservices.www.soap.BovagGetMemberByBovagIdRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Bovag member using a DutchBusiness identifiers.
     */
    public nl.webservices.www.soap.BovagGetMemberByDutchBusinessResponseType bovagGetMemberByDutchBusiness(nl.webservices.www.soap.BovagGetMemberByDutchBusinessRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve the establishment number (Dutch 'Vestigingsnummer')
     * for a business.
     */
    public nl.webservices.www.soap.BusinessGetEstablishmentNumberResponseType businessGetEstablishmentNumber(nl.webservices.www.soap.BusinessGetEstablishmentNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a BIK ('Bedrijfsindeling kamers van koophandel') code,
     * which is the type of code returned in a  <BusinessDossier> as the
     * Primary or Secondary activity code. The description for all levels
     * of the BIK code is returned, even if the full length BIK code does
     * not exist. Descriptions of the section associated with the BIK code
     * is also returned.
     */
    public nl.webservices.www.soap.BusinessGetBIKDescriptionResponseType businessGetBIKDescription(nl.webservices.www.soap.BusinessGetBIKDescriptionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a SBI ('Standaard Bedrijfs Indeling 2008') code.
     */
    public nl.webservices.www.soap.BusinessGetSBIDescriptionResponseType businessGetSBIDescription(nl.webservices.www.soap.BusinessGetSBIDescriptionRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.BusinessBIKToSBIResponseType businessBIKToSBI(nl.webservices.www.soap.BusinessBIKToSBIRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.BusinessSBIToBIKResponseType businessSBIToBIK(nl.webservices.www.soap.BusinessSBIToBIKRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business Dossier. The subdossierno parameter can
     * be left empty to get all Sub Dossiers of one Dossier.
     */
    public nl.webservices.www.soap.BusinessGetDossierV3ResponseType businessGetDossierV3(nl.webservices.www.soap.BusinessGetDossierV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up an extended business Dossier.
     */
    public nl.webservices.www.soap.BusinessGetDossierExtendedResponseType businessGetDossierExtended(nl.webservices.www.soap.BusinessGetDossierExtendedRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business using its dossier number.
     */
    public nl.webservices.www.soap.BusinessSearchDossierNumberResponseType businessSearchDossierNumber(nl.webservices.www.soap.BusinessSearchDossierNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business using its postcode address. nbcode is required,
     * other parameters may be left empty.
     */
    public nl.webservices.www.soap.BusinessSearchPostcodeResponseType businessSearchPostcode(nl.webservices.www.soap.BusinessSearchPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Lookup a business using its address. Specified parameters are
     * compared against both establishment and correspondence addresses to
     * find a match. Parameters may be left empty.
     */
    public nl.webservices.www.soap.BusinessSearchAddressResponseType businessSearchAddress(nl.webservices.www.soap.BusinessSearchAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Lookup a business using its name.
     */
    public nl.webservices.www.soap.BusinessSearchNameResponseType businessSearchName(nl.webservices.www.soap.BusinessSearchNameRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business by a number of parameters. At least a tradename,
     * neighborhood code, street, city or telephone number is required. Lookups
     * based on postbus address are possible by specifying streetname "Postbus"
     * and specifying the postbus number in the houseno parameter. Specified
     * address parameters are compared against both establishment and correspondence
     * addresses to find a match.
     */
    public nl.webservices.www.soap.BusinessSearchParametersResponseType businessSearchParameters(nl.webservices.www.soap.BusinessSearchParametersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business by a number of parameters. At least a tradename,
     * neighborhood code, street, city or telephone number is required. Lookups
     * based on postbus address are possible by specifying streetname "Postbus"
     * and specifying the postbus number in the houseno parameter. Specified
     * address parameters are compared against both establishment and correspondence
     * addresses to find a match.
     */
    public nl.webservices.www.soap.BusinessSearchParametersV3ResponseType businessSearchParametersV3(nl.webservices.www.soap.BusinessSearchParametersV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business using its location and SBI code.
     */
    public nl.webservices.www.soap.BusinessSearchSelectionResponseType businessSearchSelection(nl.webservices.www.soap.BusinessSearchSelectionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business using its location and SBI code.
     */
    public nl.webservices.www.soap.BusinessSearchSelectionV2ResponseType businessSearchSelectionV2(nl.webservices.www.soap.BusinessSearchSelectionV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the SBI codes and their descriptions for a dossier.
     */
    public nl.webservices.www.soap.BusinessGetDossierSBIResponseType businessGetDossierSBI(nl.webservices.www.soap.BusinessGetDossierSBIRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.BusinessUpdateCheckDossierResponseType businessUpdateCheckDossier(nl.webservices.www.soap.BusinessUpdateCheckDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve dossier numbers for all dossiers changed since the
     * given date.
     */
    public nl.webservices.www.soap.BusinessUpdateGetChangedDossiersResponseType businessUpdateGetChangedDossiers(nl.webservices.www.soap.BusinessUpdateGetChangedDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all dossiers that have been updated since
     * they were last retrieved by the user
     */
    public nl.webservices.www.soap.BusinessUpdateGetDossiersResponseType businessUpdateGetDossiers(nl.webservices.www.soap.BusinessUpdateGetDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Add a dossier to the list of dossiers for which the user (the
     * user whose credentials are used to make the call) wants to receive
     * updates
     */
    public nl.webservices.www.soap.BusinessUpdateAddDossierResponseType businessUpdateAddDossier(nl.webservices.www.soap.BusinessUpdateAddDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Remove a dossier from the list of dossiers for which the user
     * (the user whose credentials are used to make the call) wants to receive
     * updates.
     */
    public nl.webservices.www.soap.BusinessUpdateRemoveDossierResponseType businessUpdateRemoveDossier(nl.webservices.www.soap.BusinessUpdateRemoveDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business by a number of parameters. At least a tradename,
     * neighborhood code, street, city or telephone number is required. Lookups
     * based on postbus address are possible by specifying streetname "Postbus"
     * and specifying the postbus number in the houseno parameter. Specified
     * address parameters are compared against both establishment and correspondence
     * addresses to find a match.
     */
    public nl.webservices.www.soap.BusinessSearchParametersV2ResponseType businessSearchParametersV2(nl.webservices.www.soap.BusinessSearchParametersV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Check the validity of a license plate and check code ('meldcode')
     * combination
     */
    public nl.webservices.www.soap.CarRDWCarCheckCodeResponseType carRDWCarCheckCode(nl.webservices.www.soap.CarRDWCarCheckCodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieves data of a car with a Dutch license plate, including
     * a list of types matched if more information is available.
     */
    public nl.webservices.www.soap.CarRDWCarDataV3ResponseType carRDWCarDataV3(nl.webservices.www.soap.CarRDWCarDataV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a specific Dutch car's data, including BPM and power and
     * types
     */
    public nl.webservices.www.soap.CarRDWCarDataBPV2ResponseType carRDWCarDataBPV2(nl.webservices.www.soap.CarRDWCarDataBPV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a specific Dutch car's data, including European Approval
     * Mark
     */
    public nl.webservices.www.soap.CarRDWCarDataExtendedResponseType carRDWCarDataExtended(nl.webservices.www.soap.CarRDWCarDataExtendedRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieves data of a car with a Dutch license plate, including
     * catalog price.
     */
    public nl.webservices.www.soap.CarRDWCarDataPriceResponseType carRDWCarDataPrice(nl.webservices.www.soap.CarRDWCarDataPriceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a specific Dutch car's data, including information about
     * extra options
     */
    public nl.webservices.www.soap.CarRDWCarDataOptionsResponseType carRDWCarDataOptions(nl.webservices.www.soap.CarRDWCarDataOptionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Check the validity of a license plate and check code ('meldcode')
     * combination
     */
    public nl.webservices.www.soap.CarVWEMeldcodeCheckResponseType carVWEMeldcodeCheck(nl.webservices.www.soap.CarVWEMeldcodeCheckRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEBasicTypeDataResponseType carVWEBasicTypeData(nl.webservices.www.soap.CarVWEBasicTypeDataRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEVersionPriceResponseType carVWEVersionPrice(nl.webservices.www.soap.CarVWEVersionPriceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve options of a specific model of a car
     */
    public nl.webservices.www.soap.CarVWEOptionsResponseType carVWEOptions(nl.webservices.www.soap.CarVWEOptionsRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEListBrandsResponseType carVWEListBrands(nl.webservices.www.soap.CarVWEListBrandsRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEListModelsResponseType carVWEListModels(nl.webservices.www.soap.CarVWEListModelsRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEListVersionsResponseType carVWEListVersions(nl.webservices.www.soap.CarVWEListVersionsRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CarVWEVersionYearDataResponseType carVWEVersionYearData(nl.webservices.www.soap.CarVWEVersionYearDataRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve photos of a specific model of a car
     */
    public nl.webservices.www.soap.CarVWEPhotosResponseType carVWEPhotos(nl.webservices.www.soap.CarVWEPhotosRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve Autodisk price information
     */
    public nl.webservices.www.soap.CarATDPriceResponseType carATDPrice(nl.webservices.www.soap.CarATDPriceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a specific Dutch car's data
     */
    public nl.webservices.www.soap.CarRDWCarDataResponseType carRDWCarData(nl.webservices.www.soap.CarRDWCarDataRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieves data of a car with a Dutch license plate, including
     * a list of types matched if more information is available.
     */
    public nl.webservices.www.soap.CarRDWCarDataV2ResponseType carRDWCarDataV2(nl.webservices.www.soap.CarRDWCarDataV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a specific Dutch car's data, including BPM and power
     */
    public nl.webservices.www.soap.CarRDWCarDataBPResponseType carRDWCarDataBP(nl.webservices.www.soap.CarRDWCarDataBPRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CreditsafeGetReportFullResponseType creditsafeGetReportFull(nl.webservices.www.soap.CreditsafeGetReportFullRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CreditsafeSearchResponseType creditsafeSearch(nl.webservices.www.soap.CreditsafeSearchRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CreditsafeMonitorAddCompanyResponseType creditsafeMonitorAddCompany(nl.webservices.www.soap.CreditsafeMonitorAddCompanyRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CreditsafeMonitorRemoveCompanyResponseType creditsafeMonitorRemoveCompany(nl.webservices.www.soap.CreditsafeMonitorRemoveCompanyRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.CreditsafeMonitorGetUpdatedCompaniesResponseType creditsafeMonitorGetUpdatedCompanies(nl.webservices.www.soap.CreditsafeMonitorGetUpdatedCompaniesRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business and return basic information about the business.
     */
    public nl.webservices.www.soap.DnbSearchReferenceV2ResponseType dnbSearchReferenceV2(nl.webservices.www.soap.DnbSearchReferenceV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a DNBBusinessReference with name, address and D&B
     * business key for a specific business.
     */
    public nl.webservices.www.soap.DnbGetReferenceResponseType dnbGetReference(nl.webservices.www.soap.DnbGetReferenceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve basic WorldBase business information
     */
    public nl.webservices.www.soap.DnbWorldbaseMarketingResponseType dnbWorldbaseMarketing(nl.webservices.www.soap.DnbWorldbaseMarketingRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve detailed WorldBase business information
     */
    public nl.webservices.www.soap.DnbWorldbaseMarketingPlusResponseType dnbWorldbaseMarketingPlus(nl.webservices.www.soap.DnbWorldbaseMarketingPlusRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Detailed WorldBase information, including information on a
     * business' family tree
     */
    public nl.webservices.www.soap.DnbWorldbaseMarketingPlusLinkageResponseType dnbWorldbaseMarketingPlusLinkage(nl.webservices.www.soap.DnbWorldbaseMarketingPlusLinkageRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Do a D&B Quick Check on a business.
     */
    public nl.webservices.www.soap.DnbQuickCheckResponseType dnbQuickCheck(nl.webservices.www.soap.DnbQuickCheckRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Do a D&B Business Verification on a business.
     */
    public nl.webservices.www.soap.DnbBusinessVerificationResponseType dnbBusinessVerification(nl.webservices.www.soap.DnbBusinessVerificationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve D&B Enterprise Management for a business.
     */
    public nl.webservices.www.soap.DnbEnterpriseManagementResponseType dnbEnterpriseManagement(nl.webservices.www.soap.DnbEnterpriseManagementRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a business and return basic information about the business.
     */
    public nl.webservices.www.soap.DnbSearchReferenceResponseType dnbSearchReference(nl.webservices.www.soap.DnbSearchReferenceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Given two neighborhood codes, the drive distance in meters
     * between the neighborhoodsis returned, for both the fastest and the
     * shortest route
     */
    public nl.webservices.www.soap.DriveInfoDistanceLookupResponseType driveInfoDistanceLookup(nl.webservices.www.soap.DriveInfoDistanceLookupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Given two neighborhood codes, the drivetime in minutes between
     * the neighborhoods is returned, for both the fastest and the shortest
     * route
     */
    public nl.webservices.www.soap.DriveInfoTimeLookupResponseType driveInfoTimeLookup(nl.webservices.www.soap.DriveInfoTimeLookupRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Validate and complete an address based on postcode and house
     * number.
     */
    public nl.webservices.www.soap.DutchAddressRangePostcodeSearchResponseType dutchAddressRangePostcodeSearch(nl.webservices.www.soap.DutchAddressRangePostcodeSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetDossierResponseType dutchBusinessGetDossier(nl.webservices.www.soap.DutchBusinessGetDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetDossierV2ResponseType dutchBusinessGetDossierV2(nl.webservices.www.soap.DutchBusinessGetDossierV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetDossierV3ResponseType dutchBusinessGetDossierV3(nl.webservices.www.soap.DutchBusinessGetDossierV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetVatNumberResponseType dutchBusinessGetVatNumber(nl.webservices.www.soap.DutchBusinessGetVatNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve position data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetPositionsResponseType dutchBusinessGetPositions(nl.webservices.www.soap.DutchBusinessGetPositionsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve legal entity data on a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessGetLegalEntityResponseType dutchBusinessGetLegalEntity(nl.webservices.www.soap.DutchBusinessGetLegalEntityRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve the organization tree of a company
     */
    public nl.webservices.www.soap.DutchBusinessGetOrganizationTreeResponseType dutchBusinessGetOrganizationTree(nl.webservices.www.soap.DutchBusinessGetOrganizationTreeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for business establishments using a known identifier
     */
    public nl.webservices.www.soap.DutchBusinessSearchDossierNumberResponseType dutchBusinessSearchDossierNumber(nl.webservices.www.soap.DutchBusinessSearchDossierNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments using a variety of parameters
     */
    public nl.webservices.www.soap.DutchBusinessSearchParametersV2ResponseType dutchBusinessSearchParametersV2(nl.webservices.www.soap.DutchBusinessSearchParametersV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments using a variety of parameters
     */
    public nl.webservices.www.soap.DutchBusinessSearchResponseType dutchBusinessSearch(nl.webservices.www.soap.DutchBusinessSearchRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for business establishments using a known identifier
     */
    public nl.webservices.www.soap.DutchBusinessSearchEstablishmentsResponseType dutchBusinessSearchEstablishments(nl.webservices.www.soap.DutchBusinessSearchEstablishmentsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments based on postcode and house number
     */
    public nl.webservices.www.soap.DutchBusinessSearchPostcodeResponseType dutchBusinessSearchPostcode(nl.webservices.www.soap.DutchBusinessSearchPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for businesses matching all of the given criteria.
     */
    public nl.webservices.www.soap.DutchBusinessSearchSelectionResponseType dutchBusinessSearchSelection(nl.webservices.www.soap.DutchBusinessSearchSelectionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Look up a SBI ('Standaard Bedrijfs Indeling 2008') code.
     */
    public nl.webservices.www.soap.DutchBusinessGetSBIDescriptionResponseType dutchBusinessGetSBIDescription(nl.webservices.www.soap.DutchBusinessGetSBIDescriptionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractDocumentResponseType dutchBusinessGetExtractDocument(nl.webservices.www.soap.DutchBusinessGetExtractDocumentRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataResponseType dutchBusinessGetExtractDocumentData(nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataV2ResponseType dutchBusinessGetExtractDocumentDataV2(nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataV3ResponseType dutchBusinessGetExtractDocumentDataV3(nl.webservices.www.soap.DutchBusinessGetExtractDocumentDataV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetLegalExtractDocumentDataV2ResponseType dutchBusinessGetLegalExtractDocumentDataV2(nl.webservices.www.soap.DutchBusinessGetLegalExtractDocumentDataV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetLegalExtractDocumentDataV3ResponseType dutchBusinessGetLegalExtractDocumentDataV3(nl.webservices.www.soap.DutchBusinessGetLegalExtractDocumentDataV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a list of extract document references
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryResponseType dutchBusinessGetExtractHistory(nl.webservices.www.soap.DutchBusinessGetExtractHistoryRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a list of extract document references
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryChangedResponseType dutchBusinessGetExtractHistoryChanged(nl.webservices.www.soap.DutchBusinessGetExtractHistoryChangedRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataResponseType dutchBusinessGetExtractHistoryDocumentData(nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV2ResponseType dutchBusinessGetExtractHistoryDocumentDataV2(nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV3ResponseType dutchBusinessGetExtractHistoryDocumentDataV3(nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV3ByDossierResponseType dutchBusinessGetExtractHistoryDocumentDataV3ByDossier(nl.webservices.www.soap.DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get a list of logged updates for a specific business dossier
     */
    public nl.webservices.www.soap.DutchBusinessGetDossierHistoryResponseType dutchBusinessGetDossierHistory(nl.webservices.www.soap.DutchBusinessGetDossierHistoryRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get a paged result of all the dossier the logged on user is
     * subscribed to.
     */
    public nl.webservices.www.soap.DutchBusinessUpdateGetOverviewResponseType dutchBusinessUpdateGetOverview(nl.webservices.www.soap.DutchBusinessUpdateGetOverviewRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information on the last change of a business establishment
     */
    public nl.webservices.www.soap.DutchBusinessUpdateCheckDossierResponseType dutchBusinessUpdateCheckDossier(nl.webservices.www.soap.DutchBusinessUpdateCheckDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve all dossiers changed since the given date.
     */
    public nl.webservices.www.soap.DutchBusinessUpdateGetChangedDossiersResponseType dutchBusinessUpdateGetChangedDossiers(nl.webservices.www.soap.DutchBusinessUpdateGetChangedDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all dossiers that have been updated since
     * they were last retrieved by the user
     */
    public nl.webservices.www.soap.DutchBusinessUpdateGetDossiersResponseType dutchBusinessUpdateGetDossiers(nl.webservices.www.soap.DutchBusinessUpdateGetDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Add a dossier to the list of dossiers for which the user (the
     * user whose credentials are used to make the call) wants to receive
     * updates
     */
    public nl.webservices.www.soap.DutchBusinessUpdateAddDossierResponseType dutchBusinessUpdateAddDossier(nl.webservices.www.soap.DutchBusinessUpdateAddDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Remove a dossier from the list of dossiers for which the user
     * (the user whose credentials are used to make the call) wants to receive
     * updates.
     */
    public nl.webservices.www.soap.DutchBusinessUpdateRemoveDossierResponseType dutchBusinessUpdateRemoveDossier(nl.webservices.www.soap.DutchBusinessUpdateRemoveDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments using a variety of parameters
     */
    public nl.webservices.www.soap.DutchBusinessSearchParametersResponseType dutchBusinessSearchParameters(nl.webservices.www.soap.DutchBusinessSearchParametersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the information of a dutch vehicle
     */
    public nl.webservices.www.soap.DutchVehicleGetVehicleV2ResponseType dutchVehicleGetVehicleV2(nl.webservices.www.soap.DutchVehicleGetVehicleV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the price information of a dutch vehicle
     */
    public nl.webservices.www.soap.DutchVehicleGetPurchaseReferenceResponseType dutchVehicleGetPurchaseReference(nl.webservices.www.soap.DutchVehicleGetPurchaseReferenceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get all the (previous) owners of a dutch vehicle
     */
    public nl.webservices.www.soap.DutchVehicleGetOwnerHistoryResponseType dutchVehicleGetOwnerHistory(nl.webservices.www.soap.DutchVehicleGetOwnerHistoryRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get all the current market value of a vehicle
     */
    public nl.webservices.www.soap.DutchVehicleGetMarketValueResponseType dutchVehicleGetMarketValue(nl.webservices.www.soap.DutchVehicleGetMarketValueRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get the information of a dutch vehicle
     */
    public nl.webservices.www.soap.DutchVehicleGetVehicleResponseType dutchVehicleGetVehicle(nl.webservices.www.soap.DutchVehicleGetVehicleRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Provides a credit score for a person identified by a set of
     * parameters.
     */
    public nl.webservices.www.soap.EdrGetScoreResponseType edrGetScore(nl.webservices.www.soap.EdrGetScoreRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates in the RD system of the neighborhood,
     * given the neighborhood code
     */
    public nl.webservices.www.soap.GeoLocationNeighborhoodCoordinatesRDResponseType geoLocationNeighborhoodCoordinatesRD(nl.webservices.www.soap.GeoLocationNeighborhoodCoordinatesRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given postcode in the RD system.
     */
    public nl.webservices.www.soap.GeoLocationPostcodeCoordinatesRDResponseType geoLocationPostcodeCoordinatesRD(nl.webservices.www.soap.GeoLocationPostcodeCoordinatesRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates in degrees of latitude/longitude of
     * the neighborhood, given the neighborhood code
     */
    public nl.webservices.www.soap.GeoLocationNeighborhoodCoordinatesLatLonResponseType geoLocationNeighborhoodCoordinatesLatLon(nl.webservices.www.soap.GeoLocationNeighborhoodCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given postcode in degrees of
     * latitude/longitude.
     */
    public nl.webservices.www.soap.GeoLocationPostcodeCoordinatesLatLonResponseType geoLocationPostcodeCoordinatesLatLon(nl.webservices.www.soap.GeoLocationPostcodeCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given address in degrees of
     * latitude/longitude. Address may be specified by postcode + house number
     * or by city + street + house number.
     */
    public nl.webservices.www.soap.GeoLocationAddressCoordinatesLatLonResponseType geoLocationAddressCoordinatesLatLon(nl.webservices.www.soap.GeoLocationAddressCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given address in the RD system.
     * Address may be specified by postcode + house number or by city + street
     * + house number.
     */
    public nl.webservices.www.soap.GeoLocationAddressCoordinatesRDResponseType geoLocationAddressCoordinatesRD(nl.webservices.www.soap.GeoLocationAddressCoordinatesRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the postcode of the address closest to the specified
     * latitude/longitude coordinate in the Netherlands.
     */
    public nl.webservices.www.soap.GeoLocationLatLonToPostcodeResponseType geoLocationLatLonToPostcode(nl.webservices.www.soap.GeoLocationLatLonToPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the address closest to the specified latitude/longitude
     * coordinate in the Netherlands. The returned x, y, latitude and logitude
     * values are the coordinates of the retrieved address. Distance is the
     * distance between these coordinates and the input coordinate in meters
     */
    public nl.webservices.www.soap.GeoLocationLatLonToAddressV2ResponseType geoLocationLatLonToAddressV2(nl.webservices.www.soap.GeoLocationLatLonToAddressV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the postcode of the address closest to the specified
     * Rijksdriehoeksmeting coordinate in the Netherlands.
     */
    public nl.webservices.www.soap.GeoLocationRDToPostcodeResponseType geoLocationRDToPostcode(nl.webservices.www.soap.GeoLocationRDToPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the address closest to the specified Rijksdriehoeksmeting
     * coordinate in the Netherlands. The returned x, y, latitude and logitude
     * values are the coordinates of the retrieved address. Distance is the
     * distance between these coordinates and the input coordinate in meters
     */
    public nl.webservices.www.soap.GeoLocationRDToAddressV2ResponseType geoLocationRDToAddressV2(nl.webservices.www.soap.GeoLocationRDToAddressV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given postcode in degrees of
     * latitude/longitude. Most countries are supported in the function.
     * Accuracy of the result may vary between countries.
     */
    public nl.webservices.www.soap.GeoLocationInternationalPostcodeCoordinatesLatLonResponseType geoLocationInternationalPostcodeCoordinatesLatLon(nl.webservices.www.soap.GeoLocationInternationalPostcodeCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given address in degrees of
     * latitude/longitude. Most countries are supported in the function.
     * Accuracy of the result may vary between countries. Since the street
     * and city have to contain the complete name and since this method acts
     * with international data, we recommend to use <geoLocationInternationalPostcodeCoordinatesLatLon>
     * if you know the postcode, since working with postcodes is less error
     * prone.
     */
    public nl.webservices.www.soap.GeoLocationInternationalAddressCoordinatesLatLonResponseType geoLocationInternationalAddressCoordinatesLatLon(nl.webservices.www.soap.GeoLocationInternationalAddressCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given address in degrees of
     * latitude/longitude. Most countries are supported in the function.
     * Accuracy of the result may vary between countries.
     */
    public nl.webservices.www.soap.GeoLocationInternationalAddressCoordinatesLatLonV2ResponseType geoLocationInternationalAddressCoordinatesLatLonV2(nl.webservices.www.soap.GeoLocationInternationalAddressCoordinatesLatLonV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the address closest to the specified latitude/longitude
     * coordinate. The returned latitude and logitude values make up the
     * coordinate of the retrieved address. Distance is the distance between
     * this coordinate and the input coordinate in meters
     */
    public nl.webservices.www.soap.GeoLocationInternationalLatLonToAddressResponseType geoLocationInternationalLatLonToAddress(nl.webservices.www.soap.GeoLocationInternationalLatLonToAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the estimated distance in meters (in a direct line)
     * between the two neighborhoods, given the neighborhood codes
     */
    public nl.webservices.www.soap.GeoLocationNeighborhoodDistanceResponseType geoLocationNeighborhoodDistance(nl.webservices.www.soap.GeoLocationNeighborhoodDistanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the estimated distance in meters (in a direct line)
     * between the two postcodes.
     */
    public nl.webservices.www.soap.GeoLocationPostcodeDistanceResponseType geoLocationPostcodeDistance(nl.webservices.www.soap.GeoLocationPostcodeDistanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the distance in meters (in a direct line) between two
     * latitude/longitude coordinates
     */
    public nl.webservices.www.soap.GeoLocationHaversineDistanceResponseType geoLocationHaversineDistance(nl.webservices.www.soap.GeoLocationHaversineDistanceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the neighborhood codes list sorted in order of increasing
     * distance from a given neighborhood.
     */
    public nl.webservices.www.soap.GeoLocationDistanceSortedNeighborhoodCodesResponseType geoLocationDistanceSortedNeighborhoodCodes(nl.webservices.www.soap.GeoLocationDistanceSortedNeighborhoodCodesRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the neighborhood codes list sorted in order of increasing
     * distance from a given neighborhood, within a given radius (in meters).
     */
    public nl.webservices.www.soap.GeoLocationDistanceSortedNeighborhoodCodesRadiusResponseType geoLocationDistanceSortedNeighborhoodCodesRadius(nl.webservices.www.soap.GeoLocationDistanceSortedNeighborhoodCodesRadiusRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of postcodes sorted in order of increasing distance
     * from a given postcode, within a given radius (in meters). If the radius
     * is larger than 1500 meters, the result will be based on neighborhood
     * codes
     */
    public nl.webservices.www.soap.GeoLocationDistanceSortedPostcodesRadiusResponseType geoLocationDistanceSortedPostcodesRadius(nl.webservices.www.soap.GeoLocationDistanceSortedPostcodesRadiusRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a given postcode list sorted in order of increasingdistance
     * from a given postcode.
     */
    public nl.webservices.www.soap.GeoLocationDistanceSortedPostcodesResponseType geoLocationDistanceSortedPostcodes(nl.webservices.www.soap.GeoLocationDistanceSortedPostcodesRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Convert a latitude/longitude coordinate to a RD ('Rijksdriehoeksmeting')
     * coordinate.
     */
    public nl.webservices.www.soap.GeoLocationLatLonToRDResponseType geoLocationLatLonToRD(nl.webservices.www.soap.GeoLocationLatLonToRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Convert a RD ('Rijksdriehoeksmeting') coordinate to a latitude/longitude
     * coordinate.
     */
    public nl.webservices.www.soap.GeoLocationRDToLatLonResponseType geoLocationRDToLatLon(nl.webservices.www.soap.GeoLocationRDToLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Graydon credit report of a company registered in
     * the Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditGetReportResponseType graydonCreditGetReport(nl.webservices.www.soap.GraydonCreditGetReportRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search international Graydon credit report databases for a
     * company using an identifier.
     */
    public nl.webservices.www.soap.GraydonCreditSearchIdentificationResponseType graydonCreditSearchIdentification(nl.webservices.www.soap.GraydonCreditSearchIdentificationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search international Graydon credit report database for a company
     * by name.
     */
    public nl.webservices.www.soap.GraydonCreditSearchNameResponseType graydonCreditSearchName(nl.webservices.www.soap.GraydonCreditSearchNameRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search international Graydon credit report database for a company
     * using postcode.
     */
    public nl.webservices.www.soap.GraydonCreditSearchPostcodeResponseType graydonCreditSearchPostcode(nl.webservices.www.soap.GraydonCreditSearchPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Graydon pd ratings and credit flag of a company
     * registered in the Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditQuickscanResponseType graydonCreditQuickscan(nl.webservices.www.soap.GraydonCreditQuickscanRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve various Graydon credit ratings of a company registered
     * in the Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditRatingsResponseType graydonCreditRatings(nl.webservices.www.soap.GraydonCreditRatingsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve the BTW (VAT) number of a company registered in the
     * Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditVatNumberResponseType graydonCreditVatNumber(nl.webservices.www.soap.GraydonCreditVatNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve top-parent, parent and sibling companies of a company
     * registered in the Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditCompanyLiaisonsResponseType graydonCreditCompanyLiaisons(nl.webservices.www.soap.GraydonCreditCompanyLiaisonsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve company management credit scores of a company registered
     * in the Netherlands.
     */
    public nl.webservices.www.soap.GraydonCreditManagementResponseType graydonCreditManagement(nl.webservices.www.soap.GraydonCreditManagementRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Fetch a insolvency case from a given publication.
     */
    public nl.webservices.www.soap.InsolvencyGetCaseByPublicationResponseType insolvencyGetCaseByPublication(nl.webservices.www.soap.InsolvencyGetCaseByPublicationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for insolvency publication for a business
     */
    public nl.webservices.www.soap.InsolvencySearchPublicationsByCoCNumberResponseType insolvencySearchPublicationsByCoCNumber(nl.webservices.www.soap.InsolvencySearchPublicationsByCoCNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for insolvency publication for a person
     */
    public nl.webservices.www.soap.InsolvencySearchPublicationsByPersonResponseType insolvencySearchPublicationsByPerson(nl.webservices.www.soap.InsolvencySearchPublicationsByPersonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns up to 20 suggestions of valid addresses using the partial
     * or full address data given. Returns more data than internationalAddressSearch.
     */
    public nl.webservices.www.soap.InternationalAddressSearchV2ResponseType internationalAddressSearchV2(nl.webservices.www.soap.InternationalAddressSearchV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns up to 20 suggestions of valid addresses using the partial
     * or full address data given. Returns more data than internationalAddressSearch.
     */
    public nl.webservices.www.soap.InternationalAddressSearchInteractiveResponseType internationalAddressSearchInteractive(nl.webservices.www.soap.InternationalAddressSearchInteractiveRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the coordinates of the given address in both the RD
     * system and the latitude/longitude system. The lat/lon coordinates
     * are derived from the RD coordinates.The address may be specified by
     * giving the postcode, house number & house number addition or by giving
     * the cityname, streetname, house number & house number addition.
     */
    public nl.webservices.www.soap.KadasterAddressCoordinatesResponseType kadasterAddressCoordinates(nl.webservices.www.soap.KadasterAddressCoordinatesRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by parcel details. Returns the result
     * in a file of the specified format. If the input matches more than
     * one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtDocumentPerceelResponseType kadasterEigendomsBerichtDocumentPerceel(nl.webservices.www.soap.KadasterEigendomsBerichtDocumentPerceelRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by postcode and house number. Returns
     * the result in a file of the specified format. If the input matches
     * more than one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtDocumentPostcodeResponseType kadasterEigendomsBerichtDocumentPostcode(nl.webservices.www.soap.KadasterEigendomsBerichtDocumentPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by parcel details. Returns the result
     * as a <BerichtObjectResultaatV2>. In addition to the structured result,
     * a file of the specified format is returned. If the input matches more
     * than one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtPerceelV2ResponseType kadasterEigendomsBerichtPerceelV2(nl.webservices.www.soap.KadasterEigendomsBerichtPerceelV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by postcode and house number. Returns
     * the result as a <BerichtObjectResultaatV2>. In addition to the structured
     * result, a file of the specified format is returned. If the input matches
     * more than one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtPostcodeV2ResponseType kadasterEigendomsBerichtPostcodeV2(nl.webservices.www.soap.KadasterEigendomsBerichtPostcodeV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a koopsommenoverzicht (in English: real estate transactions
     * overview), which is a list of all transactions of the past five years
     * in the given postcode range.
     */
    public nl.webservices.www.soap.KadasterKoopsommenOverzichtV2ResponseType kadasterKoopsommenOverzichtV2(nl.webservices.www.soap.KadasterKoopsommenOverzichtV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Uittreksel Kadastrale Kaart' (a map showing the
     * boundaries of a parcel and buildings on that parcel) in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelV3ResponseType kadasterUittrekselKadastraleKaartPerceelV3(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Uittreksel Kadastrale Kaart' (a map showing the
     * boundaries of a parcel and buildings on that parcel) in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeV3ResponseType kadasterUittrekselKadastraleKaartPostcodeV3(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Kadata WMS De Kadastrale Kaart' map in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterKadastraleKaartPerceelV2ResponseType kadasterKadastraleKaartPerceelV2(nl.webservices.www.soap.KadasterKadastraleKaartPerceelV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Kadata WMS De Kadastrale Kaart' map in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterKadastraleKaartPostcodeV2ResponseType kadasterKadastraleKaartPostcodeV2(nl.webservices.www.soap.KadasterKadastraleKaartPostcodeV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by postcode and house number.
     * If the input matches more than one parcel, a list of the parcels found
     * is returned instead.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeV3ResponseType kadasterHypothecairBerichtPostcodeV3(nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by parcel details.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPerceelV3ResponseType kadasterHypothecairBerichtPerceelV3(nl.webservices.www.soap.KadasterHypothecairBerichtPerceelV3RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'brondocument', a document which is the basis for an
     * ascription.
     */
    public nl.webservices.www.soap.KadasterBronDocumentResponseType kadasterBronDocument(nl.webservices.www.soap.KadasterBronDocumentRequestType parameters) throws java.rmi.RemoteException;
    public nl.webservices.www.soap.KadasterValueListGetRangesResponseType kadasterValueListGetRanges() throws java.rmi.RemoteException;
    public nl.webservices.www.soap.KadasterValueListGetMunicipalitiesResponseType kadasterValueListGetMunicipalities() throws java.rmi.RemoteException;

    /**
     * This function is deprecated and will not be available in the
     * future. Use "kadasterUittrekselKadastraleKaartPerceelV2" instead.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelResponseType kadasterUittrekselKadastraleKaartPerceel(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelRequestType parameters) throws java.rmi.RemoteException;

    /**
     * This function is deprecated and will not be available in the
     * future. Use "kadasterUittrekselKadastraleKaartPostcodeV2" instead.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeResponseType kadasterUittrekselKadastraleKaartPostcode(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by postcode and house number.
     * If the input matches more than one parcel, a list of the parcels found
     * is returned instead.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeResponseType kadasterHypothecairBerichtPostcode(nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by parcel details.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPerceelResponseType kadasterHypothecairBerichtPerceel(nl.webservices.www.soap.KadasterHypothecairBerichtPerceelRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by parcel details. Returns the result
     * as a <BerichtObjectResultaat>. In addition to the structured result,
     * a file of the specified format is returned. If the input matches more
     * than one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtPerceelResponseType kadasterEigendomsBerichtPerceel(nl.webservices.www.soap.KadasterEigendomsBerichtPerceelRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Eigendomsbericht' by postcode and house number. Returns
     * the result as a <BerichtObjectResultaat>. In addition to the structured
     * result, a file of the specified format is returned. If the input matches
     * more than one parcel, a list of the parcels found is returned instead.
     */
    public nl.webservices.www.soap.KadasterEigendomsBerichtPostcodeResponseType kadasterEigendomsBerichtPostcode(nl.webservices.www.soap.KadasterEigendomsBerichtPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Uittreksel Kadastrale Kaart' (a map showing the
     * boundaries of a parcel and buildings on that parcel) in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelV2ResponseType kadasterUittrekselKadastraleKaartPerceelV2(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPerceelV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Uittreksel Kadastrale Kaart' (a map showing the
     * boundaries of a parcel and buildings on that parcel) in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeV2ResponseType kadasterUittrekselKadastraleKaartPostcodeV2(nl.webservices.www.soap.KadasterUittrekselKadastraleKaartPostcodeV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Kadata WMS De Kadastrale Kaart' map in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterKadastraleKaartPerceelResponseType kadasterKadastraleKaartPerceel(nl.webservices.www.soap.KadasterKadastraleKaartPerceelRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a 'Kadata WMS De Kadastrale Kaart' map in the specified
     * format.
     */
    public nl.webservices.www.soap.KadasterKadastraleKaartPostcodeResponseType kadasterKadastraleKaartPostcode(nl.webservices.www.soap.KadasterKadastraleKaartPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by postcode and house number.
     * If the input matches more than one parcel, a list of the parcels found
     * is returned instead.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeV2ResponseType kadasterHypothecairBerichtPostcodeV2(nl.webservices.www.soap.KadasterHypothecairBerichtPostcodeV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find a 'Hypothecair bericht' by parcel details.
     */
    public nl.webservices.www.soap.KadasterHypothecairBerichtPerceelV2ResponseType kadasterHypothecairBerichtPerceelV2(nl.webservices.www.soap.KadasterHypothecairBerichtPerceelV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a koopsommenoverzicht (in English: real estate transactions
     * overview), which is a list of all transactions of the past five years
     * in the given postcode range.
     */
    public nl.webservices.www.soap.KadasterKoopsommenOverzichtResponseType kadasterKoopsommenOverzicht(nl.webservices.www.soap.KadasterKoopsommenOverzichtRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve data on a business establishment
     */
    public nl.webservices.www.soap.KvkGetDossierResponseType kvkGetDossier(nl.webservices.www.soap.KvkGetDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for business establishments using a known identifier
     */
    public nl.webservices.www.soap.KvkSearchDossierNumberResponseType kvkSearchDossierNumber(nl.webservices.www.soap.KvkSearchDossierNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments using a variety of parameters
     */
    public nl.webservices.www.soap.KvkSearchParametersResponseType kvkSearchParameters(nl.webservices.www.soap.KvkSearchParametersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Find business establishments based on postcode and house number
     */
    public nl.webservices.www.soap.KvkSearchPostcodeResponseType kvkSearchPostcode(nl.webservices.www.soap.KvkSearchPostcodeRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Search for businesses matching all of the given criteria.
     */
    public nl.webservices.www.soap.KvkSearchSelectionResponseType kvkSearchSelection(nl.webservices.www.soap.KvkSearchSelectionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve a Chamber of Commerce extract document (Dutch: Uittreksel
     * Handelsregister)
     */
    public nl.webservices.www.soap.KvkGetExtractDocumentResponseType kvkGetExtractDocument(nl.webservices.www.soap.KvkGetExtractDocumentRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information on the last change of a business establishment
     */
    public nl.webservices.www.soap.KvkUpdateCheckDossierResponseType kvkUpdateCheckDossier(nl.webservices.www.soap.KvkUpdateCheckDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve all dossiers changed since the given date.
     */
    public nl.webservices.www.soap.KvkUpdateGetChangedDossiersResponseType kvkUpdateGetChangedDossiers(nl.webservices.www.soap.KvkUpdateGetChangedDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a list of all dossiers that have been updated since
     * they were last retrieved by the user
     */
    public nl.webservices.www.soap.KvkUpdateGetDossiersResponseType kvkUpdateGetDossiers(nl.webservices.www.soap.KvkUpdateGetDossiersRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Add a dossier to the list of dossiers for which the user (the
     * user whose credentials are used to make the call) wants to receive
     * updates
     */
    public nl.webservices.www.soap.KvkUpdateAddDossierResponseType kvkUpdateAddDossier(nl.webservices.www.soap.KvkUpdateAddDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Remove a dossier from the list of dossiers for which the user
     * (the user whose credentials are used to make the call) wants to receive
     * updates.
     */
    public nl.webservices.www.soap.KvkUpdateRemoveDossierResponseType kvkUpdateRemoveDossier(nl.webservices.www.soap.KvkUpdateRemoveDossierRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a map in JPG or PNG format showing the location of
     * the given postcode
     */
    public nl.webservices.www.soap.MapViewPostcodeV2ResponseType mapViewPostcodeV2(nl.webservices.www.soap.MapViewPostcodeV2RequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a map showing the location of the given coordinate
     * (centerlat, centerlon). extra_latlon is an array of other locations
     * to be shown. format can be 'jpg' or 'png' (default). The width and
     * height parameters can be [1 - 2048]. Scale in meters per pixel [0.298
     * - 156412]
     */
    public nl.webservices.www.soap.MapViewLatLonResponseType mapViewLatLon(nl.webservices.www.soap.MapViewLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a map showing the location of the given Rijksdriehoeksmeting
     * coordinate (centerx, centery). extra_xy is an array of other locations
     * to be shown. format can be 'jpg' or 'png' (default). The width and
     * height parameters can be [1-2048]. Scale in meters per pixel [0.298
     * - 156412]
     */
    public nl.webservices.www.soap.MapViewRDResponseType mapViewRD(nl.webservices.www.soap.MapViewRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a map showing the location of the given coordinate
     * (latitude, longitude)
     */
    public nl.webservices.www.soap.MapViewInternationalLatLonResponseType mapViewInternationalLatLon(nl.webservices.www.soap.MapViewInternationalLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Fetch a list of all Webservices.nl endpoints (interfaces).
     * Provide interface parameter (optional) for specific binding
     */
    public nl.webservices.www.soap.MetaGetServicesResponseType metaGetServices() throws java.rmi.RemoteException;

    /**
     * Returns a list of methods for provided webservice (Endpoint)
     */
    public nl.webservices.www.soap.MetaGetServiceResponseType metaGetService(nl.webservices.www.soap.MetaGetServiceRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a detailed overview of the requested method
     */
    public nl.webservices.www.soap.MetaGetMethodResponseType metaGetMethod(nl.webservices.www.soap.MetaGetMethodRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a value estimate for the real estate at the specified
     * address
     */
    public nl.webservices.www.soap.NbwoEstimateValueResponseType nbwoEstimateValue(nl.webservices.www.soap.NbwoEstimateValueRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Determines the creditworthiness of a person, address and postcode
     * area.
     *                                 The creditworthiness is expressed
     * as a number between 0 and 11.
     *                                 A credit score of 0 indicates that
     * there is no information available for the given search.
     *                                 A score between 1 and 11 indicates
     * the creditworthiness, where a higher score means less creditworthiness,
     * thus higher risk.
     */
    public nl.webservices.www.soap.RiskCheckPersonResponseType riskCheckPerson(nl.webservices.www.soap.RiskCheckPersonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information about a persons creditworthiness based
     * on his/her business ownerships and insolvency registrations.
     */
    public nl.webservices.www.soap.RiskCheckGetRiskPersonCompanyReportResponseType riskCheckGetRiskPersonCompanyReport(nl.webservices.www.soap.RiskCheckGetRiskPersonCompanyReportRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Get description and image for a route between two addresses
     */
    public nl.webservices.www.soap.RoutePlannerGetRouteResponseType routePlannerGetRoute(nl.webservices.www.soap.RoutePlannerGetRouteRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Summary information about a route calculated between two addresses
     */
    public nl.webservices.www.soap.RoutePlannerInformationAddressResponseType routePlannerInformationAddress(nl.webservices.www.soap.RoutePlannerInformationAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Detailed information about a route calculated between two addresses
     */
    public nl.webservices.www.soap.RoutePlannerDescriptionAddressResponseType routePlannerDescriptionAddress(nl.webservices.www.soap.RoutePlannerDescriptionAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the fastest route between two postcodes.
     * For every part of the route the drivetime in seconds and drivedistance
     * in meters are given as well. If the english argument is true the description
     * will be in english, otherwise it will be in dutch.
     */
    public nl.webservices.www.soap.RoutePlannerDescriptionResponseType routePlannerDescription(nl.webservices.www.soap.RoutePlannerDescriptionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the shortest route between two postcodes.
     * For every part of the route the drivetime in seconds and drivedistance
     * in meters are given as well. If the english argument is true the description
     * will be in english, otherwise it will be in dutch.
     */
    public nl.webservices.www.soap.RoutePlannerDescriptionShortestResponseType routePlannerDescriptionShortest(nl.webservices.www.soap.RoutePlannerDescriptionShortestRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the route between two dutch postcodes,
     * including the RD coordinates along the route. For every part of the
     * route the drivetime in seconds and drivedistance in meters are given
     * as well. The routetype can be shortest or fastest. By default the
     * fastest route will be calculated. If the english argument is true
     * the description will be in english, otherwise it will be in dutch.
     */
    public nl.webservices.www.soap.RoutePlannerDescriptionCoordinatesRDResponseType routePlannerDescriptionCoordinatesRD(nl.webservices.www.soap.RoutePlannerDescriptionCoordinatesRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns information (drivetime in seconds and drivedistance
     * in meters) of the route between two postcodes. The routetype can be
     * shortest or fastest. By default the fastest route will be calculated.
     */
    public nl.webservices.www.soap.RoutePlannerInformationResponseType routePlannerInformation(nl.webservices.www.soap.RoutePlannerInformationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the route between two coordinates
     * in the RD (Rijksdriehoeksmeting) coordinate system. For every part
     * of the route the drivetime in seconds and drivedistance in meters
     * are given as well. The description is available in dutch and english,
     * depending on the english parameter toggle. The fastest or shortest
     * route can be calculated depending on theroutetype parameter.
     */
    public nl.webservices.www.soap.RoutePlannerRDDescriptionResponseType routePlannerRDDescription(nl.webservices.www.soap.RoutePlannerRDDescriptionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the route distance and drive time between two coordinates
     * in the RD (Rijksdriehoeksmeting) coordinate system. The fastest or
     * shorted route can be calculated depending on the routetypeparameter.
     */
    public nl.webservices.www.soap.RoutePlannerRDInformationResponseType routePlannerRDInformation(nl.webservices.www.soap.RoutePlannerRDInformationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the route between two coordinates
     * in the RD (Rijksdriehoeksmeting) coordinate system, including the
     * RD coordinates along the route. For every part of the route the drivetime
     * in seconds and drivedistance in meters are given as well. The fastest
     * or shortest route can be calculated depending on the routetype parameter.
     * The description is available in dutch and english, depending on the
     * english parameter toggle.
     */
    public nl.webservices.www.soap.RoutePlannerRDDescriptionCoordinatesRDResponseType routePlannerRDDescriptionCoordinatesRD(nl.webservices.www.soap.RoutePlannerRDDescriptionCoordinatesRDRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Summary information about a route calculated between two dutch-addresses
     */
    public nl.webservices.www.soap.RoutePlannerInformationDutchAddressResponseType routePlannerInformationDutchAddress(nl.webservices.www.soap.RoutePlannerInformationDutchAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Detailed information about a route calculated between two dutch-addresses
     */
    public nl.webservices.www.soap.RoutePlannerDescriptionDutchAddressResponseType routePlannerDescriptionDutchAddress(nl.webservices.www.soap.RoutePlannerDescriptionDutchAddressRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the route between two latitude/longitude
     * coordinates in Europe. For every part of the route the drivetime and
     * drivedistance are given as well. The description is available in several
     * languages depending on the language parameter. The fastest or shortest
     * route is be calculated depending on the routetype parameter.
     */
    public nl.webservices.www.soap.RoutePlannerEUDescriptionResponseType routePlannerEUDescription(nl.webservices.www.soap.RoutePlannerEUDescriptionRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns the route distance and drive time for the route between
     * two latitude/longitude coordinates in Europe. The fastest or shortest
     * route can be calculated depending on the routetype parameter.
     */
    public nl.webservices.www.soap.RoutePlannerEUInformationResponseType routePlannerEUInformation(nl.webservices.www.soap.RoutePlannerEUInformationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a description of the route between two latitude/longitude
     * coordinates in Europe, including the latitude/longitude coordinates
     * along the route. For every part of the route the drivetime in seconds
     * and drivedistance in meters are given as well. The routetype can be
     * shortest or fastest. By default information on the fastest route will
     * be returned. The description is available in several languages depending
     * on the language parameter.
     */
    public nl.webservices.www.soap.RoutePlannerEUDescriptionCoordinatesLatLonResponseType routePlannerEUDescriptionCoordinatesLatLon(nl.webservices.www.soap.RoutePlannerEUDescriptionCoordinatesLatLonRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Returns a map showing the route between two latitude/longitude
     * coordinates in Europe.
     */
    public nl.webservices.www.soap.RoutePlannerEUMapResponseType routePlannerEUMap(nl.webservices.www.soap.RoutePlannerEUMapRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Convert a local Basic Bank Account Number (BBAN) number to
     * its International Bank Account Number (IBAN) counterpart.
     */
    public nl.webservices.www.soap.SepaConvertBasicBankAccountNumberResponseType sepaConvertBasicBankAccountNumber(nl.webservices.www.soap.SepaConvertBasicBankAccountNumberRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Validate format of an International Bank Account Number (IBAN)
     */
    public nl.webservices.www.soap.SepaValidateInternationalBankAccountNumberFormatResponseType sepaValidateInternationalBankAccountNumberFormat(nl.webservices.www.soap.SepaValidateInternationalBankAccountNumberFormatRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Check if a VAT number is valid
     */
    public nl.webservices.www.soap.VatValidateResponseType vatValidate(nl.webservices.www.soap.VatValidateRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Check if a VAT number is valid
     */
    public nl.webservices.www.soap.VatViesProxyCheckVatResponseType vatViesProxyCheckVat(nl.webservices.www.soap.VatViesProxyCheckVatRequestType parameters) throws java.rmi.RemoteException;
}
