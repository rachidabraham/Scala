package operators

/**
 * Le gouvernement a décidé d'offrir une prime de 300€ à certains fonctionnaires en fonction de leur salaire et de leur ancienneté.
 * Comme toutes les autres mesures prises par le gouvernement, il est difficile de comprendre à qui cette mesure s'applique.
 *
 * De ce que vous avez compris, une personne peut toucher à la prime si :
 *  - Critère 1 : Elle a moins de 5 ans d'ancienneté et son salaire est strictement inférieur à 1500 euros.
 *  - Critère 2 : Elle a entre 5 et 10 ans d'ancienneté et son salaire est compris entre 1500 et 2300 euros.
 *  - Critère 3 : Elle a plus de 10 ans d'ancienneté et son salaire est strictement inférieur à 1500 euros ou supérieur à 2300 euros. C'est à
 *  dire qu'une personne ayant plus de 10 ans d'ancienneté et un salaire entre 1500 et 2300 euros ne peut pas toucher à cette prime.
 */
object Prime {

  def main(args: Array[String]): Unit = {

    val prime = 300

    // Bernadette a 12 ans d'ancienneté et un salaire de 2400 euros.
    val salaireBernadette = 2400
    val ancieneteBernadette = 12

    var eligibility =
      (ancieneteBernadette < 5 && salaireBernadette < 1500) ||
      (5 <= ancieneteBernadette && ancieneteBernadette <= 10) &&
        (1500 <= salaireBernadette && salaireBernadette <= 2300) ||
      (ancieneteBernadette >= 10 && (salaireBernadette < 1500 || salaireBernadette > 2300))

    println(s"Bernadette est-il concerne par la prime ? : $eligibility")


    // Marc a 6 ans d'ancienneté et un salaire de 1490 euros
    val salaireMarc = 1490
    val ancieneteMarc = 6

    eligibility =
    (ancieneteMarc < 5 && salaireMarc < 1500) ||
      (5 <= ancieneteMarc && ancieneteMarc <= 10) &&
        (1500 <= salaireMarc && salaireMarc <= 2300) ||
      (ancieneteMarc >= 10 && (ancieneteBernadette < 1500 || salaireBernadette > 2300))

    println("Marc est-il concerne par la prime ? : " + eligibility)
  }
}
