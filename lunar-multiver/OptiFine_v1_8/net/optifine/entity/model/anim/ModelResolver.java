package net.optifine.entity.model.anim;

import net.optifine.entity.model.CustomModelRenderer;
import net.optifine.entity.model.ModelAdapter;
import net.optifine.expr.IExpression;

public class ModelResolver implements IModelResolver {
   private ModelAdapter modelAdapter;
   private bbo model;
   private CustomModelRenderer[] customModelRenderers;
   private bct thisModelRenderer;
   private bct partModelRenderer;
   private IRenderResolver renderResolver;

   public ModelResolver(ModelAdapter modelAdapter, bbo model, CustomModelRenderer[] customModelRenderers) {
      this.modelAdapter = modelAdapter;
      this.model = model;
      this.customModelRenderers = customModelRenderers;
      Class entityClass = modelAdapter.getEntityClass();
      if (akw.class.isAssignableFrom(entityClass)) {
         this.renderResolver = new RenderResolverTileEntity();
      } else {
         this.renderResolver = new RenderResolverEntity();
      }
   }

   @Override
   public IExpression getExpression(String name) {
      IExpression mv = this.getModelVariable(name);
      if (mv != null) {
         return mv;
      }

      IExpression param = this.renderResolver.getParameter(name);
      return param != null ? param : null;
   }

   @Override
   public bct getModelRenderer(String name) {
      if (name == null) {
         return null;
      }

      if (name.indexOf(":") >= 0) {
         String[] parts = Config.tokenize(name, ":");
         bct mr = this.getModelRenderer(parts[0]);

         for (int i = 1; i < parts.length; i++) {
            String part = parts[i];
            bct mrSub = mr.getChildDeep(part);
            if (mrSub == null) {
               return null;
            }

            mr = mrSub;
         }

         return mr;
      } else {
         if (this.thisModelRenderer != null && name.equals("this")) {
            return this.thisModelRenderer;
         }

         if (this.partModelRenderer != null && name.equals("part")) {
            return this.partModelRenderer;
         }

         bct mrPart = this.modelAdapter.getModelRenderer(this.model, name);
         if (mrPart != null) {
            return mrPart;
         }

         for (int i = 0; i < this.customModelRenderers.length; i++) {
            CustomModelRenderer cmr = this.customModelRenderers[i];
            bct mr = cmr.getModelRenderer();
            if (name.equals(mr.getId())) {
               return mr;
            }

            bct mrChild = mr.getChildDeep(name);
            if (mrChild != null) {
               return mrChild;
            }
         }

         return null;
      }
   }

   @Override
   public ModelVariableFloat getModelVariable(String name) {
      String[] parts = Config.tokenize(name, ".");
      if (parts.length != 2) {
         return null;
      }

      String modelName = parts[0];
      String varName = parts[1];
      bct mr = this.getModelRenderer(modelName);
      if (mr == null) {
         return null;
      }

      ModelVariableType varType = ModelVariableType.parse(varName);
      return varType == null ? null : new ModelVariableFloat(name, mr, varType);
   }

   public void setPartModelRenderer(bct partModelRenderer) {
      this.partModelRenderer = partModelRenderer;
   }

   public void setThisModelRenderer(bct thisModelRenderer) {
      this.thisModelRenderer = thisModelRenderer;
   }
}
