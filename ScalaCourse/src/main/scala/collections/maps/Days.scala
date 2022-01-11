package collections.maps

/**
 * ==Les Map==
 * ===Syntaxe :===
 * (Clé, Valeur)
 * {{{val maMap: Map[K, V] = Map(k1 -> v1, k2 -> v2, …)}}}
 * ===Exemple :===
 * {{{val maMap: Map[String, String] = Map("nom" -> "Dia", "prenom" -> "Mor", "age" -> "28")}}}
 */
object Days {

  def main(args: Array[String]): Unit = {

    // Créer le dictionnaire weekDay conntenant les valeurs suivantes : 1=>lundi, 2=>mardi, 3=>mercredi, 4=>jeudi, 5=>vendredi, 6=>samedi, 7=>dimanche
    val weekDay: Map[Int, String] =
      Map(
        1 -> "Lundi", 2 -> "Mardi", 3 -> "Mercredi",
        4 -> "Jeudi", 5 -> "Vendredi",
        6 -> "Samedi", 7 -> "Dimanche"
      )

    // Recupérer les clefs de weekDay dans une variable weekDayKeys
    val weekDayKeys = weekDay.keys

    // Convertir weekDayKeys en liste dans une variable weekDayKeys1
    val weekDayKeys1 = weekDayKeys.toList

    // Filtrer les éléments de weekDayKeys1 qui sont pairs dans une variable weekDayKeys2
    val weekDayKeys2 = weekDayKeys1.filter(elt => elt%2==0)

    // Pour chaque élément de weekDay dans une variable weekDayKeys2 afficher la phrase 'La clef ... a pour valeur ...
    weekDayKeys2.foreach(
      elt => {
      println("La clef " + elt + " a pour valeur " + weekDay(elt))
    })

    println("")

    // Récupérer les valeurs de weekDay dans une variable weekDayVals
    val weekDayVals = weekDay.values

    // Afficher avec printl 'Les jours de la semaine sont Lundi, Mardi, Mercredi, Jeudi, Vendredi, Samedi, Dimanche.'
    print("Les jours de la semaine sont :" )
    weekDayVals.foreach(e => print(" " + e))



    /*
    val weekDay =
      Map(
        1 -> "lundi", 2 -> "mardi", 3 -> "mercredi",
        4 -> "jeudi", 5 -> "vendredi", 6->"samedi",
        7 -> "dimanche")

    val weekDayKeys = weekDay.keys

    val weekDayKeys1 = weekDayKeys.toList
    val weekDayKeys2 = weekDayKeys1.filter(ele => ele %2 == 0)

    weekDay.foreach(m =>println("La clef "+m._1+" a pour valeur "+m._2))

    val weekDayKeys1_sorted = weekDayKeys1.sorted
    val jourDeLaSemaine = weekDayKeys1_sorted.map(key => weekDay(key))

    println(s"Les jours de la semaine sont ${jourDeLaSemaine.mkString(", ")}")

     */
  }
}
