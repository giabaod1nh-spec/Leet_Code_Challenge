 class Mobile {
       String brand ;
       int price; 
       static String name;
       public void show(){
        System.out.println(brand + ":" + price + ":" + name);
       }
       static{
        name = "Phone"; 
       }
       public Mobile(){
        brand = ""; 
        price  = 200;
       }
       public static void show1(Mobile obj ){
        System.out.println(obj.brand + ":" + obj.price + ":" + Mobile.name + ":");

       }
       public static void main(String[] args) {
              Mobile m1 = new Mobile(); 
              m1.brand = "Iphone"; 
              m1.price = 1500 ; 
              Mobile.name = "IP16"; 
              Mobile m2 = new Mobile(); 
              m2.brand = "Samsung"; 
              m2.price = 1000; 
              Mobile.name = "Galaxy"; 
              m1.show();
              m2.show();
              Mobile.show1(m1);
       }
}

