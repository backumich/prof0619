package com.vertex.academy.xml;

import com.vertex.academy.data.User;
import com.vertex.academy.data.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.Arrays;

public class XmlExperiments {

    public static void main(String[] args) {
        User user = new User();
        User boss = new User(1, "BigBoss", null, "boss");
        user.setBoss(boss);
        user.setName("userName");
        user.setPosition("employee");
        user.setId(2);

        Users users = new Users();
        users.setUsers(Arrays.asList(user, boss));

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(users, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
