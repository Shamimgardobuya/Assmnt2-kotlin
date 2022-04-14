import jdk.jfr.Category
import java.time.temporal.TemporalAmount

fun main(){
    var we = CurrentAccount("23455","Kotlin",560.85)
    we.deposit(145.0)
    println(we.balance)
    var hair = Product("Braid",34.87,300.0,"other")
    var fruitzz = Product("Mango",23.89,20.9,"groceries")
    var ppl = Product("Sub",34.67,400.0,"hygiene")
    food("Papaya")

}
 open class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double){
    fun deposit(amount:Double){
       var balance = 0.0
        balance+=amount
        println(balance)

    }
    open fun withdraw(amount: Double){
        var balance = 0.0
          balance-=amount


    }
    fun details(){
        println("$accountnumber with $balance is operated by $accountname")
    }
}
class Savingsaccount(accountnumber:String, accountname:String, balance:Double):CurrentAccount(accountnumber, accountname, balance){
   fun withdraw(withdrawals:Int){
       var withdrawals = 0
        if (withdrawals<4){
            withdrawals++



        }

    }
}
fun food(s:String):String{
    var t = ""
    s.forEachIndexed{index,c->
        if (index%2==0){
            t+=c
            println(t)
        }


    }
   return t

}
data class Product(var name:String,var weight:Double,var price:Double,var category:String)
fun item(y:List<Product>){
    var me = mutableListOf<String>()
  // when(category ){
     //   "Hygiene"->

    }



