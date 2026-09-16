import java.util.Arrays;
import net.minecraft.client.main.Main;

public class Start {
   public static void main(String[] var0) {
      Main.main(
         (String[])Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new String[]{"--version", "mcp", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.8", "--userProperties", "{}"}, var0
         )
      );
   }

   public static Object[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Object[] var0, Object[] var1) {
      Object[] var2 = Arrays.copyOf(var0, var0.length + var1.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }
}
