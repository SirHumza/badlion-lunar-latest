package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.BlockNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.EntityNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.NBTComponent;
import com.moonsworth.lunar.lib.adventure.text.NBTComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ObjectComponent;
import com.moonsworth.lunar.lib.adventure.text.ScoreComponent;
import com.moonsworth.lunar.lib.adventure.text.SelectorComponent;
import com.moonsworth.lunar.lib.adventure.text.StorageNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;
import com.moonsworth.lunar.lib.adventure.text.object.ObjectContents;
import com.moonsworth.lunar.lib.adventure.text.object.PlayerHeadObjectContents;
import com.moonsworth.lunar.lib.adventure.text.object.SpriteObjectContents;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import org.jetbrains.annotations.Nullable;

final class ComponentSerializerImpl extends TypeAdapter<Component> {
   static final Type COMPONENT_LIST_TYPE = (new TypeToken<List<Component>>() {}).getType();
   static final Type TRANSLATABLE_ARGUMENT_LIST_TYPE = (new TypeToken<List<TranslationArgument>>() {}).getType();
   static final Type PROPERTY_LIST_TYPE = (new TypeToken<List<PlayerHeadObjectContents.ProfileProperty>>() {}).getType();
   private final boolean emitCompactTextComponent;
   private final Gson gson;

   static TypeAdapter<Component> create(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, Gson var1) {
      return new ComponentSerializerImpl(var0.value(JSONOptions.EMIT_COMPACT_TEXT_COMPONENT), var1).nullSafe();
   }

   private ComponentSerializerImpl(boolean var1, Gson var2) {
      this.emitCompactTextComponent = var1;
      this.gson = var2;
   }

   public BuildableComponent<?, ?> read(JsonReader var1) {
      JsonToken var2 = var1.peek();
      if (var2 != JsonToken.STRING && var2 != JsonToken.NUMBER && var2 != JsonToken.BOOLEAN) {
         if (var2 == JsonToken.BEGIN_ARRAY) {
            ComponentBuilder var29 = null;
            var1.beginArray();

            while (var1.hasNext()) {
               BuildableComponent var30 = this.read(var1);
               if (var29 == null) {
                  var29 = var30.toBuilder();
               } else {
                  var29.append(var30);
               }
            }

            if (var29 == null) {
               throw notSureHowToDeserialize(var1.getPath());
            }

            var1.endArray();
            return var29.build();
         } else {
            if (var2 != JsonToken.BEGIN_OBJECT) {
               throw notSureHowToDeserialize(var1.getPath());
            }

            JsonObject var3 = new JsonObject();
            List var4 = Collections.emptyList();
            String var5 = null;
            String var6 = null;
            String var7 = null;
            List var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            String var12 = null;
            String var13 = null;
            String var14 = null;
            boolean var15 = false;
            BlockNBTComponent.Pos var16 = null;
            String var17 = null;
            Key var18 = null;
            BuildableComponent var19 = null;
            Key var20 = null;
            Key var21 = null;
            PlayerHeadObjectContents.Builder var22 = null;
            boolean var23 = false;
            var1.beginObject();

            while (var1.hasNext()) {
               String var24 = var1.nextName();
               if (var24.equals("text")) {
                  var5 = GsonHacks.readString(var1);
               } else if (var24.equals("translate")) {
                  var6 = var1.nextString();
               } else if (var24.equals("fallback")) {
                  var7 = var1.nextString();
               } else if (var24.equals("with")) {
                  var8 = this.gson.fromJson(var1, TRANSLATABLE_ARGUMENT_LIST_TYPE);
               } else if (var24.equals("score")) {
                  var1.beginObject();

                  while (var1.hasNext()) {
                     String var32 = var1.nextName();
                     if (var32.equals("name")) {
                        var9 = var1.nextString();
                     } else if (var32.equals("objective")) {
                        var10 = var1.nextString();
                     } else if (var32.equals("value")) {
                        var11 = var1.nextString();
                     } else {
                        var1.skipValue();
                     }
                  }

                  if (var9 == null || var10 == null) {
                     throw new JsonParseException("A score component requires a name and objective");
                  }

                  var1.endObject();
               } else if (var24.equals("selector")) {
                  var12 = var1.nextString();
               } else if (var24.equals("keybind")) {
                  var13 = var1.nextString();
               } else if (var24.equals("nbt")) {
                  var14 = var1.nextString();
               } else if (var24.equals("interpret")) {
                  var15 = var1.nextBoolean();
               } else if (var24.equals("block")) {
                  var16 = this.gson.fromJson(var1, SerializerFactory.BLOCK_NBT_POS_TYPE);
               } else if (var24.equals("entity")) {
                  var17 = var1.nextString();
               } else if (var24.equals("storage")) {
                  var18 = this.gson.fromJson(var1, SerializerFactory.KEY_TYPE);
               } else if (var24.equals("extra")) {
                  var4 = this.gson.fromJson(var1, COMPONENT_LIST_TYPE);
               } else if (var24.equals("separator")) {
                  var19 = this.read(var1);
               } else if (var24.equals("atlas")) {
                  var20 = this.gson.fromJson(var1, SerializerFactory.KEY_TYPE);
               } else if (var24.equals("sprite")) {
                  var21 = this.gson.fromJson(var1, SerializerFactory.KEY_TYPE);
               } else if (!var24.equals("player")) {
                  if (var24.equals("hat")) {
                     if (var22 == null) {
                        var22 = ObjectContents.playerHead();
                     }

                     var22.hat(var1.nextBoolean());
                  } else {
                     var3.add(var24, this.gson.fromJson(var1, JsonElement.class));
                  }
               } else {
                  if (var22 == null) {
                     var22 = ObjectContents.playerHead();
                  }

                  JsonToken var25 = var1.peek();
                  if (var25 == JsonToken.STRING) {
                     var23 = true;
                     var22.name(var1.nextString());
                  } else if (var25 != JsonToken.BEGIN_OBJECT) {
                     var1.skipValue();
                  } else {
                     var23 = true;
                     var1.beginObject();

                     while (var1.hasNext()) {
                        String var26 = var1.nextName();
                        if (var26.equals("name")) {
                           var22.name(var1.nextString());
                        } else if (var26.equals("id")) {
                           var22.id(this.gson.fromJson(var1, SerializerFactory.UUID_TYPE));
                        } else if (!var26.equals("properties")) {
                           if (var26.equals("texture")) {
                              var22.texture(this.gson.fromJson(var1, SerializerFactory.KEY_TYPE));
                           } else {
                              var1.skipValue();
                           }
                        } else {
                           JsonToken var27 = var1.peek();
                           if (var27 == JsonToken.BEGIN_ARRAY) {
                              var22.profileProperties(this.gson.fromJson(var1, PROPERTY_LIST_TYPE));
                           } else if (var27 != JsonToken.BEGIN_OBJECT) {
                              var1.skipValue();
                           } else {
                              var1.beginObject();

                              while (var1.hasNext()) {
                                 String var28 = var1.nextName();
                                 var1.beginArray();

                                 while (var1.hasNext()) {
                                    var22.profileProperty(PlayerHeadObjectContents.property(var28, var1.nextString()));
                                 }

                                 var1.endArray();
                              }

                              var1.endObject();
                           }
                        }
                     }

                     var1.endObject();
                  }
               }
            }

            ComponentBuilder var31;
            if (var5 != null) {
               var31 = Component.text().content(var5);
            } else if (var6 != null) {
               if (var8 != null) {
                  var31 = Component.translatable().key(var6).fallback(var7).arguments(var8);
               } else {
                  var31 = Component.translatable().key(var6).fallback(var7);
               }
            } else if (var9 != null && var10 != null) {
               if (var11 == null) {
                  var31 = Component.score().name(var9).objective(var10);
               } else {
                  var31 = Component.score().name(var9).objective(var10).value(var11);
               }
            } else if (var12 != null) {
               var31 = Component.selector().pattern(var12).separator(var19);
            } else if (var13 != null) {
               var31 = Component.keybind().keybind(var13);
            } else if (var14 != null) {
               if (var16 != null) {
                  var31 = ((BlockNBTComponent.Builder)nbt(Component.blockNBT(), var14, var15, var19)).pos(var16);
               } else if (var17 != null) {
                  var31 = ((EntityNBTComponent.Builder)nbt(Component.entityNBT(), var14, var15, var19)).selector(var17);
               } else {
                  if (var18 == null) {
                     throw notSureHowToDeserialize(var1.getPath());
                  }

                  var31 = ((StorageNBTComponent.Builder)nbt(Component.storageNBT(), var14, var15, var19)).storage(var18);
               }
            } else if (var21 != null) {
               var31 = Component.object().contents(ObjectContents.sprite(var20 != null ? var20 : SpriteObjectContents.DEFAULT_ATLAS, var21));
            } else {
               if (var22 == null || !var23) {
                  throw notSureHowToDeserialize(var1.getPath());
               }

               var31 = Component.object().contents(var22.build());
            }

            var31.style(this.gson.fromJson(var3, SerializerFactory.STYLE_TYPE)).append(var4);
            var1.endObject();
            return var31.build();
         }
      } else {
         return Component.text(GsonHacks.readString(var1));
      }
   }

   private static <C extends NBTComponent<C, B>, B extends NBTComponentBuilder<C, B>> B nbt(B var0, String var1, boolean var2, @Nullable Component var3) {
      return (B)var0.nbtPath(var1).interpret(var2).separator(var3);
   }

   public void write(JsonWriter var1, Component var2) {
      if (var2 instanceof TextComponent && var2.children().isEmpty() && !var2.hasStyling() && this.emitCompactTextComponent) {
         var1.value(((TextComponent)var2).content());
      } else {
         var1.beginObject();
         if (var2.hasStyling()) {
            JsonElement var3 = this.gson.toJsonTree(var2.style(), SerializerFactory.STYLE_TYPE);
            if (var3.isJsonObject()) {
               for (Entry var5 : var3.getAsJsonObject().entrySet()) {
                  var1.name((String)var5.getKey());
                  this.gson.toJson((JsonElement)var5.getValue(), var1);
               }
            }
         }

         if (!var2.children().isEmpty()) {
            var1.name("extra");
            this.gson.toJson(var2.children(), COMPONENT_LIST_TYPE, var1);
         }

         if (var2 instanceof TextComponent) {
            var1.name("text");
            var1.value(((TextComponent)var2).content());
         } else if (var2 instanceof TranslatableComponent) {
            TranslatableComponent var10 = (TranslatableComponent)var2;
            var1.name("translate");
            var1.value(var10.key());
            String var15 = var10.fallback();
            if (var15 != null) {
               var1.name("fallback");
               var1.value(var15);
            }

            if (!var10.arguments().isEmpty()) {
               var1.name("with");
               this.gson.toJson(var10.arguments(), TRANSLATABLE_ARGUMENT_LIST_TYPE, var1);
            }
         } else if (var2 instanceof ScoreComponent) {
            ScoreComponent var11 = (ScoreComponent)var2;
            var1.name("score");
            var1.beginObject();
            var1.name("name");
            var1.value(var11.name());
            var1.name("objective");
            var1.value(var11.objective());
            if (var11.value() != null) {
               var1.name("value");
               var1.value(var11.value());
            }

            var1.endObject();
         } else if (var2 instanceof SelectorComponent) {
            SelectorComponent var12 = (SelectorComponent)var2;
            var1.name("selector");
            var1.value(var12.pattern());
            this.serializeSeparator(var1, var12.separator());
         } else if (var2 instanceof KeybindComponent) {
            var1.name("keybind");
            var1.value(((KeybindComponent)var2).keybind());
         } else if (var2 instanceof NBTComponent) {
            NBTComponent var13 = (NBTComponent)var2;
            var1.name("nbt");
            var1.value(var13.nbtPath());
            var1.name("interpret");
            var1.value(var13.interpret());
            this.serializeSeparator(var1, var13.separator());
            if (var2 instanceof BlockNBTComponent) {
               var1.name("block");
               this.gson.toJson(((BlockNBTComponent)var2).pos(), SerializerFactory.BLOCK_NBT_POS_TYPE, var1);
            } else if (var2 instanceof EntityNBTComponent) {
               var1.name("entity");
               var1.value(((EntityNBTComponent)var2).selector());
            } else {
               if (!(var2 instanceof StorageNBTComponent)) {
                  throw notSureHowToSerialize(var2);
               }

               var1.name("storage");
               this.gson.toJson(((StorageNBTComponent)var2).storage(), SerializerFactory.KEY_TYPE, var1);
            }
         } else {
            if (!(var2 instanceof ObjectComponent)) {
               throw notSureHowToSerialize(var2);
            }

            ObjectComponent var14 = (ObjectComponent)var2;
            ObjectContents var16 = var14.contents();
            if (var16 instanceof SpriteObjectContents) {
               SpriteObjectContents var17 = (SpriteObjectContents)var16;
               if (!var17.atlas().equals(SpriteObjectContents.DEFAULT_ATLAS)) {
                  var1.name("atlas");
                  this.gson.toJson(var17.atlas(), SerializerFactory.KEY_TYPE, var1);
               }

               var1.name("sprite");
               this.gson.toJson(var17.sprite(), SerializerFactory.KEY_TYPE, var1);
            } else {
               if (!(var16 instanceof PlayerHeadObjectContents)) {
                  throw notSureHowToSerialize(var2);
               }

               PlayerHeadObjectContents var18 = (PlayerHeadObjectContents)var16;
               var1.name("hat");
               var1.value(var18.hat());
               String var6 = var18.name();
               UUID var7 = var18.id();
               List var8 = var18.profileProperties();
               Key var9 = var18.texture();
               var1.name("player");
               if (var6 != null && var7 == null && var8.isEmpty() && var9 == null) {
                  var1.value(var6);
               } else {
                  var1.beginObject();
                  if (var6 != null) {
                     var1.name("name");
                     var1.value(var6);
                  }

                  if (var7 != null) {
                     var1.name("id");
                     this.gson.toJson(var7, SerializerFactory.UUID_TYPE, var1);
                  }

                  if (!var8.isEmpty()) {
                     var1.name("properties");
                     this.gson.toJson(var8, PROPERTY_LIST_TYPE, var1);
                  }

                  if (var9 != null) {
                     var1.name("texture");
                     this.gson.toJson(var9, SerializerFactory.KEY_TYPE, var1);
                  }

                  var1.endObject();
               }
            }
         }

         var1.endObject();
      }
   }

   private void serializeSeparator(JsonWriter var1, @Nullable Component var2) {
      if (var2 != null) {
         var1.name("separator");
         this.write(var1, var2);
      }
   }

   static JsonParseException notSureHowToDeserialize(Object var0) {
      return new JsonParseException("Don't know how to turn " + var0 + " into a Component");
   }

   private static IllegalArgumentException notSureHowToSerialize(Component var0) {
      return new IllegalArgumentException("Don't know how to serialize " + var0 + " as a Component");
   }
}
