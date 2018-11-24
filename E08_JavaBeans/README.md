# JavaBeans

Napisz program, który pozwala na kontrolowanie danych obiektu, który reprezentuje punkt na płaszczyźnie.

Punkt (klasa Point - Point.java) powinien zawierać dwa pola reprezentujące współrzędną X oraz Y - reprezentacja współrzędnych powinna być całkowitoliczbowa. Klasa powinna być zgodna ze specyfikacją JavaBeans. Klasa powinna posiadać konstruktor bezparametrowy oraz pozwalający ustawić odpowiednie współrzędne w trakcie tworzenia obiektu.

Klasa PointController (PointController.java) posiada cztery metody, które pozwalają manipulować położeniem punktu:

- addX() - zwiększa zmienną x o 1

- minusX() - zmniejsza zmienną x o 1

- addY() - zwiększa zmienną y o 1

- minusY() - zmniejsza zmienną y o 1

Każda z metod przyjmuje jako parametr obiekt klasy Point i na nim operuje.

Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane w trzeciej klasie o nazwie PointApplication.