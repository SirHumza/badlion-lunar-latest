package com.lunarclient.apollo.module.button;

import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.common.button.ApolloButtonShape;
import com.lunarclient.apollo.common.button.ApolloButtonSize;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.action.ApolloButtonAction;
import com.lunarclient.apollo.common.button.action.ApolloButtonClientAction;
import com.lunarclient.apollo.common.button.action.ClientAction;
import com.lunarclient.apollo.common.button.action.OpenUrlAction;
import com.lunarclient.apollo.common.button.action.RunCommandAction;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.common.button.content.ApolloButtonContentPart;
import com.lunarclient.apollo.common.button.content.ComponentPart;
import com.lunarclient.apollo.common.button.content.IconPart;
import com.lunarclient.apollo.common.button.content.LiveComponentPart;
import com.lunarclient.apollo.common.icon.Icon;
import com.lunarclient.apollo.common.location.HudPosition;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.serialize.SerializationException;
import org.spongepowered.configurate.serialize.TypeSerializer;

public abstract class ApolloButtonSerializer<T extends ApolloButton> implements TypeSerializer<T> {
   public T deserialize(Type var1, ConfigurationNode var2) {
      try {
         ApolloButtonContent.Builder var3 = ApolloButtonContent.builder();

         for (ConfigurationNode var5 : var2.node(new Object[]{"content", "parts"}).childrenList()) {
            if (var5.hasChild(new Object[]{"text"})) {
               var3.append(ApolloComponent.fromLegacyAmpersand(var5.node(new Object[]{"text"}).getString("")));
            } else {
               if (!var5.hasChild(new Object[]{"icon"})) {
                  throw new SerializationException("Button content parts require a 'text' or 'icon' field!");
               }

               Icon var6 = (Icon)var5.node(new Object[]{"icon"}).get(Icon.class);
               if (var6 == null) {
                  throw new SerializationException("Button content part 'icon' must not be empty!");
               }

               var3.append(var6);
            }
         }

         if (var2.hasChild(new Object[]{"content", "scale"})) {
            var3.scale((float)var2.node(new Object[]{"content", "scale"}).getDouble(1.0));
         }

         String var10 = this.virtualNode(var2, "id").getString();
         if (var10 != null && !var10.isEmpty()) {
            ApolloButton.ApolloButtonBuilder var11 = this.createBuilder(var2);
            var11.id(var10);
            var11.position(
               HudPosition.of((float)this.virtualNode(var2, "position", "x").getDouble(), (float)this.virtualNode(var2, "position", "y").getDouble())
            );
            var11.size(
               ApolloButtonSize.of((float)this.virtualNode(var2, "size", "width").getDouble(), (float)this.virtualNode(var2, "size", "height").getDouble())
            );
            var11.shape(this.parseEnum(ApolloButtonShape.class, this.virtualNode(var2, "shape").getString(), "shape"));
            var11.content(var3.build());
            var11.hoveredBackgroundColor((Color)var2.node(new Object[]{"hovered-background-color"}).get(Color.class));
            var11.hoveredBorderColor((Color)var2.node(new Object[]{"hovered-border-color"}).get(Color.class));
            if (var2.hasChild(new Object[]{"tooltip"})) {
               ArrayList var12 = new ArrayList();

               for (ConfigurationNode var8 : var2.node(new Object[]{"tooltip"}).childrenList()) {
                  var12.add(ApolloComponent.fromLegacyAmpersand(var8.getString("")));
               }

               var11.tooltip(ApolloButtonTooltip.of(var12));
            }

            if (var2.hasChild(new Object[]{"on-click"})) {
               var11.onClick(this.readAction(var2.node(new Object[]{"on-click"})));
            }

            return (T)var11.build();
         } else {
            throw new SerializationException("Required field id must not be empty!");
         }
      } catch (IllegalArgumentException var9) {
         throw new SerializationException(var9.getMessage());
      }
   }

   public void serialize(Type var1, @Nullable T var2, ConfigurationNode var3) {
      if (var2 == null) {
         var3.raw(null);
      } else {
         var3.node(new Object[]{"id"}).set(var2.getId());
         this.serializeSurface((T)var2, var3);
         var3.node(new Object[]{"position", "x"}).set((double)var2.getPosition().getX());
         var3.node(new Object[]{"position", "y"}).set((double)var2.getPosition().getY());
         var3.node(new Object[]{"size", "width"}).set((double)var2.getSize().getWidth());
         var3.node(new Object[]{"size", "height"}).set((double)var2.getSize().getHeight());
         var3.node(new Object[]{"shape"}).set(var2.getShape().name());
         var3.node(new Object[]{"background-color"}).set(Color.class, var2.getBackgroundColor());
         var3.node(new Object[]{"border-color"}).set(Color.class, var2.getBorderColor());
         if (var2.getHoveredBackgroundColor() != null) {
            var3.node(new Object[]{"hovered-background-color"}).set(Color.class, var2.getHoveredBackgroundColor());
         }

         if (var2.getHoveredBorderColor() != null) {
            var3.node(new Object[]{"hovered-border-color"}).set(Color.class, var2.getHoveredBorderColor());
         }

         var3.node(new Object[]{"content", "scale"}).set((double)var2.getContent().getScale());

         for (ApolloButtonContentPart var5 : var2.getContent().getParts()) {
            this.writePart(var3.node(new Object[]{"content", "parts"}).appendListNode(), var5);
         }

         ApolloButtonTooltip var7 = var2.getTooltip();
         if (var7 != null) {
            if (var7.isLive() || var7.getLines() == null) {
               throw new SerializationException("Live tooltips cannot be stored in the config!");
            }

            for (Component var6 : var7.getLines()) {
               var3.node(new Object[]{"tooltip"}).appendListNode().set(ApolloComponent.toLegacyAmpersand(var6));
            }
         }

         ApolloButtonAction var9 = var2.getOnClick();
         if (var9 instanceof RunCommandAction) {
            var3.node(new Object[]{"on-click", "run-command"}).set(((RunCommandAction)var9).getCommand());
         } else if (var9 instanceof OpenUrlAction) {
            var3.node(new Object[]{"on-click", "open-url"}).set(((OpenUrlAction)var9).getUrl());
         } else if (var9 instanceof ClientAction) {
            var3.node(new Object[]{"on-click", "client-action"}).set(((ClientAction)var9).getAction().name());
         }
      }
   }

   protected abstract ApolloButton.ApolloButtonBuilder<? extends T, ?> createBuilder(ConfigurationNode var1);

   protected void serializeSurface(T var1, ConfigurationNode var2) {
   }

   protected <E extends Enum<E>> E parseEnum(Class<E> var1, @Nullable String var2, String var3) {
      if (var2 == null) {
         throw new SerializationException("Required field " + var3 + " not found!");
      }

      try {
         return Enum.valueOf(var1, var2.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var5) {
         throw new SerializationException("Unknown " + var3 + " '" + var2 + "'!");
      }
   }

   protected ConfigurationNode virtualNode(ConfigurationNode var1, Object... var2) {
      if (!var1.hasChild(var2)) {
         throw new SerializationException("Required field " + Arrays.toString(var2) + " not found!");
      } else {
         return var1.node(var2);
      }
   }

   private ApolloButtonAction readAction(ConfigurationNode var1) {
      if (var1.hasChild(new Object[]{"run-command"})) {
         return ApolloButtonAction.runCommand(var1.node(new Object[]{"run-command"}).getString(""));
      } else if (var1.hasChild(new Object[]{"open-url"})) {
         return ApolloButtonAction.openUrl(var1.node(new Object[]{"open-url"}).getString(""));
      } else if (var1.hasChild(new Object[]{"client-action"})) {
         return ApolloButtonAction.clientAction(
            this.parseEnum(ApolloButtonClientAction.class, var1.node(new Object[]{"client-action"}).getString(), "client-action")
         );
      } else {
         throw new SerializationException("on-click requires a 'run-command', 'open-url' or 'client-action' field!");
      }
   }

   private void writePart(ConfigurationNode var1, ApolloButtonContentPart var2) {
      if (var2 instanceof LiveComponentPart) {
         throw new SerializationException("Live content parts cannot be stored in the config!");
      }

      if (var2 instanceof ComponentPart) {
         var1.node(new Object[]{"text"}).set(ApolloComponent.toLegacyAmpersand(((ComponentPart)var2).getComponent()));
      } else if (var2 instanceof IconPart) {
         var1.node(new Object[]{"icon"}).set(Icon.class, ((IconPart)var2).getIcon());
      } else {
         throw new SerializationException("Unknown button content part type: " + var2.getClass().getName());
      }
   }
}
