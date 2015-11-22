package dao;

import bean.Card;
import org.springframework.stereotype.Repository;

@Repository
public class CardDaoImpl {

    public Card getCard() {
        return new Card.Builder()
                .name("Blaster Blade")
                .power(9000)
                .grade(2)
                .unitType("Normal Unit")
                .boosterSet("TD01")
                .boosterSetId("005")
                .build();
    }

}
