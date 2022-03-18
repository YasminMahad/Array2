fun main() {
    var multiply = Multiplication(arrayOf(10,35, 20,100))
    println(multiply)
    var x = mixedTypes(arrayOf("Yasmin", 12,45.3, 345))
    println(x)
    var all = mixedcharacters(arrayOf('r','y','3','e','4','a','i'))
    println(all)

}

fun Multiplication(numbers: Array<Int>):Int{
    var product = 1
    numbers.forEach { num ->
        product *= num

    }
    return product
}

fun mixedTypes(digits:Array<Any>):Double{
    var sum = 0.0
    digits.forEach {add ->
        if (add is Int||add is Double)
            sum += add.toString().toDouble()
    }
    return sum

}

fun mixedcharacters(vowels: Array<Char>):Int{
    var letter = 0
    vowels.forEach{ Char ->
       if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u'){
           ++letter
       }
    }
    return letter
}


