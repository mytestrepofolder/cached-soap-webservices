/**
 * Session.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Session  implements java.io.Serializable {
    private java.lang.String reactid;

    private int user_id;

    private java.lang.String user_nickname;

    private java.lang.String creationtime;

    private java.lang.String lastvisit;

    private int hits;

    private java.lang.String ip;

    public Session() {
    }

    public Session(
           java.lang.String reactid,
           int user_id,
           java.lang.String user_nickname,
           java.lang.String creationtime,
           java.lang.String lastvisit,
           int hits,
           java.lang.String ip) {
           this.reactid = reactid;
           this.user_id = user_id;
           this.user_nickname = user_nickname;
           this.creationtime = creationtime;
           this.lastvisit = lastvisit;
           this.hits = hits;
           this.ip = ip;
    }


    /**
     * Gets the reactid value for this Session.
     * 
     * @return reactid
     */
    public java.lang.String getReactid() {
        return reactid;
    }


    /**
     * Sets the reactid value for this Session.
     * 
     * @param reactid
     */
    public void setReactid(java.lang.String reactid) {
        this.reactid = reactid;
    }


    /**
     * Gets the user_id value for this Session.
     * 
     * @return user_id
     */
    public int getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this Session.
     * 
     * @param user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the user_nickname value for this Session.
     * 
     * @return user_nickname
     */
    public java.lang.String getUser_nickname() {
        return user_nickname;
    }


    /**
     * Sets the user_nickname value for this Session.
     * 
     * @param user_nickname
     */
    public void setUser_nickname(java.lang.String user_nickname) {
        this.user_nickname = user_nickname;
    }


    /**
     * Gets the creationtime value for this Session.
     * 
     * @return creationtime
     */
    public java.lang.String getCreationtime() {
        return creationtime;
    }


    /**
     * Sets the creationtime value for this Session.
     * 
     * @param creationtime
     */
    public void setCreationtime(java.lang.String creationtime) {
        this.creationtime = creationtime;
    }


    /**
     * Gets the lastvisit value for this Session.
     * 
     * @return lastvisit
     */
    public java.lang.String getLastvisit() {
        return lastvisit;
    }


    /**
     * Sets the lastvisit value for this Session.
     * 
     * @param lastvisit
     */
    public void setLastvisit(java.lang.String lastvisit) {
        this.lastvisit = lastvisit;
    }


    /**
     * Gets the hits value for this Session.
     * 
     * @return hits
     */
    public int getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Session.
     * 
     * @param hits
     */
    public void setHits(int hits) {
        this.hits = hits;
    }


    /**
     * Gets the ip value for this Session.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this Session.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Session)) return false;
        Session other = (Session) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reactid==null && other.getReactid()==null) || 
             (this.reactid!=null &&
              this.reactid.equals(other.getReactid()))) &&
            this.user_id == other.getUser_id() &&
            ((this.user_nickname==null && other.getUser_nickname()==null) || 
             (this.user_nickname!=null &&
              this.user_nickname.equals(other.getUser_nickname()))) &&
            ((this.creationtime==null && other.getCreationtime()==null) || 
             (this.creationtime!=null &&
              this.creationtime.equals(other.getCreationtime()))) &&
            ((this.lastvisit==null && other.getLastvisit()==null) || 
             (this.lastvisit!=null &&
              this.lastvisit.equals(other.getLastvisit()))) &&
            this.hits == other.getHits() &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp())));
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
        if (getReactid() != null) {
            _hashCode += getReactid().hashCode();
        }
        _hashCode += getUser_id();
        if (getUser_nickname() != null) {
            _hashCode += getUser_nickname().hashCode();
        }
        if (getCreationtime() != null) {
            _hashCode += getCreationtime().hashCode();
        }
        if (getLastvisit() != null) {
            _hashCode += getLastvisit().hashCode();
        }
        _hashCode += getHits();
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Session.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Session"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reactid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reactid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "user_nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "creationtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastvisit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "lastvisit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ip"));
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
