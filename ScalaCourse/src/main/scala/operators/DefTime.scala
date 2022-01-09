package operators

/**
 * Combien de temps (en Jours et en Heure) il faut à un marcheur
 * pour parcourir une distance de 750km à une vitesse de 4.8km/h
 *
 * NB : Vitesse = Distance/Temps et la fonction println() permet d'afficher un résultat
 */
object DefTime {

  def main(args: Array[String]): Unit = {

    val Distance = 750

    val Vitesse = 4.8

    val TempsEnHeure = Distance/Vitesse

    val TempsEnJour = TempsEnHeure/24

    println(s"Le temps qu'il faut marcher pour parcourir la distance est de : ${TempsEnJour.toInt} jours")

  }
}
