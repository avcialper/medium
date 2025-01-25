package com.avcialper.basictypes

import java.util.Locale

fun main() {

    /**
     *      Çift tırnak içerisinde tanımlanan karakter bütünüdür.
     *      Her karakter başına 16 bit alan kaplar.
     */
    val name: String = "Alper"

    /**
     *      Index ile içerisindeki her bir karaktere doğrudan erişilebilir.
     *      Index değeri, sıfırdan başlar ve karakter sayısının bir eksiğine kadar gider.
     */
    val kotlin = "kotlin"

    // İlk karakteri alma
    val firstCharOfString = kotlin[0]
    val firstCharOfString2 = kotlin.first()
    val firstCharOfString3 = kotlin[kotlin.indices.first]

    // Son karakteri alma
    val lastCharOfString = kotlin[kotlin.length - 1]
    val lastCharOfString2 = kotlin[kotlin.lastIndex]
    val lastCharOfString3 = kotlin.last()
    val lastCharOfString4 = kotlin[kotlin.indices.last]

    val charOfKotlin = kotlin[2]    //  t

    //  IndexOutOfBoundsException, index değeri karakter sayısından fazla olduğu için hata verir.
    //  val charOfKotlin2 = kotlin[10]

    /**
     *      String' ler immutable' dır. Yani ilk değer ataması yapıldıktan sonra tekrardan bir değer ataması
     *      yapılamamaktadır. var ile tanımlanan String' e yeni değer ataması yapılabiliyor gibi görünebilir ama bu
     *      atama işlemi mevcut değişkeni korumuyor, aksine atadığımız değer ile yeni bir String oluşturuluyor.
     *      Değişken, yeni oluşturulan String nesnesini işaret ediyor.
     */
    var username = "kotlinuser"
    username = "awesomeuser"

    /**
     *      String ifadeleri birleştirme için + operatörü kullanılabilir. Birden fazla String ifadeyi veya diğer tipte
     *      verilerle birleştirmek içinde kullanılabilir.
     *      String' ten farklı veri tipleri ile birleştirme yapılırken, String ifadenin başta olmasına dikkat edilmeli.
     *      Aksi halde hata meydana gelir.
     */
    val stringAndNumbers = "numbers " + (1 + 2 + 3)     //  numbers 6
    val stringAndNumbers2 = "numbers " + 1 + 2 + 3      //  numbers 123
    //  val stringAndNumbers3 = 1 + " numbers " + 1 + 2 + 3      //  Hata.

    /**
     *      String template
     *      String ifade içerisine istenilen değeri eklememizi sağlar.
     *      $ ile direkt eklenebilir. Eğer değiişkenin farklı bir özelliğine erişmek istenirse
     *      (değişkenin bir fonksiyonu gibi) ${} şeklince kullanılabilir.
     */
    val love = "love"
    val templateString = "made with ${love}"    // made with love
    val templateString2 = "length of \"love\": ${love.length}"  // length of "love": 4

    /**
     *      3 tane çift tırnak kullanarak Raw String (Multiline String) oluşturulabilir.
     *      Raw String'ler IDE'ye nasıl yazılıyorsa öyle kullanılır. Hizalamada bozulma olmaz.
     *      trimIndent() fonksiyonu ile bu Raw String'in kenar boşluklarını silebiliriz.
     *      Bu silme işlemi yapılırken tüm satırlardaki en soldaki karakteri baz alarak silme işlemini sağlar.
     */
    val rawTree = """
          *
         ***
        *****
    """.trimIndent()
    println(rawTree)

    /**
     *      trimMargin(marginPrefix) ise verilen karakter ne ise, String satırlarındaki o karaktre kadar olan kısmı siler.
     *      Yukarıdan farklı olarak bu karakter tek bir satirda ise sadece o satırın, o karaktere kadar olan kısmı silinir.
     */
    val rawTreeTrimMargin = """
           $    *
      $        ***
          $   *****
    """.trimMargin("$")
    println(rawTreeTrimMargin)

    /**
     *      Raw String içerisinde direkt olarak normal String' lerde kullanılan escape character' leri \ (backslash)
     *      ile kullanamıyoruz. Escape character kullanmak istersek bunu ${""} içerisinde belirtmeliyiz.
     */
    val madeWithLove = """
        made${"\t"}with${"\t"}love
    """.trimIndent()
    println(madeWithLove)

    /**
     *      String.format(), belirli bir String içinde yer tutucuları kullanarak belirtilen alanlara değerlerin
     *      yerleştirilmesini sağlar ve bu işlem bize yeni bir String üretir. Yer tutucular, formatlama belirtmeleriyle
     *      tanımlanır ve bu belirtmeler, değiştirilecek değerlerin nasıl biçimlendirileceğini kontrol eder.
     *
     *      %s -> String için
     *      %d -> Tam sauı (Integer) için
     *      %f -> Kayan noktalı sayı (Float/Double) için
     *      %n -> Yeni bir satıra geçmek için (platform bağımsız)
     */
    val intVal = 10
    val intFormat = String.format("Integer Val: %d", intVal)    // Integer Val: 10

    val doubleVal = 3.14159265359
    val doubleFormat = String.format("Double Val: %.2f", doubleVal) //  Double Val: 3.14

    val stringVal = "kotlin"
    val stringFormat = String.format("String Val: %S", stringVal)   //  String Val: KOTLİN

    val concatMessage =
        String.format("Int %d, String %s", intVal, stringVal)   // Int 10, String kotlin

    /**
     *      Format işlemini bir dile göre de yapabiliriz. Örneğin Türkiye' de ve Amerika' da sayıların ondalık kısmı
     *      farklı yazılır.
     */
    val price = 123456.789
    val formattedPrice = String.format(Locale.US, "%,.2f", price)
    println(formattedPrice)

    // Kendi locale' imizi oluşturma
    val localeTR = Locale("tr", "TR")
    val formattedTRPrice = String.format(localeTR, "%,.2f", price)

    // String içerisinde değer ataması yapılamaz, sadece expression bulunabilir.
    val number = 10
    //  val reassignmentString = "number + 10 = ${number = number + 10}"    // Hata.
}