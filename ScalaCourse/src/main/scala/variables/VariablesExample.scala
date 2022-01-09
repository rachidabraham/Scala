package variables

/**
 * ==Syntaxe Générale==
 * {{{Keyword nomVaribale [: DataType] = valeur}}}
 *
 * Les valeurs de keywords peuvent être:
 *  - val : Pour designer une variable immuable (dont le contenu est non modifiable après assignation)
 *  - var : Pour désigner une variable mutable (dont le contenu est modifiable après assignation)
 *  - lazy val : Pour designer une variable qui n'est évaluée que lorsqu'elle est appelée
 * ===Exemple :===
 * {{{var maProfession = "data engineer"}}}
 *
 * On peut déclarer plusieurs Variables en même temps:
 * ===Exemple 1 :===
 * {{{val (a,b,c) = 1,2,3  // a, b, c valent 1,2,3}}}
 * ===Exemple 2 :===
 * {{{val a,b = 100  // a et b valent 100}}}
 */
object VariablesExample {

  def main(args: Array[String]): Unit = {

    // Créer une variable mutable nommée « profession » et renseigner la valeur : Data Engineer
    var profession: String = "Data Engineer"

    println("J'etais " + profession)

    // Vous avez été muté et vous êtes maintenant « scrum master ». Changer votre profession.
    profession = "Scrum Master"

    println("Mais maintenant, je suis " + profession)

    // Créer en une seule commande les variable nom, prenom et age.
    // Pour des raisons de fraudes sur l‟identité de la personnes, personne ne doit
    // pouvoir modifier les valeurs de ces variables.
    val (nom: String, prenom: String, age: Int) = ("Ndiaye", "Ibrahima", 20)

    // Afficher les variables à l‟aide de la fonction println(" ")
    println(s"Mon age est $age")
    println("Et mon nom complet est %s %s".format(nom, prenom))
  }
}
