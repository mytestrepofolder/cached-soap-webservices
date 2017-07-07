/**
 * Stuk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Stuk  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String aanduiding_soort_register;

    private java.lang.String deel;

    private java.lang.String nummer;

    private java.lang.String reeks;

    private java.util.Date datum_aanbieding;

    public Stuk() {
    }

    public Stuk(
           java.lang.String id,
           java.lang.String aanduiding_soort_register,
           java.lang.String deel,
           java.lang.String nummer,
           java.lang.String reeks,
           java.util.Date datum_aanbieding) {
           this.id = id;
           this.aanduiding_soort_register = aanduiding_soort_register;
           this.deel = deel;
           this.nummer = nummer;
           this.reeks = reeks;
           this.datum_aanbieding = datum_aanbieding;
    }


    /**
     * Gets the id value for this Stuk.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Stuk.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the aanduiding_soort_register value for this Stuk.
     * 
     * @return aanduiding_soort_register
     */
    public java.lang.String getAanduiding_soort_register() {
        return aanduiding_soort_register;
    }


    /**
     * Sets the aanduiding_soort_register value for this Stuk.
     * 
     * @param aanduiding_soort_register
     */
    public void setAanduiding_soort_register(java.lang.String aanduiding_soort_register) {
        this.aanduiding_soort_register = aanduiding_soort_register;
    }


    /**
     * Gets the deel value for this Stuk.
     * 
     * @return deel
     */
    public java.lang.String getDeel() {
        return deel;
    }


    /**
     * Sets the deel value for this Stuk.
     * 
     * @param deel
     */
    public void setDeel(java.lang.String deel) {
        this.deel = deel;
    }


    /**
     * Gets the nummer value for this Stuk.
     * 
     * @return nummer
     */
    public java.lang.String getNummer() {
        return nummer;
    }


    /**
     * Sets the nummer value for this Stuk.
     * 
     * @param nummer
     */
    public void setNummer(java.lang.String nummer) {
        this.nummer = nummer;
    }


    /**
     * Gets the reeks value for this Stuk.
     * 
     * @return reeks
     */
    public java.lang.String getReeks() {
        return reeks;
    }


    /**
     * Sets the reeks value for this Stuk.
     * 
     * @param reeks
     */
    public void setReeks(java.lang.String reeks) {
        this.reeks = reeks;
    }


    /**
     * Gets the datum_aanbieding value for this Stuk.
     * 
     * @return datum_aanbieding
     */
    public java.util.Date getDatum_aanbieding() {
        return datum_aanbieding;
    }


    /**
     * Sets the datum_aanbieding value for this Stuk.
     * 
     * @param datum_aanbieding
     */
    public void setDatum_aanbieding(java.util.Date datum_aanbieding) {
        this.datum_aanbieding = datum_aanbieding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stuk)) return false;
        Stuk other = (Stuk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.aanduiding_soort_register==null && other.getAanduiding_soort_register()==null) || 
             (this.aanduiding_soort_register!=null &&
              this.aanduiding_soort_register.equals(other.getAanduiding_soort_register()))) &&
            ((this.deel==null && other.getDeel()==null) || 
             (this.deel!=null &&
              this.deel.equals(other.getDeel()))) &&
            ((this.nummer==null && other.getNummer()==null) || 
             (this.nummer!=null &&
              this.nummer.equals(other.getNummer()))) &&
            ((this.reeks==null && other.getReeks()==null) || 
             (this.reeks!=null &&
              this.reeks.equals(other.getReeks()))) &&
            ((this.datum_aanbieding==null && other.getDatum_aanbieding()==null) || 
             (this.datum_aanbieding!=null &&
              this.datum_aanbieding.equals(other.getDatum_aanbieding())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAanduiding_soort_register() != null) {
            _hashCode += getAanduiding_soort_register().hashCode();
        }
        if (getDeel() != null) {
            _hashCode += getDeel().hashCode();
        }
        if (getNummer() != null) {
            _hashCode += getNummer().hashCode();
        }
        if (getReeks() != null) {
            _hashCode += getReeks().hashCode();
        }
        if (getDatum_aanbieding() != null) {
            _hashCode += getDatum_aanbieding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stuk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Stuk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aanduiding_soort_register");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aanduiding_soort_register"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reeks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reeks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_aanbieding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_aanbieding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
