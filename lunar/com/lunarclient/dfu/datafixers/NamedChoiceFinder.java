package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.Tag;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.util.Either;
import java.util.Objects;

final class NamedChoiceFinder<FT> implements OpticFinder<FT> {
   private final String name;
   private final Type<FT> type;

   public NamedChoiceFinder(String var1, Type<FT> var2) {
      this.name = var1;
      this.type = var2;
   }

   @Override
   public Type<FT> type() {
      return this.type;
   }

   @Override
   public <A, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findType(Type<A> var1, Type<FR> var2, boolean var3) {
      return var1.findTypeCached(this.type, var2, new NamedChoiceFinder.Matcher<>(this.name, this.type, var2), var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof NamedChoiceFinder var2) ? false : Objects.equals(this.name, var2.name) && Objects.equals(this.type, var2.type);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.name.hashCode();
      return 31 * var1 + this.type.hashCode();
   }

   private static class Matcher<FT, FR> implements Type.TypeMatcher<FT, FR> {
      private final Type<FR> resultType;
      private final String name;
      private final Type<FT> type;

      public Matcher(String var1, Type<FT> var2, Type<FR> var3) {
         this.resultType = var3;
         this.name = var1;
         this.type = var2;
      }

      @Override
      public <S> Either<TypedOptic<S, ?, FT, FR>, Type.FieldNotFoundException> match(Type<S> var1) {
         if (var1 instanceof TaggedChoice.TaggedChoiceType var2) {
            Type var3 = (Type)var2.types().get(this.name);
            if (var3 != null) {
               return !Objects.equals(this.type, var3)
                  ? Either.right(
                     new Type.FieldNotFoundException(
                        String.format("Type error for choice type \"%s\": expected type: %s, actual type: %s)", this.name, var1, var3)
                     )
                  )
                  : Either.left(TypedOptic.tagged(var2, this.name, this.type, this.resultType));
            } else {
               return Either.right(new Type.Continue());
            }
         } else {
            return var1 instanceof Tag.TagType ? Either.right(new Type.FieldNotFoundException("in tag")) : Either.right(new Type.Continue());
         }
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            NamedChoiceFinder.Matcher var2 = (NamedChoiceFinder.Matcher)var1;
            return Objects.equals(this.resultType, var2.resultType) && Objects.equals(this.name, var2.name) && Objects.equals(this.type, var2.type);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.resultType.hashCode();
         var1 = 31 * var1 + this.name.hashCode();
         return 31 * var1 + this.type.hashCode();
      }
   }
}
