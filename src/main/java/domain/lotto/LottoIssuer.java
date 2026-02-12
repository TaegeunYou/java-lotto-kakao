package domain.lotto;

import java.util.List;

public class LottoIssuer {

    private final LottoFactory lottoFactory;

    public LottoIssuer(LottoFactory lottoFactory) {
        this.lottoFactory = lottoFactory;
    }

    public List<Lotto> issue() {
        return lottoFactory.create();
    }
}
