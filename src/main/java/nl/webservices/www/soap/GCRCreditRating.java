/**
 * GCRCreditRating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCreditRating  implements java.io.Serializable {
    private java.lang.String y_rating;

    private java.lang.String pd_rating;

    private java.lang.Float pd_percentage;

    private java.lang.String erc_score;

    private java.lang.String credit_flag_code;

    private java.lang.String credit_flag_text;

    private nl.webservices.www.soap.GCRRating[] ratings;

    private nl.webservices.www.soap.GCRRatingHistory[] y_rating_history;

    private nl.webservices.www.soap.GCRRatingHistory[] pd_rating_history;

    private nl.webservices.www.soap.GCRPercentageHistory[] pd_percentage_history;

    public GCRCreditRating() {
    }

    public GCRCreditRating(
           java.lang.String y_rating,
           java.lang.String pd_rating,
           java.lang.Float pd_percentage,
           java.lang.String erc_score,
           java.lang.String credit_flag_code,
           java.lang.String credit_flag_text,
           nl.webservices.www.soap.GCRRating[] ratings,
           nl.webservices.www.soap.GCRRatingHistory[] y_rating_history,
           nl.webservices.www.soap.GCRRatingHistory[] pd_rating_history,
           nl.webservices.www.soap.GCRPercentageHistory[] pd_percentage_history) {
           this.y_rating = y_rating;
           this.pd_rating = pd_rating;
           this.pd_percentage = pd_percentage;
           this.erc_score = erc_score;
           this.credit_flag_code = credit_flag_code;
           this.credit_flag_text = credit_flag_text;
           this.ratings = ratings;
           this.y_rating_history = y_rating_history;
           this.pd_rating_history = pd_rating_history;
           this.pd_percentage_history = pd_percentage_history;
    }


    /**
     * Gets the y_rating value for this GCRCreditRating.
     * 
     * @return y_rating
     */
    public java.lang.String getY_rating() {
        return y_rating;
    }


    /**
     * Sets the y_rating value for this GCRCreditRating.
     * 
     * @param y_rating
     */
    public void setY_rating(java.lang.String y_rating) {
        this.y_rating = y_rating;
    }


    /**
     * Gets the pd_rating value for this GCRCreditRating.
     * 
     * @return pd_rating
     */
    public java.lang.String getPd_rating() {
        return pd_rating;
    }


    /**
     * Sets the pd_rating value for this GCRCreditRating.
     * 
     * @param pd_rating
     */
    public void setPd_rating(java.lang.String pd_rating) {
        this.pd_rating = pd_rating;
    }


    /**
     * Gets the pd_percentage value for this GCRCreditRating.
     * 
     * @return pd_percentage
     */
    public java.lang.Float getPd_percentage() {
        return pd_percentage;
    }


    /**
     * Sets the pd_percentage value for this GCRCreditRating.
     * 
     * @param pd_percentage
     */
    public void setPd_percentage(java.lang.Float pd_percentage) {
        this.pd_percentage = pd_percentage;
    }


    /**
     * Gets the erc_score value for this GCRCreditRating.
     * 
     * @return erc_score
     */
    public java.lang.String getErc_score() {
        return erc_score;
    }


    /**
     * Sets the erc_score value for this GCRCreditRating.
     * 
     * @param erc_score
     */
    public void setErc_score(java.lang.String erc_score) {
        this.erc_score = erc_score;
    }


    /**
     * Gets the credit_flag_code value for this GCRCreditRating.
     * 
     * @return credit_flag_code
     */
    public java.lang.String getCredit_flag_code() {
        return credit_flag_code;
    }


    /**
     * Sets the credit_flag_code value for this GCRCreditRating.
     * 
     * @param credit_flag_code
     */
    public void setCredit_flag_code(java.lang.String credit_flag_code) {
        this.credit_flag_code = credit_flag_code;
    }


    /**
     * Gets the credit_flag_text value for this GCRCreditRating.
     * 
     * @return credit_flag_text
     */
    public java.lang.String getCredit_flag_text() {
        return credit_flag_text;
    }


    /**
     * Sets the credit_flag_text value for this GCRCreditRating.
     * 
     * @param credit_flag_text
     */
    public void setCredit_flag_text(java.lang.String credit_flag_text) {
        this.credit_flag_text = credit_flag_text;
    }


    /**
     * Gets the ratings value for this GCRCreditRating.
     * 
     * @return ratings
     */
    public nl.webservices.www.soap.GCRRating[] getRatings() {
        return ratings;
    }


    /**
     * Sets the ratings value for this GCRCreditRating.
     * 
     * @param ratings
     */
    public void setRatings(nl.webservices.www.soap.GCRRating[] ratings) {
        this.ratings = ratings;
    }


    /**
     * Gets the y_rating_history value for this GCRCreditRating.
     * 
     * @return y_rating_history
     */
    public nl.webservices.www.soap.GCRRatingHistory[] getY_rating_history() {
        return y_rating_history;
    }


    /**
     * Sets the y_rating_history value for this GCRCreditRating.
     * 
     * @param y_rating_history
     */
    public void setY_rating_history(nl.webservices.www.soap.GCRRatingHistory[] y_rating_history) {
        this.y_rating_history = y_rating_history;
    }


    /**
     * Gets the pd_rating_history value for this GCRCreditRating.
     * 
     * @return pd_rating_history
     */
    public nl.webservices.www.soap.GCRRatingHistory[] getPd_rating_history() {
        return pd_rating_history;
    }


    /**
     * Sets the pd_rating_history value for this GCRCreditRating.
     * 
     * @param pd_rating_history
     */
    public void setPd_rating_history(nl.webservices.www.soap.GCRRatingHistory[] pd_rating_history) {
        this.pd_rating_history = pd_rating_history;
    }


    /**
     * Gets the pd_percentage_history value for this GCRCreditRating.
     * 
     * @return pd_percentage_history
     */
    public nl.webservices.www.soap.GCRPercentageHistory[] getPd_percentage_history() {
        return pd_percentage_history;
    }


    /**
     * Sets the pd_percentage_history value for this GCRCreditRating.
     * 
     * @param pd_percentage_history
     */
    public void setPd_percentage_history(nl.webservices.www.soap.GCRPercentageHistory[] pd_percentage_history) {
        this.pd_percentage_history = pd_percentage_history;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCreditRating)) return false;
        GCRCreditRating other = (GCRCreditRating) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.y_rating==null && other.getY_rating()==null) || 
             (this.y_rating!=null &&
              this.y_rating.equals(other.getY_rating()))) &&
            ((this.pd_rating==null && other.getPd_rating()==null) || 
             (this.pd_rating!=null &&
              this.pd_rating.equals(other.getPd_rating()))) &&
            ((this.pd_percentage==null && other.getPd_percentage()==null) || 
             (this.pd_percentage!=null &&
              this.pd_percentage.equals(other.getPd_percentage()))) &&
            ((this.erc_score==null && other.getErc_score()==null) || 
             (this.erc_score!=null &&
              this.erc_score.equals(other.getErc_score()))) &&
            ((this.credit_flag_code==null && other.getCredit_flag_code()==null) || 
             (this.credit_flag_code!=null &&
              this.credit_flag_code.equals(other.getCredit_flag_code()))) &&
            ((this.credit_flag_text==null && other.getCredit_flag_text()==null) || 
             (this.credit_flag_text!=null &&
              this.credit_flag_text.equals(other.getCredit_flag_text()))) &&
            ((this.ratings==null && other.getRatings()==null) || 
             (this.ratings!=null &&
              java.util.Arrays.equals(this.ratings, other.getRatings()))) &&
            ((this.y_rating_history==null && other.getY_rating_history()==null) || 
             (this.y_rating_history!=null &&
              java.util.Arrays.equals(this.y_rating_history, other.getY_rating_history()))) &&
            ((this.pd_rating_history==null && other.getPd_rating_history()==null) || 
             (this.pd_rating_history!=null &&
              java.util.Arrays.equals(this.pd_rating_history, other.getPd_rating_history()))) &&
            ((this.pd_percentage_history==null && other.getPd_percentage_history()==null) || 
             (this.pd_percentage_history!=null &&
              java.util.Arrays.equals(this.pd_percentage_history, other.getPd_percentage_history())));
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
        if (getY_rating() != null) {
            _hashCode += getY_rating().hashCode();
        }
        if (getPd_rating() != null) {
            _hashCode += getPd_rating().hashCode();
        }
        if (getPd_percentage() != null) {
            _hashCode += getPd_percentage().hashCode();
        }
        if (getErc_score() != null) {
            _hashCode += getErc_score().hashCode();
        }
        if (getCredit_flag_code() != null) {
            _hashCode += getCredit_flag_code().hashCode();
        }
        if (getCredit_flag_text() != null) {
            _hashCode += getCredit_flag_text().hashCode();
        }
        if (getRatings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getY_rating_history() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getY_rating_history());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getY_rating_history(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPd_rating_history() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPd_rating_history());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPd_rating_history(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPd_percentage_history() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPd_percentage_history());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPd_percentage_history(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCreditRating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditRating"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "y_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erc_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "erc_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_flag_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_flag_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_flag_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_flag_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y_rating_history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "y_rating_history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRatingHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_rating_history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_rating_history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRatingHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_percentage_history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_percentage_history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPercentageHistory"));
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
