
package construct;
public class Truck extends Vehicles{
     private int chesis;
   private String name;
    
   public Truck(String Brand,String color,int id,int chesis,String name ){
        super(Brand,color,id);
        this.name = name;
        this.chesis = chesis;     
    }
   
   @Override
   public void Display(){
       System.out.println("Brand : "+getBrand());
       System.out.println("Color : "+getColor());
       System.out.println("Id : "+getId());
       System.out.println("Name : "+name);
       System.out.println("Chesis No  : "+chesis);
   }
}
