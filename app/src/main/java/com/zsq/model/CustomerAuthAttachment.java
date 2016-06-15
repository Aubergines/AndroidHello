package com.zsq.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerAuthAttachment {
  private Long id;
  private Long customer_id;
  private Long att_type;
  private String att_code;
  private String att_path;
  private Date create_time;
  private Integer is_valid;
  private String att_format;
  private String dyna_height;
  private String dyna_width;
  private Integer send_site_id;

  public CustomerAuthAttachment() {
  }

  public CustomerAuthAttachment(Long id, Long customer_id, Long att_type, String att_code, String att_path, Date create_time, Integer is_valid, String att_format, String dyna_height, String dyna_width, Integer send_site_id) {
    this.id = id;
    this.customer_id = customer_id;
    this.att_type = att_type;
    this.att_code = att_code;
    this.att_path = att_path;
    this.create_time = create_time;
    this.is_valid = is_valid;
    this.att_format = att_format;
    this.dyna_height = dyna_height;
    this.dyna_width = dyna_width;
    this.send_site_id = send_site_id;
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

  public Long getAtt_type() {
    return att_type;
  }

  public void setAtt_type(Long att_type) {
    this.att_type = att_type;
  }

  public String getAtt_code() {
    return att_code;
  }

  public void setAtt_code(String att_code) {
    this.att_code = att_code;
  }

  public String getAtt_path() {
    return att_path;
  }

  public void setAtt_path(String att_path) {
    this.att_path = att_path;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Integer getIs_valid() {
    return is_valid;
  }

  public void setIs_valid(Integer is_valid) {
    this.is_valid = is_valid;
  }

  public String getAtt_format() {
    return att_format;
  }

  public void setAtt_format(String att_format) {
    this.att_format = att_format;
  }

  public String getDyna_height() {
    return dyna_height;
  }

  public void setDyna_height(String dyna_height) {
    this.dyna_height = dyna_height;
  }

  public String getDyna_width() {
    return dyna_width;
  }

  public void setDyna_width(String dyna_width) {
    this.dyna_width = dyna_width;
  }

  public Integer getSend_site_id() {
    return send_site_id;
  }

  public void setSend_site_id(Integer send_site_id) {
    this.send_site_id = send_site_id;
  }

  public static List<CustomerAuthAttachment> get(List<CustomerAuthAttachment> authList,Long customerId) {

    ArrayList some = new ArrayList();
    Iterator<CustomerAuthAttachment> var1 = authList.iterator();

    if (null == customerId){
      return null;
    }
    while(var1.hasNext()) {
      CustomerAuthAttachment e = var1.next();
      if(e.getCustomer_id().equals(customerId)) {
        some.add(e);
      }
    }
    return some;
  }

}
