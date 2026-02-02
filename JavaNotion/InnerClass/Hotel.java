package JavaNotion.InnerClass;
public class Hotel {
    private String hotelName;
    private int basePrice = 50000;

    public Hotel(String hotelName){
        this.hotelName = hotelName;
    }

    //Member Inner Class: Room -> phu thuoc vao Hotel
    public class Room{
        private String roomNumber;

        public Room(String roomNumber){
            this.roomNumber = roomNumber;
        }
        //Inner class co the truy cap truc tiep cac private field cua Hotel
        public void showInfo(){
            System.out.println("Hotel " + hotelName +" basePrice " + basePrice);
            System.out.println("Phong: " + roomNumber);
        }
    }
    //Member Static Nested Class: Tien ich ko can biet Hotel cu the la ai
    public static class HotelValidator{
        public static boolean isValid(String name){
            return  name!= null && name.length() >= 5;
        }
    }

    public static void main (String[] args){
        Hotel hotel = new Hotel("Muong Thanh");
        Hotel.Room room  = hotel.new Room("001");
        room.showInfo();

        Hotel.HotelValidator hotelValidator = new Hotel.HotelValidator();

        boolean isValid = Hotel.HotelValidator.isValid(hotel.hotelName);
    }
}
