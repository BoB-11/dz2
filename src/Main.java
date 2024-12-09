public class Main {
    public static void main(String[] args) {
        CreateAnimalService service = new CreateAnimalServiceImpl();

        // Вызов метода с созданием 10 животных
        System.out.println("=== Создание 10 животных (метод по умолчанию) ===");
        service.createTenAnimals();

        // Вызов метода с параметром N = 5
        System.out.println("\n=== Создание N животных (for-loop, N = 5) ===");
        service.createAnimals(5);

        // Вызов метода с do-while
        System.out.println("\n=== Создание N животных (do-while, N = 7) ===");
        service.createAnimalsUsingDoWhile(7);
    }
}