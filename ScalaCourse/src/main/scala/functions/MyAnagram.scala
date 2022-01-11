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

    // Appeler la methode areAnagrams
    val condition = areAnagrams("admise","samedi")

    if (condition){
      println("OK : Les deux mots sont des anagrammes.")
    } else
      println("KO : Les deux mots ne sont pas des anagrammes.")
  }

  // Definition de la methode areAnagrams
  def areAnagrams(S1: String, S2: String): Boolean = {

    // On trie par ordre alphabétique et comparer
    S1.sorted == S2.sorted // return true si la comparaison passe
  }


  /*
  // Ou bien, de maniere plus détaillée

  def areAnagrams(S1: String, S2: String): Boolean = {

    // On trie par ordre alphabétique et comparer
    S1.sorted == S2.sorted // return true si la comparaison passe

    var check = false // initialiser check à faux

    // On trie par ordre alphabétique pour comparer les mots sequentiellement
    val sortedS1 = S1.sorted
    val sortedS2 = S2.sorted

    if (sortedS1.length == sortedS2.length) {
      sortedS1.foreach(_ => {
        // contentEquals : compare le string au CharSequence spécifié. Le résultat est vrai si et seulement si
        // ce string représente la même séquence de valeurs char que la séquence spécifiée.
        check = sortedS2.contentEquals(sortedS1)
      })
    }

    check // ou return check
  }

  // Ou bien encore

  def areAnagrams(S1: String, S2: String): Boolean = {

    var check = false // initialiser check à faux

    if (S1.length == S2.length) { // verifier avant tout si les deux mots ont la meme taille sinon on renvoie automatiquement faux

      var check1, check2 = true

      S1.foreach(ch => {
        if (check1) {
          if (S2.contains(ch)) // parcourir chaque caractere d'un mot et le comparer à tous les autres caracteres de l'autre mot
            check1 = true
          else
            check1 = false
        }
      })

      S2.foreach(ch => {
        if (check2) {
          if (S1.contains(ch)) // parcourir chaque caractere d'un mot et le comparer à tous les autres caracteres de l'autre mot
            check2 = true
          else
            check2 = false
        }
      })

      check = check1 & check2
    }

    check // ou return check
  }

   */
}