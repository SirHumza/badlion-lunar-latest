package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class EnvelopeReader implements IEnvelopeReader {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   @NotNull
   private final ISerializer serializer;

   public EnvelopeReader(@NotNull ISerializer var1) {
      this.serializer = var1;
   }

   @Nullable
   @Override
   public SentryEnvelope read(@NotNull InputStream var1) {
      byte[] var2 = new byte[1024];
      int var4 = 0;
      int var5 = -1;
      ByteArrayOutputStream var6 = new ByteArrayOutputStream();

      SentryEnvelope var19;
      try {
         int var3;
         while ((var3 = var1.read(var2)) > 0) {
            int var7 = 0;

            while (true) {
               if (var5 == -1 && var7 < var3) {
                  if (var2[var7] != 10) {
                     var7++;
                     continue;
                  }

                  var5 = var4 + var7;
               }

               var6.write(var2, 0, var3);
               var4 += var3;
               break;
            }
         }

         byte[] var18 = var6.toByteArray();
         if (var18.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
         }

         if (var5 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
         }

         SentryEnvelopeHeader var8 = this.deserializeEnvelopeHeader(var18, 0, var5);
         if (var8 == null) {
            throw new IllegalArgumentException("Envelope header is null.");
         }

         int var9 = var5 + 1;
         ArrayList var11 = new ArrayList();

         label95:
         while (true) {
            int var12 = -1;
            int var13 = var9;

            while (true) {
               if (var13 < var18.length) {
                  if (var18[var13] != 10) {
                     var13++;
                     continue;
                  }

                  var12 = var13;
               }

               if (var12 == -1) {
                  throw new IllegalArgumentException("Invalid envelope. Item at index '" + var11.size() + "'. has no header delimiter.");
               }

               SentryEnvelopeItemHeader var20 = this.deserializeEnvelopeItemHeader(var18, var9, var12 - var9);
               if (var20 == null || var20.getLength() <= 0) {
                  throw new IllegalArgumentException("Item header at index '" + var11.size() + "' is null or empty.");
               }

               int var10 = var12 + var20.getLength() + 1;
               if (var10 > var18.length) {
                  throw new IllegalArgumentException(
                     "Invalid length for item at index '" + var11.size() + "'. Item is '" + var10 + "' bytes. There are '" + var18.length + "' in the buffer."
                  );
               }

               byte[] var14 = Arrays.copyOfRange(var18, var12 + 1, var10);
               SentryEnvelopeItem var15 = new SentryEnvelopeItem(var20, var14);
               var11.add(var15);
               if (var10 == var18.length) {
                  break label95;
               }

               if (var10 + 1 == var18.length) {
                  if (var18[var10] != 10) {
                     throw new IllegalArgumentException("Envelope has invalid data following an item.");
                  }
                  break label95;
               }

               var9 = var10 + 1;
               break;
            }
         }

         var19 = new SentryEnvelope(var8, var11);
      } catch (Throwable var17) {
         try {
            var6.close();
         } catch (Throwable var16) {
            var17.addSuppressed(var16);
         }

         throw var17;
      }

      var6.close();
      return var19;
   }

   @Nullable
   private SentryEnvelopeHeader deserializeEnvelopeHeader(@NotNull byte[] var1, int var2, int var3) {
      String var4 = new String(var1, var2, var3, UTF_8);
      StringReader var5 = new StringReader(var4);

      SentryEnvelopeHeader var6;
      try {
         var6 = this.serializer.deserialize(var5, SentryEnvelopeHeader.class);
      } catch (Throwable var9) {
         try {
            var5.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var5.close();
      return var6;
   }

   @Nullable
   private SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(@NotNull byte[] var1, int var2, int var3) {
      String var4 = new String(var1, var2, var3, UTF_8);
      StringReader var5 = new StringReader(var4);

      SentryEnvelopeItemHeader var6;
      try {
         var6 = this.serializer.deserialize(var5, SentryEnvelopeItemHeader.class);
      } catch (Throwable var9) {
         try {
            var5.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var5.close();
      return var6;
   }
}
