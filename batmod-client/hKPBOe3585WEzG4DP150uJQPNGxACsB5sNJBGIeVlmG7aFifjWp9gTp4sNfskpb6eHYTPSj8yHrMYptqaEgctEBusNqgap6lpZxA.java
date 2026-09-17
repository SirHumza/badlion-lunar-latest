import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA {
   private static final Logger Button = LogManager.getLogger();
   private static final Map CustomSpinner = Maps.newHashMap();
   private static final Map ButtonAction = Maps.newHashMap();
   private static final Map Spinner = Maps.newHashMap();
   private static final Map Checkbox = Maps.newHashMap();
   private static final Map ProgressBar = Maps.newHashMap();
   public static final Map BatModClient = Maps.newLinkedHashMap();

   private static void BatModClient(Class var0, String var1, int var2) {
      if (CustomSpinner.containsKey(var1)) {
         throw new IllegalArgumentException("ID is already registered: " + var1);
      }

      if (Spinner.containsKey(var2)) {
         throw new IllegalArgumentException("ID is already registered: " + var2);
      }

      if (var2 == 0) {
         throw new IllegalArgumentException("Cannot register to reserved id: " + var2);
      }

      if (var0 == null) {
         throw new IllegalArgumentException("Cannot register null clazz for id: " + var2);
      }

      CustomSpinner.put(var1, var0);
      ButtonAction.put(var0, var1);
      Spinner.put(var2, var0);
      Checkbox.put(var0, var2);
      ProgressBar.put(var1, var2);
   }

   private static void BatModClient(
      Class var0, String var1, int var2, int var3, int var4
   ) {
      BatModClient(var0, var1, var2);
      BatModClient.put(
         var2, new hnlg75yFDfNNghy880cAQfoiy9epOuzRX8SMqyUjdYAP3BuMsvaPGUnlFyzfyg8N07SEVb7sf0O82NcdsH8SE2O1MElxe3gW3IwG(var2, var3, var4)
      );
   }

   public static Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM BatModClient(
      String var0, xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var2 = null;

      try {
         Class var3 = (Class)CustomSpinner.get(var0);
         if (var3 != null) {
            var2 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var3.getConstructor(
                  xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY.class
               )
               .newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var2 = null;
      if ("Minecart".equals(var0.IntegerSpinner("id"))) {
         var0.BatModClient(
            "id",
            g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.BatModClient(
                  var0.Checkbox("Type")
               )
               .Button()
         );
         var0.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN("Type");
      }

      try {
         Class var3 = (Class)CustomSpinner.get(
            var0.IntegerSpinner("id")
         );
         if (var3 != null) {
            var2 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var3.getConstructor(
                  xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY.class
               )
               .newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.Checkbox(var0);
      } else {
         Button.warn(
            "Skipping Entity with id " + var0.IntegerSpinner("id")
         );
      }

      return var2;
   }

   public static Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM BatModClient(
      int var0, xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var2 = null;

      try {
         Class var3 = BatModClient(var0);
         if (var3 != null) {
            var2 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var3.getConstructor(
                  xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY.class
               )
               .newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 == null) {
         Button.warn("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var0
   ) {
      Integer var1 = (Integer)Checkbox.get(var0.getClass());
      return var1 == null ? 0 : var1;
   }

   public static Class BatModClient(int var0) {
      return (Class)Spinner.get(var0);
   }

   public static String Button(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var0
   ) {
      return (String)ButtonAction.get(var0.getClass());
   }

   public static int BatModClient(String var0) {
      Integer var1 = (Integer)ProgressBar.get(var0);
      return var1 == null ? 90 : var1;
   }

   public static String Button(int var0) {
      return (String)ButtonAction.get(
         BatModClient(var0)
      );
   }

   public static void BatModClient() {
   }

   public static List Button() {
      Set var0 = CustomSpinner.keySet();
      ArrayList var1 = Lists.newArrayList();

      for (String var3 : var0) {
         Class var4 = (Class)CustomSpinner.get(var3);
         if ((var4.getModifiers() & 1024) != 1024) {
            var1.add(var3);
         }
      }

      var1.add("LightningBolt");
      return var1;
   }

   public static boolean BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var0, String var1
   ) {
      String var2 = Button(var0);
      if (var2 == null && var0 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u) {
         var2 = "Player";
      } else if (var2 == null && var0 instanceof OeVe6x8UgYmdnjTvMmRtQrR1YqXwgTa8QbP6adPgOlMn7zAkOwj3KUII1IlR5JUacvOCYNJcgUX6W8VW2Ilp4moycemrBmQCQaH3) {
         var2 = "LightningBolt";
      }

      return var1.equals(var2);
   }

   public static boolean Button(String var0) {
      return "Player".equals(var0) || Button().contains(var0);
   }

   static {
      BatModClient(
         fKeG9s4EK64XIpPCFZENGxw3ZF8SFNgfFfhniJ9IRYvo1Wk5O6eryh1flMvCsQ8bR5vugDjKNeTVqbUhZjJYm6qBEc7FngiKKYLm.class, "Item", 1
      );
      BatModClient(
         WOVuYrEFg9npSblEjwBdfVKsdmeh44wW2NpiOM7PHWiYiRKZQ1jgR3CiRBO4xZCDa0w6KyUkOwoUfx9JEGoz8tLxBfM32vtJPzXD.class, "XPOrb", 2
      );
      BatModClient(
         i3tt3Hxy5fNt0S7sM0YrjQxPn6Y8UtLlMhn8OhrCvQZZs1FaVSA7UCTRWfPCfiSjC1gZfsR2zDLYk9NVfAtLXggbJX0HoWt0iTTQ.class, "ThrownEgg", 7
      );
      BatModClient(
         CWvYVexGlzn4pXFccrz7jjyOBikFS2VFSvlk8jHCcEUp9faBkixNbjBdnl2N974SV6G8UtM0qLZtkHI2979Bdj91xcwK4kGCE5g.class, "LeashKnot", 8
      );
      BatModClient(
         Lmq9Ke0IpIAZ01THdVVjEbgoYTn1mnBMjWu9N7uGVQXhLdAd14IcfdBIs3BwDbbwx9Jy31nyovLH6YE3uFrFKP9X1nEkS61vV9BW.class, "Painting", 9
      );
      BatModClient(
         PuUjpaHvQnIRiPvUgOWtnN80hoqT0son9tqYTrTMwCNyTh0QRwfiN00zlnQZ0aGGuCT81s7mVjYpGfbwu7Qrf8UBN6Scmm6x6oCR.class, "Arrow", 10
      );
      BatModClient(
         Zi1kWU6x0lDNjklS1SeZPXcpwepmlt5E4D1SozVWTZtFKIgRYjFYIrquDaxgffRaABlQRDE2YoTdCr64iIqJQbyfVaKiSpADvUrf.class, "Snowball", 11
      );
      BatModClient(
         aLOkLKvBtqI16RBfsRXxfItsH9P6kujdmRT7xCKTb7KuE8AJNkGsZO1yTsaNT24FWjZlnVLNTtznwtTG0KMFd1xMch1fRYLgW8g.class, "Fireball", 12
      );
      BatModClient(
         F4jDIGM8HL0ej5XVwewCi7nvBjeV9X8pXYCHjwjt6ldKWPMIZ7ECWUrwDsPWNTGCeQTFtGctYjRgs6vI1lGKS6uyW0bsBsHJv6Yk.class, "SmallFireball", 13
      );
      BatModClient(
         HT3k9BSIsF2oKkxDKjbPSxObqyTXRUnEGjstrcVwKvzxxlhsND4RhKvHR74gEPFX5c2eqXUZZuzAV31J7TRXxtzFkE8XsvpDJZc.class, "ThrownEnderpearl", 14
      );
      BatModClient(
         SDY2VWzUbI0MR5fcflIjIPKy3o7lpvcW251CuYB5jiwbeW8gW1p9obsvYjPbVEk6yck6HpHX5BKQM064Fe51zmvbZgnESQNyJUO0.class, "EyeOfEnderSignal", 15
      );
      BatModClient(
         wPa77zkDZJKBfjXEBaqtEctS9EukiDbfRGSghyUiRDIdnHRJXm6ng5kNIjHGNIfXtyIXAnXac9CZL5QpbBtwwV9I5c7CgSmAH2HB.class, "ThrownPotion", 16
      );
      BatModClient(
         ZTmA6JTvML5KMlNxJNPtF6EYS8QC7jmxRDl01cM5pWoETSAdJFBcRUKjH6WuRjzFMGUQObsfo3dCybuEpreMFqSN8KCnpLzSKEZ5.class, "ThrownExpBottle", 17
      );
      BatModClient(
         OvUujot6oh3kXdEZZ1wwlbipUHlxSTzK4EP9kbh2bTD3XSc9doloOdhbCd5bQj07VbsjrjitM3zasIJ7xZYJGjvKg3RuJjR31Se9.class, "ItemFrame", 18
      );
      BatModClient(
         X4vn6YippgloJmK4eXWFBTa0f9Nc0u8DonYvgy5VukUdSVIHq3P7AJ7bX5G7qzlhxl6zjx6DxbswWNwNYj3hZrk2QQombK9iIn6p.class, "WitherSkull", 19
      );
      BatModClient(
         ghs8AfdZca5vG6xjqOQOGQTECKEDj1kW45T2smI9Quj65ItJHPAMgkHK0NbkhZdtTgUIHIMO64vFM5W36ba8J6L4IzBiXu6DxTd.class, "PrimedTnt", 20
      );
      BatModClient(
         MHBBvf0y543Qfj2XETYr4mcu3Ydjxez7KtM1MgntgvOaqYAN0WsQlhA5unZJVg7reCZ6JvHkSlm7mKm9KSlV8cszhqgKFbAN9Flk.class, "FallingSand", 21
      );
      BatModClient(
         C17qcGOtMI3f8n3IAkoR1W3dihfPV4sUu9OzVHnEUZAZkESx5gLNnoNSZZxHRnyPRVqtKqJdnd1MOAfzZbl0DxjPmPztQUJ5tejP.class, "FireworksRocketEntity", 22
      );
      BatModClient(
         o1J5ywvkV0mqvuz9K7umvLnQ3BRRDeSfffwiUREsRQfTa0QuQ9hvhISk8xLbGKmtCL5wt6U3PO1Cemu1dzawBI6gGbKJsmQklrsT.class, "ArmorStand", 30
      );
      BatModClient(
         HCbwa0qZlxXeGIEh9H9xVLOecePdfSrLECGwx0XdK0WTFNELhlIORzbzWZT6KyfMSoMxGC2batQDab8AdK7b7HqoD7oXCyx75AJ1.class, "Boat", 41
      );
      BatModClient(
         dAFBvkHsIZjcsZI7Jo0f2WXmWAYHckkijNoo2dD0nRkMXHtPrY8KhLynp67XPXpxKbIfrZoh0YFPxCZ1fhnR0gQLNB36ELzZbk4.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.BatModClient
            .Button(),
         42
      );
      BatModClient(
         kUhFGuVYOR3fXbqSl1COFfIu2AyLQIEOGUtMlY4pQceK7DzyIZhEqZZGuob9BmK4Ntdibj5159Z8W9VayVEKgbUw02mKcSh3Nmgg.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.Button
            .Button(),
         43
      );
      BatModClient(
         j3DVJHgvzo8ohTT9gnGYDX7k0qtDiHhCw79Pk92x1P38KeNN1Coc7zXu96HRF4tcOH51DWSJOGbfvF63rNpJfYU7DxWi2OkOB6HK.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.CustomSpinner
            .Button(),
         44
      );
      BatModClient(
         IyykimxgtIuwxqoArtLw7hoFb0ono3lwyS7ZMTlV79ttf0rCOofW8x0zgN1rdyRW9h5GuKMdiLLD7N6P1XJbyhKX4gaEoD9PdNSs.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.ButtonAction
            .Button(),
         45
      );
      BatModClient(
         LlUfAojoADlsmc8Lq6Zf4167ah3diKXLPDQdQTG2FBC6cWpodGXVfVFHhlrqtxPjzUjgamofYBx4kHbmSQJ2G9Vkzk4H8Hc7T2FI.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.Checkbox
            .Button(),
         46
      );
      BatModClient(
         zbtqTfJMQTtKHNc3QQ6TuvHZEVgMho7KfDR9NH0zQczoqhRk8rBnRX6YnxqwscElUOGDF91FKjHZPUkscSwUgrHzVqGACivHNbUU.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.Spinner
            .Button(),
         47
      );
      BatModClient(
         FGGBO6vaOYTZQKNA57dAA3GKW93V78lYtMfbrzZpCRRe2wTX7fDrPYWhYYBqD9mO5PaCLMFyCzxK5MTI7lvlxS4BtzbraVDzEZz7.class,
         g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.ProgressBar
            .Button(),
         40
      );
      BatModClient(
         it45MyBnm2IZZfPuRP66nD6SIdiJpqBCNKiOC2x6MO4Od0xAdGqRQUQFZBvu7XKXYghppBHFiQ7KJ2WG795NPnwzqu5fPMJ0fnuA.class, "Mob", 48
      );
      BatModClient(
         QgWyEeRUcX7tO3xzXqFBF9q8dtjRmBs10AV6zDxgoEl5eI4qG9fvl5ZprC3sPtYXo3ruLT7C3sfQVq9VgkYsNoyqcNRBF3hyexMQ.class, "Monster", 49
      );
      BatModClient(
         ZBGTZBmuEfsjtx5KW2LTFDXg8DAtgVi6DuE1xZTjsEzyf10GHNLjAU4gyT5kcm0U5g3Bnk1muoi6ulSoZjVYotNdVWvoJ7TBUeZO.class, "Creeper", 50, 894731, 0
      );
      BatModClient(
         nAEINOPTHItLCq0rV9LRROduGGcRpJTTN3tBBZmjmEOpqdGUxASLTzCZisbFu98v4CSRimY32qsBpBIkpW28MBviopQbmgWTOMpF.class, "Skeleton", 51, 12698049, 4802889
      );
      BatModClient(
         lmIIxfLIDEORCEbk0I5AT9iImDNB0iJ45F0eYDbXau3zKoViBBSyB7s8koatZyUb8SYPiDEjAaZPb5sX0QagrBaqw7G5H5AoLqIl.class, "Spider", 52, 3419431, 11013646
      );
      BatModClient(
         UrT3W8Pjr4ANYIPWDkas4w3k45taFYJL9YHg9uQe8Yk3p0LyC08xgiIVRDo0X2nsSqaGQVAiQh5Ry02BHV1HSt5LQRKa1bMiAM3W.class, "Giant", 53
      );
      BatModClient(
         MIWxKURrOycNXaNQiOPEjNZ6xHTLN1iWHpRt9mblPuCmp0CQOn0CEP2i0bqz1ChpmERPsFvv4Z0W5d08jeP0hSsknhqdhQEMyzAD.class, "Zombie", 54, 44975, 7969893
      );
      BatModClient(
         zMQslFVgV1Ge4WhWS4J3e0w8rxXLhDNZZDGFJx5UKgcJbxqDFTNMqnSpuxg48uRjuGmWc4aIVGpWWvFWdtDQSLwVROkhJaNXI0sJ.class, "Slime", 55, 5349438, 8306542
      );
      BatModClient(
         RLy4AIxWMgT6Tr5u6NOYHopWY0PHgeKCpl1nrpkqOxgwh3aQJfw9vt6JgcKYDKFjg7wIfOeiF5fvRk5UYtIpbnsNTUpHiZ0Na3KJ.class, "Ghast", 56, 16382457, 12369084
      );
      BatModClient(
         x5BMUvtZ7PRfeZYqABPuU6QBDGl7rZMvLAduhRUVpcqGpZMJSqlaGfeCh1uIq4nTOZtGJ7BsA9ibKsPCGe9chmZMZBtBjeIuElY.class, "PigZombie", 57, 15373203, 5009705
      );
      BatModClient(
         lpsXQcsyvi9E3SQLBMJw7NcdzHpzDqAjKlQxaouAJkyZpV695vmFTRQsttFVN6kv906cuY64poxsgxGQjYZL3zQp5RqGfqXAjtG7.class, "Enderman", 58, 1447446, 0
      );
      BatModClient(
         qpwDFnYLAV0NMbANDXKna0Hmt0T5vLsXJvqPpaWE0y6ZwRhCMxrhv5kWK3yaXRhUTLm5Cv8FUp7q3T7pML2RKE4vrPNOZhxuFpKt.class, "CaveSpider", 59, 803406, 11013646
      );
      BatModClient(
         TpgMzgNeERyXJpWTPdNAb33p5Bvs0Bgxg2SQHK10AQ5x1NcoFyl7gg3jKjl7UtprWcZ17mpzXVjduWCR5OgOTSqTdq66arA3nfaa.class, "Silverfish", 60, 7237230, 3158064
      );
      BatModClient(
         Wjjv3Qo57I73xuFeZzfBwz1xyBax5fcXvknjxNfsQ9hZw3jObph9i6JDy3wCyifxIx8CHeFcllFp2G9j9uHlmFs7sVD58zcLn9Bo.class, "Blaze", 61, 16167425, 16775294
      );
      BatModClient(
         b64xbqZjhUYRV0gMdQpw44fILJIOaE00NwRFjS0hU45rlk9xFruH7UoCuIPqsl1cRxh0Baf7Q0vdbdAbQvmGOjkudX3Xio0eAdD.class, "LavaSlime", 62, 3407872, 16579584
      );
      BatModClient(
         GSr3Jw5qpb7VmQBoXXlVZ9gFJna7gGZ3fKMS6oCfh90ptW53xZYrHvhTttRO6x0t6uGUBrSurSAosk0xWErg4YSWIsUkFEYFZQiS.class, "EnderDragon", 63
      );
      BatModClient(
         on1Xqi4xw6daUCs1YII599ukZNVseJBCFSWMlMOq9hIBCCUvhd8nOGUCJFbreNRD4dpFAuZfYLmhOGyCp7Z7L4BzixdtTajekPF8.class, "WitherBoss", 64
      );
      BatModClient(
         BuOyGa9pC1MQ2AiUfclgVqtcYJ53Oks8oQwHqaFMPaLS7Ra9s6UYffqRtSQVkAn3MryAXaou38CjkljIIWWORnVa29GWfX4pOC60.class, "Bat", 65, 4996656, 986895
      );
      BatModClient(
         bTSNqwk5cdZLso24GLopn1qMYgktaAKRnOBO77Q717lqONsf7Xs4dls1qHzU9eLeM2ojSJ0XFyOmtnmg3rRJPUEHDcO9xCAD6LaW.class, "Witch", 66, 3407872, 5349438
      );
      BatModClient(
         krAt91Emy7tQLWCAmRVJdPEqvY9XcJwwfaCsIIQIqXr5IiKFBX0TA2Qivcj9cUDH4kp4KZdzz64kDNEQwLAb9ANnpJOnqxBVQQxl.class, "Endermite", 67, 1447446, 7237230
      );
      BatModClient(
         ZtyM8qo9IZpZIVkcj0FAny1WT8jpiZ6oXSvx5U2ex48ZOwaVCiixFwuKSJWN3XJyiKYTaMnvvxdh6ZMCsHgByvXMbZ3gbg5F0ePF.class, "Guardian", 68, 5931634, 15826224
      );
      BatModClient(
         KMUeLHamEBn7fxCZxSwUvFvkcVJimTyQX8t873BTOELypp9i5bLCFxEkpjgyC1t3zKsxxA2C3cpV7udkzWhybqILj7Ltb3ZvkXQT.class, "Pig", 90, 15771042, 14377823
      );
      BatModClient(
         sw0zE07EC7xjWjtELxe5OAGm9dYpcvaPVIBu0MCSJ5HQlGadi2ZyyZHeszX4EP3WQqwc3fBXKrQgHjE4eEUc7m5PpcKJUbIFhIlx.class, "Sheep", 91, 15198183, 16758197
      );
      BatModClient(
         yQmzJ7ufKlrwvDciCaMDBLYT7MG979ncHqkQkZR12jjTSQUUf0hAM4aE4SNIb1csEsohxjEiN1Pmxqs8miJjQwWAUArznevrh1gC.class, "Cow", 92, 4470310, 10592673
      );
      BatModClient(
         QDrDSYDX8LGhcTcLR0V1jNQjCICpjAgmRNa0reyxQPbyfkF5I1kZOzPitMncF5BnJKyyGbbSPUqAmXCxZPqJ6RXVtBaGbvpe18KO.class, "Chicken", 93, 10592673, 16711680
      );
      BatModClient(
         DCME1AZ5SbaLYXyvpep5F6ilcHlDnY4j9OZ9EDVeoxXT5Jb4h0Tm6IuVKnR2xwe3dmafR2WgRSatAe19Arf2hW1XMHO40xs0eIk.class, "Squid", 94, 2243405, 7375001
      );
      BatModClient(
         u1o5UwKwt97pFWrVUjJY1taUMi00kM7HLXx3ARhLYDULUsHrictmzMIsRdnzGH7n5hBloj567ZNKsMuZv9FGhBSWNWkTrvg5LfPc.class, "Wolf", 95, 14144467, 13545366
      );
      BatModClient(
         JZugyPPndUQDullhiOrR5cZ4DaAElkZe4ZPbd83pDDwa7XTZbMo7ivHX98s0jVU0gz9dRSMNyEjksywX5mrkB6zAppSS5XuhUuJH.class, "MushroomCow", 96, 10489616, 12040119
      );
      BatModClient(
         B9kfwlnjysWKAVGBQfX16RSWLEGHiMTOToFXTP0WiCk0QVyq7VGlLHoXLKXbqeKXEDSkUEefKRnLkraoRxLqaRrM5gdYFx65e2af.class, "SnowMan", 97
      );
      BatModClient(
         JvU1FkHtnq3h8EH0h93mhPI5vLS9O1q3j8VviywyFdPCEYpEqPjfAuyWrUeO8LXZqEj153dx4ah773sjG4KeSndMbx6pNxF6RL4.class, "Ozelot", 98, 15720061, 5653556
      );
      BatModClient(
         x87x98HfFmaEmqxC03eAiHdjTgJyMLc96rH8fWoWdAaFNaIWXbl5pKLoyrajW54UISznTmzB2oZCBUH2Yzeju3aJ2oDaT394GZGB.class, "VillagerGolem", 99
      );
      BatModClient(
         GIHukVMItQj4MVXWl12qNCvpQK7wvRqqYYb1g7UZnvK8HL1TQ4bhaziY5n13xYKWAMhYwZ9MAjJZEnxu3An2yfqQQVaExuRTXrl4.class, "EntityHorse", 100, 12623485, 15656192
      );
      BatModClient(
         WyJYyLhpN30PnQBYIuiuR0TF8khu3e9WYbuiyFXQWT0ON6Rse9RMLEa0voP5Qqi6dlMwaCBU5haLqvOBqeoUX2d74NV9rRLZXJTI.class, "Rabbit", 101, 10051392, 7555121
      );
      BatModClient(
         oDL1qXE9hkrchYjZzy3EgJWRQXDhEt4RtnszoifDW56O36ove0V3W0FXJkK1cM5qjiztp9Orjmwurw94t5cbBvMTBCsMoHicDsZc.class, "Villager", 120, 5651507, 12422002
      );
      BatModClient(
         bIjQBfRB8kEyLgXDeKNcfCIcXplDvD07xrBaouGdO3k9cyHcOmEzbYiQY5fCgflEwhDNMT0J0o930NGqtA4gNgNhbjD45Yl6W0ay.class, "EnderCrystal", 200
      );
   }
}
