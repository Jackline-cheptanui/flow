import javax.naming.Name

fun main() {
    digit()
    Name()
    num()
    robot(5)
    robot(10)
    robot(15)

    



}
fun digit(){
    for (x in 1..100)
        if(x%2==1)
            println(x)
}
fun Name(){
    var animal= arrayOf("skyluck","species","mammal","cat")
    for (name in animal){
        if (name.length>5){
           println(name)
        }
    }
}
fun robot(age:Int){

    if(age<6){
        println("milk")
    }
    else if(age<15 && age >6){
        println("fanta orange")
    }
    else
            println("coca cola")


}
fun num() {
    for (p in 1..100) {
    }

    for (p in 1..100) {
        if (p % 3 == 0) {
            println("fizz")
        }
        for (p in 1..100)
            if (p % 5 == 0) {
                println("buzz")

            }
        }
    }
















