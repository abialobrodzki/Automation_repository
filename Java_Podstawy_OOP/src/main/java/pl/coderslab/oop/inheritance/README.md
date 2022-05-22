## Zadanie 1 - rozwiązywane z wykładowcą

Stwórz klasę ```AdvancedCalculator```, która dziedziczy po klasie ```Calculator```.
Klasa powinna implementować następujące metody:

1. ```pow(num1, num2)``` &ndash; metoda ma zwracać ```num1``` do potęgi ```num2```. 
Dodatkowo w tablicy operacji ma zapamiętać napis: "```num1```^```num2``` equals ```result```".
2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```. 
Dodatkowo w tablicy operacji ma zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".  


## Zadanie 2

Stwórz klasę `Shape`, która będzie posiadała:

1. prywatne atrybuty `x` i `y` (określające środek tego kształtu) oraz `color`,
2. konstruktor, przyjmujący zmienne określające wartości `x`, `y` i `color`, 
3. metodę o nazwie `getDescription()`, wypisującą informacje o tym kształcie, zwracającą wartość typu `String`,
4. metodę o nazwie `getDistance(Shape shape)`, zwracającą odległość od środka innego kształtu, wynik ma być typu `double`.

Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.  


## Zadanie 3

Stwórz klasę `Circle`, która spełnia następujące wymogi:

1. dziedziczy po klasie definiującej kształt (`Shape`),
2. ma dodatkowy atrybut `radius`,
3. posiada konstruktor, przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`,
4. nadpisuje metodę kształtu – `getDescription()`,
5. ma metodę o nazwie `getArea()`, zwracającą pole powierzchni typu `double`,
6. posiada metodę o nazwie `getCircuit()`, zwracającą obwód typu `double`.

Przetestuj metodę `getDistance(Shape shape)` na obiektach typu `Circle`.


## Zadanie 4

Stwórz klasę `Employee`, która posiada:

1. publiczne atrybuty:
 * `id` – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
 * `firstName` – atrybut określający imię pracownika,
 * `lastName` – atrybut określający nazwisko pracownika,
 * `wage` – atrybut określający stawkę godzinową pracownika,
2. konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
3. metodę `raiseWage(percent)`, której rolą będzie zwiększenie wartości atrybutu `wage` o podany procent.  
Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.


## Zadanie 5

Stwórz klasę `HourlyEmployee`, reprezentującą pracownika, któremu pracodawca płaci za godziny.
Klasa ma spełniać następujące wymogi:

1. ma dziedziczyć po klasie `Employee`,
2. posiadać dodatkową metodę `calculatePayment(hours)`, która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin. 


## Zadanie 6

Stwórz klasę `SalariedEmployee` reprezentującą pracownika, z którym pracodawca ma umowę miesięczną.
Klasa powinna:

1. dziedziczyć po klasie `Employee`,
2. mieć dodatkową metodę `calculatePayment()`, która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc
 (dla uproszczenia możemy założyć, że w każdym miesiącu jest 190 godzin pracujących – użyj `final static`). 
