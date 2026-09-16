package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

public final class Streams {
   private Streams() {
      throw new UnsupportedOperationException();
   }

   public static JsonElement parse(JsonReader var0) {
      boolean var1 = true;

      try {
         JsonToken var2 = var0.peek();
         var1 = false;
         return TypeAdapters.JSON_ELEMENT.read(var0);
      } catch (EOFException var3) {
         if (var1) {
            return JsonNull.INSTANCE;
         } else {
            throw new JsonSyntaxException(var3);
         }
      } catch (MalformedJsonException var4) {
         throw new JsonSyntaxException(var4);
      } catch (IOException var5) {
         throw new JsonIOException(var5);
      } catch (NumberFormatException var6) {
         throw new JsonSyntaxException(var6);
      }
   }

   public static void write(JsonElement var0, JsonWriter var1) {
      TypeAdapters.JSON_ELEMENT.write(var1, var0);
   }

   public static Writer writerForAppendable(Appendable var0) {
      return var0 instanceof Writer ? (Writer)var0 : new Streams.AppendableWriter(var0);
   }

   private static final class AppendableWriter extends Writer {
      private final Appendable appendable;
      private final Streams.AppendableWriter.CurrentWrite currentWrite = new Streams.AppendableWriter.CurrentWrite();

      AppendableWriter(Appendable var1) {
         this.appendable = var1;
      }

      @Override
      public void write(char[] var1, int var2, int var3) {
         this.currentWrite.setChars(var1);
         this.appendable.append(this.currentWrite, var2, var2 + var3);
      }

      @Override
      public void flush() {
      }

      @Override
      public void close() {
      }

      @Override
      public void write(int var1) {
         this.appendable.append((char)var1);
      }

      @Override
      public void write(String var1, int var2, int var3) {
         Objects.requireNonNull(var1);
         this.appendable.append(var1, var2, var2 + var3);
      }

      @Override
      public Writer append(CharSequence var1) {
         this.appendable.append(var1);
         return this;
      }

      @Override
      public Writer append(CharSequence var1, int var2, int var3) {
         this.appendable.append(var1, var2, var3);
         return this;
      }

      private static class CurrentWrite implements CharSequence {
         private char[] chars;
         private String cachedString;

         private CurrentWrite() {
         }

         void setChars(char[] var1) {
            this.chars = var1;
            this.cachedString = null;
         }

         @Override
         public int length() {
            return this.chars.length;
         }

         @Override
         public char charAt(int var1) {
            return this.chars[var1];
         }

         @Override
         public CharSequence subSequence(int var1, int var2) {
            return new String(this.chars, var1, var2 - var1);
         }

         @Override
         public String toString() {
            if (this.cachedString == null) {
               this.cachedString = new String(this.chars);
            }

            return this.cachedString;
         }
      }
   }
}
