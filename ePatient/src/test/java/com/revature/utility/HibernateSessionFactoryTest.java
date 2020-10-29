package com.revature.utility;

import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;

public class HibernateSessionFactoryTest {

    @Test
    public void testSession(){
        Session s = HibernateSessionFactory.getSession();

        Assertions.assertNotNull(s);
    }
}
