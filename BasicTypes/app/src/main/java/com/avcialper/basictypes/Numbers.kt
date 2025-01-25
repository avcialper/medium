package com.avcialper.basictypes

fun main() {

    /**
     *      Byte    8 bit
     *      Short   16 bit
     *      Int     32 bit
     *      Long    64 bit
     *
     *      Default olarak signed tanımlanmışlardır.
     *
     *      Float   32 bit
     *      Double  64 bit
     *
     *      Double sayılar, Float sayılara göre daha büyük değerler ve nokta' dan sonra daha fazla basamak içerebilirler.
     */

    val byteNumber: Byte = 100
    val maxByte: Byte = Byte.MAX_VALUE      //  127
    val minByte: Byte = Byte.MIN_VALUE      //  -128

    val shortNumber: Short = 16784
    val maxShort: Short = Short.MAX_VALUE   //  32767
    val minShort: Short = Short.MIN_VALUE   //  -32768

    val intNumber: Int = 1000000
    val maxInt: Int = Int.MAX_VALUE         //  2147483647
    val minInt: Int = Int.MIN_VALUE         //  -2147483648

    val longNumber: Long = 1578423684216
    val maxLong: Long = Long.MAX_VALUE      //  9223372036854775807
    val minLong: Long = Long.MIN_VALUE      //  -9223372036854775808

    println("maxByte: $maxByte")
    println("minByte: $minByte")
    println("maxShort: $maxShort")
    println("minShort: $minShort")
    println("maxInt: $maxInt")
    println("minInt: $minInt")
    println("maxLong: $maxLong")
    println("minLong: $minLong")

    /**
     *      Sayılar istersek unsigned olarak da tanımlayabiliriz.
     *      Bunun için UByte, UShort, UInt ve ULong sınıflarını kullanabiliriz.
     *      UFloat ve UDouble sınıfları bulunmaz, bu da demek oluyorki unsigned floating-point sayılar tanımlayamayız.
     *      Atama yapılırken u ifadesini sayının sonuna eklememiz gerekir.
     *      Type inference yine sayının Int aralığında mı yoksa değil mi diye kontrol eder. Ya UInt ya da ULong değer verir.
     */

    val uByteNumber: UByte = 255u
    val uShortNumber: UShort = 15000u
    val uIntNumber: UInt = 125623u
    val uLongNumber: ULong = 123456789u
    val uLongNumber2: ULong = 123456789uL   // veya UL

    val uIntNumber2 = 123u
    val uLongNumber3 = 123456789123456u

    val uByteMax: UByte = UByte.MAX_VALUE   // 255
    val uByteMin: UByte = UByte.MIN_VALUE   // 0

    val underScore = 1_000_000_000    // 1000000000

    val pi = 3.14
    val floatPI = 3.14f     // ya da F
    val doubleNumber: Double = 1.0
    val floatNumber: Float = 1f

    val hexNumber = 0xFF            // Hexadecimal kullanım,    255
    val binaryNumber = 0b00011101   // Binary kullanım,         29
    println(binaryNumber)
}