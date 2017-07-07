/**
 * BusinessDossierV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessDossierV3  implements java.io.Serializable {
    private java.lang.String registerLetter;

    private java.lang.String dossierNo;

    private java.lang.String subDossierNo;

    private java.lang.String chamberNo;

    private java.lang.String legalformcode;

    private java.lang.String legalformcodeText;

    private java.lang.String previousDossierNo;

    private java.lang.String previousSubDossierNo;

    private java.lang.String tradename45;

    private java.lang.String tradenameFull;

    private java.lang.String establishmentPostcode;

    private java.lang.String establishmentCity;

    private java.lang.String establishmentStreetname;

    private int establishmentHouseNo;

    private java.lang.String establishmentHouseNoAddition;

    private java.lang.String correspondencePostcode;

    private java.lang.String correspondenceCity;

    private java.lang.String correspondenceStreetname;

    private int correspondenceHouseNo;

    private java.lang.String correspondenceHouseNoAddition;

    private java.lang.String telephoneNo;

    private java.lang.String domainname;

    private java.lang.String primarySBICode;

    private java.lang.String secondarySBICode1;

    private java.lang.String secondarySBICode2;

    private java.lang.String primarySBICodeText;

    private java.lang.String secondarySBICode1Text;

    private java.lang.String secondarySBICode2Text;

    private int personnel;

    private int classPersonnel;

    private java.lang.String indicationOrganisationcode;

    private boolean indicationEconomicallyActive;

    private boolean indicationNonMailing;

    private boolean indicationBankruptcy;

    private boolean indicationDIP;

    public BusinessDossierV3() {
    }

    public BusinessDossierV3(
           java.lang.String registerLetter,
           java.lang.String dossierNo,
           java.lang.String subDossierNo,
           java.lang.String chamberNo,
           java.lang.String legalformcode,
           java.lang.String legalformcodeText,
           java.lang.String previousDossierNo,
           java.lang.String previousSubDossierNo,
           java.lang.String tradename45,
           java.lang.String tradenameFull,
           java.lang.String establishmentPostcode,
           java.lang.String establishmentCity,
           java.lang.String establishmentStreetname,
           int establishmentHouseNo,
           java.lang.String establishmentHouseNoAddition,
           java.lang.String correspondencePostcode,
           java.lang.String correspondenceCity,
           java.lang.String correspondenceStreetname,
           int correspondenceHouseNo,
           java.lang.String correspondenceHouseNoAddition,
           java.lang.String telephoneNo,
           java.lang.String domainname,
           java.lang.String primarySBICode,
           java.lang.String secondarySBICode1,
           java.lang.String secondarySBICode2,
           java.lang.String primarySBICodeText,
           java.lang.String secondarySBICode1Text,
           java.lang.String secondarySBICode2Text,
           int personnel,
           int classPersonnel,
           java.lang.String indicationOrganisationcode,
           boolean indicationEconomicallyActive,
           boolean indicationNonMailing,
           boolean indicationBankruptcy,
           boolean indicationDIP) {
           this.registerLetter = registerLetter;
           this.dossierNo = dossierNo;
           this.subDossierNo = subDossierNo;
           this.chamberNo = chamberNo;
           this.legalformcode = legalformcode;
           this.legalformcodeText = legalformcodeText;
           this.previousDossierNo = previousDossierNo;
           this.previousSubDossierNo = previousSubDossierNo;
           this.tradename45 = tradename45;
           this.tradenameFull = tradenameFull;
           this.establishmentPostcode = establishmentPostcode;
           this.establishmentCity = establishmentCity;
           this.establishmentStreetname = establishmentStreetname;
           this.establishmentHouseNo = establishmentHouseNo;
           this.establishmentHouseNoAddition = establishmentHouseNoAddition;
           this.correspondencePostcode = correspondencePostcode;
           this.correspondenceCity = correspondenceCity;
           this.correspondenceStreetname = correspondenceStreetname;
           this.correspondenceHouseNo = correspondenceHouseNo;
           this.correspondenceHouseNoAddition = correspondenceHouseNoAddition;
           this.telephoneNo = telephoneNo;
           this.domainname = domainname;
           this.primarySBICode = primarySBICode;
           this.secondarySBICode1 = secondarySBICode1;
           this.secondarySBICode2 = secondarySBICode2;
           this.primarySBICodeText = primarySBICodeText;
           this.secondarySBICode1Text = secondarySBICode1Text;
           this.secondarySBICode2Text = secondarySBICode2Text;
           this.personnel = personnel;
           this.classPersonnel = classPersonnel;
           this.indicationOrganisationcode = indicationOrganisationcode;
           this.indicationEconomicallyActive = indicationEconomicallyActive;
           this.indicationNonMailing = indicationNonMailing;
           this.indicationBankruptcy = indicationBankruptcy;
           this.indicationDIP = indicationDIP;
    }


    /**
     * Gets the registerLetter value for this BusinessDossierV3.
     * 
     * @return registerLetter
     */
    public java.lang.String getRegisterLetter() {
        return registerLetter;
    }


    /**
     * Sets the registerLetter value for this BusinessDossierV3.
     * 
     * @param registerLetter
     */
    public void setRegisterLetter(java.lang.String registerLetter) {
        this.registerLetter = registerLetter;
    }


    /**
     * Gets the dossierNo value for this BusinessDossierV3.
     * 
     * @return dossierNo
     */
    public java.lang.String getDossierNo() {
        return dossierNo;
    }


    /**
     * Sets the dossierNo value for this BusinessDossierV3.
     * 
     * @param dossierNo
     */
    public void setDossierNo(java.lang.String dossierNo) {
        this.dossierNo = dossierNo;
    }


    /**
     * Gets the subDossierNo value for this BusinessDossierV3.
     * 
     * @return subDossierNo
     */
    public java.lang.String getSubDossierNo() {
        return subDossierNo;
    }


    /**
     * Sets the subDossierNo value for this BusinessDossierV3.
     * 
     * @param subDossierNo
     */
    public void setSubDossierNo(java.lang.String subDossierNo) {
        this.subDossierNo = subDossierNo;
    }


    /**
     * Gets the chamberNo value for this BusinessDossierV3.
     * 
     * @return chamberNo
     */
    public java.lang.String getChamberNo() {
        return chamberNo;
    }


    /**
     * Sets the chamberNo value for this BusinessDossierV3.
     * 
     * @param chamberNo
     */
    public void setChamberNo(java.lang.String chamberNo) {
        this.chamberNo = chamberNo;
    }


    /**
     * Gets the legalformcode value for this BusinessDossierV3.
     * 
     * @return legalformcode
     */
    public java.lang.String getLegalformcode() {
        return legalformcode;
    }


    /**
     * Sets the legalformcode value for this BusinessDossierV3.
     * 
     * @param legalformcode
     */
    public void setLegalformcode(java.lang.String legalformcode) {
        this.legalformcode = legalformcode;
    }


    /**
     * Gets the legalformcodeText value for this BusinessDossierV3.
     * 
     * @return legalformcodeText
     */
    public java.lang.String getLegalformcodeText() {
        return legalformcodeText;
    }


    /**
     * Sets the legalformcodeText value for this BusinessDossierV3.
     * 
     * @param legalformcodeText
     */
    public void setLegalformcodeText(java.lang.String legalformcodeText) {
        this.legalformcodeText = legalformcodeText;
    }


    /**
     * Gets the previousDossierNo value for this BusinessDossierV3.
     * 
     * @return previousDossierNo
     */
    public java.lang.String getPreviousDossierNo() {
        return previousDossierNo;
    }


    /**
     * Sets the previousDossierNo value for this BusinessDossierV3.
     * 
     * @param previousDossierNo
     */
    public void setPreviousDossierNo(java.lang.String previousDossierNo) {
        this.previousDossierNo = previousDossierNo;
    }


    /**
     * Gets the previousSubDossierNo value for this BusinessDossierV3.
     * 
     * @return previousSubDossierNo
     */
    public java.lang.String getPreviousSubDossierNo() {
        return previousSubDossierNo;
    }


    /**
     * Sets the previousSubDossierNo value for this BusinessDossierV3.
     * 
     * @param previousSubDossierNo
     */
    public void setPreviousSubDossierNo(java.lang.String previousSubDossierNo) {
        this.previousSubDossierNo = previousSubDossierNo;
    }


    /**
     * Gets the tradename45 value for this BusinessDossierV3.
     * 
     * @return tradename45
     */
    public java.lang.String getTradename45() {
        return tradename45;
    }


    /**
     * Sets the tradename45 value for this BusinessDossierV3.
     * 
     * @param tradename45
     */
    public void setTradename45(java.lang.String tradename45) {
        this.tradename45 = tradename45;
    }


    /**
     * Gets the tradenameFull value for this BusinessDossierV3.
     * 
     * @return tradenameFull
     */
    public java.lang.String getTradenameFull() {
        return tradenameFull;
    }


    /**
     * Sets the tradenameFull value for this BusinessDossierV3.
     * 
     * @param tradenameFull
     */
    public void setTradenameFull(java.lang.String tradenameFull) {
        this.tradenameFull = tradenameFull;
    }


    /**
     * Gets the establishmentPostcode value for this BusinessDossierV3.
     * 
     * @return establishmentPostcode
     */
    public java.lang.String getEstablishmentPostcode() {
        return establishmentPostcode;
    }


    /**
     * Sets the establishmentPostcode value for this BusinessDossierV3.
     * 
     * @param establishmentPostcode
     */
    public void setEstablishmentPostcode(java.lang.String establishmentPostcode) {
        this.establishmentPostcode = establishmentPostcode;
    }


    /**
     * Gets the establishmentCity value for this BusinessDossierV3.
     * 
     * @return establishmentCity
     */
    public java.lang.String getEstablishmentCity() {
        return establishmentCity;
    }


    /**
     * Sets the establishmentCity value for this BusinessDossierV3.
     * 
     * @param establishmentCity
     */
    public void setEstablishmentCity(java.lang.String establishmentCity) {
        this.establishmentCity = establishmentCity;
    }


    /**
     * Gets the establishmentStreetname value for this BusinessDossierV3.
     * 
     * @return establishmentStreetname
     */
    public java.lang.String getEstablishmentStreetname() {
        return establishmentStreetname;
    }


    /**
     * Sets the establishmentStreetname value for this BusinessDossierV3.
     * 
     * @param establishmentStreetname
     */
    public void setEstablishmentStreetname(java.lang.String establishmentStreetname) {
        this.establishmentStreetname = establishmentStreetname;
    }


    /**
     * Gets the establishmentHouseNo value for this BusinessDossierV3.
     * 
     * @return establishmentHouseNo
     */
    public int getEstablishmentHouseNo() {
        return establishmentHouseNo;
    }


    /**
     * Sets the establishmentHouseNo value for this BusinessDossierV3.
     * 
     * @param establishmentHouseNo
     */
    public void setEstablishmentHouseNo(int establishmentHouseNo) {
        this.establishmentHouseNo = establishmentHouseNo;
    }


    /**
     * Gets the establishmentHouseNoAddition value for this BusinessDossierV3.
     * 
     * @return establishmentHouseNoAddition
     */
    public java.lang.String getEstablishmentHouseNoAddition() {
        return establishmentHouseNoAddition;
    }


    /**
     * Sets the establishmentHouseNoAddition value for this BusinessDossierV3.
     * 
     * @param establishmentHouseNoAddition
     */
    public void setEstablishmentHouseNoAddition(java.lang.String establishmentHouseNoAddition) {
        this.establishmentHouseNoAddition = establishmentHouseNoAddition;
    }


    /**
     * Gets the correspondencePostcode value for this BusinessDossierV3.
     * 
     * @return correspondencePostcode
     */
    public java.lang.String getCorrespondencePostcode() {
        return correspondencePostcode;
    }


    /**
     * Sets the correspondencePostcode value for this BusinessDossierV3.
     * 
     * @param correspondencePostcode
     */
    public void setCorrespondencePostcode(java.lang.String correspondencePostcode) {
        this.correspondencePostcode = correspondencePostcode;
    }


    /**
     * Gets the correspondenceCity value for this BusinessDossierV3.
     * 
     * @return correspondenceCity
     */
    public java.lang.String getCorrespondenceCity() {
        return correspondenceCity;
    }


    /**
     * Sets the correspondenceCity value for this BusinessDossierV3.
     * 
     * @param correspondenceCity
     */
    public void setCorrespondenceCity(java.lang.String correspondenceCity) {
        this.correspondenceCity = correspondenceCity;
    }


    /**
     * Gets the correspondenceStreetname value for this BusinessDossierV3.
     * 
     * @return correspondenceStreetname
     */
    public java.lang.String getCorrespondenceStreetname() {
        return correspondenceStreetname;
    }


    /**
     * Sets the correspondenceStreetname value for this BusinessDossierV3.
     * 
     * @param correspondenceStreetname
     */
    public void setCorrespondenceStreetname(java.lang.String correspondenceStreetname) {
        this.correspondenceStreetname = correspondenceStreetname;
    }


    /**
     * Gets the correspondenceHouseNo value for this BusinessDossierV3.
     * 
     * @return correspondenceHouseNo
     */
    public int getCorrespondenceHouseNo() {
        return correspondenceHouseNo;
    }


    /**
     * Sets the correspondenceHouseNo value for this BusinessDossierV3.
     * 
     * @param correspondenceHouseNo
     */
    public void setCorrespondenceHouseNo(int correspondenceHouseNo) {
        this.correspondenceHouseNo = correspondenceHouseNo;
    }


    /**
     * Gets the correspondenceHouseNoAddition value for this BusinessDossierV3.
     * 
     * @return correspondenceHouseNoAddition
     */
    public java.lang.String getCorrespondenceHouseNoAddition() {
        return correspondenceHouseNoAddition;
    }


    /**
     * Sets the correspondenceHouseNoAddition value for this BusinessDossierV3.
     * 
     * @param correspondenceHouseNoAddition
     */
    public void setCorrespondenceHouseNoAddition(java.lang.String correspondenceHouseNoAddition) {
        this.correspondenceHouseNoAddition = correspondenceHouseNoAddition;
    }


    /**
     * Gets the telephoneNo value for this BusinessDossierV3.
     * 
     * @return telephoneNo
     */
    public java.lang.String getTelephoneNo() {
        return telephoneNo;
    }


    /**
     * Sets the telephoneNo value for this BusinessDossierV3.
     * 
     * @param telephoneNo
     */
    public void setTelephoneNo(java.lang.String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }


    /**
     * Gets the domainname value for this BusinessDossierV3.
     * 
     * @return domainname
     */
    public java.lang.String getDomainname() {
        return domainname;
    }


    /**
     * Sets the domainname value for this BusinessDossierV3.
     * 
     * @param domainname
     */
    public void setDomainname(java.lang.String domainname) {
        this.domainname = domainname;
    }


    /**
     * Gets the primarySBICode value for this BusinessDossierV3.
     * 
     * @return primarySBICode
     */
    public java.lang.String getPrimarySBICode() {
        return primarySBICode;
    }


    /**
     * Sets the primarySBICode value for this BusinessDossierV3.
     * 
     * @param primarySBICode
     */
    public void setPrimarySBICode(java.lang.String primarySBICode) {
        this.primarySBICode = primarySBICode;
    }


    /**
     * Gets the secondarySBICode1 value for this BusinessDossierV3.
     * 
     * @return secondarySBICode1
     */
    public java.lang.String getSecondarySBICode1() {
        return secondarySBICode1;
    }


    /**
     * Sets the secondarySBICode1 value for this BusinessDossierV3.
     * 
     * @param secondarySBICode1
     */
    public void setSecondarySBICode1(java.lang.String secondarySBICode1) {
        this.secondarySBICode1 = secondarySBICode1;
    }


    /**
     * Gets the secondarySBICode2 value for this BusinessDossierV3.
     * 
     * @return secondarySBICode2
     */
    public java.lang.String getSecondarySBICode2() {
        return secondarySBICode2;
    }


    /**
     * Sets the secondarySBICode2 value for this BusinessDossierV3.
     * 
     * @param secondarySBICode2
     */
    public void setSecondarySBICode2(java.lang.String secondarySBICode2) {
        this.secondarySBICode2 = secondarySBICode2;
    }


    /**
     * Gets the primarySBICodeText value for this BusinessDossierV3.
     * 
     * @return primarySBICodeText
     */
    public java.lang.String getPrimarySBICodeText() {
        return primarySBICodeText;
    }


    /**
     * Sets the primarySBICodeText value for this BusinessDossierV3.
     * 
     * @param primarySBICodeText
     */
    public void setPrimarySBICodeText(java.lang.String primarySBICodeText) {
        this.primarySBICodeText = primarySBICodeText;
    }


    /**
     * Gets the secondarySBICode1Text value for this BusinessDossierV3.
     * 
     * @return secondarySBICode1Text
     */
    public java.lang.String getSecondarySBICode1Text() {
        return secondarySBICode1Text;
    }


    /**
     * Sets the secondarySBICode1Text value for this BusinessDossierV3.
     * 
     * @param secondarySBICode1Text
     */
    public void setSecondarySBICode1Text(java.lang.String secondarySBICode1Text) {
        this.secondarySBICode1Text = secondarySBICode1Text;
    }


    /**
     * Gets the secondarySBICode2Text value for this BusinessDossierV3.
     * 
     * @return secondarySBICode2Text
     */
    public java.lang.String getSecondarySBICode2Text() {
        return secondarySBICode2Text;
    }


    /**
     * Sets the secondarySBICode2Text value for this BusinessDossierV3.
     * 
     * @param secondarySBICode2Text
     */
    public void setSecondarySBICode2Text(java.lang.String secondarySBICode2Text) {
        this.secondarySBICode2Text = secondarySBICode2Text;
    }


    /**
     * Gets the personnel value for this BusinessDossierV3.
     * 
     * @return personnel
     */
    public int getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this BusinessDossierV3.
     * 
     * @param personnel
     */
    public void setPersonnel(int personnel) {
        this.personnel = personnel;
    }


    /**
     * Gets the classPersonnel value for this BusinessDossierV3.
     * 
     * @return classPersonnel
     */
    public int getClassPersonnel() {
        return classPersonnel;
    }


    /**
     * Sets the classPersonnel value for this BusinessDossierV3.
     * 
     * @param classPersonnel
     */
    public void setClassPersonnel(int classPersonnel) {
        this.classPersonnel = classPersonnel;
    }


    /**
     * Gets the indicationOrganisationcode value for this BusinessDossierV3.
     * 
     * @return indicationOrganisationcode
     */
    public java.lang.String getIndicationOrganisationcode() {
        return indicationOrganisationcode;
    }


    /**
     * Sets the indicationOrganisationcode value for this BusinessDossierV3.
     * 
     * @param indicationOrganisationcode
     */
    public void setIndicationOrganisationcode(java.lang.String indicationOrganisationcode) {
        this.indicationOrganisationcode = indicationOrganisationcode;
    }


    /**
     * Gets the indicationEconomicallyActive value for this BusinessDossierV3.
     * 
     * @return indicationEconomicallyActive
     */
    public boolean isIndicationEconomicallyActive() {
        return indicationEconomicallyActive;
    }


    /**
     * Sets the indicationEconomicallyActive value for this BusinessDossierV3.
     * 
     * @param indicationEconomicallyActive
     */
    public void setIndicationEconomicallyActive(boolean indicationEconomicallyActive) {
        this.indicationEconomicallyActive = indicationEconomicallyActive;
    }


    /**
     * Gets the indicationNonMailing value for this BusinessDossierV3.
     * 
     * @return indicationNonMailing
     */
    public boolean isIndicationNonMailing() {
        return indicationNonMailing;
    }


    /**
     * Sets the indicationNonMailing value for this BusinessDossierV3.
     * 
     * @param indicationNonMailing
     */
    public void setIndicationNonMailing(boolean indicationNonMailing) {
        this.indicationNonMailing = indicationNonMailing;
    }


    /**
     * Gets the indicationBankruptcy value for this BusinessDossierV3.
     * 
     * @return indicationBankruptcy
     */
    public boolean isIndicationBankruptcy() {
        return indicationBankruptcy;
    }


    /**
     * Sets the indicationBankruptcy value for this BusinessDossierV3.
     * 
     * @param indicationBankruptcy
     */
    public void setIndicationBankruptcy(boolean indicationBankruptcy) {
        this.indicationBankruptcy = indicationBankruptcy;
    }


    /**
     * Gets the indicationDIP value for this BusinessDossierV3.
     * 
     * @return indicationDIP
     */
    public boolean isIndicationDIP() {
        return indicationDIP;
    }


    /**
     * Sets the indicationDIP value for this BusinessDossierV3.
     * 
     * @param indicationDIP
     */
    public void setIndicationDIP(boolean indicationDIP) {
        this.indicationDIP = indicationDIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDossierV3)) return false;
        BusinessDossierV3 other = (BusinessDossierV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerLetter==null && other.getRegisterLetter()==null) || 
             (this.registerLetter!=null &&
              this.registerLetter.equals(other.getRegisterLetter()))) &&
            ((this.dossierNo==null && other.getDossierNo()==null) || 
             (this.dossierNo!=null &&
              this.dossierNo.equals(other.getDossierNo()))) &&
            ((this.subDossierNo==null && other.getSubDossierNo()==null) || 
             (this.subDossierNo!=null &&
              this.subDossierNo.equals(other.getSubDossierNo()))) &&
            ((this.chamberNo==null && other.getChamberNo()==null) || 
             (this.chamberNo!=null &&
              this.chamberNo.equals(other.getChamberNo()))) &&
            ((this.legalformcode==null && other.getLegalformcode()==null) || 
             (this.legalformcode!=null &&
              this.legalformcode.equals(other.getLegalformcode()))) &&
            ((this.legalformcodeText==null && other.getLegalformcodeText()==null) || 
             (this.legalformcodeText!=null &&
              this.legalformcodeText.equals(other.getLegalformcodeText()))) &&
            ((this.previousDossierNo==null && other.getPreviousDossierNo()==null) || 
             (this.previousDossierNo!=null &&
              this.previousDossierNo.equals(other.getPreviousDossierNo()))) &&
            ((this.previousSubDossierNo==null && other.getPreviousSubDossierNo()==null) || 
             (this.previousSubDossierNo!=null &&
              this.previousSubDossierNo.equals(other.getPreviousSubDossierNo()))) &&
            ((this.tradename45==null && other.getTradename45()==null) || 
             (this.tradename45!=null &&
              this.tradename45.equals(other.getTradename45()))) &&
            ((this.tradenameFull==null && other.getTradenameFull()==null) || 
             (this.tradenameFull!=null &&
              this.tradenameFull.equals(other.getTradenameFull()))) &&
            ((this.establishmentPostcode==null && other.getEstablishmentPostcode()==null) || 
             (this.establishmentPostcode!=null &&
              this.establishmentPostcode.equals(other.getEstablishmentPostcode()))) &&
            ((this.establishmentCity==null && other.getEstablishmentCity()==null) || 
             (this.establishmentCity!=null &&
              this.establishmentCity.equals(other.getEstablishmentCity()))) &&
            ((this.establishmentStreetname==null && other.getEstablishmentStreetname()==null) || 
             (this.establishmentStreetname!=null &&
              this.establishmentStreetname.equals(other.getEstablishmentStreetname()))) &&
            this.establishmentHouseNo == other.getEstablishmentHouseNo() &&
            ((this.establishmentHouseNoAddition==null && other.getEstablishmentHouseNoAddition()==null) || 
             (this.establishmentHouseNoAddition!=null &&
              this.establishmentHouseNoAddition.equals(other.getEstablishmentHouseNoAddition()))) &&
            ((this.correspondencePostcode==null && other.getCorrespondencePostcode()==null) || 
             (this.correspondencePostcode!=null &&
              this.correspondencePostcode.equals(other.getCorrespondencePostcode()))) &&
            ((this.correspondenceCity==null && other.getCorrespondenceCity()==null) || 
             (this.correspondenceCity!=null &&
              this.correspondenceCity.equals(other.getCorrespondenceCity()))) &&
            ((this.correspondenceStreetname==null && other.getCorrespondenceStreetname()==null) || 
             (this.correspondenceStreetname!=null &&
              this.correspondenceStreetname.equals(other.getCorrespondenceStreetname()))) &&
            this.correspondenceHouseNo == other.getCorrespondenceHouseNo() &&
            ((this.correspondenceHouseNoAddition==null && other.getCorrespondenceHouseNoAddition()==null) || 
             (this.correspondenceHouseNoAddition!=null &&
              this.correspondenceHouseNoAddition.equals(other.getCorrespondenceHouseNoAddition()))) &&
            ((this.telephoneNo==null && other.getTelephoneNo()==null) || 
             (this.telephoneNo!=null &&
              this.telephoneNo.equals(other.getTelephoneNo()))) &&
            ((this.domainname==null && other.getDomainname()==null) || 
             (this.domainname!=null &&
              this.domainname.equals(other.getDomainname()))) &&
            ((this.primarySBICode==null && other.getPrimarySBICode()==null) || 
             (this.primarySBICode!=null &&
              this.primarySBICode.equals(other.getPrimarySBICode()))) &&
            ((this.secondarySBICode1==null && other.getSecondarySBICode1()==null) || 
             (this.secondarySBICode1!=null &&
              this.secondarySBICode1.equals(other.getSecondarySBICode1()))) &&
            ((this.secondarySBICode2==null && other.getSecondarySBICode2()==null) || 
             (this.secondarySBICode2!=null &&
              this.secondarySBICode2.equals(other.getSecondarySBICode2()))) &&
            ((this.primarySBICodeText==null && other.getPrimarySBICodeText()==null) || 
             (this.primarySBICodeText!=null &&
              this.primarySBICodeText.equals(other.getPrimarySBICodeText()))) &&
            ((this.secondarySBICode1Text==null && other.getSecondarySBICode1Text()==null) || 
             (this.secondarySBICode1Text!=null &&
              this.secondarySBICode1Text.equals(other.getSecondarySBICode1Text()))) &&
            ((this.secondarySBICode2Text==null && other.getSecondarySBICode2Text()==null) || 
             (this.secondarySBICode2Text!=null &&
              this.secondarySBICode2Text.equals(other.getSecondarySBICode2Text()))) &&
            this.personnel == other.getPersonnel() &&
            this.classPersonnel == other.getClassPersonnel() &&
            ((this.indicationOrganisationcode==null && other.getIndicationOrganisationcode()==null) || 
             (this.indicationOrganisationcode!=null &&
              this.indicationOrganisationcode.equals(other.getIndicationOrganisationcode()))) &&
            this.indicationEconomicallyActive == other.isIndicationEconomicallyActive() &&
            this.indicationNonMailing == other.isIndicationNonMailing() &&
            this.indicationBankruptcy == other.isIndicationBankruptcy() &&
            this.indicationDIP == other.isIndicationDIP();
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
        if (getRegisterLetter() != null) {
            _hashCode += getRegisterLetter().hashCode();
        }
        if (getDossierNo() != null) {
            _hashCode += getDossierNo().hashCode();
        }
        if (getSubDossierNo() != null) {
            _hashCode += getSubDossierNo().hashCode();
        }
        if (getChamberNo() != null) {
            _hashCode += getChamberNo().hashCode();
        }
        if (getLegalformcode() != null) {
            _hashCode += getLegalformcode().hashCode();
        }
        if (getLegalformcodeText() != null) {
            _hashCode += getLegalformcodeText().hashCode();
        }
        if (getPreviousDossierNo() != null) {
            _hashCode += getPreviousDossierNo().hashCode();
        }
        if (getPreviousSubDossierNo() != null) {
            _hashCode += getPreviousSubDossierNo().hashCode();
        }
        if (getTradename45() != null) {
            _hashCode += getTradename45().hashCode();
        }
        if (getTradenameFull() != null) {
            _hashCode += getTradenameFull().hashCode();
        }
        if (getEstablishmentPostcode() != null) {
            _hashCode += getEstablishmentPostcode().hashCode();
        }
        if (getEstablishmentCity() != null) {
            _hashCode += getEstablishmentCity().hashCode();
        }
        if (getEstablishmentStreetname() != null) {
            _hashCode += getEstablishmentStreetname().hashCode();
        }
        _hashCode += getEstablishmentHouseNo();
        if (getEstablishmentHouseNoAddition() != null) {
            _hashCode += getEstablishmentHouseNoAddition().hashCode();
        }
        if (getCorrespondencePostcode() != null) {
            _hashCode += getCorrespondencePostcode().hashCode();
        }
        if (getCorrespondenceCity() != null) {
            _hashCode += getCorrespondenceCity().hashCode();
        }
        if (getCorrespondenceStreetname() != null) {
            _hashCode += getCorrespondenceStreetname().hashCode();
        }
        _hashCode += getCorrespondenceHouseNo();
        if (getCorrespondenceHouseNoAddition() != null) {
            _hashCode += getCorrespondenceHouseNoAddition().hashCode();
        }
        if (getTelephoneNo() != null) {
            _hashCode += getTelephoneNo().hashCode();
        }
        if (getDomainname() != null) {
            _hashCode += getDomainname().hashCode();
        }
        if (getPrimarySBICode() != null) {
            _hashCode += getPrimarySBICode().hashCode();
        }
        if (getSecondarySBICode1() != null) {
            _hashCode += getSecondarySBICode1().hashCode();
        }
        if (getSecondarySBICode2() != null) {
            _hashCode += getSecondarySBICode2().hashCode();
        }
        if (getPrimarySBICodeText() != null) {
            _hashCode += getPrimarySBICodeText().hashCode();
        }
        if (getSecondarySBICode1Text() != null) {
            _hashCode += getSecondarySBICode1Text().hashCode();
        }
        if (getSecondarySBICode2Text() != null) {
            _hashCode += getSecondarySBICode2Text().hashCode();
        }
        _hashCode += getPersonnel();
        _hashCode += getClassPersonnel();
        if (getIndicationOrganisationcode() != null) {
            _hashCode += getIndicationOrganisationcode().hashCode();
        }
        _hashCode += (isIndicationEconomicallyActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicationNonMailing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicationBankruptcy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicationDIP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessDossierV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessDossierV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RegisterLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SubDossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ChamberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalformcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Legalformcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalformcodeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LegalformcodeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousDossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PreviousDossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousSubDossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PreviousSubDossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradename45");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Tradename45"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradenameFull");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "TradenameFull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentPostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentStreetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentStreetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentHouseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentHouseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentHouseNoAddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentHouseNoAddition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondencePostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondencePostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceStreetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceStreetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceHouseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceHouseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceHouseNoAddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceHouseNoAddition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "TelephoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Domainname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySBICode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PrimarySBICode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySBICodeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PrimarySBICodeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode1Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode1Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySBICode2Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SecondarySBICode2Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classPersonnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ClassPersonnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationOrganisationcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationOrganisationcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationEconomicallyActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationEconomicallyActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationNonMailing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationNonMailing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationBankruptcy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationBankruptcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationDIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationDIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
