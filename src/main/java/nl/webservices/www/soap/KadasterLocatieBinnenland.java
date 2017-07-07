/**
 * KadasterLocatieBinnenland.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterLocatieBinnenland  implements java.io.Serializable {
    private java.lang.String plaats;

    private java.lang.String straatnaam;

    private java.lang.String postcode;

    private java.lang.Integer huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private java.lang.String huisletter;

    private java.lang.String positie;

    public KadasterLocatieBinnenland() {
    }

    public KadasterLocatieBinnenland(
           java.lang.String plaats,
           java.lang.String straatnaam,
           java.lang.String postcode,
           java.lang.Integer huisnummer,
           java.lang.String huisnummer_toevoeging,
           java.lang.String huisletter,
           java.lang.String positie) {
           this.plaats = plaats;
           this.straatnaam = straatnaam;
           this.postcode = postcode;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.huisletter = huisletter;
           this.positie = positie;
    }


    /**
     * Gets the plaats value for this KadasterLocatieBinnenland.
     * 
     * @return plaats
     */
    public java.lang.String getPlaats() {
        return plaats;
    }


    /**
     * Sets the plaats value for this KadasterLocatieBinnenland.
     * 
     * @param plaats
     */
    public void setPlaats(java.lang.String plaats) {
        this.plaats = plaats;
    }


    /**
     * Gets the straatnaam value for this KadasterLocatieBinnenland.
     * 
     * @return straatnaam
     */
    public java.lang.String getStraatnaam() {
        return straatnaam;
    }


    /**
     * Sets the straatnaam value for this KadasterLocatieBinnenland.
     * 
     * @param straatnaam
     */
    public void setStraatnaam(java.lang.String straatnaam) {
        this.straatnaam = straatnaam;
    }


    /**
     * Gets the postcode value for this KadasterLocatieBinnenland.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this KadasterLocatieBinnenland.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the huisnummer value for this KadasterLocatieBinnenland.
     * 
     * @return huisnummer
     */
    public java.lang.Integer getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this KadasterLocatieBinnenland.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(java.lang.Integer huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this KadasterLocatieBinnenland.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this KadasterLocatieBinnenland.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the huisletter value for this KadasterLocatieBinnenland.
     * 
     * @return huisletter
     */
    public java.lang.String getHuisletter() {
        return huisletter;
    }


    /**
     * Sets the huisletter value for this KadasterLocatieBinnenland.
     * 
     * @param huisletter
     */
    public void setHuisletter(java.lang.String huisletter) {
        this.huisletter = huisletter;
    }


    /**
     * Gets the positie value for this KadasterLocatieBinnenland.
     * 
     * @return positie
     */
    public java.lang.String getPositie() {
        return positie;
    }


    /**
     * Sets the positie value for this KadasterLocatieBinnenland.
     * 
     * @param positie
     */
    public void setPositie(java.lang.String positie) {
        this.positie = positie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterLocatieBinnenland)) return false;
        KadasterLocatieBinnenland other = (KadasterLocatieBinnenland) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plaats==null && other.getPlaats()==null) || 
             (this.plaats!=null &&
              this.plaats.equals(other.getPlaats()))) &&
            ((this.straatnaam==null && other.getStraatnaam()==null) || 
             (this.straatnaam!=null &&
              this.straatnaam.equals(other.getStraatnaam()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.huisnummer==null && other.getHuisnummer()==null) || 
             (this.huisnummer!=null &&
              this.huisnummer.equals(other.getHuisnummer()))) &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            ((this.huisletter==null && other.getHuisletter()==null) || 
             (this.huisletter!=null &&
              this.huisletter.equals(other.getHuisletter()))) &&
            ((this.positie==null && other.getPositie()==null) || 
             (this.positie!=null &&
              this.positie.equals(other.getPositie())));
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
        if (getPlaats() != null) {
            _hashCode += getPlaats().hashCode();
        }
        if (getStraatnaam() != null) {
            _hashCode += getStraatnaam().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getHuisnummer() != null) {
            _hashCode += getHuisnummer().hashCode();
        }
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        if (getHuisletter() != null) {
            _hashCode += getHuisletter().hashCode();
        }
        if (getPositie() != null) {
            _hashCode += getPositie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterLocatieBinnenland.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterLocatieBinnenland"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straatnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straatnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisletter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisletter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "positie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
