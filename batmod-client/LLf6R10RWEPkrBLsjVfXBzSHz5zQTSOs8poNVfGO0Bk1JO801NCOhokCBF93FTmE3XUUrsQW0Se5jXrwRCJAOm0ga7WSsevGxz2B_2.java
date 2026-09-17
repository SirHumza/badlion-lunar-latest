import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class NWlfKOxwaMTImXvxpKmdCljyflavCiujjkYFZAoXA5MRpHdeh3SsejvqHkP9vyCVHtwQ00XIkKNeu8OyZNjsQbcB0LRdgl6mKIHy
   extends LLf6R10RWEPkrBLsjVfXBzSHz5zQTSOs8poNVfGO0Bk1JO801NCOhokCBF93FTmE3XUUrsQW0Se5jXrwRCJAOm0ga7WSsevGxz2B {
   public NWlfKOxwaMTImXvxpKmdCljyflavCiujjkYFZAoXA5MRpHdeh3SsejvqHkP9vyCVHtwQ00XIkKNeu8OyZNjsQbcB0LRdgl6mKIHy(File var1) {
      super(var1);
   }

   @Override
   protected lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C BatModClient(
      JsonObject var1
   ) {
      return new f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7(var1);
   }

   @Override
   public String[] Button() {
      String[] var1 = new String[this.CustomSpinner().size()];
      int var2 = 0;

      for (f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7 var4 : this.CustomSpinner()
         .values()) {
         var1[var2++] = ((GameProfile)var4.ButtonAction()).getName();
      }

      return var1;
   }

   public boolean BatModClient(GameProfile var1) {
      f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7 var2 = (f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7)this.BatModClient(
         var1
      );
      return var2 != null ? var2.Button() : false;
   }

   protected String Button(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile BatModClient(String var1) {
      for (f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7 var3 : this.CustomSpinner()
         .values()) {
         if (var1.equalsIgnoreCase(
            ((GameProfile)var3.ButtonAction()).getName()
         )) {
            return (GameProfile)var3.ButtonAction();
         }
      }

      return null;
   }
}
