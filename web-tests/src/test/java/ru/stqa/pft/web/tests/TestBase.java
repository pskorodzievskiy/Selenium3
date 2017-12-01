package ru.stqa.pft.web.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.web.appmanager.ApplicationManager;
import ru.stqa.pft.web.model.ContactData;
import ru.stqa.pft.web.model.Contacts;
import ru.stqa.pft.web.model.GroupData;
import ru.stqa.pft.web.model.Groups;

import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestBase {

    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }
}
//
//    public void verifyGroupListInUI() {
//        if (Boolean.getBoolean("verifyUI")) {
//            Groups dbGroups = app.db().groups();
//            Groups uiGroups = app.group().all();
//            assertThat(uiGroups, equalTo(dbGroups.stream()
//                    .map((g) -> new GroupData().withId(g.getId()).withName(g.getName()))
//                    .collect(Collectors.toSet())));
//        }
//
//    }
//
//    public void verifyContactListInUI() {
//        if (Boolean.getBoolean("verifyUI")) {
//            Contacts dbContacts = app.db().contacts();
//            Contacts uiContacts = app.contact().all();
//            assertThat(uiContacts, equalTo(dbContacts.stream()
//                    .map((g) -> new ContactData().withId(g.getId()).withLastName(g.getLastName())
//                            .withFirstName(g.getFirstName()).withAddress(g.getAddress()))
//                    .collect(Collectors.toSet())));
//        }
//
//    }
//}