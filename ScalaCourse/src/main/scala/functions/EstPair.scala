package functions

/**
 * ==Syntaxe générale de création d’une fonction==
 * {{{
 * def fonction ([args: DataType]): DataTypeElementDeRetour = {
 *    //... code
 *    result
 * }
 * }}}
 * Ou bien
 * {{{
 * def fonction ([args: DataType]) = result
 * }}}
 * ==Exemple:==
 * {{{
 * def sum(x: Int, y: Int) : Int = {
 *    val result = x + y
 *    result
 * }
 *
 * def sum(x: Int, y: Int) : Int = x + y
 * }}}
 * ==Appel de la fonction :==
 * {{{
 * sum(1,3) => renvoie 4
 * }}}
 */
object EstPair {

  def main(args: Array[String]): Unit = {

    val myList = List(3, 12, 16, 32, 54, 5, 23, 87, 98, 52, 99, 24)

    // Nombre d'elements pairs de myList
    eltPair(myList)
  }

  def eltPair(list: List[Int]): Unit = {

    println(s"Le nombre d'elements pairs de la liste est : ${list.count(e => e%2 == 0)}")

    /*
    // Ou bien

    var number: Int = 0

    for (i <- list){
      if (i%2==0)
        number = number + 1 // On incremente
    }

    println("Le nombre d'elements pairs de la liste est : " + number)

     */
  }


  /*
  // Ou bien de maniere plus simplifié
  def eltPair(l: List[Int]) : Int = l.count(_ % 2 == 0)
   */
}
