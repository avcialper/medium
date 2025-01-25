package com.avcialper.basictypes

fun main() {

    /**
     *      Null değer alabilen değişkenlere Nullable denilir. Null değer ataması başlangıçta veya program akışında
     *      herhangi bir yerde olabilir. Bir değişkenin null değer alabilmesinin belirlenmesi bizi güvenceye alır.
     *      Çünkü null olabilen değerler fonksiyonları ve özelliklerini doğrudan kullanamazlar, bizden bu değerin null
     *      olmadığını ispatlamamızı isterler. Bu sayede NullPointerException hatasının önüne geçilebilir.
     *      Kotlin' de bir değişkeni null yapabilmek için tipinin yanına ? konulur. Böylece bu değişkene null değer
     *      alabilme özelliği verilir. Eğer tip belirtilmeden direk null ataması yapılırsa type inference sayesinde
     *      değişkenin tipi Nothing? olarak atanır.
     */
    var number: Int? = null
    var anything: Nothing? = null
    var age = 20

    /**
     *      Kotlin' de, veri tipleri genellikle primitive tipler olarak değil, sınıf (class) türlerinden türetilmiş
     *      (referans tip) gibi görünür. Ancak, Kotlin kodu Java bytecode' una derlendiğinde, aslında belirli
     *      durumlarda bu tiplerin altta Java'nın primitive tipleriyle eşleştiği görülebilir. Örneğin, Int, Double, Long
     *      gibi tipler Kotlin'de sınıf olarak tanımlanmış gibi görünse de, Java bytecode'una derlendiğinde altta yatan
     *      yapılar Java'nın primitive tiplerine karşılık gelir.
     *      Arka plan kodlarını görmek için önce shift + shift yapıyoruz, sonrasında açılan alana Show Kotlin Bytecode
     *      yazıp sağ tarafta açılan alandan decompile ediyoruz. Decompile edilen dosya içerisinde kodun Java
     *      karşılığını görebilirsiniz.
     */
}