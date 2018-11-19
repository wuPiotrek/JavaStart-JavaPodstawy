# Operacje na zmiennych

Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:

* Czy x jest większe od y?
* Czy x pomnożone przez 2 jest większe od y?
* Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
* Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
* Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

Podpowiedź, do utworzenia losowej liczby wykorzystaj metodę Random.nextInt(), aby było to możliwe, musisz ją zaimportować przed zdefiniowaniem klasy (więcej o tym w kolejnych lekcjach) przykład:

```java
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10); // losowa liczba z przedziału [0, 9], 10 się nie wlicza
        int number2 = new Random().nextInt(10); // krótsza wersja
        System.out.println(number);
        System.out.println(number2);
    }
}
```