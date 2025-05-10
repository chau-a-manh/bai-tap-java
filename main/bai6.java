package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Tạo ứng dụng với JCheckBox

public class bai6 extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai6 frame = new bai6();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai6() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JCheckBox chckbxEnableBackground = new JCheckBox("Enable Background");
        chckbxEnableBackground.setBounds(90, 80, 140, 21);
        contentPane.add(chckbxEnableBackground);

        // Thêm sự kiện cho JCheckBox
        chckbxEnableBackground.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxEnableBackground.isSelected()) {
                    contentPane.setBackground(Color.GREEN);
                } else {
                    contentPane.setBackground(null);
                }
            }
        });
    }
}
