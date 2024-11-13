public class Car{
    
   //end of class Car

        public String brand;
        public String model;
        public int minMileage;
        
        public Car()
        {
         brand="";
         model="";
         minMileage=0;
        }


        public Car(String brand, String model,int minMileage)
      {
        this.brand=brand;
        this.model=model;
        this.minMileage=minMileage;
      }
      public void displayInfo()
       {
        System.out.println("car brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("minMilage: "+minMileage+" km");
       }
       public static void main(String[] args) { 
        Car car1= new Car("Toyota","Toyota Supra",13);
        Car car2= new Car("Tesla", "Tesla Model Y",393); 
        Car car3= new Car("BMW","BMW i3",130);
        System.out.println("Car1 information:");
        car1.displayInfo();
        System.out.println("Car2 information");
        car2.displayInfo();
        System.out.println("Car3 information:");
        car3.displayInfo();
      }}
