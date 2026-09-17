package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @RegExp
   private static final String RHHICCOHRORIHHICCHCOIICHIRROIO = "(?<target>\\b[a-zA-Z0-9_-]{3,16}\\b)";
   private static final LoadingCache<String, Pattern> IIRHIRORIHCCCHRORIOIRORRRCCOCO = CacheBuilder.newBuilder()
      .expireAfterWrite(5L, TimeUnit.MINUTES)
      .build(new CacheLoader<String, Pattern>() {
         public Pattern CRCICOIHIIOIHIOOIIHORHOOCROHIR(@NotNull String var1) {
            return Pattern.compile(var1);
         }
      });
   @SerializedName("name")
   private final String HRHCOCOHOCORRHHORHHOCCCRIIICCR;
   @SerializedName("patterns")
   private final List<String> RCOCHOOCHCOCRIOIHCOICIRICOHCHC;
   @SerializedName("type")
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICOIRHHRCCOHOIHOHIICOHOCRHHIRO;
   @SerializedName("gameTypes")
   private final Set<String> CIIOOHOIRHOHHORICRIOHHIOIIHIOR;

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(boolean var1, @Nullable String var2) {
      boolean var3 = this.ICOIRHHRCCOHOIHOHIICOHOCRHHIRO == IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL
         || this.ICOIRHHRCCOHOIHOHIICOHOCRHHIRO == IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL == var1;
      boolean var4 = var2 == null || this.CIIOOHOIRHOHHORICRIOHHIOIIHIOR.isEmpty() || this.CIIOOHOIRHOHHORICRIOHHIOIIHIOR.contains(var2);
      return var3 && var4;
   }

   public Optional<String> ORHIOICIOCRRHOOCOHRORIHICHRCRR(String var1, String var2) {
      return this.RCOCHOOCHCOCRIOIHCOICIRICOHCHC
         .stream()
         .map(var3 -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var1, var2))
         .flatMap(Optional::stream)
         .findFirst();
   }

   private Optional<String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3) {
      String var4 = var1.replace("<username>", Pattern.quote(var2)).replace("<target>", "(?<target>\\b[a-zA-Z0-9_-]{3,16}\\b)");
      Matcher var5 = ((Pattern)IIRHIRORIHCCCHRORIOIRORRRCCOCO.getUnchecked(var4)).matcher(var3);
      if (var5.find()) {
         String var6 = var5.group("target");
         return Optional.ofNullable(var6);
      } else {
         return Optional.empty();
      }
   }

   public String getName() {
      return this.HRHCOCOHOCORRHHORHHOCCCRIIICCR != null ? this.HRHCOCOHOCORRHHORHHOCCCRIIICCR : "UNKNOWN_FILTER";
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, List<String> var2, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3, Set<String> var4) {
      this.HRHCOCOHOCORRHHORHHOCCCRIIICCR = var1;
      this.RCOCHOOCHCOCRIOIHCOICIRICOHCHC = var2;
      this.ICOIRHHRCCOHOIHOHIICOHOCRHHIRO = var3;
      this.CIIOOHOIRHOHHORICRIOHHIOIIHIOR = var4;
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      HYPIXEL,
      OTHER,
      ALL;
   }
}
