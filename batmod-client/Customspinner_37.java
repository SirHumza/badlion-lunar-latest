import java.util.ArrayList;
import java.util.List;

public class VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h {
   private static final List BatModClient = new ArrayList();
   private String Button;
   private String CustomSpinner;

   public static List BatModClient() {
      return BatModClient;
   }

   public static VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h BatModClient(
      String var0, VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h var1
   ) {
      return BatModClient.stream()
         .filter(
            var1x -> var1x.CustomSpinner() == null
               ? var1x.ButtonAction().equals(var0)
               : var1x.CustomSpinner().equals(var0)
         )
         .findFirst()
         .orElse(var1);
   }

   public static void Button() {
      BatModClient.forEach(
         VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h::Spinner
      );
   }

   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h(String var1) {
      this.Button = var1;
      this.Spinner();
      BatModClient.add(this);
   }

   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h(String var1, boolean var2) {
      this.Button = var2 ? null : var1;
      this.CustomSpinner = var2 ? var1 : null;
      this.Spinner();
      BatModClient.add(this);
   }

   private void Spinner() {
      if (this.Button != null) {
         this.CustomSpinner = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            "bm.options.dropdown." + this.Button
         );
      }
   }

   public String CustomSpinner() {
      return this.Button;
   }

   public String ButtonAction() {
      return this.CustomSpinner;
   }

   @Override
   public String toString() {
      return this.Button == null
         ? this.CustomSpinner
         : this.Button;
   }
}
