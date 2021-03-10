package com.dmc.oa.entity;

public class User {

    private Long userId;
    private String username;
    private  String password;
    private  Long employeeId;
    private Integer salt;
    
    public Long getUsrId() {
        return userId;
    }

    public void setUsrId(Long usrId) {
        this.userId = usrId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSalt() {
        return salt;
    }

    public void setSalt(Integer salt) {
        this.salt = salt;
    }
}
