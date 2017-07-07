/**
 * GCRBranchOffice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRBranchOffice  implements java.io.Serializable {
    private java.lang.String branch_office_id;

    private java.lang.String business_name;

    private nl.webservices.www.soap.GCRTradeName[] trade_names;

    private nl.webservices.www.soap.GCRAddress[] addresses;

    private nl.webservices.www.soap.GCRTelephoneNumber[] telephone_numbers;

    private java.lang.String[] email_addresses;

    private java.util.Date estabishment_date;

    private nl.webservices.www.soap.GCRDiscontinuance discontinuance;

    public GCRBranchOffice() {
    }

    public GCRBranchOffice(
           java.lang.String branch_office_id,
           java.lang.String business_name,
           nl.webservices.www.soap.GCRTradeName[] trade_names,
           nl.webservices.www.soap.GCRAddress[] addresses,
           nl.webservices.www.soap.GCRTelephoneNumber[] telephone_numbers,
           java.lang.String[] email_addresses,
           java.util.Date estabishment_date,
           nl.webservices.www.soap.GCRDiscontinuance discontinuance) {
           this.branch_office_id = branch_office_id;
           this.business_name = business_name;
           this.trade_names = trade_names;
           this.addresses = addresses;
           this.telephone_numbers = telephone_numbers;
           this.email_addresses = email_addresses;
           this.estabishment_date = estabishment_date;
           this.discontinuance = discontinuance;
    }


    /**
     * Gets the branch_office_id value for this GCRBranchOffice.
     * 
     * @return branch_office_id
     */
    public java.lang.String getBranch_office_id() {
        return branch_office_id;
    }


    /**
     * Sets the branch_office_id value for this GCRBranchOffice.
     * 
     * @param branch_office_id
     */
    public void setBranch_office_id(java.lang.String branch_office_id) {
        this.branch_office_id = branch_office_id;
    }


    /**
     * Gets the business_name value for this GCRBranchOffice.
     * 
     * @return business_name
     */
    public java.lang.String getBusiness_name() {
        return business_name;
    }


    /**
     * Sets the business_name value for this GCRBranchOffice.
     * 
     * @param business_name
     */
    public void setBusiness_name(java.lang.String business_name) {
        this.business_name = business_name;
    }


    /**
     * Gets the trade_names value for this GCRBranchOffice.
     * 
     * @return trade_names
     */
    public nl.webservices.www.soap.GCRTradeName[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this GCRBranchOffice.
     * 
     * @param trade_names
     */
    public void setTrade_names(nl.webservices.www.soap.GCRTradeName[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the addresses value for this GCRBranchOffice.
     * 
     * @return addresses
     */
    public nl.webservices.www.soap.GCRAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this GCRBranchOffice.
     * 
     * @param addresses
     */
    public void setAddresses(nl.webservices.www.soap.GCRAddress[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the telephone_numbers value for this GCRBranchOffice.
     * 
     * @return telephone_numbers
     */
    public nl.webservices.www.soap.GCRTelephoneNumber[] getTelephone_numbers() {
        return telephone_numbers;
    }


    /**
     * Sets the telephone_numbers value for this GCRBranchOffice.
     * 
     * @param telephone_numbers
     */
    public void setTelephone_numbers(nl.webservices.www.soap.GCRTelephoneNumber[] telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }


    /**
     * Gets the email_addresses value for this GCRBranchOffice.
     * 
     * @return email_addresses
     */
    public java.lang.String[] getEmail_addresses() {
        return email_addresses;
    }


    /**
     * Sets the email_addresses value for this GCRBranchOffice.
     * 
     * @param email_addresses
     */
    public void setEmail_addresses(java.lang.String[] email_addresses) {
        this.email_addresses = email_addresses;
    }


    /**
     * Gets the estabishment_date value for this GCRBranchOffice.
     * 
     * @return estabishment_date
     */
    public java.util.Date getEstabishment_date() {
        return estabishment_date;
    }


    /**
     * Sets the estabishment_date value for this GCRBranchOffice.
     * 
     * @param estabishment_date
     */
    public void setEstabishment_date(java.util.Date estabishment_date) {
        this.estabishment_date = estabishment_date;
    }


    /**
     * Gets the discontinuance value for this GCRBranchOffice.
     * 
     * @return discontinuance
     */
    public nl.webservices.www.soap.GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }


    /**
     * Sets the discontinuance value for this GCRBranchOffice.
     * 
     * @param discontinuance
     */
    public void setDiscontinuance(nl.webservices.www.soap.GCRDiscontinuance discontinuance) {
        this.discontinuance = discontinuance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRBranchOffice)) return false;
        GCRBranchOffice other = (GCRBranchOffice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branch_office_id==null && other.getBranch_office_id()==null) || 
             (this.branch_office_id!=null &&
              this.branch_office_id.equals(other.getBranch_office_id()))) &&
            ((this.business_name==null && other.getBusiness_name()==null) || 
             (this.business_name!=null &&
              this.business_name.equals(other.getBusiness_name()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.telephone_numbers==null && other.getTelephone_numbers()==null) || 
             (this.telephone_numbers!=null &&
              java.util.Arrays.equals(this.telephone_numbers, other.getTelephone_numbers()))) &&
            ((this.email_addresses==null && other.getEmail_addresses()==null) || 
             (this.email_addresses!=null &&
              java.util.Arrays.equals(this.email_addresses, other.getEmail_addresses()))) &&
            ((this.estabishment_date==null && other.getEstabishment_date()==null) || 
             (this.estabishment_date!=null &&
              this.estabishment_date.equals(other.getEstabishment_date()))) &&
            ((this.discontinuance==null && other.getDiscontinuance()==null) || 
             (this.discontinuance!=null &&
              this.discontinuance.equals(other.getDiscontinuance())));
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
        if (getBranch_office_id() != null) {
            _hashCode += getBranch_office_id().hashCode();
        }
        if (getBusiness_name() != null) {
            _hashCode += getBusiness_name().hashCode();
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
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getEstabishment_date() != null) {
            _hashCode += getEstabishment_date().hashCode();
        }
        if (getDiscontinuance() != null) {
            _hashCode += getDiscontinuance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRBranchOffice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBranchOffice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch_office_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "branch_office_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTradeName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTelephoneNumber"));
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
        elemField.setFieldName("estabishment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "estabishment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discontinuance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "discontinuance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDiscontinuance"));
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
