import com.google.common.collect.Maps;
import java.util.Map;

public enum g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb {
   BatModClient(0, "MinecartRideable"),
   Button(1, "MinecartChest"),
   CustomSpinner(2, "MinecartFurnace"),
   ButtonAction(3, "MinecartTNT"),
   Spinner(4, "MinecartSpawner"),
   Checkbox(5, "MinecartHopper"),
   ProgressBar(6, "MinecartCommandBlock");

   private static final Map BatModProgressBar = Maps.newHashMap();
   private final int ColorChooser;
   private final String IntegerSpinner;

   g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb(int var3, String var4) {
      this.ColorChooser = var3;
      this.IntegerSpinner = var4;
   }

   public int BatModClient() {
      return this.ColorChooser;
   }

   public String Button() {
      return this.IntegerSpinner;
   }

   public static g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb BatModClient(
      int var0
   ) {
      g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb var1 = (g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb)BatModProgressBar.get(
         var0
      );
      return var1 == null ? BatModClient : var1;
   }

   static {
      for (g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb var3 : values()) {
         BatModProgressBar.put(
            var3.BatModClient(), var3
         );
      }
   }
}
