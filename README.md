# Tugas 2 — Program Gaji Karyawan (Java)

Program sederhana untuk menghitung total penghasilan karyawan berdasarkan golongan (A/B/C) dan jam lembur.

## Fitur
- Input golongan karyawan: A, B, atau C.
- Input jam lembur (0, 1, 2, 3, 4, atau ≥5).
- Perhitungan gaji pokok sesuai golongan.
- Perhitungan gaji lembur berdasarkan persentase dari gaji pokok.
- Tampilan rincian gaji dengan format rupiah.

## Aturan Gaji
- Golongan:
  - A: Rp 5.000.000
  - B: Rp 6.500.000
  - C: Rp 9.500.000
- Lembur:
  - 0 jam: 0%
  - 1 jam: 30%
  - 2 jam: 32%
  - 3 jam: 34%
  - 4 jam: 36%
  - ≥5 jam: 38%

## Persyaratan
- Java JDK terpasang (versi 8+).
- Terminal/Command Prompt (Windows).

## Cara Menjalankan (Windows)
1. Buka folder project di VS Code.
2. Buka Terminal (Ctrl+`).
3. Kompilasi:
   ```
   javac GajiKaryawan.java
   ```
4. Jalankan:
   ```
   java GajiKaryawan
   ```

## Cara Pakai
- Masukkan golongan (A/B/C) saat diminta.
- Masukkan jumlah jam lembur (bilangan bulat).
- Program menampilkan rincian gaji dan total penghasilan.

## Contoh Interaksi
Input:
```
Masukkan golongan (A/B/C): B
Masukkan jam lembur: 3
```
Output:
```
--- Rincian gaji karyawan ---
Golongan: B
Gaji pokok: Rp 6,500,000
Jam lembur: 3 jam
Gaji lembur: Rp 2,210,000
----------------------------------
Total penghasilan: Rp 8,710,000
```

## Struktur File
- GajiKaryawan.java — Sumber kode utama (input, logika if-else, perhitungan, output).

## Penjelasan Singkat Kode
- Import Scanner untuk membaca input.
- Deklarasi variabel: golongan, jamLembur, gajiPokok, persenLembur, gajiLembur, totalGaji.
- If-else golongan menentukan gaji pokok.
- If-else jam lembur menentukan persentase lembur.
- Hitung gaji lembur = gajiPokok × persenLembur.
- Total = gajiPokok + gajiLembur.
- Cetak hasil dengan String.format untuk format rupiah.

## Catatan
- Input golongan selain A/B/C dianggap tidak valid.
- Jam lembur negatif tidak valid; 0 jam diperbolehkan.
```// filepath: d:\UT\Semester 4\FST Tuweb dan Tugas\Algoritma dan Pemograman\Tugas 2\README.md
# Tugas 2 — Program Gaji Karyawan (Java)

Program sederhana untuk menghitung total penghasilan karyawan berdasarkan golongan (A/B/C) dan jam lembur.

## Fitur
- Input golongan karyawan: A, B, atau C.
- Input jam lembur (0, 1, 2, 3, 4, atau ≥5).
- Perhitungan gaji pokok sesuai golongan.
- Perhitungan gaji lembur berdasarkan persentase dari gaji pokok.
- Tampilan rincian gaji dengan format rupiah.

## Aturan Gaji
- Golongan:
  - A: Rp 5.000.000
  - B: Rp 6.500.000
  - C: Rp 9.500.000
- Lembur:
  - 0 jam: 0%
  - 1 jam: 30%
  - 2 jam: 32%
  - 3 jam: 34%
  - 4 jam: 36%
  - ≥5 jam: 38%

## Persyaratan
- Java JDK terpasang (versi 8+).
- Terminal/Command Prompt (Windows).

## Cara Menjalankan (Windows)
1. Buka folder project di VS Code.
2. Buka Terminal (Ctrl+`).
3. Kompilasi:
   ```
   javac GajiKaryawan.java
   ```
4. Jalankan:
   ```
   java GajiKaryawan
   ```

## Cara Pakai
- Masukkan golongan (A/B/C) saat diminta.
- Masukkan jumlah jam lembur (bilangan bulat).
- Program menampilkan rincian gaji dan total penghasilan.

## Contoh Interaksi
Input:
```
Masukkan golongan (A/B/C): B
Masukkan jam lembur: 3
```
Output:
```
--- Rincian gaji karyawan ---
Golongan: B
Gaji pokok: Rp 6,500,000
Jam lembur: 3 jam
Gaji lembur: Rp 2,210,000
----------------------------------
Total penghasilan: Rp 8,710,000
```

## Struktur File
- GajiKaryawan.java — Sumber kode utama (input, logika if-else, perhitungan, output).

## Penjelasan Singkat Kode
- Import Scanner untuk membaca input.
- Deklarasi variabel: golongan, jamLembur, gajiPokok, persenLembur, gajiLembur, totalGaji.
- If-else golongan menentukan gaji pokok.
- If-else jam lembur menentukan persentase lembur.
- Hitung gaji lembur = gajiPokok × persenLembur.
- Total = gajiPokok + gajiLembur.
- Cetak hasil dengan String.format untuk format rupiah.

## Catatan
- Input golongan selain A/B/C dianggap tidak valid.
- Jam lembur negatif tidak valid; 0 jam diperbolehkan.
