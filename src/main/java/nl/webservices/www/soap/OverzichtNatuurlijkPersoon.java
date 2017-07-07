/**
 * OverzichtNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class OverzichtNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String geslachtsnaam;

    private java.lang.String voorvoegsel_geslachtsnaam;

    private java.lang.String voornamen;

    public OverzichtNatuurlijkPersoon() {
    }

    public OverzichtNatuurlijkPersoon(
           java.lang.String geslachtsnaam,
           java.lang.String voorvoegsel_geslachtsnaam,
           java.lang.String voornamen) {
           this.geslachtsnaam = geslachtsnaam;
           this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
           this.voornamen = voornamen;
    }


    /**
     * Gets the geslachtsnaam value for this OverzichtNatuurlijkPersoon.
     * 
     * @return geslachtsnaam
     */
    public java.lang.String getGeslachtsnaam() {
        return geslachtsnaam;
    }


    /**
     * Sets the geslachtsnaam value for this OverzichtNatuurlijkPersoon.
     * 
     * @param geslachtsnaam
     */
    public void setGeslachtsnaam(java.lang.String geslachtsnaam) {
        this.geslachtsnaam = geslachtsnaam;
    }


    /**
     * Gets the voorvoegsel_geslachtsnaam value for this OverzichtNatuurlijkPersoon.
     * 
     * @return voorvoegsel_geslachtsnaam
     */
    public java.lang.String getVoorvoegsel_geslachtsnaam() {
        return voorvoegsel_geslachtsnaam;
    }


    /**
     * Sets the voorvoegsel_geslachtsnaam value for this OverzichtNatuurlijkPersoon.
     * 
     * @param voorvoegsel_geslachtsnaam
     */
    public void setVoorvoegsel_geslachtsnaam(java.lang.String voorvoegsel_geslachtsnaam) {
        this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
    }


    /**
     * Gets the voornamen value for this OverzichtNatuurlijkPersoon.
     * 
     * @return voornamen
     */
    public java.lang.String getVoornamen() {
        return voornamen;
    }


    /**
     * Sets the voornamen value for this OverzichtNatuurlijkPersoon.
     * 
     * @param voornamen
     */
    public void setVoornamen(java.lang.String voornamen) {
        this.voornamen = voornamen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverzichtNatuurlijkPersoon)) return false;
        OverzichtNatuurlijkPersoon other = (OverzichtNatuurlijkPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geslachtsnaam==null && other.getGeslachtsnaam()==null) || 
             (this.geslachtsnaam!=null &&
              this.geslachtsnaam.equals(other.getGeslachtsnaam()))) &&
            ((this.voorvoegsel_geslachtsnaam==null && other.getVoorvoegsel_geslachtsnaam()==null) || 
             (this.voorvoegsel_geslachtsnaam!=null &&
              this.voorvoegsel_geslachtsnaam.equals(other.getVoorvoegsel_geslachtsnaam()))) &&
            ((this.voornamen==null && other.getVoornamen()==null) || 
             (this.voornamen!=null &&
              this.voornamen.equals(other.getVoornamen())));
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
        if (getGeslachtsnaam() != null) {
            _hashCode += getGeslachtsnaam().hashCode();
        }
        if (getVoorvoegsel_geslachtsnaam() != null) {
            _hashCode += getVoorvoegsel_geslachtsnaam().hashCode();
        }
        if (getVoornamen() != null) {
            _hashCode += getVoornamen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverzichtNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
