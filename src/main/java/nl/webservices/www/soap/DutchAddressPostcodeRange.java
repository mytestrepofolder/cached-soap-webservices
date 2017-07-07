/**
 * DutchAddressPostcodeRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchAddressPostcodeRange  implements java.io.Serializable {
    private int house_number_from;

    private int house_number_to;

    private java.lang.String neighborhood_code;

    private java.lang.String letter_combination;

    private java.lang.String range_indication;

    private java.lang.String street_name;

    private java.lang.String street_name_nen;

    private java.lang.String city;

    private java.lang.String municipality;

    private int municipality_code;

    private int cebuco_code;

    private java.lang.String province;

    private java.lang.String province_code;

    public DutchAddressPostcodeRange() {
    }

    public DutchAddressPostcodeRange(
           int house_number_from,
           int house_number_to,
           java.lang.String neighborhood_code,
           java.lang.String letter_combination,
           java.lang.String range_indication,
           java.lang.String street_name,
           java.lang.String street_name_nen,
           java.lang.String city,
           java.lang.String municipality,
           int municipality_code,
           int cebuco_code,
           java.lang.String province,
           java.lang.String province_code) {
           this.house_number_from = house_number_from;
           this.house_number_to = house_number_to;
           this.neighborhood_code = neighborhood_code;
           this.letter_combination = letter_combination;
           this.range_indication = range_indication;
           this.street_name = street_name;
           this.street_name_nen = street_name_nen;
           this.city = city;
           this.municipality = municipality;
           this.municipality_code = municipality_code;
           this.cebuco_code = cebuco_code;
           this.province = province;
           this.province_code = province_code;
    }


    /**
     * Gets the house_number_from value for this DutchAddressPostcodeRange.
     * 
     * @return house_number_from
     */
    public int getHouse_number_from() {
        return house_number_from;
    }


    /**
     * Sets the house_number_from value for this DutchAddressPostcodeRange.
     * 
     * @param house_number_from
     */
    public void setHouse_number_from(int house_number_from) {
        this.house_number_from = house_number_from;
    }


    /**
     * Gets the house_number_to value for this DutchAddressPostcodeRange.
     * 
     * @return house_number_to
     */
    public int getHouse_number_to() {
        return house_number_to;
    }


    /**
     * Sets the house_number_to value for this DutchAddressPostcodeRange.
     * 
     * @param house_number_to
     */
    public void setHouse_number_to(int house_number_to) {
        this.house_number_to = house_number_to;
    }


    /**
     * Gets the neighborhood_code value for this DutchAddressPostcodeRange.
     * 
     * @return neighborhood_code
     */
    public java.lang.String getNeighborhood_code() {
        return neighborhood_code;
    }


    /**
     * Sets the neighborhood_code value for this DutchAddressPostcodeRange.
     * 
     * @param neighborhood_code
     */
    public void setNeighborhood_code(java.lang.String neighborhood_code) {
        this.neighborhood_code = neighborhood_code;
    }


    /**
     * Gets the letter_combination value for this DutchAddressPostcodeRange.
     * 
     * @return letter_combination
     */
    public java.lang.String getLetter_combination() {
        return letter_combination;
    }


    /**
     * Sets the letter_combination value for this DutchAddressPostcodeRange.
     * 
     * @param letter_combination
     */
    public void setLetter_combination(java.lang.String letter_combination) {
        this.letter_combination = letter_combination;
    }


    /**
     * Gets the range_indication value for this DutchAddressPostcodeRange.
     * 
     * @return range_indication
     */
    public java.lang.String getRange_indication() {
        return range_indication;
    }


    /**
     * Sets the range_indication value for this DutchAddressPostcodeRange.
     * 
     * @param range_indication
     */
    public void setRange_indication(java.lang.String range_indication) {
        this.range_indication = range_indication;
    }


    /**
     * Gets the street_name value for this DutchAddressPostcodeRange.
     * 
     * @return street_name
     */
    public java.lang.String getStreet_name() {
        return street_name;
    }


    /**
     * Sets the street_name value for this DutchAddressPostcodeRange.
     * 
     * @param street_name
     */
    public void setStreet_name(java.lang.String street_name) {
        this.street_name = street_name;
    }


    /**
     * Gets the street_name_nen value for this DutchAddressPostcodeRange.
     * 
     * @return street_name_nen
     */
    public java.lang.String getStreet_name_nen() {
        return street_name_nen;
    }


    /**
     * Sets the street_name_nen value for this DutchAddressPostcodeRange.
     * 
     * @param street_name_nen
     */
    public void setStreet_name_nen(java.lang.String street_name_nen) {
        this.street_name_nen = street_name_nen;
    }


    /**
     * Gets the city value for this DutchAddressPostcodeRange.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DutchAddressPostcodeRange.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the municipality value for this DutchAddressPostcodeRange.
     * 
     * @return municipality
     */
    public java.lang.String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this DutchAddressPostcodeRange.
     * 
     * @param municipality
     */
    public void setMunicipality(java.lang.String municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the municipality_code value for this DutchAddressPostcodeRange.
     * 
     * @return municipality_code
     */
    public int getMunicipality_code() {
        return municipality_code;
    }


    /**
     * Sets the municipality_code value for this DutchAddressPostcodeRange.
     * 
     * @param municipality_code
     */
    public void setMunicipality_code(int municipality_code) {
        this.municipality_code = municipality_code;
    }


    /**
     * Gets the cebuco_code value for this DutchAddressPostcodeRange.
     * 
     * @return cebuco_code
     */
    public int getCebuco_code() {
        return cebuco_code;
    }


    /**
     * Sets the cebuco_code value for this DutchAddressPostcodeRange.
     * 
     * @param cebuco_code
     */
    public void setCebuco_code(int cebuco_code) {
        this.cebuco_code = cebuco_code;
    }


    /**
     * Gets the province value for this DutchAddressPostcodeRange.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this DutchAddressPostcodeRange.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the province_code value for this DutchAddressPostcodeRange.
     * 
     * @return province_code
     */
    public java.lang.String getProvince_code() {
        return province_code;
    }


    /**
     * Sets the province_code value for this DutchAddressPostcodeRange.
     * 
     * @param province_code
     */
    public void setProvince_code(java.lang.String province_code) {
        this.province_code = province_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchAddressPostcodeRange)) return false;
        DutchAddressPostcodeRange other = (DutchAddressPostcodeRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.house_number_from == other.getHouse_number_from() &&
            this.house_number_to == other.getHouse_number_to() &&
            ((this.neighborhood_code==null && other.getNeighborhood_code()==null) || 
             (this.neighborhood_code!=null &&
              this.neighborhood_code.equals(other.getNeighborhood_code()))) &&
            ((this.letter_combination==null && other.getLetter_combination()==null) || 
             (this.letter_combination!=null &&
              this.letter_combination.equals(other.getLetter_combination()))) &&
            ((this.range_indication==null && other.getRange_indication()==null) || 
             (this.range_indication!=null &&
              this.range_indication.equals(other.getRange_indication()))) &&
            ((this.street_name==null && other.getStreet_name()==null) || 
             (this.street_name!=null &&
              this.street_name.equals(other.getStreet_name()))) &&
            ((this.street_name_nen==null && other.getStreet_name_nen()==null) || 
             (this.street_name_nen!=null &&
              this.street_name_nen.equals(other.getStreet_name_nen()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.municipality==null && other.getMunicipality()==null) || 
             (this.municipality!=null &&
              this.municipality.equals(other.getMunicipality()))) &&
            this.municipality_code == other.getMunicipality_code() &&
            this.cebuco_code == other.getCebuco_code() &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.province_code==null && other.getProvince_code()==null) || 
             (this.province_code!=null &&
              this.province_code.equals(other.getProvince_code())));
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
        _hashCode += getHouse_number_from();
        _hashCode += getHouse_number_to();
        if (getNeighborhood_code() != null) {
            _hashCode += getNeighborhood_code().hashCode();
        }
        if (getLetter_combination() != null) {
            _hashCode += getLetter_combination().hashCode();
        }
        if (getRange_indication() != null) {
            _hashCode += getRange_indication().hashCode();
        }
        if (getStreet_name() != null) {
            _hashCode += getStreet_name().hashCode();
        }
        if (getStreet_name_nen() != null) {
            _hashCode += getStreet_name_nen().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getMunicipality() != null) {
            _hashCode += getMunicipality().hashCode();
        }
        _hashCode += getMunicipality_code();
        _hashCode += getCebuco_code();
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getProvince_code() != null) {
            _hashCode += getProvince_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchAddressPostcodeRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchAddressPostcodeRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neighborhood_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "neighborhood_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letter_combination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "letter_combination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "range_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_name_nen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street_name_nen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "municipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipality_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "municipality_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cebuco_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cebuco_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province_code"));
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
