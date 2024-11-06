package pac;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main_2 extends JPanel {
    private final Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 20; i++) {
            Shape shape;
            int x = random.nextInt(300);
            int y = random.nextInt(300);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextBoolean()) {
                shape = new Circle(color, x, y, random.nextInt(50) + 10);
            } else {
                shape = new Rectangle(color, x, y, random.nextInt(50) + 10, random.nextInt(50) + 10);
            }
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 2");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main_2());
        frame.setVisible(true);
    }
}