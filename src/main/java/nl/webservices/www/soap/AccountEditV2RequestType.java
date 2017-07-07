/**
 * AccountEditV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AccountEditV2RequestType  implements java.io.Serializable {
    private int accountid;

    private java.lang.String address;

    private java.lang.String contactname;

    private java.lang.String contactemail;

    private java.lang.String telephone;

    private java.lang.String fax;

    private java.lang.String description;

    private float balancethreshold;

    public AccountEditV2RequestType() {
    }

    public AccountEditV2RequestType(
           int accountid,
           java.lang.String address,
           java.lang.String contactname,
           java.lang.String contactemail,
           java.lang.String telephone,
           java.lang.String fax,
           java.lang.String description,
           float balancethreshold) {
           this.accountid = accountid;
           this.address = address;
           this.contactname = contactname;
           this.contactemail = contactemail;
           this.telephone = telephone;
           this.fax = fax;
           this.description = description;
           this.balancethreshold = balancethreshold;
    }


    /**
     * Gets the accountid value for this AccountEditV2RequestType.
     * 
     * @return accountid
     */
    public int getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this AccountEditV2RequestType.
     * 
     * @param accountid
     */
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }


    /**
     * Gets the address value for this AccountEditV2RequestType.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AccountEditV2RequestType.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the contactname value for this AccountEditV2RequestType.
     * 
     * @return contactname
     */
    public java.lang.String getContactname() {
        return contactname;
    }


    /**
     * Sets the contactname value for this AccountEditV2RequestType.
     * 
     * @param contactname
     */
    public void setContactname(java.lang.String contactname) {
        this.contactname = contactname;
    }


    /**
     * Gets the contactemail value for this AccountEditV2RequestType.
     * 
     * @return contactemail
     */
    public java.lang.String getContactemail() {
        return contactemail;
    }


    /**
     * Sets the contactemail value for this AccountEditV2RequestType.
     * 
     * @param contactemail
     */
    public void setContactemail(java.lang.String contactemail) {
        this.contactemail = contactemail;
    }


    /**
     * Gets the telephone value for this AccountEditV2RequestType.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this AccountEditV2RequestType.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this AccountEditV2RequestType.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AccountEditV2RequestType.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the description value for this AccountEditV2RequestType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountEditV2RequestType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the balancethreshold value for this AccountEditV2RequestType.
     * 
     * @return balancethreshold
     */
    public float getBalancethreshold() {
        return balancethreshold;
    }


    /**
     * Sets the balancethreshold value for this AccountEditV2RequestType.
     * 
     * @param balancethreshold
     */
    public void setBalancethreshold(float balancethreshold) {
        this.balancethreshold = balancethreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountEditV2RequestType)) return false;
        AccountEditV2RequestType other = (AccountEditV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountid == other.getAccountid() &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.contactname==null && other.getContactname()==null) || 
             (this.contactname!=null &&
              this.contactname.equals(other.getContactname()))) &&
            ((this.contactemail==null && other.getContactemail()==null) || 
             (this.contactemail!=null &&
              this.contactemail.equals(other.getContactemail()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.balancethreshold == other.getBalancethreshold();
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
        _hashCode += getAccountid();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getContactname() != null) {
            _hashCode += getContactname().hashCode();
        }
        if (getContactemail() != null) {
            _hashCode += getContactemail().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Float(getBalancethreshold()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountEditV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountEditV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contactname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactemail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contactemail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancethreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balancethreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
