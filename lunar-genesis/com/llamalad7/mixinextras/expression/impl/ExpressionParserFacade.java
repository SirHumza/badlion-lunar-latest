package com.llamalad7.mixinextras.expression.impl;

import com.llamalad7.mixinextras.expression.impl.ast.expressions.ArrayAccessExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ArrayLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ArrayStoreExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.BinaryExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.BooleanLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.BoundMethodReferenceExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.CapturingExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.CastExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ClassConstantExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ComparisonExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ConstructorReferenceExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.DecimalLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.Expression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.FreeMethodReferenceExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.IdentifierAssignmentExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.IdentifierExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.InstanceofExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.InstantiationExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.IntLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.MemberAccessExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.MemberAssignmentExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.MethodCallExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.NewArrayExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.NullLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ReturnExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.StaticMethodCallExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.StringLiteralExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.SuperCallExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ThisExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.ThrowExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.UnaryExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.WildcardExpression;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.ArrayTypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.DefinedMemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.DefinedTypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.WildcardIdentifier;
import com.llamalad7.mixinextras.lib.antlr.runtime.ANTLRErrorListener;
import com.llamalad7.mixinextras.lib.antlr.runtime.CharStreams;
import com.llamalad7.mixinextras.lib.antlr.runtime.CommonTokenStream;
import com.llamalad7.mixinextras.lib.antlr.runtime.Parser;
import com.llamalad7.mixinextras.lib.antlr.runtime.ParserRuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.RecognitionException;
import com.llamalad7.mixinextras.lib.antlr.runtime.Recognizer;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFA;
import com.llamalad7.mixinextras.lib.grammar.expressions.ExpressionLexer;
import com.llamalad7.mixinextras.lib.grammar.expressions.ExpressionParser;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionParserFacade {
   private final String expression;
   private boolean hasExplicitCapture = false;

   public ExpressionParserFacade(String var1) {
      this.expression = var1;
   }

   public static Expression parse(String var0) {
      ExpressionLexer var1 = new ExpressionLexer(CharStreams.fromString(var0));
      setupErrorListeners(var1, var0);
      ExpressionParser var2 = new ExpressionParser(new CommonTokenStream(var1));
      setupErrorListeners(var2, var0);
      ExpressionParserFacade var3 = new ExpressionParserFacade(var0);
      Expression var4 = var3.parse(var2.root().statement());
      return var3.hasExplicitCapture ? var4 : new CapturingExpression(new ExpressionSource(var0, 0, var0.length() - 1), var4);
   }

   private Expression parse(ExpressionParser.StatementContext var1) {
      if (var1 instanceof ExpressionParser.MemberAssignmentStatementContext) {
         return this.parse((ExpressionParser.MemberAssignmentStatementContext)var1);
      } else if (var1 instanceof ExpressionParser.ArrayStoreStatementContext) {
         return this.parse((ExpressionParser.ArrayStoreStatementContext)var1);
      } else if (var1 instanceof ExpressionParser.IdentifierAssignmentStatementContext) {
         return this.parse((ExpressionParser.IdentifierAssignmentStatementContext)var1);
      } else if (var1 instanceof ExpressionParser.ReturnStatementContext) {
         return this.parse((ExpressionParser.ReturnStatementContext)var1);
      } else if (var1 instanceof ExpressionParser.ThrowStatementContext) {
         return this.parse((ExpressionParser.ThrowStatementContext)var1);
      } else if (var1 instanceof ExpressionParser.ExpressionStatementContext) {
         return this.parse((ExpressionParser.ExpressionStatementContext)var1);
      } else {
         throw this.unimplemented();
      }
   }

   private MemberAssignmentExpression parse(ExpressionParser.MemberAssignmentStatementContext var1) {
      return new MemberAssignmentExpression(this.getSource(var1), this.parse(var1.receiver), this.parseMemberId(var1.memberName), this.parse(var1.value));
   }

   private ArrayStoreExpression parse(ExpressionParser.ArrayStoreStatementContext var1) {
      return new ArrayStoreExpression(this.getSource(var1), this.parse(var1.arr), this.parse(var1.index), this.parse(var1.value));
   }

   private IdentifierAssignmentExpression parse(ExpressionParser.IdentifierAssignmentStatementContext var1) {
      return new IdentifierAssignmentExpression(this.getSource(var1), this.parseMemberId(var1.identifier), this.parse(var1.value));
   }

   private ReturnExpression parse(ExpressionParser.ReturnStatementContext var1) {
      return new ReturnExpression(this.getSource(var1), this.parse(var1.value));
   }

   private ThrowExpression parse(ExpressionParser.ThrowStatementContext var1) {
      return new ThrowExpression(this.getSource(var1), this.parse(var1.value));
   }

   private Expression parse(ExpressionParser.ExpressionStatementContext var1) {
      return this.parse(var1.expression());
   }

   private Expression parse(ExpressionParser.ExpressionContext var1) {
      if (var1 instanceof ExpressionParser.CapturingExpressionContext) {
         return this.parse((ExpressionParser.CapturingExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ParenthesizedExpressionContext) {
         return this.parse((ExpressionParser.ParenthesizedExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.SuperCallExpressionContext) {
         return this.parse((ExpressionParser.SuperCallExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.MethodCallExpressionContext) {
         return this.parse((ExpressionParser.MethodCallExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.StaticMethodCallExpressionContext) {
         return this.parse((ExpressionParser.StaticMethodCallExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.BoundMethodReferenceExpressionContext) {
         return this.parse((ExpressionParser.BoundMethodReferenceExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.FreeMethodReferenceExpressionContext) {
         return this.parse((ExpressionParser.FreeMethodReferenceExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ConstructorReferenceExpressionContext) {
         return this.parse((ExpressionParser.ConstructorReferenceExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ArrayAccessExpressionContext) {
         return this.parse((ExpressionParser.ArrayAccessExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ClassConstantExpressionContext) {
         return this.parse((ExpressionParser.ClassConstantExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.MemberAccessExpressionContext) {
         return this.parse((ExpressionParser.MemberAccessExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.NewArrayExpressionContext) {
         return this.parse((ExpressionParser.NewArrayExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ArrayLitExpressionContext) {
         return this.parse((ExpressionParser.ArrayLitExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.UnaryExpressionContext) {
         return this.parse((ExpressionParser.UnaryExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.CastExpressionContext) {
         return this.parse((ExpressionParser.CastExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.InstantiationExpressionContext) {
         return this.parse((ExpressionParser.InstantiationExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.MultiplicativeExpressionContext) {
         return this.parse((ExpressionParser.MultiplicativeExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.AdditiveExpressionContext) {
         return this.parse((ExpressionParser.AdditiveExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ShiftExpressionContext) {
         return this.parse((ExpressionParser.ShiftExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ComparisonExpressionContext) {
         return this.parse((ExpressionParser.ComparisonExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.InstanceofExpressionContext) {
         return this.parse((ExpressionParser.InstanceofExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.EqualityExpressionContext) {
         return this.parse((ExpressionParser.EqualityExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.BitwiseAndExpressionContext) {
         return this.parse((ExpressionParser.BitwiseAndExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.BitwiseXorExpressionContext) {
         return this.parse((ExpressionParser.BitwiseXorExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.BitwiseOrExpressionContext) {
         return this.parse((ExpressionParser.BitwiseOrExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.DecimalLitExpressionContext) {
         return this.parse((ExpressionParser.DecimalLitExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.IntLitExpressionContext) {
         return this.parse((ExpressionParser.IntLitExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.StringLitExpressionContext) {
         return this.parse((ExpressionParser.StringLitExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.BoolLitExpressionContext) {
         return this.parse((ExpressionParser.BoolLitExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.NullExpressionContext) {
         return this.parse((ExpressionParser.NullExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.WildcardExpressionContext) {
         return this.parse((ExpressionParser.WildcardExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.ThisExpressionContext) {
         return this.parse((ExpressionParser.ThisExpressionContext)var1);
      } else if (var1 instanceof ExpressionParser.IdentifierExpressionContext) {
         return this.parse((ExpressionParser.IdentifierExpressionContext)var1);
      } else {
         throw this.unimplemented();
      }
   }

   private CapturingExpression parse(ExpressionParser.CapturingExpressionContext var1) {
      this.hasExplicitCapture = true;
      return new CapturingExpression(this.getSource(var1), this.parse(var1.expr));
   }

   private Expression parse(ExpressionParser.ParenthesizedExpressionContext var1) {
      return this.parse(var1.expr);
   }

   private SuperCallExpression parse(ExpressionParser.SuperCallExpressionContext var1) {
      return new SuperCallExpression(this.getSource(var1), this.parseMemberId(var1.memberName), this.parse(var1.args));
   }

   private MethodCallExpression parse(ExpressionParser.MethodCallExpressionContext var1) {
      return new MethodCallExpression(this.getSource(var1), this.parse(var1.receiver), this.parseMemberId(var1.memberName), this.parse(var1.args));
   }

   private StaticMethodCallExpression parse(ExpressionParser.StaticMethodCallExpressionContext var1) {
      return new StaticMethodCallExpression(this.getSource(var1), this.parseMemberId(var1.memberName), this.parse(var1.args));
   }

   private BoundMethodReferenceExpression parse(ExpressionParser.BoundMethodReferenceExpressionContext var1) {
      return new BoundMethodReferenceExpression(this.getSource(var1), this.parse(var1.receiver), this.parseMemberId(var1.memberName));
   }

   private FreeMethodReferenceExpression parse(ExpressionParser.FreeMethodReferenceExpressionContext var1) {
      return new FreeMethodReferenceExpression(this.getSource(var1), this.parseMemberId(var1.memberName));
   }

   private ConstructorReferenceExpression parse(ExpressionParser.ConstructorReferenceExpressionContext var1) {
      return new ConstructorReferenceExpression(this.getSource(var1), this.parseTypeId(var1.type));
   }

   private ArrayAccessExpression parse(ExpressionParser.ArrayAccessExpressionContext var1) {
      return new ArrayAccessExpression(this.getSource(var1), this.parse(var1.arr), this.parse(var1.index));
   }

   private ClassConstantExpression parse(ExpressionParser.ClassConstantExpressionContext var1) {
      return new ClassConstantExpression(this.getSource(var1), this.parseTypeId(var1.type));
   }

   private MemberAccessExpression parse(ExpressionParser.MemberAccessExpressionContext var1) {
      return new MemberAccessExpression(this.getSource(var1), this.parse(var1.receiver), this.parseMemberId(var1.memberName));
   }

   private NewArrayExpression parse(ExpressionParser.NewArrayExpressionContext var1) {
      return new NewArrayExpression(this.getSource(var1), this.parseTypeId(var1.innerType), this.parse(var1.dims), var1.blankDims.size());
   }

   private ArrayLiteralExpression parse(ExpressionParser.ArrayLitExpressionContext var1) {
      return new ArrayLiteralExpression(this.getSource(var1), this.parseTypeId(var1.elementType), this.parse(var1.values));
   }

   private UnaryExpression parse(ExpressionParser.UnaryExpressionContext var1) {
      UnaryExpression.Operator var2;
      switch (var1.op.getType()) {
         case 19:
            var2 = UnaryExpression.Operator.MINUS;
            break;
         case 23:
            var2 = UnaryExpression.Operator.BITWISE_NOT;
            break;
         default:
            throw this.unimplemented();
      }

      return new UnaryExpression(this.getSource(var1), var2, this.parse(var1.expr));
   }

   private CastExpression parse(ExpressionParser.CastExpressionContext var1) {
      return new CastExpression(this.getSource(var1), this.parseTypeId(var1.type), this.parse(var1.expr));
   }

   private InstantiationExpression parse(ExpressionParser.InstantiationExpressionContext var1) {
      return new InstantiationExpression(this.getSource(var1), this.parseTypeId(var1.type), this.parse(var1.args));
   }

   private BinaryExpression parse(ExpressionParser.MultiplicativeExpressionContext var1) {
      BinaryExpression.Operator var2;
      switch (var1.op.getType()) {
         case 20:
            var2 = BinaryExpression.Operator.MULT;
            break;
         case 21:
            var2 = BinaryExpression.Operator.DIV;
            break;
         case 22:
            var2 = BinaryExpression.Operator.MOD;
            break;
         default:
            throw this.unimplemented();
      }

      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), var2, this.parse(var1.right));
   }

   private BinaryExpression parse(ExpressionParser.AdditiveExpressionContext var1) {
      BinaryExpression.Operator var2;
      switch (var1.op.getType()) {
         case 18:
            var2 = BinaryExpression.Operator.PLUS;
            break;
         case 19:
            var2 = BinaryExpression.Operator.MINUS;
            break;
         default:
            throw this.unimplemented();
      }

      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), var2, this.parse(var1.right));
   }

   private BinaryExpression parse(ExpressionParser.ShiftExpressionContext var1) {
      BinaryExpression.Operator var2;
      switch (var1.op.getType()) {
         case 33:
            var2 = BinaryExpression.Operator.SHL;
            break;
         case 34:
            var2 = BinaryExpression.Operator.SHR;
            break;
         case 35:
            var2 = BinaryExpression.Operator.USHR;
            break;
         default:
            throw this.unimplemented();
      }

      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), var2, this.parse(var1.right));
   }

   private ComparisonExpression parse(ExpressionParser.ComparisonExpressionContext var1) {
      ComparisonExpression.Operator var2;
      switch (var1.op.getType()) {
         case 36:
            var2 = ComparisonExpression.Operator.LT;
            break;
         case 37:
            var2 = ComparisonExpression.Operator.LE;
            break;
         case 38:
            var2 = ComparisonExpression.Operator.GT;
            break;
         case 39:
            var2 = ComparisonExpression.Operator.GE;
            break;
         default:
            throw this.unimplemented();
      }

      return new ComparisonExpression(this.getSource(var1), this.parse(var1.left), var2, this.parse(var1.right));
   }

   private InstanceofExpression parse(ExpressionParser.InstanceofExpressionContext var1) {
      return new InstanceofExpression(this.getSource(var1), this.parse(var1.expr), this.parseTypeId(var1.type));
   }

   private ComparisonExpression parse(ExpressionParser.EqualityExpressionContext var1) {
      ComparisonExpression.Operator var2;
      switch (var1.op.getType()) {
         case 40:
            var2 = ComparisonExpression.Operator.EQ;
            break;
         case 41:
            var2 = ComparisonExpression.Operator.NE;
            break;
         default:
            throw this.unimplemented();
      }

      return new ComparisonExpression(this.getSource(var1), this.parse(var1.left), var2, this.parse(var1.right));
   }

   private BinaryExpression parse(ExpressionParser.BitwiseAndExpressionContext var1) {
      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), BinaryExpression.Operator.BITWISE_AND, this.parse(var1.right));
   }

   private BinaryExpression parse(ExpressionParser.BitwiseXorExpressionContext var1) {
      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), BinaryExpression.Operator.BITWISE_XOR, this.parse(var1.right));
   }

   private BinaryExpression parse(ExpressionParser.BitwiseOrExpressionContext var1) {
      return new BinaryExpression(this.getSource(var1), this.parse(var1.left), BinaryExpression.Operator.BITWISE_OR, this.parse(var1.right));
   }

   private DecimalLiteralExpression parse(ExpressionParser.DecimalLitExpressionContext var1) {
      return new DecimalLiteralExpression(this.getSource(var1), Double.parseDouble(var1.getText()));
   }

   private IntLiteralExpression parse(ExpressionParser.IntLitExpressionContext var1) {
      return new IntLiteralExpression(this.getSource(var1), Long.parseLong(var1.getText()));
   }

   private StringLiteralExpression parse(ExpressionParser.StringLitExpressionContext var1) {
      String var2 = var1.getText();
      return new StringLiteralExpression(this.getSource(var1), var2.substring(1, var2.length() - 1));
   }

   private BooleanLiteralExpression parse(ExpressionParser.BoolLitExpressionContext var1) {
      return new BooleanLiteralExpression(this.getSource(var1), Boolean.parseBoolean(var1.getText()));
   }

   private NullLiteralExpression parse(ExpressionParser.NullExpressionContext var1) {
      return new NullLiteralExpression(this.getSource(var1));
   }

   private WildcardExpression parse(ExpressionParser.WildcardExpressionContext var1) {
      return new WildcardExpression(this.getSource(var1));
   }

   private ThisExpression parse(ExpressionParser.ThisExpressionContext var1) {
      return new ThisExpression(this.getSource(var1));
   }

   private IdentifierExpression parse(ExpressionParser.IdentifierExpressionContext var1) {
      return new IdentifierExpression(this.getSource(var1), var1.getText());
   }

   private MemberIdentifier parseMemberId(ExpressionParser.NameContext var1) {
      if (var1 instanceof ExpressionParser.IdentifierNameContext) {
         return new DefinedMemberIdentifier(var1.getText());
      } else if (var1 instanceof ExpressionParser.WildcardNameContext) {
         return new WildcardIdentifier();
      } else {
         throw this.unimplemented();
      }
   }

   private TypeIdentifier parseTypeId(ExpressionParser.NameContext var1) {
      if (var1 instanceof ExpressionParser.IdentifierNameContext) {
         return new DefinedTypeIdentifier(var1.getText());
      } else if (var1 instanceof ExpressionParser.WildcardNameContext) {
         return new WildcardIdentifier();
      } else {
         throw this.unimplemented();
      }
   }

   private TypeIdentifier parseTypeId(ExpressionParser.NameWithDimsContext var1) {
      int var2 = var1.dims.size();
      TypeIdentifier var3 = this.parseTypeId(var1.name());
      return var2 == 0 ? var3 : new ArrayTypeIdentifier(var2, var3);
   }

   private List<Expression> parse(ExpressionParser.ArgumentsContext var1) {
      return this.parse(var1.nonEmptyArguments());
   }

   private List<Expression> parse(ExpressionParser.NonEmptyArgumentsContext var1) {
      return var1 == null ? Collections.emptyList() : this.parse(var1.expression());
   }

   private List<Expression> parse(List<ExpressionParser.ExpressionContext> var1) {
      return var1.stream().map(this::parse).collect(Collectors.toList());
   }

   private ExpressionSource getSource(ParserRuleContext var1) {
      return new ExpressionSource(this.expression, var1.start.getStartIndex(), var1.stop.getStopIndex());
   }

   private RuntimeException unimplemented() {
      return new IllegalStateException("Unimplemented parser element!");
   }

   private static void setupErrorListeners(Recognizer<?, ?> var0, final String var1) {
      var0.removeErrorListeners();
      var0.addErrorListener(new ANTLRErrorListener() {
         @Override
         public void syntaxError(Recognizer<?, ?> var1x, Object var2, int var3, int var4, String var5, RecognitionException var6) {
            throw new RuntimeException(String.format("Failed to parse expression \"%s\": line %s:%s: %s", var1, var3, var4, var5));
         }

         @Override
         public void reportAmbiguity(Parser var1x, DFA var2, int var3, int var4, boolean var5, BitSet var6, ATNConfigSet var7) {
         }

         @Override
         public void reportAttemptingFullContext(Parser var1x, DFA var2, int var3, int var4, BitSet var5, ATNConfigSet var6) {
         }

         @Override
         public void reportContextSensitivity(Parser var1x, DFA var2, int var3, int var4, int var5, ATNConfigSet var6) {
         }
      });
   }
}
