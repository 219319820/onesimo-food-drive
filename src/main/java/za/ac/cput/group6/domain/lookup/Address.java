package za.ac.cput.group6.domain.lookup;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    
    private String streetNumber;
    private String streetName;
    private int postalCode;

    private Address(){
        
    }

    public Address(Builder builder) {
        this.streetNumber= builder.streetNumber;
        this.streetName= builder.streetName;
        this.postalCode= builder.postalCode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
    public static class Builder{
        public String donorId;
        public Address address;
        private String streetNumber, streetName;
        private int postalCode;

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            
            return this;
        }
        public Address build(){return new Address(this);}
        
        public Builder copy(Address address){
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            
            return this;
            
        }
    }
    
}

