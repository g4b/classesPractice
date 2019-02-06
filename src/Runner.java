public class Runner {

    public static void main(String[] args){
        Car gabesCar = new Car(2018, "Alfa Romeo", "Giulia");
        System.out.println(gabesCar.toString());
        gabesCar.drive(2000);
        System.out.println(gabesCar.toString());
        Rectangle dude = new Rectangle(30.71, 40.66);
        System.out.println(dude.getArea());
        System.out.println(dude.getDiagonal());
        System.out.println(dude.isSquare());
    }

}

