/**
 * CarExtended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarExtended  implements java.io.Serializable {
    private java.lang.String license_plate;

    private java.lang.String code;

    private boolean check_code_status;

    private java.lang.String category;

    private java.lang.String brand;

    private java.lang.String brand_code;

    private java.lang.String[] model;

    private java.lang.String body_style;

    private java.lang.String[] colors;

    private java.lang.String[] fuel_types;

    private int cylinders;

    private int cylinder_capacity;

    private int seats;

    private int standing_room;

    private int unladen_mass;

    private int gross_vehicle_mass;

    private int mass_ready;

    private int maximum_mass_payload;

    private int maximum_mass_unbraked;

    private int maximum_mass_braked;

    private int maximum_mass_trailer_braked;

    private int maximum_mass_self_braked;

    private int maximum_mass_axle_braked;

    private java.lang.String date_first_issuing;

    private java.lang.String date_first_admission;

    private java.lang.String date_latest_name_registration;

    private java.lang.String apk_due_date;

    private int bpm;

    private int power;

    private java.lang.String g3_indicator;

    private java.lang.String particulate_filter;

    private java.lang.String co2_emission_combined;

    private java.lang.String emission_code;

    private int top_speed;

    private java.lang.String fuel_consumption_city;

    private java.lang.String fuel_consumption_freeway;

    private java.lang.String fuel_consumption_combined;

    private java.lang.String energy_label;

    private boolean stolen;

    private boolean insured;

    private boolean license_plate_signal;

    private boolean awaiting_inspection;

    private java.lang.String catalog_price;

    private java.lang.String european_type_approval_mark;

    private nl.webservices.www.soap.CarType[] types;

    public CarExtended() {
    }

    public CarExtended(
           java.lang.String license_plate,
           java.lang.String code,
           boolean check_code_status,
           java.lang.String category,
           java.lang.String brand,
           java.lang.String brand_code,
           java.lang.String[] model,
           java.lang.String body_style,
           java.lang.String[] colors,
           java.lang.String[] fuel_types,
           int cylinders,
           int cylinder_capacity,
           int seats,
           int standing_room,
           int unladen_mass,
           int gross_vehicle_mass,
           int mass_ready,
           int maximum_mass_payload,
           int maximum_mass_unbraked,
           int maximum_mass_braked,
           int maximum_mass_trailer_braked,
           int maximum_mass_self_braked,
           int maximum_mass_axle_braked,
           java.lang.String date_first_issuing,
           java.lang.String date_first_admission,
           java.lang.String date_latest_name_registration,
           java.lang.String apk_due_date,
           int bpm,
           int power,
           java.lang.String g3_indicator,
           java.lang.String particulate_filter,
           java.lang.String co2_emission_combined,
           java.lang.String emission_code,
           int top_speed,
           java.lang.String fuel_consumption_city,
           java.lang.String fuel_consumption_freeway,
           java.lang.String fuel_consumption_combined,
           java.lang.String energy_label,
           boolean stolen,
           boolean insured,
           boolean license_plate_signal,
           boolean awaiting_inspection,
           java.lang.String catalog_price,
           java.lang.String european_type_approval_mark,
           nl.webservices.www.soap.CarType[] types) {
           this.license_plate = license_plate;
           this.code = code;
           this.check_code_status = check_code_status;
           this.category = category;
           this.brand = brand;
           this.brand_code = brand_code;
           this.model = model;
           this.body_style = body_style;
           this.colors = colors;
           this.fuel_types = fuel_types;
           this.cylinders = cylinders;
           this.cylinder_capacity = cylinder_capacity;
           this.seats = seats;
           this.standing_room = standing_room;
           this.unladen_mass = unladen_mass;
           this.gross_vehicle_mass = gross_vehicle_mass;
           this.mass_ready = mass_ready;
           this.maximum_mass_payload = maximum_mass_payload;
           this.maximum_mass_unbraked = maximum_mass_unbraked;
           this.maximum_mass_braked = maximum_mass_braked;
           this.maximum_mass_trailer_braked = maximum_mass_trailer_braked;
           this.maximum_mass_self_braked = maximum_mass_self_braked;
           this.maximum_mass_axle_braked = maximum_mass_axle_braked;
           this.date_first_issuing = date_first_issuing;
           this.date_first_admission = date_first_admission;
           this.date_latest_name_registration = date_latest_name_registration;
           this.apk_due_date = apk_due_date;
           this.bpm = bpm;
           this.power = power;
           this.g3_indicator = g3_indicator;
           this.particulate_filter = particulate_filter;
           this.co2_emission_combined = co2_emission_combined;
           this.emission_code = emission_code;
           this.top_speed = top_speed;
           this.fuel_consumption_city = fuel_consumption_city;
           this.fuel_consumption_freeway = fuel_consumption_freeway;
           this.fuel_consumption_combined = fuel_consumption_combined;
           this.energy_label = energy_label;
           this.stolen = stolen;
           this.insured = insured;
           this.license_plate_signal = license_plate_signal;
           this.awaiting_inspection = awaiting_inspection;
           this.catalog_price = catalog_price;
           this.european_type_approval_mark = european_type_approval_mark;
           this.types = types;
    }


    /**
     * Gets the license_plate value for this CarExtended.
     * 
     * @return license_plate
     */
    public java.lang.String getLicense_plate() {
        return license_plate;
    }


    /**
     * Sets the license_plate value for this CarExtended.
     * 
     * @param license_plate
     */
    public void setLicense_plate(java.lang.String license_plate) {
        this.license_plate = license_plate;
    }


    /**
     * Gets the code value for this CarExtended.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CarExtended.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the check_code_status value for this CarExtended.
     * 
     * @return check_code_status
     */
    public boolean isCheck_code_status() {
        return check_code_status;
    }


    /**
     * Sets the check_code_status value for this CarExtended.
     * 
     * @param check_code_status
     */
    public void setCheck_code_status(boolean check_code_status) {
        this.check_code_status = check_code_status;
    }


    /**
     * Gets the category value for this CarExtended.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CarExtended.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the brand value for this CarExtended.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this CarExtended.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the brand_code value for this CarExtended.
     * 
     * @return brand_code
     */
    public java.lang.String getBrand_code() {
        return brand_code;
    }


    /**
     * Sets the brand_code value for this CarExtended.
     * 
     * @param brand_code
     */
    public void setBrand_code(java.lang.String brand_code) {
        this.brand_code = brand_code;
    }


    /**
     * Gets the model value for this CarExtended.
     * 
     * @return model
     */
    public java.lang.String[] getModel() {
        return model;
    }


    /**
     * Sets the model value for this CarExtended.
     * 
     * @param model
     */
    public void setModel(java.lang.String[] model) {
        this.model = model;
    }


    /**
     * Gets the body_style value for this CarExtended.
     * 
     * @return body_style
     */
    public java.lang.String getBody_style() {
        return body_style;
    }


    /**
     * Sets the body_style value for this CarExtended.
     * 
     * @param body_style
     */
    public void setBody_style(java.lang.String body_style) {
        this.body_style = body_style;
    }


    /**
     * Gets the colors value for this CarExtended.
     * 
     * @return colors
     */
    public java.lang.String[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this CarExtended.
     * 
     * @param colors
     */
    public void setColors(java.lang.String[] colors) {
        this.colors = colors;
    }


    /**
     * Gets the fuel_types value for this CarExtended.
     * 
     * @return fuel_types
     */
    public java.lang.String[] getFuel_types() {
        return fuel_types;
    }


    /**
     * Sets the fuel_types value for this CarExtended.
     * 
     * @param fuel_types
     */
    public void setFuel_types(java.lang.String[] fuel_types) {
        this.fuel_types = fuel_types;
    }


    /**
     * Gets the cylinders value for this CarExtended.
     * 
     * @return cylinders
     */
    public int getCylinders() {
        return cylinders;
    }


    /**
     * Sets the cylinders value for this CarExtended.
     * 
     * @param cylinders
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


    /**
     * Gets the cylinder_capacity value for this CarExtended.
     * 
     * @return cylinder_capacity
     */
    public int getCylinder_capacity() {
        return cylinder_capacity;
    }


    /**
     * Sets the cylinder_capacity value for this CarExtended.
     * 
     * @param cylinder_capacity
     */
    public void setCylinder_capacity(int cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }


    /**
     * Gets the seats value for this CarExtended.
     * 
     * @return seats
     */
    public int getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this CarExtended.
     * 
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }


    /**
     * Gets the standing_room value for this CarExtended.
     * 
     * @return standing_room
     */
    public int getStanding_room() {
        return standing_room;
    }


    /**
     * Sets the standing_room value for this CarExtended.
     * 
     * @param standing_room
     */
    public void setStanding_room(int standing_room) {
        this.standing_room = standing_room;
    }


    /**
     * Gets the unladen_mass value for this CarExtended.
     * 
     * @return unladen_mass
     */
    public int getUnladen_mass() {
        return unladen_mass;
    }


    /**
     * Sets the unladen_mass value for this CarExtended.
     * 
     * @param unladen_mass
     */
    public void setUnladen_mass(int unladen_mass) {
        this.unladen_mass = unladen_mass;
    }


    /**
     * Gets the gross_vehicle_mass value for this CarExtended.
     * 
     * @return gross_vehicle_mass
     */
    public int getGross_vehicle_mass() {
        return gross_vehicle_mass;
    }


    /**
     * Sets the gross_vehicle_mass value for this CarExtended.
     * 
     * @param gross_vehicle_mass
     */
    public void setGross_vehicle_mass(int gross_vehicle_mass) {
        this.gross_vehicle_mass = gross_vehicle_mass;
    }


    /**
     * Gets the mass_ready value for this CarExtended.
     * 
     * @return mass_ready
     */
    public int getMass_ready() {
        return mass_ready;
    }


    /**
     * Sets the mass_ready value for this CarExtended.
     * 
     * @param mass_ready
     */
    public void setMass_ready(int mass_ready) {
        this.mass_ready = mass_ready;
    }


    /**
     * Gets the maximum_mass_payload value for this CarExtended.
     * 
     * @return maximum_mass_payload
     */
    public int getMaximum_mass_payload() {
        return maximum_mass_payload;
    }


    /**
     * Sets the maximum_mass_payload value for this CarExtended.
     * 
     * @param maximum_mass_payload
     */
    public void setMaximum_mass_payload(int maximum_mass_payload) {
        this.maximum_mass_payload = maximum_mass_payload;
    }


    /**
     * Gets the maximum_mass_unbraked value for this CarExtended.
     * 
     * @return maximum_mass_unbraked
     */
    public int getMaximum_mass_unbraked() {
        return maximum_mass_unbraked;
    }


    /**
     * Sets the maximum_mass_unbraked value for this CarExtended.
     * 
     * @param maximum_mass_unbraked
     */
    public void setMaximum_mass_unbraked(int maximum_mass_unbraked) {
        this.maximum_mass_unbraked = maximum_mass_unbraked;
    }


    /**
     * Gets the maximum_mass_braked value for this CarExtended.
     * 
     * @return maximum_mass_braked
     */
    public int getMaximum_mass_braked() {
        return maximum_mass_braked;
    }


    /**
     * Sets the maximum_mass_braked value for this CarExtended.
     * 
     * @param maximum_mass_braked
     */
    public void setMaximum_mass_braked(int maximum_mass_braked) {
        this.maximum_mass_braked = maximum_mass_braked;
    }


    /**
     * Gets the maximum_mass_trailer_braked value for this CarExtended.
     * 
     * @return maximum_mass_trailer_braked
     */
    public int getMaximum_mass_trailer_braked() {
        return maximum_mass_trailer_braked;
    }


    /**
     * Sets the maximum_mass_trailer_braked value for this CarExtended.
     * 
     * @param maximum_mass_trailer_braked
     */
    public void setMaximum_mass_trailer_braked(int maximum_mass_trailer_braked) {
        this.maximum_mass_trailer_braked = maximum_mass_trailer_braked;
    }


    /**
     * Gets the maximum_mass_self_braked value for this CarExtended.
     * 
     * @return maximum_mass_self_braked
     */
    public int getMaximum_mass_self_braked() {
        return maximum_mass_self_braked;
    }


    /**
     * Sets the maximum_mass_self_braked value for this CarExtended.
     * 
     * @param maximum_mass_self_braked
     */
    public void setMaximum_mass_self_braked(int maximum_mass_self_braked) {
        this.maximum_mass_self_braked = maximum_mass_self_braked;
    }


    /**
     * Gets the maximum_mass_axle_braked value for this CarExtended.
     * 
     * @return maximum_mass_axle_braked
     */
    public int getMaximum_mass_axle_braked() {
        return maximum_mass_axle_braked;
    }


    /**
     * Sets the maximum_mass_axle_braked value for this CarExtended.
     * 
     * @param maximum_mass_axle_braked
     */
    public void setMaximum_mass_axle_braked(int maximum_mass_axle_braked) {
        this.maximum_mass_axle_braked = maximum_mass_axle_braked;
    }


    /**
     * Gets the date_first_issuing value for this CarExtended.
     * 
     * @return date_first_issuing
     */
    public java.lang.String getDate_first_issuing() {
        return date_first_issuing;
    }


    /**
     * Sets the date_first_issuing value for this CarExtended.
     * 
     * @param date_first_issuing
     */
    public void setDate_first_issuing(java.lang.String date_first_issuing) {
        this.date_first_issuing = date_first_issuing;
    }


    /**
     * Gets the date_first_admission value for this CarExtended.
     * 
     * @return date_first_admission
     */
    public java.lang.String getDate_first_admission() {
        return date_first_admission;
    }


    /**
     * Sets the date_first_admission value for this CarExtended.
     * 
     * @param date_first_admission
     */
    public void setDate_first_admission(java.lang.String date_first_admission) {
        this.date_first_admission = date_first_admission;
    }


    /**
     * Gets the date_latest_name_registration value for this CarExtended.
     * 
     * @return date_latest_name_registration
     */
    public java.lang.String getDate_latest_name_registration() {
        return date_latest_name_registration;
    }


    /**
     * Sets the date_latest_name_registration value for this CarExtended.
     * 
     * @param date_latest_name_registration
     */
    public void setDate_latest_name_registration(java.lang.String date_latest_name_registration) {
        this.date_latest_name_registration = date_latest_name_registration;
    }


    /**
     * Gets the apk_due_date value for this CarExtended.
     * 
     * @return apk_due_date
     */
    public java.lang.String getApk_due_date() {
        return apk_due_date;
    }


    /**
     * Sets the apk_due_date value for this CarExtended.
     * 
     * @param apk_due_date
     */
    public void setApk_due_date(java.lang.String apk_due_date) {
        this.apk_due_date = apk_due_date;
    }


    /**
     * Gets the bpm value for this CarExtended.
     * 
     * @return bpm
     */
    public int getBpm() {
        return bpm;
    }


    /**
     * Sets the bpm value for this CarExtended.
     * 
     * @param bpm
     */
    public void setBpm(int bpm) {
        this.bpm = bpm;
    }


    /**
     * Gets the power value for this CarExtended.
     * 
     * @return power
     */
    public int getPower() {
        return power;
    }


    /**
     * Sets the power value for this CarExtended.
     * 
     * @param power
     */
    public void setPower(int power) {
        this.power = power;
    }


    /**
     * Gets the g3_indicator value for this CarExtended.
     * 
     * @return g3_indicator
     */
    public java.lang.String getG3_indicator() {
        return g3_indicator;
    }


    /**
     * Sets the g3_indicator value for this CarExtended.
     * 
     * @param g3_indicator
     */
    public void setG3_indicator(java.lang.String g3_indicator) {
        this.g3_indicator = g3_indicator;
    }


    /**
     * Gets the particulate_filter value for this CarExtended.
     * 
     * @return particulate_filter
     */
    public java.lang.String getParticulate_filter() {
        return particulate_filter;
    }


    /**
     * Sets the particulate_filter value for this CarExtended.
     * 
     * @param particulate_filter
     */
    public void setParticulate_filter(java.lang.String particulate_filter) {
        this.particulate_filter = particulate_filter;
    }


    /**
     * Gets the co2_emission_combined value for this CarExtended.
     * 
     * @return co2_emission_combined
     */
    public java.lang.String getCo2_emission_combined() {
        return co2_emission_combined;
    }


    /**
     * Sets the co2_emission_combined value for this CarExtended.
     * 
     * @param co2_emission_combined
     */
    public void setCo2_emission_combined(java.lang.String co2_emission_combined) {
        this.co2_emission_combined = co2_emission_combined;
    }


    /**
     * Gets the emission_code value for this CarExtended.
     * 
     * @return emission_code
     */
    public java.lang.String getEmission_code() {
        return emission_code;
    }


    /**
     * Sets the emission_code value for this CarExtended.
     * 
     * @param emission_code
     */
    public void setEmission_code(java.lang.String emission_code) {
        this.emission_code = emission_code;
    }


    /**
     * Gets the top_speed value for this CarExtended.
     * 
     * @return top_speed
     */
    public int getTop_speed() {
        return top_speed;
    }


    /**
     * Sets the top_speed value for this CarExtended.
     * 
     * @param top_speed
     */
    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }


    /**
     * Gets the fuel_consumption_city value for this CarExtended.
     * 
     * @return fuel_consumption_city
     */
    public java.lang.String getFuel_consumption_city() {
        return fuel_consumption_city;
    }


    /**
     * Sets the fuel_consumption_city value for this CarExtended.
     * 
     * @param fuel_consumption_city
     */
    public void setFuel_consumption_city(java.lang.String fuel_consumption_city) {
        this.fuel_consumption_city = fuel_consumption_city;
    }


    /**
     * Gets the fuel_consumption_freeway value for this CarExtended.
     * 
     * @return fuel_consumption_freeway
     */
    public java.lang.String getFuel_consumption_freeway() {
        return fuel_consumption_freeway;
    }


    /**
     * Sets the fuel_consumption_freeway value for this CarExtended.
     * 
     * @param fuel_consumption_freeway
     */
    public void setFuel_consumption_freeway(java.lang.String fuel_consumption_freeway) {
        this.fuel_consumption_freeway = fuel_consumption_freeway;
    }


    /**
     * Gets the fuel_consumption_combined value for this CarExtended.
     * 
     * @return fuel_consumption_combined
     */
    public java.lang.String getFuel_consumption_combined() {
        return fuel_consumption_combined;
    }


    /**
     * Sets the fuel_consumption_combined value for this CarExtended.
     * 
     * @param fuel_consumption_combined
     */
    public void setFuel_consumption_combined(java.lang.String fuel_consumption_combined) {
        this.fuel_consumption_combined = fuel_consumption_combined;
    }


    /**
     * Gets the energy_label value for this CarExtended.
     * 
     * @return energy_label
     */
    public java.lang.String getEnergy_label() {
        return energy_label;
    }


    /**
     * Sets the energy_label value for this CarExtended.
     * 
     * @param energy_label
     */
    public void setEnergy_label(java.lang.String energy_label) {
        this.energy_label = energy_label;
    }


    /**
     * Gets the stolen value for this CarExtended.
     * 
     * @return stolen
     */
    public boolean isStolen() {
        return stolen;
    }


    /**
     * Sets the stolen value for this CarExtended.
     * 
     * @param stolen
     */
    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }


    /**
     * Gets the insured value for this CarExtended.
     * 
     * @return insured
     */
    public boolean isInsured() {
        return insured;
    }


    /**
     * Sets the insured value for this CarExtended.
     * 
     * @param insured
     */
    public void setInsured(boolean insured) {
        this.insured = insured;
    }


    /**
     * Gets the license_plate_signal value for this CarExtended.
     * 
     * @return license_plate_signal
     */
    public boolean isLicense_plate_signal() {
        return license_plate_signal;
    }


    /**
     * Sets the license_plate_signal value for this CarExtended.
     * 
     * @param license_plate_signal
     */
    public void setLicense_plate_signal(boolean license_plate_signal) {
        this.license_plate_signal = license_plate_signal;
    }


    /**
     * Gets the awaiting_inspection value for this CarExtended.
     * 
     * @return awaiting_inspection
     */
    public boolean isAwaiting_inspection() {
        return awaiting_inspection;
    }


    /**
     * Sets the awaiting_inspection value for this CarExtended.
     * 
     * @param awaiting_inspection
     */
    public void setAwaiting_inspection(boolean awaiting_inspection) {
        this.awaiting_inspection = awaiting_inspection;
    }


    /**
     * Gets the catalog_price value for this CarExtended.
     * 
     * @return catalog_price
     */
    public java.lang.String getCatalog_price() {
        return catalog_price;
    }


    /**
     * Sets the catalog_price value for this CarExtended.
     * 
     * @param catalog_price
     */
    public void setCatalog_price(java.lang.String catalog_price) {
        this.catalog_price = catalog_price;
    }


    /**
     * Gets the european_type_approval_mark value for this CarExtended.
     * 
     * @return european_type_approval_mark
     */
    public java.lang.String getEuropean_type_approval_mark() {
        return european_type_approval_mark;
    }


    /**
     * Sets the european_type_approval_mark value for this CarExtended.
     * 
     * @param european_type_approval_mark
     */
    public void setEuropean_type_approval_mark(java.lang.String european_type_approval_mark) {
        this.european_type_approval_mark = european_type_approval_mark;
    }


    /**
     * Gets the types value for this CarExtended.
     * 
     * @return types
     */
    public nl.webservices.www.soap.CarType[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this CarExtended.
     * 
     * @param types
     */
    public void setTypes(nl.webservices.www.soap.CarType[] types) {
        this.types = types;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarExtended)) return false;
        CarExtended other = (CarExtended) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.license_plate==null && other.getLicense_plate()==null) || 
             (this.license_plate!=null &&
              this.license_plate.equals(other.getLicense_plate()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            this.check_code_status == other.isCheck_code_status() &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.brand_code==null && other.getBrand_code()==null) || 
             (this.brand_code!=null &&
              this.brand_code.equals(other.getBrand_code()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              java.util.Arrays.equals(this.model, other.getModel()))) &&
            ((this.body_style==null && other.getBody_style()==null) || 
             (this.body_style!=null &&
              this.body_style.equals(other.getBody_style()))) &&
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
            ((this.fuel_types==null && other.getFuel_types()==null) || 
             (this.fuel_types!=null &&
              java.util.Arrays.equals(this.fuel_types, other.getFuel_types()))) &&
            this.cylinders == other.getCylinders() &&
            this.cylinder_capacity == other.getCylinder_capacity() &&
            this.seats == other.getSeats() &&
            this.standing_room == other.getStanding_room() &&
            this.unladen_mass == other.getUnladen_mass() &&
            this.gross_vehicle_mass == other.getGross_vehicle_mass() &&
            this.mass_ready == other.getMass_ready() &&
            this.maximum_mass_payload == other.getMaximum_mass_payload() &&
            this.maximum_mass_unbraked == other.getMaximum_mass_unbraked() &&
            this.maximum_mass_braked == other.getMaximum_mass_braked() &&
            this.maximum_mass_trailer_braked == other.getMaximum_mass_trailer_braked() &&
            this.maximum_mass_self_braked == other.getMaximum_mass_self_braked() &&
            this.maximum_mass_axle_braked == other.getMaximum_mass_axle_braked() &&
            ((this.date_first_issuing==null && other.getDate_first_issuing()==null) || 
             (this.date_first_issuing!=null &&
              this.date_first_issuing.equals(other.getDate_first_issuing()))) &&
            ((this.date_first_admission==null && other.getDate_first_admission()==null) || 
             (this.date_first_admission!=null &&
              this.date_first_admission.equals(other.getDate_first_admission()))) &&
            ((this.date_latest_name_registration==null && other.getDate_latest_name_registration()==null) || 
             (this.date_latest_name_registration!=null &&
              this.date_latest_name_registration.equals(other.getDate_latest_name_registration()))) &&
            ((this.apk_due_date==null && other.getApk_due_date()==null) || 
             (this.apk_due_date!=null &&
              this.apk_due_date.equals(other.getApk_due_date()))) &&
            this.bpm == other.getBpm() &&
            this.power == other.getPower() &&
            ((this.g3_indicator==null && other.getG3_indicator()==null) || 
             (this.g3_indicator!=null &&
              this.g3_indicator.equals(other.getG3_indicator()))) &&
            ((this.particulate_filter==null && other.getParticulate_filter()==null) || 
             (this.particulate_filter!=null &&
              this.particulate_filter.equals(other.getParticulate_filter()))) &&
            ((this.co2_emission_combined==null && other.getCo2_emission_combined()==null) || 
             (this.co2_emission_combined!=null &&
              this.co2_emission_combined.equals(other.getCo2_emission_combined()))) &&
            ((this.emission_code==null && other.getEmission_code()==null) || 
             (this.emission_code!=null &&
              this.emission_code.equals(other.getEmission_code()))) &&
            this.top_speed == other.getTop_speed() &&
            ((this.fuel_consumption_city==null && other.getFuel_consumption_city()==null) || 
             (this.fuel_consumption_city!=null &&
              this.fuel_consumption_city.equals(other.getFuel_consumption_city()))) &&
            ((this.fuel_consumption_freeway==null && other.getFuel_consumption_freeway()==null) || 
             (this.fuel_consumption_freeway!=null &&
              this.fuel_consumption_freeway.equals(other.getFuel_consumption_freeway()))) &&
            ((this.fuel_consumption_combined==null && other.getFuel_consumption_combined()==null) || 
             (this.fuel_consumption_combined!=null &&
              this.fuel_consumption_combined.equals(other.getFuel_consumption_combined()))) &&
            ((this.energy_label==null && other.getEnergy_label()==null) || 
             (this.energy_label!=null &&
              this.energy_label.equals(other.getEnergy_label()))) &&
            this.stolen == other.isStolen() &&
            this.insured == other.isInsured() &&
            this.license_plate_signal == other.isLicense_plate_signal() &&
            this.awaiting_inspection == other.isAwaiting_inspection() &&
            ((this.catalog_price==null && other.getCatalog_price()==null) || 
             (this.catalog_price!=null &&
              this.catalog_price.equals(other.getCatalog_price()))) &&
            ((this.european_type_approval_mark==null && other.getEuropean_type_approval_mark()==null) || 
             (this.european_type_approval_mark!=null &&
              this.european_type_approval_mark.equals(other.getEuropean_type_approval_mark()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes())));
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
        if (getLicense_plate() != null) {
            _hashCode += getLicense_plate().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        _hashCode += (isCheck_code_status() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getBrand_code() != null) {
            _hashCode += getBrand_code().hashCode();
        }
        if (getModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBody_style() != null) {
            _hashCode += getBody_style().hashCode();
        }
        if (getColors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFuel_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFuel_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFuel_types(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCylinders();
        _hashCode += getCylinder_capacity();
        _hashCode += getSeats();
        _hashCode += getStanding_room();
        _hashCode += getUnladen_mass();
        _hashCode += getGross_vehicle_mass();
        _hashCode += getMass_ready();
        _hashCode += getMaximum_mass_payload();
        _hashCode += getMaximum_mass_unbraked();
        _hashCode += getMaximum_mass_braked();
        _hashCode += getMaximum_mass_trailer_braked();
        _hashCode += getMaximum_mass_self_braked();
        _hashCode += getMaximum_mass_axle_braked();
        if (getDate_first_issuing() != null) {
            _hashCode += getDate_first_issuing().hashCode();
        }
        if (getDate_first_admission() != null) {
            _hashCode += getDate_first_admission().hashCode();
        }
        if (getDate_latest_name_registration() != null) {
            _hashCode += getDate_latest_name_registration().hashCode();
        }
        if (getApk_due_date() != null) {
            _hashCode += getApk_due_date().hashCode();
        }
        _hashCode += getBpm();
        _hashCode += getPower();
        if (getG3_indicator() != null) {
            _hashCode += getG3_indicator().hashCode();
        }
        if (getParticulate_filter() != null) {
            _hashCode += getParticulate_filter().hashCode();
        }
        if (getCo2_emission_combined() != null) {
            _hashCode += getCo2_emission_combined().hashCode();
        }
        if (getEmission_code() != null) {
            _hashCode += getEmission_code().hashCode();
        }
        _hashCode += getTop_speed();
        if (getFuel_consumption_city() != null) {
            _hashCode += getFuel_consumption_city().hashCode();
        }
        if (getFuel_consumption_freeway() != null) {
            _hashCode += getFuel_consumption_freeway().hashCode();
        }
        if (getFuel_consumption_combined() != null) {
            _hashCode += getFuel_consumption_combined().hashCode();
        }
        if (getEnergy_label() != null) {
            _hashCode += getEnergy_label().hashCode();
        }
        _hashCode += (isStolen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInsured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLicense_plate_signal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAwaiting_inspection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCatalog_price() != null) {
            _hashCode += getCatalog_price().hashCode();
        }
        if (getEuropean_type_approval_mark() != null) {
            _hashCode += getEuropean_type_approval_mark().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
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
        new org.apache.axis.description.TypeDesc(CarExtended.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarExtended"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_plate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "license_plate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_code_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "check_code_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "colors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cylinders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cylinder_capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standing_room");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "standing_room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unladen_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "unladen_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gross_vehicle_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gross_vehicle_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mass_ready");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mass_ready"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_payload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_unbraked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_unbraked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_trailer_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_trailer_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_self_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_self_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_axle_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_axle_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_issuing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_issuing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_admission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_admission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_latest_name_registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_latest_name_registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apk_due_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "apk_due_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bpm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g3_indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "g3_indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particulate_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "particulate_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2_emission_combined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "co2_emission_combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top_speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "top_speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_consumption_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_consumption_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_consumption_freeway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_consumption_freeway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_consumption_combined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_consumption_combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energy_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "energy_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stolen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stolen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_plate_signal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "license_plate_signal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaiting_inspection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "awaiting_inspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "catalog_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("european_type_approval_mark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "european_type_approval_mark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarType"));
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
