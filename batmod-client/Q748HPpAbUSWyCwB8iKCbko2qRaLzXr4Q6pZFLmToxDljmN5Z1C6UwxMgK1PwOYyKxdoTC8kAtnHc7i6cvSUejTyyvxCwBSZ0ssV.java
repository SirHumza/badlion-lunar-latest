import java.util.Arrays;

public enum Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV {
   BatModClient("None"),
   Button("Overlay"),
   CustomSpinner("Inventory");

   public static final Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV ButtonAction = Button;
   private String Spinner;

   public static String[] BatModClient() {
      return Arrays.stream(values())
         .map(
            Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV::Button
         )
         .toArray(String[]::new);
   }

   public static String[] BatModClient(
      Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV[] var0
   ) {
      return Arrays.stream(var0)
         .map(
            Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV::Button
         )
         .toArray(String[]::new);
   }

   Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV(String var3) {
      this.Spinner = var3;
   }

   public String Button() {
      return this.Spinner;
   }
}
