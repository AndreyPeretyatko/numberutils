
    public class Main {
        public static void main(String[] args) {

        }

        public static int sum(int... ints) { //сумма всех элементов
            if (ints.length < 2) {
                return 0;
            }

            int sum = 0;
            for (int num : ints) {
                sum += num;
            }
            return sum;
        }

        public static int sub(int... ints) { //разность всех элементов
            if (ints.length < 2) {
                return 0;
            }

            int sub = ints[0];
            for (int i = 1; i <= ints.length - 1; i++) {
                sub -= ints[i];
            }
            return sub;
        }

        public static int subFromMax(int... ints) { //вычитание из максимального числа
            if (ints.length < 2) {
                return 0;
            }

            int tmp = 0;
            for (int num : ints) {
                if (num > tmp) tmp = num;
            }

            int result = tmp;
            for (int num : ints) {
                if (num != tmp) result -= num;
            }
            return result;
        }

        public static int mult(int... ints) { //умножение всех элементов
            if (ints.length < 2) {
                return 0;
            }

            int mult = 1;
            for (int num : ints) {
                mult *= num;
            }
            return mult;
        }

        public static double div(int... ints) { //деление всех элементов
            if (ints.length < 2) {
                return 0;
            }

            double div = ints[0];
            for (int i = 1; i <= ints.length - 1; i++) {
                if (div <= ints[i] || ints[i] == 0) {
                    return div;
                } else div /= ints[i];
            }
            return div;
        }

        public static int factorial(int num) { //факториал числа
            if (num == 0) return 1;
            else if (num < 0) return 0;

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
}
