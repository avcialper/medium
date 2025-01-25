package com.avcialper.basictypes

fun main() {
    /**
     *      Kotlin' de implicit type conversion yoktur. Yani türler arası otomatik dönüşüm sağlanamaz.
     *      Explicit type conversion vardır. Explicit type conversion için hazırlanmış özel fonksiyonlar kullanılamlıdır.
     */
    val byteNumber: Byte = 10
    //  val byteToInt: Int = byteNumber     // Hata verir.

    val byteToInt: Int = byteNumber.toInt()
    val byteToDouble: Double = byteNumber.toDouble()

    val intNumber = 10
    val intToByte: Byte = intNumber.toByte()

    /**
     *      Tür dönüşümü sırasında sayıların değer aralıkları dikkate alınmalıdır.
     *      Eğer alt bir tipe dönüştürmek istersek ve sayı değer aralığının dışında ise istenilen sonuç elde edilemez.
     */

    val number = 123456
    val byteN: Byte = number.toByte()
}