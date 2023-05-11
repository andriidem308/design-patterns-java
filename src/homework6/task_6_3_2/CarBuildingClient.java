package homework6.task_6_3_2;

public class CarBuildingClient {
    public void building() {
        CarBuilder carBuilder = new CarBuilder();
        CarBuildingDirector carBuildingDirector = CarBuildingDirector.getInstance();
        carBuildingDirector.setBuilder(carBuilder);

        Car carHatchback = carBuildingDirector.buildHatchback("Red");
        System.out.println(carHatchback);

        CarBuildingDirector carBuildingDirector1 = CarBuildingDirector.getInstance();
        Car carSedan = carBuildingDirector1.buildSedan("White");
        Car carSUV = carBuildingDirector1.buildSUV("Black");

        System.out.println(carSedan);
        System.out.println(carSUV);

        System.out.println("carBuildingDirector instance == carBuildingDirector1 instance ");
        System.out.println(carBuildingDirector == carBuildingDirector1);
    }
}
