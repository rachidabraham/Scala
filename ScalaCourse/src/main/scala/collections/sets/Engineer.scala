package collections.sets

/**
 *  ==Les Set==
 *  ===Syntaxe :===
 *  {{{val maSet: [Set[T]] = Set(element1, element2,… elementN)}}}
 *  ===Exemple :===
 *  {{{val maSet : Set[Int] = Set(1, 8, 4, 9)}}}
 *
 *  NB : Les Set ne contiennent pas de doublons
 */
object Engineer {

  def main(args: Array[String]): Unit = {

    // Creation du Set
    val engSet = Set("I", "am", "trained", "to", "be", "a", "data", "engineer")

    // Récupérer les éléments contenant la lettre "a"
    val eltContA = engSet.filter(_.contains("a"))

    println("Les elements de la Set contenant la lette 'a' : ")
    eltContA.foreach(e => print(s" $e, "))

    // En utilisant Map, transforme le Set en une collection contenant la taille des éléments de l'ensemble.
    val newCol = engSet.map(_.length)

    println(s"\n\nLa nouvelle collection est : $newCol")

    // Filtrer les valeurs paires
    val pairsSet = newCol.filter(elt => elt%2==0)

    println(s"\nCollection avec des valeurs paires : $pairsSet")

    // Calculer la somme total de cet ensemble d'entiers
    val total = pairsSet.reduce((a,b) => a+b)
    // oubien val total = pairsSet.sum
    println(s"\nLa somme totale des valeurs de pairsSet : $total")
  }
}
