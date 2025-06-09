# Sistem Informasi XYZ

Aplikasi desktop sederhana berbasis JavaFX untuk manajemen informasi pengguna dengan fitur registrasi dan dashboard admin.

## 📋 Deskripsi

Sistem Informasi XYZ adalah aplikasi desktop yang dibangun menggunakan JavaFX yang menyediakan:
- Sistem login dan registrasi pengguna
- Dashboard admin untuk mengelola data pengguna
- Interface yang user-friendly dengan desain modern
- Manajemen data pengguna terintegrasi

## ✨ Fitur Utama

### 🔐 Autentikasi
- **Login**: Interface login dengan validasi username dan password
- **Registrasi**: Form pendaftaran pengguna baru dengan data lengkap
- **Logout**: Sistem logout yang aman

### 👥 Manajemen Pengguna
- **Registrasi Pengguna**: Tambah pengguna baru dengan data:
  - Username
  - Password
  - Nama Lengkap
  - NIM (Nomor Induk Mahasiswa)
- **Lihat Data Pengguna**: Tampilkan daftar semua pengguna terdaftar

### 🏠 Dashboard Admin
- **User Data**: Akses ke informasi semua pengguna terdaftar
- **System Info**: Informasi versi dan copyright aplikasi
- **Navigasi**: Menu yang intuitif dan mudah digunakan

## 🛠️ Teknologi

- **Java**: Bahasa pemrograman utama
- **JavaFX**: Framework untuk GUI desktop
- **FXML**: Markup untuk desain interface
- **Maven/Gradle**: Build tool (opsional)

## 📁 Struktur Proyek

```
sistem-informasi-xyz/
├── .vscode/
│   ├── launch.json          # Konfigurasi debug VS Code
│   └── settings.json        # Pengaturan project VS Code
├── src/
│   ├── Main.java           # Entry point aplikasi
│   ├── LoginController.java # Controller untuk login
│   ├── RegisterController.java # Controller untuk registrasi
│   ├── AdminDashboardController.java # Controller dashboard admin
│   ├── admin/
│   │   └── adminDashboard.fxml # Layout dashboard admin
│   └── user/
│       ├── login.fxml      # Layout form login
│       └── register.fxml   # Layout form registrasi
├── bin/                    # File compiled
└── lib/                    # External libraries
```

## ⚙️ Prasyarat Sistem

- **Java JDK**: Versi 11 atau lebih baru
- **JavaFX SDK**: Versi 24.0.1 atau kompatibel
- **IDE**: VS Code, IntelliJ IDEA, atau Eclipse (opsional)

## 🚀 Instalasi dan Setup

### 1. Clone Repository
```bash
git clone [https://github.com/Ballon14/simple-login]
cd simple-login
```

### 2. Download JavaFX SDK
- Download JavaFX SDK dari [OpenJFX](https://openjfx.io/)
- Extract ke direktori `C:\Program Files\Java\javafx-sdk-24.0.1\` (Windows)
- Atau sesuaikan path di file konfigurasi

### 3. Konfigurasi IDE

#### Untuk VS Code:
File konfigurasi sudah tersedia di `.vscode/`:
- `launch.json`: Konfigurasi untuk menjalankan aplikasi
- `settings.json`: Pengaturan project Java

#### Untuk IDE lain:
Tambahkan VM arguments:
```
--module-path "path/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base
```

### 4. Compile dan Run
```bash
# Compile
javac -cp "path/to/javafx/lib/*" --module-path "path/to/javafx/lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base src/*.java -d bin/

# Run
java -cp bin --module-path "path/to/javafx/lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base Main
```

## 📖 Cara Penggunaan

### 1. Memulai Aplikasi
- Jalankan `Main.java`
- Aplikasi akan membuka form login

### 2. Registrasi Pengguna Baru
- Klik tombol "Register" di form login
- Isi semua field yang diperlukan:
  - Username (unique)
  - Password
  - Nama Lengkap
  - NIM
- Klik "Register" untuk menyimpan
- Otomatis kembali ke form login

### 3. Login ke Sistem
- Masukkan username dan password
- Klik "Login" untuk masuk ke dashboard

### 4. Menggunakan Dashboard Admin
- **User Data**: Lihat daftar semua pengguna terdaftar
- **System Info**: Informasi versi aplikasi
- **Logout**: Keluar dari sistem

## 🎨 Screenshot

### Form Login
Interface login yang clean dan modern dengan field username dan password.

### Form Registrasi
Form pendaftaran lengkap dengan validasi input untuk data pengguna baru.

### Dashboard Admin
Dashboard dengan menu navigasi yang intuitif untuk mengelola sistem.

## 🔧 Kustomisasi

### Mengubah Styling
Edit file `.fxml` untuk mengubah layout dan styling:
```xml
<Label style="-fx-font-size: 20px; -fx-font-weight: bold;" text="Your Text" />
```

### Menambah Fitur Baru
1. Buat controller baru di `src/`
2. Buat layout FXML di folder yang sesuai
3. Implementasikan logika bisnis
4. Hubungkan dengan controller utama

### Konfigurasi Database
Saat ini menggunakan in-memory storage. Untuk database persistent:
1. Tambahkan dependency database (MySQL, PostgreSQL, etc.)
2. Implementasikan DAO pattern
3. Update controller untuk menggunakan database

## 🐛 Troubleshooting

### Error: Module not found
- Pastikan JavaFX SDK terinstall dengan benar
- Periksa path di file konfigurasi
- Pastikan module path dan add-modules sudah sesuai

### Error: FXML Load Exception
- Periksa path file FXML
- Pastikan controller class sudah benar
- Cek fx:controller attribute di file FXML

### Performance Issues
- Optimalkan penggunaan memori
- Implementasikan lazy loading untuk data besar
- Gunakan background threads untuk operasi berat

## 🤝 Kontribusi

1. Fork repository ini
2. Buat branch fitur baru (`git checkout -b feature/amazing-feature`)
3. Commit perubahan (`git commit -m 'Add amazing feature'`)
4. Push ke branch (`git push origin feature/amazing-feature`)
5. Buat Pull Request

## 📄 Lisensi

Copyright © 2025 Sistem Informasi XYZ. All rights reserved.

Proyek ini dibuat untuk keperluan pembelajaran dan pengembangan sistem informasi.

## 👨‍💻 Pengembang

- **Developer**: [Iqbal]
- **Email**: [iqbal140605@Gmail.com]
- **Version**: 1.0.0

## 📚 Referensi

- [JavaFX Documentation](https://openjfx.io/)
- [Oracle JavaFX Tutorials](https://docs.oracle.com/javafx/)
- [FXML Introduction](https://docs.oracle.com/javafx/2/fxml_get_started/jfxpub-fxml_get_started.htm)

---

**Selamat menggunakan Sistem Informasi XYZ! 🚀**
