/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class Car {
    private String car_name, fuel, transmission, img, description, color, current_address;
    private int id_car, seats, luggage, rate, status, price, year_of_manufacture, car_type_id, car_brand_id, rent_id, district_id;
//    private CarType cartype;
//    private CarBrand carbrand;
//    private Rentinfor rentinfor;
//    private District district;

    public Car() {
    }
    
    public Car(int id_car, String car_name, int seats, String fuel, String transmission, int luggage, String img, String description, int rate, int status, String color, int price, int year_of_manufacture, String current_address, int car_type_id, int car_brand_id, int rent_id, int district_id) {
        this.id_car = id_car;
        this.car_name = car_name;
        this.seats = seats;
        this.fuel = fuel;
        this.transmission = transmission;
        this.luggage = luggage;
        this.img = img;
        this.description = description;
        this.rate = rate;
        this.status = status;
        this.color = color;
        this.price = price;
        this.year_of_manufacture = year_of_manufacture;
        this.current_address = current_address;
//        this.cartype = cartype;
//        this.carbrand = carbrand;
//        this.rentinfor = rentinfor;
//        this.district = district;
        this.car_type_id = car_type_id; 
        this.car_brand_id = car_brand_id;
        this.rent_id = rent_id; 
        this.district_id = district_id;
    }

    

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

//    public CarType getCartype() {
//        return cartype;
//    }
//
//    public void setCartype(CarType cartype) {
//        this.cartype = cartype;
//    }
//
//    public CarBrand getCarbrand() {
//        return carbrand;
//    }
//
//    public void setCarbrand(CarBrand carbrand) {
//        this.carbrand = carbrand;
//    }
//
//    public Rentinfor getRentinfor() {
//        return rentinfor;
//    }
//
//    public void setRentinfor(Rentinfor rentinfor) {
//        this.rentinfor = rentinfor;
//    }
//
//    public District getDistrict() {
//        return district;
//    }
//
//    public void setDistrict(District district) {
//        this.district = district;
//    }

    public int getCar_type_id() {
        return car_type_id;
    }

    public void setCar_type_id(int car_type_id) {
        this.car_type_id = car_type_id;
    }

    public int getCar_brand_id() {
        return car_brand_id;
    }

    public void setCar_brand_id(int car_brand_id) {
        this.car_brand_id = car_brand_id;
    }

    public int getRent_id() {
        return rent_id;
    }

    public void setRent_id(int rent_id) {
        this.rent_id = rent_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }
    
    
}
 