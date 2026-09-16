package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.lang.reflect.Type;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.ServerStatusResponse.Players;
import net.minecraft.network.ServerStatusResponse.Serializer_v1_8;
import net.minecraft.network.ServerStatusResponse.Version;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(Serializer_v1_8.class)
public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CORCOCICIRIOHROHROIIOOHICCHCRR {
   @WrapMethod(
      method = "deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/network/ServerStatusResponse;"
   )
   private ServerStatusResponse lunar$deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3, Operation<ServerStatusResponse> var4) {
      JsonObject var5;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var5 = JsonUtils.getJsonObject$v1_8(var1, "status");
      } else {
         var5 = JsonUtils.getElementAsJsonObject$v1_7(var1, "status");
      }

      ServerStatusResponse var6 = new ServerStatusResponse();
      if (var5.has("description")) {
         var6.setServerDescription$v1_8((ITextComponent)var3.deserialize(var5.get("description"), ITextComponent.class));
      }

      if (var5.has("players")) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var6.setPlayers$v1_12((Players)var3.deserialize(var5.get("players"), Players.class));
         } else {
            var6.setPlayerCountData$v1_7((Players)var3.deserialize(var5.get("players"), Players.class));
         }
      }

      if (var5.has("version")) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var6.setVersion$v1_12((Version)var3.deserialize(var5.get("version"), Version.class));
         } else {
            var6.setProtocolVersionInfo$v1_7((Version)var3.deserialize(var5.get("version"), Version.class));
         }
      }

      if (var5.has("favicon")) {
         var6.setFavicon(JsonUtils.getString$v1_8(var5, "favicon"));
      }

      if (var5.has("lcServer")) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var6)
            .setLunarServer(var5.get("lcServer").getAsString());
      }

      return var6;
   }
}
