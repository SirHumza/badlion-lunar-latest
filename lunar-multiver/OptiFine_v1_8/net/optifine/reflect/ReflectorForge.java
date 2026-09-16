package net.optifine.reflect;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReflectorForge {
   public static Object EVENT_RESULT_ALLOW = Reflector.getFieldValue(Reflector.Event_Result_ALLOW);
   public static Object EVENT_RESULT_DENY = Reflector.getFieldValue(Reflector.Event_Result_DENY);
   public static Object EVENT_RESULT_DEFAULT = Reflector.getFieldValue(Reflector.Event_Result_DEFAULT);

   public static void FMLClientHandler_trackBrokenTexture(jy loc, String message) {
      if (!Reflector.FMLClientHandler_trackBrokenTexture.exists()) {
         Object instance = Reflector.call(Reflector.FMLClientHandler_instance);
         Reflector.call(instance, Reflector.FMLClientHandler_trackBrokenTexture, loc, message);
      }
   }

   public static void FMLClientHandler_trackMissingTexture(jy loc) {
      if (!Reflector.FMLClientHandler_trackMissingTexture.exists()) {
         Object instance = Reflector.call(Reflector.FMLClientHandler_instance);
         Reflector.call(instance, Reflector.FMLClientHandler_trackMissingTexture, loc);
      }
   }

   public static void putLaunchBlackboard(String key, Object value) {
      Map blackboard = (Map)Reflector.getFieldValue(Reflector.Launch_blackboard);
      if (blackboard != null) {
         blackboard.put(key, value);
      }
   }

   public static boolean renderFirstPersonHand(bfr renderGlobal, float partialTicks, int pass) {
      return !Reflector.ForgeHooksClient_renderFirstPersonHand.exists()
         ? false
         : Reflector.callBoolean(Reflector.ForgeHooksClient_renderFirstPersonHand, renderGlobal, partialTicks, pass);
   }

   public static InputStream getOptiFineResourceStream(String path) {
      if (!Reflector.OptiFineClassTransformer_instance.exists()) {
         return null;
      }

      Object instance = Reflector.getFieldValue(Reflector.OptiFineClassTransformer_instance);
      if (instance == null) {
         return null;
      }

      if (path.startsWith("/")) {
         path = path.substring(1);
      }

      byte[] bytes = (byte[])Reflector.call(instance, Reflector.OptiFineClassTransformer_getOptiFineResource, path);
      return bytes == null ? null : new ByteArrayInputStream(bytes);
   }

   public static boolean blockHasTileEntity(alz state) {
      afh block = state.c();
      return !Reflector.ForgeBlock_hasTileEntity.exists() ? block.z() : Reflector.callBoolean(block, Reflector.ForgeBlock_hasTileEntity, state);
   }

   public static boolean isItemDamaged(zx stack) {
      return !Reflector.ForgeItem_showDurabilityBar.exists() ? stack.g() : Reflector.callBoolean(stack.b(), Reflector.ForgeItem_showDurabilityBar, stack);
   }

   public static boolean armorHasOverlay(yj itemArmor, zx itemStack) {
      int i = itemArmor.b(itemStack);
      return i != -1;
   }

   public static atg getMapData(aab itemMap, zx stack, adm world) {
      return Reflector.ForgeHooksClient.exists() ? ((aab)stack.b()).a(stack, world) : itemMap.a(stack, world);
   }

   public static String[] getForgeModIds() {
      if (!Reflector.Loader.exists()) {
         return new String[0];
      }

      Object loader = Reflector.call(Reflector.Loader_instance);
      List listActiveMods = (List)Reflector.call(loader, Reflector.Loader_getActiveModList);
      if (listActiveMods == null) {
         return new String[0];
      }

      List<String> listModIds = new ArrayList<>();

      for (Object modContainer : listActiveMods) {
         if (Reflector.ModContainer.isInstance(modContainer)) {
            String modId = Reflector.callString(modContainer, Reflector.ModContainer_getModId);
            if (modId != null) {
               listModIds.add(modId);
            }
         }
      }

      return listModIds.toArray(new String[listModIds.size()]);
   }

   public static boolean canEntitySpawn(ps entityliving, adm world, float x, float y, float z) {
      Object canSpawn = Reflector.call(Reflector.ForgeEventFactory_canEntitySpawn, entityliving, world, x, y, z);
      return canSpawn == EVENT_RESULT_ALLOW || canSpawn == EVENT_RESULT_DEFAULT && entityliving.bR() && entityliving.bS();
   }

   public static boolean doSpecialSpawn(ps entityliving, adm world, float x, int y, float z) {
      return Reflector.ForgeEventFactory_doSpecialSpawn.exists()
         ? Reflector.callBoolean(Reflector.ForgeEventFactory_doSpecialSpawn, entityliving, world, x, y, z)
         : false;
   }
}
