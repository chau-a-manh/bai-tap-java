package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class bai1 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai1 frame = new bai1();
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
    public bai1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Họ Tên");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(10, 10, 108, 51);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Xác Nhận");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.setBounds(97, 191, 116, 42);
        contentPane.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(97, 28, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(10, 68, 90, 19);
        contentPane.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(97, 71, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Ngày Sinh");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(10, 113, 90, 19);
        contentPane.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setBounds(97, 115, 96, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textArea = new JTextArea();
        textArea.setBounds(219, 25, 191, 102);
        contentPane.add(textArea);
        
        // Thêm ActionListener cho nút
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hoTen = textField.getText();
                String maSinhVien = textField_1.getText();
                String ngaySinh = textField_2.getText();

                // Kiểm tra điều kiện
                if (!hoTen.matches("[a-zA-Z\\s]+")) {
                    textArea.setText("Lỗi: Họ tên chỉ được chứa chữ cái!");
                    return;
                }

                if (!maSinhVien.matches("\\d+")) {
                    textArea.setText("Lỗi: Mã sinh viên chỉ được chứa số!");
                    return;
                }

                if (!ngaySinh.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
                    textArea.setText("Lỗi: Ngày sinh phải theo định dạng DD/MM/YYYY!");
                    return;
                }

                String message = "Họ Tên: " + hoTen + "\nMã Sinh Viên: " + maSinhVien + "\nNgày Sinh: " + ngaySinh;
                textArea.setText(message);
            }
        });
    }
}