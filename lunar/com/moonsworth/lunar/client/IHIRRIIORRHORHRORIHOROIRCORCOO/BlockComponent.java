package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Stmt;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import it.unimi.dsi.fastutil.Pair;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public interface CORCOCICIRIOHROHROIIOOHICCHCRR {
   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   double run();

   static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<Stmt> var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return var0.size() == 1
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Stmt)var0.get(0), var1, new OOROOCCIRCCRHOIOIORIHCHHOOCCOR())
         : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Stmt.Expression(new Expr.Block(var0)), var1, new OOROOCCIRCCRHOIOIORIHCHHOOCCOR());
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Stmt var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, new OOROOCCIRCCRHOIOIORIHCHHOOCCOR());
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<Stmt> var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      return var0.size() == 1
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Stmt)var0.get(0), var1, var2)
         : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Stmt.Expression(new Expr.Block(var0)), var1, var2);
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Stmt var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
      if (var0 instanceof Stmt.Expression var3 && var3.expr() instanceof Expr.Constant var7) {
         return new CRRRICCRROCOHHOHIICIHORCOORRRH(var7.value());
      } else {
         CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         var6.HHRRROHIIRRHIRCCHOCRHRRROROCII = true;
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0, new OCOHORHCROHICRRIHCIHHRRCIHICRI(), var1, var2, var6, var4
         );
         return var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      }
   }

   static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<Stmt> var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
      CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new Stmt.Expression(new Expr.Block(var0)),
         new OCOHORHCROHICRRIHCIHHRRCIHICRI(),
         var1,
         var2,
         var3,
         new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      );
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Stmt var0,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3,
      CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5
   ) {
      if (var0 instanceof Stmt.Expression var13) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI()
         );
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var16 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var13.expr(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
            var2x -> {
               if (var4.HHRRROHIIRRHIRCCHOCRHRRROROCII) {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var16, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
                  );
               } else {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, var2x);
               }
            }
         );
      } else if (var0 instanceof Stmt.Loop var12) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI()
         );
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var12.count(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         var17.OCCICOHOROHCCOOICCICIOHHIIIIRO = false;
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var12.expr(), var1, var2, var3, var17, var5
         );
         return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
            var4x -> {
               int var5x = var1.RRHOHCOCHCCIHICOCIRCHICCRHIHHO();
               Label var6x = new Label();
               Label var7x = new Label();
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var15, var4x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
               );
               var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                  var4xx -> {
                     var4xx.visitMethodInsn(
                        184, Type.getInternalName(Math.class), "ceil", Type.getMethodDescriptor(Type.DOUBLE_TYPE, new Type[]{Type.DOUBLE_TYPE}), false
                     );
                     var4xx.visitInsn(142);
                     int var5xx = var1.RRHOHCOCHCCIHICOCIRCHICCRHIHHO();
                     var4xx.visitVarInsn(54, var5xx);
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4xx, 0);
                     var4xx.visitVarInsn(54, var5x);
                     var4xx.visitLabel(var7x);
                     var4xx.visitVarInsn(21, var5x);
                     var4xx.visitVarInsn(21, var5xx);
                     var4xx.visitJumpInsn(162, var6x);
                  }
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18, var4x);
               var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var3xx -> {
                  var3xx.visitIincInsn(var5x, 1);
                  var3xx.visitJumpInsn(167, var7x);
                  var3xx.visitLabel(var6x);
               });
               if (var4.HHRRROHIIRRHIRCCHOCRHRRROROCII) {
                  var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0.0));
               }
            }
         );
      } else if (var0 instanceof Stmt.Return var11) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR()
         );
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var11.value(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
            var2x -> {
               if (!var4.HHRRROHIIRRHIRCCHOCRHRRROROCII) {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var2x);
               } else {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var14, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
                  );
               }
            }
         );
      } else if (!(var0 instanceof Stmt.If var6)) {
         throw new RuntimeException("Not jiting stmt: " + var0.getClass());
      } else {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO()
         );
         CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         var7.OCCICOHOROHCCOOICCICIOHHIIIIRO = false;
         ArrayList var8 = new ArrayList();
         var8.add(
            Pair.of(
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.condition(), var1, var2, var3, var7, var5),
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.body(), var1, var2, var3, var7, var5)
            )
         );

         for (Stmt.If var10 : var6.elifs()) {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR()
            );
            var8.add(
               Pair.of(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10.condition(), var1, var2, var3, var7, var5),
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10.body(), var1, var2, var3, var7, var5)
               )
            );
         }

         if (var6.elseBlock() != null) {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO()
            );
            var8.add(Pair.of(null, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.elseBlock(), var1, var2, var3, var7, var5)));
         }

         return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
            var2x -> {
               Label var3x = new Label();

               for (Pair var5x : var8) {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6x = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5x.first();
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7x = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5x.second();
                  Label var8x = new Label();
                  Label var9 = new Label();
                  if (var6x != null) {
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var6x, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN
                     );
                     var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2xx -> {
                        var2xx.visitJumpInsn(154, var9);
                        var2xx.visitJumpInsn(167, var8x);
                        var2xx.visitLabel(var9);
                     });
                  }

                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7x, var2x);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2xx -> {
                     var2xx.visitJumpInsn(167, var3x);
                     var2xx.visitLabel(var8x);
                  });
               }

               var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitLabel(var3x));
               if (var4.HHRRROHIIRRHIRCCHOCRHRRROROCII) {
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0.0));
               }
            }
         );
      }
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var0) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private static final Cache<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Constructor<?>> OOROOHHOIIOHRROCIIHHHCIIIHRHIR = CacheBuilder.newBuilder()
         .expireAfterAccess(10L, TimeUnit.MINUTES)
         .expireAfterWrite(10L, TimeUnit.MINUTES)
         .build();
      private final Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> HIHHCHHHIOHOHRIRHHCHOCHIHRHOOC;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var1) {
         this.HIHHCHHHIOHOHRIRHHCHOCHIHRHOOC = var1;
      }

      public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
         this.HIHHCHHHIOHOHRIRHHCHOCHIHRHOOC.accept(var1);
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         ClassWriter var2 = new ClassWriter(3);
         var2.visit(60, 0, "MolangJit", null, "java/lang/Object", new String[]{Type.getInternalName(CORCOCICIRIOHROHROIIOOHICCHCRR.class)});
         var2.visitSource("MolangJit", null);
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
         this.HIHHCHHHIOHOHRIRHHCHOCHIHRHOOC.accept(var3);
         int var4 = 0;

         for (Type var6 : var3.IOROCOIRHORCCOIORIHHIOOOIHOORO()) {
            String var7 = "_" + var4;
            var2.visitField(18, var7, var6.getDescriptor(), null, null).visitEnd();
            var4++;
         }

         MethodVisitor var12 = var2.visitMethod(
            1, "<init>", Type.getMethodDescriptor(Type.VOID_TYPE, var3.IOROCOIRHORCCOIORIHHIOOOIHOORO().toArray(new Type[0])), null, null
         );
         var12.visitVarInsn(25, 0);
         var12.visitMethodInsn(183, "java/lang/Object", "<init>", "()V", false);
         int var15 = 0;

         for (Type var8 : var3.IOROCOIRHORCCOIORIHHIOOOIHOORO()) {
            var12.visitVarInsn(25, 0);
            var12.visitVarInsn(25, var15 + 1);
            var12.visitFieldInsn(181, "MolangJit", "_" + var15, var8.getDescriptor());
            var15++;
         }

         var12.visitInsn(177);
         var12.visitMaxs(0, 0);
         var12.visitEnd();
         var12 = var2.visitMethod(1, "run", Type.getMethodDescriptor(Type.DOUBLE_TYPE, new Type[0]), null, null);

         for (Consumer var19 : var3.OCIHIRIHRHOOHOHRHRORRCOOIIHORH()) {
            var19.accept(var12);
         }

         var12.visitInsn(175);
         var12.visitMaxs(0, 0);
         var12.visitEnd();
         var2.visitEnd();
         byte[] var14 = var2.toByteArray();
         ArrayList var17 = new ArrayList();
         ArrayList var20 = new ArrayList();

         for (Object var9 : var3.OIRRCCOIRIOIHHRCOIHOCRIOIOIICO()) {
            var17.add(var9.getClass());
            var20.add(var9);
         }

         Constructor var22;
         try {
            var22 = (Constructor)OOROOHHOIIOHRROCIIHHHCIIIHRHIR.get(
               var1,
               () -> com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  "MolangJit", var14, var17.toArray(new Class[0])
               )
            );
         } catch (ExecutionException var11) {
            var22 = com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               "MolangJit", var14, var17.toArray(new Class[0])
            );
         }

         try {
            return (CORCOCICIRIOHROHROIIOOHICCHCRR)var22.newInstance(var20.toArray());
         } catch (InstantiationException | IllegalAccessException | InvocationTargetException var10) {
            throw new RuntimeException(var10);
         }
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public boolean OCCICOHOROHCCOOICCICIOHHIIIIRO = true;
      public boolean HHRRROHIIRRHIRCCHOCRHRRROROCII = false;
   }
}
