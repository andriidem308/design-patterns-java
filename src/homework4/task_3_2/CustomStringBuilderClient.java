package homework4.task_3_2;


public class CustomStringBuilderClient {
    public void building() {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();
        customStringBuilder.append("Task 2");
        customStringBuilder.insert(" finished yo!", 6);
        customStringBuilder.replace("completed", 7, 8);
        customStringBuilder.deleteSubstring(16, 3);

        CustomString customString = customStringBuilder.build();
        System.out.println(customString);
    }
}
