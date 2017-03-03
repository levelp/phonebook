import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends Assert {

    /**
     * 1. Фамилия Имя Отчество
     * 2. Дата рождения
     * 3. Оценки: массив чисел в диапазоне 1..5
     */
    @Test
    public void testStudentCreate() throws Exception {
        Student p = new Student(
                "Иванов Иван Иванович",
                "10.02.1988",
                4, 3, 5
        );
        Student p2 = new Student(
                "Иванов Иван Иванович"
        );

        // JSON - название формата
        // Название библиотеки: gson = google json
        Gson gson = new Gson(); // Объект, который
        // реализует сериализацию в JSON
        // Переводим в строчку в формате JSON
        String json = gson.toJson(p);
        // {"fullName":"Иванов Иван Иванович","bDate":"10.02.1988","marks":[4,3,5]}
        System.out.println(json);
        // Передаём класс Student
        // чтобы функция fromJson знала какие поля
        // и каких они типов
        Student pCopy = gson.fromJson(json, Student.class);
        assertEquals(p.fullName, pCopy.fullName);
    }


}
