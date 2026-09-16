package net.optifine.entity.model;

import java.util.Iterator;
import java.util.List;

public class ModelAdapterSheepWool extends ModelAdapterQuadruped {
   public ModelAdapterSheepWool() {
      super(tv.class, "sheep_wool", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bbv();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      biv render = (biv)renderManager.getEntityRenderMap().get(tv.class);
      if (!(render instanceof bjv)) {
         Config.warn("Not a RenderSheep: " + render);
         return null;
      }

      if (render.getEntityClass() == null) {
         render = new bjv(renderManager, new bbw(), 0.7F);
      }

      bjv renderSheep = (bjv)render;
      List<blb<tv>> list = renderSheep.getLayerRenderers();
      Iterator it = list.iterator();

      while (it.hasNext()) {
         blb layerRenderer = (blb)it.next();
         if (layerRenderer instanceof blc) {
            it.remove();
         }
      }

      blc layer = new blc(renderSheep);
      layer.c = (bbv)modelBase;
      renderSheep.a(layer);
      return renderSheep;
   }
}
