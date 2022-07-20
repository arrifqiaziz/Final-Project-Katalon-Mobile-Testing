# Final-Project-Katalon-API-Testing
Final Project for Automated Testing with Katalon Studio in BTDP 2022 with Hacktiv8 as Learning Partner

## Informasi Dasar
Aplikasi Mobile Testing  (com.example.mikebanks.bankscorpfinancial) adalah sebuah Final Project dari `BFI Technology Development Program (BTDP) feat Hactiv8` dengan topik `Automated Testing with Katalon`, aplikasi ini terfokus pada bagaimana cara kerja Aplikasi Mobile dengan melakukan testing pada semua fitur, yang dibuat oleh

Nama		                 : `Arrifqi Aziz Ardhiansyah`\
Kode Peserta             : `KSAT006ONL009`\
Dokumentasi setiap Sesi  : [`Repository Bootcamp`](https://github.com/arrifqiaziz/BTDP-Hacktiv8-2022)\
Final Project Website    : [`Repository FP Website`](https://github.com/arrifqiaziz/Final-Project-Katalon-Website-Testing)\
Final Project Mobile     : [`Repository FP Mobile`](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing)\
Final Project API        : [`Repository DP API`](https://github.com/arrifqiaziz/Final-Project-Katalon-API-Testing)

---

# Panduan Penggunaan Aplikasi

## Requirement yang harus disipkan sebelum running aplikasi ini adalah :
- Menggunakan `Bahasa Groovy` based `Katalon Studio versi 8.3.5`
- Testing dilakukan pada Mobile yaitu [`App Bank Demo`](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing/tree/main/App)
- Testing dilaksanakan dengan Emulator [`Genymotion`](https://www.genymotion.com/) dengan Virtual Device `Google Nexus 6` Andorid 8.0 API 26 QHD

## Document Test Plan
Sebelum pelaksanaan testing, dibuat dokumen Test Plan dan Test Plan Scenario untuk mendokumentasikan perubahan testing dan pedoman dalam melakukan testing\
Yang dapat dilihat di [Document Test Plan](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing/tree/main/Test%20Plan)

## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `17 Test Case` dengan hasil :
```
16 Passed
1 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `94,12% Passed`

## IF ELSE Condition
Pada testing ini juga dimasukan satu test case yang berisi `IF ELSE CONDITION`, yaitu pada `Test Case Setting`
```
if (Mobile.verifyElementExist(findTestObject('Header/Setting - App Settings'), 0)) {
    Mobile.tap(findTestObject('Header/Setting - App Settings'), 0)

    Mobile.verifyElementNotExist(findTestObject('Header/Verify Setting'), 1)
} else {
    Mobile.verifyElementExist(findTestObject('Header/Verify Setting'), 1)
}
```

## Data Driven Test
Pada testing ini juga dimasukan satu test case yang berisi `Data Driven Test` yaitu pada `Test Case Register With DDT`\
Dokument DDT dapat diakses pada [`DDT Test File`](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing/tree/main/DDT%20File)\
Konsep DDT adalah memungkinkan untuk mengisi nilai dari vaiabel dari data yang bersumber pada Data File yaitu 'Data Register With DDT', tanpa harus di input manual satu-satu\
Data File dapat di generate dari sumber external seperti `DBMS` ataupun file seperti `.xls`, `.csv` pada kasus ini digunakan data dari File Excel `Data DDT Register.xlsx`, yang memiliki data :

firstname | lastname | country | username | password | confirm_password
----- | ----- | ----- | ----- | ----- | -----
Udin | Sirojudin	 | India	 | udin	 | udin123 | 	udin123
Ranger | 	Merah | 	Amerika	 | rangermerah	 | merah123 | 	merah123
Roronoa | 	Zoro | 	Jepang	 | zoro | 	zoro3	 | zoro3
Vladimir | 	Putin	 | Rusia | 	putin | 	uraaaaa | 	uraaaaa
Lionel | 	Messi | 	Argentina | 	lm10 | 	goat | 	goat

Pada `TS Register With DDT` dipanggil `Test Case Register With DDT` lalu dilakukan `Data Binding`, untuk mengkoneksikan antara `Variabel` dalam Test Case dengan `Column` pada Data File.
```
Variable firstname -> Column email
Variable lastname -> Column password
Variable country -> Column country
Variable username -> Column username
Variable password -> Column password
Variable confirm_password -> Column confirm_password
```
Sehingga pada pelaksanaan testing, column dalam Data File dapat di jalankan secara otomatis


## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS Account
TS Header
TS Register With DDT
TS Register, Login and Logout
TS Transaction
```

## Screenshot
Screenshot Testing hasil testing tidak dimasukan kedalam readme agar rapih\
Jika ingin melihat screenshot silahkan klik di [Screenshot Testing](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing/tree/main/Screenshot)




# Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)
