package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.LinkedHashMap;
import java.util.function.Consumer;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> extends LinkedHashMap<K, V> implements CRRRICCRROCOHHOHIICIHORCOORRRH<K, V> {
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH IICRROHCCICIHROCIOIROOCIHIHOOI;
   private Consumer<K> RICIHHCHOICIIOCCCROOOIIIOHIHOO;

   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Runnable var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IICRROHCCICIHROCIOIROOCIHIHOOI, var1);
   }

   @Override
   public V get(Object var1) {
      return super.get(var1);
   }

   @Override
   public V put(K var1, V var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IICRROHCCICIHROCIOIROOCIHIHOOI, this, (K)var1, (V)var2);
   }

   @Override
   public V RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1, V var2) {
      return super.put((K)var1, (V)var2);
   }

   @Override
   public V remove(Object var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IICRROHCCICIHROCIOIROOCIHIHOOI, this, (K)var1);
   }

   @Override
   public V OOCCRCRCOHIIORCCORCRCIRRROIOOR(Object var1) {
      if (this.RICIHHCHOICIIOCCCROOOIIIOHIHOO != null) {
         this.RICIHHCHOICIIOCCCROOOIIIOHIHOO.accept((K)var1);
      }

      return super.remove(var1);
   }

   @Override
   public void clear() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IICRROHCCICIHROCIOIROOCIHIHOOI, this);
   }

   @Override
   public void OROCHCHOCCICHCCCIICORHOOOROOCH() {
      super.clear();
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      this.IICRROHCCICIHROCIOIROOCIHIHOOI = var1;
   }

   @Generated
   public void RIROICHCRROROHCCROOCCCCOCHCCRI(Consumer<K> var1) {
      this.RICIHHCHOICIIOCCCROOOIIIOHIHOO = var1;
   }
}
