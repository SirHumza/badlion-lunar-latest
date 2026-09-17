import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.io.IOUtils;

public class PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB {
   public static final SimpleDateFormat BatModClient = new SimpleDateFormat(
      "yyyy-MM-dd HH:mm:ss Z"
   );
   private final Map CustomSpinner = Maps.newHashMap();
   private final Map ButtonAction = Maps.newHashMap();
   private final LinkedList Spinner = Lists.newLinkedList();
   private final TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD Checkbox;
   protected final Gson Button;
   private final File ProgressBar;
   private static final ParameterizedType BatModProgressBar = new B20UuH6yk61J7HAN8HOjZX9Z6smlJipV4jfIx6oUTpI617sdZFLbdclulsWpRrP8VQIdwU8nHfbFxDHG9xun5N1giFV1hkcy3BvU();

   public PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1, File var2
   ) {
      this.Checkbox = var1;
      this.ProgressBar = var2;
      GsonBuilder var3 = new GsonBuilder();
      var3.registerTypeHierarchyAdapter(
         yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV.class,
         new ok8wRl1i184Aev9fLEMhIIT4R1qL13SfT59GqoFFi8OXDwa1KvQhRdLMXjQqM7hHT9fosJmWZDQFsrDML8IkPGWtpDaIFEgR1M2g(this, null)
      );
      this.Button = var3.create();
      this.Button();
   }

   private static GameProfile BatModClient(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var0, String var1
   ) {
      GameProfile[] var2 = new GameProfile[1];
      NQLcwS8k0pLcRVmSFagKISyVXcUfauhO45vTfDK2ptOdvyBwRPnZ0LWt8o02WrKqau3oXtCv26ZuD1J8TzS6jvtPu3h33ZS2VBP7 var3 = new NQLcwS8k0pLcRVmSFagKISyVXcUfauhO45vTfDK2ptOdvyBwRPnZ0LWt8o02WrKqau3oXtCv26ZuD1J8TzS6jvtPu3h33ZS2VBP7(
         var2
      );
      var0.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82()
         .findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var3);
      if (!var0.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV() && var2[0] == null) {
         UUID var4 = EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u.BatModClient(
            new GameProfile((UUID)null, var1)
         );
         GameProfile var5 = new GameProfile(var4, var1);
         var3.onProfileLookupSucceeded(var5);
      }

      return var2[0];
   }

   public void BatModClient(GameProfile var1) {
      this.BatModClient(var1, (Date)null);
   }

   private void BatModClient(GameProfile var1, Date var2) {
      UUID var3 = var1.getId();
      if (var2 == null) {
         Calendar var4 = Calendar.getInstance();
         var4.setTime(new Date());
         var4.add(2, 1);
         var2 = var4.getTime();
      }

      String var7 = var1.getName().toLowerCase(Locale.ROOT);
      yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var5 = new yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV(
         this, var1, var2, null
      );
      if (this.ButtonAction.containsKey(var3)) {
         yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var6 = (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV)this.ButtonAction
            .get(var3);
         this.CustomSpinner
            .remove(
               var6.BatModClient().getName().toLowerCase(Locale.ROOT)
            );
         this.Spinner.remove(var1);
      }

      this.CustomSpinner
         .put(var1.getName().toLowerCase(Locale.ROOT), var5);
      this.ButtonAction.put(var3, var5);
      this.Spinner.addFirst(var1);
      this.CustomSpinner();
   }

   public GameProfile BatModClient(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var3 = (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV)this.CustomSpinner
         .get(var2);
      if (var3 != null
         && new Date().getTime()
            >= yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV.BatModClient(
                  var3
               )
               .getTime()) {
         this.ButtonAction
            .remove(var3.BatModClient().getId());
         this.CustomSpinner
            .remove(
               var3.BatModClient().getName().toLowerCase(Locale.ROOT)
            );
         this.Spinner
            .remove(var3.BatModClient());
         var3 = null;
      }

      if (var3 != null) {
         GameProfile var4 = var3.BatModClient();
         this.Spinner.remove(var4);
         this.Spinner.addFirst(var4);
      } else {
         GameProfile var5 = BatModClient(
            this.Checkbox, var2
         );
         if (var5 != null) {
            this.BatModClient(var5);
            var3 = (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV)this.CustomSpinner
               .get(var2);
         }
      }

      this.CustomSpinner();
      return var3 == null ? null : var3.BatModClient();
   }

   public String[] BatModClient() {
      ArrayList var1 = Lists.newArrayList(this.CustomSpinner.keySet());
      return var1.toArray(new String[var1.size()]);
   }

   public GameProfile BatModClient(UUID var1) {
      yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var2 = (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV)this.ButtonAction
         .get(var1);
      return var2 == null ? null : var2.BatModClient();
   }

   private yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV Button(
      UUID var1
   ) {
      yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var2 = (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV)this.ButtonAction
         .get(var1);
      if (var2 != null) {
         GameProfile var3 = var2.BatModClient();
         this.Spinner.remove(var3);
         this.Spinner.addFirst(var3);
      }

      return var2;
   }

   public void Button() {
      BufferedReader var1 = null;

      try {
         var1 = Files.newReader(this.ProgressBar, Charsets.UTF_8);
         List var2 = (List)this.Button
            .fromJson(var1, BatModProgressBar);
         this.CustomSpinner.clear();
         this.ButtonAction.clear();
         this.Spinner.clear();

         for (yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var4 : Lists.reverse(var2)) {
            if (var4 != null) {
               this.BatModClient(
                  var4.BatModClient(),
                  var4.Button()
               );
            }
         }
      } catch (FileNotFoundException var9) {
      } catch (JsonParseException var10) {
      } finally {
         IOUtils.closeQuietly(var1);
      }
   }

   public void CustomSpinner() {
      String var1 = this.Button
         .toJson(this.BatModClient(1000));
      BufferedWriter var2 = null;

      try {
         var2 = Files.newWriter(this.ProgressBar, Charsets.UTF_8);
         var2.write(var1);
         return;
      } catch (FileNotFoundException var8) {
         return;
      } catch (IOException var9) {
      } finally {
         IOUtils.closeQuietly(var2);
      }
   }

   private List BatModClient(int var1) {
      ArrayList var2 = Lists.newArrayList();

      for (GameProfile var4 : Lists.newArrayList(
         Iterators.limit(this.Spinner.iterator(), var1)
      )) {
         yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var5 = this.Button(
            var4.getId()
         );
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }
}
