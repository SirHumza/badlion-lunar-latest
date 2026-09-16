package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import java.lang.reflect.Type;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.ServerStatusResponse.Players;
import net.minecraft.network.ServerStatusResponse.Serializer_v1_7;
import net.minecraft.network.ServerStatusResponse.Version;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.JsonUtils;
import org.spongepowered.asm.mixin.Mixin;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(Serializer_v1_7.class)
public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CORCOCICIRIOHROHROIIOOHICCHCRR {
   @WrapMethod(method = "deserialize")
   private ServerStatusResponse lunar$deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3, Operation<ServerStatusResponse> var4) {
      JsonObject var5 = JsonUtils.getElementAsJsonObject$v1_7(var1, "status");
      ServerStatusResponse var6 = new ServerStatusResponse();
      if (var5.has("description")) {
         var6.setServerDescription$v1_7((IChatComponent)var3.deserialize(var5.get("description"), IChatComponent.class));
      }

      if (var5.has("players")) {
         var6.setPlayerCountData$v1_7((Players)var3.deserialize(var5.get("players"), Players.class));
      }

      if (var5.has("version")) {
         var6.setProtocolVersionInfo$v1_7((Version)var3.deserialize(var5.get("version"), Version.class));
      }

      if (var5.has("favicon")) {
         var6.setFavicon(JsonUtils.getJsonObjectStringFieldValue$v1_7(var5, "favicon"));
      }

      if (var5.has("lcServer")) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var6)
            .setLunarServer(var5.get("lcServer").getAsString());
      }

      return var6;
   }
}
