fun main() {
    println (isEvennumber(9))


    var shop=shop("matama",12,20,"groceries")
    shop.grouping()

    println(("mango"))


    digit()
    people()
    name(5)
    name(10)
    name(16)
    place()
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())
    println(k+p)
    println("You are a teenager")
    println("Have you been to kampala")

    println(t)
    println(m)
    println(numArray[3])
    println(numArray[0])
    println(numArray[2])
    println(numElement)
    println(sumElement)
    println(minvalue)
    var man=Farmer("faith",22)


    val age=20

    if(age>12){
        println("You are a teenager")
        println("You are not a teenager")

    }
    else{
        println("you are not teenager")
    }



}
fun digit(){
    for(x in 1..100){
        if(x%2==1){
            println(x)
        }
    }
}
fun people(){
    var name= arrayOf("sharon","sheila","dog","mammal","house")
    for (people in name){
        if (people.length>5){
            println(people)

        }
    }
}
fun name(age:Int){
    if(age<6){
        println("milk")}
    else if(age<15 && age > 6){
        println("fanta orange") }
    else{
        println("coca cola")
    }
}
fun number(){
    for(r in 1..100){

    }
}
fun place(){
    for (t in 1..100){
        println(t)
    }
    for (t in 1..100){
        if(t%3==0){
            println("fizz")

        }
        if (t%5==0){
            println("buzz")
        }


    }
    for (t in 1..100){
        if (t%3==0&&t%5==0){
            println("fizzbuzz")
        }
    }

}
class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        println("Our carring$people passager")
        println("Over capacity by$people")


    }

}


// concatenation
val name="timoty kemei"
val k="my name is"
val p="caroline"

val person="sharon"
val year="2000"
val t="$person was born in $ year"
//get an element in index
var nameArray= arrayOf("sheila","kemei","ruth","naum")
var m=nameArray.get(0)
//creat array using arrayof
var numArray= arrayOf(20,40,10,70,60,90,100)

var numArrays= arrayOf(50,60,30,10,100,20,40,50)
var numElement=numArray.count()
var sumElement=numArray.sum()
var minvalue=numArray.minOrNull()

//
class Farmer(var name:String,var age: Int){
    fun eat(){
        println("yaaam")

    }
    fun dig(){
        println("dig dig dig")

    }
    fun sleep(){
        println("waaaah")
    }
    fun talk(){
        println("karibu kwa shamba")
    }
}


fun isEvennumber(num:Int):Boolean {
    if(num%2==0){
        return true
    }
    else{
        return false
    }
}



data class  shop(var name:String,val weight:Int ,var price: Int,var category:String) {
    fun grouping() {
        var grocerie = listOf<String>()
        var hygiene = listOf<String>()
        when (category) {
            "grocerie" -> println(grocerie + name)
            "hygiene" -> println(hygiene + name)
            else -> println(name)
        }
        fun fruit(name: String): String {
            var k = ""
            for (items in name) {
                if (name.indexOf(items) % 2 == 0)
                    println(items)
            }
            return "${k}"
        }

        fun animal(name: Array<String>): ArrayList<String> {
            var nameArray = ArrayList<String>()
            return nameArray
        }


    }

}






















































