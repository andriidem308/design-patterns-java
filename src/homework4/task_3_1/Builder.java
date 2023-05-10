package homework4.task_3_1;


public interface Builder {
    void setBodyType(BodyType bodyType);
    void setColor(String color);
    void setEngine(Engine engine);
    void setRubber(Rubber rubber);
    void setTransmission(Transmission transmission);
    void setWheel(Wheel wheel);
    Car build();
}
