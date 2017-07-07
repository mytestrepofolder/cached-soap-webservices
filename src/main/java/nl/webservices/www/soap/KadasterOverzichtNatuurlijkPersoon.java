/**
 * KadasterOverzichtNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterOverzichtNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String bsn;

    private java.lang.String geslachtsnaam;

    private java.lang.String voorvoegsel_geslachtsnaam;

    private java.lang.String voornamen;

    private java.lang.String geslacht;

    public KadasterOverzichtNatuurlijkPersoon() {
    }

    public KadasterOverzichtNatuurlijkPersoon(
           java.lang.String bsn,
           java.lang.String geslachtsnaam,
           java.lang.String voorvoegsel_geslachtsnaam,
           java.lang.String voornamen,
           java.lang.String geslacht) {
           this.bsn = bsn;
           this.geslachtsnaam = geslachtsnaam;
           this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
           this.voornamen = voornamen;
           this.geslacht = geslacht;
    }


    /**
     * Gets the bsn value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @return bsn
     */
    public java.lang.String getBsn() {
        return bsn;
    }


    /**
     * Sets the bsn value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @param bsn
     */
    public void setBsn(java.lang.String bsn) {
        this.bsn = bsn;
    }


    /**
     * Gets the geslachtsnaam value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @return geslachtsnaam
     */
    public java.lang.String getGeslachtsnaam() {
        return geslachtsnaam;
    }


    /**
     * Sets the geslachtsnaam value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @param geslachtsnaam
     */
    public void setGeslachtsnaam(java.lang.String geslachtsnaam) {
        this.geslachtsnaam = geslachtsnaam;
    }


    /**
     * Gets the voorvoegsel_geslachtsnaam value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @return voorvoegsel_geslachtsnaam
     */
    public java.lang.String getVoorvoegsel_geslachtsnaam() {
        return voorvoegsel_geslachtsnaam;
    }


    /**
     * Sets the voorvoegsel_geslachtsnaam value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @param voorvoegsel_geslachtsnaam
     */
    public void setVoorvoegsel_geslachtsnaam(java.lang.String voorvoegsel_geslachtsnaam) {
        this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
    }


    /**
     * Gets the voornamen value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @return voornamen
     */
    public java.lang.String getVoornamen() {
        return voornamen;
    }


    /**
     * Sets the voornamen value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @param voornamen
     */
    public void setVoornamen(java.lang.String voornamen) {
        this.voornamen = voornamen;
    }


    /**
     * Gets the geslacht value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @return geslacht
     */
    public java.lang.String getGeslacht() {
        return geslacht;
    }


    /**
     * Sets the geslacht value for this KadasterOverzichtNatuurlijkPersoon.
     * 
     * @param geslacht
     */
    public void setGeslacht(java.lang.String geslacht) {
        this.geslacht = geslacht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterOverzichtNatuurlijkPersoon)) return false;
        KadasterOverzichtNatuurlijkPersoon other = (KadasterOverzichtNatuurlijkPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bsn==null && other.getBsn()==null) || 
             (this.bsn!=null &&
              this.bsn.equals(other.getBsn()))) &&
            ((this.geslachtsnaam==null && other.getGeslachtsnaam()==null) || 
             (this.geslachtsnaam!=null &&
              this.geslachtsnaam.equals(other.getGeslachtsnaam()))) &&
            ((this.voorvoegsel_geslachtsnaam==null && other.getVoorvoegsel_geslachtsnaam()==null) || 
             (this.voorvoegsel_geslachtsnaam!=null &&
              this.voorvoegsel_geslachtsnaam.equals(other.getVoorvoegsel_geslachtsnaam()))) &&
            ((this.voornamen==null && other.getVoornamen()==null) || 
             (this.voornamen!=null &&
              this.voornamen.equals(other.getVoornamen()))) &&
            ((this.geslacht==null && other.getGeslacht()==null) || 
             (this.geslacht!=null &&
              this.geslacht.equals(other.getGeslacht())));
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
        if (getBsn() != null) {
            _hashCode += getBsn().hashCode();
        }
        if (getGeslachtsnaam() != null) {
            _hashCode += getGeslachtsnaam().hashCode();
        }
        if (getVoorvoegsel_geslachtsnaam() != null) {
            _hashCode += getVoorvoegsel_geslachtsnaam().hashCode();
        }
        if (getVoornamen() != null) {
            _hashCode += getVoornamen().hashCode();
        }
        if (getGeslacht() != null) {
            _hashCode += getGeslacht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterOverzichtNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bsn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geslachtsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geslachtsnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voorvoegsel_geslachtsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voorvoegsel_geslachtsnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voornamen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voornamen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geslacht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geslacht"));
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
