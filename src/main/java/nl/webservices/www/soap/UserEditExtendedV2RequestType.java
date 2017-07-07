/**
 * UserEditExtendedV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class UserEditExtendedV2RequestType  implements java.io.Serializable {
    private int userid;

    private java.lang.String nickname;

    private java.lang.String password;

    private java.lang.String email;

    private java.lang.String companyname;

    private java.lang.String address;

    private java.lang.String contactname;

    private java.lang.String contactemail;

    private java.lang.String telephone;

    private java.lang.String fax;

    private java.lang.String clientcode;

    private java.lang.String comments;

    private int accountid;

    private float balancethreshold;

    private java.lang.String notificationrecipients;

    public UserEditExtendedV2RequestType() {
    }

    public UserEditExtendedV2RequestType(
           int userid,
           java.lang.String nickname,
           java.lang.String password,
           java.lang.String email,
           java.lang.String companyname,
           java.lang.String address,
           java.lang.String contactname,
           java.lang.String contactemail,
           java.lang.String telephone,
           java.lang.String fax,
           java.lang.String clientcode,
           java.lang.String comments,
           int accountid,
           float balancethreshold,
           java.lang.String notificationrecipients) {
           this.userid = userid;
           this.nickname = nickname;
           this.password = password;
           this.email = email;
           this.companyname = companyname;
           this.address = address;
           this.contactname = contactname;
           this.contactemail = contactemail;
           this.telephone = telephone;
           this.fax = fax;
           this.clientcode = clientcode;
           this.comments = comments;
           this.accountid = accountid;
           this.balancethreshold = balancethreshold;
           this.notificationrecipients = notificationrecipients;
    }


    /**
     * Gets the userid value for this UserEditExtendedV2RequestType.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserEditExtendedV2RequestType.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the nickname value for this UserEditExtendedV2RequestType.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this UserEditExtendedV2RequestType.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the password value for this UserEditExtendedV2RequestType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserEditExtendedV2RequestType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the email value for this UserEditExtendedV2RequestType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserEditExtendedV2RequestType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the companyname value for this UserEditExtendedV2RequestType.
     * 
     * @return companyname
     */
    public java.lang.String getCompanyname() {
        return companyname;
    }


    /**
     * Sets the companyname value for this UserEditExtendedV2RequestType.
     * 
     * @param companyname
     */
    public void setCompanyname(java.lang.String companyname) {
        this.companyname = companyname;
    }


    /**
     * Gets the address value for this UserEditExtendedV2RequestType.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UserEditExtendedV2RequestType.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the contactname value for this UserEditExtendedV2RequestType.
     * 
     * @return contactname
     */
    public java.lang.String getContactname() {
        return contactname;
    }


    /**
     * Sets the contactname value for this UserEditExtendedV2RequestType.
     * 
     * @param contactname
     */
    public void setContactname(java.lang.String contactname) {
        this.contactname = contactname;
    }


    /**
     * Gets the contactemail value for this UserEditExtendedV2RequestType.
     * 
     * @return contactemail
     */
    public java.lang.String getContactemail() {
        return contactemail;
    }


    /**
     * Sets the contactemail value for this UserEditExtendedV2RequestType.
     * 
     * @param contactemail
     */
    public void setContactemail(java.lang.String contactemail) {
        this.contactemail = contactemail;
    }


    /**
     * Gets the telephone value for this UserEditExtendedV2RequestType.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this UserEditExtendedV2RequestType.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this UserEditExtendedV2RequestType.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this UserEditExtendedV2RequestType.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the clientcode value for this UserEditExtendedV2RequestType.
     * 
     * @return clientcode
     */
    public java.lang.String getClientcode() {
        return clientcode;
    }


    /**
     * Sets the clientcode value for this UserEditExtendedV2RequestType.
     * 
     * @param clientcode
     */
    public void setClientcode(java.lang.String clientcode) {
        this.clientcode = clientcode;
    }


    /**
     * Gets the comments value for this UserEditExtendedV2RequestType.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this UserEditExtendedV2RequestType.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the accountid value for this UserEditExtendedV2RequestType.
     * 
     * @return accountid
     */
    public int getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this UserEditExtendedV2RequestType.
     * 
     * @param accountid
     */
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }


    /**
     * Gets the balancethreshold value for this UserEditExtendedV2RequestType.
     * 
     * @return balancethreshold
     */
    public float getBalancethreshold() {
        return balancethreshold;
    }


    /**
     * Sets the balancethreshold value for this UserEditExtendedV2RequestType.
     * 
     * @param balancethreshold
     */
    public void setBalancethreshold(float balancethreshold) {
        this.balancethreshold = balancethreshold;
    }


    /**
     * Gets the notificationrecipients value for this UserEditExtendedV2RequestType.
     * 
     * @return notificationrecipients
     */
    public java.lang.String getNotificationrecipients() {
        return notificationrecipients;
    }


    /**
     * Sets the notificationrecipients value for this UserEditExtendedV2RequestType.
     * 
     * @param notificationrecipients
     */
    public void setNotificationrecipients(java.lang.String notificationrecipients) {
        this.notificationrecipients = notificationrecipients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserEditExtendedV2RequestType)) return false;
        UserEditExtendedV2RequestType other = (UserEditExtendedV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userid == other.getUserid() &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.companyname==null && other.getCompanyname()==null) || 
             (this.companyname!=null &&
              this.companyname.equals(other.getCompanyname()))) &&
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
            ((this.clientcode==null && other.getClientcode()==null) || 
             (this.clientcode!=null &&
              this.clientcode.equals(other.getClientcode()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.accountid == other.getAccountid() &&
            this.balancethreshold == other.getBalancethreshold() &&
            ((this.notificationrecipients==null && other.getNotificationrecipients()==null) || 
             (this.notificationrecipients!=null &&
              this.notificationrecipients.equals(other.getNotificationrecipients())));
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
        _hashCode += getUserid();
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCompanyname() != null) {
            _hashCode += getCompanyname().hashCode();
        }
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
        if (getClientcode() != null) {
            _hashCode += getClientcode().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += getAccountid();
        _hashCode += new Float(getBalancethreshold()).hashCode();
        if (getNotificationrecipients() != null) {
            _hashCode += getNotificationrecipients().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserEditExtendedV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userEditExtendedV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "companyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("clientcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "clientcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancethreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "balancethreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationrecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "notificationrecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
