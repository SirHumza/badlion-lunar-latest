public enum ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(
      0,
      "sand",
      "default",
      cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d.ButtonAction
   ),
   Button(
      1,
      "red_sand",
      "red",
      cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
   );

   private static final ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub[] CustomSpinner = new ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub[values().length];
   private final int ButtonAction;
   private final String Spinner;
   private final cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d Checkbox;
   private final String ProgressBar;

   ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub(
      int var3, String var4, String var5, cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d var6
   ) {
      this.ButtonAction = var3;
      this.Spinner = var4;
      this.Checkbox = var6;
      this.ProgressBar = var5;
   }

   public int Button() {
      return this.ButtonAction;
   }

   @Override
   public String toString() {
      return this.Spinner;
   }

   public cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d CustomSpinner() {
      return this.Checkbox;
   }

   public static ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= CustomSpinner.length) {
         var0 = 0;
      }

      return CustomSpinner[var0];
   }

   @Override
   public String BatModClient() {
      return this.Spinner;
   }

   public String ButtonAction() {
      return this.ProgressBar;
   }

   static {
      for (ilKwaKztb5oJ2Enfz4hOGcGq1B90pRg6WQN6oLXR0lv7D1UFKgpkTg0VKkeN9PfFmjkvtnpHe1rtYzZTTqajFoDRwLJrmUxy4Rub var3 : values()) {
         CustomSpinner[var3.Button()] = var3;
      }
   }
}
