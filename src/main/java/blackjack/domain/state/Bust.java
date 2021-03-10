package blackjack.domain.state;

import blackjack.domain.card.Cards;

public class Bust extends Finished {
    public Bust(Cards cards) {
        super(cards);
    }

    @Override
    public double profitRatio() {
        return 0;
    }
}
