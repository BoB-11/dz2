import java.util.List;

public interface SearchService {
    List<String> findLeapYearNames(List<Animal> animals);  // Найти животных, родившихся в високосный год

    List<Animal> findOlderAnimal(List<Animal> animals, int age);  // Найти животных старше N лет

    void findDuplicate(List<Animal> animals);  // Найти дубликаты животных
}