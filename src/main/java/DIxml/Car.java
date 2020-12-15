package DIxml;


public  class Car implements Vehicle{
    public void drive(){
        System.out.println("car is running");
    }
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
