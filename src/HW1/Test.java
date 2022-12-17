package HW1;

import static org.assertj.core.api.Assertions.*;

public class Test {
    public static void main (String[] args) {
//        if (500.0 != Calculator.calculatingDiscount(1000,50)) {
//            throw new AssertionError("Ошибка в методе");
//        }

        //assert 500.0 == Calculator.calculatingDiscount(1000,50);

        assertThat(Calculator.calculatingDiscount(1000,50)).isEqualTo(500);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1000,50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки должна быть больше 0");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000,0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапозоне от 0 до 100 процентов");








    }
}
