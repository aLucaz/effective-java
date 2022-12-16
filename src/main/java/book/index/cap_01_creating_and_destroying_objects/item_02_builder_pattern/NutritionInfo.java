package book.index.cap_01_creating_and_destroying_objects.item_02_builder_pattern;

import lombok.ToString;

@ToString
public class NutritionInfo {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // required
    private final int servingSize;
    private final int servings;
    //optional
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      this.calories = val;
      return this;
    }

    public Builder fat(int val) {
      this.fat = val;
      return this;
    }

    public Builder sodium(int val) {
      this.sodium = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      this.carbohydrate = val;
      return this;
    }

    public NutritionInfo build() {
      return new NutritionInfo(this);
    }
  }

  public NutritionInfo(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }
}
