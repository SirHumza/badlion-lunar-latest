package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterLeadKnot extends ModelAdapter {
   public ModelAdapterLeadKnot() {
      super(up.class, "lead_knot", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bbm();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbm)) {
         return null;
      }

      bbm modelLeashKnot = (bbm)model;
      return modelPart.equals("knot") ? modelLeashKnot.a : null;
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"knot"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjj render = new bjj(renderManager);
      if (!Reflector.RenderLeashKnot_leashKnotModel.exists()) {
         Config.warn("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      } else {
         Reflector.setFieldValue(render, Reflector.RenderLeashKnot_leashKnotModel, modelBase);
         render.c = shadowSize;
         return render;
      }
   }
}
