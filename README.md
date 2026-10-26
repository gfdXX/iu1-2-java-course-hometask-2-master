# Java: наследование, абстрактные классы и интерфейсы

![Java](https://img.shields.io/badge/Java-8-007396?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-build-C71A36?logo=apachemaven&logoColor=white)

Домашнее задание №2 по курсу Java, МГТУ им. Н.Э. Баумана, ИУ1 (весна 2022). Условия лежат рядом с кодом в `TaskN.txt`.

| Задача | Классы | Что сделано |
|---|---|---|
| [1. Призмы](src/main/java/task1) | `Figure2D`, `Triangle`, `Circle`, `Rectangular`, `Trapezoid`, `Prism`, `PrismTask` | прямая призма с произвольным основанием-фигурой: площадь поверхности и объём |
| [2. Работники](src/main/java/task2) | `Worker`, `WorkerHourlyPayment`, `WorkerFixedPayment`, `TestWorker` | абстрактный метод расчёта среднемесячной зарплаты: почасовая (20.8 · 8 · ставка) и фиксированная оплата |
| [3. Температуры](src/main/java/task3) | `Convert`, `Celcius`, `Kelvin`, `Fahrenheit`, `TestConvert` | интерфейс конвертера и перевод между шкалами Цельсия, Кельвина и Фаренгейта |

## Как запустить

Проверка каждой задачи — класс с `main`: `PrismTask`, `TestWorker`, `TestConvert`. Например:

```bash
mvn compile
java -cp target/classes task3.TestConvert
```

## Автор

Салженикин Даниил, МГТУ им. Н.Э. Баумана.
