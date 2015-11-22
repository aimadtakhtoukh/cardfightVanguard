package exec;

import dao.CardDaoImpl;
import game.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan({"aspect", "dao", "game", "signal"})
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        Board board = ctx.getBean(Board.class);
        CardDaoImpl dao = ctx.getBean(CardDaoImpl.class);
        board.setRearGuard(Board.POSITION.FORWARD_LEFT, dao.getCard());
        board.setVanguard(dao.getCard());
    }

}
