/**
 * RiskInsolvencyCurator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskInsolvencyCurator  implements java.io.Serializable {
    private java.lang.String titles;

    private java.lang.String initials;

    private java.lang.String prefix;

    private java.lang.String last_name;

    private nl.webservices.www.soap.RiskAddress address;

    private java.lang.String telephone_number;

    private java.lang.String fax_number;

    private java.lang.String email_address;

    private java.util.Date mutation_date;

    public RiskInsolvencyCurator() {
    }

    public RiskInsolvencyCurator(
           java.lang.String titles,
           java.lang.String initials,
           java.lang.String prefix,
           java.lang.String last_name,
           nl.webservices.www.soap.RiskAddress address,
           java.lang.String telephone_number,
           java.lang.String fax_number,
           java.lang.String email_address,
           java.util.Date mutation_date) {
           this.titles = titles;
           this.initials = initials;
           this.prefix = prefix;
           this.last_name = last_name;
           this.address = address;
           this.telephone_number = telephone_number;
           this.fax_number = fax_number;
           this.email_address = email_address;
           this.mutation_date = mutation_date;
    }


    /**
     * Gets the titles value for this RiskInsolvencyCurator.
     * 
     * @return titles
     */
    public java.lang.String getTitles() {
        return titles;
    }


    /**
     * Sets the titles value for this RiskInsolvencyCurator.
     * 
     * @param titles
     */
    public void setTitles(java.lang.String titles) {
        this.titles = titles;
    }


    /**
     * Gets the initials value for this RiskInsolvencyCurator.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this RiskInsolvencyCurator.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the prefix value for this RiskInsolvencyCurator.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this RiskInsolvencyCurator.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the last_name value for this RiskInsolvencyCurator.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this RiskInsolvencyCurator.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the address value for this RiskInsolvencyCurator.
     * 
     * @return address
     */
    public nl.webservices.www.soap.RiskAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this RiskInsolvencyCurator.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.RiskAddress address) {
        this.address = address;
    }


    /**
     * Gets the telephone_number value for this RiskInsolvencyCurator.
     * 
     * @return telephone_number
     */
    public java.lang.String getTelephone_number() {
        return telephone_number;
    }


    /**
     * Sets the telephone_number value for this RiskInsolvencyCurator.
     * 
     * @param telephone_number
     */
    public void setTelephone_number(java.lang.String telephone_number) {
        this.telephone_number = telephone_number;
    }


    /**
     * Gets the fax_number value for this RiskInsolvencyCurator.
     * 
     * @return fax_number
     */
    public java.lang.String getFax_number() {
        return fax_number;
    }


    /**
     * Sets the fax_number value for this RiskInsolvencyCurator.
     * 
     * @param fax_number
     */
    public void setFax_number(java.lang.String fax_number) {
        this.fax_number = fax_number;
    }


    /**
     * Gets the email_address value for this RiskInsolvencyCurator.
     * 
     * @return email_address
     */
    public java.lang.String getEmail_address() {
        return email_address;
    }


    /**
     * Sets the email_address value for this RiskInsolvencyCurator.
     * 
     * @param email_address
     */
    public void setEmail_address(java.lang.String email_address) {
        this.email_address = email_address;
    }


    /**
     * Gets the mutation_date value for this RiskInsolvencyCurator.
     * 
     * @return mutation_date
     */
    public java.util.Date getMutation_date() {
        return mutation_date;
    }


    /**
     * Sets the mutation_date value for this RiskInsolvencyCurator.
     * 
     * @param mutation_date
     */
    public void setMutation_date(java.util.Date mutation_date) {
        this.mutation_date = mutation_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskInsolvencyCurator)) return false;
        RiskInsolvencyCurator other = (RiskInsolvencyCurator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titles==null && other.getTitles()==null) || 
             (this.titles!=null &&
              this.titles.equals(other.getTitles()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.telephone_number==null && other.getTelephone_number()==null) || 
             (this.telephone_number!=null &&
              this.telephone_number.equals(other.getTelephone_number()))) &&
            ((this.fax_number==null && other.getFax_number()==null) || 
             (this.fax_number!=null &&
              this.fax_number.equals(other.getFax_number()))) &&
            ((this.email_address==null && other.getEmail_address()==null) || 
             (this.email_address!=null &&
              this.email_address.equals(other.getEmail_address()))) &&
            ((this.mutation_date==null && other.getMutation_date()==null) || 
             (this.mutation_date!=null &&
              this.mutation_date.equals(other.getMutation_date())));
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
        if (getTitles() != null) {
            _hashCode += getTitles().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTelephone_number() != null) {
            _hashCode += getTelephone_number().hashCode();
        }
        if (getFax_number() != null) {
            _hashCode += getFax_number().hashCode();
        }
        if (getEmail_address() != null) {
            _hashCode += getEmail_address().hashCode();
        }
        if (getMutation_date() != null) {
            _hashCode += getMutation_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskInsolvencyCurator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyCurator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "titles"));
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
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefix"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fax_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "email_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mutation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
