package homework5.task_3_2;

public class CarBuildingClient {
    public void building() {
        CarBuilder carBuilder = new CarBuilder();
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(carBuilder);

        Car carHatchback = carBuildingDirector.buildHatchback("Red");
        Car carSedan = carBuildingDirector.buildSedan("White");
        Car carSUV = carBuildingDirector.buildSUV("Black");

        System.out.println("***** INITIALS *****");
        System.out.println(carHatchback);
        System.out.println(carSedan);
        System.out.println(carSUV);

        Car carHatchbackClone = carHatchback.clone();
        Car carSedanClone = carSedan.clone();
        Car carSUVClone = carSUV.clone();

        System.out.println("***** CLONES *****");
        System.out.println(carHatchbackClone);
        System.out.println(carSedanClone);
        System.out.println(carSUVClone);
    }
}
