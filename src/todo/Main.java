package todo;

public class Main {

    public static void main(String[] args) {

        Task cases1 = new Task("work", "30.01.2023", "Create a logo");
        Task cases2 = new Task("health", "02.12.2022", "Visit a doctor");
        cases1.printInformation();
        cases2.printInformation();



    }
}