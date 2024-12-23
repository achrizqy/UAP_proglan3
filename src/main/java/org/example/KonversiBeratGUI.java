package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Kelas KonversiBeratGUI adalah antarmuka pengguna grafis (GUI) untuk mengonversi berat
 * antara berbagai satuan metrik dan imperial.
 */
public class KonversiBeratGUI extends JFrame {
    public JTextField inputBerat; // Field untuk memasukkan berat
    public JComboBox<String> comboSatuanAsal; // Dropdown untuk memilih satuan asal
    public JComboBox<String> comboSatuanTujuan; // Dropdown untuk memilih satuan tujuan
    public AbstractButton konversiButton; // Tombol untuk melakukan konversi
    public JTable hasilTable; // Tabel untuk menampilkan hasil konversi
    private DefaultTableModel tableModel; // Model tabel untuk hasil konversi

    /**
     * Konstruktor untuk kelas KonversiBeratGUI.
     * Menginisialisasi komponen GUI dan menambahkan mereka ke frame.
     */
    public KonversiBeratGUI() {
        setTitle("Konversi Berat"); // Set judul frame
        setSize(500, 400); // Set ukuran frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set operasi penutupan
        setLayout(new FlowLayout()); // Set layout untuk frame

        // Komponen GUI
        JLabel labelInput = new JLabel("Masukkan Berat:"); // Label untuk input berat
        inputBerat = new JTextField(10); // Field untuk memasukkan berat

        JLabel labelSatuanAsal = new JLabel("Satuan Asal:"); // Label untuk satuan asal
        String[] satuan = {
                "ton", "kg", "g", "mg", "µg",
                "pound", "ons", "stone", "ton (imperial)"
        };
        comboSatuanAsal = new JComboBox<>(satuan); // Dropdown untuk satuan asal

        JLabel labelSatuanTujuan = new JLabel("Satuan Tujuan:"); // Label untuk satuan tujuan
        comboSatuanTujuan = new JComboBox<>(satuan); // Dropdown untuk satuan tujuan

        JButton konversiButton = new JButton("Konversi"); // Tombol untuk melakukan konversi

        // Tabel untuk menampilkan hasil
        String[] columnNames = {"Berat Asli", "Satuan Asal", "Satuan Tujuan", "Hasil"};
        tableModel = new DefaultTableModel(columnNames, 0); // Model tabel
        hasilTable = new JTable(tableModel); // Tabel untuk hasil
        JScrollPane scrollPane = new JScrollPane(hasilTable); // Scroll pane untuk tabel
        scrollPane.setPreferredSize(new Dimension(450, 200)); // Set ukuran scroll pane

        // Menambahkan komponen ke frame
        add(labelInput);
        add(inputBerat);
        add(labelSatuanAsal);
        add(comboSatuanAsal);
        add(labelSatuanTujuan);
        add(comboSatuanTujuan);
        add(konversiButton);
        add(scrollPane);

        // Action Listener untuk tombol konversi
        konversiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double berat = Double.parseDouble(inputBerat.getText()); // Mengambil input berat
                    String satuanAsal = (String) comboSatuanAsal.getSelectedItem(); // Mengambil satuan asal
                    String satuanTujuan = (String) comboSatuanTujuan.getSelectedItem(); // Mengambil satuan tujuan

                    // Mengonversi berat menggunakan utilitas konversi
                    double hasil = KonversiBeratUtil.konversi(berat, satuanAsal, satuanTujuan);

                    // Menambahkan hasil ke tabel
                    tableModel.addRow(new Object[]{
                            berat, satuanAsal, satuanTujuan, String.format("%.2f %s", hasil, satuanTujuan)
                    });
                } catch (NumberFormatException ex) {
                    /**Error Handling
                     * - Jika input berat tidak valid (misalnya, bukan angka), aplikasi akan menampilkan pesan kesalahan.
                     * - Jika unit yang dipilih tidak valid, aplikasi juga akan menunjukkan pesan kesalahan.
                     */
                    JOptionPane.showMessageDialog(KonversiBeratGUI.this, "Masukkan nilai berat yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    // Menangani kesalahan jika satuan tidak valid
                    JOptionPane.showMessageDialog(KonversiBeratGUI.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    /**
     * Metode utama untuk menjalankan aplikasi.
     * Menginisialisasi dan menampilkan frame KonversiBeratGUI.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KonversiBeratGUI frame = new KonversiBeratGUI(); // Membuat instance dari KonversiBeratGUI
            frame.setVisible(true); // Menampilkan frame
        });
    }
}