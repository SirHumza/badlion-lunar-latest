package net.optifine.util;

import amy.a;
import java.util.UUID;

public class IntegratedServerUtils {
   public static le getWorldServer() {
      ave mc = Config.getMinecraft();
      adm world = mc.f;
      if (world == null) {
         return null;
      }

      if (!mc.E()) {
         return null;
      }

      bpo is = mc.G();
      if (is == null) {
         return null;
      }

      anm wp = world.t;
      if (wp == null) {
         return null;
      }

      int wd = wp.q();

      try {
         return is.a(wd);
      } catch (NullPointerException e) {
         return null;
      }
   }

   public static pk getEntity(UUID uuid) {
      le ws = getWorldServer();
      return ws == null ? null : ws.a(uuid);
   }

   public static akw getTileEntity(cj pos) {
      le ws = getWorldServer();
      if (ws == null) {
         return null;
      }

      amy chunk = ws.N().d(pos.n() >> 4, pos.p() >> 4);
      return chunk == null ? null : chunk.a(pos, a.c);
   }
}
