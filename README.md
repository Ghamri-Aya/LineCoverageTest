Line coverage test:


Exo1:
-La ligne assertTrue(Exo1.isPalindrome("aya"));s’avere contenir une erreur malgre que aya est un mot palindrome.
-Afin de corriger cet erreur on analyse le code,on remarque que l’indice i decremente a chaque iteration et l’indice j incremente alors que normalement c’est le contraire.




Exo2:
-Les erreurs sont indiquer ci dessous :
assertFalse(Exo2.isAnagram("azerty", "querty")); Index 6 out of bounds for length 6
assertTrue(Exo2.isAnagram("", ""));  Index 0 out of bounds for length 0
assertTrue(Exo2.isAnagram("listen", "silent"));Index 6 out of bounds for length 6
-Lors de la vérification du code on remarque l’erreur au niveau de la condition de sortie de la boucle : for (int i = 0; i <= s1.length(); i++)
-La correction est : for (int i = 0; i < s1.length(); i++)



Exo3:
-Les erreurs sont indiquer ci dessous :
assertEquals(4, Exo3.binarySearch(array, 50)); Expected :4 Actual:-1
assertEquals(0, Exo3.binarySearch(array, 10)); Expected :0 Actual:-1
assertEquals(1, Exo3.binarySearch(array, 20)); Expected :1 Actual:-1
-Lors de la vérification du code on remarque l’erreur au niveau de la condition de sortie de la boucle: while (low < high)
-La correction est : while (low <= high)




Exo4:
-Ne contient pas d’erreur



Exo5:
-L’erreur est indiquer ci dessous :
assertEquals("I", Exo5.toRoman(1)); Index 13 out of bounds for length 13
-Lors de la vérification du code on remarque l’erreur au niveau de la condition de sortie de la boucle: 
for (int i = 0; i <= symbols.length; i++) {
    while (n > values[i]) {
        sb.append(symbols[i]);
        n -= values[i];
    }
}
-La correction:
for (int i = 0; i < symbols.length; i++) {
    while (n >= values[i]) {
        sb.append(symbols[i]);
        n -= values[i];
    }
}



Exo6:
-Les erreurs sont indiquer ci dessous :
assertEquals("1", Exo6.fizzBuzz(1)); n must be positive
-Dans les exigences on a mentionner que tous nombre non divisible par 3,5,3 et 5(15) est retourne sous forme de chaine de caractere, et tous nombre positive lancera une exception alors que dans le code on a mis la condition : if (n <= 1) qui va lancer une exception, d’ou l’erreur.
-La correction est :  if (n < 1)
