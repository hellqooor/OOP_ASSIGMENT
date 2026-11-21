# Pokedex GUI (Java Swing)

Aplikasi desktop sederhana berbasis **Java Swing** untuk menampilkan data Pokémon (nama, gambar, dan deskripsi) beserta navigasi antar-item menggunakan tombol *previous* (`<`) dan *next* (`>`).

## Struktur File

* **`PData.java`**: Kelas model data (*POJO*) untuk menyimpan informasi satu Pokémon (`imagePath`, `description`, dan `name`) beserta *constructor* dan *getter*-nya.
* **`GUI2.java`**: Kelas utama berisi *entry point* `main()`, array data `pokedex` (berisi 9 Pokémon awal dari Bulbasaur hingga Blastoise), komponen antarmuka Swing, serta logika pembaruan tampilan (`updatePokedexDisplay`).

## Arsitektur Komponen GUI (Java Swing)

Berikut adalah pemetaan kelas komponen Java Swing yang diimplementasikan di dalam `GUI2.java`:

### 1. Top-Level Container Class
Wadah utama paling luar yang menjadi jendela aplikasi di sistem operasi:
* **`JFrame`** (`window`): Digunakan sebagai jendela utama aplikasi dengan judul `"Pokedex"`, ukuran `550x600`, dan operasi tutup `JFrame.EXIT_ON_CLOSE`.

### 2. Intermediate Container Class
Wadah perantara yang berfungsi mengelompokkan dan mengatur tata letak komponen di dalam `JFrame`:
* **`JPanel`**:
  * `pane`: Panel utama yang menampung keseluruhan elemen di dalam `JFrame`.
  * `highPane`: Panel bagian atas/tengah yang mengelompokkan nama Pokémon, gambar, serta tombol navigasi `<` dan `>`.
  * `name`: Panel khusus untuk memposisikan label judul nama Pokémon di bagian atas.
* **`JScrollPane`** (`descScroll`): Wadah penggulung (*scrollable container*) yang membungkus `JTextArea` (`desc`) agar deskripsi Pokémon yang panjang tetap dapat dibaca dengan rapi.

### 3. Atomic Component Class
Komponen dasar yang berinteraksi langsung dengan pengguna atau menampilkan informasi secara spesifik:
* **`JLabel`**:
  * `labpoke`: Menampilkan gambar Pokémon (`ImageIcon` berukuran `250x250`) atau teks peringatan jika gambar tidak ditemukan.
  * `lblPo`: Menampilkan nama Pokémon dengan gaya huruf tebal (`Arial`, Bold, ukuran `20`).
* **`JButton`**:
  * `pre`: Tombol navigasi dengan label `"<"` untuk berpindah ke data Pokémon sebelumnya.
  * `nex`: Tombol navigasi dengan label `">"` untuk berpindah ke data Pokémon berikutnya.
* **`JTextArea`** (`desc`): Area teks *read-only* (`setEditable(false)`) dengan pembungkusan baris otomatis (`setLineWrap(true)`) untuk menampilkan deskripsi lengkap Pokémon.

### 4. Layout Classes (Manajer Tata Letak)
Aplikasi ini mengombinasikan **2 jenis Layout Manager** untuk menyusun komponen:
1. **`BorderLayout`**:
   * Diterapkan pada `pane` (`new BorderLayout(10, 10)`) untuk menempatkan `highPane` di area `CENTER` dan `descScroll` di area `SOUTH`.
   * Diterapkan pada `highPane` (`new BorderLayout(10, 10)`) untuk menempatkan `name` di `NORTH`, `labpoke` di `CENTER`, `pre` di `WEST`, dan `nex` di `EAST`.
2. **`FlowLayout`**:
   * Diterapkan pada panel `name` (`new FlowLayout(FlowLayout.CENTER)`) untuk menjaga posisi judul nama Pokémon (`lblPo`) selalu rata tengah secara horizontal.

### 5. Event Listener
Mekanisme penanganan interaksi pengguna saat tombol ditekan:
* **`ActionListener` (Interface) — Override metode `actionPerformed(ActionEvent e)`**:
  * Diimplementasikan menggunakan ekspresi *Lambda* (`e -> { ... }`) pada metode `addActionListener()` untuk tombol `pre` dan `nex`.
  * Saat `pre` diklik, `actionPerformed` memeriksa apakah `currentIndex > 0`, mengurangi indeks (`currentIndex--`), lalu memanggil `updatePokedexDisplay.run()`.
  * Saat `nex` diklik, `actionPerformed` memeriksa apakah `currentIndex < pokedex.length - 1`, menambah indeks (`currentIndex++`), lalu memanggil `updatePokedexDisplay.run()`.

---

## Cara Menjalankan

1. Pastikan **JDK** sudah terpasang di komputer Anda.
2. Siapkan file gambar (`001.png` s.d. `009.png`) di direktori yang sesuai dengan konstanta `FOLDER_GAMBAR` pada `GUI2.java` (`"/Users/hell/Documents/Collage/SEMESTER 3/OOP/GUI/Pict"`).
3. Kompilasi kedua file Java:
   ```bash
   javac PData.java GUI2.java
   ```
4. Jalankan program:
   ```bash
   java GUI2
   ```