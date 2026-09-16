import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N
   extends LLf6R10RWEPkrBLsjVfXBzSHz5zQTSOs8poNVfGO0Bk1JO801NCOhokCBF93FTmE3XUUrsQW0Se5jXrwRCJAOm0ga7WSsevGxz2B {
   public IVs6B5tH6x0aYLTSiIvNS6sf1JmBfWBMenGQi9Uvlg7bystsTpueRfJulgVLScIWStEWxHe5kIvSl0aoOLiXyrgOlpi3WAJgO96N(File var1) {
      super(var1);
   }

   @Override
   protected lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonObject var1
   ) {
      return new FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(var1);
   }

   @Override
   public String[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      String[] var1 = new String[this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().size()];
      int var2 = 0;

      for (FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo var4 : this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
         .values()) {
         var1[var2++] = ((GameProfile)var4.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()).getName();
      }

      return var1;
   }

   protected String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      for (FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo var3 : this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
         .values()) {
         if (var1.equalsIgnoreCase(
            ((GameProfile)var3.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()).getName()
         )) {
            return (GameProfile)var3.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
         }
      }

      return null;
   }
}
