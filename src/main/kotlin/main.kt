fun main() {
    val price = 1200
    val discount = 100
    val discountPercent = 5
    val regCustomer = true
    val discountStart = 1_001
    val discountPercentStart = 10_001
    var totalPrice: Int

    if (price >= discountStart && price < discountPercentStart) {
        totalPrice = price - discount
    } else if (price >= discountPercentStart) {
        totalPrice = price - price * discountPercent / 100
    } else totalPrice = price

    if (regCustomer) totalPrice -= price * 1 / 100
    println("Цена с учетом скидки составляет: $totalPrice")

}