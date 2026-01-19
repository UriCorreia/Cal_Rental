package app.model;

import java.math.BigDecimal;

public class Vehicle{

    //atributes
    private int id;
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private String transmission;
    private BigDecimal mileage; 

    public Vehicle(){};

    public Vehicle(int id, String make, String model, int year, String fuelType, String transmission, BigDecimal mileage){
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.mileage = mileage;
    }

    //Getters e Setters
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { 
        return model; 
    }
    public void setModel(String model) {
        this.model = model; 
        }

    public int getYear() { 
        return year; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }

    public String getFuelType() {
        return fuelType; 
        }
    public void setFuelType(String fuelType) { 
        this.fuelType = fuelType; 
    }

    public String getTransmission() { 
        return transmission; 
    }
    public void setTransmission(String transmission) { 
        this.transmission = transmission; 
    }

    public BigDecimal getMileage() { 
        return mileage; 
    }
    public void setMileage(BigDecimal mileage) { 
        this.mileage = mileage; 
    }
}