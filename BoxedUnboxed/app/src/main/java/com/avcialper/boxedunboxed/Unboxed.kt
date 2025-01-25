package com.avcialper.boxedunboxed

class Unboxed {

    /**
     *      Unboxed tipler, aslında hepimizin bildiği temel veri tipleridir (primitive types) ve temel veri tiplerinin
     *      en önemli özelliği doğrudan bellekte saklanmalarıdır. Yani herhangi bir sınıftan referans almazlar.
     *
     *      Java' da primitive tipler int, double vb. şeklinde tanımlanırlar ve herhangi bir referansları bulunmaz.
     *      Kotlin' de ise int, double keyword' leri bulunmaz, değişkenler Int, Double gibi sınıflardan referans alırlar.
     *      Ancak yapılan optimizasyonlar sonucunda Java koduna dönüştürülürken primitive type olarak tanımlanırlar.
     */

    val intNumber: Int = 357

}

fun main() {

    val a: Int = 159
    val unboxedA: Int = a
    val unboxedB: Int = a

    /**
     *      Bu örnek görüldüğü üzere unboxed olan iki değişken hem değer hem de referans bakımından birbirlerine eşitler.
     *      Burada değişkenlere a ile değer atamak yerine her ikisine de 159 değerini vermiş olsaydık yine aynı sonucu
     *      almış olurduk.
     */
    println(unboxedA == unboxedB)   //  true
    println(unboxedA === unboxedB)  //  true
}