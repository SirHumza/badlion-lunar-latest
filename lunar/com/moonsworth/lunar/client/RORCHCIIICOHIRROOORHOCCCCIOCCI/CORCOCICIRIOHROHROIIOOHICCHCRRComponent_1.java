package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public interface CRICCOOHHHCHOORCICOCOHIHOIRHOO extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   HRCHROOHRIHCRCRHRIIROCIRHOIRHH IOHRRIHCHOCOROCCHIRHORCRICRHRR();

   default <T> Stream<T> IHCRORHRORIICHRHRCHRRIRRHHOCOO(Class<T> var1) {
      return this.IOHRRIHCHOCOROCCHIRHORCRICRHRR()
         .stream()
         .map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::value)
         .filter(var1x -> var1.isAssignableFrom(var1x.getClass()))
         .map(var0 -> (T)var0);
   }

   @Nullable
   @Override
   default <T> T IHCRORHRORIICHRHRCHRRIRRHHOCOO(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      return this.IOHRRIHCHOCOROCCHIRHORCRICRHRR().IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
   }

   @Override
   default <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, T var2) {
      return this.IOHRRIHCHOCOROCCHIRHORCRICRHRR().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, (T)var2);
   }
}
