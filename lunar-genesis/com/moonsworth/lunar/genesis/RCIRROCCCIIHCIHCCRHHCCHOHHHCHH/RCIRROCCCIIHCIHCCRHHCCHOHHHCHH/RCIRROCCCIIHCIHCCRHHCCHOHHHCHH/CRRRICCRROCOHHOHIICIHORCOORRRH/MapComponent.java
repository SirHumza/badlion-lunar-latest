package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<B> extends Map<Class<? extends B>, B> {
   <T extends B> T getInstance(Class<T> var1);

   @CanIgnoreReturnValue
   <T extends B> T putInstance(Class<T> var1, @Nullable T var2);
}
