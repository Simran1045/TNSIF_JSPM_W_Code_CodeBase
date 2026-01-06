package DiceGame_Pro1_Indivisual_TNSIF;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceGameUI extends JFrame {

    private JLabel diceLabel1;
    private JLabel diceLabel2;
    private JLabel resultLabel;
    private JButton rollButton;
    private Random random;

    public DiceGameUI() {
        random = new Random();

        // Frame settings
        setTitle("Dice Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new BorderLayout());

        // Dice panel
        JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new GridLayout(1, 2, 20, 20));

        diceLabel1 = new JLabel("🎲 1", SwingConstants.CENTER);
        diceLabel2 = new JLabel("🎲 1", SwingConstants.CENTER);

        diceLabel1.setFont(new Font("Arial", Font.BOLD, 40));
        diceLabel2.setFont(new Font("Arial", Font.BOLD, 40));

        dicePanel.add(diceLabel1);
        dicePanel.add(diceLabel2);

        // Button
        rollButton = new JButton("Roll Dice");
        rollButton.setFont(new Font("Arial", Font.BOLD, 18));

        // Result label
        resultLabel = new JLabel("Click Roll Dice!", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        // Button action
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dice1 = random.nextInt(6) + 1;
                int dice2 = random.nextInt(6) + 1;

                diceLabel1.setText("🎲 " + dice1);
                diceLabel2.setText("🎲 " + dice2);

                resultLabel.setText("Total: " + (dice1 + dice2));
            }
        });

        // Add components
        add(dicePanel, BorderLayout.CENTER);
        add(rollButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DiceGameUI().setVisible(true);
        });
    }
}