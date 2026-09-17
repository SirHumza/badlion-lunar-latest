import com.google.common.collect.Maps;
import java.util.Map;

public enum Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb {
   BatModClient("show_text", true),
   Button("show_achievement", true),
   CustomSpinner("show_item", true),
   ButtonAction("show_entity", true);

   private static final Map Spinner = Maps.newHashMap();
   private final boolean Checkbox;
   private final String ProgressBar;

   Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb(String var3, boolean var4) {
      this.ProgressBar = var3;
      this.Checkbox = var4;
   }

   public boolean BatModClient() {
      return this.Checkbox;
   }

   public String Button() {
      return this.ProgressBar;
   }

   public static Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb BatModClient(
      String var0
   ) {
      return (Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb)Spinner.get(
         var0
      );
   }

   static {
      for (Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb var3 : values()) {
         Spinner.put(
            var3.Button(), var3
         );
      }
   }
}
