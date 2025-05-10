package main;

import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Tạo ứng dụng với JTable

public class bai11 extends JFrame {

    private JPanel contentPane;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai11 frame = new bai11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Tạo CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setBounds(50, 50, 300, 150);
        contentPane.add(cardPanel);

        // Tạo card 1 với JLabel "Page 1"
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Page 1"));
        cardPanel.add(card1, "Page1");

        // Tạo card 2 với JButton "Click"
        JPanel card2 = new JPanel();
        JButton btnClick = new JButton("Click");
        card2.add(btnClick);
        cardPanel.add(card2, "Page2");

        // Tạo JButton "Switch" để chuyển đổi giữa các card
        JButton btnSwitch = new JButton("Switch");
        btnSwitch.setBounds(150, 220, 100, 30);
        contentPane.add(btnSwitch);

        // Sự kiện chuyển đổi card
        btnSwitch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });
    }
}
