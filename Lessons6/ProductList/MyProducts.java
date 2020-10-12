package homeWork.Lessons6.ProductList;

import java.util.Arrays;

public class MyProducts {

     private int maxProtein;
     private int maxFats;
     private int maxCarbohydrates;
     private int maxCalories;
     NutritionalValue[] food;

     public MyProducts(int maxProtein, int maxFats, int maxCarbohydrates, int maxCalories, int countProducts) {
          this.maxProtein = maxProtein;
          this.maxFats = maxFats;
          this.maxCarbohydrates = maxCarbohydrates;
          this.maxCalories = maxCalories;
          food = new NutritionalValue[countProducts];
     }
//
//     public int getMaxProtein(){
//          return maxProtein;
//     }
//     public void setMaxProtein(int maxProtein){
//          this.maxProtein = maxProtein;
//     }
//
//     public int getMaxFats(){
//          return maxFats;
//     }
//     public void setMaxFats(int maxFats){
//          this.maxFats = maxFats;
//     }
//
//     public int getMaxCarbohydrates(){
//          return maxCarbohydrates;
//     }
//     public void setMaxCarbohydrates(int maxCarbohydrates){
//          this.maxCarbohydrates = maxCarbohydrates;
//     }
//
//     public int getMaxCalories(){
//          return maxCalories;
//     }
//     public void setMaxCalories(int maxCalories){
//          this.maxCalories = maxCalories;
//     }
//


     public void addProducts(NutritionalValue product){
          if (product != null){
               if (product.getProtein() < maxProtein && product.getFats() < maxFats &&
                product.getCarbohydrates() < maxCarbohydrates && product.getCalories() < maxCalories){
                    for (int i = 0; i < food.length; i++) {
                         if (food[i] == null){
                              food[i] = product;
                              System.out.println("В список продуктов добавлен " + product.getName());
                              break;
                         }
                    }
               }
               else if (product.getProtein() > maxProtein){
                    System.out.println("Не возможно добавить " + product.getName() + " , превышена норма протеина");
               }
               else if (product.getFats() > maxFats){
                    System.out.println("Не возможно добавить " + product.getName() + " , превышена норма жиров");
               }
               else if (product.getCarbohydrates() > maxCarbohydrates){
                    System.out.println("Не возможно добавить " + product.getName() + " , превышена норма углеводов");
               }
               else if (product.getCalories() > maxCalories){
                    System.out.println("Не возможно добавить " + product.getName() + " , превышена норма колорий");
               }
          }
     }

    public String permittedProducts() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список разрешенных продуктов: \n");
        for (NutritionalValue nutritionalValue : food) {
            if (nutritionalValue != null)
                stringBuilder.append(nutritionalValue).append("\n");
        }
        return stringBuilder.toString();
    }

     @Override
     public String toString() {
          return "Food{" +
                  ", maxProtein=" + maxProtein +
                  ", maxFats=" + maxFats +
                  ", maxCarbohydrates=" + maxCarbohydrates +
                  ", maxCalories=" + maxCalories +
                  ", food=" + Arrays.toString(food) +
                  '}';
     }

}
