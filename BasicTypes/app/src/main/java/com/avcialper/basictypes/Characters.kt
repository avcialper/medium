package com.avcialper.basictypes

fun main() {

    /**
     *    Karakterler hafızada 16 bit alan kaplarlar.
     *    Char ile tanımlanırlar.
     *    Tek tırnakların arasına harf, sayi, escape char ya da unicode yazarak kullanılır.
     */

    val firstCharOfKotlin = 'K'
    val firstCharOfName: Char = 'A'

    /**
     *      Karakterin ASCII tablosu karşılığını bulma.
     */
    val codeOfChar = firstCharOfKotlin.code     //  75

    /**
     *      Char olarak tanımlanan bir sayının (rakam) Int olarak değiştirilmesi.
     */
    val charOfNumber = '5'
    val charToInt = charOfNumber.digitToInt()   //  5

    /**
     *      Unicode kullanımı.
     *      Yine tek tırnak içerisine \u ile başlayıp kodu yazarak kullanılabilir.
     */
    val heart = '\u2665'        //  ♥

    /**
     *      Escape Characters kullanımı.
     *      \t – Tab
     *      \b – Backspace
     *      \n – New line (LF)
     *      \r – Carriage return (CR)
     *      \' – Single quotation mark
     *      \" – Double quotation mark
     *      \\ – Backslash
     *      \$ – Dollar sign
     */

    println("Hello\tWorld!")    //  Hello   World!

    println("Hello\bWorld!")    //  HelloWorld!

    println("Hello\nWorld!")    //  Hello
    //  World!

    println("Hello\rWorld!")    //  World!
    //  World!

    println("Hello\'World!")    //  Hello'World!

    println("Hello\"World!")    //  Hello"World!

    println("Hello\\World!")    //  Hello\World!

    println("Hello\$World!")    //  Hello$World!
}