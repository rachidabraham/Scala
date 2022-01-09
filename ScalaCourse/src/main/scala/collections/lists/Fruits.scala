package collections.lists

/**
 * ==Les Listes==
 * ===Syntaxe :===
 * {{{
 *  - val maListe: [List[T]] = List(element1, element2,… elementN)
 *  - val maListe = element1 :: element2 :: ... :: ElementN :: Nil
 *  - val maListe = List()
 * }}}
 * ===Exemple :===
 * {{{val maListe : List[String] = List("a", "b", "c", "d", "a")}}}
 *
 * `NB : Les sont immutables`
 */
object Fruits {

  def main(args: Array[String]): Unit = {

    // Creation de la liste
    val fruits = List("pomme", "banane", "goyage", "banane", "kaki", "pomplemousse")

    // Affichage des 1e et 3e elements de la liste
    println("1e et 3e elements de la liste fuits :")
    println(fruits(0))
    println(fruits(2))

    // Ajouter les fruits « ananas » et « pastèque » respectivement au début et à la fin de la liste Fruits
    // et stocker la nouvelle liste dans une liste « Fruits_1 » en une ligne de commande
    val fruits_1 = "ananas"+:fruits:+"pasteque"

    println("\nAffichage des elements de la liste fruits_1")
    fruits_1.foreach(elt => println(elt))

    // Quelle est la nouvelle taille de « Fruits_1 »
    val tailleF1 = fruits_1.length

    println("\nLa taille de la liste fruits_1 est : " + tailleF1)

    // Vérifier que « goyave » fait partit de « Fruits_1 »
    val check = fruits_1.contains("goyage") // renvoie vrai si fruits_1 contient goyage et faux sinon

    println("\n«goyave» fait partie de «fruits_1» ? : " + check)

    // Compter le nombre de fois que « banane » apparait dans « Fruits_1 »
    val nbr = fruits_1.count(elt => elt == "banane")

    println("\nLe nombre de fois que banane apparait dans fruits_1 : " + nbr)

    // Dans une variable « Fruits_sorted », trier les fruits de « Fruits_1 »
    val fruits_sorted = fruits_1.sorted

    println("\nElements de la liste triée fruits_sorted")
    fruits_sorted.foreach(elt => println(elt))

    // Supprimer tous les fruits de « Fruits_sorted » dont la taille dépasse 5 caractères et stocker dans
    //une variable « Fruits_small »
    val fruits_small = fruits_sorted.filter(elt => elt.length <= 5)

    println("\nElements de fruits_small dont la taille depasse 5 caracteres")
    fruits_small.foreach(elt => println(elt))

  }
}
