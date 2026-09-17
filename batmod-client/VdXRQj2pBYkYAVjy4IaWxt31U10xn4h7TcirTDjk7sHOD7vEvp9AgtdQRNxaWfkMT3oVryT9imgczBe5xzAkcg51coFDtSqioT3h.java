import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h
   extends tTSh2J2J1jxZ3Rqz225gl7jpC38TFZmJMllUjQtIZtHhntgJSFJ86hAJh4Ht7XU3BpolHRbfOiDCJDg3gvBH76qRF2fIkQOj5Pto {
   private static final Logger Button = LogManager.getLogger();
   private final TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD CustomSpinner;
   private final File ButtonAction;
   private final Set Spinner = Sets.newHashSet();
   private int Checkbox = -300;
   private boolean ProgressBar = false;

   public VdXRQj2pBYkYAVjy4IaWxt31U10xn4h7TcirTDjk7sHOD7vEvp9AgtdQRNxaWfkMT3oVryT9imgczBe5xzAkcg51coFDtSqioT3h(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1, File var2
   ) {
      this.CustomSpinner = var1;
      this.ButtonAction = var2;
   }

   public void BatModClient() {
      if (this.ButtonAction.isFile()) {
         try {
            this.BatModClient.clear();
            this.BatModClient
               .putAll(
                  this.BatModClient(
                     FileUtils.readFileToString(this.ButtonAction)
                  )
               );
         } catch (IOException var2) {
            Button.error(
               "Couldn't read statistics file " + this.ButtonAction,
               var2
            );
         } catch (JsonParseException var3) {
            Button.error(
               "Couldn't parse statistics file " + this.ButtonAction,
               var3
            );
         }
      }
   }

   public void Button() {
      try {
         FileUtils.writeStringToFile(
            this.ButtonAction,
            BatModClient(
               this.BatModClient
            )
         );
      } catch (IOException var2) {
         Button.error("Couldn't save stats", var2);
      }
   }

   @Override
   public void Button(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var2,
      int var3
   ) {
      int var4 = var2.ButtonAction()
         ? this.BatModClient(var2)
         : 0;
      super.Button(var1, var2, var3);
      this.Spinner.add(var2);
      if (var2.ButtonAction() && var4 == 0 && var3 > 0) {
         this.ProgressBar = true;
         if (this.CustomSpinner
            .nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n()) {
            this.CustomSpinner
               .AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
               .BatModClient(
                  new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                     "chat.type.achievement",
                     var1.CustomSpinner(),
                     var2.IntegerSpinner()
                  )
               );
         }
      }

      if (var2.ButtonAction() && var4 > 0 && var3 == 0) {
         this.ProgressBar = true;
         if (this.CustomSpinner
            .nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n()) {
            this.CustomSpinner
               .AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
               .BatModClient(
                  new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                     "chat.type.achievement.taken",
                     var1.CustomSpinner(),
                     var2.IntegerSpinner()
                  )
               );
         }
      }
   }

   public Set CustomSpinner() {
      HashSet var1 = Sets.newHashSet(this.Spinner);
      this.Spinner.clear();
      this.ProgressBar = false;
      return var1;
   }

   public Map BatModClient(String var1) {
      JsonElement var2 = new JsonParser().parse(var1);
      if (!var2.isJsonObject()) {
         return Maps.newHashMap();
      }

      JsonObject var3 = var2.getAsJsonObject();
      HashMap var4 = Maps.newHashMap();

      for (Entry var6 : var3.entrySet()) {
         nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var7 = hWMBbe1tOjEiAImIBH6FPljeGzgFkqwimOGmEMw740rfhtpEXwJTHpMWqJPXXtJXwCgg1q0TFBxFrqTzIEHfI11cHALyYAP79erU.BatModClient(
            (String)var6.getKey()
         );
         if (var7 != null) {
            xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV var8 = new xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV();
            if (((JsonElement)var6.getValue()).isJsonPrimitive() && ((JsonElement)var6.getValue()).getAsJsonPrimitive().isNumber()) {
               var8.BatModClient(
                  ((JsonElement)var6.getValue()).getAsInt()
               );
            } else if (((JsonElement)var6.getValue()).isJsonObject()) {
               JsonObject var9 = ((JsonElement)var6.getValue()).getAsJsonObject();
               if (var9.has("value") && var9.get("value").isJsonPrimitive() && var9.get("value").getAsJsonPrimitive().isNumber()) {
                  var8.BatModClient(
                     var9.getAsJsonPrimitive("value").getAsInt()
                  );
               }

               if (var9.has("progress") && var7.ColorTextPane() != null) {
                  try {
                     Constructor var10 = var7.ColorTextPane()
                        .getConstructor();
                     GB37CLEsuUx5EKhyli7onI2b2bej0WKCG9dd8K2cZtwlffkXphIJHyik5Z0hzrILtPJjIMJv1HcMmJ73Tkji1BdUZRrgF4hVa5Ca var11 = (GB37CLEsuUx5EKhyli7onI2b2bej0WKCG9dd8K2cZtwlffkXphIJHyik5Z0hzrILtPJjIMJv1HcMmJ73Tkji1BdUZRrgF4hVa5Ca)var10.newInstance(
                        
                     );
                     var11.BatModClient(var9.get("progress"));
                     var8.BatModClient(var11);
                  } catch (Throwable var12) {
                     Button.warn(
                        "Invalid statistic progress in "
                           + this.ButtonAction,
                        var12
                     );
                  }
               }
            }

            var4.put(var7, var8);
         } else {
            Button.warn(
               "Invalid statistic in "
                  + this.ButtonAction
                  + ": Don't know what "
                  + (String)var6.getKey()
                  + " is"
            );
         }
      }

      return var4;
   }

   public static String BatModClient(Map var0) {
      JsonObject var1 = new JsonObject();

      for (Entry var3 : var0.entrySet()) {
         if (((xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV)var3.getValue())
               .Button()
            != null) {
            JsonObject var4 = new JsonObject();
            var4.addProperty(
               "value",
               ((xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV)var3.getValue())
                  .BatModClient()
            );

            try {
               var4.add(
                  "progress",
                  ((xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV)var3.getValue())
                     .Button()
                     .BatModClient()
               );
            } catch (Throwable var6) {
               Button.warn(
                  "Couldn't save statistic "
                     + ((nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en)var3.getKey())
                        .Spinner()
                     + ": error serializing progress",
                  var6
               );
            }

            var1.add(
               ((nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en)var3.getKey()).Spinner,
               var4
            );
         } else {
            var1.addProperty(
               ((nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en)var3.getKey()).Spinner,
               ((xF6dsUqRO3jt3gHLPHeRHcTXzYwLKRp9v63DS1utJJciBtr2cOD4JKbHJvAqKpld4PieFq1GoI3rci687T5aOsqDzF7eqrx4v6VV)var3.getValue())
                  .BatModClient()
            );
         }
      }

      return var1.toString();
   }

   public void ButtonAction() {
      for (nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var2 : this.BatModClient
         .keySet()) {
         this.Spinner.add(var2);
      }
   }

   public void BatModClient(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      int var2 = this.CustomSpinner
         .AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I();
      HashMap var3 = Maps.newHashMap();
      if (this.ProgressBar
         || var2 - this.Checkbox > 300) {
         this.Checkbox = var2;

         for (nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var5 : this.CustomSpinner()) {
            var3.put(var5, this.BatModClient(var5));
         }
      }

      var1.BatModClient
         .BatModClient(
            new WJewMmAHqzWmU6wMTCfry4ZIMzbLzDWMkQ9gVIZxD3P8IMPeLpbDNBgwHuCkic88e2BSAGIsguNE1MYEbWX3Ovu3A3Xs1NFtZSTx(var3)
         );
   }

   public void Button(
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var1
   ) {
      HashMap var2 = Maps.newHashMap();

      for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var4 : chaQVajAXz8QxkwU9UYTOZTVScQaY5vp6ym1bDnZcAv3Bpy0hiusINj6IO4owYaYX9alNh8FxCIJZsJqAI58MstYOWnZk5sqAfi.Spinner) {
         if (this.BatModClient(var4)) {
            var2.put(var4, this.BatModClient(var4));
            this.Spinner.remove(var4);
         }
      }

      var1.BatModClient
         .BatModClient(
            new WJewMmAHqzWmU6wMTCfry4ZIMzbLzDWMkQ9gVIZxD3P8IMPeLpbDNBgwHuCkic88e2BSAGIsguNE1MYEbWX3Ovu3A3Xs1NFtZSTx(var2)
         );
   }

   public boolean Spinner() {
      return this.ProgressBar;
   }
}
