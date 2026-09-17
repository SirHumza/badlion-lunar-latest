import com.google.common.collect.Maps;
import java.util.Map;

public enum it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX {
   BatModClient("open_url", true),
   Button("open_file", false),
   CustomSpinner("run_command", true),
   ButtonAction("twitch_user_info", false),
   Spinner("suggest_command", true),
   Checkbox("change_page", true);

   private static final Map ProgressBar = Maps.newHashMap();
   private final boolean BatModProgressBar;
   private final String ColorChooser;

   it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX(String var3, boolean var4) {
      this.ColorChooser = var3;
      this.BatModProgressBar = var4;
   }

   public boolean BatModClient() {
      return this.BatModProgressBar;
   }

   public String Button() {
      return this.ColorChooser;
   }

   public static it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX BatModClient(
      String var0
   ) {
      return (it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX)ProgressBar.get(
         var0
      );
   }

   static {
      for (it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX var3 : values()) {
         ProgressBar.put(
            var3.Button(), var3
         );
      }
   }
}
