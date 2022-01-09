package functions

/**
 * Deux mots S1 et S2 sont anagrammes si toutes les lettres se trouvant dans S1 sont dans S2
 * et leurs tailles sont égales.
 *
 * Tester le code sur les mots suivants :
 *  - Admise/Samedi, Avenir/Navire, Balise/Blaise, Cancer/Cancre
 *  - Centre/Récent, Cigare/Cirage, Direct/Crédit, Dragee/Gardee/Gradee
 *  - Équipe/Piquée, Égerie/Érigée, Entite/Teinte/Tetine, Gerard/Regard/Garder
 *  - Granit/Gratin, Limace/Malice, Ménage/manège, Orange/Organe
 */
object MyAnagram {

  def main(args: Array[String]): Unit = {

    // appeler la methode areAnagrams
    val condition = areAnagrams("Admise","Samedi")

    if (condition){
      println("OK : Les deux mots sont des anagrammes.")
    } else
      println("KO : Les deux mots ne sont pas des anagrammes.")
  }

  // Definition de la methode areAnagrams
  def areAnagrams(S1: String, S2: String): Boolean = {

    var check = false // initialiser check à faux

    if (S1.length == S2.length) { // verifier avant tout si les deux mots ont la meme taille sinon on renvoie automatiquement faux
      S1.foreach(ch => {
        if (S2.contains(ch)) // parcourir chaque caractere d'un mot et le comparer à tous les autres caracteres de l'autre mot
          check = true
      })
    }

    check // ou return check
  }
}
