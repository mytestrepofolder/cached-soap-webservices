/**
 * DutchBusinessPartnership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPartnership  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.lang.String rsin_number;

    private java.lang.String name;

    private java.lang.String registration;

    private java.lang.String status;

    private java.lang.String legal_form_text;

    private nl.webservices.www.soap.DutchBusinessDate founding_date;

    private nl.webservices.www.soap.DutchBusinessDate dissolution_date;

    private nl.webservices.www.soap.DutchBusinessDate function_start_date;

    private java.lang.String duration;

    private java.lang.Long limited_partnership_capital;

    private java.lang.String limited_partnership_capital_currency;

    private java.lang.String establishment_postcode;

    private java.lang.String establishment_city;

    private java.lang.String establishment_street;

    private java.lang.Integer establishment_house_number;

    private java.lang.String establishment_house_number_addition;

    private java.lang.String establishment_country;

    private java.lang.Integer silent_partners;

    public DutchBusinessPartnership() {
    }

    public DutchBusinessPartnership(
           java.lang.String dossier_number,
           java.lang.String rsin_number,
           java.lang.String name,
           java.lang.String registration,
           java.lang.String status,
           java.lang.String legal_form_text,
           nl.webservices.www.soap.DutchBusinessDate founding_date,
           nl.webservices.www.soap.DutchBusinessDate dissolution_date,
           nl.webservices.www.soap.DutchBusinessDate function_start_date,
           java.lang.String duration,
           java.lang.Long limited_partnership_capital,
           java.lang.String limited_partnership_capital_currency,
           java.lang.String establishment_postcode,
           java.lang.String establishment_city,
           java.lang.String establishment_street,
           java.lang.Integer establishment_house_number,
           java.lang.String establishment_house_number_addition,
           java.lang.String establishment_country,
           java.lang.Integer silent_partners) {
           this.dossier_number = dossier_number;
           this.rsin_number = rsin_number;
           this.name = name;
           this.registration = registration;
           this.status = status;
           this.legal_form_text = legal_form_text;
           this.founding_date = founding_date;
           this.dissolution_date = dissolution_date;
           this.function_start_date = function_start_date;
           this.duration = duration;
           this.limited_partnership_capital = limited_partnership_capital;
           this.limited_partnership_capital_currency = limited_partnership_capital_currency;
           this.establishment_postcode = establishment_postcode;
           this.establishment_city = establishment_city;
           this.establishment_street = establishment_street;
           this.establishment_house_number = establishment_house_number;
           this.establishment_house_number_addition = establishment_house_number_addition;
           this.establishment_country = establishment_country;
           this.silent_partners = silent_partners;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessPartnership.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessPartnership.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the rsin_number value for this DutchBusinessPartnership.
     * 
     * @return rsin_number
     */
    public java.lang.String getRsin_number() {
        return rsin_number;
    }


    /**
     * Sets the rsin_number value for this DutchBusinessPartnership.
     * 
     * @param rsin_number
     */
    public void setRsin_number(java.lang.String rsin_number) {
        this.rsin_number = rsin_number;
    }


    /**
     * Gets the name value for this DutchBusinessPartnership.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DutchBusinessPartnership.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the registration value for this DutchBusinessPartnership.
     * 
     * @return registration
     */
    public java.lang.String getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this DutchBusinessPartnership.
     * 
     * @param registration
     */
    public void setRegistration(java.lang.String registration) {
        this.registration = registration;
    }


    /**
     * Gets the status value for this DutchBusinessPartnership.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DutchBusinessPartnership.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessPartnership.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessPartnership.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the founding_date value for this DutchBusinessPartnership.
     * 
     * @return founding_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFounding_date() {
        return founding_date;
    }


    /**
     * Sets the founding_date value for this DutchBusinessPartnership.
     * 
     * @param founding_date
     */
    public void setFounding_date(nl.webservices.www.soap.DutchBusinessDate founding_date) {
        this.founding_date = founding_date;
    }


    /**
     * Gets the dissolution_date value for this DutchBusinessPartnership.
     * 
     * @return dissolution_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getDissolution_date() {
        return dissolution_date;
    }


    /**
     * Sets the dissolution_date value for this DutchBusinessPartnership.
     * 
     * @param dissolution_date
     */
    public void setDissolution_date(nl.webservices.www.soap.DutchBusinessDate dissolution_date) {
        this.dissolution_date = dissolution_date;
    }


    /**
     * Gets the function_start_date value for this DutchBusinessPartnership.
     * 
     * @return function_start_date
     */
    public nl.webservices.www.soap.DutchBusinessDate getFunction_start_date() {
        return function_start_date;
    }


    /**
     * Sets the function_start_date value for this DutchBusinessPartnership.
     * 
     * @param function_start_date
     */
    public void setFunction_start_date(nl.webservices.www.soap.DutchBusinessDate function_start_date) {
        this.function_start_date = function_start_date;
    }


    /**
     * Gets the duration value for this DutchBusinessPartnership.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DutchBusinessPartnership.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the limited_partnership_capital value for this DutchBusinessPartnership.
     * 
     * @return limited_partnership_capital
     */
    public java.lang.Long getLimited_partnership_capital() {
        return limited_partnership_capital;
    }


    /**
     * Sets the limited_partnership_capital value for this DutchBusinessPartnership.
     * 
     * @param limited_partnership_capital
     */
    public void setLimited_partnership_capital(java.lang.Long limited_partnership_capital) {
        this.limited_partnership_capital = limited_partnership_capital;
    }


    /**
     * Gets the limited_partnership_capital_currency value for this DutchBusinessPartnership.
     * 
     * @return limited_partnership_capital_currency
     */
    public java.lang.String getLimited_partnership_capital_currency() {
        return limited_partnership_capital_currency;
    }


    /**
     * Sets the limited_partnership_capital_currency value for this DutchBusinessPartnership.
     * 
     * @param limited_partnership_capital_currency
     */
    public void setLimited_partnership_capital_currency(java.lang.String limited_partnership_capital_currency) {
        this.limited_partnership_capital_currency = limited_partnership_capital_currency;
    }


    /**
     * Gets the establishment_postcode value for this DutchBusinessPartnership.
     * 
     * @return establishment_postcode
     */
    public java.lang.String getEstablishment_postcode() {
        return establishment_postcode;
    }


    /**
     * Sets the establishment_postcode value for this DutchBusinessPartnership.
     * 
     * @param establishment_postcode
     */
    public void setEstablishment_postcode(java.lang.String establishment_postcode) {
        this.establishment_postcode = establishment_postcode;
    }


    /**
     * Gets the establishment_city value for this DutchBusinessPartnership.
     * 
     * @return establishment_city
     */
    public java.lang.String getEstablishment_city() {
        return establishment_city;
    }


    /**
     * Sets the establishment_city value for this DutchBusinessPartnership.
     * 
     * @param establishment_city
     */
    public void setEstablishment_city(java.lang.String establishment_city) {
        this.establishment_city = establishment_city;
    }


    /**
     * Gets the establishment_street value for this DutchBusinessPartnership.
     * 
     * @return establishment_street
     */
    public java.lang.String getEstablishment_street() {
        return establishment_street;
    }


    /**
     * Sets the establishment_street value for this DutchBusinessPartnership.
     * 
     * @param establishment_street
     */
    public void setEstablishment_street(java.lang.String establishment_street) {
        this.establishment_street = establishment_street;
    }


    /**
     * Gets the establishment_house_number value for this DutchBusinessPartnership.
     * 
     * @return establishment_house_number
     */
    public java.lang.Integer getEstablishment_house_number() {
        return establishment_house_number;
    }


    /**
     * Sets the establishment_house_number value for this DutchBusinessPartnership.
     * 
     * @param establishment_house_number
     */
    public void setEstablishment_house_number(java.lang.Integer establishment_house_number) {
        this.establishment_house_number = establishment_house_number;
    }


    /**
     * Gets the establishment_house_number_addition value for this DutchBusinessPartnership.
     * 
     * @return establishment_house_number_addition
     */
    public java.lang.String getEstablishment_house_number_addition() {
        return establishment_house_number_addition;
    }


    /**
     * Sets the establishment_house_number_addition value for this DutchBusinessPartnership.
     * 
     * @param establishment_house_number_addition
     */
    public void setEstablishment_house_number_addition(java.lang.String establishment_house_number_addition) {
        this.establishment_house_number_addition = establishment_house_number_addition;
    }


    /**
     * Gets the establishment_country value for this DutchBusinessPartnership.
     * 
     * @return establishment_country
     */
    public java.lang.String getEstablishment_country() {
        return establishment_country;
    }


    /**
     * Sets the establishment_country value for this DutchBusinessPartnership.
     * 
     * @param establishment_country
     */
    public void setEstablishment_country(java.lang.String establishment_country) {
        this.establishment_country = establishment_country;
    }


    /**
     * Gets the silent_partners value for this DutchBusinessPartnership.
     * 
     * @return silent_partners
     */
    public java.lang.Integer getSilent_partners() {
        return silent_partners;
    }


    /**
     * Sets the silent_partners value for this DutchBusinessPartnership.
     * 
     * @param silent_partners
     */
    public void setSilent_partners(java.lang.Integer silent_partners) {
        this.silent_partners = silent_partners;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPartnership)) return false;
        DutchBusinessPartnership other = (DutchBusinessPartnership) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.rsin_number==null && other.getRsin_number()==null) || 
             (this.rsin_number!=null &&
              this.rsin_number.equals(other.getRsin_number()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.founding_date==null && other.getFounding_date()==null) || 
             (this.founding_date!=null &&
              this.founding_date.equals(other.getFounding_date()))) &&
            ((this.dissolution_date==null && other.getDissolution_date()==null) || 
             (this.dissolution_date!=null &&
              this.dissolution_date.equals(other.getDissolution_date()))) &&
            ((this.function_start_date==null && other.getFunction_start_date()==null) || 
             (this.function_start_date!=null &&
              this.function_start_date.equals(other.getFunction_start_date()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.limited_partnership_capital==null && other.getLimited_partnership_capital()==null) || 
             (this.limited_partnership_capital!=null &&
              this.limited_partnership_capital.equals(other.getLimited_partnership_capital()))) &&
            ((this.limited_partnership_capital_currency==null && other.getLimited_partnership_capital_currency()==null) || 
             (this.limited_partnership_capital_currency!=null &&
              this.limited_partnership_capital_currency.equals(other.getLimited_partnership_capital_currency()))) &&
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
            ((this.silent_partners==null && other.getSilent_partners()==null) || 
             (this.silent_partners!=null &&
              this.silent_partners.equals(other.getSilent_partners())));
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
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getRsin_number() != null) {
            _hashCode += getRsin_number().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getFounding_date() != null) {
            _hashCode += getFounding_date().hashCode();
        }
        if (getDissolution_date() != null) {
            _hashCode += getDissolution_date().hashCode();
        }
        if (getFunction_start_date() != null) {
            _hashCode += getFunction_start_date().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getLimited_partnership_capital() != null) {
            _hashCode += getLimited_partnership_capital().hashCode();
        }
        if (getLimited_partnership_capital_currency() != null) {
            _hashCode += getLimited_partnership_capital_currency().hashCode();
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
        if (getSilent_partners() != null) {
            _hashCode += getSilent_partners().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPartnership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPartnership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
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
        elemField.setFieldName("founding_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founding_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolution_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dissolution_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDate"));
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
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limited_partnership_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "limited_partnership_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limited_partnership_capital_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "limited_partnership_capital_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("silent_partners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "silent_partners"));
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
