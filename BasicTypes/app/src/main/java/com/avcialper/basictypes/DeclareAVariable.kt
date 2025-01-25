package com.avcialper.basictypes

fun main() {

    /**
     *  Başlangıç değeri ataması zorunlu.
     *  Sonrasında yeni değer atanamaz.
     *  Immutable değil read-only' dir.
     */
    val age = 20
    // age = 21     // Yeniden atama yapılamaz.

    /**
     *  Tipi belirtildiği zaman başlangıç değeri verilmek zorunda değildir.
     *  Sonrasında yeni değer ataması yapılabilir.
     */
    var height = 178
    height = 180
    //  height = "hegith"   //  Farklı türde veri ataması yapılamaz.

    //  Tipi belirtildiği için başlangıç değeri verilmek zorunda değildir.
    //  Eğer değişken üzerinde işlem yapılmak istenirse en az bir kere değer ataması yapılmalı.
    var weight: Double
    weight = 85.0

    //  val neden read-only?
    val rectangle = Rectangle(5, 10)
    println(rectangle.area) //  50

    rectangle.width = 8
    println(rectangle.area) //  80

    // Type Inference
    val name = "Alper"      // String
    val isStudent = true    // Boolean

}


class Rectangle(var width: Int, var height: Int) {

    /**
     *  Değişkenler için aslında arka planda get ve set fonksiyonları yazılır. Bu fonsiyonları değişkenleri tanımlarken
     *  bizlerde yazabiliriz.
     *  Burada val ile belirtilen area değişkeninin get fonksiyonunu width ve height değişkenlerine bağlı kıldık. Bu
     *  sayede bu değişken her çağrıldığında width ve height' ın güncel değerlerini kullanılır. Eğer biz bu değerleri
     *  güncellersek val değişkeni farklı sonuçlar verecektir.
     */

    val area: Int
        get() = width * height

}