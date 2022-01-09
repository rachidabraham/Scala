package operators

/**
 * Un magicien dit que :
 *  - Quand on choisit un nombre premier différent de 2 et 3
 *  - On l'èleve au carré
 *  - On lui ajoute 17
 *  - On divise par 12
 *  - Alors le reste de la division vaut 6
 */
object NombrePremier {

  def main(args: Array[String]): Unit = {

    val number = 17

    val squareN = number*number

    val sumNum = squareN + 17

    val modulusNum = sumNum%12

    println("Le reste de la division est : " + modulusNum)
  }
}
