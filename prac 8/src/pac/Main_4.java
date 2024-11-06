package pac;import javax.swing.*;
import java.awt.*;

public class Main_4 extends JPanel {
    private Image[] frames;
    private int currentFrame = 0;
    public Main_4() {
        String[] framePaths = {
                "C:\\Users\\Synergistic\\Downloads\\1.PNG",
                "C:\\Users\\Synergistic\\Downloads\\2.PNG",
                "C:\\Users\\Synergistic\\Downloads\\3.PNG",
                "C:\\Users\\Synergistic\\Downloads\\4.PNG"
        };

        // Загрузка изображений из указанных путей
        frames = new Image[framePaths.length];
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]).getImage();
        }

        // Таймер для смены кадров анимации каждые 200 миллисекунд
        Timer timer = new Timer(200, e -> {
            currentFrame = (currentFrame + 1) % frames.length; // Переход к следующему кадру
            repaint(); // Обновление панели для отображения следующего кадра
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 50, 50, this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Animation");
        frame.setSize(600, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main_4());
        frame.setVisible(true);
    }
}