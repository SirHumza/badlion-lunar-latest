package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ProfileLookupCallback {
   private GameProfile COOCCIOIHHIOHOHHCHRORCCRCHCCRH;
   private CRRRICCRROCOHHOHIICIHORCOORRRH OIRICRROHCHHIORCHROOHCRIROHRIR;

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      this.onProfileLookupSucceeded(new GameProfile(var2, var1));
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.COOCCIOIHHIOHOHHCHRORCCRCHCCRH = var1;
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Exception var1) {
      if (var1 instanceof ProfileNotFoundException) {
         this.OIRICRROHCHHIORCHROOHCRIROHRIR = new CRRRICCRROCOHHOHIICIHORCOORRRH("No account with that username exists", var1);
      } else {
         this.OIRICRROHCHHIORCHROOHCRIROHRIR = new CRRRICCRROCOHHOHIICIHORCOORRRH("An unknown server error occurred", var1);
      }
   }

   public GameProfile CIHOIIIHOHCCRCIOCOHHIIHHHOICRO() {
      if (this.COOCCIOIHHIOHOHHCHRORCCRCHCCRH != null) {
         return this.COOCCIOIHHIOHOHHCHRORCCRCHCCRH;
      } else {
         throw this.OIRICRROHCHHIORCHROOHCRIROHRIR;
      }
   }
}
