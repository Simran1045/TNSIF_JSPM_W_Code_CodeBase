package DiceGame_Pro1_Indivisual_TNSIF;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.util.Random;

	public class DiceGamefor4Player extends JFrame {

	    private JLabel[] playerLabels = new JLabel[4];
	    private JLabel resultLabel;
	    private Random random = new Random();

	    public DiceGamefor4Player() {
	        setTitle("Dice Game - 4 Players");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Title
	        JLabel title = new JLabel("🎲 Dice Game 🎲", SwingConstants.CENTER);
	        title.setFont(new Font("Arial", Font.BOLD, 20));
	        add(title, BorderLayout.NORTH);

	        // Player panel
	        JPanel playerPanel = new JPanel(new GridLayout(4, 1));
	        for (int i = 0; i < 4; i++) {
	            playerLabels[i] = new JLabel("Player " + (i + 1) + ": -");
	            playerLabels[i].setFont(new Font("Arial", Font.PLAIN, 16));
	            playerPanel.add(playerLabels[i]);
	        }
	        add(playerPanel, BorderLayout.CENTER);

	        // Bottom panel
	        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));

	        JButton rollButton = new JButton("Roll Dice");
	        rollButton.addActionListener(this::rollDice);
	        bottomPanel.add(rollButton);

	        resultLabel = new JLabel("Click Roll Dice to start", SwingConstants.CENTER);
	        bottomPanel.add(resultLabel);

	        add(bottomPanel, BorderLayout.SOUTH);

	        setVisible(true);
	    }

	    private void rollDice(ActionEvent e) {
	        int highest = 0;
	        int winner = -1;

	        for (int i = 0; i < 4; i++) {
	            int roll = random.nextInt(6) + 1;
	            playerLabels[i].setText("Player " + (i + 1) + ": " + roll);

	            if (roll > highest) {
	                highest = roll;
	                winner = i + 1;
	            }
	        }

	        resultLabel.setText("🏆 Player " + winner + " wins with " + highest + "!");
	    }

	    public static void main(String[] args) {
	        new DiceGameUI();
	    }
	}

