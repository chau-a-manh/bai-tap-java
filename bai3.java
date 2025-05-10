
package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;

// Tạo danh sách cuộn với JList

public class bai3 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai3 frame = new bai3();
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
    public bai3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        // Tạo danh sách các thành phố
        String[] cities = {
            "Hà Nội", "Hồ Chí Minh", "Đà Nẵng", 
            "Nha Trang", "Cần Thơ", "Hải Phòng", 
            "Quy Nhơn", "Vũng Tàu", "Đà Lạt", 
            "Huế"
        };
        
        // Tạo JList
        JList cityList = new JList(cities); // Không sử dụng Generics
        cityList.setModel(new AbstractListModel() {
        	String[] values = new String[] {"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Nha Trang", "Cần Thơ", "Hải Phòng", "Quy Nhơn", "Vũng Tàu", "Đà Lạt", "Huế"};
        	public int getSize() {
        		return values.length;
        	}
        	public Object getElementAt(int index) {
        		return values[index];
        	}
        });
        JScrollPane scrollPane = new JScrollPane(cityList);
        
        // Tạo JLabel hiển thị số lượng mục
        JLabel label = new JLabel("Số lượng thành phố: " + cities.length);
        
        // Thêm JScrollPane và JLabel vào contentPane
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);
    }
}