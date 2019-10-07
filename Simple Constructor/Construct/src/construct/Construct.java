
package construct;

public class Construct {

    public static void main(String[] args) {
        Car car =  new Car("Ford","Red",180073,21021,"Mustang");
        Truck truck = new Truck("Mahindra","Mix",180072,22021,"Tata");
        Rickshaw rick = new Rickshaw("Bmw","Blue & orange",180071,23021,"m33rock");
        
        car.Display();
        System.out.println("");
        truck.Display();
        System.out.println("");
        rick.Display();
    }
    
}
