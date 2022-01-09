package control

/**
 * ==Match - Case==
 * ===Syntaxe générale :===
 * {{{
 * nomVar match {
 *    case exp1 => instruction1
 *    case exp2 => instruction2
 *    ...
 *    case _ => instruction par défaut
 * }
 * }}}
 * ===Exemple :===
 * {{{
 * var age = 18
 * age match {
 *    case 18 => println("Vous avez 18 ans.")
 *    case x if (x < 18) => println("Vous avez moins de 18 ans.")
 *    case 19 | 20 => println("Vous avez 19 ou 20 ans.")
 *    case _ => println("Vous avais plus de 20 ans")
 * }
 * }}}
 */
object MatchCaseExample {

  def main(args: Array[String]): Unit = {

    val age = 18

    age match {
      case 18 => println("Vous avez 18 ans.")
      case x if (x < 18) => println("Vous avez moins de 18 ans.")
      case 19 | 20 => println("Vous avez 19 ou 20 ans.")
      case _ => println("Vous avais plus de 20 ans")
    }
  }
}
