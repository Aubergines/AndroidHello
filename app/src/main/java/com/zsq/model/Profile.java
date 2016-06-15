package com.zsq.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Aubergine on 2016/6/13.
 */
public class Profile {
    private Date authDate;
    private Integer certificatesId;
    private String certificatesCode;
    private String certificatesPath;
    private String qualificationCode;
    private String qualificationPath;
    private Long companyId;
    private String company;
    private String department;
    private Integer medicalTitleId;
    private String medicalTitle;
    private String social_title;
    private String degreeCertificateCode;
    private String degreeCertificatePath;
    private Long schoolId;
    private String schoolName;
    private Long majorId;
    private String majorName;
    private Integer degreeId;
    private String degreeName;
    private Integer state;
    private String clinicalTime;
    private List<ProfileAttach> profileAttaches;

    public Profile() {
    }

    public Profile(Date authDate, Integer certificatesId, String certificatesCode, String certificatesPath, String qualificationCode, String qualificationPath, Long companyId, String company, String department, Integer medicalTitleId, String medicalTitle, String social_title, String degreeCertificateCode, String degreeCertificatePath, Long schoolId, String schoolName, Long majorId, String majorName, Integer degreeId, String degreeName, Integer state, String clinicalTime, List<ProfileAttach> profileAttaches) {
        this.authDate = authDate;
        this.certificatesId = certificatesId;
        this.certificatesCode = certificatesCode;
        this.certificatesPath = certificatesPath;
        this.qualificationCode = qualificationCode;
        this.qualificationPath = qualificationPath;
        this.companyId = companyId;
        this.company = company;
        this.department = department;
        this.medicalTitleId = medicalTitleId;
        this.medicalTitle = medicalTitle;
        this.social_title = social_title;
        this.degreeCertificateCode = degreeCertificateCode;
        this.degreeCertificatePath = degreeCertificatePath;
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.majorId = majorId;
        this.majorName = majorName;
        this.degreeId = degreeId;
        this.degreeName = degreeName;
        this.state = state;
        this.clinicalTime = clinicalTime;
        this.profileAttaches = profileAttaches;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public Integer getCertificatesId() {
        return certificatesId;
    }

    public void setCertificatesId(Integer certificatesId) {
        this.certificatesId = certificatesId;
    }

    public String getCertificatesCode() {
        return certificatesCode;
    }

    public void setCertificatesCode(String certificatesCode) {
        this.certificatesCode = certificatesCode;
    }

    public String getCertificatesPath() {
        return certificatesPath;
    }

    public void setCertificatesPath(String certificatesPath) {
        this.certificatesPath = certificatesPath;
    }

    public String getQualificationCode() {
        return qualificationCode;
    }

    public void setQualificationCode(String qualificationCode) {
        this.qualificationCode = qualificationCode;
    }

    public String getQualificationPath() {
        return qualificationPath;
    }

    public void setQualificationPath(String qualificationPath) {
        this.qualificationPath = qualificationPath;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getMedicalTitleId() {
        return medicalTitleId;
    }

    public void setMedicalTitleId(Integer medicalTitleId) {
        this.medicalTitleId = medicalTitleId;
    }

    public String getMedicalTitle() {
        return medicalTitle;
    }

    public void setMedicalTitle(String medicalTitle) {
        this.medicalTitle = medicalTitle;
    }

    public String getSocial_title() {
        return social_title;
    }

    public void setSocial_title(String social_title) {
        this.social_title = social_title;
    }

    public String getDegreeCertificateCode() {
        return degreeCertificateCode;
    }

    public void setDegreeCertificateCode(String degreeCertificateCode) {
        this.degreeCertificateCode = degreeCertificateCode;
    }

    public String getDegreeCertificatePath() {
        return degreeCertificatePath;
    }

    public void setDegreeCertificatePath(String degreeCertificatePath) {
        this.degreeCertificatePath = degreeCertificatePath;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getClinicalTime() {
        return clinicalTime;
    }

    public void setClinicalTime(String clinicalTime) {
        this.clinicalTime = clinicalTime;
    }

    public List<ProfileAttach> getProfileAttaches() {
        return profileAttaches;
    }

    public void setProfileAttaches(List<ProfileAttach> profileAttaches) {
        this.profileAttaches = profileAttaches;
    }
}
