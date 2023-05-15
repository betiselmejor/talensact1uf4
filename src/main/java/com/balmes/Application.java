package com.balmes;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;

public class Application implements WebApplicationInitializer {
	public void onStartup(final ServletContext sc) throws ServletException {

		AnnotationConfigWebApplicationContext appContext =
				new AnnotationConfigWebApplicationContext();

		appContext.scan("com.balmes");
		sc.addListener(new ContextLoaderListener(appContext));

		ServletRegistration.Dynamic appServlet =
				sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");
	}
}
