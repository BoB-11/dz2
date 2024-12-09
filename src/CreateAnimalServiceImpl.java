import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private static final Random random = new Random();

    @Override
    public List<Animal> createTenAnimals() {
        List<Animal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(generateAnimal());
            System.out.println("Создано животное №" + (count + 1));
            count++;
        }
        return animals;
    }

    @Override
    public void createAnimals(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Создано животное №" + (i + 1));
            generateAnimal();
        }
    }

    @Override
    public void createAnimalsUsingDoWhile(int N) {
        int count = 0;
        do {
            System.out.println("Создано животное №" + (count + 1));
            generateAnimal();
            count++;
        } while (count < N);
    }

    private Animal generateAnimal() {
        String breed = random.nextBoolean() ? "PetBreed" + random.nextInt(5) : "PredatorBreed" + random.nextInt(5);
        String name = "Name" + random.nextInt(100);
        Double cost = random.nextDouble() * 100;
        String character = random.nextBoolean() ? "Friendly" : "Aggressive";

        // Генерация случайной даты рождения между 01-01-2000 и 31-12-2015
        int year = random.nextInt(16) + 2000;
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;
        String birthDateStr = String.format("%02d-%02d-%04d", day, month, year);

        if (random.nextBoolean()) {
            return new Pet(breed, name, cost, character, birthDateStr);
        } else {
            return new Predator(breed, name, cost, character, birthDateStr);
        }
    }
}