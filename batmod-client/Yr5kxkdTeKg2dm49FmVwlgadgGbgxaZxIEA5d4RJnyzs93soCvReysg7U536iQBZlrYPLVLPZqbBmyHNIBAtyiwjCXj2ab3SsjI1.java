import java.lang.reflect.Field;
import java.util.ArrayList;

public class Yr5kxkdTeKg2dm49FmVwlgadgGbgxaZxIEA5d4RJnyzs93soCvReysg7U536iQBZlrYPLVLPZqbBmyHNIBAtyiwjCXj2ab3SsjI1 {
   private static Field BatModClient = null;
   private static boolean Button = false;

   public static boolean BatModClient(
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var0
   ) {
      if (BatModClient == null) {
         if (Button) {
            return true;
         }

         BatModClient = Button(
            var0
         );
         if (BatModClient == null) {
            Button = true;
            return true;
         }
      }

      try {
         return BatModClient.getBoolean(var0);
      } catch (Exception var2) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Error calling Chunk.hasEntities"
         );
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            var2.getClass().getName() + " " + var2.getMessage()
         );
         Button = true;
         return true;
      }
   }

   private static Field Button(
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var0
   ) {
      try {
         ArrayList var1 = new ArrayList();
         ArrayList var2 = new ArrayList();
         Field[] var3 = WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj.class.getDeclaredFields();

         for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if (var5.getType() == boolean.class) {
               var5.setAccessible(true);
               var1.add(var5);
               var2.add(var5.get(var0));
            }
         }

         var0.ProgressBar(false);
         ArrayList var13 = new ArrayList();

         for (Object var6 : var1) {
            var13.add(((Field)var6).get(var0));
         }

         var0.ProgressBar(true);
         ArrayList var15 = new ArrayList();

         for (Object var7 : var1) {
            var15.add(((Field)var7).get(var0));
         }

         ArrayList var17 = new ArrayList();

         for (int var18 = 0; var18 < var1.size(); var18++) {
            Field var8 = (Field)var1.get(var18);
            Boolean var9 = (Boolean)var13.get(var18);
            Boolean var10 = (Boolean)var15.get(var18);
            if (!var9 && var10) {
               var17.add(var8);
               Boolean var11 = (Boolean)var2.get(var18);
               var8.set(var0, var11);
            }
         }

         if (var17.size() == 1) {
            return (Field)var17.get(0);
         }
      } catch (Exception var12) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            var12.getClass().getName() + " " + var12.getMessage()
         );
      }

      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
         "Error finding Chunk.hasEntities"
      );
      return null;
   }
}
