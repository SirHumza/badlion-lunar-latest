package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.Tag;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.Objects;
import javax.annotation.Nullable;

public final class FieldFinder<FT> implements OpticFinder<FT> {
   @Nullable
   private final String name;
   private final Type<FT> type;

   public FieldFinder(@Nullable String var1, Type<FT> var2) {
      this.name = var1;
      this.type = var2;
   }

   @Override
   public Type<FT> type() {
      return this.type;
   }

   @Override
   public <A, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findType(Type<A> var1, Type<FR> var2, boolean var3) {
      return var1.findTypeCached(this.type, var2, new FieldFinder.Matcher<>(this.name, this.type, var2), var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof FieldFinder var2) ? false : Objects.equals(this.name, var2.name) && Objects.equals(this.type, var2.type);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.name != null ? this.name.hashCode() : 0;
      return 31 * var1 + this.type.hashCode();
   }

   private static final class Matcher<FT, FR> implements Type.TypeMatcher<FT, FR> {
      private final Type<FR> resultType;
      @Nullable
      private final String name;
      private final Type<FT> type;

      public Matcher(@Nullable String var1, Type<FT> var2, Type<FR> var3) {
         this.resultType = var3;
         this.name = var1;
         this.type = var2;
      }

      @Override
      public <S> Either<TypedOptic<S, ?, FT, FR>, Type.FieldNotFoundException> match(Type<S> var1) {
         if (this.name == null && this.type.equals(var1, true, false)) {
            return Either.left(new TypedOptic<>(Profunctor.Mu.TYPE_TOKEN, var1, this.resultType, var1, this.resultType, Optics.id()));
         }

         if (var1 instanceof Tag.TagType var3) {
            if (!Objects.equals(var3.name(), this.name)) {
               return Either.right(new Type.FieldNotFoundException(String.format("Not found: \"%s\" (in type: %s)", this.name, var1)));
            } else {
               return !Objects.equals(this.type, var3.element())
                  ? Either.right(
                     new Type.FieldNotFoundException(
                        String.format("Type error for field \"%s\": expected type: %s, actual type: %s)", this.name, this.type, var3.element())
                     )
                  )
                  : Either.left(
                     new TypedOptic<>(Profunctor.Mu.TYPE_TOKEN, var3, DSL.field(var3.name(), this.resultType), this.type, this.resultType, Optics.id())
                  );
            }
         } else if (!(var1 instanceof TaggedChoice.TaggedChoiceType var2 && Objects.equals(this.name, var2.getName()))) {
            return Either.right(new Type.Continue());
         } else if (!Objects.equals(this.type, var2.getKeyType())) {
            return Either.right(
               new Type.FieldNotFoundException(
                  String.format("Type error for field \"%s\": expected type: %s, actual type: %s)", this.name, this.type, var2.getKeyType())
               )
            );
         } else {
            return !Objects.equals(this.type, this.resultType)
               ? Either.right(new Type.FieldNotFoundException("TaggedChoiceType key type change is unsupported."))
               : Either.left(this.capChoice(var2));
         }
      }

      private <V> TypedOptic<Pair<FT, V>, ?, FT, FT> capChoice(Type<?> var1) {
         return new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, var1, var1, this.type, this.type, Optics.proj1());
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            FieldFinder.Matcher var2 = (FieldFinder.Matcher)var1;
            return Objects.equals(this.resultType, var2.resultType) && Objects.equals(this.name, var2.name) && Objects.equals(this.type, var2.type);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.resultType.hashCode();
         var1 = 31 * var1 + (this.name != null ? this.name.hashCode() : 0);
         return 31 * var1 + this.type.hashCode();
      }
   }
}
