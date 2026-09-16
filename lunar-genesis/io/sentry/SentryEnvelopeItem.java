package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.metrics.EncodedMetrics;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryEnvelopeItem {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   private final SentryEnvelopeItemHeader header;
   @Nullable
   private final Callable<byte[]> dataFactory;
   @Nullable
   private byte[] data;

   SentryEnvelopeItem(@NotNull SentryEnvelopeItemHeader var1, byte[] var2) {
      this.header = Objects.requireNonNull(var1, "SentryEnvelopeItemHeader is required.");
      this.data = var2;
      this.dataFactory = null;
   }

   SentryEnvelopeItem(@NotNull SentryEnvelopeItemHeader var1, @Nullable Callable<byte[]> var2) {
      this.header = Objects.requireNonNull(var1, "SentryEnvelopeItemHeader is required.");
      this.dataFactory = Objects.requireNonNull(var2, "DataFactory is required.");
      this.data = null;
   }

   @NotNull
   public byte[] getData() {
      if (this.data == null && this.dataFactory != null) {
         this.data = this.dataFactory.call();
      }

      return this.data;
   }

   @NotNull
   public SentryEnvelopeItemHeader getHeader() {
      return this.header;
   }

   @NotNull
   public static SentryEnvelopeItem fromSession(@NotNull ISerializer var0, @NotNull Session var1) {
      Objects.requireNonNull(var0, "ISerializer is required.");
      Objects.requireNonNull(var1, "Session is required.");
      SentryEnvelopeItem.CachedItem var2 = new SentryEnvelopeItem.CachedItem(() -> {
         ByteArrayOutputStream var2x = new ByteArrayOutputStream();

         byte[] var4;
         try {
            BufferedWriter var3x = new BufferedWriter(new OutputStreamWriter(var2x, UTF_8));

            try {
               var0.serialize(var1, var3x);
               var4 = var2x.toByteArray();
            } catch (Throwable var8) {
               try {
                  var3x.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var3x.close();
         } catch (Throwable var9) {
            try {
               var2x.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2x.close();
         return var4;
      });
      SentryEnvelopeItemHeader var3 = new SentryEnvelopeItemHeader(SentryItemType.Session, () -> var2.getBytes().length, "application/json", null);
      return new SentryEnvelopeItem(var3, () -> var2.getBytes());
   }

   @Nullable
   public SentryEvent getEvent(@NotNull ISerializer var1) {
      if (this.header != null && this.header.getType() == SentryItemType.Event) {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.getData()), UTF_8));

         SentryEvent var3;
         try {
            var3 = var1.deserialize(var2, SentryEvent.class);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var3;
      } else {
         return null;
      }
   }

   @NotNull
   public static SentryEnvelopeItem fromEvent(@NotNull ISerializer var0, @NotNull SentryBaseEvent var1) {
      Objects.requireNonNull(var0, "ISerializer is required.");
      Objects.requireNonNull(var1, "SentryEvent is required.");
      SentryEnvelopeItem.CachedItem var2 = new SentryEnvelopeItem.CachedItem(() -> {
         ByteArrayOutputStream var2x = new ByteArrayOutputStream();

         byte[] var4;
         try {
            BufferedWriter var3x = new BufferedWriter(new OutputStreamWriter(var2x, UTF_8));

            try {
               var0.serialize(var1, var3x);
               var4 = var2x.toByteArray();
            } catch (Throwable var8) {
               try {
                  var3x.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var3x.close();
         } catch (Throwable var9) {
            try {
               var2x.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2x.close();
         return var4;
      });
      SentryEnvelopeItemHeader var3 = new SentryEnvelopeItemHeader(SentryItemType.resolve(var1), () -> var2.getBytes().length, "application/json", null);
      return new SentryEnvelopeItem(var3, () -> var2.getBytes());
   }

   @Nullable
   public SentryTransaction getTransaction(@NotNull ISerializer var1) {
      if (this.header != null && this.header.getType() == SentryItemType.Transaction) {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.getData()), UTF_8));

         SentryTransaction var3;
         try {
            var3 = var1.deserialize(var2, SentryTransaction.class);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var3;
      } else {
         return null;
      }
   }

   public static SentryEnvelopeItem fromUserFeedback(@NotNull ISerializer var0, @NotNull UserFeedback var1) {
      Objects.requireNonNull(var0, "ISerializer is required.");
      Objects.requireNonNull(var1, "UserFeedback is required.");
      SentryEnvelopeItem.CachedItem var2 = new SentryEnvelopeItem.CachedItem(() -> {
         ByteArrayOutputStream var2x = new ByteArrayOutputStream();

         byte[] var4;
         try {
            BufferedWriter var3x = new BufferedWriter(new OutputStreamWriter(var2x, UTF_8));

            try {
               var0.serialize(var1, var3x);
               var4 = var2x.toByteArray();
            } catch (Throwable var8) {
               try {
                  var3x.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var3x.close();
         } catch (Throwable var9) {
            try {
               var2x.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2x.close();
         return var4;
      });
      SentryEnvelopeItemHeader var3 = new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, () -> var2.getBytes().length, "application/json", null);
      return new SentryEnvelopeItem(var3, () -> var2.getBytes());
   }

   public static SentryEnvelopeItem fromCheckIn(@NotNull ISerializer var0, @NotNull CheckIn var1) {
      Objects.requireNonNull(var0, "ISerializer is required.");
      Objects.requireNonNull(var1, "CheckIn is required.");
      SentryEnvelopeItem.CachedItem var2 = new SentryEnvelopeItem.CachedItem(() -> {
         ByteArrayOutputStream var2x = new ByteArrayOutputStream();

         byte[] var4;
         try {
            BufferedWriter var3x = new BufferedWriter(new OutputStreamWriter(var2x, UTF_8));

            try {
               var0.serialize(var1, var3x);
               var4 = var2x.toByteArray();
            } catch (Throwable var8) {
               try {
                  var3x.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var3x.close();
         } catch (Throwable var9) {
            try {
               var2x.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2x.close();
         return var4;
      });
      SentryEnvelopeItemHeader var3 = new SentryEnvelopeItemHeader(SentryItemType.CheckIn, () -> var2.getBytes().length, "application/json", null);
      return new SentryEnvelopeItem(var3, () -> var2.getBytes());
   }

   public static SentryEnvelopeItem fromMetrics(@NotNull EncodedMetrics var0) {
      SentryEnvelopeItem.CachedItem var1 = new SentryEnvelopeItem.CachedItem(() -> var0.encodeToStatsd());
      SentryEnvelopeItemHeader var2 = new SentryEnvelopeItemHeader(SentryItemType.Statsd, () -> var1.getBytes().length, "application/octet-stream", null);
      return new SentryEnvelopeItem(var2, () -> var1.getBytes());
   }

   public static SentryEnvelopeItem fromAttachment(@NotNull ISerializer var0, @NotNull ILogger var1, @NotNull Attachment var2, long var3) {
      SentryEnvelopeItem.CachedItem var5 = new SentryEnvelopeItem.CachedItem(
         () -> {
            if (var2.getBytes() != null) {
               byte[] var7 = var2.getBytes();
               ensureAttachmentSizeLimit(var7.length, var3, var2.getFilename());
               return var7;
            }

            if (var2.getSerializable() != null) {
               JsonSerializable var5x = var2.getSerializable();
               byte[] var6x = JsonSerializationUtils.bytesFrom(var0, var1, var5x);
               if (var6x != null) {
                  ensureAttachmentSizeLimit(var6x.length, var3, var2.getFilename());
                  return var6x;
               }
            } else if (var2.getPathname() != null) {
               return FileUtils.readBytesFromFile(var2.getPathname(), var3);
            }

            throw new SentryEnvelopeException(
               String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", var2.getFilename())
            );
         }
      );
      SentryEnvelopeItemHeader var6 = new SentryEnvelopeItemHeader(
         SentryItemType.Attachment, () -> var5.getBytes().length, var2.getContentType(), var2.getFilename(), var2.getAttachmentType()
      );
      return new SentryEnvelopeItem(var6, () -> var5.getBytes());
   }

   private static void ensureAttachmentSizeLimit(long var0, long var2, @NotNull String var4) {
      if (var0 > var2) {
         throw new SentryEnvelopeException(
            String.format(
               "Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.",
               var4,
               var0,
               var2
            )
         );
      }
   }

   @NotNull
   public static SentryEnvelopeItem fromProfilingTrace(@NotNull ProfilingTraceData var0, long var1, @NotNull ISerializer var3) {
      File var4 = var0.getTraceFile();
      SentryEnvelopeItem.CachedItem var5 = new SentryEnvelopeItem.CachedItem(() -> {
         if (!var4.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", var4.getName()));
         }

         byte[] var5x = FileUtils.readBytesFromFile(var4.getPath(), var1);
         String var6x = Base64.encodeToString(var5x, 3);
         if (var6x.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
         }

         var0.setSampledProfile(var6x);
         var0.readDeviceCpuFrequencies();

         byte[] var9;
         try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();

            try {
               BufferedWriter var8 = new BufferedWriter(new OutputStreamWriter(var7, UTF_8));

               try {
                  var3.serialize(var0, var8);
                  var9 = var7.toByteArray();
               } catch (Throwable var20) {
                  try {
                     var8.close();
                  } catch (Throwable var19) {
                     var20.addSuppressed(var19);
                  }

                  throw var20;
               }

               var8.close();
            } catch (Throwable var21) {
               try {
                  var7.close();
               } catch (Throwable var18) {
                  var21.addSuppressed(var18);
               }

               throw var21;
            }

            var7.close();
         } catch (IOException var22) {
            throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", var22.getMessage()));
         } finally {
            var4.delete();
         }

         return var9;
      });
      SentryEnvelopeItemHeader var6 = new SentryEnvelopeItemHeader(SentryItemType.Profile, () -> var5.getBytes().length, "application-json", var4.getName());
      return new SentryEnvelopeItem(var6, () -> var5.getBytes());
   }

   @NotNull
   public static SentryEnvelopeItem fromClientReport(@NotNull ISerializer var0, @NotNull ClientReport var1) {
      Objects.requireNonNull(var0, "ISerializer is required.");
      Objects.requireNonNull(var1, "ClientReport is required.");
      SentryEnvelopeItem.CachedItem var2 = new SentryEnvelopeItem.CachedItem(() -> {
         ByteArrayOutputStream var2x = new ByteArrayOutputStream();

         byte[] var4;
         try {
            BufferedWriter var3x = new BufferedWriter(new OutputStreamWriter(var2x, UTF_8));

            try {
               var0.serialize(var1, var3x);
               var4 = var2x.toByteArray();
            } catch (Throwable var8) {
               try {
                  var3x.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }

               throw var8;
            }

            var3x.close();
         } catch (Throwable var9) {
            try {
               var2x.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2x.close();
         return var4;
      });
      SentryEnvelopeItemHeader var3 = new SentryEnvelopeItemHeader(SentryItemType.resolve(var1), () -> var2.getBytes().length, "application/json", null);
      return new SentryEnvelopeItem(var3, () -> var2.getBytes());
   }

   @Nullable
   public ClientReport getClientReport(@NotNull ISerializer var1) {
      if (this.header != null && this.header.getType() == SentryItemType.ClientReport) {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.getData()), UTF_8));

         ClientReport var3;
         try {
            var3 = var1.deserialize(var2, ClientReport.class);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var3;
      } else {
         return null;
      }
   }

   public static SentryEnvelopeItem fromReplay(
      @NotNull ISerializer var0, @NotNull ILogger var1, @NotNull SentryReplayEvent var2, @Nullable ReplayRecording var3, boolean var4
   ) {
      File var5 = var2.getVideoFile();
      SentryEnvelopeItem.CachedItem var6 = new SentryEnvelopeItem.CachedItem(() -> {
         byte[] var23;
         try {
            ByteArrayOutputStream var6x = new ByteArrayOutputStream();

            try {
               BufferedWriter var7x = new BufferedWriter(new OutputStreamWriter(var6x, UTF_8));

               try {
                  LinkedHashMap var8 = new LinkedHashMap();
                  var0.serialize(var2, var7x);
                  var8.put(SentryItemType.ReplayEvent.getItemType(), var6x.toByteArray());
                  var6x.reset();
                  if (var3 != null) {
                     var0.serialize(var3, var7x);
                     var8.put(SentryItemType.ReplayRecording.getItemType(), var6x.toByteArray());
                     var6x.reset();
                  }

                  if (var5 != null && var5.exists()) {
                     var23 = FileUtils.readBytesFromFile(var5.getPath(), 10485760L);
                     if (var23.length > 0) {
                        var8.put(SentryItemType.ReplayVideo.getItemType(), var23);
                     }
                  }

                  var23 = serializeToMsgpack(var8);
               } catch (Throwable var19) {
                  try {
                     var7x.close();
                  } catch (Throwable var18) {
                     var19.addSuppressed(var18);
                  }

                  throw var19;
               }

               var7x.close();
            } catch (Throwable var20) {
               try {
                  var6x.close();
               } catch (Throwable var17) {
                  var20.addSuppressed(var17);
               }

               throw var20;
            }

            var6x.close();
         } catch (Throwable var21) {
            var1.log(SentryLevel.ERROR, "Could not serialize replay recording", var21);
            return null;
         } finally {
            if (var5 != null) {
               if (var4) {
                  FileUtils.deleteRecursively(var5.getParentFile());
               } else {
                  var5.delete();
               }
            }
         }

         return var23;
      });
      SentryEnvelopeItemHeader var7 = new SentryEnvelopeItemHeader(SentryItemType.ReplayVideo, () -> var6.getBytes().length, null, null);
      return new SentryEnvelopeItem(var7, () -> var6.getBytes());
   }

   private static byte[] serializeToMsgpack(@NotNull Map<String, byte[]> var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      byte[] var10;
      try {
         var1.write((byte)(128 | var0.size()));

         for (Entry var3 : var0.entrySet()) {
            byte[] var4 = ((String)var3.getKey()).getBytes(UTF_8);
            int var5 = var4.length;
            var1.write(-39);
            var1.write((byte)var5);
            var1.write(var4);
            byte[] var6 = (byte[])var3.getValue();
            int var7 = var6.length;
            var1.write(-58);
            var1.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(var7).array());
            var1.write(var6);
         }

         var10 = var1.toByteArray();
      } catch (Throwable var9) {
         try {
            var1.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var1.close();
      return var10;
   }

   private static class CachedItem {
      @Nullable
      private byte[] bytes;
      @Nullable
      private final Callable<byte[]> dataFactory;

      public CachedItem(@Nullable Callable<byte[]> var1) {
         this.dataFactory = var1;
      }

      @NotNull
      public byte[] getBytes() {
         if (this.bytes == null && this.dataFactory != null) {
            this.bytes = this.dataFactory.call();
         }

         return orEmptyArray(this.bytes);
      }

      @NotNull
      private static byte[] orEmptyArray(@Nullable byte[] var0) {
         return var0 != null ? var0 : new byte[0];
      }
   }
}
