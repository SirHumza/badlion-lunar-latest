import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N
   extends LLf6R10RWEPkrBLsjVfXBzSHz5zQTSOs8poNVfGO0Bk1JO801NCOhokCBF93FTmE3XUUrsQW0Se5jXrwRCJAOm0ga7WSsevGxz2B {
   public IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N(File var1) {
      super(var1);
   }

   @Override
   protected lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C BatModClient(
      JsonObject var1
   ) {
      return new FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(var1);
   }

   @Override
   public String[] Button() {
      String[] var1 = new String[this.CustomSpinner().size()];
      int var2 = 0;

      for (FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo var4 : this.CustomSpinner()
         .values()) {
         var1[var2++] = ((GameProfile)var4.ButtonAction()).getName();
      }

      return var1;
   }

   protected String BatModClient(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile BatModClient(String var1) {
      for (FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo var3 : this.CustomSpinner()
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
