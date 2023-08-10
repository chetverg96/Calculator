package org.example;

public class Calculator {
    public Formula newFormula() { // возвращает новый объект для, который исп. для вычислений.
        return new Formula();
    }

    public static enum Operation { // операции доступные для вычислений
        SUM, SUB, MULT, DIV, POW;
    }

    public static class Formula {
        protected Double a, b, result;

        protected Formula() {
        } // Защищенный конструктор, чтобы объект Formula мог быть создан только внутри пакета.

        public Formula addOperand(double operand) {
            if (a == null) {
                a = operand;
            } else if (b == null) {
                b = operand;
            } else {
                throw new IllegalStateException("Formula is full of operands");
            }
            return this;
        }

        public Formula calculate(Operation op) { // вычесление
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            switch (op) {
                case SUM:
                    result = a + b;
                    break;
                case SUB:
                    result = a - b;
                    break;
                case MULT:
                    result = a * b;
                    break;
                case DIV:
                    result = a / b;
                    break;
                case POW:
                    result = Math.pow(a, b);
                    break;
            }
            return this;
        }

        public double result() { // Получение результата вычислений
            if (result == null)
                throw new IllegalStateException("Formula is not computed!");
            return result;
        }
    }
}
