# Konversi Berat

Aplikasi ini adalah alat konversi berat yang memungkinkan pengguna untuk mengonversi nilai berat antara berbagai satuan metrik dan imperial. Aplikasi ini menggunakan Java Swing untuk antarmuka pengguna grafis (GUI).

## Spesifikasi Teknis

- **Bahasa Pemrograman**: Java
- **Framework**: Java Swing untuk GUI
- **Metode Konversi**: Menggunakan rumus konversi yang telah ditentukan untuk setiap unit berat.
- **Output**: Hasil konversi ditampilkan dalam tabel di antarmuka pengguna.

## Prerequisites

- Java Development Kit (JDK) 8 atau yang lebih baru.
- IDE Java (seperti IntelliJ IDEA, Eclipse, atau NetBeans) untuk menjalankan dan mengedit kode.

## Fitur

- Mengonversi antara berbagai satuan berat:
    - Ton
    - Kilogram (kg)
    - Gram (g)
    - Miligram (mg)
    - Mikrogram (µg)
    - Pound
    - Ounce
    - Stone
    - Ton (imperial)

- Menampilkan hasil konversi dalam tabel.



## Komponen GUI

Aplikasi ini terdiri dari beberapa komponen GUI, antara lain:

- **JTextField**: Untuk memasukkan nilai berat.
- **JComboBox**: Untuk memilih unit asal dan unit tujuan.
- **JButton**: Untuk melakukan konversi.
- **JTable**: Untuk menampilkan hasil konversi.
- **JScrollPane**: Untuk menambahkan kemampuan scroll pada tabel hasil.

## Validasi Input

- **Validasi Format**: Aplikasi memeriksa apakah input berat adalah angka yang valid. Jika tidak, akan muncul pesan kesalahan.
- **Validasi Satuan**: Aplikasi memastikan bahwa satuan yang dipilih untuk unit sumber dan unit target adalah valid. Jika tidak, akan muncul pesan kesalahan.

## Format File Output

- Hasil konversi ditampilkan dalam tabel di antarmuka pengguna, dengan format sebagai berikut:
    - **Berat Asli**: Nilai berat yang dimasukkan oleh pengguna.
    - **Satuan Asal**: Satuan dari berat yang dimasukkan.
    - **Satuan Tujuan**:

## Cara Menjalankan Aplikasi

1. **Clone repositori ini**:
   ```bash
   https://github.com/achrizqy/UAP_proglan3

2. **Buka Proyek di IDE Anda**:
    - Luncurkan IDE pilihan Anda (misalnya, IntelliJ IDEA, Eclipse, atau NetBeans).
    - Pilih opsi untuk membuka proyek yang ada dan navigasikan ke folder yang telah Anda kloning.

3. **Jalankan Kelas `KonversiBeratGUI`**:
    - Temukan kelas `KonversiBeratGUI` dalam struktur proyek Anda.
    - Klik kanan pada kelas tersebut dan pilih opsi untuk menjalankan (Run) kelas.
    - Sebagai alternatif, jika menggunakan IntelliJ, Anda dapat mengklik tombol run hijau di samping metode `main`.

4. **Antarmuka Pengguna**:
    - Setelah aplikasi berjalan, jendela GUI akan muncul.

5. **Masukkan Nilai Berat**:
    - Di kolom input, masukkan nilai berat yang ingin Anda konversi (misalnya, `1000`).

6. **Pilih Unit Sumber**:
    - Dari dropdown "Unit Sumber", pilih unit dari mana Anda ingin mengonversi (misalnya, `kg`).

7. **Pilih Unit Target**:
    - Dari dropdown "Unit Target", pilih unit yang ingin Anda konversi (misalnya, `ton`).

8. **Klik Tombol "Konversi"**:
    - Setelah mengisi semua informasi, klik tombol "Konversi".

9. **Lihat Hasil Konversi**:
    - Hasil konversi akan ditampilkan dalam tabel di bawah tombol. Anda akan melihat berat asli, unit sumber, unit target, dan hasil konversi.