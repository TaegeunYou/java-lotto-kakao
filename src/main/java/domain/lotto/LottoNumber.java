package domain.lotto;

import java.util.Objects;

public class LottoNumber {

    private final int number;

    public LottoNumber(int number) {
        if (number < Lotto.MIN_NUMBER || number > Lotto.MAX_NUMBER) {
            throw new IllegalArgumentException("로또 번호는 1부터 45 사이여야 합니다.");
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber lottoNumber1 = (LottoNumber) o;
        return number == lottoNumber1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}
