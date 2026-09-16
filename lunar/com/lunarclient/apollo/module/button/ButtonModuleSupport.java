package com.lunarclient.apollo.module.button;

import com.google.protobuf.Message;
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.common.button.ApolloButtonSize;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.action.ApolloButtonAction;
import com.lunarclient.apollo.common.button.action.RunCommandAction;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.common.button.content.ApolloButtonContentPart;
import com.lunarclient.apollo.common.button.content.LiveComponentPart;
import com.lunarclient.apollo.common.location.HudPosition;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.network.ButtonNetworkTypes;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class ButtonModuleSupport<B extends ApolloButton, P extends Message> {
   private static final long TICK_MILLIS = 50L;
   private final Set<UUID> openViewers = ConcurrentHashMap.newKeySet();
   private final Map<UUID, Map<String, ButtonModuleSupport.LiveButton>> liveButtons = new ConcurrentHashMap<>();
   private final AtomicBoolean broadcastStarted = new AtomicBoolean(false);
   private final AtomicBoolean ticking = new AtomicBoolean(false);
   private final ApolloModule owner;
   private final ButtonSurface<B, P> surface;
   private final SimpleOption<Boolean> broadcastOption;

   public void startBroadcast() {
      if (this.broadcastStarted.compareAndSet(false, true)) {
         try {
            Apollo.getPlatform().getScheduler().scheduleAsyncRepeating(this::broadcastTick, 50L, 50L, TimeUnit.MILLISECONDS);
         } catch (Throwable var2) {
            this.broadcastStarted.set(false);
         }
      }
   }

   public void displayButtons(Recipients var1, Collection<B> var2) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Button collection must not be empty");
      }

      HashSet var3 = new HashSet(var2.size());
      ArrayList var4 = new ArrayList();

      for (ApolloButton var6 : var2) {
         this.surface.validate((B)var6);
         if (!var3.add(var6.getId())) {
            throw new IllegalArgumentException("Duplicate button id '" + var6.getId() + "' in display batch");
         }

         if (this.isLiveButton(var6)) {
            var4.add(var6);
         }
      }

      if (!var4.isEmpty()) {
         var1.forEach(var2x -> {
            ApolloPlayer var3x = (ApolloPlayer)var2x;
            ArrayList var4x = new ArrayList();

            for (ApolloButton var6x : var2) {
               var4x.add(this.surface.toDisplayElement((B)var6x, var3x));
            }

            ApolloManager.getNetworkManager().sendPacket(var3x, this.surface.createDisplay(var4x));
            long var10 = System.currentTimeMillis();
            Map var7x = this.liveButtons.computeIfAbsent(var3x.getUniqueId(), var0 -> new ConcurrentHashMap<>());

            for (ApolloButton var9 : var2) {
               if (this.isLiveButton(var9)) {
                  var7x.put(var9.getId(), this.createLiveButton(var9.getContent(), var9.getTooltip(), var10));
               } else {
                  var7x.remove(var9.getId());
               }
            }
         });
      } else {
         ArrayList var8 = new ArrayList();

         for (ApolloButton var7 : var2) {
            var8.add(this.surface.toDisplayElement((B)var7, null));
         }

         ApolloManager.getNetworkManager().sendPacket(var1, this.surface.createDisplay(var8));
         this.untrackButtons(var1, var2);
      }
   }

   private void untrackButtons(Recipients var1, Collection<B> var2) {
      var1.forEach(var2x -> {
         Map var3 = this.liveButtons.get(((ApolloPlayer)var2x).getUniqueId());
         if (var3 != null) {
            for (ApolloButton var5 : var2) {
               var3.remove(var5.getId());
            }
         }
      });
   }

   public void removeButton(Recipients var1, String var2) {
      ApolloManager.getNetworkManager().sendPacket(var1, this.surface.createRemove(var2));
      var1.forEach(var2x -> {
         Map var3 = this.liveButtons.get(((ApolloPlayer)var2x).getUniqueId());
         if (var3 != null) {
            var3.remove(var2);
         }
      });
   }

   public void resetButtons(Recipients var1) {
      ApolloManager.getNetworkManager().sendPacket(var1, this.surface.createReset());
      var1.forEach(var1x -> {
         Map var10000 = this.liveButtons.remove(((ApolloPlayer)var1x).getUniqueId());
      });
   }

   public void pushUpdate(Recipients var1, String var2, @Nullable ApolloButtonContent var3, boolean var4, @Nullable ApolloButtonTooltip var5) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("ApolloButton#id must not be empty");
      }

      boolean var6 = var3 != null && var3.isLive() || var4 && var5 != null && var5.isLive();
      if (!var6) {
         ButtonUpdate var7 = ButtonNetworkTypes.toUpdateProtobuf(var3, var5, var4, null);
         ApolloManager.getNetworkManager().sendPacket(var1, this.surface.createUpdate(var2, var7));
      } else {
         var1.forEach(var5x -> {
            ApolloPlayer var6x = (ApolloPlayer)var5x;
            ButtonUpdate var7x = ButtonNetworkTypes.toUpdateProtobuf(var3, var5, var4, var6x);
            ApolloManager.getNetworkManager().sendPacket(var6x, this.surface.createUpdate(var2, var7x));
         });
      }

      var1.forEach(var5x -> {
         Map var6x = this.liveButtons.computeIfAbsent(((ApolloPlayer)var5x).getUniqueId(), var0 -> new ConcurrentHashMap<>());
         long var7x = System.currentTimeMillis();
         var6x.compute(var2, (var6xx, var7xx) -> {
            ApolloButtonContent var8 = var3 != null ? var3 : (var7xx != null ? var7xx.content : null);
            ApolloButtonTooltip var9 = var4 ? var5 : (var7xx != null ? var7xx.tooltip : null);
            return var8 != null && (var8.isLive() || var9 != null && var9.isLive()) ? this.createLiveButton(var8, var9, var7x) : null;
         });
      });
   }

   public void handleOpen(ApolloPlayer var1) {
      if (this.owner.isEnabled()) {
         this.openViewers.add(var1.getUniqueId());
         if (this.owner.getOptions().<Boolean, SimpleOption<Boolean>>get(this.broadcastOption)) {
            Map var2 = this.liveButtons.get(var1.getUniqueId());
            if (var2 != null && !var2.isEmpty()) {
               this.sendLiveUpdates(var1, var2, System.currentTimeMillis(), true);
            }
         }
      }
   }

   public void handleClose(UUID var1) {
      this.openViewers.remove(var1);
   }

   public void handleUnregister(UUID var1) {
      this.openViewers.remove(var1);
      this.liveButtons.remove(var1);
   }

   private void broadcastTick() {
      if (this.ticking.compareAndSet(false, true)) {
         try {
            if (!this.owner.isEnabled()) {
               this.liveButtons.clear();
               this.openViewers.clear();
               return;
            }

            if (this.owner.getOptions().<Boolean, SimpleOption<Boolean>>get(this.broadcastOption) && !this.liveButtons.isEmpty()) {
               long var1 = System.currentTimeMillis();
               boolean var3 = this.surface.isOpenTrackingActive();
               Iterator var4 = this.liveButtons.entrySet().iterator();

               while (var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  if (((Map)var5.getValue()).isEmpty()) {
                     var4.remove();
                  } else if ((!var3 || this.openViewers.contains(var5.getKey()))
                     && this.anyUpdateDue((Map<String, ButtonModuleSupport.LiveButton>)var5.getValue(), var1)) {
                     ApolloPlayer var6 = Apollo.getPlayerManager().getPlayer((UUID)var5.getKey()).orElse(null);
                     if (var6 == null) {
                        var4.remove();
                     } else {
                        try {
                           this.sendLiveUpdates(var6, (Map<String, ButtonModuleSupport.LiveButton>)var5.getValue(), var1, false);
                        } catch (Throwable var12) {
                           var12.printStackTrace();
                        }
                     }
                  }
               }

               return;
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            return;
         } finally {
            this.ticking.set(false);
         }
      }
   }

   private long millisToTicks(Duration var1) {
      return Math.max(1L, var1.toMillis() / 50L) * 50L;
   }

   private ButtonModuleSupport.LiveButton createLiveButton(ApolloButtonContent var1, @Nullable ApolloButtonTooltip var2, long var3) {
      long var5 = 0L;

      for (ApolloButtonContentPart var8 : var1.getParts()) {
         if (var8 instanceof LiveComponentPart) {
            LiveComponentPart var9 = (LiveComponentPart)var8;
            long var10 = this.millisToTicks(var9.getUpdateInterval());
            if (var5 == 0L || var10 < var5) {
               var5 = var10;
            }
         }
      }

      Duration var12 = var2 != null ? var2.getUpdateInterval() : null;
      long var13 = var12 != null ? this.millisToTicks(var12) : 0L;
      return new ButtonModuleSupport.LiveButton(var1, var2, var5, var13, var3);
   }

   private boolean anyUpdateDue(Map<String, ButtonModuleSupport.LiveButton> var1, long var2) {
      for (ButtonModuleSupport.LiveButton var5 : var1.values()) {
         if (var5.isContentDue(var2) || var5.isTooltipDue(var2)) {
            return true;
         }
      }

      return false;
   }

   private void sendLiveUpdates(ApolloPlayer var1, Map<String, ButtonModuleSupport.LiveButton> var2, long var3, boolean var5) {
      for (Entry var7 : var2.entrySet()) {
         ButtonModuleSupport.LiveButton var8 = (ButtonModuleSupport.LiveButton)var7.getValue();
         boolean var9 = var5 ? var8.contentIntervalMillis > 0L : var8.isContentDue(var3);
         boolean var10 = var5 ? var8.tooltipIntervalMillis > 0L : var8.isTooltipDue(var3);
         if (var9 || var10) {
            ButtonUpdate var11 = ButtonNetworkTypes.toUpdateProtobuf(var9 ? var8.content : null, var8.tooltip, var10, var1);
            ApolloManager.getNetworkManager().sendPacket(var1, this.surface.createUpdate((String)var7.getKey(), var11));
            if (var9) {
               var8.nextContentUpdate = var3 + var8.contentIntervalMillis;
            }

            if (var10) {
               var8.nextTooltipUpdate = var3 + var8.tooltipIntervalMillis;
            }
         }
      }
   }

   private boolean isLiveButton(ApolloButton var1) {
      ApolloButtonTooltip var2 = var1.getTooltip();
      return var1.getContent().isLive() || var2 != null && var2.isLive();
   }

   public static void validateCommon(ApolloButton var0, float var1, float var2) {
      requireSet(var0.getId(), "ApolloButton#id");
      requireSet(var0.getPosition(), "ApolloButton#position");
      requireSet(var0.getSize(), "ApolloButton#size");
      requireSet(var0.getShape(), "ApolloButton#shape");
      requireSet(var0.getBackgroundColor(), "ApolloButton#backgroundColor");
      requireSet(var0.getBorderColor(), "ApolloButton#borderColor");
      requireSet(var0.getContent(), "ApolloButton#content");
      if (var0.getId().isEmpty()) {
         throw new IllegalArgumentException("ApolloButton#id must not be empty");
      }

      HudPosition var3 = var0.getPosition();
      ApolloButtonSize var4 = var0.getSize();
      if (Float.isFinite(var3.getX()) && Float.isFinite(var3.getY()) && Float.isFinite(var4.getWidth()) && Float.isFinite(var4.getHeight())) {
         if (var4.getWidth() <= 0.0F || var4.getHeight() <= 0.0F) {
            throw new IllegalArgumentException("ApolloButton#size width and height must be greater than 0");
         }

         if (!(var3.getX() < 0.0F) && !(var3.getY() < 0.0F) && !(var3.getX() + var4.getWidth() > var1) && !(var3.getY() + var4.getHeight() > var2)) {
            ApolloButtonAction var5 = var0.getOnClick();
            if (var5 instanceof RunCommandAction && !((RunCommandAction)var5).getCommand().startsWith("/")) {
               throw new IllegalArgumentException("RunCommandAction#command must start with '/'");
            }
         } else {
            throw new IllegalArgumentException("ApolloButton must fit within the " + var1 + "x" + var2 + " button box");
         }
      } else {
         throw new IllegalArgumentException("ApolloButton position and size must be finite");
      }
   }

   public static void requireSet(@Nullable Object var0, String var1) {
      if (var0 == null) {
         throw new IllegalArgumentException(var1 + " must not be null");
      }
   }

   @Generated
   public ButtonModuleSupport(ApolloModule var1, ButtonSurface<B, P> var2, SimpleOption<Boolean> var3) {
      this.owner = var1;
      this.surface = var2;
      this.broadcastOption = var3;
   }

   private static final class LiveButton {
      private final ApolloButtonContent content;
      @Nullable
      private final ApolloButtonTooltip tooltip;
      private final long contentIntervalMillis;
      private final long tooltipIntervalMillis;
      private volatile long nextContentUpdate;
      private volatile long nextTooltipUpdate;

      private LiveButton(ApolloButtonContent var1, @Nullable ApolloButtonTooltip var2, long var3, long var5, long var7) {
         this.content = var1;
         this.tooltip = var2;
         this.contentIntervalMillis = var3;
         this.tooltipIntervalMillis = var5;
         this.nextContentUpdate = var7 + var3;
         this.nextTooltipUpdate = var7 + var5;
      }

      private boolean isContentDue(long var1) {
         return this.contentIntervalMillis > 0L && var1 >= this.nextContentUpdate;
      }

      private boolean isTooltipDue(long var1) {
         return this.tooltipIntervalMillis > 0L && var1 >= this.nextTooltipUpdate;
      }
   }
}
