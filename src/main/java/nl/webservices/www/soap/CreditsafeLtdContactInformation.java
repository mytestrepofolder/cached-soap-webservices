/**
 * CreditsafeLtdContactInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdContactInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone main_address;

    private nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone[] other_addresses;

    private nl.webservices.www.soap.CreditsafeStreetAddress[] previous_addresses;

    private java.lang.String[] email_addresses;

    private java.lang.String[] websites;

    public CreditsafeLtdContactInformation() {
    }

    public CreditsafeLtdContactInformation(
           nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone main_address,
           nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone[] other_addresses,
           nl.webservices.www.soap.CreditsafeStreetAddress[] previous_addresses,
           java.lang.String[] email_addresses,
           java.lang.String[] websites) {
           this.main_address = main_address;
           this.other_addresses = other_addresses;
           this.previous_addresses = previous_addresses;
           this.email_addresses = email_addresses;
           this.websites = websites;
    }


    /**
     * Gets the main_address value for this CreditsafeLtdContactInformation.
     * 
     * @return main_address
     */
    public nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone getMain_address() {
        return main_address;
    }


    /**
     * Sets the main_address value for this CreditsafeLtdContactInformation.
     * 
     * @param main_address
     */
    public void setMain_address(nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone main_address) {
        this.main_address = main_address;
    }


    /**
     * Gets the other_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @return other_addresses
     */
    public nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone[] getOther_addresses() {
        return other_addresses;
    }


    /**
     * Sets the other_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @param other_addresses
     */
    public void setOther_addresses(nl.webservices.www.soap.CreditsafeStreetAddressWithTelephone[] other_addresses) {
        this.other_addresses = other_addresses;
    }


    /**
     * Gets the previous_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @return previous_addresses
     */
    public nl.webservices.www.soap.CreditsafeStreetAddress[] getPrevious_addresses() {
        return previous_addresses;
    }


    /**
     * Sets the previous_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @param previous_addresses
     */
    public void setPrevious_addresses(nl.webservices.www.soap.CreditsafeStreetAddress[] previous_addresses) {
        this.previous_addresses = previous_addresses;
    }


    /**
     * Gets the email_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @return email_addresses
     */
    public java.lang.String[] getEmail_addresses() {
        return email_addresses;
    }


    /**
     * Sets the email_addresses value for this CreditsafeLtdContactInformation.
     * 
     * @param email_addresses
     */
    public void setEmail_addresses(java.lang.String[] email_addresses) {
        this.email_addresses = email_addresses;
    }


    /**
     * Gets the websites value for this CreditsafeLtdContactInformation.
     * 
     * @return websites
     */
    public java.lang.String[] getWebsites() {
        return websites;
    }


    /**
     * Sets the websites value for this CreditsafeLtdContactInformation.
     * 
     * @param websites
     */
    public void setWebsites(java.lang.String[] websites) {
        this.websites = websites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdContactInformation)) return false;
        CreditsafeLtdContactInformation other = (CreditsafeLtdContactInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.main_address==null && other.getMain_address()==null) || 
             (this.main_address!=null &&
              this.main_address.equals(other.getMain_address()))) &&
            ((this.other_addresses==null && other.getOther_addresses()==null) || 
             (this.other_addresses!=null &&
              java.util.Arrays.equals(this.other_addresses, other.getOther_addresses()))) &&
            ((this.previous_addresses==null && other.getPrevious_addresses()==null) || 
             (this.previous_addresses!=null &&
              java.util.Arrays.equals(this.previous_addresses, other.getPrevious_addresses()))) &&
            ((this.email_addresses==null && other.getEmail_addresses()==null) || 
             (this.email_addresses!=null &&
              java.util.Arrays.equals(this.email_addresses, other.getEmail_addresses()))) &&
            ((this.websites==null && other.getWebsites()==null) || 
             (this.websites!=null &&
              java.util.Arrays.equals(this.websites, other.getWebsites())));
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
        if (getMain_address() != null) {
            _hashCode += getMain_address().hashCode();
        }
        if (getOther_addresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOther_addresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOther_addresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrevious_addresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevious_addresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevious_addresses(), i);
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
        if (getWebsites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebsites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebsites(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdContactInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdContactInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeStreetAddressWithTelephone"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeStreetAddressWithTelephone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeStreetAddress"));
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
        elemField.setFieldName("websites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "websites"));
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
