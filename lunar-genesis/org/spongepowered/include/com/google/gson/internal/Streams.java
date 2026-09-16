package org.spongepowered.include.com.google.gson.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import org.spongepowered.include.com.google.gson.JsonElement;
import org.spongepowered.include.com.google.gson.JsonIOException;
import org.spongepowered.include.com.google.gson.JsonNull;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.internal.bind.TypeAdapters;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;
import org.spongepowered.include.com.google.gson.stream.MalformedJsonException;

public final class Streams {
   public static JsonElement parse(JsonReader var0) {
      boolean var1 = true;

      try {
         var0.peek();
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

      private AppendableWriter(Appendable var1) {
         this.appendable = var1;
      }

      @Override
      public void write(char[] var1, int var2, int var3) {
         this.currentWrite.chars = var1;
         this.appendable.append(this.currentWrite, var2, var2 + var3);
      }

      @Override
      public void write(int var1) {
         this.appendable.append((char)var1);
      }

      @Override
      public void flush() {
      }

      @Override
      public void close() {
      }

      static class CurrentWrite implements CharSequence {
         char[] chars;

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
      }
   }
}
