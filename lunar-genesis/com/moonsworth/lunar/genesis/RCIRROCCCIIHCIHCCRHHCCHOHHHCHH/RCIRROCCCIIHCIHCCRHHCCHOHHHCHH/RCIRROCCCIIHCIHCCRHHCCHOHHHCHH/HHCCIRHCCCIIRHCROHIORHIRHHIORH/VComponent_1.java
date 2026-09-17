package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use CacheBuilder.newBuilder().build()")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V> {
   @Nullable V getIfPresent(@CompatibleWith("K") Object var1);

   V get(K var1, Callable<? extends V> var2);

   OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Iterable<?> var1);

   void put(K var1, V var2);

   void putAll(Map<? extends K, ? extends V> var1);

   void invalidate(@CompatibleWith("K") Object var1);

   void invalidateAll(Iterable<?> var1);

   void invalidateAll();

   long size();

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH OIRICHROOIIHRROCOICCOOHCOOHOHC();

   ConcurrentMap<K, V> asMap();

   void cleanUp();
}
