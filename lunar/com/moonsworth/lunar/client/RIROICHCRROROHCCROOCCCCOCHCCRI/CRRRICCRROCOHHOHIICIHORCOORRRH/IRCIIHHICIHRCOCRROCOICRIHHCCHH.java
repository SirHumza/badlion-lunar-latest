package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.AutocompleteSuggestion;
import java.util.ArrayList;
import java.util.List;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   @SerializedName("name")
   private final String IHRRIIRCRICHOCOHCCRRCHCHIRHRRC;
   @SerializedName("primaryAddress")
   private final String OIHOOOHOOHIORHIOCCCOCCCRIHCROI;
   @SerializedName("addresses")
   private final List<String> IOOHOCCOHOICOHIIHHICCOCIOCRRIH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, List<String> var3) {
      this.IHRRIIRCRICHOCOHCCRRCHCHIRHRRC = var1;
      this.OIHOOOHOOHIORHIOCCCOCCCRIHCROI = var2;
      this.IOOHOCCOHOICOHIIHHICCOCIOCRRIH = var3;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AutocompleteSuggestion var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.getName(), var0.getPrimaryAddress(), new ArrayList<>(var0.getAddressesList()));
   }

   @SerializedName("name")
   public String name() {
      return this.IHRRIIRCRICHOCOHCCRRCHCHIRHRRC;
   }

   @SerializedName("primaryAddress")
   public String IRRCRICHHIIRCRORCOIRHROCCICROH() {
      return this.OIHOOOHOOHIORHIOCCCOCCCRIHCROI;
   }

   @SerializedName("addresses")
   public List<String> OOOCHHCRCCORIOIICRRICHIRRRIRCO() {
      return this.IOOHOCCOHOICOHIIHHICCOCIOCRRIH;
   }
}
