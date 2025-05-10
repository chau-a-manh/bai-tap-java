package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

// Tạo ứng dụng với JTabbedPane 

public class bai2 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai2 frame = new bai2();
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
    public bai2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        contentPane.add(tabbedPane, BorderLayout.CENTER);
        
        // Tab Home
        JLabel lblHome = new JLabel("Welcome to Home Tab");
        tabbedPane.addTab("Home", lblHome);
        
        // Tab Profile
        JLabel lblProfile = new JLabel("This is your Profile Tab");
        tabbedPane.addTab("Profile", lblProfile);
        
        // Tab Settings
        JLabel lblSettings = new JLabel("Adjust your Settings here");
        tabbedPane.addTab("Settings", lblSettings);
    }
}