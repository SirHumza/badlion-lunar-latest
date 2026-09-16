package io.sentry;

import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class OutboxSender extends DirectoryProcessor implements IEnvelopeSender {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   @NotNull
   private final IHub hub;
   @NotNull
   private final IEnvelopeReader envelopeReader;
   @NotNull
   private final ISerializer serializer;
   @NotNull
   private final ILogger logger;

   public OutboxSender(@NotNull IHub var1, @NotNull IEnvelopeReader var2, @NotNull ISerializer var3, @NotNull ILogger var4, long var5, int var7) {
      super(var1, var4, var5, var7);
      this.hub = Objects.requireNonNull(var1, "Hub is required.");
      this.envelopeReader = Objects.requireNonNull(var2, "Envelope reader is required.");
      this.serializer = Objects.requireNonNull(var3, "Serializer is required.");
      this.logger = Objects.requireNonNull(var4, "Logger is required.");
   }

   @Override
   protected void processFile(@NotNull File var1, @NotNull Hint var2) {
      Objects.requireNonNull(var1, "File is required.");
      if (!this.isRelevantFileName(var1.getName())) {
         this.logger.log(SentryLevel.DEBUG, "File '%s' should be ignored.", var1.getAbsolutePath());
      } else {
         try {
            BufferedInputStream var3 = new BufferedInputStream(new FileInputStream(var1));

            try {
               SentryEnvelope var4 = this.envelopeReader.read(var3);
               if (var4 == null) {
                  this.logger.log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", var1.getAbsolutePath());
               } else {
                  this.processEnvelope(var4, var2);
                  this.logger.log(SentryLevel.DEBUG, "File '%s' is done.", var1.getAbsolutePath());
               }
            } catch (Throwable var12) {
               try {
                  var3.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }

               throw var12;
            }

            var3.close();
         } catch (IOException var13) {
            this.logger.log(SentryLevel.ERROR, "Error processing envelope.", var13);
         } finally {
            HintUtils.runIfHasTypeLogIfNot(var2, Retryable.class, this.logger, var2x -> {
               if (!var2x.isRetry()) {
                  try {
                     if (!var1.delete()) {
                        this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", var1.getAbsolutePath());
                     }
                  } catch (RuntimeException var4x) {
                     this.logger.log(SentryLevel.ERROR, var4x, "Failed to delete: %s", var1.getAbsolutePath());
                  }
               }
            });
         }
      }
   }

   @Override
   protected boolean isRelevantFileName(@Nullable String var1) {
      return var1 != null && !var1.startsWith("session") && !var1.startsWith("previous_session") && !var1.startsWith("startup_crash");
   }

   @Override
   public void processEnvelopeFile(@NotNull String var1, @NotNull Hint var2) {
      Objects.requireNonNull(var1, "Path is required.");
      this.processFile(new File(var1), var2);
   }

   private void processEnvelope(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
      this.logger.log(SentryLevel.DEBUG, "Processing Envelope with %d item(s)", CollectionUtils.size(var1.getItems()));
      int var3 = 0;

      for (SentryEnvelopeItem var5 : var1.getItems()) {
         var3++;
         if (var5.getHeader() == null) {
            this.logger.log(SentryLevel.ERROR, "Item %d has no header", var3);
         } else {
            if (SentryItemType.Event.equals(var5.getHeader().getType())) {
               try {
                  label134: {
                     BufferedReader var16 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var5.getData()), UTF_8));

                     label103: {
                        label102: {
                           try {
                              SentryEvent var18 = this.serializer.deserialize(var16, SentryEvent.class);
                              if (var18 == null) {
                                 this.logEnvelopeItemNull(var5, var3);
                              } else {
                                 if (var18.getSdk() != null) {
                                    HintUtils.setIsFromHybridSdk(var2, var18.getSdk().getName());
                                 }

                                 if (var1.getHeader().getEventId() != null && !var1.getHeader().getEventId().equals(var18.getEventId())) {
                                    this.logUnexpectedEventId(var1, var18.getEventId(), var3);
                                    break label103;
                                 }

                                 this.hub.captureEvent(var18, var2);
                                 this.logItemCaptured(var3);
                                 if (!this.waitFlush(var2)) {
                                    this.logTimeout(var18.getEventId());
                                    break label102;
                                 }
                              }
                           } catch (Throwable var11) {
                              try {
                                 var16.close();
                              } catch (Throwable var10) {
                                 var11.addSuppressed(var10);
                              }

                              throw var11;
                           }

                           var16.close();
                           break label134;
                        }

                        var16.close();
                        break;
                     }

                     var16.close();
                     continue;
                  }
               } catch (Throwable var12) {
                  this.logger.log(SentryLevel.ERROR, "Item failed to process.", var12);
               }
            } else if (SentryItemType.Transaction.equals(var5.getHeader().getType())) {
               try {
                  label137: {
                     BufferedReader var15 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var5.getData()), UTF_8));

                     label119: {
                        label118: {
                           try {
                              SentryTransaction var7 = this.serializer.deserialize(var15, SentryTransaction.class);
                              if (var7 == null) {
                                 this.logEnvelopeItemNull(var5, var3);
                              } else {
                                 if (var1.getHeader().getEventId() != null && !var1.getHeader().getEventId().equals(var7.getEventId())) {
                                    this.logUnexpectedEventId(var1, var7.getEventId(), var3);
                                    break label119;
                                 }

                                 TraceContext var8 = var1.getHeader().getTraceContext();
                                 if (var7.getContexts().getTrace() != null) {
                                    var7.getContexts().getTrace().setSamplingDecision(this.extractSamplingDecision(var8));
                                 }

                                 this.hub.captureTransaction(var7, var8, var2);
                                 this.logItemCaptured(var3);
                                 if (!this.waitFlush(var2)) {
                                    this.logTimeout(var7.getEventId());
                                    break label118;
                                 }
                              }
                           } catch (Throwable var13) {
                              try {
                                 var15.close();
                              } catch (Throwable var9) {
                                 var13.addSuppressed(var9);
                              }

                              throw var13;
                           }

                           var15.close();
                           break label137;
                        }

                        var15.close();
                        break;
                     }

                     var15.close();
                     continue;
                  }
               } catch (Throwable var14) {
                  this.logger.log(SentryLevel.ERROR, "Item failed to process.", var14);
               }
            } else {
               SentryEnvelope var6 = new SentryEnvelope(var1.getHeader().getEventId(), var1.getHeader().getSdkVersion(), var5);
               this.hub.captureEnvelope(var6, var2);
               this.logger.log(SentryLevel.DEBUG, "%s item %d is being captured.", var5.getHeader().getType().getItemType(), var3);
               if (!this.waitFlush(var2)) {
                  this.logger.log(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", var5.getHeader().getType().getItemType());
                  break;
               }
            }

            Object var17 = HintUtils.getSentrySdkHint(var2);
            if (var17 instanceof SubmissionResult && !((SubmissionResult)var17).isSuccess()) {
               this.logger.log(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", var3);
               break;
            }

            HintUtils.runIfHasType(var2, Resettable.class, var0 -> var0.reset());
         }
      }
   }

   @NotNull
   private TracesSamplingDecision extractSamplingDecision(@Nullable TraceContext var1) {
      if (var1 != null) {
         String var2 = var1.getSampleRate();
         if (var2 != null) {
            try {
               Double var3 = Double.parseDouble(var2);
               if (SampleRateUtils.isValidTracesSampleRate(var3, false)) {
                  return new TracesSamplingDecision(true, var3);
               }

               this.logger.log(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", var2);
            } catch (Exception var4) {
               this.logger.log(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", var2);
            }
         }
      }

      return new TracesSamplingDecision(true);
   }

   private void logEnvelopeItemNull(@NotNull SentryEnvelopeItem var1, int var2) {
      this.logger.log(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", var2, var1.getHeader().getType());
   }

   private void logUnexpectedEventId(@NotNull SentryEnvelope var1, @Nullable SentryId var2, int var3) {
      this.logger.log(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", var3, var1.getHeader().getEventId(), var2);
   }

   private void logItemCaptured(int var1) {
      this.logger.log(SentryLevel.DEBUG, "Item %d is being captured.", var1);
   }

   private void logTimeout(@Nullable SentryId var1) {
      this.logger.log(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", var1);
   }

   private boolean waitFlush(@NotNull Hint var1) {
      Object var2 = HintUtils.getSentrySdkHint(var1);
      if (var2 instanceof Flushable) {
         return ((Flushable)var2).waitFlush();
      }

      LogUtils.logNotInstanceOf(Flushable.class, var2, this.logger);
      return true;
   }
}
