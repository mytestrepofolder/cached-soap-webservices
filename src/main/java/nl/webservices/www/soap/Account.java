/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Account  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String address;

    private java.lang.String environment;

    private boolean reseller;

    private java.lang.String contactname;

    private java.lang.String contactemail;

    private java.lang.String telephone;

    private java.lang.String fax;

    private java.lang.String description;

    private java.lang.String creationtime;

    private java.lang.String lastmodified;

    private int credits;

    private java.lang.String clientcode;

    private java.lang.String comments;

    private java.lang.String usernameprefix;

    private int creditthreshold;

    public Account() {
    }

    public Account(
           int id,
           java.lang.String name,
           java.lang.String address,
           java.lang.String environment,
           boolean reseller,
           java.lang.String contactname,
           java.lang.String contactemail,
           java.lang.String telephone,
           java.lang.String fax,
           java.lang.String description,
           java.lang.String creationtime,
           java.lang.String lastmodified,
           int credits,
           java.lang.String clientcode,
           java.lang.String comments,
           java.lang.String usernameprefix,
           int creditthreshold) {
           this.id = id;
           this.name = name;
           this.address = address;
           this.environment = environment;
           this.reseller = reseller;
           this.contactname = contactname;
           this.contactemail = contactemail;
           this.telephone = telephone;
           this.fax = fax;
           this.description = description;
           this.creationtime = creationtime;
           this.lastmodified = lastmodified;
           this.credits = credits;
           this.clientcode = clientcode;
           this.comments = comments;
           this.usernameprefix = usernameprefix;
           this.creditthreshold = creditthreshold;
    }


    /**
     * Gets the id value for this Account.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Account.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Account.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Account.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this Account.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Account.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the environment value for this Account.
     * 
     * @return environment
     */
    public java.lang.String getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this Account.
     * 
     * @param environment
     */
    public void setEnvironment(java.lang.String environment) {
        this.environment = environment;
    }


    /**
     * Gets the reseller value for this Account.
     * 
     * @return reseller
     */
    public boolean isReseller() {
        return reseller;
    }


    /**
     * Sets the reseller value for this Account.
     * 
     * @param reseller
     */
    public void setReseller(boolean reseller) {
        this.reseller = reseller;
    }


    /**
     * Gets the contactname value for this Account.
     * 
     * @return contactname
     */
    public java.lang.String getContactname() {
        return contactname;
    }


    /**
     * Sets the contactname value for this Account.
     * 
     * @param contactname
     */
    public void setContactname(java.lang.String contactname) {
        this.contactname = contactname;
    }


    /**
     * Gets the contactemail value for this Account.
     * 
     * @return contactemail
     */
    public java.lang.String getContactemail() {
        return contactemail;
    }


    /**
     * Sets the contactemail value for this Account.
     * 
     * @param contactemail
     */
    public void setContactemail(java.lang.String contactemail) {
        this.contactemail = contactemail;
    }


    /**
     * Gets the telephone value for this Account.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this Account.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this Account.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Account.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the description value for this Account.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Account.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creationtime value for this Account.
     * 
     * @return creationtime
     */
    public java.lang.String getCreationtime() {
        return creationtime;
    }


    /**
     * Sets the creationtime value for this Account.
     * 
     * @param creationtime
     */
    public void setCreationtime(java.lang.String creationtime) {
        this.creationtime = creationtime;
    }


    /**
     * Gets the lastmodified value for this Account.
     * 
     * @return lastmodified
     */
    public java.lang.String getLastmodified() {
        return lastmodified;
    }


    /**
     * Sets the lastmodified value for this Account.
     * 
     * @param lastmodified
     */
    public void setLastmodified(java.lang.String lastmodified) {
        this.lastmodified = lastmodified;
    }


    /**
     * Gets the credits value for this Account.
     * 
     * @return credits
     */
    public int getCredits() {
        return credits;
    }


    /**
     * Sets the credits value for this Account.
     * 
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }


    /**
     * Gets the clientcode value for this Account.
     * 
     * @return clientcode
     */
    public java.lang.String getClientcode() {
        return clientcode;
    }


    /**
     * Sets the clientcode value for this Account.
     * 
     * @param clientcode
     */
    public void setClientcode(java.lang.String clientcode) {
        this.clientcode = clientcode;
    }


    /**
     * Gets the comments value for this Account.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Account.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the usernameprefix value for this Account.
     * 
     * @return usernameprefix
     */
    public java.lang.String getUsernameprefix() {
        return usernameprefix;
    }


    /**
     * Sets the usernameprefix value for this Account.
     * 
     * @param usernameprefix
     */
    public void setUsernameprefix(java.lang.String usernameprefix) {
        this.usernameprefix = usernameprefix;
    }


    /**
     * Gets the creditthreshold value for this Account.
     * 
     * @return creditthreshold
     */
    public int getCreditthreshold() {
        return creditthreshold;
    }


    /**
     * Sets the creditthreshold value for this Account.
     * 
     * @param creditthreshold
     */
    public void setCreditthreshold(int creditthreshold) {
        this.creditthreshold = creditthreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment()))) &&
            this.reseller == other.isReseller() &&
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
            ((this.creationtime==null && other.getCreationtime()==null) || 
             (this.creationtime!=null &&
              this.creationtime.equals(other.getCreationtime()))) &&
            ((this.lastmodified==null && other.getLastmodified()==null) || 
             (this.lastmodified!=null &&
              this.lastmodified.equals(other.getLastmodified()))) &&
            this.credits == other.getCredits() &&
            ((this.clientcode==null && other.getClientcode()==null) || 
             (this.clientcode!=null &&
              this.clientcode.equals(other.getClientcode()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.usernameprefix==null && other.getUsernameprefix()==null) || 
             (this.usernameprefix!=null &&
              this.usernameprefix.equals(other.getUsernameprefix()))) &&
            this.creditthreshold == other.getCreditthreshold();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        _hashCode += (isReseller() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getCreationtime() != null) {
            _hashCode += getCreationtime().hashCode();
        }
        if (getLastmodified() != null) {
            _hashCode += getLastmodified().hashCode();
        }
        _hashCode += getCredits();
        if (getClientcode() != null) {
            _hashCode += getClientcode().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getUsernameprefix() != null) {
            _hashCode += getUsernameprefix().hashCode();
        }
        _hashCode += getCreditthreshold();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
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
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reseller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("usernameprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usernameprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "creditthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
