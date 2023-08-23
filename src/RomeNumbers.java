public enum RomeNumbers {
    C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
    final int value;
    RomeNumbers(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
