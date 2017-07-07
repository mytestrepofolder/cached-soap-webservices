/**
 * SearchParts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SearchParts  implements java.io.Serializable {
    private int huisnr;

    private java.lang.String toevoeging;

    private java.lang.String wijkcode;

    private java.lang.String lettercombinatie;

    private java.lang.String straat;

    private java.lang.String plaats;

    private java.lang.String gemeente;

    private java.lang.String provincie;

    private java.lang.String reeksindicatie;

    public SearchParts() {
    }

    public SearchParts(
           int huisnr,
           java.lang.String toevoeging,
           java.lang.String wijkcode,
           java.lang.String lettercombinatie,
           java.lang.String straat,
           java.lang.String plaats,
           java.lang.String gemeente,
           java.lang.String provincie,
           java.lang.String reeksindicatie) {
           this.huisnr = huisnr;
           this.toevoeging = toevoeging;
           this.wijkcode = wijkcode;
           this.lettercombinatie = lettercombinatie;
           this.straat = straat;
           this.plaats = plaats;
           this.gemeente = gemeente;
           this.provincie = provincie;
           this.reeksindicatie = reeksindicatie;
    }


    /**
     * Gets the huisnr value for this SearchParts.
     * 
     * @return huisnr
     */
    public int getHuisnr() {
        return huisnr;
    }


    /**
     * Sets the huisnr value for this SearchParts.
     * 
     * @param huisnr
     */
    public void setHuisnr(int huisnr) {
        this.huisnr = huisnr;
    }


    /**
     * Gets the toevoeging value for this SearchParts.
     * 
     * @return toevoeging
     */
    public java.lang.String getToevoeging() {
        return toevoeging;
    }


    /**
     * Sets the toevoeging value for this SearchParts.
     * 
     * @param toevoeging
     */
    public void setToevoeging(java.lang.String toevoeging) {
        this.toevoeging = toevoeging;
    }


    /**
     * Gets the wijkcode value for this SearchParts.
     * 
     * @return wijkcode
     */
    public java.lang.String getWijkcode() {
        return wijkcode;
    }


    /**
     * Sets the wijkcode value for this SearchParts.
     * 
     * @param wijkcode
     */
    public void setWijkcode(java.lang.String wijkcode) {
        this.wijkcode = wijkcode;
    }


    /**
     * Gets the lettercombinatie value for this SearchParts.
     * 
     * @return lettercombinatie
     */
    public java.lang.String getLettercombinatie() {
        return lettercombinatie;
    }


    /**
     * Sets the lettercombinatie value for this SearchParts.
     * 
     * @param lettercombinatie
     */
    public void setLettercombinatie(java.lang.String lettercombinatie) {
        this.lettercombinatie = lettercombinatie;
    }


    /**
     * Gets the straat value for this SearchParts.
     * 
     * @return straat
     */
    public java.lang.String getStraat() {
        return straat;
    }


    /**
     * Sets the straat value for this SearchParts.
     * 
     * @param straat
     */
    public void setStraat(java.lang.String straat) {
        this.straat = straat;
    }


    /**
     * Gets the plaats value for this SearchParts.
     * 
     * @return plaats
     */
    public java.lang.String getPlaats() {
        return plaats;
    }


    /**
     * Sets the plaats value for this SearchParts.
     * 
     * @param plaats
     */
    public void setPlaats(java.lang.String plaats) {
        this.plaats = plaats;
    }


    /**
     * Gets the gemeente value for this SearchParts.
     * 
     * @return gemeente
     */
    public java.lang.String getGemeente() {
        return gemeente;
    }


    /**
     * Sets the gemeente value for this SearchParts.
     * 
     * @param gemeente
     */
    public void setGemeente(java.lang.String gemeente) {
        this.gemeente = gemeente;
    }


    /**
     * Gets the provincie value for this SearchParts.
     * 
     * @return provincie
     */
    public java.lang.String getProvincie() {
        return provincie;
    }


    /**
     * Sets the provincie value for this SearchParts.
     * 
     * @param provincie
     */
    public void setProvincie(java.lang.String provincie) {
        this.provincie = provincie;
    }


    /**
     * Gets the reeksindicatie value for this SearchParts.
     * 
     * @return reeksindicatie
     */
    public java.lang.String getReeksindicatie() {
        return reeksindicatie;
    }


    /**
     * Sets the reeksindicatie value for this SearchParts.
     * 
     * @param reeksindicatie
     */
    public void setReeksindicatie(java.lang.String reeksindicatie) {
        this.reeksindicatie = reeksindicatie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchParts)) return false;
        SearchParts other = (SearchParts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.huisnr == other.getHuisnr() &&
            ((this.toevoeging==null && other.getToevoeging()==null) || 
             (this.toevoeging!=null &&
              this.toevoeging.equals(other.getToevoeging()))) &&
            ((this.wijkcode==null && other.getWijkcode()==null) || 
             (this.wijkcode!=null &&
              this.wijkcode.equals(other.getWijkcode()))) &&
            ((this.lettercombinatie==null && other.getLettercombinatie()==null) || 
             (this.lettercombinatie!=null &&
              this.lettercombinatie.equals(other.getLettercombinatie()))) &&
            ((this.straat==null && other.getStraat()==null) || 
             (this.straat!=null &&
              this.straat.equals(other.getStraat()))) &&
            ((this.plaats==null && other.getPlaats()==null) || 
             (this.plaats!=null &&
              this.plaats.equals(other.getPlaats()))) &&
            ((this.gemeente==null && other.getGemeente()==null) || 
             (this.gemeente!=null &&
              this.gemeente.equals(other.getGemeente()))) &&
            ((this.provincie==null && other.getProvincie()==null) || 
             (this.provincie!=null &&
              this.provincie.equals(other.getProvincie()))) &&
            ((this.reeksindicatie==null && other.getReeksindicatie()==null) || 
             (this.reeksindicatie!=null &&
              this.reeksindicatie.equals(other.getReeksindicatie())));
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
        _hashCode += getHuisnr();
        if (getToevoeging() != null) {
            _hashCode += getToevoeging().hashCode();
        }
        if (getWijkcode() != null) {
            _hashCode += getWijkcode().hashCode();
        }
        if (getLettercombinatie() != null) {
            _hashCode += getLettercombinatie().hashCode();
        }
        if (getStraat() != null) {
            _hashCode += getStraat().hashCode();
        }
        if (getPlaats() != null) {
            _hashCode += getPlaats().hashCode();
        }
        if (getGemeente() != null) {
            _hashCode += getGemeente().hashCode();
        }
        if (getProvincie() != null) {
            _hashCode += getProvincie().hashCode();
        }
        if (getReeksindicatie() != null) {
            _hashCode += getReeksindicatie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchParts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SearchParts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wijkcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "wijkcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lettercombinatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "lettercombinatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provincie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reeksindicatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reeksindicatie"));
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
