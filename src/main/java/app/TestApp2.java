package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.activation.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import core.util.HibernateUtil;
import web.emp.entity.Dept;
import web.emp.entity.Emp;
import web.member.dao.MemberDao;
import web.member.entity.Member;

public class TestApp2 {

	public static void main(String[] args) {
		
		GenericApplicationContext applicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("applicationContext.xml");
        applicationContext.refresh();
            
        MemberDao memberDao = applicationContext.getBean(MemberDao.class);
        System.out.println(memberDao.selectById(1).getNickname());
        
        ((ConfigurableApplicationContext) applicationContext).close();
	}
	}