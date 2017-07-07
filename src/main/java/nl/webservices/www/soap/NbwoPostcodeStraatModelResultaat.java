/**
 * NbwoPostcodeStraatModelResultaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoPostcodeStraatModelResultaat  implements java.io.Serializable {
    private int waarde;

    private int aantal;

    private double standaard_deviatie;

    private java.lang.String straat;

    private java.lang.String plaats;

    private java.util.Date datum_van;

    private nl.webservices.www.soap.NbwoWaardeVerdeling[] waardeverdelingen;

    public NbwoPostcodeStraatModelResultaat() {
    }

    public NbwoPostcodeStraatModelResultaat(
           int waarde,
           int aantal,
           double standaard_deviatie,
           java.lang.String straat,
           java.lang.String plaats,
           java.util.Date datum_van,
           nl.webservices.www.soap.NbwoWaardeVerdeling[] waardeverdelingen) {
           this.waarde = waarde;
           this.aantal = aantal;
           this.standaard_deviatie = standaard_deviatie;
           this.straat = straat;
           this.plaats = plaats;
           this.datum_van = datum_van;
           this.waardeverdelingen = waardeverdelingen;
    }


    /**
     * Gets the waarde value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return waarde
     */
    public int getWaarde() {
        return waarde;
    }


    /**
     * Sets the waarde value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param waarde
     */
    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }


    /**
     * Gets the aantal value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return aantal
     */
    public int getAantal() {
        return aantal;
    }


    /**
     * Sets the aantal value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param aantal
     */
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }


    /**
     * Gets the standaard_deviatie value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return standaard_deviatie
     */
    public double getStandaard_deviatie() {
        return standaard_deviatie;
    }


    /**
     * Sets the standaard_deviatie value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param standaard_deviatie
     */
    public void setStandaard_deviatie(double standaard_deviatie) {
        this.standaard_deviatie = standaard_deviatie;
    }


    /**
     * Gets the straat value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return straat
     */
    public java.lang.String getStraat() {
        return straat;
    }


    /**
     * Sets the straat value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param straat
     */
    public void setStraat(java.lang.String straat) {
        this.straat = straat;
    }


    /**
     * Gets the plaats value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return plaats
     */
    public java.lang.String getPlaats() {
        return plaats;
    }


    /**
     * Sets the plaats value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param plaats
     */
    public void setPlaats(java.lang.String plaats) {
        this.plaats = plaats;
    }


    /**
     * Gets the datum_van value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return datum_van
     */
    public java.util.Date getDatum_van() {
        return datum_van;
    }


    /**
     * Sets the datum_van value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param datum_van
     */
    public void setDatum_van(java.util.Date datum_van) {
        this.datum_van = datum_van;
    }


    /**
     * Gets the waardeverdelingen value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @return waardeverdelingen
     */
    public nl.webservices.www.soap.NbwoWaardeVerdeling[] getWaardeverdelingen() {
        return waardeverdelingen;
    }


    /**
     * Sets the waardeverdelingen value for this NbwoPostcodeStraatModelResultaat.
     * 
     * @param waardeverdelingen
     */
    public void setWaardeverdelingen(nl.webservices.www.soap.NbwoWaardeVerdeling[] waardeverdelingen) {
        this.waardeverdelingen = waardeverdelingen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoPostcodeStraatModelResultaat)) return false;
        NbwoPostcodeStraatModelResultaat other = (NbwoPostcodeStraatModelResultaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.waarde == other.getWaarde() &&
            this.aantal == other.getAantal() &&
            this.standaard_deviatie == other.getStandaard_deviatie() &&
            ((this.straat==null && other.getStraat()==null) || 
             (this.straat!=null &&
              this.straat.equals(other.getStraat()))) &&
            ((this.plaats==null && other.getPlaats()==null) || 
             (this.plaats!=null &&
              this.plaats.equals(other.getPlaats()))) &&
            ((this.datum_van==null && other.getDatum_van()==null) || 
             (this.datum_van!=null &&
              this.datum_van.equals(other.getDatum_van()))) &&
            ((this.waardeverdelingen==null && other.getWaardeverdelingen()==null) || 
             (this.waardeverdelingen!=null &&
              java.util.Arrays.equals(this.waardeverdelingen, other.getWaardeverdelingen())));
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
        _hashCode += getWaarde();
        _hashCode += getAantal();
        _hashCode += new Double(getStandaard_deviatie()).hashCode();
        if (getStraat() != null) {
            _hashCode += getStraat().hashCode();
        }
        if (getPlaats() != null) {
            _hashCode += getPlaats().hashCode();
        }
        if (getDatum_van() != null) {
            _hashCode += getDatum_van().hashCode();
        }
        if (getWaardeverdelingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWaardeverdelingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWaardeverdelingen(), i);
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
        new org.apache.axis.description.TypeDesc(NbwoPostcodeStraatModelResultaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoPostcodeStraatModelResultaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waarde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "waarde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standaard_deviatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "standaard_deviatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("datum_van");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_van"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waardeverdelingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "waardeverdelingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoWaardeVerdeling"));
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
