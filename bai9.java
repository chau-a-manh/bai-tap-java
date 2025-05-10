package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingWorker;

// Tạo ứng dụng với JProgressBar

public class bai9 extends JFrame {

    private JPanel contentPane;
    private JProgressBar progressBar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai9 frame = new bai9();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai9() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JProgressBar với giá trị từ 0 đến 100
        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(68, 36, 160, 20);
        contentPane.add(progressBar);
        
        // Tạo JButton "Start"
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startProgressBar();
            }
        });
        btnStart.setBounds(100, 92, 85, 25);
        contentPane.add(btnStart);
    }

    private void startProgressBar() {
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50); // 5 giây = 100 bước * 50ms mỗi bước
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                for (int value : chunks) {
                    progressBar.setValue(value);
                }
            }
        };
        worker.execute();
    }
}
