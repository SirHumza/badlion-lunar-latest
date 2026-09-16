package net.optifine.util;

import net.optifine.reflect.Reflector;

public class TileEntityUtils {
   public static String getTileEntityName(adq blockAccess, cj blockPos) {
      akw te = blockAccess.s(blockPos);
      return getTileEntityName(te);
   }

   public static String getTileEntityName(akw te) {
      if (!(te instanceof op)) {
         return null;
      }

      op iwn = (op)te;
      updateTileEntityName(te);
      return !iwn.l_() ? null : iwn.e_();
   }

   public static void updateTileEntityName(akw te) {
      cj pos = te.v();
      String name = getTileEntityRawName(te);
      if (name == null) {
         String nameServer = getServerTileEntityRawName(pos);
         nameServer = Config.normalize(nameServer);
         setTileEntityRawName(te, nameServer);
      }
   }

   public static String getServerTileEntityRawName(cj blockPos) {
      akw tes = IntegratedServerUtils.getTileEntity(blockPos);
      return tes == null ? null : getTileEntityRawName(tes);
   }

   public static String getTileEntityRawName(akw te) {
      if (te instanceof akv) {
         return (String)Reflector.getFieldValue(te, Reflector.TileEntityBeacon_customName);
      }

      if (te instanceof akx) {
         return (String)Reflector.getFieldValue(te, Reflector.TileEntityBrewingStand_customName);
      }

      if (te instanceof ale) {
         return (String)Reflector.getFieldValue(te, Reflector.TileEntityEnchantmentTable_customName);
      }

      if (te instanceof alh) {
         return (String)Reflector.getFieldValue(te, Reflector.TileEntityFurnace_customName);
      }

      if (te instanceof op) {
         op iwn = (op)te;
         if (iwn.l_()) {
            return iwn.e_();
         }
      }

      return null;
   }

   public static boolean setTileEntityRawName(akw te, String name) {
      if (te instanceof akv) {
         return Reflector.setFieldValue(te, Reflector.TileEntityBeacon_customName, name);
      } else if (te instanceof akx) {
         return Reflector.setFieldValue(te, Reflector.TileEntityBrewingStand_customName, name);
      } else if (te instanceof ale) {
         return Reflector.setFieldValue(te, Reflector.TileEntityEnchantmentTable_customName, name);
      } else if (te instanceof alh) {
         return Reflector.setFieldValue(te, Reflector.TileEntityFurnace_customName, name);
      } else if (te instanceof aky) {
         ((aky)te).a(name);
         return true;
      } else if (te instanceof alc) {
         ((alc)te).a(name);
         return true;
      } else if (te instanceof alj) {
         ((alj)te).a(name);
         return true;
      } else {
         return false;
      }
   }
}
