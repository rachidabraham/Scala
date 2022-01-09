package collections.tuples

/**
 * ==Les Tuples==
 * ===Syntaxe :===
 * {{{val maTup: TupleX[T1, T2, …] = TupleX(el1, el2, …)}}}
 * ===Exemple :===
 * {{{val maTup: Tuple3[String, String, Int] = Tuple3("dia", "mor", 28)}}}
 */
object TupleExercise {

  def main(args: Array[String]): Unit = {

    // Créer un Tuple "moi" contenant votre prenom, nom, taille, sexe
    val moi: (String, String, Int, String) = Tuple4("Ibrahima", "Ndiaye", 170, "masculin")

    // Accéder à la votre taille
    val taille = moi._3
    println("Mon age est : " + taille)

    // Renvoyer la phase suivante: Je suis prenom nom, j'ai une taille de taille et de sexe sexe
    println(s"Je suis ${moi._1} ${moi._2}, j'ai une taille" +
      s" de ${moi._3} et de sexe ${moi._4}")
  }

}
