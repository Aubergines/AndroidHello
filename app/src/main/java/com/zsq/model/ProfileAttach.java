package com.zsq.model;

import java.util.Date;

/**
 * Created by Aubergine on 2016/6/13.
 */
public class ProfileAttach {

    private Long id;
    private Long attType;
    private String attCode;
    private String attPath;
    private Date createTime;
    private Integer isValid;
    private String attFormat;
    private String dynaHeight;
    private String dynaWidth;

    public ProfileAttach() {
    }

    public ProfileAttach(Long id, Long attType, String attCode, String attPath, Date createTime, Integer isValid, String attFormat, String dynaHeight, String dynaWidth) {
        this.id = id;
        this.attType = attType;
        this.attCode = attCode;
        this.attPath = attPath;
        this.createTime = createTime;
        this.isValid = isValid;
        this.attFormat = attFormat;
        this.dynaHeight = dynaHeight;
        this.dynaWidth = dynaWidth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttType() {
        return attType;
    }

    public void setAttType(Long attType) {
        this.attType = attType;
    }

    public String getAttCode() {
        return attCode;
    }

    public void setAttCode(String attCode) {
        this.attCode = attCode;
    }

    public String getAttPath() {
        return attPath;
    }

    public void setAttPath(String attPath) {
        this.attPath = attPath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getAttFormat() {
        return attFormat;
    }

    public void setAttFormat(String attFormat) {
        this.attFormat = attFormat;
    }

    public String getDynaHeight() {
        return dynaHeight;
    }

    public void setDynaHeight(String dynaHeight) {
        this.dynaHeight = dynaHeight;
    }

    public String getDynaWidth() {
        return dynaWidth;
    }

    public void setDynaWidth(String dynaWidth) {
        this.dynaWidth = dynaWidth;
    }
}
