public class Car{
    
   //end of class Car

        public String brand;
        public String model;
        public Float weight;
        
        public Car()
        {
         brand="";
         model="";
         weight=0.0f;
        }


        public Car(String brand, String model,Float weight)
      {
        this.brand=brand;
        this.model=model;
        this.weight=weight;
      }
      public void displayInfo()
       {
        System.out.println("car brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("weight:"+weight);
       }
       public static void main(String[] args) { 
        Car car1= new Car("Toyota","Toyota Supra",2460f);
        Car car2= new Car("Tesla", "Tesla Model Y",4209f); 
        System.out.println("Car1 information:");
        car1.displayInfo();
        System.out.println("Car2 information");
        car2.displayInfo();
      }}