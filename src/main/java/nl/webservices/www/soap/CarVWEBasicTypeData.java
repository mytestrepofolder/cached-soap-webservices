/**
 * CarVWEBasicTypeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEBasicTypeData  implements java.io.Serializable {
    private java.lang.String category;

    private java.lang.String brand_rdw;

    private java.lang.String brand_atl;

    private java.lang.String model_rdw;

    private java.lang.String model_atl;

    private java.lang.String short_type;

    private java.lang.String[] colors;

    private java.lang.String[] fuel_types;

    private java.lang.Integer cylinders;

    private java.lang.Integer cylinder_capacity;

    private java.lang.Integer seats;

    private java.lang.Integer standing_room;

    private java.lang.Integer unladen_mass;

    private java.lang.Integer gross_vehicle_mass;

    private java.lang.Integer maximum_mass_payload;

    private java.util.Date date_first_issuing;

    private java.util.Date date_first_admission;

    private java.util.Date date_latest_name_registration;

    private java.util.Date apk_due_date;

    private java.lang.Integer bpm;

    private java.lang.String bpm_currency;

    private java.lang.Integer power;

    private java.lang.Boolean g3_indication;

    private java.lang.Integer co2_emission;

    private java.lang.String emission_particles;

    private java.lang.String energy_label;

    private java.lang.String emission_code;

    private java.lang.String interior_code;

    private java.lang.String interior_description;

    private java.lang.Integer doors;

    private java.lang.String tax_write_off;

    private java.lang.Boolean parallel_import;

    private java.lang.String license_plate_signal;

    private java.lang.String gear;

    private java.lang.String brand_approval;

    private java.lang.Integer top_speed;

    private nl.webservices.www.soap.CarVWEVersionPriceReference[] types;

    public CarVWEBasicTypeData() {
    }

    public CarVWEBasicTypeData(
           java.lang.String category,
           java.lang.String brand_rdw,
           java.lang.String brand_atl,
           java.lang.String model_rdw,
           java.lang.String model_atl,
           java.lang.String short_type,
           java.lang.String[] colors,
           java.lang.String[] fuel_types,
           java.lang.Integer cylinders,
           java.lang.Integer cylinder_capacity,
           java.lang.Integer seats,
           java.lang.Integer standing_room,
           java.lang.Integer unladen_mass,
           java.lang.Integer gross_vehicle_mass,
           java.lang.Integer maximum_mass_payload,
           java.util.Date date_first_issuing,
           java.util.Date date_first_admission,
           java.util.Date date_latest_name_registration,
           java.util.Date apk_due_date,
           java.lang.Integer bpm,
           java.lang.String bpm_currency,
           java.lang.Integer power,
           java.lang.Boolean g3_indication,
           java.lang.Integer co2_emission,
           java.lang.String emission_particles,
           java.lang.String energy_label,
           java.lang.String emission_code,
           java.lang.String interior_code,
           java.lang.String interior_description,
           java.lang.Integer doors,
           java.lang.String tax_write_off,
           java.lang.Boolean parallel_import,
           java.lang.String license_plate_signal,
           java.lang.String gear,
           java.lang.String brand_approval,
           java.lang.Integer top_speed,
           nl.webservices.www.soap.CarVWEVersionPriceReference[] types) {
           this.category = category;
           this.brand_rdw = brand_rdw;
           this.brand_atl = brand_atl;
           this.model_rdw = model_rdw;
           this.model_atl = model_atl;
           this.short_type = short_type;
           this.colors = colors;
           this.fuel_types = fuel_types;
           this.cylinders = cylinders;
           this.cylinder_capacity = cylinder_capacity;
           this.seats = seats;
           this.standing_room = standing_room;
           this.unladen_mass = unladen_mass;
           this.gross_vehicle_mass = gross_vehicle_mass;
           this.maximum_mass_payload = maximum_mass_payload;
           this.date_first_issuing = date_first_issuing;
           this.date_first_admission = date_first_admission;
           this.date_latest_name_registration = date_latest_name_registration;
           this.apk_due_date = apk_due_date;
           this.bpm = bpm;
           this.bpm_currency = bpm_currency;
           this.power = power;
           this.g3_indication = g3_indication;
           this.co2_emission = co2_emission;
           this.emission_particles = emission_particles;
           this.energy_label = energy_label;
           this.emission_code = emission_code;
           this.interior_code = interior_code;
           this.interior_description = interior_description;
           this.doors = doors;
           this.tax_write_off = tax_write_off;
           this.parallel_import = parallel_import;
           this.license_plate_signal = license_plate_signal;
           this.gear = gear;
           this.brand_approval = brand_approval;
           this.top_speed = top_speed;
           this.types = types;
    }


    /**
     * Gets the category value for this CarVWEBasicTypeData.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CarVWEBasicTypeData.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the brand_rdw value for this CarVWEBasicTypeData.
     * 
     * @return brand_rdw
     */
    public java.lang.String getBrand_rdw() {
        return brand_rdw;
    }


    /**
     * Sets the brand_rdw value for this CarVWEBasicTypeData.
     * 
     * @param brand_rdw
     */
    public void setBrand_rdw(java.lang.String brand_rdw) {
        this.brand_rdw = brand_rdw;
    }


    /**
     * Gets the brand_atl value for this CarVWEBasicTypeData.
     * 
     * @return brand_atl
     */
    public java.lang.String getBrand_atl() {
        return brand_atl;
    }


    /**
     * Sets the brand_atl value for this CarVWEBasicTypeData.
     * 
     * @param brand_atl
     */
    public void setBrand_atl(java.lang.String brand_atl) {
        this.brand_atl = brand_atl;
    }


    /**
     * Gets the model_rdw value for this CarVWEBasicTypeData.
     * 
     * @return model_rdw
     */
    public java.lang.String getModel_rdw() {
        return model_rdw;
    }


    /**
     * Sets the model_rdw value for this CarVWEBasicTypeData.
     * 
     * @param model_rdw
     */
    public void setModel_rdw(java.lang.String model_rdw) {
        this.model_rdw = model_rdw;
    }


    /**
     * Gets the model_atl value for this CarVWEBasicTypeData.
     * 
     * @return model_atl
     */
    public java.lang.String getModel_atl() {
        return model_atl;
    }


    /**
     * Sets the model_atl value for this CarVWEBasicTypeData.
     * 
     * @param model_atl
     */
    public void setModel_atl(java.lang.String model_atl) {
        this.model_atl = model_atl;
    }


    /**
     * Gets the short_type value for this CarVWEBasicTypeData.
     * 
     * @return short_type
     */
    public java.lang.String getShort_type() {
        return short_type;
    }


    /**
     * Sets the short_type value for this CarVWEBasicTypeData.
     * 
     * @param short_type
     */
    public void setShort_type(java.lang.String short_type) {
        this.short_type = short_type;
    }


    /**
     * Gets the colors value for this CarVWEBasicTypeData.
     * 
     * @return colors
     */
    public java.lang.String[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this CarVWEBasicTypeData.
     * 
     * @param colors
     */
    public void setColors(java.lang.String[] colors) {
        this.colors = colors;
    }


    /**
     * Gets the fuel_types value for this CarVWEBasicTypeData.
     * 
     * @return fuel_types
     */
    public java.lang.String[] getFuel_types() {
        return fuel_types;
    }


    /**
     * Sets the fuel_types value for this CarVWEBasicTypeData.
     * 
     * @param fuel_types
     */
    public void setFuel_types(java.lang.String[] fuel_types) {
        this.fuel_types = fuel_types;
    }


    /**
     * Gets the cylinders value for this CarVWEBasicTypeData.
     * 
     * @return cylinders
     */
    public java.lang.Integer getCylinders() {
        return cylinders;
    }


    /**
     * Sets the cylinders value for this CarVWEBasicTypeData.
     * 
     * @param cylinders
     */
    public void setCylinders(java.lang.Integer cylinders) {
        this.cylinders = cylinders;
    }


    /**
     * Gets the cylinder_capacity value for this CarVWEBasicTypeData.
     * 
     * @return cylinder_capacity
     */
    public java.lang.Integer getCylinder_capacity() {
        return cylinder_capacity;
    }


    /**
     * Sets the cylinder_capacity value for this CarVWEBasicTypeData.
     * 
     * @param cylinder_capacity
     */
    public void setCylinder_capacity(java.lang.Integer cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }


    /**
     * Gets the seats value for this CarVWEBasicTypeData.
     * 
     * @return seats
     */
    public java.lang.Integer getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this CarVWEBasicTypeData.
     * 
     * @param seats
     */
    public void setSeats(java.lang.Integer seats) {
        this.seats = seats;
    }


    /**
     * Gets the standing_room value for this CarVWEBasicTypeData.
     * 
     * @return standing_room
     */
    public java.lang.Integer getStanding_room() {
        return standing_room;
    }


    /**
     * Sets the standing_room value for this CarVWEBasicTypeData.
     * 
     * @param standing_room
     */
    public void setStanding_room(java.lang.Integer standing_room) {
        this.standing_room = standing_room;
    }


    /**
     * Gets the unladen_mass value for this CarVWEBasicTypeData.
     * 
     * @return unladen_mass
     */
    public java.lang.Integer getUnladen_mass() {
        return unladen_mass;
    }


    /**
     * Sets the unladen_mass value for this CarVWEBasicTypeData.
     * 
     * @param unladen_mass
     */
    public void setUnladen_mass(java.lang.Integer unladen_mass) {
        this.unladen_mass = unladen_mass;
    }


    /**
     * Gets the gross_vehicle_mass value for this CarVWEBasicTypeData.
     * 
     * @return gross_vehicle_mass
     */
    public java.lang.Integer getGross_vehicle_mass() {
        return gross_vehicle_mass;
    }


    /**
     * Sets the gross_vehicle_mass value for this CarVWEBasicTypeData.
     * 
     * @param gross_vehicle_mass
     */
    public void setGross_vehicle_mass(java.lang.Integer gross_vehicle_mass) {
        this.gross_vehicle_mass = gross_vehicle_mass;
    }


    /**
     * Gets the maximum_mass_payload value for this CarVWEBasicTypeData.
     * 
     * @return maximum_mass_payload
     */
    public java.lang.Integer getMaximum_mass_payload() {
        return maximum_mass_payload;
    }


    /**
     * Sets the maximum_mass_payload value for this CarVWEBasicTypeData.
     * 
     * @param maximum_mass_payload
     */
    public void setMaximum_mass_payload(java.lang.Integer maximum_mass_payload) {
        this.maximum_mass_payload = maximum_mass_payload;
    }


    /**
     * Gets the date_first_issuing value for this CarVWEBasicTypeData.
     * 
     * @return date_first_issuing
     */
    public java.util.Date getDate_first_issuing() {
        return date_first_issuing;
    }


    /**
     * Sets the date_first_issuing value for this CarVWEBasicTypeData.
     * 
     * @param date_first_issuing
     */
    public void setDate_first_issuing(java.util.Date date_first_issuing) {
        this.date_first_issuing = date_first_issuing;
    }


    /**
     * Gets the date_first_admission value for this CarVWEBasicTypeData.
     * 
     * @return date_first_admission
     */
    public java.util.Date getDate_first_admission() {
        return date_first_admission;
    }


    /**
     * Sets the date_first_admission value for this CarVWEBasicTypeData.
     * 
     * @param date_first_admission
     */
    public void setDate_first_admission(java.util.Date date_first_admission) {
        this.date_first_admission = date_first_admission;
    }


    /**
     * Gets the date_latest_name_registration value for this CarVWEBasicTypeData.
     * 
     * @return date_latest_name_registration
     */
    public java.util.Date getDate_latest_name_registration() {
        return date_latest_name_registration;
    }


    /**
     * Sets the date_latest_name_registration value for this CarVWEBasicTypeData.
     * 
     * @param date_latest_name_registration
     */
    public void setDate_latest_name_registration(java.util.Date date_latest_name_registration) {
        this.date_latest_name_registration = date_latest_name_registration;
    }


    /**
     * Gets the apk_due_date value for this CarVWEBasicTypeData.
     * 
     * @return apk_due_date
     */
    public java.util.Date getApk_due_date() {
        return apk_due_date;
    }


    /**
     * Sets the apk_due_date value for this CarVWEBasicTypeData.
     * 
     * @param apk_due_date
     */
    public void setApk_due_date(java.util.Date apk_due_date) {
        this.apk_due_date = apk_due_date;
    }


    /**
     * Gets the bpm value for this CarVWEBasicTypeData.
     * 
     * @return bpm
     */
    public java.lang.Integer getBpm() {
        return bpm;
    }


    /**
     * Sets the bpm value for this CarVWEBasicTypeData.
     * 
     * @param bpm
     */
    public void setBpm(java.lang.Integer bpm) {
        this.bpm = bpm;
    }


    /**
     * Gets the bpm_currency value for this CarVWEBasicTypeData.
     * 
     * @return bpm_currency
     */
    public java.lang.String getBpm_currency() {
        return bpm_currency;
    }


    /**
     * Sets the bpm_currency value for this CarVWEBasicTypeData.
     * 
     * @param bpm_currency
     */
    public void setBpm_currency(java.lang.String bpm_currency) {
        this.bpm_currency = bpm_currency;
    }


    /**
     * Gets the power value for this CarVWEBasicTypeData.
     * 
     * @return power
     */
    public java.lang.Integer getPower() {
        return power;
    }


    /**
     * Sets the power value for this CarVWEBasicTypeData.
     * 
     * @param power
     */
    public void setPower(java.lang.Integer power) {
        this.power = power;
    }


    /**
     * Gets the g3_indication value for this CarVWEBasicTypeData.
     * 
     * @return g3_indication
     */
    public java.lang.Boolean getG3_indication() {
        return g3_indication;
    }


    /**
     * Sets the g3_indication value for this CarVWEBasicTypeData.
     * 
     * @param g3_indication
     */
    public void setG3_indication(java.lang.Boolean g3_indication) {
        this.g3_indication = g3_indication;
    }


    /**
     * Gets the co2_emission value for this CarVWEBasicTypeData.
     * 
     * @return co2_emission
     */
    public java.lang.Integer getCo2_emission() {
        return co2_emission;
    }


    /**
     * Sets the co2_emission value for this CarVWEBasicTypeData.
     * 
     * @param co2_emission
     */
    public void setCo2_emission(java.lang.Integer co2_emission) {
        this.co2_emission = co2_emission;
    }


    /**
     * Gets the emission_particles value for this CarVWEBasicTypeData.
     * 
     * @return emission_particles
     */
    public java.lang.String getEmission_particles() {
        return emission_particles;
    }


    /**
     * Sets the emission_particles value for this CarVWEBasicTypeData.
     * 
     * @param emission_particles
     */
    public void setEmission_particles(java.lang.String emission_particles) {
        this.emission_particles = emission_particles;
    }


    /**
     * Gets the energy_label value for this CarVWEBasicTypeData.
     * 
     * @return energy_label
     */
    public java.lang.String getEnergy_label() {
        return energy_label;
    }


    /**
     * Sets the energy_label value for this CarVWEBasicTypeData.
     * 
     * @param energy_label
     */
    public void setEnergy_label(java.lang.String energy_label) {
        this.energy_label = energy_label;
    }


    /**
     * Gets the emission_code value for this CarVWEBasicTypeData.
     * 
     * @return emission_code
     */
    public java.lang.String getEmission_code() {
        return emission_code;
    }


    /**
     * Sets the emission_code value for this CarVWEBasicTypeData.
     * 
     * @param emission_code
     */
    public void setEmission_code(java.lang.String emission_code) {
        this.emission_code = emission_code;
    }


    /**
     * Gets the interior_code value for this CarVWEBasicTypeData.
     * 
     * @return interior_code
     */
    public java.lang.String getInterior_code() {
        return interior_code;
    }


    /**
     * Sets the interior_code value for this CarVWEBasicTypeData.
     * 
     * @param interior_code
     */
    public void setInterior_code(java.lang.String interior_code) {
        this.interior_code = interior_code;
    }


    /**
     * Gets the interior_description value for this CarVWEBasicTypeData.
     * 
     * @return interior_description
     */
    public java.lang.String getInterior_description() {
        return interior_description;
    }


    /**
     * Sets the interior_description value for this CarVWEBasicTypeData.
     * 
     * @param interior_description
     */
    public void setInterior_description(java.lang.String interior_description) {
        this.interior_description = interior_description;
    }


    /**
     * Gets the doors value for this CarVWEBasicTypeData.
     * 
     * @return doors
     */
    public java.lang.Integer getDoors() {
        return doors;
    }


    /**
     * Sets the doors value for this CarVWEBasicTypeData.
     * 
     * @param doors
     */
    public void setDoors(java.lang.Integer doors) {
        this.doors = doors;
    }


    /**
     * Gets the tax_write_off value for this CarVWEBasicTypeData.
     * 
     * @return tax_write_off
     */
    public java.lang.String getTax_write_off() {
        return tax_write_off;
    }


    /**
     * Sets the tax_write_off value for this CarVWEBasicTypeData.
     * 
     * @param tax_write_off
     */
    public void setTax_write_off(java.lang.String tax_write_off) {
        this.tax_write_off = tax_write_off;
    }


    /**
     * Gets the parallel_import value for this CarVWEBasicTypeData.
     * 
     * @return parallel_import
     */
    public java.lang.Boolean getParallel_import() {
        return parallel_import;
    }


    /**
     * Sets the parallel_import value for this CarVWEBasicTypeData.
     * 
     * @param parallel_import
     */
    public void setParallel_import(java.lang.Boolean parallel_import) {
        this.parallel_import = parallel_import;
    }


    /**
     * Gets the license_plate_signal value for this CarVWEBasicTypeData.
     * 
     * @return license_plate_signal
     */
    public java.lang.String getLicense_plate_signal() {
        return license_plate_signal;
    }


    /**
     * Sets the license_plate_signal value for this CarVWEBasicTypeData.
     * 
     * @param license_plate_signal
     */
    public void setLicense_plate_signal(java.lang.String license_plate_signal) {
        this.license_plate_signal = license_plate_signal;
    }


    /**
     * Gets the gear value for this CarVWEBasicTypeData.
     * 
     * @return gear
     */
    public java.lang.String getGear() {
        return gear;
    }


    /**
     * Sets the gear value for this CarVWEBasicTypeData.
     * 
     * @param gear
     */
    public void setGear(java.lang.String gear) {
        this.gear = gear;
    }


    /**
     * Gets the brand_approval value for this CarVWEBasicTypeData.
     * 
     * @return brand_approval
     */
    public java.lang.String getBrand_approval() {
        return brand_approval;
    }


    /**
     * Sets the brand_approval value for this CarVWEBasicTypeData.
     * 
     * @param brand_approval
     */
    public void setBrand_approval(java.lang.String brand_approval) {
        this.brand_approval = brand_approval;
    }


    /**
     * Gets the top_speed value for this CarVWEBasicTypeData.
     * 
     * @return top_speed
     */
    public java.lang.Integer getTop_speed() {
        return top_speed;
    }


    /**
     * Sets the top_speed value for this CarVWEBasicTypeData.
     * 
     * @param top_speed
     */
    public void setTop_speed(java.lang.Integer top_speed) {
        this.top_speed = top_speed;
    }


    /**
     * Gets the types value for this CarVWEBasicTypeData.
     * 
     * @return types
     */
    public nl.webservices.www.soap.CarVWEVersionPriceReference[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this CarVWEBasicTypeData.
     * 
     * @param types
     */
    public void setTypes(nl.webservices.www.soap.CarVWEVersionPriceReference[] types) {
        this.types = types;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEBasicTypeData)) return false;
        CarVWEBasicTypeData other = (CarVWEBasicTypeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.brand_rdw==null && other.getBrand_rdw()==null) || 
             (this.brand_rdw!=null &&
              this.brand_rdw.equals(other.getBrand_rdw()))) &&
            ((this.brand_atl==null && other.getBrand_atl()==null) || 
             (this.brand_atl!=null &&
              this.brand_atl.equals(other.getBrand_atl()))) &&
            ((this.model_rdw==null && other.getModel_rdw()==null) || 
             (this.model_rdw!=null &&
              this.model_rdw.equals(other.getModel_rdw()))) &&
            ((this.model_atl==null && other.getModel_atl()==null) || 
             (this.model_atl!=null &&
              this.model_atl.equals(other.getModel_atl()))) &&
            ((this.short_type==null && other.getShort_type()==null) || 
             (this.short_type!=null &&
              this.short_type.equals(other.getShort_type()))) &&
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
            ((this.fuel_types==null && other.getFuel_types()==null) || 
             (this.fuel_types!=null &&
              java.util.Arrays.equals(this.fuel_types, other.getFuel_types()))) &&
            ((this.cylinders==null && other.getCylinders()==null) || 
             (this.cylinders!=null &&
              this.cylinders.equals(other.getCylinders()))) &&
            ((this.cylinder_capacity==null && other.getCylinder_capacity()==null) || 
             (this.cylinder_capacity!=null &&
              this.cylinder_capacity.equals(other.getCylinder_capacity()))) &&
            ((this.seats==null && other.getSeats()==null) || 
             (this.seats!=null &&
              this.seats.equals(other.getSeats()))) &&
            ((this.standing_room==null && other.getStanding_room()==null) || 
             (this.standing_room!=null &&
              this.standing_room.equals(other.getStanding_room()))) &&
            ((this.unladen_mass==null && other.getUnladen_mass()==null) || 
             (this.unladen_mass!=null &&
              this.unladen_mass.equals(other.getUnladen_mass()))) &&
            ((this.gross_vehicle_mass==null && other.getGross_vehicle_mass()==null) || 
             (this.gross_vehicle_mass!=null &&
              this.gross_vehicle_mass.equals(other.getGross_vehicle_mass()))) &&
            ((this.maximum_mass_payload==null && other.getMaximum_mass_payload()==null) || 
             (this.maximum_mass_payload!=null &&
              this.maximum_mass_payload.equals(other.getMaximum_mass_payload()))) &&
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
            ((this.bpm==null && other.getBpm()==null) || 
             (this.bpm!=null &&
              this.bpm.equals(other.getBpm()))) &&
            ((this.bpm_currency==null && other.getBpm_currency()==null) || 
             (this.bpm_currency!=null &&
              this.bpm_currency.equals(other.getBpm_currency()))) &&
            ((this.power==null && other.getPower()==null) || 
             (this.power!=null &&
              this.power.equals(other.getPower()))) &&
            ((this.g3_indication==null && other.getG3_indication()==null) || 
             (this.g3_indication!=null &&
              this.g3_indication.equals(other.getG3_indication()))) &&
            ((this.co2_emission==null && other.getCo2_emission()==null) || 
             (this.co2_emission!=null &&
              this.co2_emission.equals(other.getCo2_emission()))) &&
            ((this.emission_particles==null && other.getEmission_particles()==null) || 
             (this.emission_particles!=null &&
              this.emission_particles.equals(other.getEmission_particles()))) &&
            ((this.energy_label==null && other.getEnergy_label()==null) || 
             (this.energy_label!=null &&
              this.energy_label.equals(other.getEnergy_label()))) &&
            ((this.emission_code==null && other.getEmission_code()==null) || 
             (this.emission_code!=null &&
              this.emission_code.equals(other.getEmission_code()))) &&
            ((this.interior_code==null && other.getInterior_code()==null) || 
             (this.interior_code!=null &&
              this.interior_code.equals(other.getInterior_code()))) &&
            ((this.interior_description==null && other.getInterior_description()==null) || 
             (this.interior_description!=null &&
              this.interior_description.equals(other.getInterior_description()))) &&
            ((this.doors==null && other.getDoors()==null) || 
             (this.doors!=null &&
              this.doors.equals(other.getDoors()))) &&
            ((this.tax_write_off==null && other.getTax_write_off()==null) || 
             (this.tax_write_off!=null &&
              this.tax_write_off.equals(other.getTax_write_off()))) &&
            ((this.parallel_import==null && other.getParallel_import()==null) || 
             (this.parallel_import!=null &&
              this.parallel_import.equals(other.getParallel_import()))) &&
            ((this.license_plate_signal==null && other.getLicense_plate_signal()==null) || 
             (this.license_plate_signal!=null &&
              this.license_plate_signal.equals(other.getLicense_plate_signal()))) &&
            ((this.gear==null && other.getGear()==null) || 
             (this.gear!=null &&
              this.gear.equals(other.getGear()))) &&
            ((this.brand_approval==null && other.getBrand_approval()==null) || 
             (this.brand_approval!=null &&
              this.brand_approval.equals(other.getBrand_approval()))) &&
            ((this.top_speed==null && other.getTop_speed()==null) || 
             (this.top_speed!=null &&
              this.top_speed.equals(other.getTop_speed()))) &&
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBrand_rdw() != null) {
            _hashCode += getBrand_rdw().hashCode();
        }
        if (getBrand_atl() != null) {
            _hashCode += getBrand_atl().hashCode();
        }
        if (getModel_rdw() != null) {
            _hashCode += getModel_rdw().hashCode();
        }
        if (getModel_atl() != null) {
            _hashCode += getModel_atl().hashCode();
        }
        if (getShort_type() != null) {
            _hashCode += getShort_type().hashCode();
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
        if (getCylinders() != null) {
            _hashCode += getCylinders().hashCode();
        }
        if (getCylinder_capacity() != null) {
            _hashCode += getCylinder_capacity().hashCode();
        }
        if (getSeats() != null) {
            _hashCode += getSeats().hashCode();
        }
        if (getStanding_room() != null) {
            _hashCode += getStanding_room().hashCode();
        }
        if (getUnladen_mass() != null) {
            _hashCode += getUnladen_mass().hashCode();
        }
        if (getGross_vehicle_mass() != null) {
            _hashCode += getGross_vehicle_mass().hashCode();
        }
        if (getMaximum_mass_payload() != null) {
            _hashCode += getMaximum_mass_payload().hashCode();
        }
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
        if (getBpm() != null) {
            _hashCode += getBpm().hashCode();
        }
        if (getBpm_currency() != null) {
            _hashCode += getBpm_currency().hashCode();
        }
        if (getPower() != null) {
            _hashCode += getPower().hashCode();
        }
        if (getG3_indication() != null) {
            _hashCode += getG3_indication().hashCode();
        }
        if (getCo2_emission() != null) {
            _hashCode += getCo2_emission().hashCode();
        }
        if (getEmission_particles() != null) {
            _hashCode += getEmission_particles().hashCode();
        }
        if (getEnergy_label() != null) {
            _hashCode += getEnergy_label().hashCode();
        }
        if (getEmission_code() != null) {
            _hashCode += getEmission_code().hashCode();
        }
        if (getInterior_code() != null) {
            _hashCode += getInterior_code().hashCode();
        }
        if (getInterior_description() != null) {
            _hashCode += getInterior_description().hashCode();
        }
        if (getDoors() != null) {
            _hashCode += getDoors().hashCode();
        }
        if (getTax_write_off() != null) {
            _hashCode += getTax_write_off().hashCode();
        }
        if (getParallel_import() != null) {
            _hashCode += getParallel_import().hashCode();
        }
        if (getLicense_plate_signal() != null) {
            _hashCode += getLicense_plate_signal().hashCode();
        }
        if (getGear() != null) {
            _hashCode += getGear().hashCode();
        }
        if (getBrand_approval() != null) {
            _hashCode += getBrand_approval().hashCode();
        }
        if (getTop_speed() != null) {
            _hashCode += getTop_speed().hashCode();
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
        new org.apache.axis.description.TypeDesc(CarVWEBasicTypeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEBasicTypeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_rdw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_rdw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_atl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_atl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_rdw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model_rdw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_atl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model_atl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "short_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cylinder_capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standing_room");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "standing_room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unladen_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "unladen_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gross_vehicle_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gross_vehicle_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_payload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_issuing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_issuing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_first_admission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_first_admission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_latest_name_registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_latest_name_registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apk_due_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "apk_due_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bpm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bpm_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bpm_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g3_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "g3_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2_emission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "co2_emission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_particles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_particles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energy_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "energy_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emission_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "emission_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interior_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "interior_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interior_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "interior_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "doors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_write_off");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tax_write_off"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parallel_import");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "parallel_import"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_plate_signal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "license_plate_signal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_approval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_approval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top_speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "top_speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEVersionPriceReference"));
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
