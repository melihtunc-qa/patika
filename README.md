# Proje 1 : Insertion Sort
Proje 1
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.
.



[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

# Insertion Sort Projesi çözümleri

Öncelikle, verilen diziyi Insertion Sort algoritması ile sıralayalım:

Dizi: [22, 27, 16, 2, 18, 6]

Adım: [22, 27, 16, 2, 18, 6] (Başlangıçta sıralı alt dizi sadece ilk elemanı içerir.)
Adım: [22, 27, 16, 2, 18, 6] (27, sıralı alt dizinin sonuna eklenir ve alt dizi sıralanır.)
Adım: [16, 22, 27, 2, 18, 6] (16, sıralı alt dizinin içine eklenir ve alt dizi sıralanır.)
Adım: [2, 16, 22, 27, 18, 6] (2, sıralı alt dizinin içine eklenir ve alt dizi sıralanır.)
Adım: [2, 16, 18, 22, 27, 6] (18, sıralı alt dizinin içine eklenir ve alt dizi sıralanır.)
Adım: [2, 6, 16, 18, 22, 27] (6, sıralı alt dizinin içine eklenir ve alt dizi sıralanır.)
Bu şekilde dizi Insertion Sort algoritması kullanılarak sıralanmış olur.

Big-O Gösterimi: Insertion Sort'ın worst-case, average-case ve best-case time complexity'si O(n^2) şeklindedir.

Time Complexity sorusu:
Sıralanan dizi: [2, 6, 16, 18, 22, 27]
18 sayısı, dizinin ortasında (n/2) bulunmaktadır. Bu nedenle Average Case'e girer.

Şimdi de Selection Sort algoritmasıyla sıralanacak olan [7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin ilk 4 adımına bakalım:

Dizi: [7, 3, 5, 8, 2, 9, 4, 15, 6]

Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6] (Minimum elemanı seçip dizinin başına yerleştiririz.)
Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6] (Minimum elemanı seçip dizinin ikinci sırasına yerleştiririz.)
Adım: [2, 3, 4, 5, 8, 7, 9, 15, 6] (Minimum elemanı seçip dizinin üçüncü sırasına yerleştiririz.)
Adım: [2, 3, 4, 5, 8, 7, 9, 15, 6] (Minimum elemanı seçip dizinin dördüncü sırasına yerleştiririz.)
Bu şekilde dizi Selection Sort algoritması kullanılarak ilk 4 adım sonunda sıralanmış olur.

# Proje 2 : Merge Sort

[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.

# Merge Sort Proje Çözümleri :

Verilen diziyi Merge Sort algoritması ile sıralayalım:

Dizi: [16, 21, 11, 8, 12, 22]

Adım: [16, 21, 11] | [8, 12, 22] (Diziyi ikiye böleriz.)
Adım: [16] | [21, 11] | [8] | [12, 22] (Her alt diziyi tek elemanlı alt dizilere ayırırız.)
Adım: [16] | [11, 21] | [8] | [12, 22] (Alt dizileri sıralı olarak birleştiririz.)
Adım: [11, 16, 21] | [8, 12, 22] (Tüm alt dizileri birleştiririz.)
Bu şekilde dizi Merge Sort algoritması kullanılarak sıralanmış olur.

Big-O Gösterimi: Merge Sort'ın time complexity'si O(n log n) şeklindedir.

# Proje 3 : Binary Search Tree 
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

# Binary Search Tree  Proje Çözümleri :

Verilen diziyi kullanarak Binary Search Tree (BST) oluşturalım:

Dizi: [7, 5, 1, 8, 3, 6, 0, 9, 4, 2]

Adım: İlk eleman olan 7, ağacın köküdür.

BST: [7]
Adım: 5, 1, 8, 3, 6, 0, 9, 4, 2 sırasıyla eklenir.

5, 7'nin solundadır.
8, 7'nin sağındadır.
BST: [7]
/
[5] [8]
Adım: 1, 3, 0, 4, 2 sırasıyla eklenir.

1, 5'in solundadır.
3, 5'in sağındadır.
0, 1'in solundadır.
4, 3'ün sağındadır.
2, 1'in sağındadır.
BST: [7]
/
[5] [8]
/ |
[1][3] [0]
/
[2] [4]
Adım: 9 eklenir.

9, 8'in sağındadır.
BST: [7]
/
[5] [8]
/ | \
[1][3] [0] [9]
/
[2] [4]
Bu şekilde verilen dizi ile oluşturulan Binary Search Tree'nin aşamalarını göstermiş olduk.








