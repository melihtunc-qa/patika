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
