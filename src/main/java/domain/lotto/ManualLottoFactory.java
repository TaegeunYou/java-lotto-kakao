package domain.lotto;

import java.util.List;

public class ManualLottoFactory implements LottoFactory {

    private final List<List<Integer>> lottosNumbers;

    public ManualLottoFactory(List<List<Integer>> lottosNumbers) {
        this.lottosNumbers = lottosNumbers;
    }

    @Override
    public List<Lotto> create() {
        return lottosNumbers.stream()
                .map(Lotto::new)
                .toList();
    }
}
