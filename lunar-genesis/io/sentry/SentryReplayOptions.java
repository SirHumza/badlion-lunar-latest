package io.sentry;

import io.sentry.util.SampleRateUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryReplayOptions {
   public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
   public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
   public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
   public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
   public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
   public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
   public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
   @Nullable
   private Double sessionSampleRate;
   @Nullable
   private Double onErrorSampleRate;
   private Set<String> maskViewClasses = new CopyOnWriteArraySet<>();
   private Set<String> unmaskViewClasses = new CopyOnWriteArraySet<>();
   @Nullable
   private String maskViewContainerClass = null;
   @Nullable
   private String unmaskViewContainerClass = null;
   private SentryReplayOptions.SentryReplayQuality quality = SentryReplayOptions.SentryReplayQuality.MEDIUM;
   private int frameRate = 1;
   private long errorReplayDuration = 30000L;
   private long sessionSegmentDuration = 5000L;
   private long sessionDuration = 3600000L;

   public SentryReplayOptions(boolean var1) {
      if (!var1) {
         this.setMaskAllText(true);
         this.setMaskAllImages(true);
         this.maskViewClasses.add("android.webkit.WebView");
         this.maskViewClasses.add("android.widget.VideoView");
         this.maskViewClasses.add("androidx.media3.ui.PlayerView");
         this.maskViewClasses.add("com.google.android.exoplayer2.ui.PlayerView");
         this.maskViewClasses.add("com.google.android.exoplayer2.ui.StyledPlayerView");
      }
   }

   public SentryReplayOptions(@Nullable Double var1, @Nullable Double var2) {
      this(false);
      this.sessionSampleRate = var1;
      this.onErrorSampleRate = var2;
   }

   @Nullable
   public Double getOnErrorSampleRate() {
      return this.onErrorSampleRate;
   }

   public boolean isSessionReplayEnabled() {
      return this.getSessionSampleRate() != null && this.getSessionSampleRate() > 0.0;
   }

   public void setOnErrorSampleRate(@Nullable Double var1) {
      if (!SampleRateUtils.isValidSampleRate(var1)) {
         throw new IllegalArgumentException("The value " + var1 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
      }

      this.onErrorSampleRate = var1;
   }

   @Nullable
   public Double getSessionSampleRate() {
      return this.sessionSampleRate;
   }

   public boolean isSessionReplayForErrorsEnabled() {
      return this.getOnErrorSampleRate() != null && this.getOnErrorSampleRate() > 0.0;
   }

   public void setSessionSampleRate(@Nullable Double var1) {
      if (!SampleRateUtils.isValidSampleRate(var1)) {
         throw new IllegalArgumentException("The value " + var1 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
      }

      this.sessionSampleRate = var1;
   }

   public void setMaskAllText(boolean var1) {
      if (var1) {
         this.addMaskViewClass("android.widget.TextView");
         this.unmaskViewClasses.remove("android.widget.TextView");
      } else {
         this.addUnmaskViewClass("android.widget.TextView");
         this.maskViewClasses.remove("android.widget.TextView");
      }
   }

   public void setMaskAllImages(boolean var1) {
      if (var1) {
         this.addMaskViewClass("android.widget.ImageView");
         this.unmaskViewClasses.remove("android.widget.ImageView");
      } else {
         this.addUnmaskViewClass("android.widget.ImageView");
         this.maskViewClasses.remove("android.widget.ImageView");
      }
   }

   @NotNull
   public Set<String> getMaskViewClasses() {
      return this.maskViewClasses;
   }

   public void addMaskViewClass(@NotNull String var1) {
      this.maskViewClasses.add(var1);
   }

   @NotNull
   public Set<String> getUnmaskViewClasses() {
      return this.unmaskViewClasses;
   }

   public void addUnmaskViewClass(@NotNull String var1) {
      this.unmaskViewClasses.add(var1);
   }

   @ApiStatus.Internal
   @NotNull
   public SentryReplayOptions.SentryReplayQuality getQuality() {
      return this.quality;
   }

   public void setQuality(@NotNull SentryReplayOptions.SentryReplayQuality var1) {
      this.quality = var1;
   }

   @ApiStatus.Internal
   public int getFrameRate() {
      return this.frameRate;
   }

   @ApiStatus.Internal
   public long getErrorReplayDuration() {
      return this.errorReplayDuration;
   }

   @ApiStatus.Internal
   public long getSessionSegmentDuration() {
      return this.sessionSegmentDuration;
   }

   @ApiStatus.Internal
   public long getSessionDuration() {
      return this.sessionDuration;
   }

   @ApiStatus.Internal
   public void setMaskViewContainerClass(@NotNull String var1) {
      this.addMaskViewClass(var1);
      this.maskViewContainerClass = var1;
   }

   @ApiStatus.Internal
   public void setUnmaskViewContainerClass(@NotNull String var1) {
      this.unmaskViewContainerClass = var1;
   }

   @ApiStatus.Internal
   @Nullable
   public String getMaskViewContainerClass() {
      return this.maskViewContainerClass;
   }

   @ApiStatus.Internal
   @Nullable
   public String getUnmaskViewContainerClass() {
      return this.unmaskViewContainerClass;
   }

   public enum SentryReplayQuality {
      LOW(0.8F, 50000),
      MEDIUM(1.0F, 75000),
      HIGH(1.0F, 100000);

      public final float sizeScale;
      public final int bitRate;

      SentryReplayQuality(float var3, int var4) {
         this.sizeScale = var3;
         this.bitRate = var4;
      }
   }
}
