//flow control

fun main(){
    println(condition(-23))
    println(conditions(45))
    println(nest(23))
    whens("Alliance Highschool")

}

//if else statement
fun condition(number:Int):String{
    var output=   if(number >0)return "Positive number" else return "Negative number"
}

//if else if statement
fun conditions(marks:Int):String{
    if(marks>=50){
        return "Pass"
    }
    else if(marks<=50){
        return "work harder"
    }
    else {
        return "get a tutor"
    }
}

//nested if else statement
fun nest(age:Int):String{
    if(age<=17){
        if(age>=14){
            return "Almost there"
        }else{
            return "What's the hurry"
        }
    }else{
        if(age>=18){
            return "You can drive"
        }else{
            return   "Get a chauffeur"
        }
    }
}


//when expression
fun whens(highschool:String){
    when(highschool){
        "Alliance Highschool"->println("Consider USIU")
        "Sironga Highschool"->println("Consider JKUAT and UON")
        "Brookside secondary school"->println("Consider Kabete polytechnic")
        else->println("Check again ")
    }
}
