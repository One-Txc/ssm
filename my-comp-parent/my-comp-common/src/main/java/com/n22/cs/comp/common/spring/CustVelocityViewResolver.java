package com.n22.cs.comp.common.spring;

import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

public class CustVelocityViewResolver extends VelocityViewResolver{

	public CustVelocityViewResolver() {
		super();
	}
	/**
	 * Requires {@link CustVelocityView}.
	 */
	@Override
	protected Class<CustVelocityView> requiredViewClass() {
		return CustVelocityView.class;
	}
}
