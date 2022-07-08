# Assignment2-Katalon

Nama: Gusti Fahmi Fadhila
Kode Peserta: KSAT006ONL012

Langkah-Langkah dalam membuat automated API test di katalon:
1. Buat Object Repository baru (klik kanan pada Object Repository -> New -> Web Service Request)
2. Masukkan URL dan method
3. Jalankan dengan klik Test Request, maka akan muncul response-nya
4. Tambahkan verifikasi sesuai dengan response yang dihasilkan. Yang pasti ada pada semua api adalah memverifikasi status code, yaitu 200 untuk setiap method GET dan DELETE serta 201 untuk setiap method POST. Lalu untuk yang mengembalikan response 1 item saja (Create New ... dan Get ... By Id), maka akan memverifikasi setiap fields dari item tersebut. Sedangkan untuk yang mengembalikan berupa array (Get All ...), maka memverifikasi semua field dari 10 item yang berbeda.
5. Buat sebuah test case dengan klik Add to New Test Case
6. Pada Test Case tersebut ubah dari Send Request menjadi Send Request And Verify
7. Jika semua test case dalam satu grup endpoint yang sama sudah selesai (misal /albums), maka jadikan satu test suite

API yang ditest adalah sebagai berikut:
1. Albums
   1) http://jsonplaceholder.typicode.com/albums POST (Create New Album)
   2) http://jsonplaceholder.typicode.com/albums/1 DELETE (Delete Album)
   3) http://jsonplaceholder.typicode.com/albums/1 GET (Get Album By Id)
   4) http://jsonplaceholder.typicode.com/albums GET (Get All Albums)
   5) http://jsonplaceholder.typicode.com/albums?userId=1 GET (Get All Albums By User Id)
2. Comments
   1) https://jsonplaceholder.typicode.com/comments POST (Create New Comment)
   2) https://jsonplaceholder.typicode.com/comments/1 DELETE (Delete Comment)
   3) http://jsonplaceholder.typicode.com/comments GET (Get All Comments)
   4) http://jsonplaceholder.typicode.com/comments?postId=1 (Get All Comments By Post Id)
   5) https://jsonplaceholder.typicode.com/comments/1 GET (Get Comment By Id)
3. Photos
   1) https://jsonplaceholder.typicode.com/photos POST (Create New Photo)
   2) https://jsonplaceholder.typicode.com/photos/1 DELETE (Delete Photo)
   3) http://jsonplaceholder.typicode.com/photos GET (Get All Photos)
   4) http://jsonplaceholder.typicode.com/photos?albumId=1 GET (Get All Photos By Album Id)
   5) https://jsonplaceholder.typicode.com/photos/1 GET (Get Photo By Id)
4. Posts
   1) https://jsonplaceholder.typicode.com/posts POST (Create New Post)
   2) https://jsonplaceholder.typicode.com/posts/1 DELETE (Delete Post)
   3) http://jsonplaceholder.typicode.com/posts GET (Get All Posts)
   4) https://jsonplaceholder.typicode.com/posts?userId=1 GET (Get All Posts By User Id)
   5) http://jsonplaceholder.typicode.com/posts/1 GET (Get Post By Id)
5. Todos
   1) http://jsonplaceholder.typicode.com/todos POST (Create New Todo)
   2) http://jsonplaceholder.typicode.com/todos/1 DELETE (Delete Todo)
   3) http://jsonplaceholder.typicode.com/todos GET (Get All Todos)
   4) http://jsonplaceholder.typicode.com/todos?userId=1 GET (Get All Todos By User Id)
   5) http://jsonplaceholder.typicode.com/todos/1 GET (Get Todo By Id)
6. Users
   1) http://jsonplaceholder.typicode.com/users POST (Create New User)
   2) http://jsonplaceholder.typicode.com/users/1 DELETE (Delete User)
   3) http://jsonplaceholder.typicode.com/users GET (Get All Users)
   4) http://jsonplaceholder.typicode.com/users/1 GET (Get User By Id)