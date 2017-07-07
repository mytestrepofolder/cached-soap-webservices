/**
 * GCRFinancialCalamity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFinancialCalamity  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRBankruptcy bankruptcy;

    private nl.webservices.www.soap.GCRMoratorium moratorium;

    private nl.webservices.www.soap.GCRDebtRestructuringPrivatePersons debt_restructuring_private_persons;

    public GCRFinancialCalamity() {
    }

    public GCRFinancialCalamity(
           nl.webservices.www.soap.GCRBankruptcy bankruptcy,
           nl.webservices.www.soap.GCRMoratorium moratorium,
           nl.webservices.www.soap.GCRDebtRestructuringPrivatePersons debt_restructuring_private_persons) {
           this.bankruptcy = bankruptcy;
           this.moratorium = moratorium;
           this.debt_restructuring_private_persons = debt_restructuring_private_persons;
    }


    /**
     * Gets the bankruptcy value for this GCRFinancialCalamity.
     * 
     * @return bankruptcy
     */
    public nl.webservices.www.soap.GCRBankruptcy getBankruptcy() {
        return bankruptcy;
    }


    /**
     * Sets the bankruptcy value for this GCRFinancialCalamity.
     * 
     * @param bankruptcy
     */
    public void setBankruptcy(nl.webservices.www.soap.GCRBankruptcy bankruptcy) {
        this.bankruptcy = bankruptcy;
    }


    /**
     * Gets the moratorium value for this GCRFinancialCalamity.
     * 
     * @return moratorium
     */
    public nl.webservices.www.soap.GCRMoratorium getMoratorium() {
        return moratorium;
    }


    /**
     * Sets the moratorium value for this GCRFinancialCalamity.
     * 
     * @param moratorium
     */
    public void setMoratorium(nl.webservices.www.soap.GCRMoratorium moratorium) {
        this.moratorium = moratorium;
    }


    /**
     * Gets the debt_restructuring_private_persons value for this GCRFinancialCalamity.
     * 
     * @return debt_restructuring_private_persons
     */
    public nl.webservices.www.soap.GCRDebtRestructuringPrivatePersons getDebt_restructuring_private_persons() {
        return debt_restructuring_private_persons;
    }


    /**
     * Sets the debt_restructuring_private_persons value for this GCRFinancialCalamity.
     * 
     * @param debt_restructuring_private_persons
     */
    public void setDebt_restructuring_private_persons(nl.webservices.www.soap.GCRDebtRestructuringPrivatePersons debt_restructuring_private_persons) {
        this.debt_restructuring_private_persons = debt_restructuring_private_persons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFinancialCalamity)) return false;
        GCRFinancialCalamity other = (GCRFinancialCalamity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankruptcy==null && other.getBankruptcy()==null) || 
             (this.bankruptcy!=null &&
              this.bankruptcy.equals(other.getBankruptcy()))) &&
            ((this.moratorium==null && other.getMoratorium()==null) || 
             (this.moratorium!=null &&
              this.moratorium.equals(other.getMoratorium()))) &&
            ((this.debt_restructuring_private_persons==null && other.getDebt_restructuring_private_persons()==null) || 
             (this.debt_restructuring_private_persons!=null &&
              this.debt_restructuring_private_persons.equals(other.getDebt_restructuring_private_persons())));
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
        if (getBankruptcy() != null) {
            _hashCode += getBankruptcy().hashCode();
        }
        if (getMoratorium() != null) {
            _hashCode += getMoratorium().hashCode();
        }
        if (getDebt_restructuring_private_persons() != null) {
            _hashCode += getDebt_restructuring_private_persons().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRFinancialCalamity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialCalamity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankruptcy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bankruptcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBankruptcy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moratorium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "moratorium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRMoratorium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debt_restructuring_private_persons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "debt_restructuring_private_persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDebtRestructuringPrivatePersons"));
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
