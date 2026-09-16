package com.lunarclient.apollo.option.config;

import com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon;
import com.lunarclient.apollo.common.icon.CustomModelData;
import com.lunarclient.apollo.common.icon.Icon;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.icon.ResourceLocationIcon;
import com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon;
import com.lunarclient.apollo.common.profile.Profile;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import lombok.Generated;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.serialize.SerializationException;
import org.spongepowered.configurate.serialize.TypeSerializer;

public final class CommonSerializers implements Serializer {
   public CommonSerializers() {
      CommonSerializers.ItemStackIconSerializer var1 = new CommonSerializers.ItemStackIconSerializer();
      this.serializer(Color.class, new CommonSerializers.ColorSerializer());
      this.serializer(Icon.class, new CommonSerializers.IconSerializer(var1));
      this.serializer(ItemStackIcon.class, var1);
   }

   private static final class ColorSerializer implements TypeSerializer<Color> {
      private ColorSerializer() {
      }

      public Color deserialize(Type var1, ConfigurationNode var2) {
         String var3 = var2.getString();
         if (var3 != null && !var3.isEmpty()) {
            String var4 = var2.getString();
            if (var4.startsWith("#")) {
               var4 = var4.substring(1);
            }

            if (var4.length() == 6) {
               return new Color(Integer.parseInt(var4, 16));
            } else if (var4.length() == 8) {
               long var5 = Long.parseLong(var4, 16);
               int var7 = (int)(var5 >> 24 & 255L);
               int var8 = (int)(var5 >> 16 & 255L);
               int var9 = (int)(var5 >> 8 & 255L);
               int var10 = (int)(var5 & 255L);
               return new Color(var8, var9, var10, var7);
            } else {
               throw new NumberFormatException("Invalid color string length: " + var4);
            }
         } else {
            return null;
         }
      }

      public void serialize(Type var1, @Nullable Color var2, ConfigurationNode var3) {
         if (var2 == null) {
            var3.set(null);
         } else {
            var3.set(String.format("#%08X", var2.getRGB()));
         }
      }
   }

   private static final class IconSerializer implements TypeSerializer<Icon> {
      private final CommonSerializers.ItemStackIconSerializer itemStackIconSerializer;

      public Icon deserialize(Type var1, ConfigurationNode var2) {
         if (var2.hasChild(new Object[]{"name"}) || var2.hasChild(new Object[]{"id"})) {
            return this.itemStackIconSerializer.deserialize(var1, var2);
         } else if (!var2.hasChild(new Object[]{"resource-location"})) {
            throw new SerializationException("Icons require a 'name', 'id' or 'resource-location' field!");
         } else {
            String var3 = var2.node(new Object[]{"resource-location"}).getString();
            if (var3 == null || var3.isEmpty()) {
               throw new SerializationException("Icon 'resource-location' must not be empty!");
            } else if (var2.hasChild(new Object[]{"width"})
               || var2.hasChild(new Object[]{"height"})
               || var2.hasChild(new Object[]{"min-u"})
               || var2.hasChild(new Object[]{"max-u"})
               || var2.hasChild(new Object[]{"min-v"})
               || var2.hasChild(new Object[]{"max-v"})) {
               return AdvancedResourceLocationIcon.builder()
                  .resourceLocation(var3)
                  .width((float)var2.node(new Object[]{"width"}).getDouble())
                  .height((float)var2.node(new Object[]{"height"}).getDouble())
                  .minU((float)var2.node(new Object[]{"min-u"}).getDouble())
                  .maxU((float)var2.node(new Object[]{"max-u"}).getDouble(1.0))
                  .minV((float)var2.node(new Object[]{"min-v"}).getDouble())
                  .maxV((float)var2.node(new Object[]{"max-v"}).getDouble(1.0))
                  .build();
            } else {
               return var2.hasChild(new Object[]{"size"})
                  ? SimpleResourceLocationIcon.builder().resourceLocation(var3).size(var2.node(new Object[]{"size"}).getInt()).build()
                  : ResourceLocationIcon.builder().resourceLocation(var3).build();
            }
         }
      }

      public void serialize(Type var1, @Nullable Icon var2, ConfigurationNode var3) {
         if (var2 == null) {
            var3.raw(null);
         } else if (var2 instanceof ItemStackIcon) {
            this.itemStackIconSerializer.serialize(var1, (ItemStackIcon)var2, var3);
         } else if (var2 instanceof SimpleResourceLocationIcon) {
            SimpleResourceLocationIcon var5 = (SimpleResourceLocationIcon)var2;
            var3.node(new Object[]{"resource-location"}).set(var5.getResourceLocation());
            var3.node(new Object[]{"size"}).set(var5.getSize());
         } else if (var2 instanceof AdvancedResourceLocationIcon) {
            AdvancedResourceLocationIcon var4 = (AdvancedResourceLocationIcon)var2;
            var3.node(new Object[]{"resource-location"}).set(var4.getResourceLocation());
            var3.node(new Object[]{"width"}).set((double)var4.getWidth());
            var3.node(new Object[]{"height"}).set((double)var4.getHeight());
            var3.node(new Object[]{"min-u"}).set((double)var4.getMinU());
            var3.node(new Object[]{"max-u"}).set((double)var4.getMaxU());
            var3.node(new Object[]{"min-v"}).set((double)var4.getMinV());
            var3.node(new Object[]{"max-v"}).set((double)var4.getMaxV());
         } else if (var2 instanceof ResourceLocationIcon) {
            var3.node(new Object[]{"resource-location"}).set(((ResourceLocationIcon)var2).getResourceLocation());
         } else {
            throw new SerializationException("Unknown icon type: " + var2.getClass().getName());
         }
      }

      @Generated
      public IconSerializer(CommonSerializers.ItemStackIconSerializer var1) {
         this.itemStackIconSerializer = var1;
      }
   }

   private static final class ItemStackIconSerializer implements TypeSerializer<ItemStackIcon> {
      private ItemStackIconSerializer() {
      }

      public ItemStackIcon deserialize(Type var1, ConfigurationNode var2) {
         if (!var2.hasChild(new Object[]{"name"}) && !var2.hasChild(new Object[]{"id"})) {
            throw new SerializationException("Item icons require a 'name' or 'id' field!");
         }

         ItemStackIcon.ItemStackIconBuilder var3 = ItemStackIcon.builder();
         if (var2.hasChild(new Object[]{"name"})) {
            String var4 = var2.node(new Object[]{"name"}).getString();
            if (var4 == null || var4.isEmpty()) {
               throw new SerializationException("Item icon 'name' must not be empty!");
            }

            var3.itemName(var4);
         } else {
            var3.itemId(var2.node(new Object[]{"id"}).getInt());
         }

         if (var2.hasChild(new Object[]{"custom-model-data"})) {
            var3.customModelData(var2.node(new Object[]{"custom-model-data"}).getInt());
         }

         if (var2.hasChild(new Object[]{"model-data"})) {
            ConfigurationNode var5 = var2.node(new Object[]{"model-data"});
            var3.customModelDataObject(
               CustomModelData.builder()
                  .floats(var5.node(new Object[]{"floats"}).getList(Float.class, Collections.emptyList()))
                  .flags(var5.node(new Object[]{"flags"}).getList(Boolean.class, Collections.emptyList()))
                  .strings(var5.node(new Object[]{"strings"}).getList(String.class, Collections.emptyList()))
                  .colors(var5.node(new Object[]{"colors"}).getList(Integer.class, Collections.emptyList()))
                  .build()
            );
         }

         if (var2.hasChild(new Object[]{"potion"})) {
            var3.potion(var2.node(new Object[]{"potion"}).getString());
         }

         if (var2.hasChild(new Object[]{"profile"})) {
            var3.profile(this.readProfile(var2.node(new Object[]{"profile"})));
         }

         return var3.build();
      }

      public void serialize(Type var1, @Nullable ItemStackIcon var2, ConfigurationNode var3) {
         if (var2 == null) {
            var3.raw(null);
         } else {
            if (var2.getItemName() != null) {
               var3.node(new Object[]{"name"}).set(var2.getItemName());
            } else {
               var3.node(new Object[]{"id"}).set(var2.getItemId());
            }

            if (var2.getCustomModelData() != 0) {
               var3.node(new Object[]{"custom-model-data"}).set(var2.getCustomModelData());
            }

            CustomModelData var4 = var2.getCustomModelDataObject();
            if (var4 != null) {
               this.writeList(var3.node(new Object[]{"model-data", "floats"}), Float.class, var4.getFloats());
               this.writeList(var3.node(new Object[]{"model-data", "flags"}), Boolean.class, var4.getFlags());
               this.writeList(var3.node(new Object[]{"model-data", "strings"}), String.class, var4.getStrings());
               this.writeList(var3.node(new Object[]{"model-data", "colors"}), Integer.class, var4.getColors());
            }

            if (var2.getPotion() != null) {
               var3.node(new Object[]{"potion"}).set(var2.getPotion());
            }

            Profile var5 = var2.getProfile();
            if (var5 != null) {
               if (var5.getId() != null) {
                  var3.node(new Object[]{"profile", "id"}).set(var5.getId().toString());
               }

               var3.node(new Object[]{"profile", "texture"}).set(var5.getTexture());
               var3.node(new Object[]{"profile", "signature"}).set(var5.getSignature());
            }
         }
      }

      private Profile readProfile(ConfigurationNode var1) {
         Profile.ProfileBuilder var2 = Profile.builder()
            .texture(var1.node(new Object[]{"texture"}).getString(""))
            .signature(var1.node(new Object[]{"signature"}).getString(""));
         String var3 = var1.node(new Object[]{"id"}).getString();
         if (var3 != null) {
            try {
               var2.id(UUID.fromString(var3));
            } catch (IllegalArgumentException var5) {
               throw new SerializationException("Invalid profile id '" + var3 + "'!");
            }
         }

         return var2.build();
      }

      private <V> void writeList(ConfigurationNode var1, Class<V> var2, List<V> var3) {
         if (!var3.isEmpty()) {
            var1.setList(var2, var3);
         }
      }
   }
}
