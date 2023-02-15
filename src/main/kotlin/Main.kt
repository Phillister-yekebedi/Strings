fun main() {
    val z = "Akirachix"
    println(z[0])
    println(z[2])
    println(z[3])
    sentence()
    organisation()
    conditions("bedi")
    conditions("yeke")
}
fun sentence(){
   val name = "Otieno"
    var age = "22"
    val sentence = " hi, my name is $name and i am $age years old"
    println (sentence)

}
fun organisation(){
      var  organisation ="World Vision"
    return (println("The length is "+ organisation.length))

}
fun conditions(name:String){
    var NAME = "yeke"
    if(name == NAME) {
        println("that's me")
    }
else{
    println("i don't know who that is")
    }


}