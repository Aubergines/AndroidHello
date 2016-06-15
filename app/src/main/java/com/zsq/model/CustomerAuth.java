package com.zsq.model;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerAuth {
  private Long id;
  private Long customer_id;
  private Date auth_date;
  private String first_name;
  private String last_name;
  private Integer certificates_id;
  private String certificates_code;
  private String certificates_path;
  private String qualification_code;
  private String qualification_path;
  private Long company_id;
  private String company;
  private String department;
  private String areas_expertise;
  private Integer medical_title_id;
  private String medical_title;
  private String social_title;
  private String degree_certificate_code;
  private String degree_certificate_path;
  private Long school_id;
  private String school_name;
  private Long major_id;
  private String major_name;
  private Integer degree_id;
  private String degree_name;
  private Integer state;
  private String clinical_time;
  private Long send_site_id;
  private String first_name_en;
  private String last_name_en;
  private String medical_title_en;
  private String company_en;
  private String full_name;

  public CustomerAuth() {
  }

  public CustomerAuth(Long id, Long customer_id, Date auth_date, String first_name, String last_name, Integer certificates_id, String certificates_code, String certificates_path, String qualification_code, String qualification_path, Long company_id, String company, String department, String areas_expertise, Integer medical_title_id, String medical_title, String social_title, String degree_certificate_code, String degree_certificate_path, Long school_id, String school_name, Long major_id, String major_name, Integer degree_id, String degree_name, Integer state, String clinical_time, Long send_site_id, String first_name_en, String last_name_en, String medical_title_en, String company_en, String full_name) {
    this.id = id;
    this.customer_id = customer_id;
    this.auth_date = auth_date;
    this.first_name = first_name;
    this.last_name = last_name;
    this.certificates_id = certificates_id;
    this.certificates_code = certificates_code;
    this.certificates_path = certificates_path;
    this.qualification_code = qualification_code;
    this.qualification_path = qualification_path;
    this.company_id = company_id;
    this.company = company;
    this.department = department;
    this.areas_expertise = areas_expertise;
    this.medical_title_id = medical_title_id;
    this.medical_title = medical_title;
    this.social_title = social_title;
    this.degree_certificate_code = degree_certificate_code;
    this.degree_certificate_path = degree_certificate_path;
    this.school_id = school_id;
    this.school_name = school_name;
    this.major_id = major_id;
    this.major_name = major_name;
    this.degree_id = degree_id;
    this.degree_name = degree_name;
    this.state = state;
    this.clinical_time = clinical_time;
    this.send_site_id = send_site_id;
    this.first_name_en = first_name_en;
    this.last_name_en = last_name_en;
    this.medical_title_en = medical_title_en;
    this.company_en = company_en;
    this.full_name = full_name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(Long customer_id) {
    this.customer_id = customer_id;
  }

  public Date getAuth_date() {
    return auth_date;
  }

  public void setAuth_date(Date auth_date) {
    this.auth_date = auth_date;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public Integer getCertificates_id() {
    return certificates_id;
  }

  public void setCertificates_id(Integer certificates_id) {
    this.certificates_id = certificates_id;
  }

  public String getCertificates_code() {
    return certificates_code;
  }

  public void setCertificates_code(String certificates_code) {
    this.certificates_code = certificates_code;
  }

  public String getCertificates_path() {
    return certificates_path;
  }

  public void setCertificates_path(String certificates_path) {
    this.certificates_path = certificates_path;
  }

  public String getQualification_code() {
    return qualification_code;
  }

  public void setQualification_code(String qualification_code) {
    this.qualification_code = qualification_code;
  }

  public String getQualification_path() {
    return qualification_path;
  }

  public void setQualification_path(String qualification_path) {
    this.qualification_path = qualification_path;
  }

  public Long getCompany_id() {
    return company_id;
  }

  public void setCompany_id(Long company_id) {
    this.company_id = company_id;
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

  public String getAreas_expertise() {
    return areas_expertise;
  }

  public void setAreas_expertise(String areas_expertise) {
    this.areas_expertise = areas_expertise;
  }

  public Integer getMedical_title_id() {
    return medical_title_id;
  }

  public void setMedical_title_id(Integer medical_title_id) {
    this.medical_title_id = medical_title_id;
  }

  public String getMedical_title() {
    return medical_title;
  }

  public void setMedical_title(String medical_title) {
    this.medical_title = medical_title;
  }

  public String getSocial_title() {
    return social_title;
  }

  public void setSocial_title(String social_title) {
    this.social_title = social_title;
  }

  public String getDegree_certificate_code() {
    return degree_certificate_code;
  }

  public void setDegree_certificate_code(String degree_certificate_code) {
    this.degree_certificate_code = degree_certificate_code;
  }

  public String getDegree_certificate_path() {
    return degree_certificate_path;
  }

  public void setDegree_certificate_path(String degree_certificate_path) {
    this.degree_certificate_path = degree_certificate_path;
  }

  public Long getSchool_id() {
    return school_id;
  }

  public void setSchool_id(Long school_id) {
    this.school_id = school_id;
  }

  public String getSchool_name() {
    return school_name;
  }

  public void setSchool_name(String school_name) {
    this.school_name = school_name;
  }

  public Long getMajor_id() {
    return major_id;
  }

  public void setMajor_id(Long major_id) {
    this.major_id = major_id;
  }

  public String getMajor_name() {
    return major_name;
  }

  public void setMajor_name(String major_name) {
    this.major_name = major_name;
  }

  public Integer getDegree_id() {
    return degree_id;
  }

  public void setDegree_id(Integer degree_id) {
    this.degree_id = degree_id;
  }

  public String getDegree_name() {
    return degree_name;
  }

  public void setDegree_name(String degree_name) {
    this.degree_name = degree_name;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getClinical_time() {
    return clinical_time;
  }

  public void setClinical_time(String clinical_time) {
    this.clinical_time = clinical_time;
  }

  public Long getSend_site_id() {
    return send_site_id;
  }

  public void setSend_site_id(Long send_site_id) {
    this.send_site_id = send_site_id;
  }

  public String getFirst_name_en() {
    return first_name_en;
  }

  public void setFirst_name_en(String first_name_en) {
    this.first_name_en = first_name_en;
  }

  public String getLast_name_en() {
    return last_name_en;
  }

  public void setLast_name_en(String last_name_en) {
    this.last_name_en = last_name_en;
  }

  public String getMedical_title_en() {
    return medical_title_en;
  }

  public void setMedical_title_en(String medical_title_en) {
    this.medical_title_en = medical_title_en;
  }

  public String getCompany_en() {
    return company_en;
  }

  public void setCompany_en(String company_en) {
    this.company_en = company_en;
  }

  public String getFull_name() {
    return full_name;
  }

  public void setFull_name(String full_name) {
    this.full_name = full_name;
  }
  public static CustomerAuth get(List<CustomerAuth> authList,Long customerId) {

    Iterator<CustomerAuth> var1 = authList.iterator();
    CustomerAuth ct;
    if (null == customerId){
      return null;
    }
    do {
      if (!var1.hasNext()) {
        return null;
      }
      ct = (CustomerAuth) var1.next();
    } while (!ct.getCustomer_id().equals(customerId));
    return ct;
  }
}
