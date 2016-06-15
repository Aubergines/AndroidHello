package com.zsq.model;

import java.util.Date;

public class CustomerAuthProcess {
  private Long id;
  private Long auth_id;
  private Long customer_id;
  private Integer auth_type;
  private Date auth_date;
  private String auth_source;
  private String auth_address;
  private String auth_way;
  private Integer state;
  private Date op_date;
  private String op_ip;
  private String op_address;
  private String op_source;
  private String reason;
  private String supplement;
  private Integer is_send_email;
  private Integer send_site_id;

  public CustomerAuthProcess() {
  }

  public CustomerAuthProcess(Long id, Long auth_id, Long customer_id, Integer auth_type, Date auth_date, String auth_source, String auth_address, String auth_way, Integer state, Date op_date, String op_ip, String op_address, String op_source, String reason, String supplement, Integer is_send_email, Integer send_site_id) {
    this.id = id;
    this.auth_id = auth_id;
    this.customer_id = customer_id;
    this.auth_type = auth_type;
    this.auth_date = auth_date;
    this.auth_source = auth_source;
    this.auth_address = auth_address;
    this.auth_way = auth_way;
    this.state = state;
    this.op_date = op_date;
    this.op_ip = op_ip;
    this.op_address = op_address;
    this.op_source = op_source;
    this.reason = reason;
    this.supplement = supplement;
    this.is_send_email = is_send_email;
    this.send_site_id = send_site_id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAuth_id() {
    return auth_id;
  }

  public void setAuth_id(Long auth_id) {
    this.auth_id = auth_id;
  }

  public Long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(Long customer_id) {
    this.customer_id = customer_id;
  }

  public Integer getAuth_type() {
    return auth_type;
  }

  public void setAuth_type(Integer auth_type) {
    this.auth_type = auth_type;
  }

  public Date getAuth_date() {
    return auth_date;
  }

  public void setAuth_date(Date auth_date) {
    this.auth_date = auth_date;
  }

  public String getAuth_source() {
    return auth_source;
  }

  public void setAuth_source(String auth_source) {
    this.auth_source = auth_source;
  }

  public String getAuth_address() {
    return auth_address;
  }

  public void setAuth_address(String auth_address) {
    this.auth_address = auth_address;
  }

  public String getAuth_way() {
    return auth_way;
  }

  public void setAuth_way(String auth_way) {
    this.auth_way = auth_way;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Date getOp_date() {
    return op_date;
  }

  public void setOp_date(Date op_date) {
    this.op_date = op_date;
  }

  public String getOp_ip() {
    return op_ip;
  }

  public void setOp_ip(String op_ip) {
    this.op_ip = op_ip;
  }

  public String getOp_address() {
    return op_address;
  }

  public void setOp_address(String op_address) {
    this.op_address = op_address;
  }

  public String getOp_source() {
    return op_source;
  }

  public void setOp_source(String op_source) {
    this.op_source = op_source;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getSupplement() {
    return supplement;
  }

  public void setSupplement(String supplement) {
    this.supplement = supplement;
  }

  public Integer getIs_send_email() {
    return is_send_email;
  }

  public void setIs_send_email(Integer is_send_email) {
    this.is_send_email = is_send_email;
  }

  public Integer getSend_site_id() {
    return send_site_id;
  }

  public void setSend_site_id(Integer send_site_id) {
    this.send_site_id = send_site_id;
  }
}
