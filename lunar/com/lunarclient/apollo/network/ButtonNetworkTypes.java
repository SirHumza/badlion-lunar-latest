package com.lunarclient.apollo.network;

import com.lunarclient.apollo.button.v1.Button;
import com.lunarclient.apollo.button.v1.ButtonClientAction;
import com.lunarclient.apollo.button.v1.ButtonContent;
import com.lunarclient.apollo.button.v1.ButtonContentPart;
import com.lunarclient.apollo.button.v1.ButtonShape;
import com.lunarclient.apollo.button.v1.ButtonSize;
import com.lunarclient.apollo.button.v1.ButtonTooltip;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.action.ApolloButtonAction;
import com.lunarclient.apollo.common.button.action.ClientAction;
import com.lunarclient.apollo.common.button.action.OpenUrlAction;
import com.lunarclient.apollo.common.button.action.RunCommandAction;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.common.button.content.ApolloButtonContentPart;
import com.lunarclient.apollo.common.button.content.ComponentPart;
import com.lunarclient.apollo.common.button.content.IconPart;
import com.lunarclient.apollo.common.button.content.LiveComponentPart;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public final class ButtonNetworkTypes {
   public static Button toProtobuf(ApolloButton var0, @Nullable ApolloPlayer var1) {
      Button.Builder var2 = Button.newBuilder()
         .setId(var0.getId())
         .setPosition(NetworkTypes.toProtobuf(var0.getPosition()))
         .setSize(ButtonSize.newBuilder().setWidth(var0.getSize().getWidth()).setHeight(var0.getSize().getHeight()).build())
         .setShape(ButtonShape.forNumber(var0.getShape().ordinal() + 1))
         .setBackgroundColor(NetworkTypes.toProtobuf(var0.getBackgroundColor()))
         .setBorderColor(NetworkTypes.toProtobuf(var0.getBorderColor()))
         .setContent(toContentProtobuf(var0.getContent(), var1));
      ButtonTooltip var3 = toTooltipProtobuf(var0.getTooltip(), var1);
      if (var3 != null) {
         var2.setTooltip(var3);
      }

      ApolloButtonAction var4 = var0.getOnClick();
      if (var4 instanceof RunCommandAction) {
         var2.setRunCommand(((RunCommandAction)var4).getCommand());
      } else if (var4 instanceof OpenUrlAction) {
         var2.setOpenUrl(((OpenUrlAction)var4).getUrl());
      } else if (var4 instanceof ClientAction) {
         ClientAction var5 = (ClientAction)var4;
         var2.setClientAction(ButtonClientAction.forNumber(var5.getAction().ordinal() + 1));
      } else if (var4 != null) {
         throw new IllegalArgumentException("Unknown button action type: " + var4.getClass().getName());
      }

      Color var7 = var0.getHoveredBackgroundColor();
      if (var7 != null) {
         var2.setHoveredBackgroundColor(NetworkTypes.toProtobuf(var7));
      }

      Color var6 = var0.getHoveredBorderColor();
      if (var6 != null) {
         var2.setHoveredBorderColor(NetworkTypes.toProtobuf(var6));
      }

      return var2.build();
   }

   public static ButtonContent toContentProtobuf(ApolloButtonContent var0, @Nullable ApolloPlayer var1) {
      return ButtonContent.newBuilder().addAllParts(resolveContentParts(var0, var1)).setScale(var0.getScale()).build();
   }

   private static List<ButtonContentPart> resolveContentParts(ApolloButtonContent var0, @Nullable ApolloPlayer var1) {
      ArrayList var2 = new ArrayList();

      for (ApolloButtonContentPart var4 : var0.getParts()) {
         ButtonContentPart.Builder var5 = ButtonContentPart.newBuilder();
         if (var4 instanceof LiveComponentPart) {
            Function var6 = ((LiveComponentPart)var4).getResolver();
            var5.setAdventureJsonText(ApolloComponent.toJson(resolveLive(var6, var1)));
         } else if (var4 instanceof ComponentPart) {
            var5.setAdventureJsonText(ApolloComponent.toJson(((ComponentPart)var4).getComponent()));
         } else {
            if (!(var4 instanceof IconPart)) {
               throw new IllegalArgumentException("Unknown button content part type: " + var4.getClass().getName());
            }

            var5.setIcon(NetworkTypes.toProtobuf(((IconPart)var4).getIcon()));
         }

         var2.add(var5.build());
      }

      return var2;
   }

   @Nullable
   public static ButtonTooltip toTooltipProtobuf(@Nullable ApolloButtonTooltip var0, @Nullable ApolloPlayer var1) {
      List var2 = resolveTooltipLines(var0, var1);
      return var2 == null ? null : ButtonTooltip.newBuilder().addAllAdventureJsonLines(var2).build();
   }

   public static ButtonUpdate toUpdateProtobuf(
      @Nullable ApolloButtonContent var0, @Nullable ApolloButtonTooltip var1, boolean var2, @Nullable ApolloPlayer var3
   ) {
      ButtonUpdate.Builder var4 = ButtonUpdate.newBuilder();
      if (var0 != null) {
         var4.setContent(toContentProtobuf(var0, var3));
      }

      if (var2) {
         ButtonTooltip var5 = toTooltipProtobuf(var1, var3);
         if (var5 != null) {
            var4.setTooltip(var5);
         }
      }

      return var4.build();
   }

   private static Component resolveLive(Function<ApolloPlayer, Component> var0, @Nullable ApolloPlayer var1) {
      if (var1 == null) {
         return Component.empty();
      }

      try {
         Component var2 = (Component)var0.apply(var1);
         return var2 != null ? var2 : Component.empty();
      } catch (Throwable var3) {
         var3.printStackTrace();
         return Component.empty();
      }
   }

   @Nullable
   private static List<String> resolveTooltipLines(@Nullable ApolloButtonTooltip var0, @Nullable ApolloPlayer var1) {
      if (var0 == null) {
         return Collections.emptyList();
      }

      List var2 = var0.getLines();
      Function var3 = var0.getResolver();
      if (var3 != null && var1 != null) {
         var2 = null;

         try {
            var2 = (List)var3.apply(var1);
         } catch (Throwable var6) {
            var6.printStackTrace();
         }

         if (var2 == null) {
            return null;
         }
      }

      if (var2 == null) {
         return Collections.emptyList();
      }

      try {
         return var2.stream().map(ApolloComponent::toJson).collect(Collectors.toList());
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private ButtonNetworkTypes() {
   }
}
