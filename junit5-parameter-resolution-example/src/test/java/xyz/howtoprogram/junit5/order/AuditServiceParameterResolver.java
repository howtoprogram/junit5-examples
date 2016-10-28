
package xyz.howtoprogram.junit5.order;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;

public class AuditServiceParameterResolver implements ParameterResolver {

	@Override
	public boolean supports(ParameterContext parameterContext, ExtensionContext extensionContext) {
		return (parameterContext.getParameter().getType() == AuditService.class);
	}

	@Override
	public AuditService resolve(ParameterContext parameterContext,
	        ExtensionContext extensionContext) {
		return new AuditService();
	}

}