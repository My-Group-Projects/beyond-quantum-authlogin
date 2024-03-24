package com.beyondquantum.sfa.dto;

public class UserCredentialsDto {
    private String usernameOrEmailOrPhone;
    private String password;

    public String getUsernameOrEmailOrPhone() {
        return usernameOrEmailOrPhone;
    }

    public void setUsernameOrEmailOrPhone(String usernameOrEmailOrPhone) {
        this.usernameOrEmailOrPhone = usernameOrEmailOrPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserCredentialsDto(String usernameOrEmailOrPhone, String password) {
        super();
        this.usernameOrEmailOrPhone = usernameOrEmailOrPhone;
        this.password = password;
    }

    public UserCredentialsDto() {
        super();
    }
}
