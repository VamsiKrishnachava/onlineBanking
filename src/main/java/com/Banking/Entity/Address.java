package com.Banking.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "address")
public class Address implements AddressInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    
    @Column(nullable =  false)
    private String line1;
    @Column(nullable = true)
    private String line2;
    @Column(nullable = false)
    private String district;
    @Column(nullable =  false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private int pincode;
    

    private Address(AddressBuilder addressBuilder){
        this.line1 = addressBuilder.line1;
        this.line2 = addressBuilder.line2;
        this.district = addressBuilder.district;
        this.city = addressBuilder.city;
        this.pincode = addressBuilder.pincode;
        this.state = addressBuilder.state;
    }

    @Override
    public String getLine1() { return this.line1;}

    @Override
    public void setLine1(String line1) { this.line1 = line1;}

    @Override
    public String getLine2() {return  this.line2;}

    @Override
    public void setLine2(String line2) { this.line2 = line2;}

    @Override
    public String getCity() {return this.city;}

    @Override
    public void setCity(String city) { this.city = city;}

    @Override
    public String getDistrict() {return this.district;}

    @Override
    public void setDistrict(String district) { this.district = district;}

    @Override
    public int getPincode() {return this.pincode;}

    @Override
    public void setPincode(int pincode) { this.pincode = pincode;}

    @Override
    public String getState() {return this.state;}

    @Override
    public void setState(String state) { this.state = state;}

    @Override
    public int getAddressId() {return this.addressId;}

    public static class AddressBuilder{
        private String line1;
        private String line2;
        private String district;
        private String state;
        private String city;
        private int pincode;
        
        public AddressBuilder setLine1(String line1) { 
            this.line1 = line1;
            return this;
        }

        public AddressBuilder setLine2(String line2) { 
            this.line2 = line2;
            return this;
        }

        public AddressBuilder setDistrict(String district) { 
            this.district = district;
            return this;
        }

        public AddressBuilder setCity(String city) { 
            this.city = city;
            return this;
        }

        public AddressBuilder setPincode(int pincode) { 
            this.pincode = pincode;
            return this;
        }

        public AddressBuilder setState(String state){
            this.state = state;
            return this;
        }
    }

   
    
}
