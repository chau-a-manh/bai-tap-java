package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai13 extends JFrame {

    private JPanel contentPane;
    private JTextField txtHoTen;
    private JTextField txtNgaySinh;
    private JTextField txtQueQuan;
    private JTable table;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai13 frame = new bai13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Thêm trường nhập liệu
        JLabel lblHoTen = new JLabel("Họ và Tên:");
        lblHoTen.setBounds(30, 30, 100, 20);
        contentPane.add(lblHoTen);

        txtHoTen = new JTextField();
        txtHoTen.setBounds(140, 30, 200, 25);
        contentPane.add(txtHoTen);

        JLabel lblNgaySinh = new JLabel("Ngày Sinh:");
        lblNgaySinh.setBounds(30, 70, 100, 20);
        contentPane.add(lblNgaySinh);

        txtNgaySinh = new JTextField();
        txtNgaySinh.setBounds(140, 70, 200, 25);
        contentPane.add(txtNgaySinh);

        JLabel lblQueQuan = new JLabel("Quê Quán:");
        lblQueQuan.setBounds(30, 110, 100, 20);
        contentPane.add(lblQueQuan);

        txtQueQuan = new JTextField();
        txtQueQuan.setBounds(140, 110, 200, 25);
        contentPane.add(txtQueQuan);

        // Thêm JButton để hiển thị dữ liệu lên JTable
        JButton btnThem = new JButton("Thêm");
        btnThem.setBounds(140, 150, 100, 30);
        contentPane.add(btnThem);

        // Thêm JTable
        String[] columnNames = { "Họ và Tên", "Ngày Sinh", "Quê Quán" };
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 200, 420, 150);
        contentPane.add(scrollPane);

        // Xử lý sự kiện khi nhấn nút "Thêm"
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các trường nhập liệu
                String hoTen = txtHoTen.getText();
                String ngaySinh = txtNgaySinh.getText();
                String queQuan = txtQueQuan.getText();

                // Thêm dữ liệu vào bảng
                tableModel.addRow(new Object[] { hoTen, ngaySinh, queQuan });

                // Xóa dữ liệu trong ô nhập sau khi thêm
                txtHoTen.setText("");
                txtNgaySinh.setText("");
                txtQueQuan.setText("");
            }
        });
    }
}
