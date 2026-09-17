public enum jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi {
   BatModClient(0, "options.difficulty.peaceful"),
   Button(1, "options.difficulty.easy"),
   CustomSpinner(2, "options.difficulty.normal"),
   ButtonAction(3, "options.difficulty.hard");

   private static final jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi[] Spinner = new jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi[values().length];
   private final int Checkbox;
   private final String ProgressBar;

   jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi(int var3, String var4) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
   }

   public int BatModClient() {
      return this.Checkbox;
   }

   public static jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi BatModClient(
      int var0
   ) {
      return Spinner[var0
         % Spinner.length];
   }

   public String Button() {
      return this.ProgressBar;
   }

   static {
      for (jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi var3 : values()) {
         Spinner[var3.Checkbox] = var3;
      }
   }
}
