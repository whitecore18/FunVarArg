fun main() {
    // Использование функции возведения в степень
    val a = 3
    val n = 3
    println("Возведение $a в степень $n: ${power(a, n)}")

    // Использование функции для вычисления произведения
    val start = 1
    val end = 5
    println("Произведение всех целых чисел от $start до $end: ${product(start, end)}")

    // Использование функции для нахождения НОД
    val num1 = 48
    val num2 = 18
    println("Наибольший общий делитель $num1 и $num2: ${gcd(num1, num2)}")
}

// Функция возведения числа a в степень n
fun power(a: Int, n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= a
    }
    return result
}

// Функция для вычисления произведения всех целых чисел от a до b
fun product(a: Int, b: Int): Int {
    var result = 1
    for (i in a..b) {
        result *= i
    }
    return result
}

// Функция для вычисления наибольшего общего делителя
fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}