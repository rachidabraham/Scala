package control

/**
 * La suite de Fibonacci est une suite d'entiers dans laquelle chaque terme est
 * la somme des deux termes qui le précèdent.
 *
 * Pour calculer les termes de la suite de Fibonacci, on fixe les deux premiers termes de la suite :
 *  - u0=0 u1=1
 *  - Pour i≥2 on calcule les termes ui à l'aide de la formule : ui=ui−1+ui−2
 */
object Fibonacci {

  def main(args: Array[String]): Unit = {

    var n0: Int = 0
    var n1: Int = 1
    var res: Int = 0

    println("u0 = 0 \nu1 = 1")

    for (i <-2 to 10){
      res = n0 + n1 // res = ui = u(i-1) + u(i-2) with n0 = u(i-1) and n1 = u(i-2)
      println(s"u$i = $res")
      n0 = n1
      n1 = res
    }
  }
}
