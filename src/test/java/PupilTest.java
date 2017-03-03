import org.junit.Assert;
import org.junit.Test;

public class PupilTest extends Assert {

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

    }
}
