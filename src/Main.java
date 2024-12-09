import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();

        // Создаем животных
        List<Animal> animals = createService.createTenAnimals();

        // Ищем животных, родившихся в високосный год
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("Животные, родившиеся в високосный год:");
        for (String name : leapYearNames) {
            System.out.println(name);
        }

        // Ищем животных старше 5 лет
        List<Animal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("Животные старше 5 лет:");
        for (Animal animal : olderAnimals) {
            System.out.println(animal.getName());
        }

        // Ищем дубликаты животных
        searchService.findDuplicate(animals);
    }
}