package net.optifine.entity.model;

public class ModelAdapterSkeleton extends ModelAdapterBiped {
   public ModelAdapterSkeleton() {
      super(wa.class, "skeleton", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bca();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjx render = new bjx(renderManager);
      biv.setModelBipedMain(render, (bbj)modelBase);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
