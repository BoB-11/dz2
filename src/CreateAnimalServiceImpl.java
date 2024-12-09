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
        if (random.nextBoolean()) {
            return new Pet("PetBreed" + random.nextInt(5), "PetName" + random.nextInt(5),
                    random.nextDouble() * 100, "Friendly");
        } else {
            return new Predator("PredatorBreed" + random.nextInt(5), "PredatorName" + random.nextInt(5),
                    random.nextDouble() * 200, "Aggressive");
        }
    }
}