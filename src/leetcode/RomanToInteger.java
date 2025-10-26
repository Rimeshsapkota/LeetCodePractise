package leetcode;

public enum RomanToInteger {
    III(1);

    public Integer number;

    RomanToInteger(int number) {
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }
}
