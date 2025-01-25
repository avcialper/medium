package com.avcialper.boxedunboxed

fun main() {

    /**
     *      Bütün boxed değerlerde aynı sonuçları alacağımızı düşünebiliriz, ancak burada ince bir ayrıntı var. Eğer
     *      boxed değişkenin değeri, byte değer aralığında yani -128 ile 127 arasında ise, bu değişkenler referans
     *      olarak aynı nesneyi işaret ederler. Bu durum JVM tarafında yapılan özel optimizasyonlardan kaynaklanır.
     *
     *      Burada değişkenler byte, short, int ve long değerler olabilirler, float ve double için bu durum geçerli
     *      değildir. Ayrıca karşılaştırma sırasında iki değişkenin de aynı tipte olması gerekir, aynı olmazlarsa IDE
     *      hata gösterecektir.
     */

    val numberOne: Int = 120
    val boxedNumberOne: Int = numberOne
    val boxedNumberTwo: Int = numberOne

    println(boxedNumberOne === boxedNumberTwo)
}