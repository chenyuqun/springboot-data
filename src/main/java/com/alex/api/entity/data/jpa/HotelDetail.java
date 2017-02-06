package com.alex.api.entity.data.jpa;

import javax.persistence.*;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/2/6
 */
@Entity
@Table(name = "hotel_detail", schema = "api", catalog = "api")
public class HotelDetail {
    private int id;
    private String hotelId;
    private String name;
    private String address;
    private Double googleLat;
    private Double googleLon;
    private String cityId;
    private String districtId;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hotel_id", nullable = true, length = 20)
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 64)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "google_lat", nullable = true, precision = 0)
    public Double getGoogleLat() {
        return googleLat;
    }

    public void setGoogleLat(Double googleLat) {
        this.googleLat = googleLat;
    }

    @Basic
    @Column(name = "google_lon", nullable = true, precision = 0)
    public Double getGoogleLon() {
        return googleLon;
    }

    public void setGoogleLon(Double googleLon) {
        this.googleLon = googleLon;
    }

    @Basic
    @Column(name = "city_id", nullable = true, length = 20)
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "district_id", nullable = true, length = 64)
    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelDetail that = (HotelDetail) o;

        if (id != that.id) return false;
        if (hotelId != null ? !hotelId.equals(that.hotelId) : that.hotelId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (googleLat != null ? !googleLat.equals(that.googleLat) : that.googleLat != null) return false;
        if (googleLon != null ? !googleLon.equals(that.googleLon) : that.googleLon != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (districtId != null ? !districtId.equals(that.districtId) : that.districtId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hotelId != null ? hotelId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (googleLat != null ? googleLat.hashCode() : 0);
        result = 31 * result + (googleLon != null ? googleLon.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (districtId != null ? districtId.hashCode() : 0);
        return result;
    }
}
