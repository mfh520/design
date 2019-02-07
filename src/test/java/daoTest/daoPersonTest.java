package daoTest;

import com.alibaba.fastjson.JSON;
import com.restaurant.dao.PersonMapper;
import com.restaurant.dao.impl.PersonMapperImpl;
import com.restaurant.entity.Person;
import com.restaurant.controller.PersonController;
import com.restaurant.utils.BaseExecution;
import org.junit.jupiter.api.Test;

public class daoPersonTest {

//    @Autowired
//    private PersonController personService;

    @Test
    public void testPerson() {

        // Person person = new Person("acc", "pass", "name", "12345678900");
//        PersonMapper personMapper = new PersonMapperImpl();
//        personMapper.addPerson(person);
        PersonController personController = new PersonController();
        personController.register("accaa", "pass", "name", "12345678900");
    }

    @Test
    public void testGet() {
        PersonController personController = new PersonController();
        String name = "acca";
        String pass = "pass";
        BaseExecution baseExecution = personController.login(name, pass);
//        PersonMapper personMapper = new PersonMapperImpl();
//        Person person = personMapper.selectPerson(id);
        System.out.println(JSON.toJSONString(baseExecution));

    }


    @Test
    public void testExists() {
        String account = "acc";
//        String account = "acc1";
        PersonMapper personMapper = new PersonMapperImpl();
        int result = personMapper.isExists(account);
        System.out.println(result);
    }

    @Test
    public void testLogin() {
        String name = "acca";
        String pass = "pass";
        PersonController personController = new PersonController();
        BaseExecution result = personController.login(name, pass);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void testGetPerson() {
        String account = "acca";
        PersonController personController = new PersonController();
        BaseExecution result = personController.getPerson(account);
        System.out.println(JSON.toJSONString(result));
    }
}
