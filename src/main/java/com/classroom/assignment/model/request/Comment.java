package com.classroom.assignment.model.request;

public class Comment {

  private String name;
  private String content;
  private String address;

  public Comment(String name, String content, String address) {
    this.setName(name);
    this.setContent(content);
    this.setAddress(address);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
