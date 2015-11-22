package game;

import aspect.GameSignal;
import bean.Card;
import org.springframework.stereotype.Component;

import java.util.EnumMap;

@Component
public class Board {
    public enum POSITION {
        FORWARD_RIGHT,
        FORWARD_LEFT,
        BACK_RIGHT,
        BACK_LEFT,
        BACK_MIDDLE
    }

    Card vanguard;
    EnumMap<POSITION, Card> rearguards = new EnumMap<>(POSITION.class);

    @GameSignal("CALL")
    public void setRearGuard(POSITION position, Card card) {
        rearguards.put(position, card);
        System.out.println(card);
    }

    @GameSignal("RIDE")
    public void setVanguard(Card card) {
        vanguard = card;
        System.out.println(card);
    }

}
