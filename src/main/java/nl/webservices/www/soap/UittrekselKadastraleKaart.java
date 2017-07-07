/**
 * UittrekselKadastraleKaart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class UittrekselKadastraleKaart  implements java.io.Serializable {
    private byte[] kaart;

    private nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen;

    private byte[][] afbeeldingen;

    public UittrekselKadastraleKaart() {
    }

    public UittrekselKadastraleKaart(
           byte[] kaart,
           nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen,
           byte[][] afbeeldingen) {
           this.kaart = kaart;
           this.kadastrale_aanduidingen = kadastrale_aanduidingen;
           this.afbeeldingen = afbeeldingen;
    }


    /**
     * Gets the kaart value for this UittrekselKadastraleKaart.
     * 
     * @return kaart
     */
    public byte[] getKaart() {
        return kaart;
    }


    /**
     * Sets the kaart value for this UittrekselKadastraleKaart.
     * 
     * @param kaart
     */
    public void setKaart(byte[] kaart) {
        this.kaart = kaart;
    }


    /**
     * Gets the kadastrale_aanduidingen value for this UittrekselKadastraleKaart.
     * 
     * @return kadastrale_aanduidingen
     */
    public nl.webservices.www.soap.KadastraleAanduiding[] getKadastrale_aanduidingen() {
        return kadastrale_aanduidingen;
    }


    /**
     * Sets the kadastrale_aanduidingen value for this UittrekselKadastraleKaart.
     * 
     * @param kadastrale_aanduidingen
     */
    public void setKadastrale_aanduidingen(nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen) {
        this.kadastrale_aanduidingen = kadastrale_aanduidingen;
    }


    /**
     * Gets the afbeeldingen value for this UittrekselKadastraleKaart.
     * 
     * @return afbeeldingen
     */
    public byte[][] getAfbeeldingen() {
        return afbeeldingen;
    }


    /**
     * Sets the afbeeldingen value for this UittrekselKadastraleKaart.
     * 
     * @param afbeeldingen
     */
    public void setAfbeeldingen(byte[][] afbeeldingen) {
        this.afbeeldingen = afbeeldingen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UittrekselKadastraleKaart)) return false;
        UittrekselKadastraleKaart other = (UittrekselKadastraleKaart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kaart==null && other.getKaart()==null) || 
             (this.kaart!=null &&
              java.util.Arrays.equals(this.kaart, other.getKaart()))) &&
            ((this.kadastrale_aanduidingen==null && other.getKadastrale_aanduidingen()==null) || 
             (this.kadastrale_aanduidingen!=null &&
              java.util.Arrays.equals(this.kadastrale_aanduidingen, other.getKadastrale_aanduidingen()))) &&
            ((this.afbeeldingen==null && other.getAfbeeldingen()==null) || 
             (this.afbeeldingen!=null &&
              java.util.Arrays.equals(this.afbeeldingen, other.getAfbeeldingen())));
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
        if (getKaart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKaart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKaart(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKadastrale_aanduidingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKadastrale_aanduidingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKadastrale_aanduidingen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAfbeeldingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAfbeeldingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAfbeeldingen(), i);
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
        new org.apache.axis.description.TypeDesc(UittrekselKadastraleKaart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "UittrekselKadastraleKaart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kaart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_aanduidingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_aanduidingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduiding"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afbeeldingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "afbeeldingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
