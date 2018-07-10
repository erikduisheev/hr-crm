package com.erkprog.zensofthrcrm.data.entity;

import com.google.gson.annotations.SerializedName;

public class Position {
  @SerializedName("id")
  private Integer id;
  @SerializedName("name")
  private String name;
  @SerializedName("department")
  private Department department;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department departmentModel) {
    this.department = departmentModel;
  }
}
