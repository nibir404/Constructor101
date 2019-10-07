
package construct;
public class Vehicles {
    private String Brand;
    private String color;
    private int id;
    
    public Vehicles(String Brand,String color,int id){
      this.Brand = Brand;
      this.color = color;
      this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }
    
    
    
    public void Display(){
        System.out.println("Brand : "+getBrand());
        System.out.println("Color : "+getColor());
        System.out.println("Id : "+getId());
    } 
    

}
