
public class Main {
    public static void main(String[] args) {

        boolean succes = Data.validate("test", "test", "test");
        if (succes) {
            System.out.println("Данные валидны");
        } else
            System.out.println("Данные невалидны");


    }
}
