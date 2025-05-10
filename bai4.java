package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

// Tạo ứng dụng với JComboBox

public class bai4 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai4 frame = new bai4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public bai4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Tạo JComboBox với 5 loại trái cây
        String[] fruits = {"Táo", "Chuối", "Cam", "Nho", "Dứa"};
        JComboBox comboBox = new JComboBox(fruits); // Không sử dụng Generics
        comboBox.setBounds(10, 20, 266, 33);
        contentPane.add(comboBox);

        // Tạo JLabel để hiển thị lựa chọn
        lblNewLabel = new JLabel("Lựa chọn của bạn: ");
        lblNewLabel.setBounds(10, 70, 276, 30);
        contentPane.add(lblNewLabel);

        // Thêm ActionListener cho JComboBox
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = (String) comboBox.getSelectedItem();
                lblNewLabel.setText("Lựa chọn của bạn: " + selectedFruit);
            }
        });
    }
}