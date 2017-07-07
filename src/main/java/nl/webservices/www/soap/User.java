/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class User  implements java.io.Serializable {
    private int id;

    private java.lang.String nickname;

    private java.lang.String email;

    private java.lang.String companyname;

    private java.lang.String address;

    private java.lang.String contactname;

    private java.lang.String contactemail;

    private java.lang.String telephone;

    private java.lang.String fax;

    private int credits;

    private java.lang.String clientcode;

    private java.lang.String comments;

    private java.lang.String creationtime;

    private java.lang.String lastmodified;

    private boolean active;

    private int account_id;

    private java.lang.String account_name;

    private nl.webservices.www.soap.UserGroup[] usergroups;

    private int creditthreshold;

    private java.lang.String notificationrecipients;

    public User() {
    }

    public User(
           int id,
           java.lang.String nickname,
           java.lang.String email,
           java.lang.String companyname,
           java.lang.String address,
           java.lang.String contactname,
           java.lang.String contactemail,
           java.lang.String telephone,
           java.lang.String fax,
           int credits,
           java.lang.String clientcode,
           java.lang.String comments,
           java.lang.String creationtime,
           java.lang.String lastmodified,
           boolean active,
           int account_id,
           java.lang.String account_name,
           nl.webservices.www.soap.UserGroup[] usergroups,
           int creditthreshold,
           java.lang.String notificationrecipients) {
           this.id = id;
           this.nickname = nickname;
           this.email = email;
           this.companyname = companyname;
           this.address = address;
           this.contactname = contactname;
           this.contactemail = contactemail;
           this.telephone = telephone;
           this.fax = fax;
           this.credits = credits;
           this.clientcode = clientcode;
           this.comments = comments;
           this.creationtime = creationtime;
           this.lastmodified = lastmodified;
           this.active = active;
           this.account_id = account_id;
           this.account_name = account_name;
           this.usergroups = usergroups;
           this.creditthreshold = creditthreshold;
           this.notificationrecipients = notificationrecipients;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nickname value for this User.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this User.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the companyname value for this User.
     * 
     * @return companyname
     */
    public java.lang.String getCompanyname() {
        return companyname;
    }


    /**
     * Sets the companyname value for this User.
     * 
     * @param companyname
     */
    public void setCompanyname(java.lang.String companyname) {
        this.companyname = companyname;
    }


    /**
     * Gets the address value for this User.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this User.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the contactname value for this User.
     * 
     * @return contactname
     */
    public java.lang.String getContactname() {
        return contactname;
    }


    /**
     * Sets the contactname value for this User.
     * 
     * @param contactname
     */
    public void setContactname(java.lang.String contactname) {
        this.contactname = contactname;
    }


    /**
     * Gets the contactemail value for this User.
     * 
     * @return contactemail
     */
    public java.lang.String getContactemail() {
        return contactemail;
    }


    /**
     * Sets the contactemail value for this User.
     * 
     * @param contactemail
     */
    public void setContactemail(java.lang.String contactemail) {
        this.contactemail = contactemail;
    }


    /**
     * Gets the telephone value for this User.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this User.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this User.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this User.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the credits value for this User.
     * 
     * @return credits
     */
    public int getCredits() {
        return credits;
    }


    /**
     * Sets the credits value for this User.
     * 
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }


    /**
     * Gets the clientcode value for this User.
     * 
     * @return clientcode
     */
    public java.lang.String getClientcode() {
        return clientcode;
    }


    /**
     * Sets the clientcode value for this User.
     * 
     * @param clientcode
     */
    public void setClientcode(java.lang.String clientcode) {
        this.clientcode = clientcode;
    }


    /**
     * Gets the comments value for this User.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this User.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the creationtime value for this User.
     * 
     * @return creationtime
     */
    public java.lang.String getCreationtime() {
        return creationtime;
    }


    /**
     * Sets the creationtime value for this User.
     * 
     * @param creationtime
     */
    public void setCreationtime(java.lang.String creationtime) {
        this.creationtime = creationtime;
    }


    /**
     * Gets the lastmodified value for this User.
     * 
     * @return lastmodified
     */
    public java.lang.String getLastmodified() {
        return lastmodified;
    }


    /**
     * Sets the lastmodified value for this User.
     * 
     * @param lastmodified
     */
    public void setLastmodified(java.lang.String lastmodified) {
        this.lastmodified = lastmodified;
    }


    /**
     * Gets the active value for this User.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this User.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the account_id value for this User.
     * 
     * @return account_id
     */
    public int getAccount_id() {
        return account_id;
    }


    /**
     * Sets the account_id value for this User.
     * 
     * @param account_id
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }


    /**
     * Gets the account_name value for this User.
     * 
     * @return account_name
     */
    public java.lang.String getAccount_name() {
        return account_name;
    }


    /**
     * Sets the account_name value for this User.
     * 
     * @param account_name
     */
    public void setAccount_name(java.lang.String account_name) {
        this.account_name = account_name;
    }


    /**
     * Gets the usergroups value for this User.
     * 
     * @return usergroups
     */
    public nl.webservices.www.soap.UserGroup[] getUsergroups() {
        return usergroups;
    }


    /**
     * Sets the usergroups value for this User.
     * 
     * @param usergroups
     */
    public void setUsergroups(nl.webservices.www.soap.UserGroup[] usergroups) {
        this.usergroups = usergroups;
    }


    /**
     * Gets the creditthreshold value for this User.
     * 
     * @return creditthreshold
     */
    public int getCreditthreshold() {
        return creditthreshold;
    }


    /**
     * Sets the creditthreshold value for this User.
     * 
     * @param creditthreshold
     */
    public void setCreditthreshold(int creditthreshold) {
        this.creditthreshold = creditthreshold;
    }


    /**
     * Gets the notificationrecipients value for this User.
     * 
     * @return notificationrecipients
     */
    public java.lang.String getNotificationrecipients() {
        return notificationrecipients;
    }


    /**
     * Sets the notificationrecipients value for this User.
     * 
     * @param notificationrecipients
     */
    public void setNotificationrecipients(java.lang.String notificationrecipients) {
        this.notificationrecipients = notificationrecipients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
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
            this.credits == other.getCredits() &&
            ((this.clientcode==null && other.getClientcode()==null) || 
             (this.clientcode!=null &&
              this.clientcode.equals(other.getClientcode()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.creationtime==null && other.getCreationtime()==null) || 
             (this.creationtime!=null &&
              this.creationtime.equals(other.getCreationtime()))) &&
            ((this.lastmodified==null && other.getLastmodified()==null) || 
             (this.lastmodified!=null &&
              this.lastmodified.equals(other.getLastmodified()))) &&
            this.active == other.isActive() &&
            this.account_id == other.getAccount_id() &&
            ((this.account_name==null && other.getAccount_name()==null) || 
             (this.account_name!=null &&
              this.account_name.equals(other.getAccount_name()))) &&
            ((this.usergroups==null && other.getUsergroups()==null) || 
             (this.usergroups!=null &&
              java.util.Arrays.equals(this.usergroups, other.getUsergroups()))) &&
            this.creditthreshold == other.getCreditthreshold() &&
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
        _hashCode += getId();
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
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
        _hashCode += getCredits();
        if (getClientcode() != null) {
            _hashCode += getClientcode().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCreationtime() != null) {
            _hashCode += getCreationtime().hashCode();
        }
        if (getLastmodified() != null) {
            _hashCode += getLastmodified().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAccount_id();
        if (getAccount_name() != null) {
            _hashCode += getAccount_name().hashCode();
        }
        if (getUsergroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsergroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsergroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCreditthreshold();
        if (getNotificationrecipients() != null) {
            _hashCode += getNotificationrecipients().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
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
        elemField.setFieldName("credits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("creationtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "creationtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastmodified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "lastmodified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "account_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "account_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usergroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usergroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "UserGroup"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "creditthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
