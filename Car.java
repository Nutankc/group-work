public class Car {

  // end of class Car

  public String brand;
  public String model;
  public int minMileage;

  public Car() {
    brand = "";
    model = "";
    minMileage = 0;
  }

  public Car(String brand, String model, int minMileage) {
    this.brand = brand;
    this.model = model;
    this.minMileage = minMileage;
  }

  public void displayInfo() {
    System.out.println("car brand: " + brand);
    System.out.println("model: " + model);
    System.out.println("minMilage: " + minMileage + " km");
  }

  // New method to calculate car age based on manufacture year
  public int calculateCarAge(int manufactureYear) {
    int currentYear = 2024;
    return currentYear - manufactureYear;
  }

  public static void main(String[] args) {
    Car car1 = new Car("Toyota", "Toyota Supra", 13);
    Car car2 = new Car("Tesla", "Tesla Model Y", 393);
    Car car3 = new Car("BMW", "BMW i3", 130);
    Car car4 = new Car("Audi", "A6 Sedan", 200);

    System.out.println("Car1 information:");
    car1.displayInfo();
    int car1Age = car1.calculateCarAge(1998);
    System.out.println("Car age: " + car1Age + " years\n");

    System.out.println("Car2 information");
    car2.displayInfo();
    int car2Age = car2.calculateCarAge(2021);
    System.out.println("Car age: " + car2Age + " years\n");

    System.out.println("Car3 information:");
    car3.displayInfo();
    int car3Age = car3.calculateCarAge(2015);
    System.out.println("Car age: " + car3Age + " years\n");

    System.out.println("Car4 information:");
    car4.displayInfo();
    int car4Age = car4.calculateCarAge(2017);
    System.out.println("Car age:" + car4Age + " years\n");
  }
}
