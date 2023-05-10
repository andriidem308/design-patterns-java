package homework4.task_3_1;

public class CarBuildingClient {
    public void building() {
        CarBuilder carBuilder = new CarBuilder();
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(carBuilder);

        Car carHatchback = carBuildingDirector.buildHatchback("Red");
        Car carSedan = carBuildingDirector.buildSedan("White");
        Car carSUV = carBuildingDirector.buildSUV("Black");

        System.out.println(carHatchback);
        System.out.println(carSedan);
        System.out.println(carSUV);
    }
}
