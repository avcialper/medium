package com.avcialper.boxedunboxed

class Boxed {

    /**
     *      Boxed tipler, primitive tiplerin referans alarak tanımlanan halleridir. Yani bir sınıfın
     *      nesnesi olarak tanımlanırlar.
     *
     *      Java' da referans tip tanımlamak istersek bu tiplerin class hallerini kullanmamız gerekir.
     *      Yani int, double yerine Integer ve Double sınıflarını kullanmamız gerekir. Kotlin' de
     *      ise bir değişkenin tipini belirtirken zaten bu tipin sınıfını kullanıyoruz. O zaman
     *      Kotlin' de boxed bir değişken nasıl tanımlarız?
     *
     *      Cevap çok basit, değişkenlerimizi Nullable yaparak. Eğer bir değişkeni nullable olarak
     *      tanımlarsak, oluşturulan değişken arka planda referans tipli olarak tanımlanır.
     *
     *      Java' da nullable bir primitive tip tanımlamak istersek int, double kullanamayız, bunun
     *      yerine Integer ve Double sınıflarını kullanmamız gerekir. Kotlin' de ki nullable
     *      değişkenlerde bu sebepten arka planda referans tipli olarak tanımlanırlar.
     */

    val intNumber: Int = 357
}

fun main() {

    /**
     *      Aynı işlemi boxed değerlerle yaptığımızda farklı bir sonuçla karşılaşıyoruz. == operatörü
     *      ile yapılan karşılaştırmada true değeri alıyoruz çünkü iki değişken değer bakımından
     *      birbirlerine eşittir. Ancak, referans karşılaştırması yaptığımızda false sonucu alıyoruz.
     *      Bunun nedeni, her yeni boxed değer için farklı bir nesne oluşturulmasıdır. Bu nedenle,
     *      aynı değere sahip olsalar bile farklı referanslara sahip olabilirler.
     */

    val a: Int = 456
    val boxedA: Int = a
    val boxedB: Int = a

    println(boxedA == boxedB)   //  true
    println(boxedA === boxedB)  //  false
}