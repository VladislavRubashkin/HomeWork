package homeWork.lessons6.productList;

/*
Список разрешенных продуктов
Класс Пищевая Ценность
Свойства: имя продукта / белки / жиры / углеводы / калории
Минимум 4 конструктора
Реализовать необходимые проверки входящих данных
Создать не менее 4 экземпляров данного класса (объектов)
Класс Мои Продукты
Свойства: разрешенное количество белков / жиров / углеводов / калорий / список разрешенных продуктов (массив)
Реализовать метод, который принимает на вход название продукта и добавляет его в список разрешенных,
если характеристики продукта полностью соответствуют заявленным разрешениям,
в противном случае сообщить, по какой причине продукт не может быть добавлен в список
Реализовать метод, который показывает список разрешенных продуктов
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */
public class MethodMain {
    public static void main(String[] args) {
        NutritionalValue apple = new NutritionalValue("Яблоко",12,5,22,11);
        NutritionalValue banana = new NutritionalValue("Банан",12,5,22,11);
        NutritionalValue grapes = new NutritionalValue("Виноград",12,5,22,11);
        NutritionalValue bread  = new NutritionalValue("Хлеб",12,5,22,11);
        NutritionalValue potato = new NutritionalValue("Картошка",12,5,22,11);
        NutritionalValue tomato = new NutritionalValue("Помидор",12,5,22,11);
        NutritionalValue chocolate = new NutritionalValue("Шоколад",12,5,22,11);
        NutritionalValue pear = new NutritionalValue("Груша",50,5,22,11);


        MyProducts products = new MyProducts(25,25,25,25,10);
        products.addProducts(banana);
        products.addProducts(grapes);
        products.addProducts(bread);
        products.addProducts(potato);
        products.addProducts(tomato);
        products.addProducts(chocolate);
        products.addProducts(pear);

        System.out.println(products.permittedProducts());
    }
}
