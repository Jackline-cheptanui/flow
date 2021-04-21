fun main() {
    var farm = Farmer("sharon", 20)
    farm.eat()
    farm.sleep()
    farm.cultivateland()
    farm.fertilizer()

    var person = Doctor("John", 21)
    person.sleep()
    person.eat()
    person.talk(words = "karibu kwa shamba")

    var manager = Banker("naum", 28)
    manager.sleep()
    manager.eat()
    manager.talk(words = "karibu kcb bank")
    selectContainer(4)
    selectContainer(10)
    selectGames(9)
}
open class Person(var name:String,var age:Int){
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("waaaaah")
    }
    fun talk(words:String){
        println(words)
    }
}
class Farmer( name:String, age:Int):Person(name, age){
    fun cultivateland(){
        println("dig dig")
    }fun  fertilizer(){
        println("pwerrrrrr")
    }

}
class Doctor( name:String,age: Int):Person(name, age){
    fun treat(name:String,disease:String){
        println("Treat $name for $disease")
    }

    override fun eat() {
        println("I am eating all my food")
    }
}
class Banker( name: String, age: Int):Person(name, age){

    fun countMoney(notes:List<Int>):Int {
        var sum= 0
        notes.forEach{note-> sum +=note}
            return sum
    }


}
fun  selectContainer(litre:Int){
    when (litre){
        1,2,3-> println("pour water into the bottle")
        4,5,6-> println("pour water into the basin")
        7,8,-> println("pour water into the cup")
        9,10,11-> println("pour water into the floor")
    }
}
fun selectGames(name: Int){
    when(name){
        1,2,3-> println("arsenal,manu at home")
        4,5,6-> println("liverpool,chelse at kilimani")
        7,8,9-> println("100metre at mamajusi")
    }
    var language =("mkalenjin,mjaluo,mkisii")
    for (language in language){
        println(language)

    }
}


