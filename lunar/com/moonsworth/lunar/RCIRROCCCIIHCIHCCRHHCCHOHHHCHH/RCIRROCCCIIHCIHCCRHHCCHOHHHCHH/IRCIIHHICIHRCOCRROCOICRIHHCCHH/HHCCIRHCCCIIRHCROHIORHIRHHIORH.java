package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.net.URI;
import java.util.List;
import java.util.Map;
import okhttp3.Credentials;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private String username;
   private String password;

   public String getUsername() {
      return this.username;
   }

   public void setUsername(String var1) {
      this.username = var1;
   }

   public String getPassword() {
      return this.password;
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1) {
      this.password = var1;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var1, Map<String, String> var2, Map<String, String> var3, String var4, String var5, URI var6
   ) {
      if (this.username != null || this.password != null) {
         var2.put("Authorization", Credentials.basic(this.username == null ? "" : this.username, this.password == null ? "" : this.password));
      }
   }
}
