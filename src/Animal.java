import java.time.LocalDate;

public interface Animal {
    String getBreed();
    String getName();
    Double getCost();
    String getCharacter();
    LocalDate getBirthDate();  // Метод для получения даты рождения

    boolean equals(Object obj);  // Переопределение метода equals
}