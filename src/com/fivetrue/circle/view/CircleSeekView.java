package com.fivetrue.circle.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/**
 * @author fivetrue1101@gmail.com
 *
 */
public class CircleSeekView extends AbsCircleSeekView{

	public CircleSeekView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawMore(Canvas canvas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int getMaxValue() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getCurrentValue() {
		// TODO Auto-generated method stub
		return getPositionDegree();
	}

	@Override
	protected void movePosition(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void cancelMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void selectedPosition(int pos) {
		// TODO Auto-generated method stub
		
	}

}
