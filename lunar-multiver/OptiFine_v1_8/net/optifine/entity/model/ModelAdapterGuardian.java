package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterGuardian extends ModelAdapter {
   public ModelAdapterGuardian() {
      super(vt.class, "guardian", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bbg();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbg)) {
         return null;
      }

      bbg modelGuardian = (bbg)model;
      if (modelPart.equals("body")) {
         return (bct)Reflector.getFieldValue(modelGuardian, Reflector.ModelGuardian_body);
      }

      if (modelPart.equals("eye")) {
         return (bct)Reflector.getFieldValue(modelGuardian, Reflector.ModelGuardian_eye);
      }

      String PREFIX_SPINE = "spine";
      if (modelPart.startsWith(PREFIX_SPINE)) {
         bct[] spines = (bct[])Reflector.getFieldValue(modelGuardian, Reflector.ModelGuardian_spines);
         if (spines == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_SPINE.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < spines.length ? spines[index] : null;
      } else {
         String PREFIX_TAIL = "tail";
         if (modelPart.startsWith(PREFIX_TAIL)) {
            bct[] tails = (bct[])Reflector.getFieldValue(modelGuardian, Reflector.ModelGuardian_tail);
            if (tails == null) {
               return null;
            }

            String numStr = modelPart.substring(PREFIX_TAIL.length());
            int index = Config.parseInt(numStr, -1);
            index--;
            return index >= 0 && index < tails.length ? tails[index] : null;
         } else {
            return null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{
         "body",
         "eye",
         "spine1",
         "spine2",
         "spine3",
         "spine4",
         "spine5",
         "spine6",
         "spine7",
         "spine8",
         "spine9",
         "spine10",
         "spine11",
         "spine12",
         "tail1",
         "tail2",
         "tail3"
      };
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjc render = new bjc(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
