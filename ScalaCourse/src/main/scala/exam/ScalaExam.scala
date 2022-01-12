package exam

import scala.io.Source

object ScalaExam {

  def main(args: Array[String]): Unit = {

    // Lire les lignes du fichier product
    val file = "C:\\Users\\groupe1\\exam\\products" // Chemin vers le fichier

    val data = Source.fromFile(file).getLines

    // Dans une variable data_only, enlever le header
    val data_only = data.drop(1)

    println("---------5 PREMIERES LIGNES DE dataOnly (SANS LE HEADER)------------")
    // Afficher les 5 premiers elements et assurer vous que le header n'est plus là
    data_only.take(5).foreach(println)

    // Convertir les lignes en Liste
    val dataToList = data_only.toList

    println("\n---------100 PREMIERES LIGNES DE dataToList------------")
    // Afficher les 100 premieres lignes
    dataToList.take(100).foreach(println)

    // Combien de categories distinct le fichier contient
    val distinctCat = dataToList.map(_.split(",")(1)).toSet // On met la colonne categorie_id (position 2) dans une variable de type Set pour avoir des valeurs uniques

    println("\n---------NOMBRE DE CATEGORIES DISTINCTES------------")
    println(s"Le nombre de catégories est égal à : ${distinctCat.size}") // nombre de categories


    /**
     * Dans un tuple data_price_categ, mettre la catégorie et le prix des element par catégorie
     *  - NB1 : Les prix doivent être en double
     *  - NB2 : Il peut y avoir que le prix soit vide (""), remplacer par 0.0
    */
    val data_price_categ: List[(String, Double)] = dataToList.map(e => {
      val category = e.split(",")(1)
      var price = e.split(",")(4)

      if (price == "") price = "0.0"

      (category, price.toDouble)
    })

    println("\n-------AFFICHAGE DES TUPLES (LISTE DE TUPLES(PRIX, CATEGORIE))----------")
    println(data_price_categ)

    /**
     * En appliquant la methode group by, regrouper par categories, les prix de vente.
     *
     * Cette fonction s'utilise comme suit : val data_grouped = data.groupBy(ligne => element_de_ligne_a_utiliser_pour_le_groupage)
     *
     * Vous utiliserez comme element de groupage les id de categories
     */
    val data_grouped = data_price_categ.groupBy(_._1)


    println("\n-------10 PREMIERES LIGNES - DONNEES GROUPES----------")
    // Afficher les 10 premieres lignes des données groupées
    data_grouped.take(10).foreach(println)

    /**
     * La fonction group by renvoie pour chaque categorie, une liste de tuple (categorie, prix) associée
     * créer une fonction sumList qui prend en entree une liste de tuple List[(String, Double)] et renvoie la somme des elements Double de la liste
     *
     * @param list prend en entrée une liste de tuple
     * @return la somme des éléments Double
     */
    def sumList(list: List[(String, Double)]): Double = {

      var sum = 0.0

      list.foreach(e => sum += e._2)

      sum // return sum
    }

    /**
     * Calculer les prix par categories en appliquant la fonction sumList
     */
    val dataSum = data_grouped.map(e => (e._1, sumList(e._2)))

    println("\n-------10 PREMIERES LIGNES : dataSum----------")
    // Afficher les 10 premieres lignes
    dataSum.take(10).foreach(println)

    /**
     * Trier les categories par prix et par ordre croissant
     */
    val dataSorted = dataSum.toList.sortBy(e => -e._2)

    println("\n-------SORTING DATA SUM----------")
    dataSorted.foreach(println)


    /**
     * Afficher les 5 categories qui ont été les plus vendues et leurs prix sous la forme :
     *
     * "La catégorie CATEGORIE fait partie des 5 categories les plus vendues avec le prix PRIX
     */
    val catMostSold = dataSorted.take(5)

    println("\n-------GATEGORIES PLUS VENDUES----------")
    catMostSold.
      foreach { e =>
        println(("La catégorie %s fait partie des 5 categories" +
          " les plus vendues avec le prix %s").format(e._1, e._2))
      }


  }

}
