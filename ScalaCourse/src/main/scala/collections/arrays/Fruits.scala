package collections.arrays

/**
 *  ==Les Tableaux (ou Array)==
 *  ===Syntaxe :===
 *  - En initialisant la taille du tableau : {{{val tab = new Array[DataType](longueur)}}}
 *  - En précisant les valeurs par défaut : {{{val tab2 [:Array[T]] = Array(value1, value2…., valueN)}}}
 *  ===Exemple :===
 *  - {{{val tab = new Array[Int](3)}}}
 *  - {{{val tab2 : Array[Int] = Array(2,2,3)}}}
 *
 *  `NB : Les array sont mutables`
 */
object Fruits {

  def main(args: Array[String]): Unit = {

    // Creation du tableau fruits
    var fruits = Array("Pomme","Banane", "Poissons", "Mangue")

    // Afficher le tableau
    println("-- Tableau : fruits --")
    fruits.foreach(elt => println(elt))

    // Supprimer Poissons dans fruits
    fruits = fruits.filter(elt => elt != "Poissons")

    // Affichage
    println("-- Tableau : fruits (sans Poissons) --")
    fruits.foreach(elt => println(elt))

    // Ajout de Papaye et Orange dans fruits
    fruits = fruits ++ Array("Papaye", "Orange")

    println("-- Tableau : fruits (avec Papaye et Orange --")
    fruits.foreach(elt => println(elt))

    // Taille de fruits
    val taille = fruits.length
    println("\nLa taille du tableau FRUITS est : " + taille)

    // Index de Mangue
    val inMangue = fruits.indexOf("Mangue")
    println("Indexe de l'element Mangue : " + inMangue)

  }

}
