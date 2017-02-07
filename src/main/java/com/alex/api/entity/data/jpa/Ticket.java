package com.alex.api.entity.data.jpa;

import javax.persistence.*;
import java.sql.Date;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/2/6
 */
@Entity
@Table(name = "ticket", schema = "api",catalog = "api")
public class Ticket implements java.io.Serializable{

    private static final long serialVersionUID = 4635707745500790942L;
    private int id;
    private String provinceName;
    private String cityName;
    private String districtName;
    private String scenicName;
    private String scenicAddress;
    private String scenicTime;
    private String superScript;
    private String scenicSubject;
    private String scenicPoint;
    private String scenicPicture;
    private Date updateTime;
    private Date createTime;
    private String cityId;
    private String googleLon;
    private String googleLat;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "province_name", nullable = false, length = 100)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "city_name", nullable = false, length = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "district_name", nullable = true, length = 100)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "scenic_name", nullable = true, length = 255)
    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    @Basic
    @Column(name = "scenic_address", nullable = true, length = 255)
    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress;
    }

    @Basic
    @Column(name = "scenic_time", nullable = true, length = 255)
    public String getScenicTime() {
        return scenicTime;
    }

    public void setScenicTime(String scenicTime) {
        this.scenicTime = scenicTime;
    }

    @Basic
    @Column(name = "super_script", nullable = true, length = 255)
    public String getSuperScript() {
        return superScript;
    }

    public void setSuperScript(String superScript) {
        this.superScript = superScript;
    }

    @Basic
    @Column(name = "scenic_subject", nullable = true, length = 255)
    public String getScenicSubject() {
        return scenicSubject;
    }

    public void setScenicSubject(String scenicSubject) {
        this.scenicSubject = scenicSubject;
    }

    @Basic
    @Column(name = "scenic_point", nullable = true, length = 255)
    public String getScenicPoint() {
        return scenicPoint;
    }

    public void setScenicPoint(String scenicPoint) {
        this.scenicPoint = scenicPoint;
    }

    @Basic
    @Column(name = "scenic_picture", nullable = true, length = 255)
    public String getScenicPicture() {
        return scenicPicture;
    }

    public void setScenicPicture(String scenicPicture) {
        this.scenicPicture = scenicPicture;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    @Column(name = "google_lon", nullable = true, length = 30)
    public String getGoogleLon() {
        return googleLon;
    }

    public void setGoogleLon(String googleLon) {
        this.googleLon = googleLon;
    }

    @Basic
    @Column(name = "google_lat", nullable = true, length = 30)
    public String getGoogleLat() {
        return googleLat;
    }

    public void setGoogleLat(String googleLat) {
        this.googleLat = googleLat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != ticket.id) return false;
        if (provinceName != null ? !provinceName.equals(ticket.provinceName) : ticket.provinceName != null)
            return false;
        if (cityName != null ? !cityName.equals(ticket.cityName) : ticket.cityName != null) return false;
        if (districtName != null ? !districtName.equals(ticket.districtName) : ticket.districtName != null)
            return false;
        if (scenicName != null ? !scenicName.equals(ticket.scenicName) : ticket.scenicName != null) return false;
        if (scenicAddress != null ? !scenicAddress.equals(ticket.scenicAddress) : ticket.scenicAddress != null)
            return false;
        if (scenicTime != null ? !scenicTime.equals(ticket.scenicTime) : ticket.scenicTime != null) return false;
        if (superScript != null ? !superScript.equals(ticket.superScript) : ticket.superScript != null) return false;
        if (scenicSubject != null ? !scenicSubject.equals(ticket.scenicSubject) : ticket.scenicSubject != null)
            return false;
        if (scenicPoint != null ? !scenicPoint.equals(ticket.scenicPoint) : ticket.scenicPoint != null) return false;
        if (scenicPicture != null ? !scenicPicture.equals(ticket.scenicPicture) : ticket.scenicPicture != null)
            return false;
        if (updateTime != null ? !updateTime.equals(ticket.updateTime) : ticket.updateTime != null) return false;
        if (createTime != null ? !createTime.equals(ticket.createTime) : ticket.createTime != null) return false;
        if (cityId != null ? !cityId.equals(ticket.cityId) : ticket.cityId != null) return false;
        if (googleLon != null ? !googleLon.equals(ticket.googleLon) : ticket.googleLon != null) return false;
        if (googleLat != null ? !googleLat.equals(ticket.googleLat) : ticket.googleLat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (districtName != null ? districtName.hashCode() : 0);
        result = 31 * result + (scenicName != null ? scenicName.hashCode() : 0);
        result = 31 * result + (scenicAddress != null ? scenicAddress.hashCode() : 0);
        result = 31 * result + (scenicTime != null ? scenicTime.hashCode() : 0);
        result = 31 * result + (superScript != null ? superScript.hashCode() : 0);
        result = 31 * result + (scenicSubject != null ? scenicSubject.hashCode() : 0);
        result = 31 * result + (scenicPoint != null ? scenicPoint.hashCode() : 0);
        result = 31 * result + (scenicPicture != null ? scenicPicture.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (googleLon != null ? googleLon.hashCode() : 0);
        result = 31 * result + (googleLat != null ? googleLat.hashCode() : 0);
        return result;
    }
}
