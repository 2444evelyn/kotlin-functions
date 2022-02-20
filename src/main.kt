fun main(){
    printName("Evelyn")
    modulus(783,5)
    Sum(3,6,5,4)
    somethingFun("I love art")
    whereistudy("Akirachix")
}
fun printName(name:String){
    println("Hello"+ " " + name)
}
fun modulus(num1:Int,num2:Int){
    var result = num1 % num2
    println(result)
}
fun Sum(a:Int,b:Int,c:Int,d:Int){
    var sum= a+b+c+d
    println(sum)
}
fun somethingFun(fact:String){
    println("Something fun about me is"+" "+fact)
}
fun whereistudy(fact:String){
    println("I study at "+" " +fact)
}