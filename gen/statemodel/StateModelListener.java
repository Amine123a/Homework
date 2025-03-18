// Generated from C:/Users/amine/IdeaProjects/Homework/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(StateModelParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(StateModelParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(StateModelParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(StateModelParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(StateModelParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(StateModelParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(StateModelParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(StateModelParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transScheme}.
	 * @param ctx the parse tree
	 */
	void enterTransScheme(StateModelParser.TransSchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transScheme}.
	 * @param ctx the parse tree
	 */
	void exitTransScheme(StateModelParser.TransSchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransDefinition(StateModelParser.TransDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransDefinition(StateModelParser.TransDefinitionContext ctx);
}