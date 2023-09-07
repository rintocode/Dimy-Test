DIMY TEKNOLOGI
PROGRAMMER QUIZ
 

Kategori soal yang tidak memiliki tanda bintang (*) tidak wajib untuk diisi, tetapi jika diisi akan menjadi nilai tambah
Warmup test*
1.	Dibawah ini terdapat beberapa link untuk melakukan tes dasar algoritma, test ini bisa dilakukan dengan bahasa apa saja (diutamakan Node Js, Go, Python, Java, Kotlin, PHP).
Test dilakukan menggunakan platform HackerRank (https://www.hackerrank.com), register atau login terlebih dahulu sebelum mengakses link dibawah. Kirimkan file code hasil test.
Berikut adalah beberapa link test yang harus dikerjakan :
a.	Simple Array Sum
https://www.hackerrank.com/challenges/simple-array-sum
b.	Compare the Triplets
https://www.hackerrank.com/challenges/compare-the-triplets
c.	A Very Big Sum
https://www.hackerrank.com/challenges/a-very-big-sum
d.	StairCase
https://www.hackerrank.com/challenges/staircase
Design pattern & System Optimization
1.	Aplikasi modern dituntut untuk banyak melakukan banyak task dalam suatu request, sebagai contoh ketika user melakukan register pada suatu aplikasi maka aplikasi tersebut harus mengirim email konfirmasi kepada user, atau memasukan user ke mailing list.
Kegiatan diatas bisa menyebabkan sistem membutuhkan waktu yang lebih untuk memproses semua task tersebut, sedangkan user tidak bisa menunggu terlalu lama sampai task tersebut selesai dilakukan.
Bagaimana solusi yang anda tawarkan untuk menangani hal tersebut ?

Code Knowledge & Optimization
1.	Apa fungsi dan kegunaan dari code refactoring ?
2.	Apakah komentar dalam kode berguna ?, sebagian orang menyarankan komentar dalam kode sebaiknya dihindari. Apakah anda setuju dengan hal tersebut ?, jelaskan alasannya.
3.	What makes good code good?

Web development
1.	Jelaskan tentang API versioning dan kegunaannya, dan bagaimana anda akan memanage API versioning pada Web Services ?
Database
1.	How would you explain the recent rise in interest in NoSQL?

Code collaboration & Team management
1.	How would you deal with legacy code?
2.	What is the biggest difference between Agile and Waterfall?
Software development knowledge*
1.	Why is writing software difficult? What makes maintaining software hard?

<--!///////2//////---->
DIMY TEKNOLOGI
PROGRAMMER FRONTEND QUIZ
 

Kategori soal yang tidak memiliki tanda bintang (*) tidak wajib untuk diisi, tetapi jika diisi akan menjadi nilai tambah
Warmup test*
1.	Pada link berikut terdapat tes dasar pengetahuan tentang HTML, kerjakan tes tersebut dan kirimkan screenshot hasil test. 
	Link test : https://www.w3schools.com/quiztest/quiztest.asp?qtest=HTML
2.	Pada link berikut terdapat tes dasar pengetahuan tentang CSS, kerjakan tes tersebut dan kirimkan screenshot hasil test. 
	Link test : https://www.w3schools.com/quiztest/quiztest.asp?qtest=CSS
Design pattern & System Optimization
1.	Jelaskan tentang local storage. Apakah anda pernah mengimplementasikan local storage ?, jika iya, coba jelaskan.
2.	Bagaimana anda akan menghandle aplikasi online agar masih bisa berjalan dan menyimpan progress user ketika situasi user terputus dengan internet
Use cases test*
1.	Buatkan aplikasi sederhana seperti gambar dibawah (menggunakan Vue atau React lebih diutamakan). Kirimkan link repository Github
Aturan dari aplikasi dibawah adalah sebagai berikut :
a.	Ketika tombol “New“ di klik maka aplikasi akan menambahkan row yang berisi product name, product price, quantity & total
b.	Ketika tombol “Delete” di klik maka row yang berada di sebelah tombol tersebut harus terhapus
c.	Tombol “Delete” hanya akan muncul ketika row lebih dari satu
d.	form total harus terisi otomatis ketika product price dan qty diedit
e.	Form total berisi hasil perhitungan product price * qty
f.	Form grand total berisi penjumlahan dari form total di setiap row
g.	Form qty tidak boleh kurang dari 1, jika kurang dari 1 maka harus memunculkan alert peringatan
h.	Form qty diset default menjadi 1 ketika pertama kali klik tombol “New”
 
Gambar 1


<--!///////3//////---->

DIMY TEKNOLOGI
PROGRAMMER BACKEND QUIZ
 

Kategori soal yang tidak memiliki tanda bintang (*) tidak wajib untuk diisi, tetapi jika diisi akan menjadi nilai tambah
Warmup test*
1.	Pada link berikut terdapat tes dasar pengetahuan tentang PHP, kerjakan tes tersebut dan kirimkan screenshot hasil test. 
	Link test : https://www.w3schools.com/quiztest/quiztest.asp?qtest=PHP
2.	Pada link berikut terdapat tes dasar pengetahuan tentang SQL, kerjakan tes tersebut dan kirimkan screenshot hasil test. 
	Link test : https://www.w3schools.com/quiztest/quiztest.asp?qtest=SQL
Design pattern & System Optimization
1.	Active-Record (https://guides.rubyonrails.org/active_record_basics.html) merupakan sebuah design pattern yang memungkinkan sebuah objects untuk memiliki fungsi Insert, Update, dan Delete, serta properties yang merepresentasikan kolom-kolom pada sebuah tabel dalam database.
Apakah anda pernah menggunakan Active-Record ?, jika iya pada library atau framework apa ? dan ceritakan opini serta pengalaman anda tentang limitasi dan batasan baik itu dari segi fungsi atau performansi dari Active-record.
Jika anda tidak pernah menggunakan Active-Record ceritakan alasannya.
Database
1.	How would you migrate an application from a database to another, for example from MySQL to PostgreSQL? If you had to manage that project, which issues would you expect to face?
2.	The so-called "N + 1 problem" is an issue that occurs when code needs to load the children of a parent-child relationship with ORMs that have lazy-loading enabled, and that therefore issues a query for the parent record, and then one query for each child record. How to fix it?
3.	How would you find the most expensive queries in an application?
4.	When would you use a document database like MongoDB instead of a relational database like MySQL or PostgreSQL?







Use cases test*
1.	Tabel dibawah merupakan gambaran tabel pada database yang digunakan pada sistem e-commerce
 
Gambar 1

Berdasarkan tabel diatas, buatkan tabel-tabel sederhana untuk menyimpan data transaksi (order), dengan ketentuan sebagai berikut :
a.	Satu transaksi bisa memiliki banyak produk
b.	Satu transaksi bisa memiliki banyak payment method
c.	Customer address pada transaksi harus mereferensi ke tabel customer_address

2.	Pada database dalam gambar 1 data antar tabel saling berelasi. Bagaimana solusi anda untuk menghandle kasus penghapusan data yang berelasi dengan tetap menjaga relevansi relasi antar data ?. Sebagai contoh jika data customer dihapus maka hal itu akan mengganggu pada relasi dengan tabel lainnya

3.	Buatlah API sederhana yang berfungsi untuk membuat data transaksi dengan mengimplementasikan desain database pada soal no 1.
Buatlah dengan bahasa atau framework apapun. Kirimkan link repository Github aplikasi tersebut.
4.	Buatkan unit test dari coding yang sudah dikerjakan




