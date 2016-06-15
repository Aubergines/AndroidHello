package com.zsq.model;

import java.util.Date;

/**
 * Created by Aubergine on 2016/6/12.
 */
public class Customer {

    private Long customerId;
    private Integer levelId;
    private String nickName;
    private String logoUrl;
    private Sex sex;
    private Marriage marriage;
    private Location location;
    private Profile profile;
    private String areasExpertise;
    private String summary;
    private Date registTime;
    private String registIp;
    private String registAddress;
    private String registSource;
    private String signature;
    private String perWebsite;
    private String baseinfoUrl;
    private String recommend;
    private String birthday;

    public Customer() {
    }

    public Customer(Long customerId, Integer levelId, String nickName, String logoUrl, Sex sex, Marriage marriage, Location location,Profile profile, String areasExpertise, String summary, Date registTime, String registIp, String registAddress, String registSource, String signature, String perWebsite, String baseinfoUrl, String recommend, String birthday) {
        this.customerId = customerId;
        this.levelId = levelId;
        this.nickName = nickName;
        this.logoUrl = logoUrl;
        this.sex = sex;
        this.marriage = marriage;
        this.location = location;
        this.profile = profile;
        this.areasExpertise = areasExpertise;
        this.summary = summary;
        this.registTime = registTime;
        this.registIp = registIp;
        this.registAddress = registAddress;
        this.registSource = registSource;
        this.signature = signature;
        this.perWebsite = perWebsite;
        this.baseinfoUrl = baseinfoUrl;
        this.recommend = recommend;
        this.birthday = birthday;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Marriage getMarriage() {
        return marriage;
    }

    public void setMarriage(Marriage marriage) {
        this.marriage = marriage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAreasExpertise() {
        return areasExpertise;
    }

    public void setAreasExpertise(String areasExpertise) {
        this.areasExpertise = areasExpertise;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getRegistIp() {
        return registIp;
    }

    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }

    public String getRegistAddress() {
        return registAddress;
    }

    public void setRegistAddress(String registAddress) {
        this.registAddress = registAddress;
    }

    public String getRegistSource() {
        return registSource;
    }

    public void setRegistSource(String registSource) {
        this.registSource = registSource;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPerWebsite() {
        return perWebsite;
    }

    public void setPerWebsite(String perWebsite) {
        this.perWebsite = perWebsite;
    }

    public String getBaseinfoUrl() {
        return baseinfoUrl;
    }

    public void setBaseinfoUrl(String baseinfoUrl) {
        this.baseinfoUrl = baseinfoUrl;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
