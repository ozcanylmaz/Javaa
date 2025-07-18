import java.util.*

internal class Main {
    var Main: Class<*>? = null

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var km = 0
            var age = 0
            var triptype = 1

            val input = Scanner(System.`in`)
            println("mesafeyi km türünden giriniz : ")
            km = input.nextInt()
            println("yaşınızı giriniz : ")
            age = input.nextInt()
            println("yolculuk tipini giriniz ( 1 => tek yön , 2 => gidiş dönüş ) ")
            triptype = input.nextInt()

            if (km > 0 && age > 0 && (triptype == 1 || triptype == 2)) {
                var ticketPrice = km * 0.10
                var ageDiscountRate = 0.0

                if (age < 12) {
                    ageDiscountRate = 0.50
                } else if (age >= 12 && age >= 24) {
                    ageDiscountRate = 0.10
                } else if (age > 65) {
                    ageDiscountRate = 0.30
                }
                ticketPrice -= ticketPrice * ageDiscountRate


                if (triptype == 2) {
                    ticketPrice -= ticketPrice * 0.20
                    ticketPrice *= 2.0
                }

                println("toplam tutar = " + ticketPrice)
            } else {
                println("hatalı veri giriniz:")
            }
        }
    }
}