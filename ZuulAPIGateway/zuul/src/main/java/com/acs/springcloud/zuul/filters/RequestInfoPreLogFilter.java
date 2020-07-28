package com.acs.springcloud.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class RequestInfoPreLogFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(RequestInfoPreLogFilter.class);

	// functionality of the filter
	@Override
	public Object run() throws ZuulException {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();

		// Logging request information
		logger.info("Pre Filter: " + String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}

	// semantically equal to run()
	@Override
	public boolean shouldFilter() {
		return true;
	}

	// order in which the filter need to be run
	@Override
	public int filterOrder() {
		return 1;
	}

	// type of the filter
	@Override
	public String filterType() {
		return "pre";
	}

}
