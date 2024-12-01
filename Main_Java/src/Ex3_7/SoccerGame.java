package Ex3_7;

import java.util.ArrayList;
import java.util.List;

public class SoccerGame {
    private Ball ball;
    private List<Player> team1;
    private List<Player> team2;
    private float fieldWidth, fieldHeight;

    public SoccerGame(float fieldWidth, float fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        this.ball = new Ball(fieldWidth / 2, fieldHeight / 2); // Ball starts at center

        this.team1 = new ArrayList<>();
        this.team2 = new ArrayList<>();
    }

    public void addPlayerToTeam1(Player player) {
        team1.add(player);
    }

    public void addPlayerToTeam2(Player player) {
        team2.add(player);
    }

    public void simulate() {
        System.out.println("Initial Ball Position: " + ball);

        for (int i = 0; i < 10; i++) { // Simulate 10 steps
            // Example: first player from each team moves and kicks
            Player p1 = team1.get(0);
            Player p2 = team2.get(0);

            p1.move(1, 0); // Player 1 moves right
            p2.move(-1, 0); // Player 2 moves left

            // Player 1 kicks the ball toward (fieldWidth, fieldHeight / 2) (goal area)
            if (i == 5) p1.kick(ball, fieldWidth, fieldHeight / 2);

            ball.move();

            System.out.println("Step " + (i + 1));
            System.out.println(ball);
            System.out.println(p1);
            System.out.println(p2);

            // Check if the ball reaches the edge of the field
            if (ball.getX() <= 0 || ball.getX() >= fieldWidth || ball.getY() <= 0 || ball.getY() >= fieldHeight) {
                System.out.println("Ball is out of bounds!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        SoccerGame game = new SoccerGame(100, 50);

        // Add players to the teams
        game.addPlayerToTeam1(new Player("Player1_Team1", 10, 25, 2));
        game.addPlayerToTeam1(new Player("Player2_Team1", 15, 30, 2));

        game.addPlayerToTeam2(new Player("Player1_Team2", 90, 25, 2));
        game.addPlayerToTeam2(new Player("Player2_Team2", 85, 30, 2));

        // Start the simulation
        game.simulate();
    }
}

