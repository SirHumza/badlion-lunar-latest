package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonObjectDeserializer {
   private final ArrayList<JsonObjectDeserializer.Token> tokens = new ArrayList<>();

   @Nullable
   public Object deserialize(@NotNull JsonObjectReader var1) {
      this.parse(var1);
      JsonObjectDeserializer.Token var2 = this.getCurrentToken();
      return var2 != null ? var2.getValue() : null;
   }

   private void parse(@NotNull JsonObjectReader var1) {
      boolean var2 = false;
      switch (var1.peek()) {
         case BEGIN_ARRAY:
            var1.beginArray();
            this.pushCurrentToken(new JsonObjectDeserializer.TokenArray());
            break;
         case END_ARRAY:
            var1.endArray();
            var2 = this.handleArrayOrMapEnd();
            break;
         case BEGIN_OBJECT:
            var1.beginObject();
            this.pushCurrentToken(new JsonObjectDeserializer.TokenMap());
            break;
         case END_OBJECT:
            var1.endObject();
            var2 = this.handleArrayOrMapEnd();
            break;
         case NAME:
            this.pushCurrentToken(new JsonObjectDeserializer.TokenName(var1.nextName()));
            break;
         case STRING:
            var2 = this.handlePrimitive(() -> var1.nextString());
            break;
         case NUMBER:
            var2 = this.handlePrimitive(() -> this.nextNumber(var1));
            break;
         case BOOLEAN:
            var2 = this.handlePrimitive(() -> var1.nextBoolean());
            break;
         case NULL:
            var1.nextNull();
            var2 = this.handlePrimitive(() -> null);
            break;
         case END_DOCUMENT:
            var2 = true;
      }

      if (!var2) {
         this.parse(var1);
      }
   }

   private boolean handleArrayOrMapEnd() {
      if (this.hasOneToken()) {
         return true;
      }

      JsonObjectDeserializer.Token var1 = this.getCurrentToken();
      this.popCurrentToken();
      if (this.getCurrentToken() instanceof JsonObjectDeserializer.TokenName) {
         JsonObjectDeserializer.TokenName var2 = (JsonObjectDeserializer.TokenName)this.getCurrentToken();
         this.popCurrentToken();
         JsonObjectDeserializer.TokenMap var3 = (JsonObjectDeserializer.TokenMap)this.getCurrentToken();
         if (var2 != null && var1 != null && var3 != null) {
            var3.value.put(var2.value, var1.getValue());
         }
      } else if (this.getCurrentToken() instanceof JsonObjectDeserializer.TokenArray) {
         JsonObjectDeserializer.TokenArray var4 = (JsonObjectDeserializer.TokenArray)this.getCurrentToken();
         if (var1 != null && var4 != null) {
            var4.value.add(var1.getValue());
         }
      }

      return false;
   }

   private boolean handlePrimitive(JsonObjectDeserializer.NextValue var1) {
      Object var2 = var1.nextValue();
      if (this.getCurrentToken() == null && var2 != null) {
         this.pushCurrentToken(new JsonObjectDeserializer.TokenPrimitive(var2));
         return true;
      }

      if (this.getCurrentToken() instanceof JsonObjectDeserializer.TokenName) {
         JsonObjectDeserializer.TokenName var3 = (JsonObjectDeserializer.TokenName)this.getCurrentToken();
         this.popCurrentToken();
         JsonObjectDeserializer.TokenMap var4 = (JsonObjectDeserializer.TokenMap)this.getCurrentToken();
         var4.value.put(var3.value, var2);
      } else if (this.getCurrentToken() instanceof JsonObjectDeserializer.TokenArray) {
         JsonObjectDeserializer.TokenArray var5 = (JsonObjectDeserializer.TokenArray)this.getCurrentToken();
         var5.value.add(var2);
      }

      return false;
   }

   private Object nextNumber(JsonObjectReader var1) {
      try {
         return var1.nextInt();
      } catch (Exception var4) {
         try {
            return var1.nextDouble();
         } catch (Exception var3) {
            return var1.nextLong();
         }
      }
   }

   @Nullable
   private JsonObjectDeserializer.Token getCurrentToken() {
      return this.tokens.isEmpty() ? null : this.tokens.get(this.tokens.size() - 1);
   }

   private void pushCurrentToken(JsonObjectDeserializer.Token var1) {
      this.tokens.add(var1);
   }

   private void popCurrentToken() {
      if (!this.tokens.isEmpty()) {
         this.tokens.remove(this.tokens.size() - 1);
      }
   }

   private boolean hasOneToken() {
      return this.tokens.size() == 1;
   }

   private interface NextValue {
      @Nullable
      Object nextValue();
   }

   private interface Token {
      @NotNull
      Object getValue();
   }

   private static final class TokenArray implements JsonObjectDeserializer.Token {
      final ArrayList<Object> value = new ArrayList<>();

      private TokenArray() {
      }

      @NotNull
      @Override
      public Object getValue() {
         return this.value;
      }
   }

   private static final class TokenMap implements JsonObjectDeserializer.Token {
      final HashMap<String, Object> value = new HashMap<>();

      private TokenMap() {
      }

      @NotNull
      @Override
      public Object getValue() {
         return this.value;
      }
   }

   private static final class TokenName implements JsonObjectDeserializer.Token {
      final String value;

      TokenName(@NotNull String var1) {
         this.value = var1;
      }

      @NotNull
      @Override
      public Object getValue() {
         return this.value;
      }
   }

   private static final class TokenPrimitive implements JsonObjectDeserializer.Token {
      final Object value;

      TokenPrimitive(@NotNull Object var1) {
         this.value = var1;
      }

      @NotNull
      @Override
      public Object getValue() {
         return this.value;
      }
   }
}
