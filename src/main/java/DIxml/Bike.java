package DIxml;


public  class Bike implements Vehicle{
    private String brand,owner;

    public Bike(String brand,String owner) {
        this.brand =brand;
        this.owner = owner;

    }

    public void drive(){
        System.out.println("brand = "+brand);
        System.out.println("owner = "+owner);
        System.out.println("bike is running");
    }
}
