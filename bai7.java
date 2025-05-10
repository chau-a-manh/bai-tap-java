package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Tạo ứng dụng với JRadioButton

public class bai7 extends JFrame {

    private JPanel contentPane;
    private JLabel lblSelection;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai7 frame = new bai7();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Tạo JLabel hiển thị lựa chọn của người dùng
        lblSelection = new JLabel("Lựa chọn của người dùng: ");
        lblSelection.setBounds(31, 20, 220, 30);
        contentPane.add(lblSelection);

        // Tạo các JRadioButton
        JRadioButton rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setBounds(31, 60, 100, 21);
        contentPane.add(rdbtnMale);

        JRadioButton rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setBounds(154, 60, 100, 21);
        contentPane.add(rdbtnFemale);

        // Thêm ButtonGroup để đảm bảo chỉ một nút được chọn
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnMale);
        genderGroup.add(rdbtnFemale);

        // Thêm sự kiện để cập nhật JLabel khi lựa chọn thay đổi
        ActionListener radioButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblSelection.setText("Lựa chọn của người dùng: " + ((JRadioButton) e.getSource()).getText());
            }
        };

        rdbtnMale.addActionListener(radioButtonListener);
        rdbtnFemale.addActionListener(radioButtonListener);
    }
}
