package com.s8.pkgs.ui.carbide.objform;

import com.s8.api.objects.web.S8WebFront;
import com.s8.api.objects.web.functions.primitives.Int32NeFunction;
import com.s8.api.objects.web.lambdas.primitives.Int32Lambda;
import com.s8.pkgs.ui.carbide.Carbide;


/**
 * 
 * @author pierreconvert
 *
 */
public class IntegerObjFormSetter extends PrimitiveObjFormSetter {
	
	
	/**
	 * 
	 * @param branch
	 * @param name
	 * @param initialValue
	 * @param lambda
	 * @return
	 */
	public static IntegerObjFormSetter create(S8WebFront branch, String name, int initialValue, Int32Lambda lambda) {
		IntegerObjFormSetter fieldView = new IntegerObjFormSetter(branch);
		fieldView.setName(name);
		fieldView.setValue(initialValue);
		fieldView.onValueChangedLambda(lambda);
		return fieldView;
	}
	
	
	/**
	 * 
	 * @param branch
	 * @param name
	 * @param initialValue
	 * @param lambda
	 * @param doc
	 * @return
	 */
	public static IntegerObjFormSetter create(S8WebFront branch, String name, int initialValue, Int32Lambda lambda, String doc) {
		IntegerObjFormSetter fieldView = new IntegerObjFormSetter(branch);
		fieldView.setName(name);
		fieldView.setValue(initialValue);
		fieldView.onValueChangedLambda(lambda);
		fieldView.setTooltipDoc(doc);
		return fieldView;
	}
	
	
	

	public IntegerObjFormSetter(S8WebFront branch) {
		super(branch, Carbide.ROOT_WEBPATH + "/objform/IntegerObjFormSetter");
	}
	
	
	public void setValue(int value) {
		vertex.fields().setInt32Field("value", value);
	}
	

	
	public void onValueChanged(Int32NeFunction func) {
		vertex.methods().setInt32Method("on-value-changed", func);
	}
	
	public void onValueChangedLambda(Int32Lambda lambda) {
		vertex.methods().setInt32MethodLambda("on-value-changed", lambda);
	}
}
