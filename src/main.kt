fun main(){
    var multipl= multiplication (arrayOf(10,5,3))
    println(multipl)
    var sum = mixedArrays(arrayOf("renee",30,10.5,"food",5.3,true))
    println(sum)
    var vowel = characters(arrayOf('a','b','c','d','d','f'))
        println(vowel)
    }


fun multiplication(multi: Array<Int>):Int{
    var multipl=1
    multi.forEach { x->
        multipl+=x
    }
    return multipl
}
fun mixedArrays(results:Array<Any>):Double{
    var sum = 0.0
    results.forEach{num->
        if(num is Double)
            sum+=num
    }
    return sum
}
fun characters(vowel:Array<Any>):Int{
    var char = 0
    vowel.forEach{c ->
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            ++char
    }
    return char
}