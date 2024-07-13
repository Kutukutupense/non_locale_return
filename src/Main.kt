//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
outerFunction()
outerFunction2()

}


fun outerFunction(){
    println("Start")
    val liste = listOf(1,2,3,4,5,6,7,8,9)
    liste.forEach {
        if (it == 5){
            return
        }
        println(it)
    }
    println("Stop")
}

fun outerFunction2(){
    println("Start")
    val liste = listOf(1,2,3,4,5,6,7,8,9)
    liste.forEach label@{
        if (it == 5){
            return@label
        }
        println(it)
    }
    println("Stop")
}

//yukardaki fonksiyonun aynısı label farklı
fun outerFunction3() {
    println("Start")
    val liste = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    liste.forEach {
        if (it == 5) {
            return@forEach         // böyle de label yapabiliriz
        }
        println(it)
    }
    println("Stop")
}

//yukarıdaki fonksiyonları çağırıldığında return kullanıyorsak return dediğimizde fonksiyonu
// sonlandırması bekleriz ve "stop değerini yazmasını bekleriz Amaaaaaa!!


//eğer bir higher order function dönüş değeri olarak inline bir fonksiyon aldı ise ve  içinde return değeri kullanıyorsak bizi fonksiyonun içinden
// değil 2 fonksiyon birden dışarı çıkarır yani burada komple main(){} fonksiyonu içinden çıkmış oluyoruz.
 // -- Buna NON LOCALE RETURN denir. -- ve sadece inline fonksiyonlarda olur
// burada forech fonksiyonuna ctrl ile bakarsak inline bir fonksiyon ve bu fonksiyonu return ediyoruz.
// o yüzden label kullanmamız gerekir.
//  burada outerFunction gördüğümüz gibi dönüş değeri olarak bir başka
// fonksiyon tutuyor (foreach) i yani. bu yüzden higher order function oluyor. labelladığımızda outerfunction2 nin
//devam ettiğini görüyoruz. outerfunction1 de ise label olmadığı için Stop u yazdırmıyor.