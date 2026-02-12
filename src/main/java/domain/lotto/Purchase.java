package domain.lotto;

import java.util.List;

public class Purchase {

    private final List<List<Integer>> manualLottosNumbers;
    private final int autoLottoCount;

    public Purchase(int purchasePrice, List<List<Integer>> manualLottosNumbers) {
        validatePrice(purchasePrice);
        this.manualLottosNumbers = manualLottosNumbers;
        this.autoLottoCount = purchasePrice / Lotto.PRICE - manualLottosNumbers.size();
    }

    public List<List<Integer>> getManualLottosNumbers() {
        return manualLottosNumbers;
    }

    public int getAutoLottoCount() {
        return autoLottoCount;
    }

    private void validatePrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("로또 발행 금액은 양수여야 합니다.");
        }
        if (price % Lotto.PRICE != 0) {
            throw new IllegalArgumentException("로또 발행 금액은 1000원 단위여야 합니다.");
        }
    }
}
