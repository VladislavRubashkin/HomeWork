package homeWork.Lessons6.ProductList;

public class NutritionalValue {

    private String name;
    private int protein;
    private int fats;
    private int carbohydrates;
    private int calories;

    public NutritionalValue(String name){
        this.name = name;
    }
    public NutritionalValue(String name, int protein){
        this.name = name;
        this.protein = protein;
    }
    public NutritionalValue(String name, int protein, int fats){
        this.name = name;
        this.protein = protein;
        this.fats = fats;
    }
    public NutritionalValue(String name, int protein, int fats, int carbohydrates){
        this.name = name;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }
    public NutritionalValue(String name, int protein, int fats, int carbohydrates, int calories){
        this.name = name;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("Имя продукта не может быть короче трех символов");
        }
        else {
            this.name = name;
        }
    }

    public int getProtein(){
        return protein;
    }
    public void setProtein(int protein){
        if (protein <= 0){
            throw new IllegalArgumentException("Количество белков не может быть отрицательным");
        }
        else {
            this.protein = protein;
        }
    }

    public int getFats(){
        return fats;
    }
    public void setFats(int fats){
        if (fats <= 0){
            throw new IllegalArgumentException("Количество жиров не может быть отрицательным");
        }
        else {
            this.fats = fats;
        }
    }

    public int getCarbohydrates(){
        return carbohydrates;
    }
    public void setCarbohydrates(int carbohydrates){
        if (carbohydrates <= 0){
            throw new IllegalArgumentException("Количество углеводов не может быть отрицательным");
        }
        else {
            this.carbohydrates = carbohydrates;
        }
    }

    public int getCalories(){
        return calories;
    }
    public void setCalories(int calories){
        if (calories <= 0){
            throw new IllegalArgumentException("Количество колорий не может быть отрицательным");
        }
        else {
            this.calories = calories;
        }
    }

    @Override
    public String toString() {
        return "NutritionalValue{" +
                "name='" + name + '\'' +
                ", Protein=" + protein +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';

    }
}
