package homework6.task_6_3_2;


public class CarBuildingDirector {
    private Builder builder;

    private static CarBuildingDirector instance;

    private CarBuildingDirector() {}

    public static CarBuildingDirector getInstance() {
        if (instance == null) {
            instance = new CarBuildingDirector();
        }
        return instance;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void clearBuilder() {
        builder.setBodyType(null);
        builder.setColor(null);
        builder.setEngine(null);
        builder.setRubber(null);
        builder.setTransmission(null);
        builder.setWheel(null);
    }

    public Car buildHatchback(String color) {
        FuelType EngineFueltype = FuelType.DIESEL;
        double EnginePower = 200;
        double EngineTorque = 200;
        double EngineVolume = 3.0;
        double RubberElasticity = 0.8;
        double RubberHardness = 90;
        TransmissionType transmissionType = TransmissionType.MANUAL;
        int transmissionGearsNumber = 5;
        WheelsMaterialType wheelsMaterialType = WheelsMaterialType.ALUMINIUM;
        double wheelDiameter = 20.0;

        EngineBuilder engineBuilder = new EngineBuilder();
        RubberBuilder rubberBuilder = new RubberBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        engineBuilder.setFuelType(EngineFueltype);
        engineBuilder.setPower(EnginePower);
        engineBuilder.setTorque(EngineTorque);
        engineBuilder.setVolume(EngineVolume);
        Engine engine = engineBuilder.build();

        rubberBuilder.setElasticity(RubberElasticity);
        rubberBuilder.setHardness(RubberHardness);
        Rubber rubber = rubberBuilder.build();

        transmissionBuilder.setTransmissionType(transmissionType);
        transmissionBuilder.setGearsNumber(transmissionGearsNumber);
        Transmission transmission = transmissionBuilder.build();

        wheelBuilder.setMaterialType(wheelsMaterialType);
        wheelBuilder.setDiameter(wheelDiameter);
        Wheel wheel = wheelBuilder.build();

        builder.setBodyType(BodyType.HATCHBACK);
        builder.setColor(color);
        builder.setEngine(engine);
        builder.setRubber(rubber);
        builder.setTransmission(transmission);
        builder.setWheel(wheel);

        Car car = builder.build();
        clearBuilder();

        return car;
    }

    public Car buildSedan(String color) {
        FuelType EngineFueltype = FuelType.ELECTRIC;
        double EnginePower = 140;
        double EngineTorque = 180;
        double EngineVolume = 2.4;
        double RubberElasticity = 0.6;
        double RubberHardness = 40;
        TransmissionType transmissionType = TransmissionType.AUTOMATIC;
        int transmissionGearsNumber = 6;
        WheelsMaterialType wheelsMaterialType = WheelsMaterialType.TITANIUM;
        double wheelDiameter = 17.0;

        EngineBuilder engineBuilder = new EngineBuilder();
        RubberBuilder rubberBuilder = new RubberBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        engineBuilder.setFuelType(EngineFueltype);
        engineBuilder.setPower(EnginePower);
        engineBuilder.setTorque(EngineTorque);
        engineBuilder.setVolume(EngineVolume);
        Engine engine = engineBuilder.build();

        rubberBuilder.setElasticity(RubberElasticity);
        rubberBuilder.setHardness(RubberHardness);
        Rubber rubber = rubberBuilder.build();

        transmissionBuilder.setTransmissionType(transmissionType);
        transmissionBuilder.setGearsNumber(transmissionGearsNumber);
        Transmission transmission = transmissionBuilder.build();

        wheelBuilder.setMaterialType(wheelsMaterialType);
        wheelBuilder.setDiameter(wheelDiameter);
        Wheel wheel = wheelBuilder.build();

        builder.setBodyType(BodyType.SEDAN);
        builder.setColor(color);
        builder.setEngine(engine);
        builder.setRubber(rubber);
        builder.setTransmission(transmission);
        builder.setWheel(wheel);

        Car car = builder.build();
        clearBuilder();

        return car;
    }

    public Car buildSUV(String color) {
        FuelType EngineFueltype = FuelType.PETROL;
        double EnginePower = 350;
        double EngineTorque = 300;
        double EngineVolume = 3.5;
        double RubberElasticity = 0.65;
        double RubberHardness = 75;
        TransmissionType transmissionType = TransmissionType.AUTOMATIC;
        int transmissionGearsNumber = 5;
        WheelsMaterialType wheelsMaterialType = WheelsMaterialType.MAGNESIUM;
        double wheelDiameter = 18.0;

        EngineBuilder engineBuilder = new EngineBuilder();
        RubberBuilder rubberBuilder = new RubberBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        engineBuilder.setFuelType(EngineFueltype);
        engineBuilder.setPower(EnginePower);
        engineBuilder.setTorque(EngineTorque);
        engineBuilder.setVolume(EngineVolume);
        Engine engine = engineBuilder.build();

        rubberBuilder.setElasticity(RubberElasticity);
        rubberBuilder.setHardness(RubberHardness);
        Rubber rubber = rubberBuilder.build();

        transmissionBuilder.setTransmissionType(transmissionType);
        transmissionBuilder.setGearsNumber(transmissionGearsNumber);
        Transmission transmission = transmissionBuilder.build();

        wheelBuilder.setMaterialType(wheelsMaterialType);
        wheelBuilder.setDiameter(wheelDiameter);
        Wheel wheel = wheelBuilder.build();

        builder.setBodyType(BodyType.SUV);
        builder.setColor(color);
        builder.setEngine(engine);
        builder.setRubber(rubber);
        builder.setTransmission(transmission);
        builder.setWheel(wheel);

        Car car = builder.build();
        clearBuilder();

        return car;
    }
}
