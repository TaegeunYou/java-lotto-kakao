package domain.lotto;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class AutoLottoFactory implements LottoFactory {

    private final int count;
    private final Random random;

    public AutoLottoFactory(int count) {
        this.count = count;
        this.random = new Random();
    }

    public AutoLottoFactory(int count, Random random) {
        this.count = count;
        this.random = random;
    }

    @Override
    public List<Lotto> create() {
        return IntStream.range(0, count)
                .mapToObj(i -> new Lotto(random))
                .toList();
    }
}
