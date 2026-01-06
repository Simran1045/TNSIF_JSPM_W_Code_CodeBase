package DiceGame_Pro1_Indivisual_TNSIF;

	import javax.swing.*;
	import java.awt.*;
	import java.util.Random;

	public class TwoPlayerDiceGame {

	    static int player1Roll = 0;
	    static int player2Roll = 0;

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Two Player Dice Game ");
	        frame.setSize(500, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new GridLayout(5, 1));

	        JLabel p1Label = new JLabel("Player 1: ", SwingConstants.CENTER);
	        JLabel p2Label = new JLabel("Player 2: ", SwingConstants.CENTER);
	        JLabel resultLabel = new JLabel("Result", SwingConstants.CENTER);

	        p1Label.setFont(new Font("Arial", Font.BOLD, 18));
	        p2Label.setFont(new Font("Arial", Font.BOLD, 18));
	        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));

	        JButton p1Button = new JButton(" Player 1 Roll ");
	        JButton p2Button = new JButton(" Player 2 Roll ");

	        Random random = new Random();

	        // Player 1 roll
	        p1Button.addActionListener(e -> {
	            player1Roll = random.nextInt(6) + 1;
	            p1Label.setText("Player 1: " + player1Roll);
	            checkWinner(resultLabel);
	        });

	        // Player 2 roll
	        p2Button.addActionListener(e -> {
	            player2Roll = random.nextInt(6) + 1;
	            p2Label.setText("Player 2: " + player2Roll);
	            checkWinner(resultLabel);
	        });

	        frame.add(p1Label);
	        frame.add(p1Button);
	        frame.add(p2Label);
	        frame.add(p2Button);
	        frame.add(resultLabel);

	        frame.setVisible(true);
	    }

	    static void checkWinner(JLabel resultLabel) {
	        if (player1Roll > 0 && player2Roll > 0) {
	            if (player1Roll > player2Roll) {
	                resultLabel.setText("!!----- Player 1 Wins ----!!");
	            } else if (player2Roll > player1Roll) {
	                resultLabel.setText(" !!----- Player 2 Wins ----!!");
	            } else {
	                resultLabel.setText(" ** It's a Tie! **");
	            }
	        }
	    }
	}

