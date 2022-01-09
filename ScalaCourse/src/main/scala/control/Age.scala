package control

/**
 * ==IF – ELSE==
 * ===Syntaxe générale :===
 * {{{
 * If (condition) {
 *  // code
 * } else if (condition) {
 *  // code
 * }else {
 *  // code
 * }
 * }}}
 * ===Exemple :===
 * {{{
 * if (1==2) {
 *  print(“true”)
 * } else {
 *  print(“False”)
 * }
 * }}}
 */
object Age {

  def main(args: Array[String]): Unit = {

    def randomAge(): Int = {

      val r = scala.util.Random

      r.nextInt(100) // genere un nombre aleatoire compris entre 0 et 100
    }

    // Déclarer une variable « mon_age » qui est égale randomAge()
    val mon_age = randomAge()

    // Vérifier si vous êtes un enfant, un adolescent un adulte ou un papi.
    if (0 < mon_age && mon_age < 9) {
      println("Je suis un enfant")
    } else if (10 <= mon_age && mon_age <= 18){
      println("Je suis un adolescent")
    } else if(18 < mon_age && mon_age <= 60){
      println("Je suis un adulte")
    } else {
      println("Je suis un papi")
    }
  }
}
