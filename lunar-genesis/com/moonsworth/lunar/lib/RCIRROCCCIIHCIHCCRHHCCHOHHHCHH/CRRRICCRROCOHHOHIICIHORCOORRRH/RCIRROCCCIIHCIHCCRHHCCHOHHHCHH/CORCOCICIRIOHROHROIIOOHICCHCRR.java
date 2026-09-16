package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigInteger;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.MarkedYAMLException;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.AliasEvent;
import org.yaml.snakeyaml.events.CollectionStartEvent;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.events.MappingStartEvent;
import org.yaml.snakeyaml.events.NodeEvent;
import org.yaml.snakeyaml.events.ScalarEvent;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.parser.ParserImpl;
import org.yaml.snakeyaml.reader.StreamReader;
import org.yaml.snakeyaml.resolver.Resolver;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   protected RICRIRRCOHRCOCRRHHCRHRROOIOHHR CICRICCRIIROIIHORIOHOIHICHHHHO;
   protected int IRCCHRIIIHOOCOOICCRIHRCIIIORCR;
   protected boolean ICOIIHIRCCCHCRHCIHRIICCHHICCHH;
   protected final Reader IRICRHHRCHOHRHOCOHCRRORICIIIRR;
   protected final ParserImpl CHCIOOOIHORICICRCROCRCHHHCRRHO;
   protected final Resolver IHICCRRIOORRIRIICCIROOROROCRCC = new Resolver();
   protected Event RCOCHORRCOCHHHICIICCOCHHIHIICR;
   protected Event COHHCCROCOIORICCOCCCCRIORIHCOH;
   protected String COCIICRIICROROHIIOOIOHCHRCHIOH;
   protected String IIIRHROHOCOOOCIIHIICCOOCCHCIHR;
   protected String ICIHICIICIOOROIRRIRHRIIIHHOHOR;
   protected boolean IHCHOROCRCRIRHCCHRRRHORHRCCOOR;
   protected String HOHCRCCIIROOCHCROCCHOHHOOICOOH;

   @Deprecated
   public CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4,
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR var5,
      Reader var6
   ) {
      this(var1, var3, var4, null, var5, var6);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      int var2,
      int var3,
      LoaderOptions var4,
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR var5,
      Reader var6
   ) {
      super(var1, var2);
      this.CICRICCRIIROIIHORIOHOIHICHHHHO = var5;
      this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR = var3;
      this.IRICRHHRCHOHRHOCOHCRRORICIIIRR = var6;
      if (var4 == null) {
         var4 = new LoaderOptions();
      }

      this.CHCIOOOIHORICICRCROCRCHHHCRRHO = new ParserImpl(new StreamReader(var6), var4);
      this.ICOIIHIRCCCHCRHCIHRIICCHHICCHH = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EMPTY_STRING_AS_NULL.enabledIn(var3);
   }

   @Override
   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR IRRIHOORCIHROCIHRIIRRHOCORIIRO() {
      return this.CICRICCRIIROIIHORIOHOIHICHHHHO;
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1) {
      this.CICRICCRIIROIIHORIOHOIHICHHHHO = var1;
   }

   public boolean RRHIRIOROORIORRCRRROCRICROHICO() {
      return this.IHCHOROCRCRIRHCCHRRRHORHRCCOOR;
   }

   @Deprecated
   public String COCHRCHRROOCHRIOCCHHOCRRROHOOI() {
      return this.HOHCRCCIIROOCHCROCCHOHHOOICOOH;
   }

   @Override
   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH version() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICICCIRHHRRHIOIIHHRRRORIOOOR;
   }

   @Override
   public boolean HCRIRROICOIOHRRRIOOROHCHIOICII() {
      return false;
   }

   @Override
   public boolean IIIRCIHRHHIHIICHHIIORHHCORROIR() {
      return true;
   }

   @Override
   public boolean IOOCIIOORIIIIHCCOICHRHOHHIIHCC() {
      return true;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR<IHIRRIIORRHORHRORIHOROIRCORCOO> CHOHIIROCRHHOCCCOCORCOCOHCHOCH() {
      return OIIORHICCRHHCIHRRIORRHCORRIHRI;
   }

   @Override
   protected void HICCHORRCORCORCORIIOHCOCHIICIR() {
      if (this.HHCIIIIIROIOHHIROOICOHRCOHCORH.ORCORRIRHHCCIIOOOCOROCCRCIICCO()
         || this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AUTO_CLOSE_SOURCE)) {
         this.IRICRHHRCHOHRHOCOHCRRORICIIIRR.close();
      }
   }

   @Override
   public int IRORHRRHHIIOOHCIRIICCIORHROOOC() {
      return this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR;
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI HIOHICORCIOOHORHORIHHRIOCRCCRR(int var1, int var2) {
      this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR = this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR & ~var2 | var1 & var2;
      this.ICOIIHIRCCCHCRHCIHRIICCHHICCHH = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EMPTY_STRING_AS_NULL
         .enabledIn(this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR);
      return this;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR = this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR | var1.getMask();
      this.ICOIIHIRCCCHCRHCIHRIICCHHICCHH = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EMPTY_STRING_AS_NULL
         .enabledIn(this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR);
      return this;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI CORCOCICIRIOHROHROIIOOHICCHCRR(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR = this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR & ~var1.getMask();
      this.ICOIIHIRCCCHCRHCIHRIICCHHICCHH = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EMPTY_STRING_AS_NULL
         .enabledIn(this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR);
      return this;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI RRCRRCORICCHOHHIRCHIROOHIIOHCO(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2) {
      if (var2) {
         this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
      } else {
         this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
      }

      return this;
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return (this.IRCCHRIIIHOOCOOICCRIHRCIIIORCR & var1.getMask()) != 0;
   }

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RRIRORCHCICHIOHOHORHRIROHHRHOC() {
      return this.RCOCHORRCOCHHHICIICCOCHHIHIICR == null
         ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OIOICHIHOORIROOOHRRIHCHHCHHIRC
         : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RCOCHORRCOCHHHICIICCOCHHIHIICR.getStartMark());
   }

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI COIIOIOCCIOCOOIROHCCHHRHCICIHI() {
      return this.RCOCHORRCOCHHHICIICCOCHHIHIICR == null
         ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OIOICHIHOORIROOOHRRIHCHHCHHIRC
         : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RCOCHORRCOCHHHICIICCOCHHIHIICR.getEndMark());
   }

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Mark var1) {
      return var1 == null
         ? new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(this.HHCIIIIIROIOHHIROOICOHRCOHCORH.CIORIHICCCRIOHIOOORRCRHHIIIHCC(), -1L, -1, -1)
         : new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
            this.HHCIIIIIROIOHHIROOICOHRCOHCORH.CIORIHICCCRIOHIOOORRCRHHIIIHCC(), var1.getIndex(), var1.getLine() + 1, var1.getColumn() + 1
         );
   }

   @Override
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI OHHCRICRRCCHOHIRIRIHOIRHIROOIC() {
      this.IHCHOROCRCRIRHCCHRRRHORHRCCOOR = false;
      this.HIOHHORIRCCIIIORHHOORCHCRROICO = null;
      if (this.CRCOIIOHHROHHIHIHHOOIROIICICOI) {
         return null;
      }

      while (true) {
         Event var1;
         try {
            var1 = this.CHCIOOOIHORICICRCROCRCHHHCRRHO.getEvent();
         } catch (YAMLException var6) {
            if (var6 instanceof MarkedYAMLException) {
               throw com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this, (MarkedYAMLException)var6
               );
            }

            throw new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this, var6.getMessage(), var6
            );
         }

         if (var1 == null) {
            this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = null;
            this.COHHCCROCOIORICCOCCCCRIORIHCOH = null;
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = null;
         }

         this.RCOCHORRCOCHHHICIICCOCHHIHIICR = var1;
         if (this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.HROOCOCOCIRRHOCCOIHIIHOOOICOHO()) {
            if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH != OHHRIOHROOIHOROCIRHCHORIHRRRRI.FIELD_NAME) {
               if (!var1.is(Event.ID.Scalar)) {
                  this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = null;
                  this.COHHCCROCOIORICCOCCCCRIORIHCOH = null;
                  if (var1.is(Event.ID.MappingEnd)) {
                     if (!this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.HROOCOCOCIRRHOCCOIHIIHOOOICOHO()) {
                        this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(125, ']');
                     }

                     this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI = this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.HICOOHCROCCIICRHRHRROORIROHHCR();
                     return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_OBJECT;
                  }

                  this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR("Expected a field name (Scalar value in YAML), got this instead: " + var1);
               }

               ScalarEvent var2 = (ScalarEvent)var1;
               String var3 = var2.getAnchor();
               boolean var4 = this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT;
               if (var3 != null || !var4) {
                  this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = var2.getAnchor();
               }

               if (!var4) {
                  this.COHHCCROCOIORICCOCCCCRIORIHCOH = var1;
               }

               String var5 = var2.getValue();
               this.ICIHICIICIOOROIRRIRHRIIIHHOHOR = var5;
               this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.RIIOIOHHOCOROCRROOOCRRCIICORIC(var5);
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.FIELD_NAME;
            }
         } else if (this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IICRICHRCOOHHCCOCIOOIIHROCRRRH()) {
            this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IIRRHOORCIIOHROCIHCCICCCHIRIIO();
         }

         this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = null;
         this.COHHCCROCOIORICCOCCCCRIORIHCOH = var1;
         if (var1.is(Event.ID.Scalar)) {
            OHHRIOHROOIHOROCIRHCHORIHRRRRI var10 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ScalarEvent)var1);
            this.IIOIRORORIIIRHCHHIOCIICOCIHICH = var10;
            return var10;
         }

         if (var1.is(Event.ID.MappingStart)) {
            Mark var9 = var1.getStartMark();
            MappingStartEvent var11 = (MappingStartEvent)var1;
            this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = var11.getAnchor();
            this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI = this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.CHRHCRCCIICRORCOHCORHRROIHRCHO(var9.getLine(), var9.getColumn());
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT;
         }

         if (var1.is(Event.ID.MappingEnd)) {
            this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR("Not expecting END_OBJECT but a value");
         }

         if (var1.is(Event.ID.SequenceStart)) {
            Mark var8 = var1.getStartMark();
            this.HOHCRCCIIROOCHCROCCHOHHOOICOOH = ((NodeEvent)var1).getAnchor();
            this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI = this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.RHIHRRICIHORIHHIHHOIIOHHRCIIIH(var8.getLine(), var8.getColumn());
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY;
         }

         if (var1.is(Event.ID.SequenceEnd)) {
            if (!this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.IICRICHRCOOHHCCOCIOOIIHROCRRRH()) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(93, '}');
            }

            this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI = this.ORIRIHCOHHOCHICCHIOOOHCOIIRHCI.HICOOHCROCCIICRHRHRROORIROHHCR();
            return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY;
         }

         if (!var1.is(Event.ID.DocumentEnd) && !var1.is(Event.ID.DocumentStart)) {
            if (var1.is(Event.ID.Alias)) {
               AliasEvent var7 = (AliasEvent)var1;
               this.IHCHOROCRCRIRHCCHRRRHORHRCCOOR = true;
               this.COCIICRIICROROHIIOOIOHCHRCHIOH = var7.getAnchor();
               this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = null;
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
            }

            if (var1.is(Event.ID.StreamEnd)) {
               this.close();
               return this.IIOIRORORIIIRHCHHIOCIICOCIHICH = null;
            }
         }
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ScalarEvent var1) {
      String var2 = var1.getValue();
      this.COCIICRIICROROHIIOOIOHCHRCHIOH = var2;
      this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = null;
      if (!this.ICOIIHIRCCCHCRHCIHRIICCHHICCHH && var2.isEmpty()) {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
      }

      String var3 = var1.getTag();
      int var4 = var2.length();
      if (var3 != null && !var3.equals("!")) {
         if (var3.startsWith("tag:yaml.org,2002:")) {
            var3 = var3.substring("tag:yaml.org,2002:".length());
            if (var3.contains(",")) {
               String[] var9 = var3.split(",");
               var3 = var9.length == 0 ? "" : var9[0];
            }
         }

         if ("binary".equals(var3)) {
            var2 = var2.trim();

            try {
               this.HIOHHORIRCCIIIORHHOORCHCRROICO = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOROOCHOCIHICRHOORORIRCRCCOHOH
                  .decode(var2);
            } catch (IllegalArgumentException var7) {
               this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR(var7.getMessage());
            }

            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT;
         }

         if ("bool".equals(var3)) {
            Boolean var10 = this.RHOORRIIOCHIRRHOHOOHIROHCRICRO(var2, var4);
            if (var10 != null) {
               return var10 ? OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE : OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE;
            }
         } else if (var4 > 0) {
            if ("int".equals(var3)) {
               return this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var2, var4);
            }

            if ("float".equals(var3)) {
               this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 0;
               return this.HOIIRIICCOOHHRHOROOOHRHRRHHOCH(var2);
            }

            if ("null".equals(var3)) {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL;
            }
         }
      } else {
         Tag var5 = this.IHICCRRIOORRIRIICCIROOROROCRCC.resolve(NodeId.scalar, var2, var1.getImplicit().canOmitTagInPlainScalar());
         if (var5 == Tag.STR) {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
         }

         if (var5 == Tag.INT) {
            return this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var2, var4);
         }

         if (var5 == Tag.FLOAT) {
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 0;
            return this.HOIIRIICCOOHHRHOROOOHRHRRHHOCH(var2);
         }

         if (var5 != Tag.BOOL) {
            if (var5 == Tag.NULL) {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL;
            }

            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
         }

         Boolean var6 = this.RHOORRIIOCHIRRHOHOOHIROHCRICRO(var2, var4);
         if (var6 != null) {
            return var6 ? OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_TRUE : OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_FALSE;
         }
      }

      return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
   }

   protected Boolean RHOORRIIOCHIRRHOHOOHIROHCRICRO(String var1, int var2) {
      if (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PARSE_BOOLEAN_LIKE_WORDS_AS_STRINGS)) {
         if ("true".equalsIgnoreCase(var1)) {
            return Boolean.TRUE;
         }

         if ("false".equalsIgnoreCase(var1)) {
            return Boolean.FALSE;
         }
      } else {
         switch (var2) {
            case 1:
               switch (var1.charAt(0)) {
                  case 'N':
                  case 'n':
                     return Boolean.FALSE;
                  case 'Y':
                  case 'y':
                     return Boolean.TRUE;
                  default:
                     return null;
               }
            case 2:
               if ("no".equalsIgnoreCase(var1)) {
                  return Boolean.FALSE;
               }

               if ("on".equalsIgnoreCase(var1)) {
                  return Boolean.TRUE;
               }
               break;
            case 3:
               if ("yes".equalsIgnoreCase(var1)) {
                  return Boolean.TRUE;
               }

               if ("off".equalsIgnoreCase(var1)) {
                  return Boolean.FALSE;
               }
               break;
            case 4:
               if ("true".equalsIgnoreCase(var1)) {
                  return Boolean.TRUE;
               }
               break;
            case 5:
               if ("false".equalsIgnoreCase(var1)) {
                  return Boolean.FALSE;
               }
         }
      }

      return null;
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CCHHCIRHICHHHHRRIHIORCCORCCIHR(String var1, int var2) {
      char var4 = var1.charAt(0);
      int var3;
      if (var4 == '-') {
         this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = true;
         var3 = 1;
      } else if (var4 == '+') {
         this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = false;
         if (var2 == 1) {
            return null;
         }

         var3 = 1;
      } else {
         this.OCHHOIRRHOHICRICOIIROOOIIRIHIC = false;
         var3 = 0;
      }

      if (var2 == var3) {
         return null;
      }

      if (var1.charAt(var3) == '0') {
         if (++var3 == var2) {
            this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = 0;
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
         }

         var4 = var1.charAt(var3);
         switch (var4) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '_':
               return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var3, var2, this.OCHHOIRRHOHICRICOIIROOOIIRIHIC);
            case 'B':
            case 'b':
               return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var3 + 1, var2, this.OCHHOIRRHOHICRICOIIROOOIIRIHIC);
            case 'X':
            case 'x':
               return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var3 + 1, var2, this.OCHHOIRRHOHICRICOIIROOOIIRIHIC);
            default:
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
         }
      } else {
         boolean var5 = false;

         do {
            char var6 = var1.charAt(var3);
            if (var6 > '9' || var6 < '0') {
               if (var6 != '_') {
                  return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING;
               }

               var5 = true;
            }
         } while (++var3 != var2);

         this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 0;
         if (var5) {
            return this.HRRHORHIOHORCHHCRIOCRRCIRIRIOO(var1);
         }

         this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = this.COCIICRIICROROHIIOOIOHCHRCHIOH;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2, int var3, boolean var4) {
      String var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, var2, var3);
      int var6 = var5.length();
      if (var6 <= 31) {
         int var7 = this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var5, 2);
         if (var4) {
            var7 = -var7;
         }

         this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = var7;
         this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
      } else {
         return var6 <= 63
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var5, 2), var4, var6 == 32)
            : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var5, 2), var4);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, int var2, int var3, boolean var4) {
      String var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, var2, var3);
      int var6 = var5.length();
      if (var6 <= 10) {
         int var7 = this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var5, 8);
         if (var4) {
            var7 = -var7;
         }

         this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = var7;
         this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
      } else {
         return var6 <= 21
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var5, 8), var4, false)
            : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var5, 8), var4);
      }
   }

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, int var2, int var3, boolean var4) {
      String var5 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, var2, var3);
      int var6 = var5.length();
      if (var6 <= 7) {
         int var7 = this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var5, 16);
         if (var4) {
            var7 = -var7;
         }

         this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = var7;
         this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
      } else {
         return var6 <= 15
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var5, 16), var4, var6 == 8)
            : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var5, 16), var4);
      }
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, boolean var3, boolean var4) {
      long var5;
      if (var3) {
         var5 = -var1;
         if (var4 && var5 >= -2147483648L) {
            this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = (int)var5;
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
         }
      } else {
         if (var4 && var1 < 2147483647L) {
            this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = (int)var1;
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
         }

         var5 = var1;
      }

      this.RICIRHRCRHOICIIRCICRHIHHIRIHRO = var5;
      this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 2;
      return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BigInteger var1, boolean var2) {
      if (var2) {
         this.COOCCIHIHHOIOOICRCIHOCRCOICCOC = var1.negate();
      } else {
         this.COOCCIHIHHOIOOICRCIHOCRCOICCOC = var1;
      }

      this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 4;
      return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
   }

   private int COIHORRCHRRCHOCIRHHRRIOIHRIHCC(String var1, int var2) {
      try {
         return Integer.parseInt(var1, var2);
      } catch (NumberFormatException var4) {
         return this.<Integer>RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4);
      }
   }

   private long OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(String var1, int var2) {
      try {
         return Long.parseLong(var1, var2);
      } catch (NumberFormatException var4) {
         return this.<Long>RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4);
      }
   }

   private BigInteger IOIOHIORIROHRRCOOOHCROHORCOIIH(String var1, int var2) {
      this.CROCCHHIOHOCHHCOHHCCHRCIROIOIR().HHOHHHOICCCOOHHIOOHHORHOROIHOH(var1.length());

      try {
         return var2 == 10
            ? IIHRRHORCRCROCHHOHORCHCROCIHRO.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
               var1, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_BIG_NUMBER_PARSER)
            )
            : IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, var2, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_BIG_NUMBER_PARSER)
            );
      } catch (NumberFormatException var4) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4);
      }
   }

   private <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, Exception var3) {
      this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR(String.format("Invalid base-%d number ('%s'), problem: %s", var2, var1, var3.getMessage()));
      return null;
   }

   @Override
   public boolean RROICOIOIIIHRHRCIIOOCIRICOIHHO() {
      return false;
   }

   @Override
   public String getText() {
      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING) {
         return this.COCIICRIICROROHIIOOIOHCHRCHIOH;
      } else if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.FIELD_NAME) {
         return this.ICIHICIICIOOROIRRIRHRIIIHHOHOR;
      } else if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH != null) {
         return this.IIOIRORORIIIRHCHHIOCIICOCIHICH.isScalarValue() ? this.COCIICRIICROROHIIOOIOHCHRCHIOH : this.IIOIRORORIIIRHCHHIOCIICOCIHICH.asString();
      } else {
         return null;
      }
   }

   @Override
   public String CIOOORCHHCOOOOIIOOCIOICCRRORCH() {
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.FIELD_NAME
         ? this.ICIHICIICIOOROIRRIRHRIIIHHOHOR
         : super.CIOOORCHHCOOOOIIOOCIOICCRRORCH();
   }

   @Override
   public char[] IOOHRCCROHHOICCCCOOOICRIIHOROO() {
      String var1 = this.getText();
      return var1 == null ? null : var1.toCharArray();
   }

   @Override
   public int IIOOCRIHICIIHIHICHCCHIICIORRIH() {
      String var1 = this.getText();
      return var1 == null ? 0 : var1.length();
   }

   @Override
   public int RCIOOOIHROIRCROOIICOHHCORROHHR() {
      return 0;
   }

   @Override
   public int CRRRICCRROCOHHOHIICIHORCOORRRH(Writer var1) {
      String var2 = this.getText();
      if (var2 == null) {
         return 0;
      }

      var1.write(var2);
      return var2.length();
   }

   @Override
   public Object RRIHRHCOCCRROCCHIRHHHIIICHCRRR() {
      return this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT ? this.HIOHHORIRCCIIIORHHOORCHCRROICO : null;
   }

   @Override
   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, OutputStream var2
   ) {
      byte[] var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      var2.write(var3);
      return var3.length;
   }

   @Override
   public Object CHIHHOCHHOCCIHCRIOIROOCOHOIROH() {
      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT) {
         return this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR.length() <= 18 ? this.CCHRCRRHRROCOOIRHHOCIIICIORRHH() : this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR;
      }

      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH != OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT) {
         this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR("Current token (" + this.IIOIRORORIIIRHCHHIOCIICOCIHICH + ") not numeric, can not use numeric value accessors");
      }

      if ((this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR & 16) != 0) {
         return this.IICIIIRCORICRHIOIHOOCRHOIRCIRO();
      } else if ((this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR & 8) != 0) {
         return this.CHIOROOCROICOOIRHHIIOIHCORCHHI();
      } else {
         return (this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR & 32) != 0 ? this.RROCORROOOIIICOICIOCIIIIIOICOR() : this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR;
      }
   }

   @Override
   protected void COIORRRORHCHCOHCHCIHHIROOHRIOC(int var1) {
      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT) {
         int var2 = this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR.length();
         if (this.OCHHOIRRHOHICRICOIIROOOIIRIHIC) {
            var2--;
         }

         if (var2 <= 9) {
            this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = Integer.parseInt(this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR);
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
            return;
         }

         if (var2 <= 18) {
            long var8 = Long.parseLong(this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR);
            if (var2 == 10) {
               if (this.OCHHOIRRHOHICRICOIIROOOIIRIHIC) {
                  if (var8 >= -2147483648L) {
                     this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = (int)var8;
                     this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
                     return;
                  }
               } else if (var8 <= 2147483647L) {
                  this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = (int)var8;
                  this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
                  return;
               }
            }

            this.RICIRHRCRHOICIIRCICRHIHHIRIHRO = var8;
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 2;
            return;
         }

         String var3 = this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR;

         try {
            this.CROCCHHIOHOCHHCOHHCCHRCIROIOIR().HHOHHHOICCCOOHHIOOHHORHOROIHOH(var3.length());
            BigInteger var4 = IIHRRHORCRCROCHHOHORCHCROCIHRO.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
               var3, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_BIG_NUMBER_PARSER)
            );
            if (var2 == 19 && var4.bitLength() <= 63) {
               this.RICIRHRCRHOICIIRCICRHIHHIRIHRO = var4.longValue();
               this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 2;
               return;
            }

            this.COOCCIHIHHOIOOICRCIHOCRCOICCOC = var4;
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 4;
            return;
         } catch (NumberFormatException var6) {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Malformed numeric value '" + this.COCIICRIICROROHIIOOIOHCHRCHIOH + "'", var6);
         }
      }

      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT) {
         String var7 = this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR;

         try {
            if (var1 == 16) {
               this.CROCCHHIOHOCHHCOHHCCHRCIROIOIR().ICRRHRIICIRRCIHIHRHCHIIOHRROOR(var7.length());
               this.CCOOIIOCRCCOOIHOHOIOOIHCCHIRCI = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCCCROCHCICCROHCOCCRRROCIIHCCH(
                  var7, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_BIG_NUMBER_PARSER)
               );
               this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 16;
            } else {
               this.CROCCHHIOHOCHHCOHHCCHRCIROIOIR().ICRRHRIICIRRCIHIHRHCHIIOHRROOR(var7.length());
               this.HHORRHIOCHOHCROHIOHOHIOCCCCHCI = IIHRRHORCRCROCHHOHORCHCROCIHRO.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(
                  var7, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_DOUBLE_PARSER)
               );
               this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 8;
            }
         } catch (NumberFormatException var5) {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Malformed numeric value '" + this.COCIICRIICROROHIIOOIOHCHRCHIOH + "'", var5);
         }
      } else {
         this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR("Current token (" + this.IIOIRORORIIIRHCHHIOCIICOCIHICH + ") not numeric, can not use numeric value accessors");
      }
   }

   @Override
   protected int OORCIRIIHHIIOOOHOCORIOICCIHHOO() {
      if (this.IIOIRORORIIIRHCHHIOCIICOCIHICH == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT) {
         int var1 = this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR.length();
         if (this.OCHHOIRRHOHICRICOIIROOOIIRIHIC) {
            var1--;
         }

         if (var1 <= 9) {
            this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR = 1;
            return this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO = Integer.parseInt(this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR);
         }
      }

      this.COIORRRORHCHCOHCHCIHHIROOHRIOC(1);
      if ((this.ICHRRIRCOHIIIRHHCRCHHCHIIOOICR & 1) == 0) {
         this.ROOIOCORCHHCCHIOCIHOCRHIRCCCIO();
      }

      return this.HCRHOIRIROHHCCHRCCROCCCRCCCOIO;
   }

   public String OCHHOCCHHOICICOCHCRIHCCIRRIIOO() {
      return this.HOHCRCCIIROOCHCROCCHOHHOOICOOH;
   }

   public String RRIRROHHOHCCRCHROHRHROOHCCHCHC() {
      String var1;
      if (this.COHHCCROCOIORICCOCCCCRIORIHCOH instanceof CollectionStartEvent) {
         var1 = ((CollectionStartEvent)this.COHHCCROCOIORICCOCCCCRIORIHCOH).getTag();
      } else {
         if (!(this.COHHCCROCOIORICCOCCCCRIORIHCOH instanceof ScalarEvent)) {
            return null;
         }

         var1 = ((ScalarEvent)this.COHHCCROCOIORICCOCCCCRIORIHCOH).getTag();
      }

      if (var1 == null) {
         return null;
      }

      while (var1.startsWith("!")) {
         var1 = var1.substring(1);
      }

      return var1;
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI HRRHORHIOHORCHHCRIOCRRCIRIRIOO(String var1) {
      int var2 = var1.length();
      StringBuilder var3 = new StringBuilder(var2);

      for (int var4 = var1.charAt(0) == '+' ? 1 : 0; var4 < var2; var4++) {
         char var5 = var1.charAt(var4);
         if (var5 != '_') {
            var3.append(var5);
         }
      }

      this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = var3.toString();
      return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT;
   }

   private String RHOCHHIRRCHHHOHOIRROIROHHHIHIO(String var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder(var3);

      while (var2 < var3) {
         char var5 = var1.charAt(var2);
         if (var5 != '_') {
            var4.append(var5);
         }

         var2++;
      }

      return var4.length() == var3 ? var1 : var4.toString();
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI HOIIRIICCOOHHRHOROOOHRHRRHHOCH(String var1) {
      int var2 = var1.length();
      int var3 = var1.indexOf(95);
      if (var3 >= 0 && var2 != 0) {
         StringBuilder var4 = new StringBuilder(var2);

         for (int var5 = var1.charAt(0) == '+' ? 1 : 0; var5 < var2; var5++) {
            char var6 = var1.charAt(var5);
            if (var6 != '_') {
               var4.append(var6);
            }
         }

         this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = var4.toString();
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT;
      } else {
         this.IIIRHROHOCOOOCIIHIICCOOCCHCIHR = var1;
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_FLOAT;
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      EMPTY_STRING_AS_NULL(true),
      PARSE_BOOLEAN_LIKE_WORDS_AS_STRINGS(false);

      final boolean _defaultState;
      final int _mask;

      public static int collectDefaults() {
         int var0 = 0;

         for (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
            if (var4.enabledByDefault()) {
               var0 |= var4.getMask();
            }
         }

         return var0;
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var3) {
         this._defaultState = var3;
         this._mask = 1 << this.ordinal();
      }

      @Override
      public boolean enabledByDefault() {
         return this._defaultState;
      }

      @Override
      public boolean enabledIn(int var1) {
         return (var1 & this._mask) != 0;
      }

      @Override
      public int getMask() {
         return this._mask;
      }
   }
}
