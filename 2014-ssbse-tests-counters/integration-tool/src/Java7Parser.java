// Generated from C:\Users\Linn\workspace\parserOfJava\src\Java7.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java7Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__88=1, T__87=2, T__86=3, T__85=4, T__84=5, T__83=6, T__82=7, T__81=8, 
		T__80=9, T__79=10, T__78=11, T__77=12, T__76=13, T__75=14, T__74=15, T__73=16, 
		T__72=17, T__71=18, T__70=19, T__69=20, T__68=21, T__67=22, T__66=23, 
		T__65=24, T__64=25, T__63=26, T__62=27, T__61=28, T__60=29, T__59=30, 
		T__58=31, T__57=32, T__56=33, T__55=34, T__54=35, T__53=36, T__52=37, 
		T__51=38, T__50=39, T__49=40, T__48=41, T__47=42, T__46=43, T__45=44, 
		T__44=45, T__43=46, T__42=47, T__41=48, T__40=49, T__39=50, T__38=51, 
		T__37=52, T__36=53, T__35=54, T__34=55, T__33=56, T__32=57, T__31=58, 
		T__30=59, T__29=60, T__28=61, T__27=62, T__26=63, T__25=64, T__24=65, 
		T__23=66, T__22=67, T__21=68, T__20=69, T__19=70, T__18=71, T__17=72, 
		T__16=73, T__15=74, T__14=75, T__13=76, T__12=77, T__11=78, T__10=79, 
		T__9=80, T__8=81, T__7=82, T__6=83, T__5=84, T__4=85, T__3=86, T__2=87, 
		T__1=88, T__0=89, HexLiteral=90, DecimalLiteral=91, OctalLiteral=92, BinaryLiteral=93, 
		FloatingPointLiteral=94, CharacterLiteral=95, StringLiteral=96, ENUM=97, 
		ASSERT=98, Identifier=99, WS=100, COMMENT=101, LINE_COMMENT=102;
	public static final String[] tokenNames = {
		"<INVALID>", "'interface'", "'&'", "'*'", "'['", "'<'", "'--'", "'false'", 
		"'continue'", "'!='", "'double'", "'abstract'", "'boolean'", "'}'", "'float'", 
		"'char'", "'strictfp'", "'case'", "'super'", "'do'", "'%'", "'*='", "')'", 
		"'throw'", "'@'", "'='", "'null'", "'throws'", "'|='", "'new'", "'class'", 
		"'finally'", "'|'", "'transient'", "'!'", "'long'", "'short'", "']'", 
		"'-='", "'public'", "'default'", "'synchronized'", "','", "'while'", "'-'", 
		"'('", "':'", "'if'", "'&='", "'int'", "'private'", "'?'", "'try'", "'void'", 
		"'package'", "'...'", "'{'", "'break'", "'native'", "'+='", "'extends'", 
		"'^='", "'final'", "'else'", "'catch'", "'true'", "'static'", "'++'", 
		"'import'", "'byte'", "'^'", "'.'", "'+'", "'protected'", "'for'", "'return'", 
		"'volatile'", "';'", "'&&'", "'this'", "'||'", "'>'", "'implements'", 
		"'%='", "'switch'", "'/='", "'/'", "'=='", "'~'", "'instanceof'", "HexLiteral", 
		"DecimalLiteral", "OctalLiteral", "BinaryLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "'enum'", "'assert'", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_normalClassDeclaration = 6, RULE_typeParameters = 7, RULE_typeParameter = 8, 
		RULE_bound = 9, RULE_enumDeclaration = 10, RULE_enumConstants = 11, RULE_interfaceDeclaration = 12, 
		RULE_normalInterfaceDeclaration = 13, RULE_classBody = 14, RULE_interfaceBody = 15, 
		RULE_classBodyDeclaration = 16, RULE_memberDecl = 17, RULE_fieldDeclaration = 18, 
		RULE_block = 19, RULE_blockStatement = 20, RULE_enumConstant = 21, RULE_typeList = 22, 
		RULE_typeArguments = 23, RULE_typeArgument = 24, RULE_interfaceMemberDecl = 25, 
		RULE_methodDeclaration = 26, RULE_constructorDeclaration = 27, RULE_variableModifier = 28, 
		RULE_interfaceMethodOrFieldDecl = 29, RULE_interfaceMethodOrFieldRest = 30, 
		RULE_interfaceMethodDeclaratorRest = 31, RULE_interfaceGenericMethodDecl = 32, 
		RULE_voidInterfaceMethodDeclaratorRest = 33, RULE_constantDeclarator = 34, 
		RULE_variableDeclarators = 35, RULE_variableDeclarator = 36, RULE_constantDeclaratorsRest = 37, 
		RULE_constantDeclaratorRest = 38, RULE_variableDeclaratorId = 39, RULE_variableInitializer = 40, 
		RULE_arrayInitializer = 41, RULE_modifier = 42, RULE_packageOrTypeName = 43, 
		RULE_enumConstantName = 44, RULE_typeName = 45, RULE_typeRef = 46, RULE_classOrInterfaceType = 47, 
		RULE_primitiveType = 48, RULE_qualifiedIdentifierList = 49, RULE_formalParameters = 50, 
		RULE_formalParameterDeclarations = 51, RULE_formalParameterVariables = 52, 
		RULE_methodBody = 53, RULE_explicitConstructorInvocation = 54, RULE_qualifiedIdentifier = 55, 
		RULE_literal = 56, RULE_integerLiteral = 57, RULE_booleanLiteral = 58, 
		RULE_annotation = 59, RULE_annotationName = 60, RULE_elementValuePairs = 61, 
		RULE_elementValuePair = 62, RULE_elementValue = 63, RULE_elementValueArrayInitializer = 64, 
		RULE_annotationTypeDeclaration = 65, RULE_annotationTypeElement = 66, 
		RULE_annotationMethod = 67, RULE_defaultValue = 68, RULE_localVariableDeclaration = 69, 
		RULE_statement = 70, RULE_ifStatement = 71, RULE_tryStatement = 72, RULE_catchClause = 73, 
		RULE_resources = 74, RULE_resource = 75, RULE_switchBlock = 76, RULE_switchBlockStatementGroup = 77, 
		RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		RULE_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULE_explicitGenericInvocation = 92, RULE_arrayCreatorRest = 93, RULE_classCreatorRest = 94, 
		RULE_nonWildcardTypeArguments = 95, RULE_arguments = 96;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceDeclaration", "classDeclaration", "normalClassDeclaration", 
		"typeParameters", "typeParameter", "bound", "enumDeclaration", "enumConstants", 
		"interfaceDeclaration", "normalInterfaceDeclaration", "classBody", "interfaceBody", 
		"classBodyDeclaration", "memberDecl", "fieldDeclaration", "block", "blockStatement", 
		"enumConstant", "typeList", "typeArguments", "typeArgument", "interfaceMemberDecl", 
		"methodDeclaration", "constructorDeclaration", "variableModifier", "interfaceMethodOrFieldDecl", 
		"interfaceMethodOrFieldRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
		"voidInterfaceMethodDeclaratorRest", "constantDeclarator", "variableDeclarators", 
		"variableDeclarator", "constantDeclaratorsRest", "constantDeclaratorRest", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "modifier", 
		"packageOrTypeName", "enumConstantName", "typeName", "typeRef", "classOrInterfaceType", 
		"primitiveType", "qualifiedIdentifierList", "formalParameters", "formalParameterDeclarations", 
		"formalParameterVariables", "methodBody", "explicitConstructorInvocation", 
		"qualifiedIdentifier", "literal", "integerLiteral", "booleanLiteral", 
		"annotation", "annotationName", "elementValuePairs", "elementValuePair", 
		"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeElement", "annotationMethod", "defaultValue", "localVariableDeclaration", 
		"statement", "ifStatement", "tryStatement", "catchClause", "resources", 
		"resource", "switchBlock", "switchBlockStatementGroup", "switchLabel", 
		"forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
		"expressionList", "statementExpression", "constantExpression", "expression", 
		"primary", "creator", "createdName", "innerCreator", "explicitGenericInvocation", 
		"arrayCreatorRest", "classCreatorRest", "nonWildcardTypeArguments", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java7.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Java7Parser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(194); packageDeclaration();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==68) {
				{
				{
				setState(197); importDeclaration();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 39) | (1L << 41) | (1L << 50) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)))) != 0)) {
				{
				{
				setState(203); typeDeclaration();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(211); annotation();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); match(54);
			setState(218); qualifiedIdentifier();
			setState(219); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(68);
			setState(223);
			_la = _input.LA(1);
			if (_la==66) {
				{
				setState(222); match(66);
				}
			}

			setState(225); qualifiedIdentifier();
			setState(228);
			_la = _input.LA(1);
			if (_la==71) {
				{
				setState(226); match(71);
				setState(227); match(3);
				}
			}

			setState(230); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case 1:
			case 11:
			case 16:
			case 24:
			case 30:
			case 33:
			case 39:
			case 41:
			case 50:
			case 58:
			case 62:
			case 66:
			case 73:
			case 76:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); classOrInterfaceDeclaration();
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); modifier();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(244);
			switch (_input.LA(1)) {
			case 30:
			case ENUM:
				{
				setState(242); classDeclaration();
				}
				break;
			case 1:
			case 24:
				{
				setState(243); interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(30);
			setState(251); match(Identifier);
			setState(253);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(252); typeParameters();
				}
			}

			setState(257);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(255); match(60);
				setState(256); typeRef();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(259); match(82);
				setState(260); typeList();
				}
			}

			setState(263); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(5);
			setState(266); typeParameter();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(267); match(42);
				setState(268); typeParameter();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(Identifier);
			setState(279);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(277); match(60);
				setState(278); bound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); classOrInterfaceType();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(282); match(2);
				setState(283); classOrInterfaceType();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(ENUM);
			setState(290); match(Identifier);
			setState(293);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(291); match(82);
				setState(292); typeList();
				}
			}

			setState(295); match(56);
			setState(297);
			_la = _input.LA(1);
			if (_la==24 || _la==42 || _la==Identifier) {
				{
				setState(296); enumConstants();
				}
			}

			setState(306);
			_la = _input.LA(1);
			if (_la==77) {
				{
				setState(299); match(77);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(300); classBodyDeclaration();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumConstants);
		int _la;
		try {
			int _alt;
			setState(322);
			switch (_input.LA(1)) {
			case 24:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); enumConstant();
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(311); match(42);
						setState(312); enumConstant();
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(319);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(318); match(42);
					}
				}

				}
				break;
			case 42:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceDeclaration);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); normalInterfaceDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(1);
			setState(329); match(Identifier);
			setState(331);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(330); typeParameters();
				}
			}

			setState(335);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(333); match(60);
				setState(334); typeList();
				}
			}

			setState(337); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(56);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(340); classBodyDeclaration();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl(int i) {
			return getRuleContext(InterfaceMemberDeclContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<InterfaceMemberDeclContext> interfaceMemberDecl() {
			return getRuleContexts(InterfaceMemberDeclContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(56);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(357);
				switch (_input.LA(1)) {
				case 1:
				case 5:
				case 10:
				case 11:
				case 12:
				case 14:
				case 15:
				case 16:
				case 24:
				case 30:
				case 33:
				case 35:
				case 36:
				case 39:
				case 41:
				case 49:
				case 50:
				case 53:
				case 58:
				case 62:
				case 66:
				case 69:
				case 73:
				case 76:
				case ENUM:
				case Identifier:
					{
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(349); modifier();
							}
							} 
						}
						setState(354);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(355); interfaceMemberDecl();
					}
					break;
				case 77:
					{
					setState(356); match(77);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(365); modifier();
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(371); memberDecl();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				_la = _input.LA(1);
				if (_la==66) {
					{
					setState(372); match(66);
					}
				}

				setState(375); block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDecl);
		try {
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); constructorDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382); classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); typeRef();
			setState(386); variableDeclarators();
			setState(387); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(56);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(390); blockStatement();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockStatement);
		try {
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); localVariableDeclaration();
				setState(399); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(405); annotation();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411); match(Identifier);
			setState(413);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(412); arguments();
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(415); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); classOrInterfaceType();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(419); match(42);
				setState(420); classOrInterfaceType();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); match(5);
			setState(427); typeArgument();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(428); match(42);
				setState(429); typeArgument();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgument);
		int _la;
		try {
			setState(443);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); classOrInterfaceType();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); match(51);
				setState(441);
				_la = _input.LA(1);
				if (_la==18 || _la==60) {
					{
					setState(439);
					_la = _input.LA(1);
					if ( !(_la==18 || _la==60) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(440); classOrInterfaceType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMemberDecl(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceMemberDecl);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(445); interfaceMethodOrFieldDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); interfaceGenericMethodDecl();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 3);
				{
				setState(447); match(53);
				setState(448); match(Identifier);
				setState(449); voidInterfaceMethodDeclaratorRest();
				}
				break;
			case 1:
			case 24:
				enterOuterAlt(_localctx, 4);
				{
				setState(450); interfaceDeclaration();
				}
				break;
			case 30:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(451); classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(454); typeParameters();
				}
			}

			setState(459);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				{
				setState(457); typeRef();
				}
				break;
			case 53:
				{
				setState(458); match(53);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(461); match(Identifier);
			setState(462); formalParameters();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(463); match(4);
				setState(464); match(37);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(470); match(27);
				setState(471); qualifiedIdentifierList();
				}
			}

			setState(476);
			switch (_input.LA(1)) {
			case 56:
				{
				setState(474); methodBody();
				}
				break;
			case 77:
				{
				setState(475); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(478); typeParameters();
				}
			}

			setState(481); match(Identifier);
			setState(482); formalParameters();
			setState(485);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(483); match(27);
				setState(484); qualifiedIdentifierList();
				}
			}

			setState(487); match(56);
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(488); explicitConstructorInvocation();
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(491); blockStatement();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableModifier);
		try {
			setState(501);
			switch (_input.LA(1)) {
			case 62:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); match(62);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(500); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); typeRef();
			setState(504); match(Identifier);
			setState(505); interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldRest(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodOrFieldRest);
		try {
			setState(511);
			switch (_input.LA(1)) {
			case 4:
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); constantDeclaratorsRest();
				setState(508); match(77);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(510); interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); formalParameters();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(514); match(4);
				setState(515); match(37);
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(521); match(27);
				setState(522); qualifiedIdentifierList();
				}
			}

			setState(525); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceGenericMethodDecl(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); typeParameters();
			setState(530);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				{
				setState(528); typeRef();
				}
				break;
			case 53:
				{
				setState(529); match(53);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532); match(Identifier);
			setState(533); interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535); formalParameters();
			setState(538);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(536); match(27);
				setState(537); qualifiedIdentifierList();
				}
			}

			setState(540); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(Identifier);
			setState(543); constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); variableDeclarator();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(546); match(42);
				setState(547); variableDeclarator();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); variableDeclaratorId();
			setState(556);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(554); match(25);
				setState(555); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorsRest(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); constantDeclaratorRest();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(559); match(42);
				setState(560); constantDeclarator();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorRest(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(566); match(4);
				setState(567); match(37);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573); match(25);
			setState(574); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(Identifier);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(577); match(4);
				setState(578); match(37);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableInitializer);
		try {
			setState(586);
			switch (_input.LA(1)) {
			case 56:
				enterOuterAlt(_localctx, 1);
				{
				setState(584); arrayInitializer();
				}
				break;
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588); match(56);
			setState(600);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(589); variableInitializer();
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(590); match(42);
						setState(591); variableInitializer();
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(598);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(597); match(42);
					}
				}

				}
			}

			setState(602); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_modifier);
		try {
			setState(616);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(604); annotation();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(605); match(39);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 3);
				{
				setState(606); match(73);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 4);
				{
				setState(607); match(50);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 5);
				{
				setState(608); match(66);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 6);
				{
				setState(609); match(11);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 7);
				{
				setState(610); match(62);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 8);
				{
				setState(611); match(58);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 9);
				{
				setState(612); match(41);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 10);
				{
				setState(613); match(33);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 11);
				{
				setState(614); match(76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 12);
				{
				setState(615); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRefContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeRef(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeRef);
		try {
			int _alt;
			setState(640);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(624); classOrInterfaceType();
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(625); match(4);
						setState(626); match(37);
						}
						} 
					}
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 2);
				{
				setState(632); primitiveType();
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(633); match(4);
						setState(634); match(37);
						}
						} 
					}
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(Identifier);
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(643); typeArguments();
				}
				break;
			}
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(646); match(71);
					setState(647); match(Identifier);
					setState(649);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(648); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (10 - 10)) | (1L << (12 - 10)) | (1L << (14 - 10)) | (1L << (15 - 10)) | (1L << (35 - 10)) | (1L << (36 - 10)) | (1L << (49 - 10)) | (1L << (69 - 10)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierListContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifierList(this);
		}
	}

	public final QualifiedIdentifierListContext qualifiedIdentifierList() throws RecognitionException {
		QualifiedIdentifierListContext _localctx = new QualifiedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qualifiedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); qualifiedIdentifier();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(659); match(42);
				setState(660); qualifiedIdentifier();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); match(45);
			setState(668);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 24) | (1L << 35) | (1L << 36) | (1L << 49) | (1L << 62))) != 0) || _la==69 || _la==Identifier) {
				{
				setState(667); formalParameterDeclarations();
				}
			}

			setState(670); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclarationsContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public FormalParameterVariablesContext formalParameterVariables() {
			return getRuleContext(FormalParameterVariablesContext.class,0);
		}
		public FormalParameterDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterDeclarations(this);
		}
	}

	public final FormalParameterDeclarationsContext formalParameterDeclarations() throws RecognitionException {
		FormalParameterDeclarationsContext _localctx = new FormalParameterDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameterDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(672); variableModifier();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678); typeRef();
			setState(679); formalParameterVariables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterVariablesContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParameterVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterVariables(this);
		}
	}

	public final FormalParameterVariablesContext formalParameterVariables() throws RecognitionException {
		FormalParameterVariablesContext _localctx = new FormalParameterVariablesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameterVariables);
		int _la;
		try {
			setState(688);
			switch (_input.LA(1)) {
			case 55:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); match(55);
				setState(682); variableDeclaratorId();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(683); variableDeclaratorId();
				setState(686);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(684); match(42);
					setState(685); formalParameterDeclarations();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(692); nonWildcardTypeArguments();
					}
				}

				setState(695);
				_la = _input.LA(1);
				if ( !(_la==18 || _la==79) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(696); arguments();
				setState(697); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699); primary();
				setState(700); match(71);
				setState(702);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(701); nonWildcardTypeArguments();
					}
				}

				setState(704); match(18);
				setState(705); arguments();
				setState(706); match(77);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifier(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710); match(Identifier);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(711); match(71);
					setState(712); match(Identifier);
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(724);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(720); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(721); match(StringLiteral);
				}
				break;
			case 7:
			case 65:
				enterOuterAlt(_localctx, 5);
				{
				setState(722); booleanLiteral();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 6);
				{
				setState(723); match(26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(Java7Parser.HexLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(Java7Parser.DecimalLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(Java7Parser.OctalLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(Java7Parser.BinaryLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (HexLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (OctalLiteral - 90)) | (1L << (BinaryLiteral - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==65) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); match(24);
			setState(731); annotationName();
			setState(738);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(732); match(45);
				setState(735);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(733); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(734); elementValue();
					}
					break;
				}
				setState(737); match(22);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); match(Identifier);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==71) {
				{
				{
				setState(741); match(71);
				setState(742); match(Identifier);
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); elementValuePair();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(749); match(42);
				setState(750); elementValuePair();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); match(Identifier);
			setState(757); match(25);
			setState(758); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValue);
		try {
			setState(763);
			switch (_input.LA(1)) {
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(760); expression(0);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(761); annotation();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 3);
				{
				setState(762); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(56);
			setState(774);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(766); elementValue();
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(767); match(42);
						setState(768); elementValue();
						}
						} 
					}
					setState(773);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
			}

			setState(777);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(776); match(42);
				}
			}

			setState(779); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public List<AnnotationTypeElementContext> annotationTypeElement() {
			return getRuleContexts(AnnotationTypeElementContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementContext annotationTypeElement(int i) {
			return getRuleContext(AnnotationTypeElementContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationTypeDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781); match(24);
			setState(782); match(1);
			setState(783); match(Identifier);
			setState(784); match(56);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(785); modifier();
						}
						} 
					}
					setState(790);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(791); annotationTypeElement();
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodContext annotationMethod() {
			return getRuleContext(AnnotationMethodContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElement(this);
		}
	}

	public final AnnotationTypeElementContext annotationTypeElement() throws RecognitionException {
		AnnotationTypeElementContext _localctx = new AnnotationTypeElementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeElement);
		int _la;
		try {
			setState(822);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); typeRef();
				setState(802);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(800); annotationMethod();
					}
					break;

				case 2:
					{
					setState(801); variableDeclarators();
					}
					break;
				}
				setState(804); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806); classDeclaration();
				setState(808);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(807); match(77);
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810); normalInterfaceDeclaration();
				setState(812);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(811); match(77);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814); enumDeclaration();
				setState(816);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(815); match(77);
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(818); annotationTypeDeclaration();
				setState(820);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(819); match(77);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationMethod(this);
		}
	}

	public final AnnotationMethodContext annotationMethod() throws RecognitionException {
		AnnotationMethodContext _localctx = new AnnotationMethodContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824); match(Identifier);
			setState(825); match(45);
			setState(826); match(22);
			setState(828);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(827); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830); match(40);
			setState(831); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(833); variableModifier();
				}
				}
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(839); typeRef();
			setState(840); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStateContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ContinueStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterContinueState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitContinueState(this);
		}
	}
	public static class BreakStateContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public BreakStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBreakState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBreakState(this);
		}
	}
	public static class SemicolonStateContext extends StatementContext {
		public SemicolonStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSemicolonState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSemicolonState(this);
		}
	}
	public static class SwitchStateContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchState(this);
		}
	}
	public static class WhileStateContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public WhileStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitWhileState(this);
		}
	}
	public static class ThrowStateContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterThrowState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitThrowState(this);
		}
	}
	public static class AssertStateContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public AssertStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAssertState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAssertState(this);
		}
	}
	public static class IdentifierStateContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public IdentifierStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIdentifierState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIdentifierState(this);
		}
	}
	public static class ForStateContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ForStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForState(this);
		}
	}
	public static class DoWhileStateContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoWhileStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterDoWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitDoWhileState(this);
		}
	}
	public static class StateExpStateContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StateExpStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStateExpState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStateExpState(this);
		}
	}
	public static class TryStateContext extends StatementContext {
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public TryStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTryState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTryState(this);
		}
	}
	public static class IfStateContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIfState(this);
		}
	}
	public static class BlockStateContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlockState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlockState(this);
		}
	}
	public static class SynchronizedStateContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSynchronizedState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSynchronizedState(this);
		}
	}
	public static class ReturnStateContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterReturnState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitReturnState(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		int _la;
		try {
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new BlockStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(842); block();
				}
				break;

			case 2:
				_localctx = new AssertStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(843); match(ASSERT);
				setState(844); expression(0);
				setState(847);
				_la = _input.LA(1);
				if (_la==46) {
					{
					setState(845); match(46);
					setState(846); expression(0);
					}
				}

				setState(849); match(77);
				}
				break;

			case 3:
				_localctx = new IfStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(851); ifStatement();
				}
				break;

			case 4:
				_localctx = new ForStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(852); match(74);
				setState(853); match(45);
				setState(854); forControl();
				setState(855); match(22);
				setState(856); statement();
				}
				break;

			case 5:
				_localctx = new WhileStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(858); match(43);
				setState(859); parExpression();
				setState(860); statement();
				}
				break;

			case 6:
				_localctx = new DoWhileStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(862); match(19);
				setState(863); statement();
				setState(864); match(43);
				setState(865); parExpression();
				setState(866); match(77);
				}
				break;

			case 7:
				_localctx = new TryStateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(868); tryStatement();
				}
				break;

			case 8:
				_localctx = new SwitchStateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(869); match(84);
				setState(870); parExpression();
				setState(871); switchBlock();
				}
				break;

			case 9:
				_localctx = new SynchronizedStateContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(873); match(41);
				setState(874); parExpression();
				setState(875); block();
				}
				break;

			case 10:
				_localctx = new ReturnStateContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(877); match(75);
				setState(879);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(878); expression(0);
					}
				}

				setState(881); match(77);
				}
				break;

			case 11:
				_localctx = new ThrowStateContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(882); match(23);
				setState(883); expression(0);
				setState(884); match(77);
				}
				break;

			case 12:
				_localctx = new BreakStateContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(886); match(57);
				setState(888);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(887); match(Identifier);
					}
				}

				setState(890); match(77);
				}
				break;

			case 13:
				_localctx = new ContinueStateContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(891); match(8);
				setState(893);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(892); match(Identifier);
					}
				}

				setState(895); match(77);
				}
				break;

			case 14:
				_localctx = new SemicolonStateContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(896); match(77);
				}
				break;

			case 15:
				_localctx = new StateExpStateContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(897); statementExpression();
				setState(898); match(77);
				}
				break;

			case 16:
				_localctx = new IdentifierStateContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(900); match(Identifier);
				setState(901); match(46);
				setState(902); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); match(47);
			setState(906); parExpression();
			setState(907); statement();
			setState(910);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(908); match(63);
				setState(909); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tryStatement);
		int _la;
		try {
			setState(942);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912); match(52);
				setState(913); match(45);
				setState(914); resources();
				setState(915); match(22);
				setState(916); block();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==64) {
					{
					{
					setState(917); catchClause();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(925);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(923); match(31);
					setState(924); block();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927); match(52);
				setState(928); block();
				setState(940);
				switch (_input.LA(1)) {
				case 64:
					{
					setState(930); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(929); catchClause();
						}
						}
						setState(932); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==64 );
					setState(936);
					_la = _input.LA(1);
					if (_la==31) {
						{
						setState(934); match(31);
						setState(935); block();
						}
					}

					}
					break;
				case 31:
					{
					setState(938); match(31);
					setState(939); block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944); match(64);
			setState(945); match(45);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(946); variableModifier();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952); typeRef();
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(953); match(32);
				setState(954); typeRef();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960); match(Identifier);
			setState(961); match(22);
			setState(962); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resources);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964); resource();
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(965); match(77);
					setState(966); resource();
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(973);
			_la = _input.LA(1);
			if (_la==77) {
				{
				setState(972); match(77);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(975); variableModifier();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981); classOrInterfaceType();
			setState(982); variableDeclaratorId();
			setState(983); match(25);
			setState(984); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986); match(56);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(987); switchBlockStatementGroup();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17 || _la==40) {
				{
				{
				setState(993); switchLabel();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(999); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1002); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1001); switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1004); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(1006); blockStatement();
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchLabel);
		try {
			setState(1022);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012); match(17);
				setState(1013); constantExpression();
				setState(1014); match(46);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016); match(17);
				setState(1017); enumConstantName();
				setState(1018); match(46);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020); match(40);
				setState(1021); match(46);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forControl);
		int _la;
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1025); forInit();
					}
				}

				setState(1028); match(77);
				setState(1030);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1029); expression(0);
					}
				}

				setState(1032); match(77);
				setState(1034);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1033); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forInit);
		try {
			setState(1040);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(1042); variableModifier();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048); typeRef();
			setState(1049); match(Identifier);
			setState(1050); match(46);
			setState(1051); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); match(45);
			setState(1056); expression(0);
			setState(1057); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); expression(0);
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(1060); match(42);
				setState(1061); expression(0);
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAndExpr(this);
		}
	}
	public static class CastExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCastExpr(this);
		}
	}
	public static class NewCreatorExprContext extends ExpressionContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewCreatorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNewCreatorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNewCreatorExpr(this);
		}
	}
	public static class BitOrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBitOrExpr(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMulExpr(this);
		}
	}
	public static class TernaryExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTernaryExpr(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAssignExpr(this);
		}
	}
	public static class CompExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCompExpr(this);
		}
	}
	public static class NewCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NewCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNewCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNewCallExpr(this);
		}
	}
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimaryExpr(this);
		}
	}
	public static class SumExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSumExpr(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEqExpr(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNotExpr(this);
		}
	}
	public static class BitAndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitAndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBitAndExpr(this);
		}
	}
	public static class CallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCallExpr(this);
		}
	}
	public static class ShiftExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShiftExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitShiftExpr(this);
		}
	}
	public static class InstanceofExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceofExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInstanceofExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInstanceofExpr(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitOrExpr(this);
		}
	}
	public static class SuperExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSuperExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSuperExpr(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitUnaryExpr(this);
		}
	}
	public static class PostExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPostExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPostExpr(this);
		}
	}
	public static class ThisExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitThisExpr(this);
		}
	}
	public static class SuperMethodExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public SuperMethodExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSuperMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSuperMethodExpr(this);
		}
	}
	public static class IndexExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIndexExpr(this);
		}
	}
	public static class MethodCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodCallExpr(this);
		}
	}
	public static class FieldExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FieldExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFieldExpr(this);
		}
	}
	public static class BitXorExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitXorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBitXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBitXorExpr(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==6 || _la==44 || _la==67 || _la==72) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1073); expression(17);
				}
				break;

			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1074);
				_la = _input.LA(1);
				if ( !(_la==34 || _la==88) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1075); expression(16);
				}
				break;

			case 3:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1076); match(45);
				setState(1077); typeRef();
				setState(1078); match(22);
				setState(1079); expression(15);
				}
				break;

			case 4:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1081); primary();
				}
				break;

			case 5:
				{
				_localctx = new NewCreatorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1082); match(29);
				setState(1083); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1210);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1087);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==20 || _la==86) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1088); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new SumExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1089);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1090);
						_la = _input.LA(1);
						if ( !(_la==44 || _la==72) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1091); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1092);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1100);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(1093); match(5);
							setState(1094); match(5);
							}
							break;

						case 2:
							{
							setState(1095); match(81);
							setState(1096); match(81);
							setState(1097); match(81);
							}
							break;

						case 3:
							{
							setState(1098); match(81);
							setState(1099); match(81);
							}
							break;
						}
						setState(1102); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1110);
						switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
						case 1:
							{
							setState(1104); match(5);
							setState(1105); match(25);
							}
							break;

						case 2:
							{
							setState(1106); match(81);
							setState(1107); match(25);
							}
							break;

						case 3:
							{
							setState(1108); match(81);
							}
							break;

						case 4:
							{
							setState(1109); match(5);
							}
							break;
						}
						setState(1112); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1114);
						_la = _input.LA(1);
						if ( !(_la==9 || _la==87) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1115); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new BitAndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1116);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1117); match(2);
						setState(1118); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new BitXorExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1119);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1120); match(70);
						setState(1121); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new BitOrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1123); match(32);
						setState(1124); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1126); match(78);
						setState(1127); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1128);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1129); match(80);
						setState(1130); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1151);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1132); match(61);
							}
							break;

						case 2:
							{
							setState(1133); match(59);
							}
							break;

						case 3:
							{
							setState(1134); match(38);
							}
							break;

						case 4:
							{
							setState(1135); match(21);
							}
							break;

						case 5:
							{
							setState(1136); match(85);
							}
							break;

						case 6:
							{
							setState(1137); match(48);
							}
							break;

						case 7:
							{
							setState(1138); match(28);
							}
							break;

						case 8:
							{
							setState(1139); match(25);
							}
							break;

						case 9:
							{
							setState(1140); match(81);
							setState(1141); match(81);
							setState(1142); match(25);
							}
							break;

						case 10:
							{
							setState(1143); match(81);
							setState(1144); match(81);
							setState(1145); match(81);
							setState(1146); match(25);
							}
							break;

						case 11:
							{
							setState(1147); match(5);
							setState(1148); match(5);
							setState(1149); match(25);
							}
							break;

						case 12:
							{
							setState(1150); match(83);
							}
							break;
						}
						setState(1153); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1154);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1155); match(51);
						setState(1156); expression(0);
						setState(1157); match(46);
						setState(1158); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new FieldExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(1161); match(71);
						setState(1162); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new ThisExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1163);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1164); match(71);
						setState(1165); match(79);
						}
						break;

					case 15:
						{
						_localctx = new SuperExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1167); match(71);
						setState(1168); match(18);
						setState(1169); match(45);
						setState(1171);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1170); expressionList();
							}
						}

						setState(1173); match(22);
						}
						break;

					case 16:
						{
						_localctx = new NewCallExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1175); match(71);
						setState(1176); match(29);
						setState(1177); match(Identifier);
						setState(1178); match(45);
						setState(1180);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1179); expressionList();
							}
						}

						setState(1182); match(22);
						}
						break;

					case 17:
						{
						_localctx = new SuperMethodExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1184); match(71);
						setState(1185); match(18);
						setState(1186); match(71);
						setState(1187); match(Identifier);
						setState(1189);
						switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
						case 1:
							{
							setState(1188); arguments();
							}
							break;
						}
						}
						break;

					case 18:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1192); match(71);
						setState(1193); explicitGenericInvocation();
						}
						break;

					case 19:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1194);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(1195); match(4);
						setState(1196); expression(0);
						setState(1197); match(37);
						}
						break;

					case 20:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1200); match(45);
						setState(1202);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1201); expressionList();
							}
						}

						setState(1204); match(22);
						}
						break;

					case 21:
						{
						_localctx = new PostExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1205);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(1206);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==67) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 22:
						{
						_localctx = new InstanceofExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1208); match(89);
						setState(1209); typeRef();
						}
						break;
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primary);
		try {
			setState(1230);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215); match(45);
				setState(1216); expression(0);
				setState(1217); match(22);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219); match(79);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220); match(18);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1222); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1223); typeRef();
				setState(1224); match(71);
				setState(1225); match(30);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1227); match(53);
				setState(1228); match(71);
				setState(1229); match(30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creator);
		try {
			setState(1241);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232); nonWildcardTypeArguments();
				setState(1233); createdName();
				setState(1234); classCreatorRest();
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236); createdName();
				setState(1239);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(1237); arrayCreatorRest();
					}
					break;
				case 45:
					{
					setState(1238); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_createdName);
		int _la;
		try {
			setState(1262);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243); primitiveType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244); match(Identifier);
				setState(1248);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1245); typeArguments();
					}
					break;

				case 2:
					{
					setState(1246); match(5);
					setState(1247); match(81);
					}
					break;
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==71) {
					{
					{
					setState(1250); match(71);
					setState(1251); match(Identifier);
					setState(1255);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1252); typeArguments();
						}
						break;

					case 2:
						{
						setState(1253); match(5);
						setState(1254); match(81);
						}
						break;
					}
					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1264); nonWildcardTypeArguments();
				}
				break;

			case 2:
				{
				setState(1265); match(5);
				setState(1266); match(81);
				}
				break;
			}
			setState(1269); match(Identifier);
			setState(1270); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272); nonWildcardTypeArguments();
			setState(1273); match(Identifier);
			setState(1274); arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276); match(4);
			setState(1305);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1277); match(37);
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(1278); match(4);
					setState(1279); match(37);
					}
					}
					setState(1284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1285); arrayInitializer();
				}
				break;

			case 2:
				{
				setState(1286); expression(0);
				setState(1287); match(37);
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1288); match(4);
						setState(1289); expression(0);
						setState(1290); match(37);
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1297); match(4);
						setState(1298); match(37);
						}
						} 
					}
					setState(1303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				}
				break;

			case 3:
				{
				setState(1304); match(37);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); arguments();
			setState(1309);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1308); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311); match(5);
			setState(1312); typeList();
			setState(1313); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315); match(45);
			setState(1317);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1316); expressionList();
				}
			}

			setState(1319); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 87: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 26 >= _localctx._p;

		case 13: return 25 >= _localctx._p;

		case 14: return 24 >= _localctx._p;

		case 15: return 23 >= _localctx._p;

		case 17: return 21 >= _localctx._p;

		case 16: return 22 >= _localctx._p;

		case 19: return 19 >= _localctx._p;

		case 18: return 20 >= _localctx._p;

		case 21: return 9 >= _localctx._p;

		case 20: return 18 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3h\u052c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\3\2\5\2\u00c6\n\2\3\2\7\2\u00c9\n\2"+
		"\f\2\16\2\u00cc\13\2\3\2\7\2\u00cf\n\2\f\2\16\2\u00d2\13\2\3\2\3\2\3\3"+
		"\7\3\u00d7\n\3\f\3\16\3\u00da\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00e2\n"+
		"\4\3\4\3\4\3\4\5\4\u00e7\n\4\3\4\3\4\3\5\3\5\5\5\u00ed\n\5\3\6\7\6\u00f0"+
		"\n\6\f\6\16\6\u00f3\13\6\3\6\3\6\5\6\u00f7\n\6\3\7\3\7\5\7\u00fb\n\7\3"+
		"\b\3\b\3\b\5\b\u0100\n\b\3\b\3\b\5\b\u0104\n\b\3\b\3\b\5\b\u0108\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t\u0110\n\t\f\t\16\t\u0113\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\5\n\u011a\n\n\3\13\3\13\3\13\7\13\u011f\n\13\f\13\16\13\u0122\13"+
		"\13\3\f\3\f\3\f\3\f\5\f\u0128\n\f\3\f\3\f\5\f\u012c\n\f\3\f\3\f\7\f\u0130"+
		"\n\f\f\f\16\f\u0133\13\f\5\f\u0135\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u013c\n"+
		"\r\f\r\16\r\u013f\13\r\3\r\5\r\u0142\n\r\3\r\5\r\u0145\n\r\3\16\3\16\5"+
		"\16\u0149\n\16\3\17\3\17\3\17\5\17\u014e\n\17\3\17\3\17\5\17\u0152\n\17"+
		"\3\17\3\17\3\20\3\20\7\20\u0158\n\20\f\20\16\20\u015b\13\20\3\20\3\20"+
		"\3\21\3\21\7\21\u0161\n\21\f\21\16\21\u0164\13\21\3\21\3\21\7\21\u0168"+
		"\n\21\f\21\16\21\u016b\13\21\3\21\3\21\3\22\3\22\7\22\u0171\n\22\f\22"+
		"\16\22\u0174\13\22\3\22\3\22\5\22\u0178\n\22\3\22\5\22\u017b\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0182\n\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25"+
		"\u018a\n\25\f\25\16\25\u018d\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0196\n\26\3\27\7\27\u0199\n\27\f\27\16\27\u019c\13\27\3\27\3\27"+
		"\5\27\u01a0\n\27\3\27\5\27\u01a3\n\27\3\30\3\30\3\30\7\30\u01a8\n\30\f"+
		"\30\16\30\u01ab\13\30\3\31\3\31\3\31\3\31\7\31\u01b1\n\31\f\31\16\31\u01b4"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01bc\n\32\5\32\u01be\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c7\n\33\3\34\5\34\u01ca\n\34"+
		"\3\34\3\34\5\34\u01ce\n\34\3\34\3\34\3\34\3\34\7\34\u01d4\n\34\f\34\16"+
		"\34\u01d7\13\34\3\34\3\34\5\34\u01db\n\34\3\34\3\34\5\34\u01df\n\34\3"+
		"\35\5\35\u01e2\n\35\3\35\3\35\3\35\3\35\5\35\u01e8\n\35\3\35\3\35\5\35"+
		"\u01ec\n\35\3\35\7\35\u01ef\n\35\f\35\16\35\u01f2\13\35\3\35\3\35\3\36"+
		"\3\36\5\36\u01f8\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0202\n \3!\3"+
		"!\3!\7!\u0207\n!\f!\16!\u020a\13!\3!\3!\5!\u020e\n!\3!\3!\3\"\3\"\3\""+
		"\5\"\u0215\n\"\3\"\3\"\3\"\3#\3#\3#\5#\u021d\n#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\7%\u0227\n%\f%\16%\u022a\13%\3&\3&\3&\5&\u022f\n&\3\'\3\'\3\'\7\'\u0234"+
		"\n\'\f\'\16\'\u0237\13\'\3(\3(\7(\u023b\n(\f(\16(\u023e\13(\3(\3(\3(\3"+
		")\3)\3)\7)\u0246\n)\f)\16)\u0249\13)\3*\3*\5*\u024d\n*\3+\3+\3+\3+\7+"+
		"\u0253\n+\f+\16+\u0256\13+\3+\5+\u0259\n+\5+\u025b\n+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u026b\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\7\60\u0276\n\60\f\60\16\60\u0279\13\60\3\60\3\60\3\60\7\60\u027e\n\60"+
		"\f\60\16\60\u0281\13\60\5\60\u0283\n\60\3\61\3\61\5\61\u0287\n\61\3\61"+
		"\3\61\3\61\5\61\u028c\n\61\7\61\u028e\n\61\f\61\16\61\u0291\13\61\3\62"+
		"\3\62\3\63\3\63\3\63\7\63\u0298\n\63\f\63\16\63\u029b\13\63\3\64\3\64"+
		"\5\64\u029f\n\64\3\64\3\64\3\65\7\65\u02a4\n\65\f\65\16\65\u02a7\13\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u02b1\n\66\5\66\u02b3\n"+
		"\66\3\67\3\67\38\58\u02b8\n8\38\38\38\38\38\38\38\58\u02c1\n8\38\38\3"+
		"8\38\58\u02c7\n8\39\39\39\79\u02cc\n9\f9\169\u02cf\139\3:\3:\3:\3:\3:"+
		"\3:\5:\u02d7\n:\3;\3;\3<\3<\3=\3=\3=\3=\3=\5=\u02e2\n=\3=\5=\u02e5\n="+
		"\3>\3>\3>\7>\u02ea\n>\f>\16>\u02ed\13>\3?\3?\3?\7?\u02f2\n?\f?\16?\u02f5"+
		"\13?\3@\3@\3@\3@\3A\3A\3A\5A\u02fe\nA\3B\3B\3B\3B\7B\u0304\nB\fB\16B\u0307"+
		"\13B\5B\u0309\nB\3B\5B\u030c\nB\3B\3B\3C\3C\3C\3C\3C\7C\u0315\nC\fC\16"+
		"C\u0318\13C\3C\7C\u031b\nC\fC\16C\u031e\13C\3C\3C\3D\3D\3D\5D\u0325\n"+
		"D\3D\3D\3D\3D\5D\u032b\nD\3D\3D\5D\u032f\nD\3D\3D\5D\u0333\nD\3D\3D\5"+
		"D\u0337\nD\5D\u0339\nD\3E\3E\3E\3E\5E\u033f\nE\3F\3F\3F\3G\7G\u0345\n"+
		"G\fG\16G\u0348\13G\3G\3G\3G\3H\3H\3H\3H\3H\5H\u0352\nH\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u0372\nH\3H\3H\3H\3H\3H\3H\3H\5H\u037b\nH\3H\3H\3H\5H\u0380"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u038a\nH\3I\3I\3I\3I\3I\5I\u0391\nI\3J"+
		"\3J\3J\3J\3J\3J\7J\u0399\nJ\fJ\16J\u039c\13J\3J\3J\5J\u03a0\nJ\3J\3J\3"+
		"J\6J\u03a5\nJ\rJ\16J\u03a6\3J\3J\5J\u03ab\nJ\3J\3J\5J\u03af\nJ\5J\u03b1"+
		"\nJ\3K\3K\3K\7K\u03b6\nK\fK\16K\u03b9\13K\3K\3K\3K\7K\u03be\nK\fK\16K"+
		"\u03c1\13K\3K\3K\3K\3K\3L\3L\3L\7L\u03ca\nL\fL\16L\u03cd\13L\3L\5L\u03d0"+
		"\nL\3M\7M\u03d3\nM\fM\16M\u03d6\13M\3M\3M\3M\3M\3M\3N\3N\7N\u03df\nN\f"+
		"N\16N\u03e2\13N\3N\7N\u03e5\nN\fN\16N\u03e8\13N\3N\3N\3O\6O\u03ed\nO\r"+
		"O\16O\u03ee\3O\7O\u03f2\nO\fO\16O\u03f5\13O\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\5P\u0401\nP\3Q\3Q\5Q\u0405\nQ\3Q\3Q\5Q\u0409\nQ\3Q\3Q\5Q\u040d\n"+
		"Q\5Q\u040f\nQ\3R\3R\5R\u0413\nR\3S\7S\u0416\nS\fS\16S\u0419\13S\3S\3S"+
		"\3S\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u0429\nV\fV\16V\u042c\13V\3W\3"+
		"W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u043f\nY\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u044f\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5"+
		"Y\u0459\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0482\n"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0496\nY\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u049f\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04a8\nY\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04b5\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u04bd\n"+
		"Y\fY\16Y\u04c0\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u04d1"+
		"\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04da\n[\5[\u04dc\n[\3\\\3\\\3\\\3\\\3\\\5"+
		"\\\u04e3\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u04ea\n\\\7\\\u04ec\n\\\f\\\16\\"+
		"\u04ef\13\\\5\\\u04f1\n\\\3]\3]\3]\5]\u04f6\n]\3]\3]\3]\3^\3^\3^\3^\3"+
		"_\3_\3_\3_\7_\u0503\n_\f_\16_\u0506\13_\3_\3_\3_\3_\3_\3_\3_\7_\u050f"+
		"\n_\f_\16_\u0512\13_\3_\3_\7_\u0516\n_\f_\16_\u0519\13_\3_\5_\u051c\n"+
		"_\3`\3`\5`\u0520\n`\3a\3a\3a\3a\3b\3b\5b\u0528\nb\3b\3b\3b\2c\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\2\r\4\24\24>>\b\f\f\16\16\20\21%&\63\63GG\4\24\24QQ\3\\_\4\t\t"+
		"CC\6\b\b..EEJJ\4$$ZZ\5\5\5\26\26XX\4..JJ\4\13\13YY\4\b\bEE\u05bd\2\u00c5"+
		"\3\2\2\2\4\u00d8\3\2\2\2\6\u00df\3\2\2\2\b\u00ec\3\2\2\2\n\u00f1\3\2\2"+
		"\2\f\u00fa\3\2\2\2\16\u00fc\3\2\2\2\20\u010b\3\2\2\2\22\u0116\3\2\2\2"+
		"\24\u011b\3\2\2\2\26\u0123\3\2\2\2\30\u0144\3\2\2\2\32\u0148\3\2\2\2\34"+
		"\u014a\3\2\2\2\36\u0155\3\2\2\2 \u015e\3\2\2\2\"\u017a\3\2\2\2$\u0181"+
		"\3\2\2\2&\u0183\3\2\2\2(\u0187\3\2\2\2*\u0195\3\2\2\2,\u019a\3\2\2\2."+
		"\u01a4\3\2\2\2\60\u01ac\3\2\2\2\62\u01bd\3\2\2\2\64\u01c6\3\2\2\2\66\u01c9"+
		"\3\2\2\28\u01e1\3\2\2\2:\u01f7\3\2\2\2<\u01f9\3\2\2\2>\u0201\3\2\2\2@"+
		"\u0203\3\2\2\2B\u0211\3\2\2\2D\u0219\3\2\2\2F\u0220\3\2\2\2H\u0223\3\2"+
		"\2\2J\u022b\3\2\2\2L\u0230\3\2\2\2N\u023c\3\2\2\2P\u0242\3\2\2\2R\u024c"+
		"\3\2\2\2T\u024e\3\2\2\2V\u026a\3\2\2\2X\u026c\3\2\2\2Z\u026e\3\2\2\2\\"+
		"\u0270\3\2\2\2^\u0282\3\2\2\2`\u0284\3\2\2\2b\u0292\3\2\2\2d\u0294\3\2"+
		"\2\2f\u029c\3\2\2\2h\u02a5\3\2\2\2j\u02b2\3\2\2\2l\u02b4\3\2\2\2n\u02c6"+
		"\3\2\2\2p\u02c8\3\2\2\2r\u02d6\3\2\2\2t\u02d8\3\2\2\2v\u02da\3\2\2\2x"+
		"\u02dc\3\2\2\2z\u02e6\3\2\2\2|\u02ee\3\2\2\2~\u02f6\3\2\2\2\u0080\u02fd"+
		"\3\2\2\2\u0082\u02ff\3\2\2\2\u0084\u030f\3\2\2\2\u0086\u0338\3\2\2\2\u0088"+
		"\u033a\3\2\2\2\u008a\u0340\3\2\2\2\u008c\u0346\3\2\2\2\u008e\u0389\3\2"+
		"\2\2\u0090\u038b\3\2\2\2\u0092\u03b0\3\2\2\2\u0094\u03b2\3\2\2\2\u0096"+
		"\u03c6\3\2\2\2\u0098\u03d4\3\2\2\2\u009a\u03dc\3\2\2\2\u009c\u03ec\3\2"+
		"\2\2\u009e\u0400\3\2\2\2\u00a0\u040e\3\2\2\2\u00a2\u0412\3\2\2\2\u00a4"+
		"\u0417\3\2\2\2\u00a6\u041f\3\2\2\2\u00a8\u0421\3\2\2\2\u00aa\u0425\3\2"+
		"\2\2\u00ac\u042d\3\2\2\2\u00ae\u042f\3\2\2\2\u00b0\u043e\3\2\2\2\u00b2"+
		"\u04d0\3\2\2\2\u00b4\u04db\3\2\2\2\u00b6\u04f0\3\2\2\2\u00b8\u04f5\3\2"+
		"\2\2\u00ba\u04fa\3\2\2\2\u00bc\u04fe\3\2\2\2\u00be\u051d\3\2\2\2\u00c0"+
		"\u0521\3\2\2\2\u00c2\u0525\3\2\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c4\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\5\6\4\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\5\b\5\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\1\2\2\u00d4"+
		"\3\3\2\2\2\u00d5\u00d7\5x=\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\78\2\2\u00dc\u00dd\5p9\2\u00dd\u00de\7O\2\2\u00de\5\3"+
		"\2\2\2\u00df\u00e1\7F\2\2\u00e0\u00e2\7D\2\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\5p9\2\u00e4\u00e5\7I\2"+
		"\2\u00e5\u00e7\7\5\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e9\7O\2\2\u00e9\7\3\2\2\2\u00ea\u00ed\5\n\6\2\u00eb"+
		"\u00ed\7O\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\t\3\2\2\2"+
		"\u00ee\u00f0\5V,\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f7\5\f\7\2\u00f5\u00f7\5\32\16\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f7\13\3\2\2\2\u00f8\u00fb\5\16\b\2\u00f9\u00fb\5\26\f\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\r\3\2\2\2\u00fc\u00fd\7 \2\2"+
		"\u00fd\u00ff\7e\2\2\u00fe\u0100\5\20\t\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0104\5^\60\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\7T"+
		"\2\2\u0106\u0108\5.\30\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\5\36\20\2\u010a\17\3\2\2\2\u010b\u010c\7\7"+
		"\2\2\u010c\u0111\5\22\n\2\u010d\u010e\7,\2\2\u010e\u0110\5\22\n\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7S\2\2\u0115"+
		"\21\3\2\2\2\u0116\u0119\7e\2\2\u0117\u0118\7>\2\2\u0118\u011a\5\24\13"+
		"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\23\3\2\2\2\u011b\u0120"+
		"\5`\61\2\u011c\u011d\7\4\2\2\u011d\u011f\5`\61\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\25\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0124\7c\2\2\u0124\u0127\7e\2\2\u0125\u0126"+
		"\7T\2\2\u0126\u0128\5.\30\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\7:\2\2\u012a\u012c\5\30\r\2\u012b\u012a\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u0134\3\2\2\2\u012d\u0131\7O\2\2\u012e"+
		"\u0130\5\"\22\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u012d\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\17"+
		"\2\2\u0137\27\3\2\2\2\u0138\u013d\5,\27\2\u0139\u013a\7,\2\2\u013a\u013c"+
		"\5,\27\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\7,"+
		"\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0145\7,\2\2\u0144\u0138\3\2\2\2\u0144\u0143\3\2\2\2\u0145\31\3\2\2\2"+
		"\u0146\u0149\5\34\17\2\u0147\u0149\5\u0084C\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\33\3\2\2\2\u014a\u014b\7\3\2\2\u014b\u014d\7e\2\2"+
		"\u014c\u014e\5\20\t\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0152\5.\30\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5 \21\2\u0154\35\3\2\2"+
		"\2\u0155\u0159\7:\2\2\u0156\u0158\5\"\22\2\u0157\u0156\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7\17\2\2\u015d\37\3\2\2\2\u015e\u0169\7:\2"+
		"\2\u015f\u0161\5V,\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0168\5\64\33\2\u0166\u0168\7O\2\2\u0167\u0162\3\2\2\2\u0167\u0166\3"+
		"\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\17\2\2\u016d!\3\2\2\2"+
		"\u016e\u017b\7O\2\2\u016f\u0171\5V,\2\u0170\u016f\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u017b\5$\23\2\u0176\u0178\7D\2\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\5(\25\2\u017a"+
		"\u016e\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0177\3\2\2\2\u017b#\3\2\2\2"+
		"\u017c\u0182\5\66\34\2\u017d\u0182\5&\24\2\u017e\u0182\58\35\2\u017f\u0182"+
		"\5\32\16\2\u0180\u0182\5\f\7\2\u0181\u017c\3\2\2\2\u0181\u017d\3\2\2\2"+
		"\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182%\3"+
		"\2\2\2\u0183\u0184\5^\60\2\u0184\u0185\5H%\2\u0185\u0186\7O\2\2\u0186"+
		"\'\3\2\2\2\u0187\u018b\7:\2\2\u0188\u018a\5*\26\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\17\2\2\u018f)\3\2\2\2\u0190"+
		"\u0191\5\u008cG\2\u0191\u0192\7O\2\2\u0192\u0196\3\2\2\2\u0193\u0196\5"+
		"\n\6\2\u0194\u0196\5\u008eH\2\u0195\u0190\3\2\2\2\u0195\u0193\3\2\2\2"+
		"\u0195\u0194\3\2\2\2\u0196+\3\2\2\2\u0197\u0199\5x=\2\u0198\u0197\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7e\2\2\u019e\u01a0\5\u00c2"+
		"b\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u01a3\5\36\20\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3-\3\2\2"+
		"\2\u01a4\u01a9\5`\61\2\u01a5\u01a6\7,\2\2\u01a6\u01a8\5`\61\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"/\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\7\2\2\u01ad\u01b2\5\62\32"+
		"\2\u01ae\u01af\7,\2\2\u01af\u01b1\5\62\32\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7S\2\2\u01b6\61\3\2\2\2\u01b7\u01be"+
		"\5`\61\2\u01b8\u01bb\7\65\2\2\u01b9\u01ba\t\2\2\2\u01ba\u01bc\5`\61\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b7"+
		"\3\2\2\2\u01bd\u01b8\3\2\2\2\u01be\63\3\2\2\2\u01bf\u01c7\5<\37\2\u01c0"+
		"\u01c7\5B\"\2\u01c1\u01c2\7\67\2\2\u01c2\u01c3\7e\2\2\u01c3\u01c7\5D#"+
		"\2\u01c4\u01c7\5\32\16\2\u01c5\u01c7\5\f\7\2\u01c6\u01bf\3\2\2\2\u01c6"+
		"\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2"+
		"\2\2\u01c7\65\3\2\2\2\u01c8\u01ca\5\20\t\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01ce\5^\60\2\u01cc\u01ce\7\67\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\7e\2\2\u01d0\u01d5\5f\64\2\u01d1\u01d2\7\6\2\2\u01d2\u01d4\7\'\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\35\2\2\u01d9"+
		"\u01db\5d\63\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01df\5l\67\2\u01dd\u01df\7O\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df\67\3\2\2\2\u01e0\u01e2\5\20\t\2\u01e1\u01e0\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7e\2\2\u01e4\u01e7"+
		"\5f\64\2\u01e5\u01e6\7\35\2\2\u01e6\u01e8\5d\63\2\u01e7\u01e5\3\2\2\2"+
		"\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\7:\2\2\u01ea\u01ec"+
		"\5n8\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed"+
		"\u01ef\5*\26\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f4\7\17\2\2\u01f49\3\2\2\2\u01f5\u01f8\7@\2\2\u01f6\u01f8\5x=\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8;\3\2\2\2\u01f9\u01fa\5^\60\2"+
		"\u01fa\u01fb\7e\2\2\u01fb\u01fc\5> \2\u01fc=\3\2\2\2\u01fd\u01fe\5L\'"+
		"\2\u01fe\u01ff\7O\2\2\u01ff\u0202\3\2\2\2\u0200\u0202\5@!\2\u0201\u01fd"+
		"\3\2\2\2\u0201\u0200\3\2\2\2\u0202?\3\2\2\2\u0203\u0208\5f\64\2\u0204"+
		"\u0205\7\6\2\2\u0205\u0207\7\'\2\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020d\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020c\7\35\2\2\u020c\u020e\5d\63\2\u020d\u020b\3"+
		"\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7O\2\2\u0210"+
		"A\3\2\2\2\u0211\u0214\5\20\t\2\u0212\u0215\5^\60\2\u0213\u0215\7\67\2"+
		"\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217"+
		"\7e\2\2\u0217\u0218\5@!\2\u0218C\3\2\2\2\u0219\u021c\5f\64\2\u021a\u021b"+
		"\7\35\2\2\u021b\u021d\5d\63\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021e\3\2\2\2\u021e\u021f\7O\2\2\u021fE\3\2\2\2\u0220\u0221\7e"+
		"\2\2\u0221\u0222\5N(\2\u0222G\3\2\2\2\u0223\u0228\5J&\2\u0224\u0225\7"+
		",\2\2\u0225\u0227\5J&\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229I\3\2\2\2\u022a\u0228\3\2\2\2"+
		"\u022b\u022e\5P)\2\u022c\u022d\7\33\2\2\u022d\u022f\5R*\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022fK\3\2\2\2\u0230\u0235\5N(\2\u0231\u0232"+
		"\7,\2\2\u0232\u0234\5F$\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236M\3\2\2\2\u0237\u0235\3\2\2\2"+
		"\u0238\u0239\7\6\2\2\u0239\u023b\7\'\2\2\u023a\u0238\3\2\2\2\u023b\u023e"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023f\u0240\7\33\2\2\u0240\u0241\5R*\2\u0241O\3\2\2\2\u0242"+
		"\u0247\7e\2\2\u0243\u0244\7\6\2\2\u0244\u0246\7\'\2\2\u0245\u0243\3\2"+
		"\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"Q\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024d\5T+\2\u024b\u024d\5\u00b0Y\2"+
		"\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024dS\3\2\2\2\u024e\u025a\7"+
		":\2\2\u024f\u0254\5R*\2\u0250\u0251\7,\2\2\u0251\u0253\5R*\2\u0252\u0250"+
		"\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0259\7,\2\2\u0258\u0257\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u024f\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7\17\2\2\u025dU\3\2\2\2"+
		"\u025e\u026b\5x=\2\u025f\u026b\7)\2\2\u0260\u026b\7K\2\2\u0261\u026b\7"+
		"\64\2\2\u0262\u026b\7D\2\2\u0263\u026b\7\r\2\2\u0264\u026b\7@\2\2\u0265"+
		"\u026b\7<\2\2\u0266\u026b\7+\2\2\u0267\u026b\7#\2\2\u0268\u026b\7N\2\2"+
		"\u0269\u026b\7\22\2\2\u026a\u025e\3\2\2\2\u026a\u025f\3\2\2\2\u026a\u0260"+
		"\3\2\2\2\u026a\u0261\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a"+
		"\u0264\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2"+
		"\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026bW\3\2\2\2\u026c\u026d"+
		"\5p9\2\u026dY\3\2\2\2\u026e\u026f\7e\2\2\u026f[\3\2\2\2\u0270\u0271\5"+
		"p9\2\u0271]\3\2\2\2\u0272\u0277\5`\61\2\u0273\u0274\7\6\2\2\u0274\u0276"+
		"\7\'\2\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0283\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027f\5b"+
		"\62\2\u027b\u027c\7\6\2\2\u027c\u027e\7\'\2\2\u027d\u027b\3\2\2\2\u027e"+
		"\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0283\3\2"+
		"\2\2\u0281\u027f\3\2\2\2\u0282\u0272\3\2\2\2\u0282\u027a\3\2\2\2\u0283"+
		"_\3\2\2\2\u0284\u0286\7e\2\2\u0285\u0287\5\60\31\2\u0286\u0285\3\2\2\2"+
		"\u0286\u0287\3\2\2\2\u0287\u028f\3\2\2\2\u0288\u0289\7I\2\2\u0289\u028b"+
		"\7e\2\2\u028a\u028c\5\60\31\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2"+
		"\u028c\u028e\3\2\2\2\u028d\u0288\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290a\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u0293\t\3\2\2\u0293c\3\2\2\2\u0294\u0299\5p9\2\u0295\u0296\7,\2\2\u0296"+
		"\u0298\5p9\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029ae\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e"+
		"\7/\2\2\u029d\u029f\5h\65\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\7\30\2\2\u02a1g\3\2\2\2\u02a2\u02a4\5:\36\2"+
		"\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\5^\60\2\u02a9"+
		"\u02aa\5j\66\2\u02aai\3\2\2\2\u02ab\u02ac\79\2\2\u02ac\u02b3\5P)\2\u02ad"+
		"\u02b0\5P)\2\u02ae\u02af\7,\2\2\u02af\u02b1\5h\65\2\u02b0\u02ae\3\2\2"+
		"\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ab\3\2\2\2\u02b2\u02ad"+
		"\3\2\2\2\u02b3k\3\2\2\2\u02b4\u02b5\5(\25\2\u02b5m\3\2\2\2\u02b6\u02b8"+
		"\5\u00c0a\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2"+
		"\2\u02b9\u02ba\t\4\2\2\u02ba\u02bb\5\u00c2b\2\u02bb\u02bc\7O\2\2\u02bc"+
		"\u02c7\3\2\2\2\u02bd\u02be\5\u00b2Z\2\u02be\u02c0\7I\2\2\u02bf\u02c1\5"+
		"\u00c0a\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2"+
		"\u02c2\u02c3\7\24\2\2\u02c3\u02c4\5\u00c2b\2\u02c4\u02c5\7O\2\2\u02c5"+
		"\u02c7\3\2\2\2\u02c6\u02b7\3\2\2\2\u02c6\u02bd\3\2\2\2\u02c7o\3\2\2\2"+
		"\u02c8\u02cd\7e\2\2\u02c9\u02ca\7I\2\2\u02ca\u02cc\7e\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"q\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d7\5t;\2\u02d1\u02d7\7`\2\2\u02d2"+
		"\u02d7\7a\2\2\u02d3\u02d7\7b\2\2\u02d4\u02d7\5v<\2\u02d5\u02d7\7\34\2"+
		"\2\u02d6\u02d0\3\2\2\2\u02d6\u02d1\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d6\u02d3"+
		"\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7s\3\2\2\2\u02d8"+
		"\u02d9\t\5\2\2\u02d9u\3\2\2\2\u02da\u02db\t\6\2\2\u02dbw\3\2\2\2\u02dc"+
		"\u02dd\7\32\2\2\u02dd\u02e4\5z>\2\u02de\u02e1\7/\2\2\u02df\u02e2\5|?\2"+
		"\u02e0\u02e2\5\u0080A\2\u02e1\u02df\3\2\2\2\u02e1\u02e0\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\7\30\2\2\u02e4\u02de\3"+
		"\2\2\2\u02e4\u02e5\3\2\2\2\u02e5y\3\2\2\2\u02e6\u02eb\7e\2\2\u02e7\u02e8"+
		"\7I\2\2\u02e8\u02ea\7e\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec{\3\2\2\2\u02ed\u02eb\3\2\2\2"+
		"\u02ee\u02f3\5~@\2\u02ef\u02f0\7,\2\2\u02f0\u02f2\5~@\2\u02f1\u02ef\3"+
		"\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"}\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\7e\2\2\u02f7\u02f8\7\33\2\2"+
		"\u02f8\u02f9\5\u0080A\2\u02f9\177\3\2\2\2\u02fa\u02fe\5\u00b0Y\2\u02fb"+
		"\u02fe\5x=\2\u02fc\u02fe\5\u0082B\2\u02fd\u02fa\3\2\2\2\u02fd\u02fb\3"+
		"\2\2\2\u02fd\u02fc\3\2\2\2\u02fe\u0081\3\2\2\2\u02ff\u0308\7:\2\2\u0300"+
		"\u0305\5\u0080A\2\u0301\u0302\7,\2\2\u0302\u0304\5\u0080A\2\u0303\u0301"+
		"\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0300\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\u030b\3\2\2\2\u030a\u030c\7,\2\2\u030b\u030a\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\17\2\2\u030e\u0083\3"+
		"\2\2\2\u030f\u0310\7\32\2\2\u0310\u0311\7\3\2\2\u0311\u0312\7e\2\2\u0312"+
		"\u031c\7:\2\2\u0313\u0315\5V,\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2"+
		"\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0319\u031b\5\u0086D\2\u031a\u0316\3\2\2\2\u031b\u031e\3\2\2"+
		"\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031f\u0320\7\17\2\2\u0320\u0085\3\2\2\2\u0321\u0324\5^\60\2"+
		"\u0322\u0325\5\u0088E\2\u0323\u0325\5H%\2\u0324\u0322\3\2\2\2\u0324\u0323"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\7O\2\2\u0327\u0339\3\2\2\2\u0328"+
		"\u032a\5\f\7\2\u0329\u032b\7O\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u0339\3\2\2\2\u032c\u032e\5\34\17\2\u032d\u032f\7O\2\2\u032e"+
		"\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0339\3\2\2\2\u0330\u0332\5\26"+
		"\f\2\u0331\u0333\7O\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0339\3\2\2\2\u0334\u0336\5\u0084C\2\u0335\u0337\7O\2\2\u0336\u0335\3"+
		"\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0321\3\2\2\2\u0338"+
		"\u0328\3\2\2\2\u0338\u032c\3\2\2\2\u0338\u0330\3\2\2\2\u0338\u0334\3\2"+
		"\2\2\u0339\u0087\3\2\2\2\u033a\u033b\7e\2\2\u033b\u033c\7/\2\2\u033c\u033e"+
		"\7\30\2\2\u033d\u033f\5\u008aF\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2"+
		"\2\u033f\u0089\3\2\2\2\u0340\u0341\7*\2\2\u0341\u0342\5\u0080A\2\u0342"+
		"\u008b\3\2\2\2\u0343\u0345\5:\36\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2"+
		"\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0349\u034a\5^\60\2\u034a\u034b\5H%\2\u034b\u008d\3\2\2"+
		"\2\u034c\u038a\5(\25\2\u034d\u034e\7d\2\2\u034e\u0351\5\u00b0Y\2\u034f"+
		"\u0350\7\60\2\2\u0350\u0352\5\u00b0Y\2\u0351\u034f\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7O\2\2\u0354\u038a\3\2\2\2\u0355"+
		"\u038a\5\u0090I\2\u0356\u0357\7L\2\2\u0357\u0358\7/\2\2\u0358\u0359\5"+
		"\u00a0Q\2\u0359\u035a\7\30\2\2\u035a\u035b\5\u008eH\2\u035b\u038a\3\2"+
		"\2\2\u035c\u035d\7-\2\2\u035d\u035e\5\u00a8U\2\u035e\u035f\5\u008eH\2"+
		"\u035f\u038a\3\2\2\2\u0360\u0361\7\25\2\2\u0361\u0362\5\u008eH\2\u0362"+
		"\u0363\7-\2\2\u0363\u0364\5\u00a8U\2\u0364\u0365\7O\2\2\u0365\u038a\3"+
		"\2\2\2\u0366\u038a\5\u0092J\2\u0367\u0368\7V\2\2\u0368\u0369\5\u00a8U"+
		"\2\u0369\u036a\5\u009aN\2\u036a\u038a\3\2\2\2\u036b\u036c\7+\2\2\u036c"+
		"\u036d\5\u00a8U\2\u036d\u036e\5(\25\2\u036e\u038a\3\2\2\2\u036f\u0371"+
		"\7M\2\2\u0370\u0372\5\u00b0Y\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2"+
		"\u0372\u0373\3\2\2\2\u0373\u038a\7O\2\2\u0374\u0375\7\31\2\2\u0375\u0376"+
		"\5\u00b0Y\2\u0376\u0377\7O\2\2\u0377\u038a\3\2\2\2\u0378\u037a\7;\2\2"+
		"\u0379\u037b\7e\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u038a\7O\2\2\u037d\u037f\7\n\2\2\u037e\u0380\7e\2\2\u037f"+
		"\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u038a\7O"+
		"\2\2\u0382\u038a\7O\2\2\u0383\u0384\5\u00acW\2\u0384\u0385\7O\2\2\u0385"+
		"\u038a\3\2\2\2\u0386\u0387\7e\2\2\u0387\u0388\7\60\2\2\u0388\u038a\5\u008e"+
		"H\2\u0389\u034c\3\2\2\2\u0389\u034d\3\2\2\2\u0389\u0355\3\2\2\2\u0389"+
		"\u0356\3\2\2\2\u0389\u035c\3\2\2\2\u0389\u0360\3\2\2\2\u0389\u0366\3\2"+
		"\2\2\u0389\u0367\3\2\2\2\u0389\u036b\3\2\2\2\u0389\u036f\3\2\2\2\u0389"+
		"\u0374\3\2\2\2\u0389\u0378\3\2\2\2\u0389\u037d\3\2\2\2\u0389\u0382\3\2"+
		"\2\2\u0389\u0383\3\2\2\2\u0389\u0386\3\2\2\2\u038a\u008f\3\2\2\2\u038b"+
		"\u038c\7\61\2\2\u038c\u038d\5\u00a8U\2\u038d\u0390\5\u008eH\2\u038e\u038f"+
		"\7A\2\2\u038f\u0391\5\u008eH\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2"+
		"\u0391\u0091\3\2\2\2\u0392\u0393\7\66\2\2\u0393\u0394\7/\2\2\u0394\u0395"+
		"\5\u0096L\2\u0395\u0396\7\30\2\2\u0396\u039a\5(\25\2\u0397\u0399\5\u0094"+
		"K\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039f\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7!"+
		"\2\2\u039e\u03a0\5(\25\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03b1\3\2\2\2\u03a1\u03a2\7\66\2\2\u03a2\u03ae\5(\25\2\u03a3\u03a5\5"+
		"\u0094K\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a4\3\2\2\2"+
		"\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a9\7!\2\2\u03a9\u03ab"+
		"\5(\25\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03af\3\2\2\2\u03ac"+
		"\u03ad\7!\2\2\u03ad\u03af\5(\25\2\u03ae\u03a4\3\2\2\2\u03ae\u03ac\3\2"+
		"\2\2\u03af\u03b1\3\2\2\2\u03b0\u0392\3\2\2\2\u03b0\u03a1\3\2\2\2\u03b1"+
		"\u0093\3\2\2\2\u03b2\u03b3\7B\2\2\u03b3\u03b7\7/\2\2\u03b4\u03b6\5:\36"+
		"\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bf\5^\60\2\u03bb"+
		"\u03bc\7\"\2\2\u03bc\u03be\5^\60\2\u03bd\u03bb\3\2\2\2\u03be\u03c1\3\2"+
		"\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1"+
		"\u03bf\3\2\2\2\u03c2\u03c3\7e\2\2\u03c3\u03c4\7\30\2\2\u03c4\u03c5\5("+
		"\25\2\u03c5\u0095\3\2\2\2\u03c6\u03cb\5\u0098M\2\u03c7\u03c8\7O\2\2\u03c8"+
		"\u03ca\5\u0098M\2\u03c9\u03c7\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03d0\7O\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u0097\3\2"+
		"\2\2\u03d1\u03d3\5:\36\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d4\3\2"+
		"\2\2\u03d7\u03d8\5`\61\2\u03d8\u03d9\5P)\2\u03d9\u03da\7\33\2\2\u03da"+
		"\u03db\5\u00b0Y\2\u03db\u0099\3\2\2\2\u03dc\u03e0\7:\2\2\u03dd\u03df\5"+
		"\u009cO\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2"+
		"\u03e0\u03e1\3\2\2\2\u03e1\u03e6\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e5"+
		"\5\u009eP\2\u03e4\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2"+
		"\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea"+
		"\7\17\2\2\u03ea\u009b\3\2\2\2\u03eb\u03ed\5\u009eP\2\u03ec\u03eb\3\2\2"+
		"\2\u03ed\u03ee\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f3"+
		"\3\2\2\2\u03f0\u03f2\5*\26\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u009d\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f6\u03f7\7\23\2\2\u03f7\u03f8\5\u00aeX\2\u03f8\u03f9\7\60\2\2"+
		"\u03f9\u0401\3\2\2\2\u03fa\u03fb\7\23\2\2\u03fb\u03fc\5Z.\2\u03fc\u03fd"+
		"\7\60\2\2\u03fd\u0401\3\2\2\2\u03fe\u03ff\7*\2\2\u03ff\u0401\7\60\2\2"+
		"\u0400\u03f6\3\2\2\2\u0400\u03fa\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u009f"+
		"\3\2\2\2\u0402\u040f\5\u00a4S\2\u0403\u0405\5\u00a2R\2\u0404\u0403\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\7O\2\2\u0407"+
		"\u0409\5\u00b0Y\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a"+
		"\3\2\2\2\u040a\u040c\7O\2\2\u040b\u040d\5\u00a6T\2\u040c\u040b\3\2\2\2"+
		"\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e\u0402\3\2\2\2\u040e\u0404"+
		"\3\2\2\2\u040f\u00a1\3\2\2\2\u0410\u0413\5\u008cG\2\u0411\u0413\5\u00aa"+
		"V\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413\u00a3\3\2\2\2\u0414"+
		"\u0416\5:\36\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2"+
		"\2\2\u0417\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a"+
		"\u041b\5^\60\2\u041b\u041c\7e\2\2\u041c\u041d\7\60\2\2\u041d\u041e\5\u00b0"+
		"Y\2\u041e\u00a5\3\2\2\2\u041f\u0420\5\u00aaV\2\u0420\u00a7\3\2\2\2\u0421"+
		"\u0422\7/\2\2\u0422\u0423\5\u00b0Y\2\u0423\u0424\7\30\2\2\u0424\u00a9"+
		"\3\2\2\2\u0425\u042a\5\u00b0Y\2\u0426\u0427\7,\2\2\u0427\u0429\5\u00b0"+
		"Y\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u00ab\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u042e\5\u00b0"+
		"Y\2\u042e\u00ad\3\2\2\2\u042f\u0430\5\u00b0Y\2\u0430\u00af\3\2\2\2\u0431"+
		"\u0432\bY\1\2\u0432\u0433\t\7\2\2\u0433\u043f\5\u00b0Y\2\u0434\u0435\t"+
		"\b\2\2\u0435\u043f\5\u00b0Y\2\u0436\u0437\7/\2\2\u0437\u0438\5^\60\2\u0438"+
		"\u0439\7\30\2\2\u0439\u043a\5\u00b0Y\2\u043a\u043f\3\2\2\2\u043b\u043f"+
		"\5\u00b2Z\2\u043c\u043d\7\37\2\2\u043d\u043f\5\u00b4[\2\u043e\u0431\3"+
		"\2\2\2\u043e\u0434\3\2\2\2\u043e\u0436\3\2\2\2\u043e\u043b\3\2\2\2\u043e"+
		"\u043c\3\2\2\2\u043f\u04be\3\2\2\2\u0440\u0441\6Y\2\3\u0441\u0442\t\t"+
		"\2\2\u0442\u04bd\5\u00b0Y\2\u0443\u0444\6Y\3\3\u0444\u0445\t\n\2\2\u0445"+
		"\u04bd\5\u00b0Y\2\u0446\u044e\6Y\4\3\u0447\u0448\7\7\2\2\u0448\u044f\7"+
		"\7\2\2\u0449\u044a\7S\2\2\u044a\u044b\7S\2\2\u044b\u044f\7S\2\2\u044c"+
		"\u044d\7S\2\2\u044d\u044f\7S\2\2\u044e\u0447\3\2\2\2\u044e\u0449\3\2\2"+
		"\2\u044e\u044c\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u04bd\5\u00b0Y\2\u0451"+
		"\u0458\6Y\5\3\u0452\u0453\7\7\2\2\u0453\u0459\7\33\2\2\u0454\u0455\7S"+
		"\2\2\u0455\u0459\7\33\2\2\u0456\u0459\7S\2\2\u0457\u0459\7\7\2\2\u0458"+
		"\u0452\3\2\2\2\u0458\u0454\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2"+
		"\2\2\u0459\u045a\3\2\2\2\u045a\u04bd\5\u00b0Y\2\u045b\u045c\6Y\6\3\u045c"+
		"\u045d\t\13\2\2\u045d\u04bd\5\u00b0Y\2\u045e\u045f\6Y\7\3\u045f\u0460"+
		"\7\4\2\2\u0460\u04bd\5\u00b0Y\2\u0461\u0462\6Y\b\3\u0462\u0463\7H\2\2"+
		"\u0463\u04bd\5\u00b0Y\2\u0464\u0465\6Y\t\3\u0465\u0466\7\"\2\2\u0466\u04bd"+
		"\5\u00b0Y\2\u0467\u0468\6Y\n\3\u0468\u0469\7P\2\2\u0469\u04bd\5\u00b0"+
		"Y\2\u046a\u046b\6Y\13\3\u046b\u046c\7R\2\2\u046c\u04bd\5\u00b0Y\2\u046d"+
		"\u0481\6Y\f\3\u046e\u0482\7?\2\2\u046f\u0482\7=\2\2\u0470\u0482\7(\2\2"+
		"\u0471\u0482\7\27\2\2\u0472\u0482\7W\2\2\u0473\u0482\7\62\2\2\u0474\u0482"+
		"\7\36\2\2\u0475\u0482\7\33\2\2\u0476\u0477\7S\2\2\u0477\u0478\7S\2\2\u0478"+
		"\u0482\7\33\2\2\u0479\u047a\7S\2\2\u047a\u047b\7S\2\2\u047b\u047c\7S\2"+
		"\2\u047c\u0482\7\33\2\2\u047d\u047e\7\7\2\2\u047e\u047f\7\7\2\2\u047f"+
		"\u0482\7\33\2\2\u0480\u0482\7U\2\2\u0481\u046e\3\2\2\2\u0481\u046f\3\2"+
		"\2\2\u0481\u0470\3\2\2\2\u0481\u0471\3\2\2\2\u0481\u0472\3\2\2\2\u0481"+
		"\u0473\3\2\2\2\u0481\u0474\3\2\2\2\u0481\u0475\3\2\2\2\u0481\u0476\3\2"+
		"\2\2\u0481\u0479\3\2\2\2\u0481\u047d\3\2\2\2\u0481\u0480\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u04bd\5\u00b0Y\2\u0484\u0485\6Y\r\3\u0485\u0486\7"+
		"\65\2\2\u0486\u0487\5\u00b0Y\2\u0487\u0488\7\60\2\2\u0488\u0489\5\u00b0"+
		"Y\2\u0489\u04bd\3\2\2\2\u048a\u048b\6Y\16\3\u048b\u048c\7I\2\2\u048c\u04bd"+
		"\7e\2\2\u048d\u048e\6Y\17\3\u048e\u048f\7I\2\2\u048f\u04bd\7Q\2\2\u0490"+
		"\u0491\6Y\20\3\u0491\u0492\7I\2\2\u0492\u0493\7\24\2\2\u0493\u0495\7/"+
		"\2\2\u0494\u0496\5\u00aaV\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0497\3\2\2\2\u0497\u04bd\7\30\2\2\u0498\u0499\6Y\21\3\u0499\u049a\7"+
		"I\2\2\u049a\u049b\7\37\2\2\u049b\u049c\7e\2\2\u049c\u049e\7/\2\2\u049d"+
		"\u049f\5\u00aaV\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0"+
		"\3\2\2\2\u04a0\u04bd\7\30\2\2\u04a1\u04a2\6Y\22\3\u04a2\u04a3\7I\2\2\u04a3"+
		"\u04a4\7\24\2\2\u04a4\u04a5\7I\2\2\u04a5\u04a7\7e\2\2\u04a6\u04a8\5\u00c2"+
		"b\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04bd\3\2\2\2\u04a9"+
		"\u04aa\6Y\23\3\u04aa\u04ab\7I\2\2\u04ab\u04bd\5\u00ba^\2\u04ac\u04ad\6"+
		"Y\24\3\u04ad\u04ae\7\6\2\2\u04ae\u04af\5\u00b0Y\2\u04af\u04b0\7\'\2\2"+
		"\u04b0\u04bd\3\2\2\2\u04b1\u04b2\6Y\25\3\u04b2\u04b4\7/\2\2\u04b3\u04b5"+
		"\5\u00aaV\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3\2\2"+
		"\2\u04b6\u04bd\7\30\2\2\u04b7\u04b8\6Y\26\3\u04b8\u04bd\t\f\2\2\u04b9"+
		"\u04ba\6Y\27\3\u04ba\u04bb\7[\2\2\u04bb\u04bd\5^\60\2\u04bc\u0440\3\2"+
		"\2\2\u04bc\u0443\3\2\2\2\u04bc\u0446\3\2\2\2\u04bc\u0451\3\2\2\2\u04bc"+
		"\u045b\3\2\2\2\u04bc\u045e\3\2\2\2\u04bc\u0461\3\2\2\2\u04bc\u0464\3\2"+
		"\2\2\u04bc\u0467\3\2\2\2\u04bc\u046a\3\2\2\2\u04bc\u046d\3\2\2\2\u04bc"+
		"\u0484\3\2\2\2\u04bc\u048a\3\2\2\2\u04bc\u048d\3\2\2\2\u04bc\u0490\3\2"+
		"\2\2\u04bc\u0498\3\2\2\2\u04bc\u04a1\3\2\2\2\u04bc\u04a9\3\2\2\2\u04bc"+
		"\u04ac\3\2\2\2\u04bc\u04b1\3\2\2\2\u04bc\u04b7\3\2\2\2\u04bc\u04b9\3\2"+
		"\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u00b1\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04c2\7/\2\2\u04c2\u04c3\5\u00b0"+
		"Y\2\u04c3\u04c4\7\30\2\2\u04c4\u04d1\3\2\2\2\u04c5\u04d1\7Q\2\2\u04c6"+
		"\u04d1\7\24\2\2\u04c7\u04d1\5r:\2\u04c8\u04d1\7e\2\2\u04c9\u04ca\5^\60"+
		"\2\u04ca\u04cb\7I\2\2\u04cb\u04cc\7 \2\2\u04cc\u04d1\3\2\2\2\u04cd\u04ce"+
		"\7\67\2\2\u04ce\u04cf\7I\2\2\u04cf\u04d1\7 \2\2\u04d0\u04c1\3\2\2\2\u04d0"+
		"\u04c5\3\2\2\2\u04d0\u04c6\3\2\2\2\u04d0\u04c7\3\2\2\2\u04d0\u04c8\3\2"+
		"\2\2\u04d0\u04c9\3\2\2\2\u04d0\u04cd\3\2\2\2\u04d1\u00b3\3\2\2\2\u04d2"+
		"\u04d3\5\u00c0a\2\u04d3\u04d4\5\u00b6\\\2\u04d4\u04d5\5\u00be`\2\u04d5"+
		"\u04dc\3\2\2\2\u04d6\u04d9\5\u00b6\\\2\u04d7\u04da\5\u00bc_\2\u04d8\u04da"+
		"\5\u00be`\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da\u04dc\3\2\2"+
		"\2\u04db\u04d2\3\2\2\2\u04db\u04d6\3\2\2\2\u04dc\u00b5\3\2\2\2\u04dd\u04f1"+
		"\5b\62\2\u04de\u04e2\7e\2\2\u04df\u04e3\5\60\31\2\u04e0\u04e1\7\7\2\2"+
		"\u04e1\u04e3\7S\2\2\u04e2\u04df\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3"+
		"\3\2\2\2\u04e3\u04ed\3\2\2\2\u04e4\u04e5\7I\2\2\u04e5\u04e9\7e\2\2\u04e6"+
		"\u04ea\5\60\31\2\u04e7\u04e8\7\7\2\2\u04e8\u04ea\7S\2\2\u04e9\u04e6\3"+
		"\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb"+
		"\u04e4\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2"+
		"\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04dd\3\2\2\2\u04f0"+
		"\u04de\3\2\2\2\u04f1\u00b7\3\2\2\2\u04f2\u04f6\5\u00c0a\2\u04f3\u04f4"+
		"\7\7\2\2\u04f4\u04f6\7S\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5"+
		"\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\7e\2\2\u04f8\u04f9\5\u00be"+
		"`\2\u04f9\u00b9\3\2\2\2\u04fa\u04fb\5\u00c0a\2\u04fb\u04fc\7e\2\2\u04fc"+
		"\u04fd\5\u00c2b\2\u04fd\u00bb\3\2\2\2\u04fe\u051b\7\6\2\2\u04ff\u0504"+
		"\7\'\2\2\u0500\u0501\7\6\2\2\u0501\u0503\7\'\2\2\u0502\u0500\3\2\2\2\u0503"+
		"\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2"+
		"\2\2\u0506\u0504\3\2\2\2\u0507\u051c\5T+\2\u0508\u0509\5\u00b0Y\2\u0509"+
		"\u0510\7\'\2\2\u050a\u050b\7\6\2\2\u050b\u050c\5\u00b0Y\2\u050c\u050d"+
		"\7\'\2\2\u050d\u050f\3\2\2\2\u050e\u050a\3\2\2\2\u050f\u0512\3\2\2\2\u0510"+
		"\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0517\3\2\2\2\u0512\u0510\3\2"+
		"\2\2\u0513\u0514\7\6\2\2\u0514\u0516\7\'\2\2\u0515\u0513\3\2\2\2\u0516"+
		"\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051c\3\2"+
		"\2\2\u0519\u0517\3\2\2\2\u051a\u051c\7\'\2\2\u051b\u04ff\3\2\2\2\u051b"+
		"\u0508\3\2\2\2\u051b\u051a\3\2\2\2\u051c\u00bd\3\2\2\2\u051d\u051f\5\u00c2"+
		"b\2\u051e\u0520\5\36\20\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u00bf\3\2\2\2\u0521\u0522\7\7\2\2\u0522\u0523\5.\30\2\u0523\u0524\7S"+
		"\2\2\u0524\u00c1\3\2\2\2\u0525\u0527\7/\2\2\u0526\u0528\5\u00aaV\2\u0527"+
		"\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\30"+
		"\2\2\u052a\u00c3\3\2\2\2\u009e\u00c5\u00ca\u00d0\u00d8\u00e1\u00e6\u00ec"+
		"\u00f1\u00f6\u00fa\u00ff\u0103\u0107\u0111\u0119\u0120\u0127\u012b\u0131"+
		"\u0134\u013d\u0141\u0144\u0148\u014d\u0151\u0159\u0162\u0167\u0169\u0172"+
		"\u0177\u017a\u0181\u018b\u0195\u019a\u019f\u01a2\u01a9\u01b2\u01bb\u01bd"+
		"\u01c6\u01c9\u01cd\u01d5\u01da\u01de\u01e1\u01e7\u01eb\u01f0\u01f7\u0201"+
		"\u0208\u020d\u0214\u021c\u0228\u022e\u0235\u023c\u0247\u024c\u0254\u0258"+
		"\u025a\u026a\u0277\u027f\u0282\u0286\u028b\u028f\u0299\u029e\u02a5\u02b0"+
		"\u02b2\u02b7\u02c0\u02c6\u02cd\u02d6\u02e1\u02e4\u02eb\u02f3\u02fd\u0305"+
		"\u0308\u030b\u0316\u031c\u0324\u032a\u032e\u0332\u0336\u0338\u033e\u0346"+
		"\u0351\u0371\u037a\u037f\u0389\u0390\u039a\u039f\u03a6\u03aa\u03ae\u03b0"+
		"\u03b7\u03bf\u03cb\u03cf\u03d4\u03e0\u03e6\u03ee\u03f3\u0400\u0404\u0408"+
		"\u040c\u040e\u0412\u0417\u042a\u043e\u044e\u0458\u0481\u0495\u049e\u04a7"+
		"\u04b4\u04bc\u04be\u04d0\u04d9\u04db\u04e2\u04e9\u04ed\u04f0\u04f5\u0504"+
		"\u0510\u0517\u051b\u051f\u0527";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}