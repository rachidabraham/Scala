package control

/**
 * ==La boucle For==
 * ===Syntaxe générale :===
 * {{{
 * for (itterator <- collection) {
 *    //code
 * }
 * }}}
 * ===Exemple :===
 * {{{
 * for (i <- 1 to 10) {
 *    println(i)
 * }
 * }}}
 * ==La boucle While==
 * ===Syntaxe générale :===
 * {{{
 * while (expression booléenne) {
 *    // code
 * }
 * }}}
 * ===Exemple :===
 * {{{
 * var i = 1
 * while (i <=10) {
 *    println(i)
 *    i+=1
 * }
 * }}}
 * ==La boucle Do -While==
 * ===Syntaxe générale :===
 * {{{
 * do {
 *    // code
 * } while (expression booléenne)
 * }}}
 * ===Exemple :===
 * {{{
 * var i = 1
 * do {
 *    println(i)
 *    i+=1
 * } while (i <=10)
 * }}}
 */
object Bisextiles {

  def main(args: Array[String]): Unit = {

    /*
    Une année est bissextile si elle est divisible par 4 et non par 100
    à moins que l'année soit divisible par 400
     */

    for (annee <- 1900 to 2030){

      if ((annee%4==0)&&(annee%100!=0) || (annee%400==0)) {
        println(s"L'annee $annee est bisextile.")
      } else {
        println(s"L'annee $annee n'est pas bisextile.")
      }
    }

    /*
    val a = (1900 to 2030).toList
    var i = 0
    while(i < a.length){
      val year = a(i)
      if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) println(s"$year est bisextile")
      i +=1
    }

     */
  }
}
