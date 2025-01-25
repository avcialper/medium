package com.avcialper.basictypes

fun main() {
    /**
     *      Aynı türden ya da belirtilen türün alt türlerinden, sabit sayıda veri tutan veri yapılarıdır.
     *      En sık kullanılan versiyonu Object-Typed Array' lerdir, Array sınıfı ile temsil edilirler.
     *      Eğer array içerisinde tutulacak verinin tipi primitive tipte ise, bu durumda Primitive-Typed Array' ler
     *      kullanılmalıdır.
     *
     *      Burada referans tip ile primitive tip arasındaki performans farkı konuları etki etmektedir.
     *
     *      ByteArray(byte[]), ShortArray(short[]), IntArray(int[]), LongArray(long[])
     *      DoubleArray(double[]), FloatArray(float[]), BooleanArray(boolean[]), CharArray(char[])
     *
     *      Array oluşturmak için;
     *      arrayOf(), arrayOfNulls() ve emptyArray() fonksiyonları
     *      Array sınıfı kullanılabilir.
     */

    /**
     *      Eğer arrayOf() ile array oluşturulurken içerisine değer yazılırsa tip belirtilmesine gerek yoktur.
     *      Ama içerisine değer vermeden tanımlama yapmak istersek arrayOf<type>() şeklinde kullanılabilir.
     */

    //  Bütün tipler için array tanımlaması yapılabilir.
    val simpleArray: Array<Int> = arrayOf(1, 2, 3)
    val stringArray = arrayOf("John", "Jane", "Joe")

    //  Karışık tipte veri içeren array.
    val mixedArray = arrayOf(3.14, false, 20, "kotlin")
    val mixedArray2 = arrayOf<Any>(3.14, false, 20, "kotlin")

    /**
     *      İçerisinde istenilen sayıda null barındırdan bir array tanımlamak için arrayOfNulls<type>(size) kullanılabilir.
     *      Burada tip ve içerisindeki eleman sayısı verilmelidir.
     */
    //  Nullable Int tipinde 3 adet null veri içeriyor.
    val arrayOfNulls = arrayOfNulls<Int>(3)
    // Array, String fotmatında yazılmak istenirse joinToString() kullanılır.
    println(arrayOfNulls.joinToString())    //  null, null, null

    /**
     *      İçerisinde hiçbir değer bulunmayan bir array oluşturmak için emptyArray<type>() fonksiyonu kullanılır.
     *      Array içerisinde hiç eleman olmadığı için içerisinde herhangi bir yere ulaşılamaz.
     */
    val emptyArray = emptyArray<String>()

    /**
     *      Array sınıfı ile array oluşturulmak istenirse, yine tip ve eleman sayısı belirtilmeli. Burada süslü parantez
     *      içerisinde yapılan işlemlerin son satırı array' in bir elemanının temsil eder, it değeri array' in
     *      mevcut index' ini temsil eder.
     */
    val cArray = Array<Char>(5) {
        it.digitToChar()
    }
    println(cArray.joinToString())

    /**
     *      Array' ler başta dediğimiz gibi sabit büyüklüklerdedirler. Ama aynı string' lerde olduğu gibi bir array' i var
     *      ile tanımlayarak ekleme yapabiliyoruz. Bu ekleme sonucunda mevcut array' imiz güncellenmiyor, yapılan
     *      ekleme bize yeni bir array nesnesi veriyor. Değişkenimiz bu nesnenin referansını tutuyor.
     */
    var citiesArray = arrayOf("İstanbul", "Antalya", "Ankara", "İzmir")
    citiesArray += "Hatay"
    citiesArray += arrayOf("Konya", "Isparta")
    println(citiesArray.joinToString()) //  İstanbul, Antalya, Ankara, İzmir, Hatay, Konya, Isparta

    /**
     *      arrayOf() ile tanımlanış array' leri Primitive-Typed Array yapamak için hazırlanan fonksiyonları kullanabiliriz.
     *      Burada array içerisinde değerlerin aynı tipte ve primitive olmasına dikkat edilmeli.
     */
    val numberArray = arrayOf(1, 2, 3, 4)
    val intArray = numberArray.toIntArray()
    val intArray2 = intArrayOf(1, 2, 3, 4)  //  primitive-typed array

    /**
     *      Array içerisindeki bir elemana erişmek için index' ler kullanlır. Index değeri 0 dan başlayarak array' in
     *      eleman sayısının bir eksiğine kadar ilerler. Bu alan dışına çıkılması uygulamanın çökmesine neden olur.
     *
     *      Array elemanına ulaşmak için array[index] ya da array.get(index) kullanılabilir. array[index] in kullanılması önerilir.
     *      Array' in elemanını güncellemek için array[index] = value ya da array.set(index, value) kullanılabilir
     */
    val sampleArray = arrayOf(0, 1, 2, 3, 4)
    val firstElement = sampleArray.get(0)   //  0
    val lastElement = sampleArray[4]        //  4
    sampleArray[0] = 10
    sampleArray.set(4, 99)
    println(sampleArray.joinToString()) // 10, 1, 2, 3, 99

    /**
     *      val ile tanımlanmış bir array'in herhahngi bir indexindeki değer değiştirilebilir.
     *      val indexdeki değerlerin değişimine karışmaz.
     *      Ancak ilgili diziyi başka bir dizi ile eşitlememize izin verilmez.
     *      Bunun için tanımlamayı var ile değiştirmemiz gerekir.
     */
    val awesomeArray = arrayOf(1, 2, 3, 4)
    awesomeArray[0] = 99
    //  awesomeArray += 4       // Hata.

    var fooArray = arrayOf(1, 2, 3, 4)
    fooArray[0] = 20
    fooArray += 5

    /**
     *      vararg ile istenilen türden farklı sayılarda veri alabiliriz.
     *      Eğer vararg'a denk gelecek şekilde bir array kullanmak istiyorsak "spread" "*" operatörü kullanırız.
     *      Spread operatorü verdiğiniz array'in elemanlarının her birini bir variable olacak şekilde bir parametre olarak passlar.
     */
    val lettersArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    printAllLetters(*lettersArray, 'f', 'g')    //  a b c d e f g

    /**
     *      Array'leri karılaştırırken == operatörü kullanılamaz. == operatörü o array'lerin referans object'lerini
     *      karşılaştırır.
     *      contentEquals ya da contentDeepEquals kullanmanız lazım.
     */
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(1, 2, 3)

    if (array1 == array2) {
        println("eşit")         // Referanslar farklı, her zaman false verir.
    } else {
        println("eşit değil")
    }

    if (array1.contentEquals(array2)) {
        println("eşit")         //  Elemanlar aynı, bu alana girer.
    } else {
        println("eşit değil")
    }

    /**
     *      .sum() -> toplama işlemi; sadece number typed arraylar ile çalışır.
     *      .shuffle() ->  random karıştırma; elemanları random şekilde yer değiştirir
     */
    val intArray1 = intArrayOf(1, 2, 3)
    val sumOfArray = intArray1.sum()
    intArray1.shuffle()

    /**
     *      Array'ler List'e ve Set'e dönüştürülebilir.
     */

    val sampleCharArray = arrayOf("a", "b", "c", "c")
    println(sampleCharArray.toSet())    // Set te tekrar eden elemanlar kaldırılır
    println(sampleCharArray.toList())

    /**
     *      Bir array Map'e de dönüştürülebilir. Ancak bunun için array'in özel olarak Pair<K,V> formunda olması lazım.
     */
    // Pair yapısı
    val cities = arrayOf(34 to "Istanbul", 35 to "Izmir", 7 to "Antalya")
    println(cities.toMap())     //  {34=Istanbul, 35=Izmir, 7=Antalya}
}

fun printAllLetters(vararg letters: Char) {
    for (letter in letters) {
        print("$letter ")
    }
}