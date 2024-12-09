import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<String> findLeapYearNames(List<Animal> animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (Animal animal : animals) {
            int year = animal.getBirthDate().getYear();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames;
    }

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int age) {
        List<Animal> olderAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            int currentYear = LocalDate.now().getYear();
            int animalAge = currentYear - animal.getBirthDate().getYear();
            if (animalAge > age) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals;
    }

    @Override
    public void findDuplicate(List<Animal> animals) {
        Set<Animal> uniqueAnimals = new HashSet<>();
        for (Animal animal : animals) {
            if (!uniqueAnimals.add(animal)) {
                System.out.println("Найден дубликат: " + animal.getName());
            }
        }
    }
}