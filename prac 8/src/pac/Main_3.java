package pac;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main_3 extends JFrame {
    public Main_3(String imagePath) {
        setTitle("кАРТИНка");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        File imageFile = new File(imagePath);
        if (imageFile.exists()) {
            ImageIcon imageIcon = new ImageIcon(imagePath);
            JLabel imageLabel = new JLabel(imageIcon);
            add(imageLabel);
        } else {
            JLabel errorLabel = new JLabel("Изображение не найдено " + imagePath, SwingConstants.CENTER);
            add(errorLabel);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            new Main_3(args[0]);
        } else {
            System.out.println("Нужен путь к файлам");
        }
    }
}