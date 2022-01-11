package functions

import scala.math.pow // pour utiliser l'exponentiel ou la puissance

/**
 * Ecrire une fonction qui prend en entrée un nombre quelconque n
 * et renvoie une liste des nombres d'Amstrong qui sont entre 1 et n.
 *
 * Un nombre est Amstrong si le nombre à la puissance sa longueur est egale à lui même
 *  - Ex1 : 100 => 1^3^ + 0^3^ + 0^3^ != 100 donc 100 n'est pas un nombre Amstrong.
 *  - Ex2 : 20 => 2^2^ + 0^2^ != 20 donc 200 n'est pas un nombre Amstrong.
 *  - Ex3 : 371 => 3^3^ + 7^3^ + 1^3^ = 371 d'ou 371 est un nombre Amstrong
 */
object MyAmstrongNumber {

  def main(args: Array[String]): Unit = {

    // Appelation de la fonction pour tester sur 100, 20, 371
    println(s"Les nombres Amstrong entre 1 et 371 sont : ")
    getAmstrong(371)
      .foreach(elt => print(elt + ", "))

    println(s"\n\nLes nombres Amstrong entre 1 et 100 sont : ")
    getAmstrong(100)
      .foreach(elt => print(elt + ", "))

    println(s"\n\nLes nombres Amstrong entre 1 et 20 sont : ")
    getAmstrong(20)
      .foreach(elt => print(elt + ", "))

    /*
    // Ou bien, quand on veut utiliser l'autre methode
    // Appelation de la fonction pour tester sur 100, 20, 371
    amstrong(371)
    amstrong(100)
    amstrong(20)

     */
  }

  def isAmstrong (n: Int) : Boolean =
    n.toString.toList.map(el => pow(el.toString.toDouble, n.toString.length)).sum.toInt == n

  def getAmstrong(n: Int) : List[Int] = {
    var res : List[Int] = List()
    for (i <- 1 to n ) if (isAmstrong(i)) res = res :+ i
    res
  }

  /*
  // Ou bien
  def amstrong(n: Int): Unit = {

    var listFinal: List[Int] = List() // La liste qu'on retournera a la fin

    for (nbr <- 1 to n){

      var res: Double = 0
      var eltValue: Double = 0

      val nStr = nbr.toString // convertir le nombre en string pour pouvoir le splitter par chiffre
      val nLng = nStr.length // taille ou longueur du nombre

      var tab: Array[Int] = Array() // tableau tab pour stocker les chiffres (en char)

      // Transformer le nStr pour le mettre dans le tab
      nStr.foreach(ch => {
        val chInt = ch.toString.toInt // ch est un Char, on le convertit d'abord en String avant de le convertir en Int

        tab = tab ++ Array(chInt) // Pour chaque chiffre du nombre, on l'ajoute dans le tableau tab
      })

      // Calculer le nombre Amstrong
      tab.foreach(el => {
        eltValue = pow(el, nLng) // Pour chaque chiffre, on calcule sa puissance (ex : el^3)

        res = res + eltValue // On somme les resultats
      })

      // Resultat : si le resultat est egal au nombre donne
      // alors le nombre est un nombre Amstrong et on l'ajoute dans la liste
      if (res == nbr) {
        listFinal = listFinal.appended(nbr)
      }
    }

    println(s"Les nombres Amstrong entre 1 et $n sont : ")
    listFinal.foreach(e => print(e + ", "))
    println("")
  }

   */
}
