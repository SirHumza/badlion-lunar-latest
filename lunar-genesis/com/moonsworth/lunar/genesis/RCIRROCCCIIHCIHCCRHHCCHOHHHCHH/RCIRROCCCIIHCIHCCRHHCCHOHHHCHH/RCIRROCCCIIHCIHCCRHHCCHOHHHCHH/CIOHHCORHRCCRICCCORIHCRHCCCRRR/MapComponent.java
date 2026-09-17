package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public interface IIHRRHORCRCROCHHOHORCHCROCIHRO<B> extends Map<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, B> {
   <T extends B> @Nullable T getInstance(Class<T> var1);

   <T extends B> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1);

   @CanIgnoreReturnValue
   <T extends B> @Nullable T putInstance(Class<T> var1, @Nullable T var2);

   @CanIgnoreReturnValue
   <T extends B> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1, @Nullable T var2);
}
