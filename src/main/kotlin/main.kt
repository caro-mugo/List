fun main() {

evenList(listOf("Carol","Sabdio","Juliet","ESther","lovie","Anne","Lucy","Sakina","Koko","Nia"))
    var x=heightOfpeople(listOf(2.0,2.1,1.2,12.1,45.2))
    println(x)

var a = Person("Hilda" ,21,5.7,80.0)
    var c=Person("Carol",29,30.0,1.65)
    var d=Person("Mugo",24,30.4,29.0)
    var list= listOf(a,c,d)
    var z=list.sortedBy { Person->Person.age }
    println(z)
    var p = Person("Carrie",31,9.9,80.9)
    var w= Person("Nyambu",54,8.9,21.90)
    var listsecond= listOf(p,w)
    println(list.plus (listsecond))
    var vehiclea=Cars("kw33w",89.0)
    var vehicleb=Cars("BMW2239Y",22.0)
    var vehiclec=Cars("KBY240Z",40.3)
    var vehicled=Cars("KWZA132",34.6)
    var vehicles=listOf(vehiclea,vehicleb,vehiclec,vehicled)
    println((vehicles))



}
fun  evenList(name:List<String>):List<String> {
    name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)

        }

    }

   return name
}


fun heightOfpeople(height:List<Double>):String {
    var pplheight = height.sum()
    var avg = height.average()
    var people = ("$pplheight $avg")
    return people


}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double){

}
fun getsum(names:List<Any>):List<Any>{
    return listOf()
}
data class Cars(var registration:String,var mileage:Double)
fun vehicle(prado:List<Cars>):Double{
    var vehicle=0.0
    var y=prado.count()
    prado.forEach{cars->cars.mileage
        vehicle+=cars.mileage
    }
    var average=vehicle/prado.count()
    return average
}













