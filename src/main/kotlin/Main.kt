import java.util.*

// 1.  Explore the main() function
//fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//    }




// 2. Learn why (almost) everything has a value
//fun main(args: Array<String>){
//    val isUnit = println("This is an expression")
//    println(isUnit)
//}


//fun main(args: Array<String>) {
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//}


//fun main(args: Array<String>){
//    val temperature = 90
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
//}




// 3. Learn more about functions
//fun feedTheFish() {
//    val day = randomDay()
//    val food = "pellets"
//    println ("Today is $day and the fish eat $food")
//}


//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun main(args: Array<String>) {
//    feedTheFish()
//}


//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//}
//
//fun main(args: Array<String>) {
//    feedTheFish()
//}




// 4. Explore default values and Compact functions
//fun swim(speed: String = "fast") {
//    println("swimming $speed")
//}
//fun main(args: Array<String>) {
//     swim()
//    swim("slow")   // positional argument
//    swim(speed="turtle-like")   // named parameter
//}

//////////////

//fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" ->  true
//        else -> false
//    }
//}
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")
//}
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//fun main(args: Array<String>) {
//  feedTheFish()}

//////////////////////////////////////////

// 5. Get Started with Filters
//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//fun main() {
    // eager, creates a new list
//    val eager = decorations.filter { it [0] == 'p' }
//    println("eager: $eager")
//}


//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//fun main() {
//    // lazy, will wait until asked to evaluate
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//}


//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//fun main() {
//    // force evaluation of the lazy list
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    val newList = filtered.toList()
//    println("new list: $newList")
//}


//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//fun main(){
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    val lazyMap = decorations.asSequence().map {
//      println("access: $it")
//        it
//        println("lazy: $lazyMap")
//        println("-----")
//        println("first: ${lazyMap.first()}")
//        println("-----")
//
//        println("all: ${lazyMap.toList()}")
//    }
//}



// 6. Get Started with lambdas and higher-order functions
//fun main(){
//    var dirtyLevel = 20
//    val waterFilter = { dirty : Int -> dirty / 2}
//    println(waterFilter(dirtyLevel))
//}


//fun main (){
//    var dirtyLevel = 20
//    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//    println(waterFilter(dirtyLevel))
//}



//fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//    return operation(dirty)
//}
//fun main (){
//    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//    println(updateDirty(30, waterFilter))
//}


//fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//    return operation(dirty)
//}
//fun main () {
//    fun increaseDirty( start: Int ) = start + 1
//    println(updateDirty(15, ::increaseDirty))
//}



//fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//    return operation(dirty)
//}
//fun main () {
//    var dirtyLevel = 19
//    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
//    println(dirtyLevel)
//}