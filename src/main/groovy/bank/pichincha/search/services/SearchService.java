package bank.pichincha.search.services;

import bank.pichincha.search.dto.TestUser;
import bank.pichincha.search.repository.ITestUserDao;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private ITestUserDao iTestUserDao;

    public void create(String name) {
        try {
            TestUser testUser = new TestUser();
            testUser.setUseName(name);
            testUser.setUseEdad("30");
            iTestUserDao.save(testUser);
        } catch (Exception e) {
            System.out.println("Mistake");
            System.out.println(e.getMessage());
        }

    }


    public String get(Integer id) {
        TestUser testUser = null;
        try {
            testUser = iTestUserDao.findUsers(id);
        } catch (Exception e) {
            System.out.println("Mistake");
            System.out.println(e.getMessage());
        }
        return testUser.getUseName();
    }


    public void update(Integer id, String name) {
        try {
            TestUser testUser = iTestUserDao.findUsers(id);
            testUser.setUseName(name);
            iTestUserDao.save(testUser);
        } catch (Exception e) {
            System.out.println("Mistake");
            System.out.println(e.getMessage());
        }

    }

    public void delete(Integer id) {
        try {
            TestUser testUser = iTestUserDao.findUsers(id);
            iTestUserDao.delete(testUser);
        } catch (Exception e) {
            System.out.println("Mistake");
            System.out.println(e.getMessage());
        }

    }

}
