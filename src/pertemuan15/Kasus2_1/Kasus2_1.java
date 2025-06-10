import javax.swing.*;
import java.awt.event.*;

public class Kasus2_1 extends JFrame implements ActionListener {
    private JTextField angka1Field, angka2Field;
    private JButton tombolJumlah;

    public Kasus2_1() {
        setTitle("Penjumlahan Dua Angka");
        setSize(300, 180);
        setLayout(null);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(30, 20, 80, 25);
        add(label1);

        angka1Field = new JTextField();
        angka1Field.setBounds(100, 20, 150, 25);
        add(angka1Field);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(30, 50, 80, 25);
        add(label2);

        angka2Field = new JTextField();
        angka2Field.setBounds(100, 50, 150, 25);
        add(angka2Field);

        tombolJumlah = new JButton("Jumlahkan");
        tombolJumlah.setBounds(80, 90, 120, 30);
        tombolJumlah.addActionListener(this);
        add(tombolJumlah);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(angka1Field.getText());
            int angka2 = Integer.parseInt(angka2Field.getText());
            int hasil = angka1 + angka2;
            JOptionPane.showMessageDialog(this, "Hasil Penjumlahan: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang benar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Kasus2_1();
    }
}
