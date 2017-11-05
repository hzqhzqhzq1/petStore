package com.newer.petstore.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.newer.petstore.AppInfo;
import com.newer.petstore.domain.Category;
import com.newer.petstore.mapper.CategoryMapper;

/**
 * 监听器(特定时间发生时触发，和应用程序的上下文) Application Lifecycle Listener implementation class
 * AppListener
 *
 */
//@WebListener
public class AppListener implements ServletContextListener {

	private SqlSessionFactory factory;

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	/**
	 * 应用程序的初始化
	 * 
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent e) {

		// JAVA WEB 获得上下文
		ServletContext application = e.getServletContext();

		factory = initSqlSessionFactory(application);
		application.setAttribute(AppInfo.APP_SESSION_FACTORY, factory);
		
		initSqlSessionFactory(application);

		loadCategoryList(application);
	}

	/**
	 * 创建会话工厂
	 * 
	 * @param application
	 */
	private SqlSessionFactory initSqlSessionFactory(ServletContext application) {
		InputStream in;
		try {
			// 加载数据源(myBatis中的会话工厂就是一个数据源)
			in = Resources.getResourceAsStream("config.xml");
			return new SqlSessionFactoryBuilder().build(in);

			// 会话工厂存储在全局作用域
//			application.setAttribute(AppInfo.APP_SESSION_FACTORY, factory);
		} catch (IOException e1) {
			return null;
		}
	}

	/**
	 * 加载产品分类列表
	 * 
	 * @param application
	 * @param factory
	 */
	private void loadCategoryList(ServletContext application) {
//		获得会话
		SqlSession sqlSession = factory.openSession();

		// 会话执行数据操作
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);

		// 从数据库查询获得全局的数据信息
		List<Category> c = categoryMapper.findAll();

		// 存储在全局作用域
		application.setAttribute(AppInfo.APP_CATEGORY_LIST, c);
		System.out.println("应用上下文初始化完毕：" + c);

		sqlSession.commit();
		sqlSession.close();
	}

}
