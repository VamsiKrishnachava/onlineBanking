package com.Banking.Entity;

public interface AddressInterface {
    int getAddressId();
    String getLine1();
    void setLine1(String line1);
    String getLine2();
    void setLine2(String line2);
    String getCity();
    void setCity(String city);
    String getDistrict();
    void setDistrict(String district);
    int getPincode();
    void setPincode(int pincode);
    String getState();
    void setState(String state);
}
