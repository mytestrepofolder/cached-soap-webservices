/**
 * ResultInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class ResultInfo  implements java.io.Serializable {
    private int curpage;

    private int perpage;

    private int numpages;

    private int numresults;

    private int maxresults;

    public ResultInfo() {
    }

    public ResultInfo(
           int curpage,
           int perpage,
           int numpages,
           int numresults,
           int maxresults) {
           this.curpage = curpage;
           this.perpage = perpage;
           this.numpages = numpages;
           this.numresults = numresults;
           this.maxresults = maxresults;
    }


    /**
     * Gets the curpage value for this ResultInfo.
     * 
     * @return curpage
     */
    public int getCurpage() {
        return curpage;
    }


    /**
     * Sets the curpage value for this ResultInfo.
     * 
     * @param curpage
     */
    public void setCurpage(int curpage) {
        this.curpage = curpage;
    }


    /**
     * Gets the perpage value for this ResultInfo.
     * 
     * @return perpage
     */
    public int getPerpage() {
        return perpage;
    }


    /**
     * Sets the perpage value for this ResultInfo.
     * 
     * @param perpage
     */
    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }


    /**
     * Gets the numpages value for this ResultInfo.
     * 
     * @return numpages
     */
    public int getNumpages() {
        return numpages;
    }


    /**
     * Sets the numpages value for this ResultInfo.
     * 
     * @param numpages
     */
    public void setNumpages(int numpages) {
        this.numpages = numpages;
    }


    /**
     * Gets the numresults value for this ResultInfo.
     * 
     * @return numresults
     */
    public int getNumresults() {
        return numresults;
    }


    /**
     * Sets the numresults value for this ResultInfo.
     * 
     * @param numresults
     */
    public void setNumresults(int numresults) {
        this.numresults = numresults;
    }


    /**
     * Gets the maxresults value for this ResultInfo.
     * 
     * @return maxresults
     */
    public int getMaxresults() {
        return maxresults;
    }


    /**
     * Sets the maxresults value for this ResultInfo.
     * 
     * @param maxresults
     */
    public void setMaxresults(int maxresults) {
        this.maxresults = maxresults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultInfo)) return false;
        ResultInfo other = (ResultInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.curpage == other.getCurpage() &&
            this.perpage == other.getPerpage() &&
            this.numpages == other.getNumpages() &&
            this.numresults == other.getNumresults() &&
            this.maxresults == other.getMaxresults();
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
        _hashCode += getCurpage();
        _hashCode += getPerpage();
        _hashCode += getNumpages();
        _hashCode += getNumresults();
        _hashCode += getMaxresults();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ResultInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curpage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perpage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "perpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numpages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "numpages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numresults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "numresults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxresults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maxresults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
