package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{
	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
	

	public LoggingFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response=ctx.next(requestSpec, responseSpec);
		logResponse(response);
		return response;
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec)
	{
		logger.info("\nRequest\n---------------------------------------------------------------------------------------------------------------");
		logger.info("URI:"+requestSpec.getURI());
		logger.info("\nHeaders\n");
		logger.info(requestSpec.getHeaders());
		logger.info("Method:"+requestSpec.getMethod());
		logger.info("\nPayload\n");
		logger.info(""+requestSpec.getBody());
	}
	public void logResponse(Response response)
	{
		logger.info("\n\nResponse---------------------------------------------------------------------------------------------------------------");
		logger.info("Status Code:"+response.getStatusCode());
		logger.info("\nHeaders\n");
		logger.info(response.getHeaders());
		logger.info("\nResponse Body\n");
		logger.info(response.getBody().asPrettyString());
		logger.info("\n---------------------------------------------------------------------------------------------------------------");
	}

}
