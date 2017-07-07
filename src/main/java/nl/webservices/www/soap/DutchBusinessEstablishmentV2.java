/**
 * DutchBusinessEstablishmentV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessEstablishmentV2  implements java.io.Serializable {
    private java.lang.String establishment_number;

    private java.lang.Boolean main_establishment;

    private java.lang.String legal_form_text;

    private java.lang.String activity;

    private java.lang.String description;

    private nl.webservices.www.soap.DutchBusinessDateV2 establishment_date;

    private nl.webservices.www.soap.DutchBusinessDateV2 date_since;

    private nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel;

    private java.lang.String[] remarks;

    private nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes;

    private nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address;

    private nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address;

    private java.lang.String[] telephone_numbers;

    private java.lang.String[] fax_numbers;

    private java.lang.String[] email_addresses;

    private java.lang.String[] domain_names;

    private java.lang.String[] trade_names;

    public DutchBusinessEstablishmentV2() {
    }

    public DutchBusinessEstablishmentV2(
           java.lang.String establishment_number,
           java.lang.Boolean main_establishment,
           java.lang.String legal_form_text,
           java.lang.String activity,
           java.lang.String description,
           nl.webservices.www.soap.DutchBusinessDateV2 establishment_date,
           nl.webservices.www.soap.DutchBusinessDateV2 date_since,
           nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel,
           java.lang.String[] remarks,
           nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes,
           nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address,
           nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address,
           java.lang.String[] telephone_numbers,
           java.lang.String[] fax_numbers,
           java.lang.String[] email_addresses,
           java.lang.String[] domain_names,
           java.lang.String[] trade_names) {
           this.establishment_number = establishment_number;
           this.main_establishment = main_establishment;
           this.legal_form_text = legal_form_text;
           this.activity = activity;
           this.description = description;
           this.establishment_date = establishment_date;
           this.date_since = date_since;
           this.personnel = personnel;
           this.remarks = remarks;
           this.sbi_codes = sbi_codes;
           this.establishment_address = establishment_address;
           this.correspondence_address = correspondence_address;
           this.telephone_numbers = telephone_numbers;
           this.fax_numbers = fax_numbers;
           this.email_addresses = email_addresses;
           this.domain_names = domain_names;
           this.trade_names = trade_names;
    }


    /**
     * Gets the establishment_number value for this DutchBusinessEstablishmentV2.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this DutchBusinessEstablishmentV2.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the main_establishment value for this DutchBusinessEstablishmentV2.
     * 
     * @return main_establishment
     */
    public java.lang.Boolean getMain_establishment() {
        return main_establishment;
    }


    /**
     * Sets the main_establishment value for this DutchBusinessEstablishmentV2.
     * 
     * @param main_establishment
     */
    public void setMain_establishment(java.lang.Boolean main_establishment) {
        this.main_establishment = main_establishment;
    }


    /**
     * Gets the legal_form_text value for this DutchBusinessEstablishmentV2.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this DutchBusinessEstablishmentV2.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the activity value for this DutchBusinessEstablishmentV2.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this DutchBusinessEstablishmentV2.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the description value for this DutchBusinessEstablishmentV2.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchBusinessEstablishmentV2.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the establishment_date value for this DutchBusinessEstablishmentV2.
     * 
     * @return establishment_date
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getEstablishment_date() {
        return establishment_date;
    }


    /**
     * Sets the establishment_date value for this DutchBusinessEstablishmentV2.
     * 
     * @param establishment_date
     */
    public void setEstablishment_date(nl.webservices.www.soap.DutchBusinessDateV2 establishment_date) {
        this.establishment_date = establishment_date;
    }


    /**
     * Gets the date_since value for this DutchBusinessEstablishmentV2.
     * 
     * @return date_since
     */
    public nl.webservices.www.soap.DutchBusinessDateV2 getDate_since() {
        return date_since;
    }


    /**
     * Sets the date_since value for this DutchBusinessEstablishmentV2.
     * 
     * @param date_since
     */
    public void setDate_since(nl.webservices.www.soap.DutchBusinessDateV2 date_since) {
        this.date_since = date_since;
    }


    /**
     * Gets the personnel value for this DutchBusinessEstablishmentV2.
     * 
     * @return personnel
     */
    public nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 getPersonnel() {
        return personnel;
    }


    /**
     * Sets the personnel value for this DutchBusinessEstablishmentV2.
     * 
     * @param personnel
     */
    public void setPersonnel(nl.webservices.www.soap.DutchBusinessPersonnelInfoV2 personnel) {
        this.personnel = personnel;
    }


    /**
     * Gets the remarks value for this DutchBusinessEstablishmentV2.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessEstablishmentV2.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the sbi_codes value for this DutchBusinessEstablishmentV2.
     * 
     * @return sbi_codes
     */
    public nl.webservices.www.soap.DutchBusinessSbiCodeV2[] getSbi_codes() {
        return sbi_codes;
    }


    /**
     * Sets the sbi_codes value for this DutchBusinessEstablishmentV2.
     * 
     * @param sbi_codes
     */
    public void setSbi_codes(nl.webservices.www.soap.DutchBusinessSbiCodeV2[] sbi_codes) {
        this.sbi_codes = sbi_codes;
    }


    /**
     * Gets the establishment_address value for this DutchBusinessEstablishmentV2.
     * 
     * @return establishment_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getEstablishment_address() {
        return establishment_address;
    }


    /**
     * Sets the establishment_address value for this DutchBusinessEstablishmentV2.
     * 
     * @param establishment_address
     */
    public void setEstablishment_address(nl.webservices.www.soap.DutchBusinessAddressV2 establishment_address) {
        this.establishment_address = establishment_address;
    }


    /**
     * Gets the correspondence_address value for this DutchBusinessEstablishmentV2.
     * 
     * @return correspondence_address
     */
    public nl.webservices.www.soap.DutchBusinessAddressV2 getCorrespondence_address() {
        return correspondence_address;
    }


    /**
     * Sets the correspondence_address value for this DutchBusinessEstablishmentV2.
     * 
     * @param correspondence_address
     */
    public void setCorrespondence_address(nl.webservices.www.soap.DutchBusinessAddressV2 correspondence_address) {
        this.correspondence_address = correspondence_address;
    }


    /**
     * Gets the telephone_numbers value for this DutchBusinessEstablishmentV2.
     * 
     * @return telephone_numbers
     */
    public java.lang.String[] getTelephone_numbers() {
        return telephone_numbers;
    }


    /**
     * Sets the telephone_numbers value for this DutchBusinessEstablishmentV2.
     * 
     * @param telephone_numbers
     */
    public void setTelephone_numbers(java.lang.String[] telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }


    /**
     * Gets the fax_numbers value for this DutchBusinessEstablishmentV2.
     * 
     * @return fax_numbers
     */
    public java.lang.String[] getFax_numbers() {
        return fax_numbers;
    }


    /**
     * Sets the fax_numbers value for this DutchBusinessEstablishmentV2.
     * 
     * @param fax_numbers
     */
    public void setFax_numbers(java.lang.String[] fax_numbers) {
        this.fax_numbers = fax_numbers;
    }


    /**
     * Gets the email_addresses value for this DutchBusinessEstablishmentV2.
     * 
     * @return email_addresses
     */
    public java.lang.String[] getEmail_addresses() {
        return email_addresses;
    }


    /**
     * Sets the email_addresses value for this DutchBusinessEstablishmentV2.
     * 
     * @param email_addresses
     */
    public void setEmail_addresses(java.lang.String[] email_addresses) {
        this.email_addresses = email_addresses;
    }


    /**
     * Gets the domain_names value for this DutchBusinessEstablishmentV2.
     * 
     * @return domain_names
     */
    public java.lang.String[] getDomain_names() {
        return domain_names;
    }


    /**
     * Sets the domain_names value for this DutchBusinessEstablishmentV2.
     * 
     * @param domain_names
     */
    public void setDomain_names(java.lang.String[] domain_names) {
        this.domain_names = domain_names;
    }


    /**
     * Gets the trade_names value for this DutchBusinessEstablishmentV2.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DutchBusinessEstablishmentV2.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessEstablishmentV2)) return false;
        DutchBusinessEstablishmentV2 other = (DutchBusinessEstablishmentV2) obj;
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
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.establishment_date==null && other.getEstablishment_date()==null) || 
             (this.establishment_date!=null &&
              this.establishment_date.equals(other.getEstablishment_date()))) &&
            ((this.date_since==null && other.getDate_since()==null) || 
             (this.date_since!=null &&
              this.date_since.equals(other.getDate_since()))) &&
            ((this.personnel==null && other.getPersonnel()==null) || 
             (this.personnel!=null &&
              this.personnel.equals(other.getPersonnel()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.sbi_codes==null && other.getSbi_codes()==null) || 
             (this.sbi_codes!=null &&
              java.util.Arrays.equals(this.sbi_codes, other.getSbi_codes()))) &&
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
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names())));
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
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessEstablishmentV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEstablishmentV2"));
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
        elemField.setFieldName("legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_text"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPersonnelInfoV2"));
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
        elemField.setFieldName("sbi_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSbiCodeV2"));
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
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
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
